package io.xlink.wifi.sdk.event;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.encoder.e;

public abstract class b extends a
{
  public b()
  {
  }

  public abstract void a(XDevice paramXDevice, int paramInt);

  public final void onResponse(e parame)
  {
    a(parame.a, parame.b);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.event.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */