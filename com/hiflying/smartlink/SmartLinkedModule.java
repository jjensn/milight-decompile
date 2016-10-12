package com.hiflying.smartlink;

import java.io.Serializable;

public class SmartLinkedModule
  implements Serializable
{
  private static final long serialVersionUID = 833195854008521358L;
  private String ip;
  private String mac;
  private String mid;

  public SmartLinkedModule()
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
    return this.ip;
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
    this.ip = paramString;
  }

  public String toString()
  {
    return "SmartLinkedModule [mac=" + this.mac + ", ip=" + this.ip + ", mid=" + this.mid + "]";
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.SmartLinkedModule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */