package com.irainxun.wifilight.xlink.bean;

import io.xlink.wifi.sdk.XDevice;
import java.io.Serializable;

public class Device
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private int accessKey;
  public int dispFlag = 0;
  public int getPassword = 0;
  public String iconPath;
  public int iconRes;
  public boolean isSelect;
  public int login;
  public String mac;
  public String name;
  private String password;
  public int status = 0;
  private boolean switch_;
  private short th;
  private int wind;
  private XDevice xDevice;

  public Device(XDevice paramXDevice)
  {
    this.xDevice = paramXDevice;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Device))
    {
      Device localDevice = (Device)paramObject;
      return this.xDevice.equals(localDevice.getXDevice());
    }
    if ((paramObject instanceof XDevice))
      return this.xDevice.equals(paramObject);
    return super.equals(paramObject);
  }

  public int getAccessKey()
  {
    return this.accessKey;
  }

  public String getMacAddress()
  {
    return this.xDevice.getMacAddress();
  }

  public String getName()
  {
    return this.xDevice.getDeviceName();
  }

  public String getPassword()
  {
    return this.password;
  }

  public short getTh()
  {
    return this.th;
  }

  public int getWind()
  {
    return this.wind;
  }

  public XDevice getXDevice()
  {
    return this.xDevice;
  }

  public boolean isConnect()
  {
    return this.xDevice.getDevcieConnectStates() == -1;
  }

  public boolean isSwitch_()
  {
    return this.switch_;
  }

  public void setAccessKey(int paramInt)
  {
    this.accessKey = paramInt;
  }

  public void setPassword(String paramString)
  {
    this.password = paramString;
  }

  public void setSwitch_(boolean paramBoolean)
  {
    this.switch_ = paramBoolean;
  }

  public void setTh(short paramShort)
  {
    this.th = paramShort;
  }

  public void setWind(int paramInt)
  {
    this.wind = paramInt;
  }

  public void setxDevice(XDevice paramXDevice)
  {
    this.xDevice = paramXDevice;
  }

  public String toString()
  {
    return String.valueOf(this.xDevice.toString()) + " pwd:" + this.password;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.bean.Device
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */