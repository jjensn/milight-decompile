package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkAgent;
import io.xlink.wifi.sdk.a;
import io.xlink.wifi.sdk.listener.SubscribeDeviceListener;

class c$2 extends SubscribeDeviceListener
{
  c$2(c paramc)
  {
  }

  public void onSubscribeDevice(XDevice paramXDevice, int paramInt)
  {
    e locale = new e(paramInt);
    locale.a = paramXDevice;
    switch (paramInt)
    {
    case 1:
    default:
      this.a.a("subscribe fail code:" + paramInt);
      locale.b = 110;
      locale.a = paramXDevice;
      this.a.a(locale);
      return;
    case 0:
      if (paramXDevice.getDeviceId() == 0)
        locale.b = 104;
      while (true)
      {
        this.a.a(locale);
        return;
        locale.b = 1;
        locale.a = a.a().a(1, locale.a);
        io.xlink.wifi.sdk.manage.c.a().c(locale.a);
        XlinkAgent.getInstance().sendProbe(locale.a);
      }
    case 2:
    }
    locale.b = 102;
    locale.a = paramXDevice;
    this.a.a(locale);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.c.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */