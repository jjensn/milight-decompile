package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkAgent;
import io.xlink.wifi.sdk.XlinkTcpService;
import io.xlink.wifi.sdk.XlinkUdpService;
import io.xlink.wifi.sdk.listener.ConnectDeviceListener;
import io.xlink.wifi.sdk.listener.SubscribeDeviceListener;
import java.util.HashMap;

public class c extends a
{
  private static final HashMap<String, c> b = new HashMap();
  private long c;
  private XDevice d;
  private int e;
  private ConnectDeviceListener f;
  private io.xlink.wifi.sdk.event.b g = new io.xlink.wifi.sdk.event.b()
  {
    public void a(XDevice paramAnonymousXDevice, int paramAnonymousInt)
    {
      e locale = new e(0);
      switch (paramAnonymousInt)
      {
      default:
        locale.b = paramAnonymousInt;
        locale.a = paramAnonymousXDevice;
        c.this.a(locale);
        c.this.a("handshake error code:" + paramAnonymousInt);
      case 0:
      case 2:
      case -100:
      }
      int i;
      do
      {
        return;
        locale.a = paramAnonymousXDevice;
        locale.a = io.xlink.wifi.sdk.a.a().a(0, locale.a);
        io.xlink.wifi.sdk.manage.c.a().c(locale.a);
        c.this.a(locale);
        return;
        locale.b = 102;
        locale.a = paramAnonymousXDevice;
        c.this.a(locale);
        return;
        if (!XlinkTcpService.c())
        {
          locale.b = 200;
          locale.a = paramAnonymousXDevice;
          c.this.a(locale);
          return;
        }
        if (!paramAnonymousXDevice.isValidId())
          break;
        i = io.xlink.wifi.sdk.a.a().a(paramAnonymousXDevice, c.a(c.this));
      }
      while (i >= 0);
      c.this.a("connectdevice subscribeDevice fail ret==" + i);
      locale.a = paramAnonymousXDevice;
      locale.b = 200;
      c.this.a(locale);
      return;
      locale.a = paramAnonymousXDevice;
      locale.b = 200;
      c.this.a(locale);
    }
  };
  private SubscribeDeviceListener h = new SubscribeDeviceListener()
  {
    public void onSubscribeDevice(XDevice paramAnonymousXDevice, int paramAnonymousInt)
    {
      e locale = new e(paramAnonymousInt);
      locale.a = paramAnonymousXDevice;
      switch (paramAnonymousInt)
      {
      case 1:
      default:
        c.this.a("subscribe fail code:" + paramAnonymousInt);
        locale.b = 110;
        locale.a = paramAnonymousXDevice;
        c.this.a(locale);
        return;
      case 0:
        if (paramAnonymousXDevice.getDeviceId() == 0)
          locale.b = 104;
        while (true)
        {
          c.this.a(locale);
          return;
          locale.b = 1;
          locale.a = io.xlink.wifi.sdk.a.a().a(1, locale.a);
          io.xlink.wifi.sdk.manage.c.a().c(locale.a);
          XlinkAgent.getInstance().sendProbe(locale.a);
        }
      case 2:
      }
      locale.b = 102;
      locale.a = paramAnonymousXDevice;
      c.this.a(locale);
    }
  };
  private io.xlink.wifi.sdk.event.a i = new io.xlink.wifi.sdk.event.a()
  {
    public void onResponse(e paramAnonymouse)
    {
      switch (paramAnonymouse.b)
      {
      default:
        c.this.a("cloud probe error code:" + paramAnonymouse.b);
        paramAnonymouse.b = 110;
        c.this.a(paramAnonymouse);
      case 0:
      case 5:
        do
        {
          return;
          c.this.a("cloud probe succeed  device state online ");
          paramAnonymouse.b = 1;
          paramAnonymouse.a = io.xlink.wifi.sdk.a.a().a(1, paramAnonymouse.a);
          io.xlink.wifi.sdk.manage.c.a().c(paramAnonymouse.a);
          c.this.a(paramAnonymouse);
          return;
          c.this.a("cloud probe device not subscribe " + paramAnonymouse.a.getDeviceId());
        }
        while (XlinkAgent.getInstance().subscribeDevice(paramAnonymouse.a, c.b(c.this), c.c(c.this)) >= 0);
        paramAnonymouse.b = 200;
        c.this.a(paramAnonymouse);
        return;
      case -100:
        c.this.a("cloud probe packet timeout");
        paramAnonymouse.b = 200;
        c.this.a(paramAnonymouse);
        return;
      case 2:
        paramAnonymouse.b = 102;
        c.this.a(paramAnonymouse);
        return;
      case 3:
      }
      paramAnonymouse.b = 109;
      c.this.a(paramAnonymouse);
    }
  };
  private io.xlink.wifi.sdk.event.a j = new io.xlink.wifi.sdk.event.a()
  {
    public void onResponse(e paramAnonymouse)
    {
      int i = -1;
      switch (paramAnonymouse.b)
      {
      default:
      case 0:
      case -100:
      }
      while (true)
      {
        if (i < 0)
        {
          c.this.a("call handshakeWithDevice fail code:" + i);
          paramAnonymouse.a = c.e(c.this);
          paramAnonymouse.b = 200;
          c.this.a(paramAnonymouse);
        }
        return;
        c.this.a("scan by mac succeed :" + paramAnonymouse.a.getAddress());
        i = io.xlink.wifi.sdk.a.a().a(paramAnonymouse.a, c.b(c.this), c.d(c.this), 2);
        continue;
        i = io.xlink.wifi.sdk.a.a().a(c.e(c.this), c.b(c.this), c.d(c.this), 2);
      }
    }
  };

  public c(XDevice paramXDevice, int paramInt, ConnectDeviceListener paramConnectDeviceListener)
  {
    this.e = paramInt;
    this.f = paramConnectDeviceListener;
    this.d = paramXDevice;
    this.c = System.currentTimeMillis();
    this.a = b();
  }

  private void c()
  {
    if (this.a == 0)
      b.put(this.d.getMacAddress(), this);
  }

  public int a()
  {
    if (this.a == 0)
    {
      if ((XlinkUdpService.a()) && (io.xlink.wifi.sdk.util.b.e()))
      {
        this.a = XlinkAgent.scanByMac(this.d, this.j);
        c();
        return this.a;
      }
      if (XlinkTcpService.c())
      {
        if (!this.d.isValidId())
        {
          this.a = XlinkAgent.getInstance().subscribeDevice(this.d, this.e, this.h);
          c();
          return this.a;
        }
        this.a = io.xlink.wifi.sdk.a.a().a(this.d, this.i);
        c();
        return this.a;
      }
      this.a = -4;
    }
    return this.a;
  }

  public void a(e parame)
  {
    b.remove(this.d.getMacAddress());
    this.f.onResponse(parame);
  }

  public int b()
  {
    if ((this.e < 0) || (this.e > 999999999))
    {
      this.a = -8;
      return -8;
    }
    if (this.f == null)
    {
      this.a = -8;
      return -8;
    }
    if (!io.xlink.wifi.sdk.manage.a.a().d())
    {
      this.a = -10;
      return -10;
    }
    if (io.xlink.wifi.sdk.manage.c.a().a(this.d))
    {
      this.a = -3;
      return -3;
    }
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(this.d.getMacAddress());
    if (localXDevice == null)
    {
      this.a = -6;
      return -6;
    }
    this.d = localXDevice;
    this.d = io.xlink.wifi.sdk.a.a().c(this.d, this.e);
    return 0;
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */