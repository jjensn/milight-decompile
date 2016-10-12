package io.xlink.wifi.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import io.xlink.wifi.sdk.encoder.d;
import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.encoder.f;
import io.xlink.wifi.sdk.encoder.g;
import io.xlink.wifi.sdk.listener.ConnectDeviceListener;
import io.xlink.wifi.sdk.listener.ScanDeviceListener;
import io.xlink.wifi.sdk.listener.SendPipeListener;
import io.xlink.wifi.sdk.listener.SetDataPointListener;
import io.xlink.wifi.sdk.listener.SetDeviceAccessKeyListener;
import io.xlink.wifi.sdk.listener.SubscribeDeviceListener;
import io.xlink.wifi.sdk.listener.XlinkNetListener;
import io.xlink.wifi.sdk.util.MyLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class XlinkAgent
{
  protected static boolean b = false;
  public boolean a = false;
  boolean c = false;

  private XlinkAgent()
  {
  }

  public static XDevice JsonToDevice(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      return null;
    return a.a().a(paramJSONObject);
  }

  private int a(XDevice paramXDevice, byte paramByte, byte[] paramArrayOfByte, SendPipeListener paramSendPipeListener)
  {
    if ((paramArrayOfByte == null) || (paramSendPipeListener == null))
      return -8;
    if (!b)
      return -1;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    if (paramXDevice == null)
      return -6;
    if (!paramXDevice.isLAN())
      return -2;
    return io.xlink.wifi.sdk.udp.b.a().a(paramXDevice, paramByte, paramArrayOfByte, paramSendPipeListener);
  }

  private int a(XDevice paramXDevice, int paramInt, SetDeviceAccessKeyListener paramSetDeviceAccessKeyListener)
  {
    if (!b)
      return -1;
    if ((paramInt < 0) || (paramInt > 999999999))
      return -8;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    paramXDevice.b(paramInt);
    paramXDevice.setAuthkey(paramInt + "");
    return io.xlink.wifi.sdk.udp.b.a().a(localXDevice, paramInt, paramSetDeviceAccessKeyListener);
  }

  @Deprecated
  private int a(XDevice paramXDevice, String paramString1, String paramString2, SetDeviceAccessKeyListener paramSetDeviceAccessKeyListener)
  {
    if (!b)
      return -1;
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)) || (paramSetDeviceAccessKeyListener == null))
      return -8;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    paramXDevice.setAuthkey(paramString2);
    try
    {
      paramXDevice.b(Integer.parseInt(paramString2));
      label76: return io.xlink.wifi.sdk.udp.b.a().a(localXDevice, paramString1, paramString2, paramSetDeviceAccessKeyListener);
    }
    catch (Exception localException)
    {
      break label76;
    }
  }

  private void a()
  {
    Intent localIntent = new Intent(io.xlink.wifi.sdk.util.b.a, XlinkUdpService.class);
    io.xlink.wifi.sdk.util.b.a.startService(localIntent);
    b("start inner service");
  }

  private void a(int paramInt)
  {
    if (XlinkTcpService.c())
      io.xlink.wifi.sdk.tcp.c.a().a(paramInt);
    try
    {
      Thread.sleep(100L);
      if (XlinkTcpService.a() != null)
        XlinkTcpService.a().a(false, 0, false);
      Intent localIntent = new Intent(io.xlink.wifi.sdk.util.b.a, XlinkTcpService.class);
      io.xlink.wifi.sdk.util.b.a.stopService(localIntent);
      b("stop cloud Service");
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        localInterruptedException.printStackTrace();
    }
  }

  private void a(int paramInt, String paramString)
  {
    XlinkTcpService.a = paramInt;
    XlinkTcpService.b = paramString;
    Intent localIntent = new Intent(io.xlink.wifi.sdk.util.b.a, XlinkTcpService.class);
    io.xlink.wifi.sdk.util.b.a.startService(localIntent);
    b("start cloud Service");
  }

  private void a(XDevice paramXDevice)
  {
    d locald = f.a().c(paramXDevice);
    if (locald != null)
    {
      g localg = new g(locald);
      io.xlink.wifi.sdk.tcp.a.a().d(localg);
    }
  }

  private void b()
  {
    if (this.c)
      return;
    this.c = true;
    io.xlink.wifi.sdk.util.b.b(new Runnable()
    {
      public void run()
      {
        Iterator localIterator = io.xlink.wifi.sdk.manage.c.a().c().iterator();
        while (localIterator.hasNext())
        {
          XDevice localXDevice = (XDevice)localIterator.next();
          XlinkAgent.a(XlinkAgent.this, localXDevice);
          try
          {
            Thread.sleep(30L);
          }
          catch (InterruptedException localInterruptedException)
          {
          }
        }
        if (XlinkUdpService.b() != null)
          XlinkUdpService.b().a(false, 0);
        Intent localIntent = new Intent(io.xlink.wifi.sdk.util.b.a, XlinkUdpService.class);
        io.xlink.wifi.sdk.util.b.a.stopService(localIntent);
        XlinkAgent.this.c = false;
        XlinkAgent.a("stop inner service");
        io.xlink.wifi.sdk.manage.c.a().b();
      }
    });
  }

  private static void b(String paramString)
  {
    MyLog.e("XlinkAgent", paramString);
  }

  public static void debug(boolean paramBoolean)
  {
    MyLog.a = Boolean.valueOf(paramBoolean);
  }

  public static JSONObject deviceToJson(XDevice paramXDevice)
  {
    if (paramXDevice == null)
      return null;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      localXDevice = paramXDevice;
    localXDevice.setDeviceName(paramXDevice.getDeviceName());
    try
    {
      JSONObject localJSONObject2 = a.a().c(paramXDevice);
      localJSONObject1 = localJSONObject2;
      return localJSONObject1;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        localJSONException.printStackTrace();
        JSONObject localJSONObject1 = null;
      }
    }
  }

  public static XlinkAgent getInstance()
  {
    return a.a();
  }

  public static void init(Context paramContext)
  {
    io.xlink.wifi.sdk.util.b.a = paramContext;
    io.xlink.wifi.sdk.util.b.a();
    b = true;
  }

  public static int scanByMac(XDevice paramXDevice, io.xlink.wifi.sdk.event.a parama)
  {
    if (!b)
      return -1;
    if (!XlinkUdpService.a())
      return -4;
    io.xlink.wifi.sdk.udp.b.a().a(paramXDevice, parama);
    return 0;
  }

  public static void setCMServer(String paramString, int paramInt)
  {
    io.xlink.wifi.sdk.global.a.a = paramString;
    io.xlink.wifi.sdk.global.a.b = paramInt;
  }

  public static boolean setDataTemplate(String paramString1, String paramString2)
  {
    SparseArray localSparseArray;
    try
    {
      JSONArray localJSONArray = new JSONArray(paramString2);
      localSparseArray = new SparseArray();
      int i = localJSONArray.length();
      int j = 0;
      if (j < i)
      {
        JSONObject localJSONObject = localJSONArray.getJSONObject(j);
        int k = localJSONObject.getInt("key");
        String str = localJSONObject.getString("type");
        int m;
        if (str.equals("bool"))
          m = 1;
        while (true)
        {
          DataPoint localDataPoint = new DataPoint(k, m);
          localSparseArray.put(localDataPoint.getKey(), localDataPoint);
          j++;
          break;
          if (str.equals("byte"))
          {
            m = 2;
          }
          else if (str.equals("int16"))
          {
            m = 3;
          }
          else if (str.equals("int32"))
          {
            m = 4;
          }
          else
          {
            if (!str.equals("string"))
              break label173;
            m = 5;
          }
        }
        throw new JSONException("type:" + str + " Not Found ");
      }
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
      b("setDataTemplate error：json Exception");
      return false;
    }
    label173: b("setDataTemplate succeed id：" + paramString1 + " point size:" + localSparseArray.size());
    io.xlink.wifi.sdk.manage.b.a().a(paramString1, localSparseArray);
    return true;
  }

  protected int a(XDevice paramXDevice, int paramInt1, io.xlink.wifi.sdk.event.b paramb, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 > 999999999))
      return -8;
    if (!b)
      return -1;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    if (!XlinkUdpService.a())
      return -4;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    io.xlink.wifi.sdk.udp.b.a().a(localXDevice, paramInt1, paramb, paramInt2);
    return 0;
  }

  protected int a(XDevice paramXDevice, io.xlink.wifi.sdk.event.a parama)
  {
    int i = -4;
    if (!io.xlink.wifi.sdk.manage.a.a().d())
      i = -10;
    do
    {
      do
        return i;
      while ((!XlinkTcpService.c()) && (!XlinkUdpService.a()));
      XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
      if (localXDevice == null)
        return -6;
      if ((localXDevice.isLAN()) && (XlinkUdpService.a()))
      {
        f.a().a(localXDevice);
        return 0;
      }
      if (!localXDevice.isValidId())
        return -9;
    }
    while (!XlinkTcpService.c());
    io.xlink.wifi.sdk.tcp.c.a().a(paramXDevice, 0, parama, 7);
    return 0;
  }

  protected int a(XDevice paramXDevice, String paramString, io.xlink.wifi.sdk.event.b paramb, int paramInt)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramb == null))
      return -8;
    if (!b)
      return -1;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    if (!XlinkUdpService.a())
      return -4;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    io.xlink.wifi.sdk.udp.b.a().a(localXDevice, paramString, paramb, paramInt);
    return 0;
  }

  public void addXlinkListener(XlinkNetListener paramXlinkNetListener)
  {
    io.xlink.wifi.sdk.event.c.a(paramXlinkNetListener.getClass().getName(), paramXlinkNetListener);
  }

  public int connectDevice(XDevice paramXDevice, int paramInt, ConnectDeviceListener paramConnectDeviceListener)
  {
    if (!b)
      return -1;
    if (paramXDevice.getVersion() == 1)
      return new io.xlink.wifi.sdk.encoder.b(paramXDevice, paramInt + "", paramConnectDeviceListener).a();
    return new io.xlink.wifi.sdk.encoder.c(paramXDevice, paramInt, paramConnectDeviceListener).a();
  }

  @Deprecated
  public int connectDevice(XDevice paramXDevice, String paramString, ConnectDeviceListener paramConnectDeviceListener)
  {
    if (!b)
      return -1;
    return new io.xlink.wifi.sdk.encoder.b(paramXDevice, paramString, paramConnectDeviceListener).a();
  }

  public int initDevice(XDevice paramXDevice)
  {
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    paramXDevice.a(-1);
    paramXDevice.c(-1);
    io.xlink.wifi.sdk.manage.c.a().b(paramXDevice);
    return 0;
  }

  public boolean isConnectedLocal()
  {
    return XlinkUdpService.a();
  }

  public boolean isConnectedOuterNet()
  {
    return XlinkTcpService.c();
  }

  public int login(int paramInt, String paramString)
  {
    if ((paramInt == 0) || (TextUtils.isEmpty(paramString)));
    do
    {
      return -8;
      if (!b)
        return -1;
      if ((XlinkTcpService.c()) || (XlinkTcpService.d))
        return -7;
    }
    while ((paramInt == 0) || (TextUtils.isEmpty(paramString)));
    io.xlink.wifi.sdk.manage.a.a().b();
    a(paramInt, paramString);
    return 0;
  }

  public void removeAllDevice()
  {
    io.xlink.wifi.sdk.manage.c.a().b();
  }

  public int removeDevice(XDevice paramXDevice)
  {
    if ((paramXDevice == null) || (paramXDevice.getMacAddress() == null))
      return -8;
    removeDevice(paramXDevice.getMacAddress());
    return 0;
  }

  public int removeDevice(String paramString)
  {
    if (paramString == null)
      return -8;
    io.xlink.wifi.sdk.manage.c.a().c(paramString);
    return 0;
  }

  public void removeListener(XlinkNetListener paramXlinkNetListener)
  {
    io.xlink.wifi.sdk.event.c.a(paramXlinkNetListener.getClass().getName());
  }

  public int scanDeviceByProductId(String paramString, ScanDeviceListener paramScanDeviceListener)
  {
    int i = -10;
    if (!b)
      i = -1;
    do
    {
      do
        return i;
      while (!io.xlink.wifi.sdk.manage.a.a().d());
      if (!XlinkUdpService.a())
        return -4;
      if (TextUtils.isEmpty(paramString))
        return -8;
    }
    while (TextUtils.isEmpty(io.xlink.wifi.sdk.util.b.d()));
    io.xlink.wifi.sdk.event.c.a(paramScanDeviceListener);
    io.xlink.wifi.sdk.udp.b.a().a(paramString);
    return 0;
  }

  public int sendPipe(int paramInt, byte[] paramArrayOfByte, SendPipeListener paramSendPipeListener)
  {
    if ((paramArrayOfByte == null) || (paramSendPipeListener == null))
      return -8;
    if (!io.xlink.wifi.sdk.manage.a.a().d())
      return -10;
    if (!b)
      return -1;
    if (XlinkTcpService.c())
      return io.xlink.wifi.sdk.tcp.c.a().a(paramInt, (byte)0, paramArrayOfByte, paramSendPipeListener, io.xlink.wifi.sdk.global.a.l);
    return -4;
  }

  public int sendPipeData(XDevice paramXDevice, byte paramByte, byte[] paramArrayOfByte, SendPipeListener paramSendPipeListener)
  {
    if ((paramArrayOfByte == null) || (paramSendPipeListener == null))
      return -8;
    if (!io.xlink.wifi.sdk.manage.a.a().d())
      return -10;
    if (!b)
      return -1;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    if ((XlinkUdpService.a()) && (localXDevice.getDevcieConnectStates() == 0))
      return a(localXDevice, paramByte, paramArrayOfByte, paramSendPipeListener);
    if (XlinkTcpService.c())
    {
      if (!localXDevice.isValidId())
        return -9;
      return io.xlink.wifi.sdk.tcp.c.a().a(localXDevice, paramByte, paramArrayOfByte, paramSendPipeListener, io.xlink.wifi.sdk.global.a.l);
    }
    return -4;
  }

  public int sendPipeData(XDevice paramXDevice, byte[] paramArrayOfByte, SendPipeListener paramSendPipeListener)
  {
    return sendPipeData(paramXDevice, (byte)0, paramArrayOfByte, paramSendPipeListener);
  }

  public int sendProbe(XDevice paramXDevice)
  {
    int i = -4;
    if (!io.xlink.wifi.sdk.manage.a.a().d())
      i = -10;
    do
    {
      do
        return i;
      while ((!XlinkTcpService.c()) && (!XlinkUdpService.a()));
      XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
      if (localXDevice == null)
        return -6;
      if ((localXDevice.isLAN()) && (XlinkUdpService.a()))
      {
        f.a().a(localXDevice);
        return 0;
      }
      if (!localXDevice.isValidId())
        return -9;
    }
    while (!XlinkTcpService.c());
    io.xlink.wifi.sdk.tcp.c.a().a(paramXDevice, 0, null, 7);
    return 0;
  }

  public int setDataPoint(XDevice paramXDevice, int paramInt, Object paramObject, SetDataPointListener paramSetDataPointListener)
  {
    int i = -4;
    if (!io.xlink.wifi.sdk.manage.a.a().d())
      i = -10;
    XDevice localXDevice;
    DataPoint localDataPoint;
    do
    {
      do
        return i;
      while ((!XlinkTcpService.c()) && (!XlinkUdpService.a()));
      localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
      if (localXDevice == null)
        return -6;
      localDataPoint = io.xlink.wifi.sdk.manage.b.a().a(localXDevice, paramInt, paramObject);
      if (localDataPoint == null)
        return -11;
      if ((localXDevice.isLAN()) && (XlinkUdpService.a()))
        return io.xlink.wifi.sdk.udp.b.a().a(localXDevice, localDataPoint, paramSetDataPointListener);
      if (!localXDevice.isValidId())
        return -9;
    }
    while (!XlinkTcpService.c());
    return io.xlink.wifi.sdk.tcp.c.a().a(localXDevice, localDataPoint, paramSetDataPointListener);
  }

  public int setDeviceAccessKey(XDevice paramXDevice, int paramInt, SetDeviceAccessKeyListener paramSetDeviceAccessKeyListener)
  {
    if (paramXDevice.getVersion() == 1)
      return setDeviceAuthorizeCode(paramXDevice, paramInt + "", paramInt + "", paramSetDeviceAccessKeyListener);
    if (!io.xlink.wifi.sdk.manage.a.a().d())
      return -10;
    if ((paramInt < 0) || (paramInt > 999999999))
      return -8;
    if (!b)
      return -1;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    return a(localXDevice, paramInt, paramSetDeviceAccessKeyListener);
  }

  @Deprecated
  public int setDeviceAuthorizeCode(XDevice paramXDevice, final String paramString1, final String paramString2, final SetDeviceAccessKeyListener paramSetDeviceAccessKeyListener)
  {
    if (!io.xlink.wifi.sdk.manage.a.a().d())
      return -10;
    if ((TextUtils.isEmpty(paramString2)) || (paramString2.length() < 3) || (paramSetDeviceAccessKeyListener == null))
      return -8;
    if (!b)
      return -1;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    if ((XlinkUdpService.a()) && (localXDevice.isLAN()))
      return a(localXDevice, paramString1, paramString2, paramSetDeviceAccessKeyListener);
    if ((!XlinkUdpService.a()) && (!XlinkTcpService.c()))
      return -4;
    if ((!XlinkUdpService.a()) && (XlinkTcpService.c()))
    {
      if (!localXDevice.isValidId())
        return -9;
      return io.xlink.wifi.sdk.tcp.c.a().a(localXDevice, paramString1, paramString2, paramSetDeviceAccessKeyListener, io.xlink.wifi.sdk.global.a.l);
    }
    if ((XlinkUdpService.a()) && (!XlinkTcpService.c()));
    return scanByMac(localXDevice, new io.xlink.wifi.sdk.event.a()
    {
      public void onResponse(e paramAnonymouse)
      {
        switch (paramAnonymouse.b)
        {
        default:
        case 0:
        case -100:
        }
        do
        {
          do
          {
            do
              return;
            while (XlinkAgent.a(XlinkAgent.this, paramAnonymouse.a, paramString1, paramString2, paramSetDeviceAccessKeyListener) >= 0);
            paramAnonymouse.b = -100;
            paramSetDeviceAccessKeyListener.onResponse(paramAnonymouse);
            return;
            if (XlinkTcpService.c())
              break;
          }
          while (XlinkAgent.a(XlinkAgent.this, paramAnonymouse.a, paramString1, paramString2, paramSetDeviceAccessKeyListener) >= 0);
          paramAnonymouse.b = -100;
          paramSetDeviceAccessKeyListener.onResponse(paramAnonymouse);
          return;
          if (paramAnonymouse.a.isValidId())
            break label196;
          if (!XlinkAgent.this.isConnectedLocal())
            break;
        }
        while (XlinkAgent.a(XlinkAgent.this, paramAnonymouse.a, paramString1, paramString2, paramSetDeviceAccessKeyListener) >= 0);
        paramAnonymouse.b = -100;
        paramSetDeviceAccessKeyListener.onResponse(paramAnonymouse);
        return;
        paramAnonymouse.b = 3;
        paramSetDeviceAccessKeyListener.onResponse(paramAnonymouse);
        return;
        label196: io.xlink.wifi.sdk.tcp.c.a().a(paramAnonymouse.a, paramString1, paramString2, paramSetDeviceAccessKeyListener, io.xlink.wifi.sdk.global.a.l);
      }
    });
  }

  public int start()
  {
    this.a = false;
    if (!b)
      return -1;
    io.xlink.wifi.sdk.manage.a.a().b();
    if (XlinkUdpService.a())
      return -7;
    a();
    return 0;
  }

  // ERROR //
  public void stop()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 12	io/xlink/wifi/sdk/XlinkAgent:b	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifne +6 -> 13
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: aload_0
    //   14: iconst_1
    //   15: putfield 17	io/xlink/wifi/sdk/XlinkAgent:a	Z
    //   18: iconst_0
    //   19: putstatic 167	io/xlink/wifi/sdk/XlinkTcpService:a	I
    //   22: aconst_null
    //   23: putstatic 170	io/xlink/wifi/sdk/XlinkTcpService:b	Ljava/lang/String;
    //   26: invokestatic 352	io/xlink/wifi/sdk/manage/a:a	()Lio/xlink/wifi/sdk/manage/a;
    //   29: invokevirtual 486	io/xlink/wifi/sdk/manage/a:e	()V
    //   32: aload_0
    //   33: invokespecial 487	io/xlink/wifi/sdk/XlinkAgent:b	()V
    //   36: ldc2_w 488
    //   39: invokestatic 148	java/lang/Thread:sleep	(J)V
    //   42: aload_0
    //   43: iconst_0
    //   44: invokespecial 490	io/xlink/wifi/sdk/XlinkAgent:a	(I)V
    //   47: invokestatic 191	io/xlink/wifi/sdk/tcp/a:a	()Lio/xlink/wifi/sdk/tcp/a;
    //   50: invokevirtual 492	io/xlink/wifi/sdk/tcp/a:d	()V
    //   53: goto -43 -> 10
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    //   61: astore_3
    //   62: aload_3
    //   63: invokevirtual 163	java/lang/InterruptedException:printStackTrace	()V
    //   66: goto -24 -> 42
    //
    // Exception table:
    //   from	to	target	type
    //   2	6	56	finally
    //   13	36	56	finally
    //   36	42	56	finally
    //   42	53	56	finally
    //   62	66	56	finally
    //   36	42	61	java/lang/InterruptedException
  }

  public int subscribeDevice(XDevice paramXDevice, int paramInt, SubscribeDeviceListener paramSubscribeDeviceListener)
  {
    if (paramXDevice.getVersion() == 1)
      return subscribeDevice(paramXDevice, paramInt + "", paramSubscribeDeviceListener);
    if (!b)
      return -1;
    if ((paramInt < 0) || (paramInt > 999999999))
      return -8;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    if (!XlinkTcpService.c())
      return -4;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    io.xlink.wifi.sdk.tcp.c.a().a(localXDevice, paramInt, paramSubscribeDeviceListener);
    return 0;
  }

  @Deprecated
  public int subscribeDevice(XDevice paramXDevice, String paramString, SubscribeDeviceListener paramSubscribeDeviceListener)
  {
    if (!b)
      return -1;
    if (TextUtils.isEmpty(paramString))
      return -8;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    if (!XlinkTcpService.c())
      return -4;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    io.xlink.wifi.sdk.tcp.c.a().a(localXDevice, paramString, paramSubscribeDeviceListener);
    return 0;
  }

  @Deprecated
  public int unsubscribeDevice(XDevice paramXDevice, int paramInt, SubscribeDeviceListener paramSubscribeDeviceListener)
  {
    if (paramXDevice.getVersion() == 1)
      return unsubscribeDevice(paramXDevice, paramInt + "", paramSubscribeDeviceListener);
    if (!b)
      return -1;
    if ((paramInt < 0) || (paramInt > 999999999))
      return -8;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    if (!XlinkTcpService.c())
      return -4;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    io.xlink.wifi.sdk.tcp.c.a().b(localXDevice, paramInt, paramSubscribeDeviceListener);
    return 0;
  }

  @Deprecated
  public int unsubscribeDevice(XDevice paramXDevice, String paramString, SubscribeDeviceListener paramSubscribeDeviceListener)
  {
    if (!b)
      return -1;
    if (TextUtils.isEmpty(paramString))
      return -8;
    if (io.xlink.wifi.sdk.manage.c.a().a(paramXDevice))
      return -3;
    if (!XlinkTcpService.c())
      return -4;
    XDevice localXDevice = io.xlink.wifi.sdk.manage.c.a().b(paramXDevice.getMacAddress());
    if (localXDevice == null)
      return -6;
    io.xlink.wifi.sdk.tcp.c.a().b(localXDevice, paramString, paramSubscribeDeviceListener);
    return 0;
  }

  private static class a
  {
    private static XlinkAgent a = new XlinkAgent(null);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkAgent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */