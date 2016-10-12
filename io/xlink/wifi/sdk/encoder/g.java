package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.manage.c;
import io.xlink.wifi.sdk.util.MyLog;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class g
{
  public static final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
  private d b;
  private io.xlink.wifi.sdk.event.a c;
  private int d = 10;
  private Runnable e;
  private ScheduledFuture<?> f;

  public g(d paramd)
  {
    this(paramd, null, 0);
  }

  public g(d paramd, io.xlink.wifi.sdk.event.a parama)
  {
    this(paramd, parama, 10);
  }

  public g(d paramd, io.xlink.wifi.sdk.event.a parama, int paramInt)
  {
    this.b = paramd;
    this.c = parama;
    this.d = paramInt;
  }

  public XDevice a()
  {
    return this.b.b();
  }

  public void a(String paramString)
  {
    this.b.a(paramString);
  }

  public d b()
  {
    return this.b;
  }

  public void c()
  {
    e.a(f());
    d();
  }

  public void d()
  {
    if (this.f != null)
    {
      this.f.cancel(true);
      this.f = null;
    }
  }

  public void e()
  {
    if (g() == null);
    while (this.d == 0)
      return;
    if (this.f != null)
    {
      this.f.cancel(true);
      this.f = null;
    }
    this.e = new Runnable()
    {
      public void run()
      {
        g.this.c();
        e locale = e.b(-100);
        locale.a = g.a(g.this).b();
        locale.c = g.a(g.this).g();
        g.this.g().onResponse(locale);
        if (g.a(g.this).a() == 1);
        switch (g.a(g.this).e())
        {
        default:
          return;
        case 8:
        }
        int i = c.a().b(g.a(g.this).b().getMacAddress()).a;
        if (i >= 5)
        {
          g.a(g.this).b().a = 0;
          MyLog.e("TIMEOUT", "TYPE_LOCAL_PIPE::timeoutCount:>5 reconnectDevice");
          io.xlink.wifi.sdk.a.a().a(g.a(g.this).b());
          return;
        }
        XDevice localXDevice = g.a(g.this).b();
        localXDevice.a = (1 + localXDevice.a);
        MyLog.e("TIMEOUT", "TYPE_LOCAL_PIPE::timeoutCount:" + i);
      }
    };
    this.f = a.schedule(this.e, this.d, TimeUnit.SECONDS);
  }

  public String f()
  {
    return this.b.f();
  }

  public io.xlink.wifi.sdk.event.a g()
  {
    return this.c;
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */