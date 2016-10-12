package io.xlink.wifi.sdk;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.IBinder;
import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.encoder.f;
import io.xlink.wifi.sdk.encoder.g;
import io.xlink.wifi.sdk.util.MyLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

public class XlinkTcpService extends Service
{
  public static int a;
  public static String b;
  public static boolean d = false;
  public static int j;
  private static XlinkTcpService l;
  private static String p = io.xlink.wifi.sdk.util.b.a.getPackageName() + "-tcp-keep";
  private static String q = io.xlink.wifi.sdk.util.b.a.getPackageName() + "-tcp-reconnect";
  public io.xlink.wifi.sdk.tcp.b c;
  public int e = 0;
  public long f;
  public final Timer g = new Timer();
  int h = 0;
  boolean i = false;
  private final String k = "TCPService";
  private Socket m;
  private boolean n;
  private boolean o;
  private boolean r = false;
  private BroadcastReceiver s = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      boolean bool1 = false;
      String str = paramAnonymousIntent.getAction();
      MyLog.e("TCPService", "TCP mReceiver " + new Date() + "  " + System.currentTimeMillis());
      if (str.equals(XlinkTcpService.e()))
        if (!XlinkTcpService.c())
        {
          XlinkTcpService.a(XlinkTcpService.this);
          XlinkTcpService.a(XlinkTcpService.this, "tcp !isConnected stopKeepAlive ");
        }
      do
      {
        long l2;
        do
        {
          return;
          long l1 = (System.currentTimeMillis() - XlinkTcpService.this.f) / 1000L;
          if (XlinkTcpService.this.e > 3)
          {
            XlinkTcpService.a(XlinkTcpService.this, "tcp 3次心跳超时" + l1 + " cloud service 3 times not response ping app logout ");
            XlinkTcpService.a(XlinkTcpService.this);
            XlinkTcpService.this.a(true, -2, true);
            return;
          }
          l2 = System.currentTimeMillis() - XlinkTcpService.this.f;
        }
        while ((XlinkTcpService.this.e == 0) && (l2 < 1000 * (-3 + io.xlink.wifi.sdk.global.a.e / 2)));
        XlinkTcpService localXlinkTcpService = XlinkTcpService.this;
        localXlinkTcpService.e = (1 + localXlinkTcpService.e);
        io.xlink.wifi.sdk.tcp.b.a = 0;
        g localg = io.xlink.wifi.sdk.tcp.c.a().b();
        XlinkTcpService.this.a(localg);
        XlinkTcpService.a(XlinkTcpService.this, "tcp send keep alive packet ");
        XlinkTcpService.this.f = System.currentTimeMillis();
        return;
        if (str.equals(XlinkTcpService.f()))
        {
          XlinkTcpService.b(XlinkTcpService.this);
          return;
        }
      }
      while (!paramAnonymousIntent.getAction().equals("android.intent.action.TIME_TICK"));
      Iterator localIterator = ((ActivityManager)io.xlink.wifi.sdk.util.b.a.getSystemService("activity")).getRunningServices(2147483647).iterator();
      label317: if (localIterator.hasNext())
        if (!"io.xlink.wifi.sdk.XlinkTcpService".equals(((ActivityManager.RunningServiceInfo)localIterator.next()).service.getClassName()))
          break label415;
      label415: for (boolean bool2 = true; ; bool2 = bool1)
      {
        bool1 = bool2;
        break label317;
        XlinkTcpService.a(XlinkTcpService.this, "tcp isServiceRunning:" + bool1);
        if (bool1)
          break;
        paramAnonymousContext.startService(new Intent(paramAnonymousContext, XlinkTcpService.class));
        XlinkTcpService.a(XlinkTcpService.this, "tcp RestartService...");
        return;
      }
    }
  };
  private TimerTask t;
  private InputStream u;
  private OutputStream v;
  private InetAddress w;

  public XlinkTcpService()
  {
  }

  public static XlinkTcpService a()
  {
    return l;
  }

  private void a(String paramString)
  {
    MyLog.e("TCPService", paramString);
  }

  private void a(Socket paramSocket)
    throws IOException
  {
    int i1 = 1;
    if (this.c == null);
    while (true)
    {
      try
      {
        this.u = paramSocket.getInputStream();
        this.v = paramSocket.getOutputStream();
        if (i1 != 0)
          this.c = new io.xlink.wifi.sdk.tcp.b(this, this.u);
        while (true)
        {
          if (!io.xlink.wifi.sdk.tcp.a.a().c())
            io.xlink.wifi.sdk.tcp.a.a().b();
          io.xlink.wifi.sdk.tcp.a.a().a(this, this.v);
          this.c.a();
          this.n = true;
          if ((io.xlink.wifi.sdk.global.a.i != 3) && (j != 3))
            break;
          a("send http prot head");
          local7 = new io.xlink.wifi.sdk.event.a()
          {
            public void onResponse(e paramAnonymouse)
            {
              if (paramAnonymouse.b == 0)
              {
                XlinkTcpService.a(XlinkTcpService.this, "http prot head succeed  send login packet");
                XlinkTcpService.g(XlinkTcpService.this);
                return;
              }
              XlinkTcpService.a(XlinkTcpService.this, "http prot head timeout  connect tcp error");
              XlinkTcpService.b(XlinkTcpService.this, false);
              io.xlink.wifi.sdk.event.c.a(5, -1);
              XlinkTcpService.this.a(false, -1, true);
            }
          };
          localg = new g(f.a().a(local7), local7, 3);
          io.xlink.wifi.sdk.tcp.a.a().a(localg);
          this.h = 0;
          return;
          this.c.a(this.u);
        }
      }
      catch (IOException localIOException)
      {
        if (this.c == null)
          break label181;
      }
      try
      {
        while (true)
        {
          io.xlink.wifi.sdk.event.a local7;
          g localg;
          this.c.b();
          label176: this.c = null;
          if (this.u != null)
            try
            {
              this.u.close();
              this.u = null;
              if (this.v != null)
                try
                {
                  this.v.close();
                  this.v = null;
                  if (paramSocket != null);
                  try
                  {
                    paramSocket.close();
                    this.n = false;
                    throw localIOException;
                    l();
                  }
                  catch (Exception localException)
                  {
                    break label227;
                  }
                }
                catch (Throwable localThrowable1)
                {
                  break label214;
                }
            }
            catch (Throwable localThrowable2)
            {
              break label195;
            }
        }
      }
      catch (Throwable localThrowable3)
      {
        break label176;
      }
      label181: label195: label214: label227: i1 = 0;
    }
  }

  public static boolean c()
  {
    if (a() == null)
      return false;
    return a().b();
  }

  private void g()
  {
    this.h = (1 + this.h);
    if (this.h > 2)
    {
      this.h = 0;
      return;
    }
    a("start reconnect tcp server");
    this.i = false;
    this.g.schedule(new TimerTask()
    {
      public void run()
      {
        if (XlinkTcpService.this.i)
          return;
        XlinkTcpService.b(XlinkTcpService.this);
      }
    }
    , 10000L);
  }

  private void h()
  {
    if (this.t != null)
    {
      this.t.cancel();
      this.g.purge();
      this.t = null;
    }
    this.r = false;
  }

  private void i()
  {
    this.i = true;
  }

  private void j()
  {
    if (d)
    {
      a("connectInSSL ，return...connecting is true");
      return;
    }
    if (c())
    {
      a("connectInSSL---return isConnected is true");
      return;
    }
    new Thread()
    {
      public void run()
      {
        super.run();
        if (XlinkTcpService.c())
        {
          XlinkTcpService.a(XlinkTcpService.this, "isConnected is true  --return connectInSSL()");
          return;
        }
        try
        {
          if (XlinkTcpService.c(XlinkTcpService.this) == null)
            XlinkTcpService.a(XlinkTcpService.this, InetAddress.getByName(io.xlink.wifi.sdk.global.a.a));
          SSLContext localSSLContext = SSLContext.getInstance("SSL");
          KeyStore localKeyStore1 = KeyStore.getInstance("BKS");
          InputStream localInputStream1 = XlinkTcpService.this.getResources().getAssets().open("xlink_kclient.bks");
          InputStream localInputStream2 = XlinkTcpService.this.getResources().getAssets().open("xlink_tclient.bks");
          localKeyStore1.load(localInputStream1, "123456".toCharArray());
          KeyStore localKeyStore2 = KeyStore.getInstance("BKS");
          localKeyStore2.load(localInputStream2, "123456".toCharArray());
          KeyManagerFactory localKeyManagerFactory = KeyManagerFactory.getInstance("X509");
          localKeyManagerFactory.init(localKeyStore1, "123456".toCharArray());
          TrustManagerFactory localTrustManagerFactory = TrustManagerFactory.getInstance("X509");
          localTrustManagerFactory.init(localKeyStore2);
          localSSLContext.init(localKeyManagerFactory.getKeyManagers(), localTrustManagerFactory.getTrustManagers(), null);
          XlinkTcpService.a(XlinkTcpService.this, "SSLContext initialize succeed");
          SSLSocketFactory localSSLSocketFactory = localSSLContext.getSocketFactory();
          XlinkTcpService.a(XlinkTcpService.this, (SSLSocket)localSSLSocketFactory.createSocket(XlinkTcpService.c(XlinkTcpService.this), io.xlink.wifi.sdk.global.a.c));
          XlinkTcpService.b(XlinkTcpService.this, XlinkTcpService.d(XlinkTcpService.this));
          return;
        }
        catch (UnknownHostException localUnknownHostException)
        {
          XlinkTcpService.e(XlinkTcpService.this);
          XlinkTcpService.d = false;
          XlinkTcpService.a(XlinkTcpService.this, "UnknownHostException connect SSL tcp error...");
          io.xlink.wifi.sdk.event.c.a(5, -1);
          return;
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
          XlinkTcpService.e(XlinkTcpService.this);
          XlinkTcpService.d = false;
          XlinkTcpService.a(XlinkTcpService.this, "connect SSL tcp IOException...");
          io.xlink.wifi.sdk.event.c.a(5, -1);
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
          XlinkTcpService.e(XlinkTcpService.this);
          XlinkTcpService.d = false;
          XlinkTcpService.a(XlinkTcpService.this, "connect SSL tcp Exception...");
          io.xlink.wifi.sdk.event.c.a(5, -1);
          return;
        }
        finally
        {
          XlinkTcpService.d = false;
        }
      }
    }
    .start();
    d = true;
    a("cloud connectSSL main thread done");
  }

  private void k()
  {
    if (d)
    {
      a("connecting is true  intercept connect() method");
      return;
    }
    if (c())
    {
      a("isConnected is true  intercept connect() method");
      return;
    }
    if (!io.xlink.wifi.sdk.manage.a.a().d())
    {
      a("connect tcp  network is not available");
      io.xlink.wifi.sdk.event.c.a(5, -2);
      return;
    }
    i();
    d = true;
    new Thread()
    {
      // ERROR //
      public void run()
      {
        // Byte code:
        //   0: aload_0
        //   1: invokespecial 26	java/lang/Thread:run	()V
        //   4: invokestatic 30	io/xlink/wifi/sdk/XlinkTcpService:c	()Z
        //   7: ifeq +13 -> 20
        //   10: aload_0
        //   11: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   14: ldc 32
        //   16: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   19: return
        //   20: aload_0
        //   21: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   24: invokestatic 39	io/xlink/wifi/sdk/XlinkTcpService:f	(Lio/xlink/wifi/sdk/XlinkTcpService;)Z
        //   27: ifeq +26 -> 53
        //   30: getstatic 42	io/xlink/wifi/sdk/XlinkTcpService:a	I
        //   33: ifeq +20 -> 53
        //   36: aload_0
        //   37: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   40: ldc 44
        //   42: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   45: aload_0
        //   46: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   49: invokestatic 47	io/xlink/wifi/sdk/XlinkTcpService:g	(Lio/xlink/wifi/sdk/XlinkTcpService;)V
        //   52: return
        //   53: aload_0
        //   54: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   57: new 49	java/lang/StringBuilder
        //   60: dup
        //   61: invokespecial 50	java/lang/StringBuilder:<init>	()V
        //   64: ldc 52
        //   66: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   69: getstatic 61	io/xlink/wifi/sdk/global/a:a	Ljava/lang/String;
        //   72: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   75: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   78: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   81: aload_0
        //   82: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   85: invokestatic 68	io/xlink/wifi/sdk/XlinkTcpService:c	(Lio/xlink/wifi/sdk/XlinkTcpService;)Ljava/net/InetAddress;
        //   88: ifnonnull +37 -> 125
        //   91: new 70	io/xlink/wifi/sdk/util/a
        //   94: dup
        //   95: getstatic 61	io/xlink/wifi/sdk/global/a:a	Ljava/lang/String;
        //   98: invokespecial 73	io/xlink/wifi/sdk/util/a:<init>	(Ljava/lang/String;)V
        //   101: astore_3
        //   102: aload_3
        //   103: invokevirtual 76	io/xlink/wifi/sdk/util/a:start	()V
        //   106: aload_3
        //   107: ldc2_w 77
        //   110: invokevirtual 82	io/xlink/wifi/sdk/util/a:join	(J)V
        //   113: aload_0
        //   114: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   117: aload_3
        //   118: invokevirtual 85	io/xlink/wifi/sdk/util/a:a	()Ljava/net/InetAddress;
        //   121: invokestatic 88	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/net/InetAddress;)Ljava/net/InetAddress;
        //   124: pop
        //   125: aload_0
        //   126: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   129: invokestatic 68	io/xlink/wifi/sdk/XlinkTcpService:c	(Lio/xlink/wifi/sdk/XlinkTcpService;)Ljava/net/InetAddress;
        //   132: ifnonnull +123 -> 255
        //   135: new 20	java/net/UnknownHostException
        //   138: dup
        //   139: new 49	java/lang/StringBuilder
        //   142: dup
        //   143: invokespecial 50	java/lang/StringBuilder:<init>	()V
        //   146: ldc 90
        //   148: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: getstatic 61	io/xlink/wifi/sdk/global/a:a	Ljava/lang/String;
        //   154: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   157: ldc 92
        //   159: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   162: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   165: invokespecial 93	java/net/UnknownHostException:<init>	(Ljava/lang/String;)V
        //   168: athrow
        //   169: astore_2
        //   170: iconst_0
        //   171: putstatic 97	io/xlink/wifi/sdk/XlinkTcpService:d	Z
        //   174: aload_0
        //   175: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   178: ldc 99
        //   180: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   183: iconst_5
        //   184: iconst_m1
        //   185: invokestatic 104	io/xlink/wifi/sdk/event/c:a	(II)V
        //   188: aload_0
        //   189: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   192: invokestatic 107	io/xlink/wifi/sdk/XlinkTcpService:e	(Lio/xlink/wifi/sdk/XlinkTcpService;)V
        //   195: return
        //   196: astore 4
        //   198: aload 4
        //   200: invokevirtual 110	java/lang/InterruptedException:printStackTrace	()V
        //   203: goto -90 -> 113
        //   206: astore_1
        //   207: aload_0
        //   208: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   211: ldc 112
        //   213: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   216: getstatic 115	io/xlink/wifi/sdk/global/a:i	I
        //   219: iconst_1
        //   220: if_icmpne +285 -> 505
        //   223: iconst_0
        //   224: putstatic 97	io/xlink/wifi/sdk/XlinkTcpService:d	Z
        //   227: getstatic 118	io/xlink/wifi/sdk/XlinkTcpService:j	I
        //   230: iconst_1
        //   231: if_icmpne +220 -> 451
        //   234: aload_0
        //   235: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   238: ldc 120
        //   240: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   243: iconst_3
        //   244: putstatic 118	io/xlink/wifi/sdk/XlinkTcpService:j	I
        //   247: aload_0
        //   248: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   251: invokestatic 123	io/xlink/wifi/sdk/XlinkTcpService:b	(Lio/xlink/wifi/sdk/XlinkTcpService;)V
        //   254: return
        //   255: aload_0
        //   256: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   259: new 125	java/net/Socket
        //   262: dup
        //   263: invokespecial 126	java/net/Socket:<init>	()V
        //   266: invokestatic 129	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/net/Socket;)Ljava/net/Socket;
        //   269: pop
        //   270: getstatic 115	io/xlink/wifi/sdk/global/a:i	I
        //   273: iconst_3
        //   274: if_icmpeq +10 -> 284
        //   277: getstatic 118	io/xlink/wifi/sdk/XlinkTcpService:j	I
        //   280: iconst_3
        //   281: if_icmpne +97 -> 378
        //   284: aload_0
        //   285: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   288: new 49	java/lang/StringBuilder
        //   291: dup
        //   292: invokespecial 50	java/lang/StringBuilder:<init>	()V
        //   295: ldc 131
        //   297: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   300: aload_0
        //   301: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   304: invokestatic 68	io/xlink/wifi/sdk/XlinkTcpService:c	(Lio/xlink/wifi/sdk/XlinkTcpService;)Ljava/net/InetAddress;
        //   307: invokevirtual 134	java/net/InetAddress:toString	()Ljava/lang/String;
        //   310: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   313: ldc 136
        //   315: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   318: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   321: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   324: aload_0
        //   325: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   328: invokestatic 139	io/xlink/wifi/sdk/XlinkTcpService:d	(Lio/xlink/wifi/sdk/XlinkTcpService;)Ljava/net/Socket;
        //   331: new 141	java/net/InetSocketAddress
        //   334: dup
        //   335: aload_0
        //   336: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   339: invokestatic 68	io/xlink/wifi/sdk/XlinkTcpService:c	(Lio/xlink/wifi/sdk/XlinkTcpService;)Ljava/net/InetAddress;
        //   342: getstatic 143	io/xlink/wifi/sdk/global/a:d	I
        //   345: invokespecial 146	java/net/InetSocketAddress:<init>	(Ljava/net/InetAddress;I)V
        //   348: sipush 8000
        //   351: invokevirtual 150	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
        //   354: aload_0
        //   355: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   358: aload_0
        //   359: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   362: invokestatic 139	io/xlink/wifi/sdk/XlinkTcpService:d	(Lio/xlink/wifi/sdk/XlinkTcpService;)Ljava/net/Socket;
        //   365: invokestatic 153	io/xlink/wifi/sdk/XlinkTcpService:b	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/net/Socket;)V
        //   368: aload_0
        //   369: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   372: ldc 155
        //   374: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   377: return
        //   378: aload_0
        //   379: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   382: new 49	java/lang/StringBuilder
        //   385: dup
        //   386: invokespecial 50	java/lang/StringBuilder:<init>	()V
        //   389: ldc 131
        //   391: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   394: aload_0
        //   395: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   398: invokestatic 68	io/xlink/wifi/sdk/XlinkTcpService:c	(Lio/xlink/wifi/sdk/XlinkTcpService;)Ljava/net/InetAddress;
        //   401: invokevirtual 134	java/net/InetAddress:toString	()Ljava/lang/String;
        //   404: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   407: ldc 157
        //   409: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   412: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   415: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   418: aload_0
        //   419: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   422: invokestatic 139	io/xlink/wifi/sdk/XlinkTcpService:d	(Lio/xlink/wifi/sdk/XlinkTcpService;)Ljava/net/Socket;
        //   425: new 141	java/net/InetSocketAddress
        //   428: dup
        //   429: aload_0
        //   430: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   433: invokestatic 68	io/xlink/wifi/sdk/XlinkTcpService:c	(Lio/xlink/wifi/sdk/XlinkTcpService;)Ljava/net/InetAddress;
        //   436: getstatic 159	io/xlink/wifi/sdk/global/a:b	I
        //   439: invokespecial 146	java/net/InetSocketAddress:<init>	(Ljava/net/InetAddress;I)V
        //   442: sipush 8000
        //   445: invokevirtual 150	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
        //   448: goto -94 -> 354
        //   451: getstatic 118	io/xlink/wifi/sdk/XlinkTcpService:j	I
        //   454: iconst_3
        //   455: if_icmpne +24 -> 479
        //   458: aload_0
        //   459: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   462: ldc 161
        //   464: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   467: iconst_4
        //   468: putstatic 118	io/xlink/wifi/sdk/XlinkTcpService:j	I
        //   471: aload_0
        //   472: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   475: invokestatic 164	io/xlink/wifi/sdk/XlinkTcpService:h	(Lio/xlink/wifi/sdk/XlinkTcpService;)V
        //   478: return
        //   479: aload_0
        //   480: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   483: invokestatic 107	io/xlink/wifi/sdk/XlinkTcpService:e	(Lio/xlink/wifi/sdk/XlinkTcpService;)V
        //   486: iconst_0
        //   487: putstatic 97	io/xlink/wifi/sdk/XlinkTcpService:d	Z
        //   490: aload_0
        //   491: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   494: ldc 112
        //   496: invokestatic 35	io/xlink/wifi/sdk/XlinkTcpService:a	(Lio/xlink/wifi/sdk/XlinkTcpService;Ljava/lang/String;)V
        //   499: iconst_5
        //   500: iconst_m1
        //   501: invokestatic 104	io/xlink/wifi/sdk/event/c:a	(II)V
        //   504: return
        //   505: iconst_0
        //   506: putstatic 97	io/xlink/wifi/sdk/XlinkTcpService:d	Z
        //   509: aload_0
        //   510: getfield 15	io/xlink/wifi/sdk/XlinkTcpService$5:a	Lio/xlink/wifi/sdk/XlinkTcpService;
        //   513: invokestatic 107	io/xlink/wifi/sdk/XlinkTcpService:e	(Lio/xlink/wifi/sdk/XlinkTcpService;)V
        //   516: iconst_5
        //   517: iconst_m1
        //   518: invokestatic 104	io/xlink/wifi/sdk/event/c:a	(II)V
        //   521: return
        //
        // Exception table:
        //   from	to	target	type
        //   53	106	169	java/net/UnknownHostException
        //   106	113	169	java/net/UnknownHostException
        //   113	125	169	java/net/UnknownHostException
        //   125	169	169	java/net/UnknownHostException
        //   198	203	169	java/net/UnknownHostException
        //   255	284	169	java/net/UnknownHostException
        //   284	354	169	java/net/UnknownHostException
        //   354	377	169	java/net/UnknownHostException
        //   378	448	169	java/net/UnknownHostException
        //   106	113	196	java/lang/InterruptedException
        //   53	106	206	java/io/IOException
        //   106	113	206	java/io/IOException
        //   113	125	206	java/io/IOException
        //   125	169	206	java/io/IOException
        //   198	203	206	java/io/IOException
        //   255	284	206	java/io/IOException
        //   284	354	206	java/io/IOException
        //   354	377	206	java/io/IOException
        //   378	448	206	java/io/IOException
      }
    }
    .start();
    a("connect tcp main thread done.");
  }

  private void l()
  {
    io.xlink.wifi.sdk.tcp.c.a().a(a, b, new io.xlink.wifi.sdk.event.a()
    {
      public void onResponse(e paramAnonymouse)
      {
        XlinkTcpService.d = false;
        switch (paramAnonymouse.b)
        {
        default:
          XlinkTcpService.a(XlinkTcpService.this, "login fail code ::" + paramAnonymouse.b);
          io.xlink.wifi.sdk.event.c.a(5, paramAnonymouse.b);
          return;
        case 0:
          XlinkTcpService.a(XlinkTcpService.this, "login - - connect tcp succeed");
          XlinkTcpService.a(XlinkTcpService.this, true);
          io.xlink.wifi.sdk.event.c.a(4, 0);
          XlinkTcpService.this.d();
          return;
        case -100:
        }
        XlinkTcpService.a(XlinkTcpService.this, "login fail service not response packet timeout ! ");
        XlinkTcpService.e(XlinkTcpService.this);
        io.xlink.wifi.sdk.event.c.a(5, -100);
      }
    }
    , 6);
  }

  public void a(g paramg)
  {
    io.xlink.wifi.sdk.tcp.a.a().b(paramg);
  }

  public void a(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    this.e = 0;
    if (!this.o)
      paramBoolean1 = false;
    this.o = false;
    if (this.n)
    {
      this.n = false;
      a("disconnect shutdown isDispatch :" + paramBoolean1 + " code :" + paramInt);
      if (this.c != null)
        this.c.b();
      if (this.u != null)
        try
        {
          this.u.close();
          label93: this.u = null;
          if (this.v != null)
            try
            {
              this.v.close();
              this.v = null;
              try
              {
                this.m.close();
                if (paramBoolean1)
                {
                  if (paramBoolean2)
                    g();
                  a("dispatch NetEvent cloud disconnect");
                  io.xlink.wifi.sdk.event.c.a(6, paramInt);
                }
                return;
              }
              catch (Exception localException)
              {
                break label124;
              }
            }
            catch (Throwable localThrowable1)
            {
              break label112;
            }
        }
        catch (Throwable localThrowable2)
        {
          break label93;
        }
    }
  }

  public boolean b()
  {
    return (this.n) && (this.o) && (a != 0);
  }

  public void d()
  {
    MyLog.e("TCPService", "cloud start KeepAlive ");
    if (System.currentTimeMillis() - this.f > 1000 * io.xlink.wifi.sdk.global.a.e)
      this.r = false;
    if (this.r)
      return;
    this.f = System.currentTimeMillis();
    int i1 = -2 + io.xlink.wifi.sdk.global.a.e / 3;
    if (this.t != null)
    {
      this.t.cancel();
      this.t = null;
    }
    this.t = new TimerTask()
    {
      public void run()
      {
        if (!XlinkTcpService.c())
        {
          XlinkTcpService.a(XlinkTcpService.this);
          XlinkTcpService.a(XlinkTcpService.this, "tcp !isConnected stopKeepAlive ");
          return;
        }
        long l = (System.currentTimeMillis() - XlinkTcpService.this.f) / 1000L;
        if (XlinkTcpService.this.e > 3)
        {
          XlinkTcpService.a(XlinkTcpService.this, "tcp 3次心跳超时" + l + " cloud service 3 times not response ping app logout ");
          XlinkTcpService.a(XlinkTcpService.this);
          XlinkTcpService.this.a(true, -2, true);
          return;
        }
        (System.currentTimeMillis() - XlinkTcpService.this.f);
        XlinkTcpService localXlinkTcpService = XlinkTcpService.this;
        localXlinkTcpService.e = (1 + localXlinkTcpService.e);
        io.xlink.wifi.sdk.tcp.b.a = 0;
        g localg = io.xlink.wifi.sdk.tcp.c.a().b();
        XlinkTcpService.this.a(localg);
        XlinkTcpService.a(XlinkTcpService.this, "tcp send keep alive packet ");
        XlinkTcpService.this.f = System.currentTimeMillis();
      }
    };
    this.g.schedule(this.t, i1 * 1000, i1 * 1000);
    this.r = true;
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    a("Xlink Tcp Service onCreate! ");
    l = this;
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction(p);
    localIntentFilter.addAction(q);
    localIntentFilter.addAction("android.intent.action.TIME_TICK");
    registerReceiver(this.s, localIntentFilter);
  }

  public void onDestroy()
  {
    unregisterReceiver(this.s);
    a("XlinkTcpService onDestroy! ");
    io.xlink.wifi.sdk.event.c.a("XTService");
    a(true, -3, false);
    i();
    startService(new Intent(this, XlinkTcpService.class));
    a("tcp RestartService... on onDestroy");
    super.onDestroy();
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    a("onStart service statue:" + c());
    if ((a == 0) || (b == null))
    {
      a("appid ==0 ||keys==null return onStartCommand");
      return 2;
    }
    if (!c())
    {
      j = io.xlink.wifi.sdk.global.a.i;
      switch (io.xlink.wifi.sdk.global.a.i)
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      return 1;
      k();
      continue;
      k();
      continue;
      k();
      continue;
      j();
      continue;
      a("onStart do login succeed ");
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkTcpService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */