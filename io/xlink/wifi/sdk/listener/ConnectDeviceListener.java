package io.xlink.wifi.sdk.listener;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.event.a;
import io.xlink.wifi.sdk.util.b;

public abstract class ConnectDeviceListener extends a
{
  public ConnectDeviceListener()
  {
  }

  public abstract void onConnectDevice(XDevice paramXDevice, int paramInt);

  public final void onResponse(final e parame)
  {
    b.a(new Runnable()
    {
      public void run()
      {
        ConnectDeviceListener.this.onConnectDevice(parame.a, parame.b);
      }
    });
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.listener.ConnectDeviceListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */