package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkTcpService;
import io.xlink.wifi.sdk.a;
import io.xlink.wifi.sdk.event.b;

class c$1 extends b
{
  c$1(c paramc)
  {
  }

  public void a(XDevice paramXDevice, int paramInt)
  {
    e locale = new e(0);
    switch (paramInt)
    {
    default:
      locale.b = paramInt;
      locale.a = paramXDevice;
      this.a.a(locale);
      this.a.a("handshake error code:" + paramInt);
    case 0:
    case 2:
    case -100:
    }
    int i;
    do
    {
      return;
      locale.a = paramXDevice;
      locale.a = a.a().a(0, locale.a);
      io.xlink.wifi.sdk.manage.c.a().c(locale.a);
      this.a.a(locale);
      return;
      locale.b = 102;
      locale.a = paramXDevice;
      this.a.a(locale);
      return;
      if (!XlinkTcpService.c())
      {
        locale.b = 200;
        locale.a = paramXDevice;
        this.a.a(locale);
        return;
      }
      if (!paramXDevice.isValidId())
        break;
      i = a.a().a(paramXDevice, c.a(this.a));
    }
    while (i >= 0);
    this.a.a("connectdevice subscribeDevice fail ret==" + i);
    locale.a = paramXDevice;
    locale.b = 200;
    this.a.a(locale);
    return;
    locale.a = paramXDevice;
    locale.b = 200;
    this.a.a(locale);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.c.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */