package io.xlink.wifi.sdk.tcp;

import io.xlink.wifi.sdk.XlinkAgent;
import io.xlink.wifi.sdk.XlinkTcpService;
import io.xlink.wifi.sdk.decoder.c;
import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.encoder.g;
import io.xlink.wifi.sdk.util.MyLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class b
{
  public static int a = 0;
  private Thread b;
  private XlinkTcpService c;
  private InputStream d;
  private boolean e;

  public b(XlinkTcpService paramXlinkTcpService, InputStream paramInputStream)
  {
    this.c = paramXlinkTcpService;
    a(paramInputStream);
  }

  private void a(String paramString)
  {
    MyLog.e("TCPreader", paramString);
  }

  private void a(Thread paramThread)
  {
    try
    {
      a("read thread  isdone: " + this.e);
      if ((!this.e) && (paramThread == this.b) && (this.d != null))
      {
        arrayOfByte1 = new byte[5];
        if (this.d.read(arrayOfByte1, 0, 5) < 0)
        {
          a("tcp read ret <0  break");
          if (XlinkAgent.getInstance().a)
            return;
          this.c.a(true, -4, false);
        }
      }
      else
      {
        a("read Thread break logout...");
        if (this.e)
          return;
        this.c.a(true, -1, true);
        return;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        byte[] arrayOfByte1;
        a("tcp socket read  error:" + localIOException.getMessage());
        if (this.e)
          break;
        this.e = true;
        this.c.a(true, -1, true);
        return;
        if ((io.xlink.wifi.sdk.global.a.i == 3) || (XlinkTcpService.j == 3))
        {
          String str = io.xlink.wifi.sdk.util.b.c(arrayOfByte1);
          if ((str.contains("HTTP")) || (str.contains("http")))
          {
            int i = this.d.available();
            a(this.d, i);
            g localg = e.a(999);
            if (localg == null)
              continue;
            localg.c();
            e locale = new e(0);
            localg.g().onResponse(locale);
          }
        }
        else
        {
          int j = io.xlink.wifi.sdk.util.b.a(arrayOfByte1[0]);
          if ((j > 0) && (j < 16))
          {
            a = 0;
            io.xlink.wifi.sdk.decoder.b localb = new io.xlink.wifi.sdk.decoder.b(arrayOfByte1);
            if ((localb.a() < 10240) && (localb.a() > 0))
            {
              byte[] arrayOfByte2 = new byte[localb.a()];
              this.d.read(arrayOfByte2, 0, localb.a());
              io.xlink.wifi.sdk.decoder.a locala = new io.xlink.wifi.sdk.decoder.a(new io.xlink.wifi.sdk.buffer.a(arrayOfByte2, 0), localb);
              c.a().a(locala);
            }
            else if ((localb.c() == 13) && (localb.a() == 0))
            {
              this.c.e = 0;
              this.c.f = System.currentTimeMillis();
              a("Tcp refresh heartbeat time" + this.c.f);
            }
            else
            {
              a("read type =" + localb.c() + " But DataLength" + localb.a() + " error  !!untreated packet");
            }
          }
          else if (j == 0)
          {
            a("read type Length is 0 count =" + a);
            a = 1 + a;
            int k = a;
            if (k <= 100);
          }
        }
      }
    }
  }

  public static byte[] a(InputStream paramInputStream, long paramLong)
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[1024];
    int i = 0;
    while (true)
    {
      int j;
      if (i < paramLong)
      {
        j = paramInputStream.read(arrayOfByte, 0, (int)Math.min(1024L, paramLong - i));
        if (j > 0);
      }
      else
      {
        return localByteArrayOutputStream.toByteArray();
      }
      i += j;
      localByteArrayOutputStream.write(arrayOfByte, 0, j);
    }
  }

  public void a()
  {
    this.b.start();
  }

  public void a(InputStream paramInputStream)
  {
    this.d = paramInputStream;
    this.e = false;
    this.b = new Thread()
    {
      public void run()
      {
        b.a(b.this, this);
      }
    };
    this.b.setName("Tcp Packet Reader");
    this.b.setDaemon(true);
  }

  public void b()
  {
    this.e = true;
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.tcp.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */