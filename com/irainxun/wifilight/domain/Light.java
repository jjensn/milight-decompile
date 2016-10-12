package com.irainxun.wifilight.domain;

import java.io.Serializable;

public class Light
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public String iconPath;
  public int iconRes;
  public int id;
  public String mac;
  public String name;
  public int status;

  public Light()
  {
  }

  public static class Status
  {
    public static final int INTERNET = 2;
    public static final int OFFLINE = 0;
    public static final int ONLINE = 1;

    public Status()
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.domain.Light
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */