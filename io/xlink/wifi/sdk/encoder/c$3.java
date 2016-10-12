package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkAgent;

class c$3 extends io.xlink.wifi.sdk.event.a
{
  c$3(c paramc)
  {
  }

  public void onResponse(e parame)
  {
    switch (parame.b)
    {
    default:
      this.a.a("cloud probe error code:" + parame.b);
      parame.b = 110;
      this.a.a(parame);
    case 0:
    case 5:
      do
      {
        return;
        this.a.a("cloud probe succeed  device state online ");
        parame.b = 1;
        parame.a = io.xlink.wifi.sdk.a.a().a(1, parame.a);
        io.xlink.wifi.sdk.manage.c.a().c(parame.a);
        this.a.a(parame);
        return;
        this.a.a("cloud probe device not subscribe " + parame.a.getDeviceId());
      }
      while (XlinkAgent.getInstance().subscribeDevice(parame.a, c.b(this.a), c.c(this.a)) >= 0);
      parame.b = 200;
      this.a.a(parame);
      return;
    case -100:
      this.a.a("cloud probe packet timeout");
      parame.b = 200;
      this.a.a(parame);
      return;
    case 2:
      parame.b = 102;
      this.a.a(parame);
      return;
    case 3:
    }
    parame.b = 109;
    this.a.a(parame);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.c.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */