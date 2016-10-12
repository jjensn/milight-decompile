package com.irainxun.wifilight;

import android.net.wifi.ScanResult;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

class WifiListActivity$WiFiAdapter extends BaseAdapter
{
  private List<ScanResult> list;

  WifiListActivity$WiFiAdapter(List<ScanResult> paramList)
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
      paramView = WifiListActivity.access$5(this.this$0).inflate(R.layout.list_wifi_item, null);
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

/* Location:
 * Qualified Name:     com.irainxun.wifilight.WifiListActivity.WiFiAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */