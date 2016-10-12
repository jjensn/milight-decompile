package com.irainxun.wifilight;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class WifiListActivity$4 extends BroadcastReceiver
{
  WifiListActivity$4(WifiListActivity paramWifiListActivity)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    WifiListActivity.access$2(this.this$0).setVisibility(8);
    List localList = WifiListActivity.access$3(this.this$0).getScanResults();
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
        Collections.sort(localList, WifiListActivity.access$4(this.this$0));
        WifiListActivity.access$1(this.this$0).setData(localList);
        WifiListActivity.access$1(this.this$0).notifyDataSetChanged();
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
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.WifiListActivity.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */