package io.xlink.wifi.sdk.listener;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.bean.EventNotify;

public abstract interface XlinkNetListener
{
  public abstract void onDataPointUpdate(XDevice paramXDevice, int paramInt1, Object paramObject, int paramInt2, int paramInt3);

  public abstract void onDeviceStateChanged(XDevice paramXDevice, int paramInt);

  public abstract void onDisconnect(int paramInt);

  public abstract void onEventNotify(EventNotify paramEventNotify);

  public abstract void onLocalDisconnect(int paramInt);

  public abstract void onLogin(int paramInt);

  public abstract void onRecvPipeData(XDevice paramXDevice, byte paramByte, byte[] paramArrayOfByte);

  public abstract void onRecvPipeSyncData(XDevice paramXDevice, byte paramByte, byte[] paramArrayOfByte);

  public abstract void onStart(int paramInt);
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.listener.XlinkNetListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */