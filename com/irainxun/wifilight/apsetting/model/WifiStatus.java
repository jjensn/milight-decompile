package com.irainxun.wifilight.apsetting.model;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.irainxun.wifilight.apsetting.utils.Utils;
import java.util.Iterator;
import java.util.List;

public class WifiStatus
{
  private String BSSID;
  private boolean enable;
  private int networkId = -2147483648;
  private String ssid;
  private WifiManager wifiManager;

  public WifiStatus(Context paramContext)
  {
    this.wifiManager = ((WifiManager)paramContext.getSystemService("wifi"));
  }

  public String getBSSID()
  {
    return this.BSSID;
  }

  public int getNetworkId()
  {
    return this.networkId;
  }

  public String getSsid()
  {
    return this.ssid;
  }

  public boolean isEnable()
  {
    return this.enable;
  }

  public void load()
  {
    this.enable = this.wifiManager.isWifiEnabled();
    WifiInfo localWifiInfo = this.wifiManager.getConnectionInfo();
    if (localWifiInfo != null)
    {
      this.BSSID = localWifiInfo.getBSSID();
      if (localWifiInfo.getSSID() != null)
        break label54;
    }
    label54: for (String str = null; ; str = localWifiInfo.getSSID().trim())
    {
      this.ssid = str;
      this.networkId = localWifiInfo.getNetworkId();
      return;
    }
  }

  public void reload()
  {
    if (!this.enable)
      this.wifiManager.setWifiEnabled(false);
    Object localObject2;
    label207: 
    do
    {
      List localList;
      do
      {
        WifiInfo localWifiInfo;
        do
        {
          return;
          if (!this.wifiManager.isWifiEnabled())
            this.wifiManager.setWifiEnabled(true);
          localWifiInfo = this.wifiManager.getConnectionInfo();
        }
        while ((localWifiInfo != null) && (localWifiInfo.getBSSID() != null) && (localWifiInfo.getBSSID().equals(this.BSSID)));
        this.wifiManager.disconnect();
        localList = this.wifiManager.getConfiguredNetworks();
      }
      while (localList == null);
      Object localObject1 = null;
      localObject2 = null;
      Iterator localIterator = localList.iterator();
      while (true)
      {
        boolean bool1 = localIterator.hasNext();
        Object localObject3 = null;
        if (!bool1)
        {
          if (localObject3 == null)
            break;
          this.wifiManager.enableNetwork(localObject3.networkId, true);
          return;
        }
        WifiConfiguration localWifiConfiguration = (WifiConfiguration)localIterator.next();
        if (localWifiConfiguration.networkId == this.networkId);
        boolean bool2;
        for (int i = 1; ; i = 0)
        {
          bool2 = Utils.removeDoubleQuotes(localWifiConfiguration.SSID).equals(this.ssid);
          if ((i == 0) || (!bool2))
            break label207;
          localObject3 = localWifiConfiguration;
          break;
        }
        if (i != 0)
          localObject1 = localWifiConfiguration;
        else if (bool2)
          localObject2 = localWifiConfiguration;
      }
      if (localObject1 != null)
      {
        this.wifiManager.enableNetwork(localObject1.networkId, true);
        return;
      }
    }
    while (localObject2 == null);
    this.wifiManager.enableNetwork(localObject2.networkId, true);
  }

  public void setBSSID(String paramString)
  {
    this.BSSID = paramString;
  }

  public void setEnable(boolean paramBoolean)
  {
    this.enable = paramBoolean;
  }

  public void setNetworkId(int paramInt)
  {
    this.networkId = paramInt;
  }

  public void setSsid(String paramString)
  {
    this.ssid = paramString;
  }

  public String toString()
  {
    return "WifiStatus [enable=" + this.enable + ", ssid=" + this.ssid + ", BSSID=" + this.BSSID + ", networkId=" + this.networkId + ", wifiManager=" + this.wifiManager + "]";
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.WifiStatus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */