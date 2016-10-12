package com.irainxun.wifilight;

import android.net.wifi.ScanResult;
import java.util.Comparator;

class WifiListActivity$3
  implements Comparator<ScanResult>
{
  WifiListActivity$3(WifiListActivity paramWifiListActivity)
  {
  }

  public int compare(ScanResult paramScanResult1, ScanResult paramScanResult2)
  {
    if (paramScanResult1.level < paramScanResult2.level)
      return 1;
    if (paramScanResult1.level > paramScanResult2.level)
      return -1;
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.WifiListActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */