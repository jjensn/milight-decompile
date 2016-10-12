package io.xlink.wifi.sdk.tcp;

import io.xlink.wifi.sdk.DataPoint;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkTcpService;
import io.xlink.wifi.sdk.encoder.d;
import io.xlink.wifi.sdk.encoder.f;
import io.xlink.wifi.sdk.encoder.g;
import io.xlink.wifi.sdk.listener.SendPipeListener;
import io.xlink.wifi.sdk.listener.SetDataPointListener;
import io.xlink.wifi.sdk.listener.SetDeviceAccessKeyListener;
import io.xlink.wifi.sdk.listener.SubscribeDeviceListener;
import io.xlink.wifi.sdk.util.b;

public class c
{
  private static c a;

  public c()
  {
  }

  public static c a()
  {
    if (a == null)
      a = new c();
    return a;
  }

  public int a(int paramInt1, byte paramByte, byte[] paramArrayOfByte, SendPipeListener paramSendPipeListener, int paramInt2)
  {
    d locald = f.a().a(paramInt1, paramByte, paramArrayOfByte, paramSendPipeListener, paramInt2);
    g localg = new g(locald, paramSendPipeListener);
    XlinkTcpService.a().a(localg);
    return locald.g();
  }

  public int a(XDevice paramXDevice, byte paramByte, byte[] paramArrayOfByte, SendPipeListener paramSendPipeListener, int paramInt)
  {
    d locald = f.a().a(paramXDevice, paramByte, paramArrayOfByte, paramSendPipeListener, paramInt);
    g localg = new g(locald, paramSendPipeListener);
    XlinkTcpService.a().a(localg);
    return locald.g();
  }

  public int a(XDevice paramXDevice, DataPoint paramDataPoint, SetDataPointListener paramSetDataPointListener)
  {
    d locald = f.a().b(paramXDevice, paramDataPoint);
    g localg = new g(locald, paramSetDataPointListener);
    XlinkTcpService.a().a(localg);
    return locald.g();
  }

  public int a(XDevice paramXDevice, String paramString1, String paramString2, SetDeviceAccessKeyListener paramSetDeviceAccessKeyListener, int paramInt)
  {
    d locald = f.a().b(paramXDevice, paramString1, paramString2);
    g localg = new g(locald, paramSetDeviceAccessKeyListener, paramInt);
    XlinkTcpService.a().a(localg);
    return locald.g();
  }

  public void a(int paramInt)
  {
    b.b(new Runnable()
    {
      public void run()
      {
        a.a().c(this.a);
      }
    });
  }

  public void a(int paramInt1, String paramString, io.xlink.wifi.sdk.event.a parama, int paramInt2)
  {
    d locald = f.a().b(paramInt1, paramString);
    locald.a("1");
    g localg = new g(locald, parama, paramInt2);
    a.a().a(localg);
  }

  public void a(XDevice paramXDevice, int paramInt1, io.xlink.wifi.sdk.event.a parama, int paramInt2)
  {
    g localg = new g(f.a().c(paramXDevice, paramInt1), parama, paramInt2);
    XlinkTcpService.a().a(localg);
  }

  public void a(XDevice paramXDevice, int paramInt, SubscribeDeviceListener paramSubscribeDeviceListener)
  {
    g localg = new g(f.a().a(paramXDevice, paramInt, true, paramSubscribeDeviceListener), paramSubscribeDeviceListener);
    XlinkTcpService.a().a(localg);
  }

  public void a(XDevice paramXDevice, String paramString, SubscribeDeviceListener paramSubscribeDeviceListener)
  {
    g localg = new g(f.a().a(paramXDevice, paramString, true, paramSubscribeDeviceListener), paramSubscribeDeviceListener);
    XlinkTcpService.a().a(localg);
  }

  public g b()
  {
    return new g(f.a().b());
  }

  public void b(XDevice paramXDevice, int paramInt, SubscribeDeviceListener paramSubscribeDeviceListener)
  {
    g localg = new g(f.a().a(paramXDevice, paramInt, false, paramSubscribeDeviceListener), paramSubscribeDeviceListener);
    XlinkTcpService.a().a(localg);
  }

  public void b(XDevice paramXDevice, String paramString, SubscribeDeviceListener paramSubscribeDeviceListener)
  {
    g localg = new g(f.a().a(paramXDevice, paramString, false, paramSubscribeDeviceListener), paramSubscribeDeviceListener);
    XlinkTcpService.a().a(localg);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.tcp.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */