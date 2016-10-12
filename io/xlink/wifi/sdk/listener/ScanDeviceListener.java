package io.xlink.wifi.sdk.listener;

import io.xlink.wifi.sdk.XDevice;

public abstract class ScanDeviceListener
{
  public ScanDeviceListener()
  {
  }

  public abstract void onGotDeviceByScan(XDevice paramXDevice);
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.listener.ScanDeviceListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */