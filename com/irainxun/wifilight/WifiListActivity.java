package com.irainxun.wifilight;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class WifiListActivity extends Activity
{
  private static final String TAG = WifiListActivity.class.getSimpleName();
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == WifiListActivity.this.ivBack)
        WifiListActivity.this.finish();
    }
  };
  private Comparator<ScanResult> comparator = new Comparator()
  {
    public int compare(ScanResult paramAnonymousScanResult1, ScanResult paramAnonymousScanResult2)
    {
      if (paramAnonymousScanResult1.level < paramAnonymousScanResult2.level)
        return 1;
      if (paramAnonymousScanResult1.level > paramAnonymousScanResult2.level)
        return -1;
      return 0;
    }
  };
  private LayoutInflater inflater;
  private AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
  {
    public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      ScanResult localScanResult = WifiListActivity.this.wifiAdapter.getItem(paramAnonymousInt);
      Intent localIntent = new Intent();
      localIntent.putExtra("wifi", localScanResult.SSID);
      localIntent.putExtra("wifibssid", localScanResult.BSSID);
      WifiListActivity.this.setResult(-1, localIntent);
      WifiListActivity.this.finish();
    }
  };
  private ImageView ivBack;
  private ListView listView;
  private TextView tvTitle;
  private View vLoading;
  private WiFiAdapter wifiAdapter;
  private WifiManager wifiManager;
  private final BroadcastReceiver wifiReceiver = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      WifiListActivity.this.vLoading.setVisibility(8);
      List localList = WifiListActivity.this.wifiManager.getScanResults();
      int i;
      Iterator localIterator;
      if (localList == null)
      {
        i = 0;
        if (i > 0)
          localIterator = localList.iterator();
      }
      while (true)
      {
        if (!localIterator.hasNext())
        {
          Collections.sort(localList, WifiListActivity.this.comparator);
          WifiListActivity.this.wifiAdapter.setData(localList);
          WifiListActivity.this.wifiAdapter.notifyDataSetChanged();
          return;
          i = localList.size();
          break;
        }
        ScanResult localScanResult = (ScanResult)localIterator.next();
        if (TextUtils.isEmpty(localScanResult.SSID))
        {
          localIterator.remove();
        }
        else if (localScanResult.SSID.length() >= 10)
        {
          Log.d("debug", "SSID = " + localScanResult.SSID.substring(0, 10));
          if ("Milight3.0".equals(localScanResult.SSID.substring(0, 10)))
            localIterator.remove();
        }
      }
    }
  };

  public WifiListActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_wifilist);
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.vLoading = findViewById(R.id.tv_loading);
    this.listView = ((ListView)findViewById(R.id.list));
    this.ivBack.setOnClickListener(this.clickListener);
    this.listView.setOnItemClickListener(this.itemClickListener);
    this.ivBack.setImageResource(R.drawable.back);
    this.tvTitle.setText(R.string.choose);
    this.wifiManager = ((WifiManager)getSystemService("wifi"));
    this.inflater = getLayoutInflater();
    if (!this.wifiManager.isWifiEnabled())
      this.wifiManager.setWifiEnabled(true);
    this.wifiAdapter = new WiFiAdapter(null);
    this.listView.setAdapter(this.wifiAdapter);
    registerReceiver(this.wifiReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
    this.wifiManager.startScan();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    unregisterReceiver(this.wifiReceiver);
  }

  class WiFiAdapter extends BaseAdapter
  {
    private List<ScanResult> list;

    WiFiAdapter()
    {
      Object localObject;
      this.list = localObject;
    }

    private boolean isEncrypted(String paramString)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        String str = paramString.toLowerCase();
        if ((str.contains("wpa")) || (str.contains("wep")))
          return true;
      }
      return false;
    }

    private void setWifiIcon(ViewHolder paramViewHolder, int paramInt, boolean paramBoolean)
    {
      ImageView localImageView = paramViewHolder.ivLock;
      if (paramBoolean);
      for (int i = 0; ; i = 8)
      {
        localImageView.setVisibility(i);
        if (paramInt <= 80)
          break;
        paramViewHolder.ivSignal.setImageResource(R.drawable.wifi_signal1);
        return;
      }
      if (paramInt > 60)
      {
        paramViewHolder.ivSignal.setImageResource(R.drawable.wifi_signal2);
        return;
      }
      paramViewHolder.ivSignal.setImageResource(R.drawable.wifi_signal3);
    }

    public int getCount()
    {
      if (this.list == null)
        return 0;
      return this.list.size();
    }

    public ScanResult getItem(int paramInt)
    {
      return (ScanResult)this.list.get(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return 0L;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      ViewHolder localViewHolder;
      if (paramView == null)
      {
        paramView = WifiListActivity.this.inflater.inflate(R.layout.list_wifi_item, null);
        localViewHolder = new ViewHolder();
        localViewHolder.tvName = ((TextView)paramView.findViewById(R.id.tv_name));
        localViewHolder.ivSignal = ((ImageView)paramView.findViewById(R.id.iv_signal));
        localViewHolder.ivLock = ((ImageView)paramView.findViewById(R.id.iv_lock));
        paramView.setTag(localViewHolder);
      }
      while (true)
      {
        ScanResult localScanResult = getItem(paramInt);
        localViewHolder.tvName.setText(localScanResult.SSID);
        setWifiIcon(localViewHolder, Math.abs(localScanResult.level), isEncrypted(localScanResult.capabilities));
        return paramView;
        localViewHolder = (ViewHolder)paramView.getTag();
      }
    }

    public void setData(List<ScanResult> paramList)
    {
      this.list = paramList;
    }

    class ViewHolder
    {
      ImageView ivLock;
      ImageView ivSignal;
      TextView tvName;

      ViewHolder()
      {
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.WifiListActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */