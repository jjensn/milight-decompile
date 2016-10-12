package android.net.wifi;

import android.net.LinkProperties;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class WifiConfiguration$1
  implements Parcelable.Creator<WifiConfiguration>
{
  WifiConfiguration$1()
  {
  }

  public WifiConfiguration createFromParcel(Parcel paramParcel)
  {
    WifiConfiguration localWifiConfiguration = new WifiConfiguration();
    localWifiConfiguration.networkId = paramParcel.readInt();
    localWifiConfiguration.status = paramParcel.readInt();
    localWifiConfiguration.disableReason = paramParcel.readInt();
    localWifiConfiguration.SSID = paramParcel.readString();
    localWifiConfiguration.BSSID = paramParcel.readString();
    localWifiConfiguration.preSharedKey = paramParcel.readString();
    for (int i = 0; i < localWifiConfiguration.wepKeys.length; i++)
      localWifiConfiguration.wepKeys[i] = paramParcel.readString();
    localWifiConfiguration.wepTxKeyIndex = paramParcel.readInt();
    localWifiConfiguration.priority = paramParcel.readInt();
    if (paramParcel.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      localWifiConfiguration.hiddenSSID = bool;
      localWifiConfiguration.allowedKeyManagement = WifiConfiguration.access$100(paramParcel);
      localWifiConfiguration.allowedProtocols = WifiConfiguration.access$100(paramParcel);
      localWifiConfiguration.allowedAuthAlgorithms = WifiConfiguration.access$100(paramParcel);
      localWifiConfiguration.allowedPairwiseCiphers = WifiConfiguration.access$100(paramParcel);
      localWifiConfiguration.allowedGroupCiphers = WifiConfiguration.access$100(paramParcel);
      WifiConfiguration.EnterpriseField[] arrayOfEnterpriseField = localWifiConfiguration.enterpriseFields;
      int j = arrayOfEnterpriseField.length;
      for (int k = 0; k < j; k++)
        arrayOfEnterpriseField[k].setValue(paramParcel.readString());
    }
    localWifiConfiguration.ipAssignment = WifiConfiguration.IpAssignment.valueOf(paramParcel.readString());
    localWifiConfiguration.proxySettings = WifiConfiguration.ProxySettings.valueOf(paramParcel.readString());
    localWifiConfiguration.linkProperties = ((LinkProperties)paramParcel.readParcelable(null));
    return localWifiConfiguration;
  }

  public WifiConfiguration[] newArray(int paramInt)
  {
    return new WifiConfiguration[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.net.wifi.WifiConfiguration.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */