package com.irainxun.wifilight.xlink;

import com.irainxun.wifilight.xlink.bean.Device;
import io.xlink.wifi.sdk.XDevice;

public abstract interface MyApp$OnDeviceMessage
{
  public abstract void Aiyunxun_onRecvPipeData(Device paramDevice, byte[] paramArrayOfByte);

  public abstract void Aiyuxun_DeviceNetStatus(XDevice paramXDevice, int paramInt);

  public abstract void Aiyuxun_onDeviceStateChanged(Device paramDevice, int paramInt);

  public abstract void Aiyuxun_onRecvPipeSyncData(Device paramDevice, byte[] paramArrayOfByte);

  public abstract void Aiyuxun_onSendData(XDevice paramXDevice, int paramInt);
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.MyApp.OnDeviceMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */