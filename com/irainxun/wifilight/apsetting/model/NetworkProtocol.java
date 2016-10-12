package com.irainxun.wifilight.apsetting.model;

import java.io.Serializable;

public class NetworkProtocol
  implements Serializable
{
  public static final int PROTOCAL_TCP_CLIENT = 2;
  public static final int PROTOCAL_TCP_SERVER = 1;
  public static final int PROTOCAL_UDP = 3;
  private static final long serialVersionUID = 1L;
  private String ip;
  private int port;
  private String protocol;
  private String server;

  public NetworkProtocol()
  {
  }

  public NetworkProtocol(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this.protocol = paramString1;
    this.server = paramString2;
    this.ip = paramString3;
    this.port = paramInt;
  }

  public String getIp()
  {
    return this.ip;
  }

  public int getPort()
  {
    return this.port;
  }

  public String getProtocol()
  {
    return this.protocol;
  }

  public String getServer()
  {
    return this.server;
  }

  public int getType()
  {
    if (this.protocol == null);
    do
    {
      do
      {
        do
        {
          return 0;
          if (!this.protocol.equals("TCP"))
            break;
        }
        while (this.server == null);
        if (this.server.equals("Server"))
          return 1;
      }
      while (!this.server.equals("Client"));
      return 2;
    }
    while (!this.protocol.equals("UDP"));
    return 3;
  }

  public void setIp(String paramString)
  {
    this.ip = paramString;
  }

  public void setPort(int paramInt)
  {
    this.port = paramInt;
  }

  public void setProtocol(String paramString)
  {
    this.protocol = paramString;
  }

  public void setServer(String paramString)
  {
    this.server = paramString;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.protocol;
    arrayOfObject[1] = this.server;
    arrayOfObject[2] = this.ip;
    arrayOfObject[3] = Integer.valueOf(this.port);
    return String.format("Name:%s Server:%s IP:%s Port:%d", arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.NetworkProtocol
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */