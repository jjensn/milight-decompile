package android.net.wifi;

public enum WifiConfiguration$IpAssignment
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

/* Location:
 * Qualified Name:     android.net.wifi.WifiConfiguration.IpAssignment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */