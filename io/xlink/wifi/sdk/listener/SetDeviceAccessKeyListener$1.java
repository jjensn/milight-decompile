package io.xlink.wifi.sdk.listener;

import io.xlink.wifi.sdk.encoder.e;

class SetDeviceAccessKeyListener$1
  implements Runnable
{
  SetDeviceAccessKeyListener$1(SetDeviceAccessKeyListener paramSetDeviceAccessKeyListener, e parame)
  {
  }

  public void run()
  {
    this.b.onSetLocalDeviceAccessKey(this.a.a, this.a.b, Math.abs(this.a.c));
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.listener.SetDeviceAccessKeyListener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */