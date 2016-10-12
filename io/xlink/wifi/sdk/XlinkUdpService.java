package io.xlink.wifi.sdk;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.xlink.wifi.sdk.encoder.g;
import io.xlink.wifi.sdk.util.MyLog;
import io.xlink.wifi.sdk.util.b;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public final class XlinkUdpService extends Service
{
  public static boolean b = false;
  private static String f = b.a.getPackageName() + "-upd-keep";
  private static XlinkUdpService g;
  public io.xlink.wifi.sdk.udp.a a;
  public long c;
  public Timer d;
  private DatagramSocket e;
  private boolean h = false;
  private boolean i = false;
  private long j;
  private TimerTask k;
  private BroadcastReceiver l = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      String str = paramAnonymousIntent.getAction();
      MyLog.e("UDPService", "UDP mReceiver " + new Date() + "  " + System.currentTimeMillis());
      if (str.equals(XlinkUdpService.g()))
        io.xlink.wifi.sdk.manage.c.a().d();
    }
  };
  private final String m = "UDPService";

  public XlinkUdpService()
  {
  }

  public static boolean a()
  {
    if (b() == null)
      return false;
    return b().h;
  }

  public static XlinkUdpService b()
  {
    return g;
  }

  private void h()
  {
    if ((b) || (this.h))
    {
      a("upd connecting bind ...return ");
      return;
    }
    b = true;
    b.b(new Runnable()
    {
      public void run()
      {
        try
        {
          XlinkUdpService.this.a("bind udp ...");
          XlinkUdpService.a(XlinkUdpService.this, new DatagramSocket(null));
          XlinkUdpService.a(XlinkUdpService.this).setBroadcast(true);
          XlinkUdpService.a(XlinkUdpService.this).bind(new InetSocketAddress(0));
          XlinkUdpService.this.f();
          io.xlink.wifi.sdk.global.a.g = XlinkUdpService.a(XlinkUdpService.this).getLocalPort();
          XlinkUdpService.this.a("bind udp prot:" + io.xlink.wifi.sdk.global.a.g);
          return;
        }
        catch (SocketException localSocketException)
        {
          localSocketException.printStackTrace();
          XlinkUdpService.this.a("bind udp  fail ");
          io.xlink.wifi.sdk.event.c.a(2, -1);
          return;
        }
        finally
        {
          XlinkUdpService.b = false;
        }
      }
    });
  }

  public void a(g paramg)
  {
    io.xlink.wifi.sdk.tcp.a.a().b(paramg);
  }

  public void a(String paramString)
  {
    MyLog.e("UDPService", paramString);
  }

  public void a(boolean paramBoolean, int paramInt)
  {
    if (this.h)
    {
      this.h = false;
      if (this.e != null)
        this.e.close();
      if (this.a != null)
        this.a.c();
      if (paramBoolean)
      {
        a("upd bind close");
        io.xlink.wifi.sdk.event.c.a(3, paramInt);
      }
    }
  }

  public boolean c()
  {
    if (System.currentTimeMillis() - this.j > 15000L)
      this.i = false;
    return this.i;
  }

  public void d()
  {
    if (c())
      return;
    this.i = true;
    MyLog.e("UDPService", "local start KeepAlive ");
    this.c = System.currentTimeMillis();
    if (this.k != null)
    {
      this.k.cancel();
      this.k = null;
    }
    this.j = System.currentTimeMillis();
    this.k = new TimerTask()
    {
      public void run()
      {
        io.xlink.wifi.sdk.manage.c.a().d();
        XlinkUdpService.a(XlinkUdpService.this, System.currentTimeMillis());
      }
    };
    this.d.schedule(this.k, 10000L, 10000L);
  }

  public void e()
  {
    if (this.k != null)
    {
      this.k.cancel();
      this.k = null;
    }
  }

  public void f()
  {
    if (!io.xlink.wifi.sdk.tcp.a.a().c())
      io.xlink.wifi.sdk.tcp.a.a().b();
    io.xlink.wifi.sdk.tcp.a.a().a(this, this.e);
    this.a = new io.xlink.wifi.sdk.udp.a(g, this.e);
    this.a.b();
    this.h = true;
    a("udp bind succeed");
    io.xlink.wifi.sdk.event.c.a(1, 0);
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    a("UPD service onCreate");
    g = this;
    this.d = new Timer();
  }

  public void onDestroy()
  {
    a(true, -2);
    if (this.l != null);
    try
    {
      unregisterReceiver(this.l);
      label22: this.d.cancel();
      this.d = null;
      a("upd service onDestroy");
      startService(new Intent(this, XlinkUdpService.class));
      a("upd RestartService... on onDestroy");
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      break label22;
    }
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    a("UdpService onStartCommand connected:" + this.h);
    if (!this.h)
      h();
    return 1;
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkUdpService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */