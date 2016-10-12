package io.xlink.wifi.sdk.listener;

import io.xlink.wifi.sdk.encoder.e;

class SetDeviceAuthorizeListener$1
  implements Runnable
{
  SetDeviceAuthorizeListener$1(SetDeviceAuthorizeListener paramSetDeviceAuthorizeListener, e parame)
  {
  }

  public void run()
  {
    this.b.onSetLocalDeviceAuthorizeCode(this.a.a, this.a.b, Math.abs(this.a.c));
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.listener.SetDeviceAuthorizeListener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */