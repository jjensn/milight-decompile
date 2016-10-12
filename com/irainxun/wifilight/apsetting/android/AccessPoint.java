package com.irainxun.wifilight.apsetting.android;

import android.content.Context;
import android.content.res.Resources;
import android.net.NetworkInfo.DetailedState;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public class AccessPoint
  implements Comparable<AccessPoint>
{
  public static final int SECURITY_EAP = 3;
  public static final int SECURITY_NONE = 0;
  public static final int SECURITY_PSK = 2;
  public static final int SECURITY_WEP = 1;
  public static final int[] STATE_NONE = new int[0];
  public static final int[] STATE_SECURED = { R.attr.state_encrypted };
  private String mBSSID;
  private String mCapabilites;
  private WifiConfiguration mConfig;
  private Context mContext;
  private WifiInfo mInfo;
  private int mRssi;
  private ScanResult mScanResult;
  private NetworkInfo.DetailedState mState;
  private String mSummary;
  private final int networkId;
  private final int security;
  private final String ssid;

  public AccessPoint(Context paramContext, ScanResult paramScanResult)
  {
    this.mContext = paramContext;
    this.ssid = paramScanResult.SSID;
    this.security = getSecurity(paramScanResult);
    this.networkId = -1;
    this.mRssi = paramScanResult.level;
    this.mScanResult = paramScanResult;
    this.mCapabilites = paramScanResult.capabilities;
    this.mBSSID = paramScanResult.BSSID;
  }

  public AccessPoint(Context paramContext, WifiConfiguration paramWifiConfiguration)
  {
    this.mContext = paramContext;
    if (paramWifiConfiguration.SSID == null);
    for (String str = ""; ; str = removeDoubleQuotes(paramWifiConfiguration.SSID))
    {
      this.ssid = str;
      this.security = getSecurity(paramWifiConfiguration);
      this.networkId = paramWifiConfiguration.networkId;
      this.mConfig = paramWifiConfiguration;
      this.mRssi = 2147483647;
      return;
    }
  }

  public static final boolean accessPointsEquals(List<AccessPoint> paramList1, List<AccessPoint> paramList2)
  {
    bool1 = false;
    if (paramList1 != null)
    {
      bool1 = false;
      if (paramList2 != null)
        try
        {
          int i = paramList1.size();
          int j = paramList2.size();
          bool1 = false;
          Iterator localIterator1;
          if (i == j)
          {
            localIterator1 = paramList1.iterator();
            break label102;
            boolean bool2 = localIterator1.hasNext();
            if (!bool2)
              bool1 = true;
          }
          else
          {
            return bool1;
          }
          AccessPoint localAccessPoint = (AccessPoint)localIterator1.next();
          int k = 0;
          Iterator localIterator2 = paramList2.iterator();
          while (true)
          {
            if (!localIterator2.hasNext())
            {
              if (k != paramList2.size())
                break label48;
              bool1 = false;
              break label64;
            }
            boolean bool3 = localAccessPoint.scanedConnectInfoEquals((AccessPoint)localIterator2.next());
            if (bool3)
              break;
            k++;
          }
        }
        finally
        {
        }
    }
  }

  public static String convertToQuotedString(String paramString)
  {
    return "\"" + paramString + "\"";
  }

  private static int getSecurity(ScanResult paramScanResult)
  {
    if (paramScanResult.capabilities.contains("WEP"))
      return 1;
    if (paramScanResult.capabilities.contains("PSK"))
      return 2;
    if (paramScanResult.capabilities.contains("EAP"))
      return 3;
    return 0;
  }

  static int getSecurity(WifiConfiguration paramWifiConfiguration)
  {
    int i = 1;
    if (paramWifiConfiguration.allowedKeyManagement.get(i))
      i = 2;
    do
    {
      return i;
      if ((paramWifiConfiguration.allowedKeyManagement.get(2)) || (paramWifiConfiguration.allowedKeyManagement.get(3)))
        return 3;
    }
    while (paramWifiConfiguration.wepKeys[0] != null);
    return 0;
  }

  public static String getSecurity(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 0:
      return "open,none";
    case 1:
      return "open,wep";
    case 2:
      return "OPEN/WEP";
    case 3:
    }
    return "OPEN/WEP";
  }

  private void refreshSummary()
  {
    if (this.mState != null)
    {
      setSummary(Summary.get(this.mContext, this.mState));
      return;
    }
    String str1;
    if (this.mRssi == 2147483647)
      str1 = this.mContext.getString(R.string.wifi_not_in_range);
    while (this.security == 0)
    {
      setSummary(str1);
      return;
      WifiConfiguration localWifiConfiguration = this.mConfig;
      str1 = null;
      if (localWifiConfiguration != null)
      {
        Context localContext1 = this.mContext;
        if (this.mConfig.status == 1);
        for (int i = R.string.wifi_disabled; ; i = R.string.wifi_remembered)
        {
          str1 = localContext1.getString(i);
          break;
        }
      }
    }
    Context localContext2 = this.mContext;
    if (str1 == null);
    for (int j = R.string.wifi_secured; ; j = R.string.wifi_secured_with_status)
    {
      String str2 = localContext2.getString(j);
      String[] arrayOfString = this.mContext.getResources().getStringArray(R.array.wifi_security);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = arrayOfString[this.security];
      arrayOfObject[1] = str1;
      setSummary(String.format(str2, arrayOfObject));
      return;
    }
  }

  public static String removeDoubleQuotes(String paramString)
  {
    if (paramString == null)
      paramString = null;
    int i;
    do
    {
      return paramString;
      i = paramString.length();
    }
    while ((i <= 1) || (paramString.charAt(0) != '"') || (paramString.charAt(i - 1) != '"'));
    return paramString.substring(1, i - 1);
  }

  private void setSummary(String paramString)
  {
    this.mSummary = paramString;
  }

  public int compareTo(AccessPoint paramAccessPoint)
  {
    if (this.mInfo != paramAccessPoint.mInfo)
      if (this.mInfo == null);
    do
    {
      do
      {
        return -1;
        return 1;
        if ((this.mRssi ^ paramAccessPoint.mRssi) >= 0)
          break;
      }
      while (this.mRssi != 2147483647);
      return 1;
      if ((this.networkId ^ paramAccessPoint.networkId) >= 0)
        break;
    }
    while (this.networkId != -1);
    return 1;
    int i = WifiManager.compareSignalLevel(paramAccessPoint.mRssi, this.mRssi);
    if (i != 0)
      return i;
    return this.ssid.compareToIgnoreCase(paramAccessPoint.ssid);
  }

  public String getBSSID()
  {
    return this.mBSSID;
  }

  public String getCapabilite()
  {
    return this.mCapabilites;
  }

  public WifiConfiguration getConfig()
  {
    return this.mConfig;
  }

  WifiInfo getInfo()
  {
    return this.mInfo;
  }

  int getLevel()
  {
    if (this.mRssi == 2147483647)
      return -1;
    return WifiManager.calculateSignalLevel(this.mRssi, 4);
  }

  public int getNetworkId()
  {
    return this.networkId;
  }

  public int getRssi()
  {
    return this.mRssi;
  }

  public ScanResult getScanResult()
  {
    return this.mScanResult;
  }

  public int getSecurity()
  {
    return this.security;
  }

  public String getSsid()
  {
    return this.ssid;
  }

  NetworkInfo.DetailedState getState()
  {
    return this.mState;
  }

  public String getSummary()
  {
    refreshSummary();
    return this.mSummary;
  }

  public int indexInList(List<AccessPoint> paramList)
  {
    if (paramList != null);
    for (int i = 0; ; i++)
    {
      if (i >= paramList.size())
        i = -1;
      while (scanedConnectInfoEquals((AccessPoint)paramList.get(i)))
        return i;
    }
  }

  public boolean scanedConnectInfoEquals(AccessPoint paramAccessPoint)
  {
    boolean bool1 = false;
    if (paramAccessPoint != null)
      try
      {
        ScanResult localScanResult1 = paramAccessPoint.getScanResult();
        bool1 = false;
        if (localScanResult1 != null)
        {
          ScanResult localScanResult2 = this.mScanResult;
          bool1 = false;
          if (localScanResult2 != null)
          {
            boolean bool2 = paramAccessPoint.ssid.trim().equals(this.ssid.trim());
            bool1 = false;
            if (bool2)
            {
              boolean bool3 = paramAccessPoint.mBSSID.trim().equals(this.mBSSID.trim());
              bool1 = false;
              if (bool3)
              {
                boolean bool4 = paramAccessPoint.mCapabilites.trim().equals(this.mCapabilites.trim());
                bool1 = false;
                if (bool4)
                  bool1 = true;
              }
            }
          }
        }
        return bool1;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    return false;
  }

  public String toString()
  {
    return "AccessPoint [ssid=" + this.ssid + ", security=" + this.security + ", networkId=" + this.networkId + ", mRssi=" + this.mRssi + ", mSummary=" + this.mSummary + "]";
  }

  public void update(WifiInfo paramWifiInfo, NetworkInfo.DetailedState paramDetailedState)
  {
    if ((paramWifiInfo != null) && (this.networkId != -1) && (this.networkId == paramWifiInfo.getNetworkId()))
    {
      this.mRssi = paramWifiInfo.getRssi();
      this.mInfo = paramWifiInfo;
      this.mState = paramDetailedState;
      refreshSummary();
    }
    while (this.mInfo == null)
      return;
    this.mInfo = null;
    this.mState = null;
    refreshSummary();
  }

  public boolean update(ScanResult paramScanResult)
  {
    if ((this.ssid.equals(paramScanResult.SSID)) && (this.security == getSecurity(paramScanResult)))
    {
      if (WifiManager.compareSignalLevel(paramScanResult.level, this.mRssi) > 0)
        this.mRssi = paramScanResult.level;
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.AccessPoint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */