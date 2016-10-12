package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.manage.c;
import io.xlink.wifi.sdk.util.MyLog;

class g$1
  implements Runnable
{
  g$1(g paramg)
  {
  }

  public void run()
  {
    this.a.c();
    e locale = e.b(-100);
    locale.a = g.a(this.a).b();
    locale.c = g.a(this.a).g();
    this.a.g().onResponse(locale);
    if (g.a(this.a).a() == 1);
    switch (g.a(this.a).e())
    {
    default:
      return;
    case 8:
    }
    int i = c.a().b(g.a(this.a).b().getMacAddress()).a;
    if (i >= 5)
    {
      g.a(this.a).b().a = 0;
      MyLog.e("TIMEOUT", "TYPE_LOCAL_PIPE::timeoutCount:>5 reconnectDevice");
      io.xlink.wifi.sdk.a.a().a(g.a(this.a).b());
      return;
    }
    XDevice localXDevice = g.a(this.a).b();
    localXDevice.a = (1 + localXDevice.a);
    MyLog.e("TIMEOUT", "TYPE_LOCAL_PIPE::timeoutCount:" + i);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.g.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */