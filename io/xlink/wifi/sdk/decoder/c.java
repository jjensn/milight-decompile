package io.xlink.wifi.sdk.decoder;

import android.util.SparseArray;
import io.xlink.wifi.sdk.DataPoint;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkTcpService;
import io.xlink.wifi.sdk.XlinkUdpService;
import io.xlink.wifi.sdk.bean.EventNotify;
import io.xlink.wifi.sdk.encoder.d;
import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.encoder.f;
import io.xlink.wifi.sdk.encoder.g;
import io.xlink.wifi.sdk.util.MyLog;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.ArrayList;

public class c
{
  private static String a = "Packet Decoder";

  private c()
  {
  }

  private SparseArray<DataPoint> a(XDevice paramXDevice, io.xlink.wifi.sdk.buffer.a parama)
  {
    int i = io.xlink.wifi.sdk.manage.b.a().a(paramXDevice.getProductId());
    SparseArray localSparseArray1 = io.xlink.wifi.sdk.manage.b.a().b(paramXDevice.getProductId());
    SparseArray localSparseArray2 = new SparseArray();
    if (i == 0)
      return localSparseArray2;
    if (localSparseArray1 == null)
    {
      a("parse datapoint error product not found pid:" + paramXDevice.getProductId() + " deviceId:" + paramXDevice.getDeviceId());
      return localSparseArray2;
    }
    ArrayList localArrayList = new ArrayList();
    byte[] arrayOfByte = parama.a(i);
    int m;
    for (int j = 0; ; j++)
    {
      int k = arrayOfByte.length;
      m = 0;
      if (j >= k)
        break;
      for (int n = 0; n <= 7; n++)
        if (io.xlink.wifi.sdk.util.b.a(arrayOfByte[j], n))
          localArrayList.add(Integer.valueOf(n + j * 8));
    }
    if (m < localArrayList.size())
    {
      DataPoint localDataPoint = (DataPoint)localSparseArray1.get(((Integer)localArrayList.get(m)).intValue());
      if (localDataPoint == null);
      while (true)
      {
        m++;
        break;
        Object localObject = f.a(parama, localDataPoint.getType());
        if (localObject != null)
        {
          localDataPoint.setValue(localObject);
          localSparseArray2.put(localDataPoint.getKey(), localDataPoint);
        }
      }
    }
    return localSparseArray2;
  }

  public static c a()
  {
    return a.a();
  }

  private void a(String paramString)
  {
    MyLog.e(a, paramString);
  }

  private void b(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    int i = locala.f();
    int j = locala.g();
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().a(i);
    g localg = e.a(j);
    int k = locala.d();
    if (localg == null)
      a("received probe packets  no task ");
    while ((k == 0) && (localXDevice != null))
    {
      byte b = locala.d();
      if (io.xlink.wifi.sdk.util.b.a(b, 0))
        localXDevice.setDeviceName(io.xlink.wifi.sdk.util.b.c(locala.a(locala.g())));
      if (!io.xlink.wifi.sdk.util.b.a(b, 1))
        break;
      SparseArray localSparseArray = a(localXDevice, locala);
      int m = localSparseArray.size();
      for (int n = 0; n < m; n++)
      {
        DataPoint localDataPoint = (DataPoint)localSparseArray.valueAt(n);
        io.xlink.wifi.sdk.event.c.a(localXDevice, localDataPoint.getKey(), localDataPoint.getObjectValue(), 1, localDataPoint.getType());
      }
      localg.c();
      e locale = new e(k);
      locale.a = localg.a();
      localg.g().onResponse(locale);
    }
  }

  private void c(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    locala.f();
    int i = locala.g();
    int j = locala.d();
    g localg = e.a(i);
    if (localg != null)
    {
      localg.c();
      e locale = new e(j);
      locale.a = localg.a();
      locale.c = i;
      localg.g().onResponse(locale);
    }
  }

  private void d(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    int i = locala.f();
    int j = locala.g();
    int k = locala.d();
    a("parse subscription deviceid:" + i + "  code：" + k);
    g localg = e.b(j + "");
    if (localg != null)
    {
      localg.c();
      e locale = e.b(k);
      locale.a = localg.b().b();
      if ((i > 0) && (k == 0))
        locale.a = io.xlink.wifi.sdk.a.a().b(locale.a, i);
      localg.g().onResponse(locale);
      return;
    }
    a("error:subscription task is null");
  }

  private void e(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    int i = locala.f();
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().a(i);
    if (localXDevice == null)
    {
      a("cloud sync fail deviceID =" + i + " device not found");
      return;
    }
    locala.g();
    byte b = locala.d();
    if (io.xlink.wifi.sdk.util.b.a(b, 0))
      localXDevice.setDeviceName(io.xlink.wifi.sdk.util.b.c(locala.a(locala.g())));
    if (io.xlink.wifi.sdk.util.b.a(b, 1))
    {
      SparseArray localSparseArray = a(localXDevice, locala);
      for (int j = 0; j < localSparseArray.size(); j++)
      {
        DataPoint localDataPoint = (DataPoint)localSparseArray.valueAt(j);
        io.xlink.wifi.sdk.event.c.a(localXDevice, localDataPoint.getKey(), localDataPoint.getObjectValue(), 1, localDataPoint.getType());
      }
    }
    a("cloud sync   device :" + localXDevice.getMacAddress());
  }

  private void f(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    locala.f();
    int i = locala.g();
    int j = locala.d();
    g localg = e.a(i);
    if (localg != null)
    {
      localg.c();
      e locale = e.b(j);
      locale.a = localg.b().b();
      locale.c = i;
      localg.g().onResponse(locale);
    }
    a("outer set  code :" + j);
  }

  private void g(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    int i = locala.d();
    locala.d();
    g localg = e.b("1");
    if (localg != null)
    {
      localg.c();
      localg.g().onResponse(e.b(i));
    }
    a("parse Login response  code :" + i);
  }

  private void h(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    locala.f();
    int i = locala.g();
    int j = locala.d();
    g localg = e.b(i + "");
    if (localg != null)
    {
      localg.c();
      e locale = e.b(j);
      locale.a = localg.b().b();
      locale.c = i;
      localg.g().onResponse(locale);
    }
    a("receive send Pipe response code :" + j);
  }

  private void i(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    int i = locala.f();
    locala.g();
    byte b = locala.d();
    byte[] arrayOfByte = locala.e();
    XDevice localXDevice1 = io.xlink.wifi.sdk.manage.c.a().a(i);
    if (localXDevice1 == null)
    {
      XDevice localXDevice2 = io.xlink.wifi.sdk.a.a().a("");
      localXDevice1 = io.xlink.wifi.sdk.a.a().b(localXDevice2, i);
    }
    io.xlink.wifi.sdk.event.c.a(false, localXDevice1, b, arrayOfByte);
    a("receive push pipe1 packet  deviceId :" + i + " dataLength :" + arrayOfByte.length);
  }

  private void j(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    int i = locala.f();
    locala.g();
    byte b = locala.d();
    byte[] arrayOfByte = locala.e();
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().a(i);
    if (localXDevice == null)
      return;
    io.xlink.wifi.sdk.event.c.a(true, localXDevice, b, arrayOfByte);
    a("receive push sync pipe2 packet  deviceId :" + i + " dataLength :" + arrayOfByte.length);
  }

  private void k(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    if (locala.d() == 10)
    {
      EventNotify localEventNotify = new EventNotify();
      localEventNotify.notyfyFlags = locala.d();
      localEventNotify.formId = locala.f();
      localEventNotify.messageId = locala.g();
      localEventNotify.messageType = locala.g();
      localEventNotify.notifyData = locala.e();
      io.xlink.wifi.sdk.event.c.a(localEventNotify);
      a("cloud event notify: " + localEventNotify.toString());
    }
  }

  private void l(a parama)
  {
    switch (parama.b().d())
    {
    default:
      return;
    case 3:
    }
    XlinkTcpService.a().a(true, -4, false);
  }

  private void m(a parama)
  {
    a("UDP read packet : " + parama.toString());
    if (((parama.c() != 1) || (parama.c() != 2) || (parama.c() != 9)) && (!XlinkUdpService.b().c()))
      XlinkUdpService.b().d();
    switch (parama.c())
    {
    case 6:
    case 7:
    case 10:
    case 12:
    default:
      a("Receive udp error type of package:" + parama);
      return;
    case 1:
      w(parama);
      return;
    case 2:
      v(parama);
      return;
    case 13:
      u(parama);
      return;
    case 3:
      r(parama);
      return;
    case 4:
      t(parama);
      return;
    case 5:
      s(parama);
      return;
    case 8:
      if (parama.d().d())
      {
        q(parama);
        return;
      }
      p(parama);
      return;
    case 9:
      o(parama);
      return;
    case 11:
    }
    n(parama);
  }

  private void n(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    int i = locala.g();
    int j = locala.d();
    g localg = e.a(i);
    if (localg == null)
    {
      a("receive setAccessKey  task not found ,code:" + j);
      return;
    }
    localg.c();
    e locale = e.b(j);
    locale.a = localg.b().b();
    if (locale.a != null)
    {
      XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(locale.a.getMacAddress());
      if (localXDevice != null);
      for (locale.a = io.xlink.wifi.sdk.a.a().a(true, localXDevice); ; locale.a = io.xlink.wifi.sdk.a.a().a(true, locale.a))
      {
        locale.a.setLocalAddress(parama.e());
        locale.c = i;
        localg.g().onResponse(locale);
        return;
      }
    }
    a("error:set device accesskey fail device not found  。");
  }

  private void o(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    int i = locala.g();
    int j = locala.d();
    g localg = e.a(i);
    if (localg == null)
    {
      a("receive setPw  task not found ,code:" + j);
      return;
    }
    localg.c();
    e locale = e.b(j);
    locale.a = localg.b().b();
    if (locale.a != null)
    {
      XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(locale.a.getMacAddress());
      if (localXDevice != null);
      for (locale.a = io.xlink.wifi.sdk.a.a().a(true, localXDevice); ; locale.a = io.xlink.wifi.sdk.a.a().a(true, locale.a))
      {
        locale.a.setLocalAddress(parama.e());
        locale.c = i;
        localg.g().onResponse(locale);
        return;
      }
    }
    a("error:set device pw fail device not found  。");
  }

  private void p(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    String str = io.xlink.wifi.sdk.util.b.d(locala.a(6));
    XDevice localXDevice1 = io.xlink.wifi.sdk.manage.c.a().b(str);
    if (localXDevice1 == null)
    {
      a("error udp push Pipe device not found mac:" + str);
      return;
    }
    locala.g();
    byte b = locala.d();
    byte[] arrayOfByte = locala.e();
    XDevice localXDevice2 = io.xlink.wifi.sdk.a.a().a(0, localXDevice1);
    localXDevice2.setLocalAddress(parama.e());
    io.xlink.wifi.sdk.event.c.a(false, localXDevice2, b, arrayOfByte);
  }

  private void q(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    int i = locala.g();
    int j = locala.d();
    g localg = e.a(i);
    if (localg != null)
    {
      if (j == 1)
      {
        a("parseLocalPipe::code==1；ssid ==" + localg.a().getSessionId() + "error! reconnectDevice");
        io.xlink.wifi.sdk.a.a().a(localg.a());
      }
      e locale = e.b(j);
      io.xlink.wifi.sdk.manage.c.a().a(localg.a().getMacAddress());
      locale.a = localg.a();
      locale.a.setLocalAddress(parama.e());
      locale.c = i;
      localg.c();
      localg.g().onResponse(locale);
    }
  }

  private void r(a parama)
  {
    int i = parama.b().d();
    a("local probe fail errorCode:" + i);
  }

  private void s(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    String str = io.xlink.wifi.sdk.util.b.d(locala.a(6));
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(str);
    if (localXDevice == null)
      a("local sync device not found,MAC :" + str);
    while (true)
    {
      return;
      localXDevice.setLocalAddress(parama.e());
      a("receive local sync deviceMac " + str);
      byte b = locala.d();
      if (io.xlink.wifi.sdk.util.b.a(b, 0))
        localXDevice.setDeviceName(io.xlink.wifi.sdk.util.b.c(locala.a(locala.g())));
      if (io.xlink.wifi.sdk.util.b.a(b, 1))
      {
        SparseArray localSparseArray = a(localXDevice, locala);
        for (int i = 0; i < localSparseArray.size(); i++)
        {
          DataPoint localDataPoint = (DataPoint)localSparseArray.valueAt(i);
          io.xlink.wifi.sdk.event.c.a(localXDevice, localDataPoint.getKey(), localDataPoint.getObjectValue(), 0, localDataPoint.getType());
        }
      }
    }
  }

  private void t(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = parama.b();
    int i = locala.g();
    int j = locala.d();
    g localg = e.a(i);
    if (localg != null)
    {
      localg.c();
      e locale = e.b(j);
      locale.a = localg.b().b();
      locale.a.setLocalAddress(parama.e());
      locale.c = i;
      localg.g().onResponse(locale);
      return;
    }
    a("recerve local set datapoint task not found :");
  }

  private void u(a parama)
  {
    String str = io.xlink.wifi.sdk.util.b.d(parama.b().a(6));
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(str);
    if (localXDevice == null)
    {
      a("local ping device not found MAC: " + str);
      return;
    }
    localXDevice.setLocalAddress(parama.e());
    a("receive device Mac " + str + " ping ");
    io.xlink.wifi.sdk.a.a().b(localXDevice);
  }

  private void v(a parama)
  {
    io.xlink.wifi.sdk.buffer.a locala = new io.xlink.wifi.sdk.buffer.a(parama.b().b(), 5);
    int i = locala.d();
    byte b = locala.d();
    byte[] arrayOfByte = locala.a(6);
    String str = io.xlink.wifi.sdk.util.b.d(arrayOfByte).trim();
    g localg = e.b(str);
    if (localg == null)
      a("receive handshake device not found mac:" + str);
    e locale;
    XDevice localXDevice1;
    do
    {
      return;
      localg.c();
      locale = e.b(i);
      localXDevice1 = io.xlink.wifi.sdk.manage.c.a().b(str);
    }
    while (localXDevice1 == null);
    localXDevice1.setLocalAddress(parama.e());
    localXDevice1.setVersion(b);
    if (i != 0)
    {
      locale.a = localXDevice1;
      io.xlink.wifi.sdk.a.a().a(localXDevice1, str);
      localg.g().onResponse(locale);
      return;
    }
    int j = locala.f();
    io.xlink.wifi.sdk.a.a().b(localXDevice1, j);
    localXDevice1.setMcuSoftVersion(locala.g());
    int k = io.xlink.wifi.sdk.util.b.d(locala.g());
    XDevice localXDevice2 = io.xlink.wifi.sdk.a.a().a(localXDevice1, parama.a(), arrayOfByte, localXDevice1.getProductId(), localXDevice1.getPort());
    XDevice localXDevice3 = io.xlink.wifi.sdk.a.a().a(localXDevice2, k);
    locala.d();
    io.xlink.wifi.sdk.manage.c.a().c(localXDevice3);
    locale.a = localXDevice3;
    localg.g().onResponse(locale);
    XlinkUdpService.b().d();
    a("receive device MAC: " + str + " HandShake  sessionId :" + localXDevice3.getSessionId() + " deviceId:" + localXDevice3.getDeviceId());
  }

  private void w(a parama)
  {
    String str1;
    try
    {
      io.xlink.wifi.sdk.buffer.a locala = parama.b();
      byte b1 = locala.d();
      byte[] arrayOfByte = locala.a(6);
      str1 = io.xlink.wifi.sdk.util.b.d(arrayOfByte);
      XDevice localXDevice1 = io.xlink.wifi.sdk.a.a().a(str1);
      localXDevice1.setVersion(b1);
      String str2 = io.xlink.wifi.sdk.util.b.c(locala.a(locala.g()));
      localXDevice1.setMcuHardVersion(locala.d());
      localXDevice1.setMcuSoftVersion(locala.g());
      int i = io.xlink.wifi.sdk.util.b.d(locala.g());
      if (b1 == 2)
      {
        j = io.xlink.wifi.sdk.util.b.d(locala.g());
        localXDevice1 = io.xlink.wifi.sdk.a.a().d(localXDevice1, j);
      }
      b2 = locala.d();
      if (io.xlink.wifi.sdk.util.b.a(b2, 0))
        localXDevice1.setDeviceName(io.xlink.wifi.sdk.util.b.c(locala.a(locala.g())));
      if ((!io.xlink.wifi.sdk.util.b.a(b2, 1)) || (b1 == 1))
      {
        if (io.xlink.wifi.sdk.util.b.a(b2, 2))
          localXDevice1 = io.xlink.wifi.sdk.a.a().a(true, localXDevice1);
        localXDevice2 = io.xlink.wifi.sdk.a.a().a(localXDevice1, parama.a(), arrayOfByte, str2, i);
        localXDevice3 = io.xlink.wifi.sdk.manage.c.a().b(localXDevice2.getMacAddress());
        if (localXDevice3 == null)
          break label729;
        localXDevice4 = io.xlink.wifi.sdk.a.a().a(localXDevice2.isInit(), localXDevice3);
        localXDevice5 = io.xlink.wifi.sdk.a.a().a(localXDevice4, parama.a(), arrayOfByte, str2, i);
        localXDevice6 = io.xlink.wifi.sdk.a.a().c(localXDevice5, localXDevice2.getAccessKey());
        localXDevice7 = io.xlink.wifi.sdk.a.a().d(localXDevice6, localXDevice2.getProductType());
        localXDevice7.setLocalAddress(parama.e());
        io.xlink.wifi.sdk.manage.c.a().c(localXDevice7);
        localStringBuilder = new StringBuilder();
        if (!io.xlink.wifi.sdk.util.b.a(b2, 4))
          break label595;
        localStringBuilder.append("read device: " + str1);
        localg = e.b(str1 + 1);
        if (localg == null)
          break label577;
        locale = new e(0);
        locale.a = localXDevice7;
        localg.c();
        localg.g().onResponse(locale);
        localStringBuilder.append(" Scaning by mac ");
      }
      while (true)
      {
        localStringBuilder.append("port " + localXDevice7.getPort());
        localStringBuilder.append("deviceId:" + localXDevice7.getDeviceId());
        localStringBuilder.append(" productId:" + localXDevice7.getProductId());
        a(localStringBuilder.toString());
        return;
        if (io.xlink.wifi.sdk.util.b.a(b2, 2))
        {
          localXDevice9 = io.xlink.wifi.sdk.a.a().a(true, localXDevice1);
          k = locala.f();
          localXDevice1 = io.xlink.wifi.sdk.a.a().c(localXDevice9, k);
          break;
        }
        localXDevice8 = io.xlink.wifi.sdk.a.a().c(localXDevice1, -1);
        localXDevice1 = io.xlink.wifi.sdk.a.a().a(false, localXDevice8);
        break;
        localStringBuilder.append(" Scaning by mac task is null");
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      localIndexOutOfBoundsException.printStackTrace();
      return;
    }
    while (true)
    {
      int j;
      byte b2;
      XDevice localXDevice2;
      XDevice localXDevice3;
      XDevice localXDevice4;
      XDevice localXDevice5;
      XDevice localXDevice6;
      StringBuilder localStringBuilder;
      g localg;
      e locale;
      XDevice localXDevice9;
      int k;
      XDevice localXDevice8;
      label577: label595: localStringBuilder.append("read device: " + str1);
      localStringBuilder.append(" Scaning by productId ");
      localStringBuilder.append("port " + localXDevice7.getPort());
      localStringBuilder.append("deviceId:" + localXDevice7.getDeviceId());
      localStringBuilder.append(" productId:" + localXDevice7.getProductId());
      io.xlink.wifi.sdk.event.c.a(localXDevice7);
      continue;
      label729: XDevice localXDevice7 = localXDevice2;
    }
  }

  public void a(a parama)
  {
    try
    {
      if (!parama.d().d())
        break label178;
      switch (parama.c())
      {
      case 2:
      case 4:
      case 6:
      case 11:
      default:
        a("Receive TCP error type of package:" + parama);
        return;
      case 1:
        g(parama);
        return;
      case 3:
      case 7:
      case 9:
      case 10:
      case 5:
      case 12:
      case 8:
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      a("read Exception tcp packet:" + parama.toString() + " IndexOutOfBoundsException error");
      return;
    }
    f(parama);
    return;
    h(parama);
    return;
    d(parama);
    return;
    b(parama);
    return;
    c(parama);
    return;
    k(parama);
    return;
    label178: switch (parama.c())
    {
    case 5:
    case 6:
    case 9:
    case 10:
    case 11:
    case 13:
    default:
      a("Received is not the response TCP error type of package:" + parama);
      return;
    case 4:
      e(parama);
      return;
    case 7:
      i(parama);
      return;
    case 8:
      j(parama);
      return;
    case 14:
      l(parama);
      return;
    case 12:
    }
    k(parama);
  }

  public void a(InetAddress paramInetAddress, io.xlink.wifi.sdk.buffer.a parama, int paramInt, SocketAddress paramSocketAddress)
  {
    if (parama.b().length <= 5)
    {
      a("error data length:" + parama.b().length + " buf:" + io.xlink.wifi.sdk.util.b.a(parama.b()));
      return;
    }
    b localb = new b(parama.b());
    a locala;
    if ((localb.b()) && (localb.a() <= -5 + parama.b().length) && (localb.a() != 0))
    {
      locala = new a(new io.xlink.wifi.sdk.buffer.a(parama.b(), 5), localb);
      locala.a(paramInetAddress);
      locala.a = paramInt;
      locala.a(paramSocketAddress);
      try
      {
        m(locala);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        a("udp dispatchPacket error  :" + localIndexOutOfBoundsException.toString() + "   dataBuff：" + locala.toString());
        return;
      }
    }
    a("parse data error header length：" + localb.a() + " read data length：" + parama.b().length + " type:" + localb.c());
  }

  private static class a
  {
    private static c a = new c(null);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.decoder.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */