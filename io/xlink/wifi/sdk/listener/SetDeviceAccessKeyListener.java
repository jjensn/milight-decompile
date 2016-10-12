package io.xlink.wifi.sdk.listener;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.event.a;
import io.xlink.wifi.sdk.util.b;

public abstract class SetDeviceAccessKeyListener extends a
{
  public SetDeviceAccessKeyListener()
  {
  }

  public final void onResponse(final e parame)
  {
    b.a(new Runnable()
    {
      public void run()
      {
        SetDeviceAccessKeyListener.this.onSetLocalDeviceAccessKey(parame.a, parame.b, Math.abs(parame.c));
      }
    });
  }

  public abstract void onSetLocalDeviceAccessKey(XDevice paramXDevice, int paramInt1, int paramInt2);
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.listener.SetDeviceAccessKeyListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */