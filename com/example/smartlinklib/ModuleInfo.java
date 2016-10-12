package com.example.smartlinklib;

@Deprecated
public class ModuleInfo
{
  private String ModuleIP;
  private String mac;
  private String mid;

  public ModuleInfo()
  {
  }

  public String getMac()
  {
    return this.mac;
  }

  public String getMid()
  {
    return this.mid;
  }

  public String getModuleIP()
  {
    return this.ModuleIP;
  }

  public void setMac(String paramString)
  {
    this.mac = paramString;
  }

  public void setMid(String paramString)
  {
    this.mid = paramString;
  }

  public void setModuleIP(String paramString)
  {
    this.ModuleIP = paramString;
  }
}

/* Location:
 * Qualified Name:     com.example.smartlinklib.ModuleInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */