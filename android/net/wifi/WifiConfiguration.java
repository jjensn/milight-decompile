package android.net.wifi;

import android.net.LinkProperties;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.BitSet;

public class WifiConfiguration
  implements Parcelable
{
  public static final Parcelable.Creator<WifiConfiguration> CREATOR = new Parcelable.Creator()
  {
    public WifiConfiguration createFromParcel(Parcel paramAnonymousParcel)
    {
      WifiConfiguration localWifiConfiguration = new WifiConfiguration();
      localWifiConfiguration.networkId = paramAnonymousParcel.readInt();
      localWifiConfiguration.status = paramAnonymousParcel.readInt();
      localWifiConfiguration.disableReason = paramAnonymousParcel.readInt();
      localWifiConfiguration.SSID = paramAnonymousParcel.readString();
      localWifiConfiguration.BSSID = paramAnonymousParcel.readString();
      localWifiConfiguration.preSharedKey = paramAnonymousParcel.readString();
      for (int i = 0; i < localWifiConfiguration.wepKeys.length; i++)
        localWifiConfiguration.wepKeys[i] = paramAnonymousParcel.readString();
      localWifiConfiguration.wepTxKeyIndex = paramAnonymousParcel.readInt();
      localWifiConfiguration.priority = paramAnonymousParcel.readInt();
      if (paramAnonymousParcel.readInt() != 0);
      for (boolean bool = true; ; bool = false)
      {
        localWifiConfiguration.hiddenSSID = bool;
        localWifiConfiguration.allowedKeyManagement = WifiConfiguration.readBitSet(paramAnonymousParcel);
        localWifiConfiguration.allowedProtocols = WifiConfiguration.readBitSet(paramAnonymousParcel);
        localWifiConfiguration.allowedAuthAlgorithms = WifiConfiguration.readBitSet(paramAnonymousParcel);
        localWifiConfiguration.allowedPairwiseCiphers = WifiConfiguration.readBitSet(paramAnonymousParcel);
        localWifiConfiguration.allowedGroupCiphers = WifiConfiguration.readBitSet(paramAnonymousParcel);
        WifiConfiguration.EnterpriseField[] arrayOfEnterpriseField = localWifiConfiguration.enterpriseFields;
        int j = arrayOfEnterpriseField.length;
        for (int k = 0; k < j; k++)
          arrayOfEnterpriseField[k].setValue(paramAnonymousParcel.readString());
      }
      localWifiConfiguration.ipAssignment = WifiConfiguration.IpAssignment.valueOf(paramAnonymousParcel.readString());
      localWifiConfiguration.proxySettings = WifiConfiguration.ProxySettings.valueOf(paramAnonymousParcel.readString());
      localWifiConfiguration.linkProperties = ((LinkProperties)paramAnonymousParcel.readParcelable(null));
      return localWifiConfiguration;
    }

    public WifiConfiguration[] newArray(int paramAnonymousInt)
    {
      return new WifiConfiguration[paramAnonymousInt];
    }
  };
  public static final int DISABLED_AUTH_FAILURE = 3;
  public static final int DISABLED_DHCP_FAILURE = 2;
  public static final int DISABLED_DNS_FAILURE = 1;
  public static final int DISABLED_UNKNOWN_REASON = 0;
  public static final String ENGINE_DISABLE = "0";
  public static final String ENGINE_ENABLE = "1";
  public static final int INVALID_NETWORK_ID = -1;
  public static final String KEYSTORE_ENGINE_ID = "keystore";
  public static final String KEYSTORE_URI = "keystore://";
  public static final String OLD_PRIVATE_KEY_NAME = "private_key";
  public static final String bssidVarName = "bssid";
  public static final String hiddenSSIDVarName = "scan_ssid";
  public static final String priorityVarName = "priority";
  public static final String pskVarName = "psk";
  public static final String ssidVarName = "ssid";
  public static final String[] wepKeyVarNames = { "wep_key0", "wep_key1", "wep_key2", "wep_key3" };
  public static final String wepTxKeyIdxVarName = "wep_tx_keyidx";
  public String BSSID;
  public String SSID;
  public BitSet allowedAuthAlgorithms;
  public BitSet allowedGroupCiphers;
  public BitSet allowedKeyManagement;
  public BitSet allowedPairwiseCiphers;
  public BitSet allowedProtocols;
  public EnterpriseField anonymous_identity = new EnterpriseField("anonymous_identity", null);
  public EnterpriseField ca_cert = new EnterpriseField("ca_cert", null);
  public EnterpriseField client_cert = new EnterpriseField("client_cert", null);
  public int disableReason;
  public EnterpriseField eap = new EnterpriseField("eap", null);
  public EnterpriseField engine = new EnterpriseField("engine", null);
  public EnterpriseField engine_id = new EnterpriseField("engine_id", null);
  public EnterpriseField[] enterpriseFields;
  public boolean hiddenSSID;
  public EnterpriseField identity = new EnterpriseField("identity", null);
  public IpAssignment ipAssignment;
  public EnterpriseField key_id = new EnterpriseField("key_id", null);
  public LinkProperties linkProperties;
  public int networkId;
  public EnterpriseField password = new EnterpriseField("password", null);
  public EnterpriseField phase2 = new EnterpriseField("phase2", null);
  public String preSharedKey;
  public int priority;
  public ProxySettings proxySettings;
  public int status;
  public String[] wepKeys;
  public int wepTxKeyIndex;

  public WifiConfiguration()
  {
    EnterpriseField[] arrayOfEnterpriseField1 = new EnterpriseField[10];
    arrayOfEnterpriseField1[0] = this.eap;
    arrayOfEnterpriseField1[1] = this.phase2;
    arrayOfEnterpriseField1[2] = this.identity;
    arrayOfEnterpriseField1[3] = this.anonymous_identity;
    arrayOfEnterpriseField1[4] = this.password;
    arrayOfEnterpriseField1[5] = this.client_cert;
    arrayOfEnterpriseField1[6] = this.engine;
    arrayOfEnterpriseField1[7] = this.engine_id;
    arrayOfEnterpriseField1[8] = this.key_id;
    arrayOfEnterpriseField1[9] = this.ca_cert;
    this.enterpriseFields = arrayOfEnterpriseField1;
    this.networkId = -1;
    this.SSID = null;
    this.BSSID = null;
    this.priority = 0;
    this.hiddenSSID = false;
    this.disableReason = 0;
    this.allowedKeyManagement = new BitSet();
    this.allowedProtocols = new BitSet();
    this.allowedAuthAlgorithms = new BitSet();
    this.allowedPairwiseCiphers = new BitSet();
    this.allowedGroupCiphers = new BitSet();
    this.wepKeys = new String[4];
    for (int i = 0; i < this.wepKeys.length; i++)
      this.wepKeys[i] = null;
    EnterpriseField[] arrayOfEnterpriseField2 = this.enterpriseFields;
    int j = arrayOfEnterpriseField2.length;
    for (int k = 0; k < j; k++)
      arrayOfEnterpriseField2[k].setValue(null);
    this.ipAssignment = IpAssignment.UNASSIGNED;
    this.proxySettings = ProxySettings.UNASSIGNED;
    this.linkProperties = new LinkProperties();
  }

  public WifiConfiguration(WifiConfiguration paramWifiConfiguration)
  {
    EnterpriseField[] arrayOfEnterpriseField = new EnterpriseField[10];
    arrayOfEnterpriseField[0] = this.eap;
    arrayOfEnterpriseField[1] = this.phase2;
    arrayOfEnterpriseField[2] = this.identity;
    arrayOfEnterpriseField[3] = this.anonymous_identity;
    arrayOfEnterpriseField[4] = this.password;
    arrayOfEnterpriseField[5] = this.client_cert;
    arrayOfEnterpriseField[6] = this.engine;
    arrayOfEnterpriseField[7] = this.engine_id;
    arrayOfEnterpriseField[8] = this.key_id;
    arrayOfEnterpriseField[9] = this.ca_cert;
    this.enterpriseFields = arrayOfEnterpriseField;
    if (paramWifiConfiguration != null)
    {
      this.networkId = paramWifiConfiguration.networkId;
      this.status = paramWifiConfiguration.status;
      this.disableReason = paramWifiConfiguration.disableReason;
      this.SSID = paramWifiConfiguration.SSID;
      this.BSSID = paramWifiConfiguration.BSSID;
      this.preSharedKey = paramWifiConfiguration.preSharedKey;
      this.wepKeys = new String[4];
      for (int i = 0; i < this.wepKeys.length; i++)
        this.wepKeys[i] = paramWifiConfiguration.wepKeys[i];
      this.wepTxKeyIndex = paramWifiConfiguration.wepTxKeyIndex;
      this.priority = paramWifiConfiguration.priority;
      this.hiddenSSID = paramWifiConfiguration.hiddenSSID;
      this.allowedKeyManagement = ((BitSet)paramWifiConfiguration.allowedKeyManagement.clone());
      this.allowedProtocols = ((BitSet)paramWifiConfiguration.allowedProtocols.clone());
      this.allowedAuthAlgorithms = ((BitSet)paramWifiConfiguration.allowedAuthAlgorithms.clone());
      this.allowedPairwiseCiphers = ((BitSet)paramWifiConfiguration.allowedPairwiseCiphers.clone());
      this.allowedGroupCiphers = ((BitSet)paramWifiConfiguration.allowedGroupCiphers.clone());
      for (int j = 0; j < paramWifiConfiguration.enterpriseFields.length; j++)
        this.enterpriseFields[j].setValue(paramWifiConfiguration.enterpriseFields[j].value());
      this.ipAssignment = paramWifiConfiguration.ipAssignment;
      this.proxySettings = paramWifiConfiguration.proxySettings;
      this.linkProperties = new LinkProperties(paramWifiConfiguration.linkProperties);
    }
  }

  private static BitSet readBitSet(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    BitSet localBitSet = new BitSet();
    for (int j = 0; j < i; j++)
      localBitSet.set(paramParcel.readInt());
    return localBitSet;
  }

  private static void writeBitSet(Parcel paramParcel, BitSet paramBitSet)
  {
    int i = -1;
    paramParcel.writeInt(paramBitSet.cardinality());
    while (true)
    {
      i = paramBitSet.nextSetBit(i + 1);
      if (i == -1)
        break;
      paramParcel.writeInt(i);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public int getAuthType()
  {
    if (this.allowedKeyManagement.get(1))
      return 1;
    if (this.allowedKeyManagement.get(4))
      return 4;
    if (this.allowedKeyManagement.get(2))
      return 2;
    if (this.allowedKeyManagement.get(3))
      return 3;
    return 0;
  }

  public String getPrintableSsid()
  {
    if (this.SSID == null)
      return "";
    int i = this.SSID.length();
    if ((i > 2) && (this.SSID.charAt(0) == '"') && (this.SSID.charAt(i - 1) == '"'))
      return this.SSID.substring(1, i - 1);
    if ((i > 3) && (this.SSID.charAt(0) == 'P') && (this.SSID.charAt(1) == '"') && (this.SSID.charAt(i - 1) == '"'))
      return WifiSsid.createFromAsciiEncoded(this.SSID.substring(2, i - 1)).toString();
    return this.SSID;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i;
    if (this.status == 0)
    {
      localStringBuilder.append("* ");
      localStringBuilder.append("ID: ").append(this.networkId).append(" SSID: ").append(this.SSID).append(" BSSID: ").append(this.BSSID).append(" PRIO: ").append(this.priority).append((char)'\n');
      localStringBuilder.append(" KeyMgmt:");
      i = 0;
      label93: if (i >= this.allowedKeyManagement.size())
        break label194;
      if (this.allowedKeyManagement.get(i))
      {
        localStringBuilder.append(" ");
        if (i >= KeyMgmt.strings.length)
          break label183;
        localStringBuilder.append(KeyMgmt.strings[i]);
      }
    }
    while (true)
    {
      i++;
      break label93;
      if (this.status != 1)
        break;
      localStringBuilder.append("- DSBLE: ").append(this.disableReason).append(" ");
      break;
      label183: localStringBuilder.append("??");
    }
    label194: localStringBuilder.append(" Protocols:");
    int j = 0;
    if (j < this.allowedProtocols.size())
    {
      if (this.allowedProtocols.get(j))
      {
        localStringBuilder.append(" ");
        if (j >= Protocol.strings.length)
          break label263;
        localStringBuilder.append(Protocol.strings[j]);
      }
      while (true)
      {
        j++;
        break;
        label263: localStringBuilder.append("??");
      }
    }
    localStringBuilder.append((char)'\n');
    localStringBuilder.append(" AuthAlgorithms:");
    int k = 0;
    if (k < this.allowedAuthAlgorithms.size())
    {
      if (this.allowedAuthAlgorithms.get(k))
      {
        localStringBuilder.append(" ");
        if (k >= AuthAlgorithm.strings.length)
          break label350;
        localStringBuilder.append(AuthAlgorithm.strings[k]);
      }
      while (true)
      {
        k++;
        break;
        label350: localStringBuilder.append("??");
      }
    }
    localStringBuilder.append((char)'\n');
    localStringBuilder.append(" PairwiseCiphers:");
    int m = 0;
    if (m < this.allowedPairwiseCiphers.size())
    {
      if (this.allowedPairwiseCiphers.get(m))
      {
        localStringBuilder.append(" ");
        if (m >= PairwiseCipher.strings.length)
          break label437;
        localStringBuilder.append(PairwiseCipher.strings[m]);
      }
      while (true)
      {
        m++;
        break;
        label437: localStringBuilder.append("??");
      }
    }
    localStringBuilder.append((char)'\n');
    localStringBuilder.append(" GroupCiphers:");
    int n = 0;
    if (n < this.allowedGroupCiphers.size())
    {
      if (this.allowedGroupCiphers.get(n))
      {
        localStringBuilder.append(" ");
        if (n >= GroupCipher.strings.length)
          break label524;
        localStringBuilder.append(GroupCipher.strings[n]);
      }
      while (true)
      {
        n++;
        break;
        label524: localStringBuilder.append("??");
      }
    }
    localStringBuilder.append((char)'\n').append(" PSK: ");
    if (this.preSharedKey != null)
      localStringBuilder.append((char)'*');
    for (EnterpriseField localEnterpriseField : this.enterpriseFields)
    {
      localStringBuilder.append((char)'\n').append(" " + localEnterpriseField.varName() + ": ");
      String str = localEnterpriseField.value();
      if (str != null)
        localStringBuilder.append(str);
    }
    localStringBuilder.append((char)'\n');
    localStringBuilder.append("IP assignment: " + this.ipAssignment.toString());
    localStringBuilder.append("\n");
    localStringBuilder.append("Proxy settings: " + this.proxySettings.toString());
    localStringBuilder.append("\n");
    localStringBuilder.append(this.linkProperties.toString());
    localStringBuilder.append("\n");
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.networkId);
    paramParcel.writeInt(this.status);
    paramParcel.writeInt(this.disableReason);
    paramParcel.writeString(this.SSID);
    paramParcel.writeString(this.BSSID);
    paramParcel.writeString(this.preSharedKey);
    String[] arrayOfString = this.wepKeys;
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
      paramParcel.writeString(arrayOfString[j]);
    paramParcel.writeInt(this.wepTxKeyIndex);
    paramParcel.writeInt(this.priority);
    if (this.hiddenSSID);
    for (int k = 1; ; k = 0)
    {
      paramParcel.writeInt(k);
      writeBitSet(paramParcel, this.allowedKeyManagement);
      writeBitSet(paramParcel, this.allowedProtocols);
      writeBitSet(paramParcel, this.allowedAuthAlgorithms);
      writeBitSet(paramParcel, this.allowedPairwiseCiphers);
      writeBitSet(paramParcel, this.allowedGroupCiphers);
      EnterpriseField[] arrayOfEnterpriseField = this.enterpriseFields;
      int m = arrayOfEnterpriseField.length;
      for (int n = 0; n < m; n++)
        paramParcel.writeString(arrayOfEnterpriseField[n].value());
    }
    paramParcel.writeString(this.ipAssignment.name());
    paramParcel.writeString(this.proxySettings.name());
    paramParcel.writeParcelable(this.linkProperties, paramInt);
  }

  public static class AuthAlgorithm
  {
    public static final int LEAP = 2;
    public static final int OPEN = 0;
    public static final int SHARED = 1;
    public static final String[] strings = { "OPEN", "SHARED", "LEAP" };
    public static final String varName = "auth_alg";

    private AuthAlgorithm()
    {
    }
  }

  public class EnterpriseField
  {
    private String value;
    private String varName;

    private EnterpriseField(String arg2)
    {
      Object localObject;
      this.varName = localObject;
      this.value = null;
    }

    public void setValue(String paramString)
    {
      this.value = paramString;
    }

    public String value()
    {
      return this.value;
    }

    public String varName()
    {
      return this.varName;
    }
  }

  public static class GroupCipher
  {
    public static final int CCMP = 3;
    public static final int TKIP = 2;
    public static final int WEP104 = 1;
    public static final int WEP40 = 0;
    public static final String[] strings = { "WEP40", "WEP104", "TKIP", "CCMP" };
    public static final String varName = "group";

    private GroupCipher()
    {
    }
  }

  public static enum IpAssignment
  {
    static
    {
      DHCP = new IpAssignment("DHCP", 1);
      UNASSIGNED = new IpAssignment("UNASSIGNED", 2);
      IpAssignment[] arrayOfIpAssignment = new IpAssignment[3];
      arrayOfIpAssignment[0] = STATIC;
      arrayOfIpAssignment[1] = DHCP;
      arrayOfIpAssignment[2] = UNASSIGNED;
    }
  }

  public static class KeyMgmt
  {
    public static final int IEEE8021X = 3;
    public static final int NONE = 0;
    public static final int WPA2_PSK = 4;
    public static final int WPA_EAP = 2;
    public static final int WPA_PSK = 1;
    public static final String[] strings = { "NONE", "WPA_PSK", "WPA_EAP", "IEEE8021X", "WPA2_PSK" };
    public static final String varName = "key_mgmt";

    private KeyMgmt()
    {
    }
  }

  public static class PairwiseCipher
  {
    public static final int CCMP = 2;
    public static final int NONE = 0;
    public static final int TKIP = 1;
    public static final String[] strings = { "NONE", "TKIP", "CCMP" };
    public static final String varName = "pairwise";

    private PairwiseCipher()
    {
    }
  }

  public static class Protocol
  {
    public static final int RSN = 1;
    public static final int WPA = 0;
    public static final String[] strings = { "WPA", "RSN" };
    public static final String varName = "proto";

    private Protocol()
    {
    }
  }

  public static enum ProxySettings
  {
    static
    {
      ProxySettings[] arrayOfProxySettings = new ProxySettings[3];
      arrayOfProxySettings[0] = NONE;
      arrayOfProxySettings[1] = STATIC;
      arrayOfProxySettings[2] = UNASSIGNED;
    }
  }

  public static class Status
  {
    public static final int CURRENT = 0;
    public static final int DISABLED = 1;
    public static final int ENABLED = 2;
    public static final String[] strings = { "current", "disabled", "enabled" };

    private Status()
    {
    }
  }
}

/* Location:
 * Qualified Name:     android.net.wifi.WifiConfiguration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */