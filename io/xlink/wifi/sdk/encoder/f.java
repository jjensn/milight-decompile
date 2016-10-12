package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.DataPoint;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkUdpService;
import io.xlink.wifi.sdk.util.MyLog;
import java.nio.charset.Charset;

public class f
{
  private static f a;

  public f()
  {
  }

  public static int a(int paramInt)
  {
    if (paramInt <= 8)
      return 1;
    if (paramInt % 8 == 0)
      return paramInt / 8;
    return 1 + paramInt / 8;
  }

  public static int a(DataPoint paramDataPoint)
  {
    int i = 1;
    switch (paramDataPoint.getType())
    {
    default:
      i = 0;
    case 1:
    case 2:
      return i;
    case 3:
      return 2;
    case 4:
      return 4;
    case 5:
    }
    return 2 + paramDataPoint.getObjectValue().toString().getBytes().length;
  }

  public static DataPoint a(Object paramObject, DataPoint paramDataPoint)
  {
    while (true)
    {
      try
      {
        switch (paramDataPoint.getType())
        {
        case 1:
          paramDataPoint.setValue(localObject);
          return paramDataPoint;
          localObject = (Boolean)paramObject;
          break;
        case 3:
          localObject = (Short)paramObject;
          break;
        case 4:
          localObject = (Integer)paramObject;
          break;
        case 2:
          localObject = (Byte)paramObject;
          break;
        case 5:
          localObject = (String)paramObject;
          continue;
        }
      }
      catch (Exception localException)
      {
        return null;
      }
      Object localObject = null;
    }
  }

  public static io.xlink.wifi.sdk.buffer.b a(int paramInt, DataPoint paramDataPoint)
  {
    io.xlink.wifi.sdk.buffer.b localb = new io.xlink.wifi.sdk.buffer.b(paramInt + a(paramDataPoint));
    int i = 1;
    if (i <= paramInt)
    {
      if (a(paramDataPoint.getKey()) == i)
        localb.a(io.xlink.wifi.sdk.util.b.a(paramDataPoint.getKey() % 8, (byte)0));
      while (true)
      {
        i++;
        break;
        localb.a((byte)0);
      }
    }
    return a(localb, paramDataPoint.getType(), paramDataPoint.getObjectValue());
  }

  public static io.xlink.wifi.sdk.buffer.b a(io.xlink.wifi.sdk.buffer.b paramb, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default:
      return paramb;
    case 1:
      paramb.a(((Boolean)paramObject).booleanValue());
      return paramb;
    case 3:
      paramb.a(((Integer)paramObject).intValue());
      return paramb;
    case 4:
      paramb.b(((Integer)paramObject).intValue());
      return paramb;
    case 2:
      paramb.a(((Byte)paramObject).byteValue());
      return paramb;
    case 5:
    }
    paramb.a(paramObject.toString().getBytes().length);
    paramb.a(paramObject.toString().getBytes());
    return paramb;
  }

  public static f a()
  {
    if (a == null)
      a = new f();
    return a;
  }

  public static Object a(io.xlink.wifi.sdk.buffer.a parama, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
      return Boolean.valueOf(parama.c());
    case 3:
      return Short.valueOf(parama.g());
    case 4:
      return Integer.valueOf(parama.f());
    case 2:
      return Byte.valueOf(parama.d());
    case 5:
    }
    return new String(parama.a(parama.g()), Charset.forName("UTF-8"));
  }

  public d a(byte paramByte)
  {
    a("tcp sendDisconnect  reason :" + paramByte);
    d locald = new d(1, 14, false);
    locald.b.a(paramByte);
    return locald;
  }

  public d a(int paramInt1, byte paramByte, byte[] paramArrayOfByte, io.xlink.wifi.sdk.event.a parama, int paramInt2)
  {
    d locald = new d(7 + paramArrayOfByte.length, 7, false);
    locald.b.b(paramInt1);
    locald.h();
    locald.b.a(paramByte);
    locald.b.a(paramArrayOfByte);
    return locald;
  }

  public d a(int paramInt, String paramString)
  {
    byte[] arrayOfByte;
    d locald;
    byte b;
    if (paramInt == 1)
    {
      arrayOfByte = io.xlink.wifi.sdk.util.b.c(paramString);
      locald = new d(4 + arrayOfByte.length, 1, false);
      locald.a(io.xlink.wifi.sdk.util.b.b());
      locald.b.c(2);
      locald.b.a(io.xlink.wifi.sdk.global.a.g);
      if (paramInt != 1)
        break label99;
      b = io.xlink.wifi.sdk.util.b.a(4, io.xlink.wifi.sdk.util.b.a(0, (byte)0));
    }
    while (true)
    {
      locald.b.a(b);
      locald.b.a(arrayOfByte);
      return locald;
      arrayOfByte = io.xlink.wifi.sdk.util.b.d(paramString);
      break;
      label99: b = 0;
      if (paramInt == 2)
        b = io.xlink.wifi.sdk.util.b.a(1, (byte)0);
    }
  }

  public d a(XDevice paramXDevice, byte paramByte, byte[] paramArrayOfByte)
  {
    d locald = new d(5 + paramArrayOfByte.length, 8, false);
    locald.a(paramXDevice);
    locald.a(paramXDevice.getAddress());
    locald.b.a(paramXDevice.getSessionId());
    locald.h();
    locald.b.a(paramByte);
    locald.b.a(paramArrayOfByte);
    return locald;
  }

  public d a(XDevice paramXDevice, byte paramByte, byte[] paramArrayOfByte, io.xlink.wifi.sdk.event.a parama, int paramInt)
  {
    d locald = new d(7 + paramArrayOfByte.length, 7, false);
    locald.a(paramXDevice);
    locald.b.b(paramXDevice.getDeviceId());
    locald.h();
    locald.b.a(paramByte);
    locald.b.a(paramArrayOfByte);
    return locald;
  }

  public d a(XDevice paramXDevice, int paramInt)
  {
    d locald = new d(22, 2, false);
    locald.a(paramXDevice);
    locald.a(paramXDevice.getAddress());
    locald.a(paramXDevice.getPort());
    locald.a(paramXDevice.getMacAddress());
    locald.b.a(paramXDevice.getVersion());
    locald.b.a(io.xlink.wifi.sdk.util.b.a(paramInt));
    locald.b.a(io.xlink.wifi.sdk.global.a.g);
    locald.b.c(0);
    locald.b.a(paramXDevice.getTimeout());
    return locald;
  }

  public d a(XDevice paramXDevice, int paramInt, boolean paramBoolean, io.xlink.wifi.sdk.event.a parama)
  {
    byte[] arrayOfByte1 = io.xlink.wifi.sdk.util.b.d(paramXDevice.getProductId());
    byte[] arrayOfByte2 = io.xlink.wifi.sdk.util.b.c(paramXDevice.getMacAddress());
    byte[] arrayOfByte3 = io.xlink.wifi.sdk.util.b.a(paramInt);
    d locald = new d(59, 9, false);
    locald.a(paramXDevice);
    locald.b.a(arrayOfByte1.length);
    locald.b.a(arrayOfByte1);
    locald.b.a(arrayOfByte2);
    locald.b.a(arrayOfByte3);
    locald.h();
    if (paramBoolean);
    for (byte b = 3; ; b = 2)
    {
      locald.b.a(b);
      return locald;
    }
  }

  public d a(XDevice paramXDevice, DataPoint paramDataPoint)
  {
    io.xlink.wifi.sdk.buffer.b localb = a(io.xlink.wifi.sdk.manage.b.a().a(paramXDevice.getProductId()), paramDataPoint);
    d locald = new d(5 + localb.a().length, 4, false);
    locald.a(paramXDevice);
    locald.a(paramXDevice.getAddress());
    locald.b.a(paramXDevice.getSessionId());
    locald.h();
    locald.b.a(io.xlink.wifi.sdk.util.b.a(1, (byte)0));
    locald.b.a(localb.a());
    return locald;
  }

  public d a(XDevice paramXDevice, String paramString)
  {
    d locald = new d(22, 2, false);
    locald.a(paramXDevice);
    locald.a(paramXDevice.getAddress());
    locald.a(paramXDevice.getPort());
    locald.a(paramXDevice.getMacAddress());
    locald.b.a(paramXDevice.getVersion());
    locald.b.a(io.xlink.wifi.sdk.util.b.b(paramString));
    locald.b.a(io.xlink.wifi.sdk.global.a.g);
    locald.b.c(0);
    locald.b.a(paramXDevice.getTimeout());
    return locald;
  }

  public d a(XDevice paramXDevice, String paramString1, String paramString2)
  {
    d locald = new d(37, 9, false);
    locald.a(paramXDevice.getAddress());
    locald.a(paramXDevice);
    locald.h();
    locald.b.c(0);
    locald.b.a(io.xlink.wifi.sdk.global.a.g);
    locald.b.a(io.xlink.wifi.sdk.util.b.b(paramString1));
    locald.b.a(io.xlink.wifi.sdk.util.b.b(paramString2));
    return locald;
  }

  public d a(XDevice paramXDevice, String paramString, boolean paramBoolean, io.xlink.wifi.sdk.event.a parama)
  {
    byte[] arrayOfByte1 = io.xlink.wifi.sdk.util.b.d(paramXDevice.getProductId());
    byte[] arrayOfByte2 = io.xlink.wifi.sdk.util.b.c(paramXDevice.getMacAddress());
    byte[] arrayOfByte3 = io.xlink.wifi.sdk.util.b.b(paramString);
    d locald = new d(59, 9, false);
    locald.a(paramXDevice);
    locald.b.a(arrayOfByte1.length);
    locald.b.a(arrayOfByte1);
    locald.b.a(arrayOfByte2);
    locald.b.a(arrayOfByte3);
    locald.h();
    if (paramBoolean)
    {
      locald.b.a(io.xlink.wifi.sdk.util.b.a(0, (byte)0));
      return locald;
    }
    locald.b.a((byte)0);
    return locald;
  }

  public d a(io.xlink.wifi.sdk.event.a parama)
  {
    byte[] arrayOfByte = io.xlink.wifi.sdk.util.b.d(io.xlink.wifi.sdk.global.a.a());
    io.xlink.wifi.sdk.buffer.b localb = new io.xlink.wifi.sdk.buffer.b(arrayOfByte.length);
    localb.a(arrayOfByte);
    d locald = new d(localb);
    locald.a("999");
    return locald;
  }

  public void a(XDevice paramXDevice)
  {
    d locald = new d(3, 3, false);
    locald.a(paramXDevice);
    locald.a(paramXDevice.getAddress());
    locald.b.a(paramXDevice.getSessionId());
    locald.b.c(0);
    g localg = new g(locald);
    XlinkUdpService.b().a(localg);
  }

  public void a(String paramString)
  {
    MyLog.e("PacketEncoder", paramString + "");
  }

  public d b()
  {
    return new d(0, 13, false);
  }

  public d b(int paramInt, String paramString)
  {
    a("   doLogin  --   id :" + paramInt + " authorize :" + paramString);
    byte[] arrayOfByte = io.xlink.wifi.sdk.util.b.d(paramString);
    d locald = new d(10 + arrayOfByte.length, 1, false);
    locald.b.c(2);
    locald.b.b(paramInt);
    locald.b.a(arrayOfByte.length);
    locald.b.a(arrayOfByte);
    locald.b.c(0);
    locald.b.a(io.xlink.wifi.sdk.global.a.e);
    return locald;
  }

  public d b(XDevice paramXDevice)
  {
    d locald = new d(2, 13, false);
    locald.a(paramXDevice.getAddress());
    locald.a(paramXDevice);
    locald.b.a(paramXDevice.getSessionId());
    return locald;
  }

  public d b(XDevice paramXDevice, int paramInt)
  {
    d locald = new d(9, 11, false);
    locald.a(paramXDevice.getAddress());
    locald.a(paramXDevice);
    locald.h();
    locald.b.c(0);
    locald.b.a(io.xlink.wifi.sdk.global.a.g);
    locald.b.b(paramInt);
    return locald;
  }

  public d b(XDevice paramXDevice, DataPoint paramDataPoint)
  {
    io.xlink.wifi.sdk.buffer.b localb = a(io.xlink.wifi.sdk.manage.b.a().a(paramXDevice.getProductId()), paramDataPoint);
    d locald = new d(7 + localb.a().length, 3, false);
    locald.a(paramXDevice);
    locald.b.b(paramXDevice.getDeviceId());
    locald.h();
    locald.b.a(io.xlink.wifi.sdk.util.b.a(1, (byte)0));
    locald.b.a(localb.a());
    return locald;
  }

  public d b(XDevice paramXDevice, String paramString1, String paramString2)
  {
    d locald = new d(39, 5, false);
    locald.a(paramXDevice);
    locald.b.b(paramXDevice.getDeviceId());
    locald.h();
    locald.b.c(0);
    locald.b.a(io.xlink.wifi.sdk.util.b.b(paramString1));
    locald.b.a(io.xlink.wifi.sdk.util.b.b(paramString2));
    return locald;
  }

  public d c(XDevice paramXDevice)
  {
    if (paramXDevice.getSessionId() < 0)
      return null;
    d locald = new d(2, 14, false);
    locald.a(paramXDevice.getAddress());
    locald.a(paramXDevice);
    locald.b.a(paramXDevice.getSessionId());
    return locald;
  }

  public d c(XDevice paramXDevice, int paramInt)
  {
    d locald = new d(7, 10, false);
    locald.a(paramXDevice);
    locald.b.b(paramXDevice.getDeviceId());
    locald.h();
    locald.b.c(paramInt);
    return locald;
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */