package com.irainxun.wifilight.apsetting.android;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.apsetting.utils.Utils;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public abstract class WifiAutomaticConnecter extends Handler
{
  private static final String TAG = "SmartLink | WifiAutomaticConnecter";
  private Context context;
  private String ssid;
  private boolean useDefault;
  private WifiManager wifiManager;

  public WifiAutomaticConnecter(Context paramContext)
  {
    this.context = paramContext;
    this.wifiManager = ((WifiManager)paramContext.getSystemService("wifi"));
    this.useDefault = true;
  }

  public WifiAutomaticConnecter(Context paramContext, String paramString)
  {
    this.context = paramContext;
    this.ssid = paramString;
    this.wifiManager = ((WifiManager)paramContext.getSystemService("wifi"));
    this.useDefault = false;
  }

  private void retry()
  {
    sendEmptyMessageDelayed(0, 8000L);
  }

  public abstract void connectOpenNone(AccessPoint paramAccessPoint, int paramInt);

  public abstract void connectSecurity(AccessPoint paramAccessPoint);

  String getSsid()
  {
    return this.ssid;
  }

  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (this.useDefault)
      this.ssid = Utils.getSettingApSSID(this.context);
    if (this.ssid != null)
    {
      String str1 = this.ssid.trim();
      this.ssid = str1;
      if (str1.length() != 0);
    }
    else
    {
      return;
    }
    List localList1 = this.wifiManager.getConfiguredNetworks();
    Iterator localIterator3;
    if (localList1 != null)
      localIterator3 = localList1.iterator();
    while (true)
      if (!localIterator3.hasNext())
      {
        this.wifiManager.saveConfiguration();
        WifiInfo localWifiInfo1 = this.wifiManager.getConnectionInfo();
        String str2 = localWifiInfo1.getSSID();
        if ((localWifiInfo1 != null) && (localWifiInfo1.getNetworkId() != -1) && (str2 != null) && (!AccessPoint.removeDoubleQuotes(str2).equals(this.ssid)))
        {
          Log.d("SmartLink | WifiAutomaticConnecter", "Disconnect AP-" + str2);
          this.wifiManager.disconnect();
        }
        try
        {
          Thread.sleep(2000L);
          localList2 = this.wifiManager.getScanResults();
          if (localList2 == null)
          {
            retry();
            return;
            WifiConfiguration localWifiConfiguration3 = (WifiConfiguration)localIterator3.next();
            if (AccessPoint.removeDoubleQuotes(localWifiConfiguration3.SSID).equals(this.ssid))
              continue;
            localWifiConfiguration3.priority = 0;
            this.wifiManager.disableNetwork(localWifiConfiguration3.networkId);
            this.wifiManager.updateNetwork(localWifiConfiguration3);
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          List localList2;
          while (true)
            localInterruptedException.printStackTrace();
          Iterator localIterator1 = localList2.iterator();
          boolean bool = localIterator1.hasNext();
          localAccessPoint = null;
          if (!bool);
          while (true)
          {
            if (localAccessPoint == null)
              break label725;
            localWifiInfo2 = this.wifiManager.getConnectionInfo();
            str3 = localWifiInfo2.getSSID();
            Log.d("SmartLink | WifiAutomaticConnecter", "The current connection ssid is " + localWifiInfo2);
            if ((str3 != null) || (localWifiInfo2.getSupplicantState().compareTo(SupplicantState.ASSOCIATING) < 0) || (localWifiInfo2.getSupplicantState().compareTo(SupplicantState.COMPLETED) > 0))
              break label457;
            sendEmptyMessageDelayed(0, 2000L);
            return;
            ScanResult localScanResult = (ScanResult)localIterator1.next();
            if ((localScanResult.SSID == null) || (localScanResult.SSID.length() == 0) || (localScanResult.capabilities.contains("[IBSS]")) || (!localScanResult.SSID.equals(this.ssid)))
              break;
            localAccessPoint = new AccessPoint(this.context, localScanResult);
          }
          if (localWifiInfo2 == null)
            break label491;
        }
      }
    AccessPoint localAccessPoint;
    WifiInfo localWifiInfo2;
    String str3;
    label457: label491: Iterator localIterator2;
    if ((localWifiInfo2.getNetworkId() == -1) || (str3 == null) || (!AccessPoint.removeDoubleQuotes(str3).equals(this.ssid)))
    {
      localIterator2 = this.wifiManager.getConfiguredNetworks().iterator();
      if (localIterator2.hasNext())
        break label645;
      this.wifiManager.saveConfiguration();
      this.wifiManager.disconnect();
      if (localAccessPoint.getSecurity() != 0)
        break label691;
      Log.d("SmartLink | WifiAutomaticConnecter", "try to connect open none wifi :" + this.ssid);
      WifiConfiguration localWifiConfiguration2 = new WifiConfiguration();
      localWifiConfiguration2.SSID = AccessPoint.convertToQuotedString(localAccessPoint.getSsid());
      localWifiConfiguration2.allowedKeyManagement.set(0);
      localWifiConfiguration2.priority = 2147483647;
      int i = this.wifiManager.addNetwork(localWifiConfiguration2);
      this.wifiManager.enableNetwork(i, true);
      this.wifiManager.saveConfiguration();
      this.wifiManager.reconnect();
    }
    while (true)
    {
      retry();
      return;
      label645: WifiConfiguration localWifiConfiguration1 = (WifiConfiguration)localIterator2.next();
      if (!AccessPoint.removeDoubleQuotes(localWifiConfiguration1.SSID).equals(this.ssid))
        break;
      this.wifiManager.removeNetwork(localWifiConfiguration1.networkId);
      break;
      label691: Log.d("SmartLink | WifiAutomaticConnecter", "try to connect security wifi :" + this.ssid);
      connectSecurity(localAccessPoint);
      continue;
      label725: onSsidNotFind();
    }
  }

  public void onSsidNotFind()
  {
  }

  public void pause()
  {
    removeMessages(0);
  }

  public void resume()
  {
    if (!hasMessages(0))
      sendEmptyMessage(0);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.WifiAutomaticConnecter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */