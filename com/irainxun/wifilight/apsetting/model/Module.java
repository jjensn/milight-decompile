package com.irainxun.wifilight.apsetting.model;

import java.text.DecimalFormat;

public class Module
{
  private DecimalFormat format = new DecimalFormat("00");
  private int id;
  private String ip;
  private String mac;
  private String moduleID;

  public Module()
  {
  }

  public Module(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.id = paramInt;
    this.mac = paramString1;
    this.ip = paramString2;
    this.moduleID = paramString3;
  }

  public int getId()
  {
    return this.id;
  }

  public String getIp()
  {
    return this.ip;
  }

  public String getMac()
  {
    return this.mac;
  }

  public String getModuleID()
  {
    return this.moduleID;
  }

  public void setId(int paramInt)
  {
    this.id = paramInt;
  }

  public void setIp(String paramString)
  {
    this.ip = paramString;
  }

  public void setMac(String paramString)
  {
    this.mac = paramString;
  }

  public void setModuleID(String paramString)
  {
    this.moduleID = paramString;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.format.format(this.id);
    arrayOfObject[1] = this.mac;
    arrayOfObject[2] = this.ip;
    if (this.moduleID == null);
    for (String str = ""; ; str = this.moduleID)
    {
      arrayOfObject[3] = str;
      return String.format("%s. %s  %s  %s", arrayOfObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.Module
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */