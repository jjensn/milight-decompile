package com.irainxun.wifilight;

import android.content.Intent;
import android.net.wifi.ScanResult;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class WifiListActivity$2
  implements AdapterView.OnItemClickListener
{
  WifiListActivity$2(WifiListActivity paramWifiListActivity)
  {
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ScanResult localScanResult = WifiListActivity.access$1(this.this$0).getItem(paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("wifi", localScanResult.SSID);
    localIntent.putExtra("wifibssid", localScanResult.BSSID);
    this.this$0.setResult(-1, localIntent);
    this.this$0.finish();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.WifiListActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */