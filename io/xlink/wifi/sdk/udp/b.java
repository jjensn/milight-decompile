package io.xlink.wifi.sdk.udp;

import io.xlink.wifi.sdk.DataPoint;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkUdpService;
import io.xlink.wifi.sdk.encoder.d;
import io.xlink.wifi.sdk.encoder.f;
import io.xlink.wifi.sdk.encoder.g;
import io.xlink.wifi.sdk.event.a;
import io.xlink.wifi.sdk.listener.SendPipeListener;
import io.xlink.wifi.sdk.listener.SetDataPointListener;
import io.xlink.wifi.sdk.listener.SetDeviceAccessKeyListener;

public class b
{
  private static b a;

  public b()
  {
  }

  public static b a()
  {
    if (a == null)
      a = new b();
    return a;
  }

  public int a(XDevice paramXDevice, byte paramByte, byte[] paramArrayOfByte, SendPipeListener paramSendPipeListener)
  {
    d locald = f.a().a(paramXDevice, paramByte, paramArrayOfByte);
    g localg = new g(locald, paramSendPipeListener);
    XlinkUdpService.b().a(localg);
    return locald.g();
  }

  public int a(XDevice paramXDevice, int paramInt, SetDeviceAccessKeyListener paramSetDeviceAccessKeyListener)
  {
    d locald = f.a().b(paramXDevice, paramInt);
    g localg = new g(locald, paramSetDeviceAccessKeyListener);
    XlinkUdpService.b().a(localg);
    return locald.g();
  }

  public int a(XDevice paramXDevice, DataPoint paramDataPoint, SetDataPointListener paramSetDataPointListener)
  {
    d locald = f.a().a(paramXDevice, paramDataPoint);
    g localg = new g(locald, paramSetDataPointListener);
    XlinkUdpService.b().a(localg);
    return locald.g();
  }

  public int a(XDevice paramXDevice, String paramString1, String paramString2, SetDeviceAccessKeyListener paramSetDeviceAccessKeyListener)
  {
    d locald = f.a().a(paramXDevice, paramString1, paramString2);
    g localg = new g(locald, paramSetDeviceAccessKeyListener);
    XlinkUdpService.b().a(localg);
    return locald.g();
  }

  public void a(XDevice paramXDevice)
  {
    g localg = new g(f.a().b(paramXDevice));
    XlinkUdpService.b().a(localg);
  }

  public void a(XDevice paramXDevice, int paramInt1, io.xlink.wifi.sdk.event.b paramb, int paramInt2)
  {
    g localg = new g(f.a().a(paramXDevice, paramInt1), paramb, paramInt2);
    XlinkUdpService.b().a(localg);
  }

  public void a(XDevice paramXDevice, a parama)
  {
    d locald = f.a().a(1, paramXDevice.getMacAddress());
    g localg = new g(locald, parama, 2);
    locald.a(paramXDevice);
    localg.a(paramXDevice.getMacAddress() + 1);
    XlinkUdpService.b().a(localg);
  }

  public void a(XDevice paramXDevice, String paramString, io.xlink.wifi.sdk.event.b paramb, int paramInt)
  {
    g localg = new g(f.a().a(paramXDevice, paramString), paramb, paramInt);
    XlinkUdpService.b().a(localg);
  }

  public void a(String paramString)
  {
    d locald = f.a().a(2, paramString);
    locald.a = true;
    g localg = new g(locald);
    XlinkUdpService.b().a(localg);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.udp.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */