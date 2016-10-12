package io.xlink.wifi.sdk.listener;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.event.a;
import io.xlink.wifi.sdk.util.b;

public abstract class SetDataPointListener extends a
{
  public SetDataPointListener()
  {
  }

  public final void onResponse(final e parame)
  {
    b.a(new Runnable()
    {
      public void run()
      {
        SetDataPointListener.this.onSetDataPoint(parame.a, parame.b, parame.c);
      }
    });
  }

  public abstract void onSetDataPoint(XDevice paramXDevice, int paramInt1, int paramInt2);
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.listener.SetDataPointListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */