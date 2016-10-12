package com.irainxun.wifilight.apsetting.model;

public abstract interface TransparentTransmissionListener
{
  public abstract void onOpen(boolean paramBoolean);

  public abstract void onReceive(byte[] paramArrayOfByte, int paramInt);
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.TransparentTransmissionListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */