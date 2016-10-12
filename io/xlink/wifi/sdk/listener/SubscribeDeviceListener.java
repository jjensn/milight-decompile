package io.xlink.wifi.sdk.listener;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.event.a;
import io.xlink.wifi.sdk.manage.c;
import io.xlink.wifi.sdk.util.b;

public abstract class SubscribeDeviceListener extends a
{
  public SubscribeDeviceListener()
  {
  }

  public final void onResponse(final e parame)
  {
    c.a().c(parame.a);
    b.a(new Runnable()
    {
      public void run()
      {
        SubscribeDeviceListener.this.onSubscribeDevice(parame.a, parame.b);
      }
    });
  }

  public abstract void onSubscribeDevice(XDevice paramXDevice, int paramInt);
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.listener.SubscribeDeviceListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */