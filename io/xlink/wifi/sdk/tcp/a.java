package io.xlink.wifi.sdk.tcp;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkTcpService;
import io.xlink.wifi.sdk.XlinkUdpService;
import io.xlink.wifi.sdk.encoder.d;
import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.encoder.g;
import io.xlink.wifi.sdk.util.MyLog;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class a
{
  private static a d;
  public Boolean a;
  private Thread b;
  private final BlockingQueue<g> c = new ArrayBlockingQueue(500, true);
  private XlinkTcpService e;
  private OutputStream f;
  private XlinkUdpService g;
  private DatagramSocket h;

  private a()
  {
  }

  public static a a()
  {
    if (d == null)
      d = new a();
    return d;
  }

  private void a(String paramString)
  {
    MyLog.e(" Write", paramString);
  }

  private void e()
  {
    this.b = new Thread()
    {
      public void run()
      {
        a.a(a.this);
      }
    };
    this.b.setName("Packet Writer");
    this.b.setDaemon(true);
    this.a = Boolean.valueOf(false);
    this.b.start();
  }

  // ERROR //
  private void e(g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 76	io/xlink/wifi/sdk/tcp/a:a	Ljava/lang/Boolean;
    //   4: invokevirtual 85	java/lang/Boolean:booleanValue	()Z
    //   7: ifne +29 -> 36
    //   10: aload_0
    //   11: getfield 32	io/xlink/wifi/sdk/tcp/a:c	Ljava/util/concurrent/BlockingQueue;
    //   14: aload_1
    //   15: invokeinterface 91 2 0
    //   20: aload_0
    //   21: getfield 32	io/xlink/wifi/sdk/tcp/a:c	Ljava/util/concurrent/BlockingQueue;
    //   24: astore_3
    //   25: aload_3
    //   26: monitorenter
    //   27: aload_0
    //   28: getfield 32	io/xlink/wifi/sdk/tcp/a:c	Ljava/util/concurrent/BlockingQueue;
    //   31: invokevirtual 94	java/lang/Object:notifyAll	()V
    //   34: aload_3
    //   35: monitorexit
    //   36: return
    //   37: astore_2
    //   38: aload_2
    //   39: invokevirtual 97	java/lang/InterruptedException:printStackTrace	()V
    //   42: return
    //   43: astore 4
    //   45: aload_3
    //   46: monitorexit
    //   47: aload 4
    //   49: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   10	20	37	java/lang/InterruptedException
    //   27	36	43	finally
    //   45	47	43	finally
  }

  private g f()
  {
    g localg1 = null;
    while (!this.a.booleanValue())
    {
      localg1 = (g)this.c.poll();
      if (localg1 != null)
        break;
      try
      {
        synchronized (this.c)
        {
          this.c.wait();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
    g localg2 = null;
    if (localg1 != null)
      localg2 = localg1;
    return localg2;
  }

  private void g()
  {
    while (!this.a.booleanValue())
    {
      g localg = f();
      if (localg == null)
      {
        a("writePackets task null");
      }
      else
      {
        if ((localg.g() != null) && (localg.f() != null))
        {
          e.a(localg.f(), localg);
          localg.e();
        }
        d locald = localg.b();
        if (locald == null)
          a("writePackets EncodeBuffer null");
        else if (locald.a() == 2)
          c(localg);
        else if (locald.a() == 1)
          d(localg);
      }
    }
    a("write therad logout done:" + this.a);
  }

  public void a(XlinkTcpService paramXlinkTcpService, OutputStream paramOutputStream)
  {
    this.e = paramXlinkTcpService;
    this.f = paramOutputStream;
  }

  public void a(XlinkUdpService paramXlinkUdpService, DatagramSocket paramDatagramSocket)
  {
    this.g = paramXlinkUdpService;
    this.h = paramDatagramSocket;
  }

  public void a(g paramg)
  {
    e(paramg);
  }

  public void b()
  {
    while (true)
    {
      try
      {
        if (this.b == null)
        {
          e();
          return;
        }
        if (this.b.isAlive())
        {
          a("startup fail writerThread.isAlive() is true");
          continue;
        }
      }
      finally
      {
      }
      this.b.interrupt();
      this.b = null;
      e();
    }
  }

  public void b(final g paramg)
  {
    io.xlink.wifi.sdk.util.b.b(new Runnable()
    {
      public void run()
      {
        a.a(a.this, paramg);
      }
    });
  }

  public void c(g paramg)
  {
    if (this.f == null)
      return;
    try
    {
      a("TCP send :" + paramg.b());
      this.f.write(paramg.b().b.a());
      return;
    }
    catch (IOException localIOException)
    {
      XlinkTcpService.a().a(true, -1, true);
    }
  }

  public boolean c()
  {
    return (this.b != null) && (this.b.isAlive());
  }

  public void d()
  {
    this.b = null;
    this.a = Boolean.valueOf(true);
    synchronized (this.c)
    {
      this.c.notifyAll();
      this.c.clear();
      return;
    }
  }

  public void d(g paramg)
  {
    if ((this.h == null) || (paramg == null));
    while (true)
    {
      return;
      d locald = paramg.b();
      DatagramPacket localDatagramPacket = new DatagramPacket(locald.b.a(), locald.b.a().length);
      localDatagramPacket.setAddress(locald.d());
      localDatagramPacket.setPort(locald.c());
      String str = "";
      if (paramg.a() != null)
        str = paramg.a().toString();
      a("udp sendData device:" + str + " len :" + localDatagramPacket.getLength() + " type:" + locald.e() + " addr:" + locald.d());
      try
      {
        this.h.send(localDatagramPacket);
        int i = locald.e();
        if (i == 8)
          try
          {
            Thread.sleep(100L);
            return;
          }
          catch (InterruptedException localInterruptedException)
          {
            localInterruptedException.printStackTrace();
            return;
          }
      }
      catch (IOException localIOException)
      {
        a("udp socket error");
        XlinkUdpService.b().a(true, -1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.tcp.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */