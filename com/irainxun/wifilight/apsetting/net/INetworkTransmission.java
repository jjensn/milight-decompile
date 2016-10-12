package com.irainxun.wifilight.apsetting.net;

public abstract interface INetworkTransmission
{
  public abstract void close();

  public abstract void onReceive(byte[] paramArrayOfByte, int paramInt);

  public abstract boolean open();

  public abstract boolean send(String paramString);

  public abstract void setParameters(String paramString, int paramInt);
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.INetworkTransmission
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */