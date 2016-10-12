package android.net.wifi;

public class WifiConfiguration$EnterpriseField
{
  private String value;
  private String varName;

  private WifiConfiguration$EnterpriseField(WifiConfiguration paramWifiConfiguration, String paramString)
  {
    this.varName = paramString;
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

/* Location:
 * Qualified Name:     android.net.wifi.WifiConfiguration.EnterpriseField
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */