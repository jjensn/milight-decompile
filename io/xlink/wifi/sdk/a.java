package io.xlink.wifi.sdk;

import io.xlink.wifi.sdk.event.b;
import io.xlink.wifi.sdk.event.c;
import io.xlink.wifi.sdk.listener.ConnectDeviceListener;
import io.xlink.wifi.sdk.util.MyLog;
import java.net.InetAddress;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{
  public static a a;
  private final String b = "pid";
  private final String c = "mac";
  private final String d = "dname";
  private final String e = "ip";
  private final String f = "did";
  private final String g = "port";
  private final String h = "version";
  private final String i = "mhv";
  private final String j = "msv";
  private final String k = "accesskey";
  private final String l = "init";
  private final String m = "protocol";
  private final String n = "device";
  private final String o = "macAddress";
  private final String p = "version";
  private final String q = "deviceID";
  private final String r = "deviceName";
  private final String s = "deviceIP";
  private final String t = "devicePort";
  private final String u = "deviceInit";
  private final String v = "mcuHardVersion";
  private final String w = "mucSoftVersion";
  private final String x = "mcuSoftVersion";
  private final String y = "productID";
  private final String z = "accesskey";

  public a()
  {
  }

  public static a a()
  {
    if (a == null)
      a = new a();
    return a;
  }

  public int a(XDevice paramXDevice, int paramInt1, b paramb, int paramInt2)
  {
    return XlinkAgent.getInstance().a(paramXDevice, paramInt1, paramb, paramInt2);
  }

  public int a(XDevice paramXDevice, io.xlink.wifi.sdk.event.a parama)
  {
    return XlinkAgent.getInstance().a(paramXDevice, parama);
  }

  public int a(XDevice paramXDevice, String paramString, b paramb, int paramInt)
  {
    return XlinkAgent.getInstance().a(paramXDevice, paramString, paramb, paramInt);
  }

  public XDevice a(int paramInt, XDevice paramXDevice)
  {
    paramXDevice.a(paramInt);
    return paramXDevice;
  }

  public XDevice a(XDevice paramXDevice, int paramInt)
  {
    paramXDevice.c(paramInt);
    return paramXDevice;
  }

  public XDevice a(XDevice paramXDevice, InetAddress paramInetAddress, byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    if (paramInetAddress != null)
      paramXDevice.a(paramInetAddress);
    if (paramArrayOfByte != null)
      paramXDevice.a(paramArrayOfByte);
    if (paramString != null)
      paramXDevice.a(paramString);
    if (paramInt > 0)
      paramXDevice.e(paramInt);
    return paramXDevice;
  }

  public XDevice a(String paramString)
  {
    return new XDevice(paramString);
  }

  // ERROR //
  public XDevice a(JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: new 154	io/xlink/wifi/sdk/XDevice
    //   3: dup
    //   4: aload_1
    //   5: ldc 42
    //   7: invokevirtual 186	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   10: invokespecial 175	io/xlink/wifi/sdk/XDevice:<init>	(Ljava/lang/String;)V
    //   13: astore_2
    //   14: aload_2
    //   15: aload_1
    //   16: ldc 38
    //   18: invokevirtual 186	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   21: invokevirtual 170	io/xlink/wifi/sdk/XDevice:a	(Ljava/lang/String;)V
    //   24: aload_1
    //   25: ldc 46
    //   27: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   30: ifne +118 -> 148
    //   33: aload_2
    //   34: aload_1
    //   35: ldc 46
    //   37: invokevirtual 186	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   40: invokevirtual 193	io/xlink/wifi/sdk/XDevice:setDeviceName	(Ljava/lang/String;)V
    //   43: aload_1
    //   44: ldc 50
    //   46: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   49: ifeq +326 -> 375
    //   52: aload_2
    //   53: invokestatic 198	io/xlink/wifi/sdk/util/b:b	()Ljava/net/InetAddress;
    //   56: invokevirtual 164	io/xlink/wifi/sdk/XDevice:a	(Ljava/net/InetAddress;)V
    //   59: aload_2
    //   60: aload_1
    //   61: ldc 54
    //   63: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   66: invokevirtual 204	io/xlink/wifi/sdk/XDevice:f	(I)V
    //   69: aload_1
    //   70: ldc 58
    //   72: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   75: ifeq +316 -> 391
    //   78: aload_2
    //   79: getstatic 209	io/xlink/wifi/sdk/global/a:f	I
    //   82: invokevirtual 172	io/xlink/wifi/sdk/XDevice:e	(I)V
    //   85: aload_2
    //   86: aload_1
    //   87: ldc 62
    //   89: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   92: i2b
    //   93: invokevirtual 213	io/xlink/wifi/sdk/XDevice:setVersion	(B)V
    //   96: aload_1
    //   97: ldc 78
    //   99: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   102: ifeq +302 -> 404
    //   105: aload_2
    //   106: iconst_1
    //   107: invokevirtual 216	io/xlink/wifi/sdk/XDevice:a	(Z)V
    //   110: aload_1
    //   111: ldc 74
    //   113: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   116: ifeq +301 -> 417
    //   119: aload_2
    //   120: iconst_m1
    //   121: invokevirtual 218	io/xlink/wifi/sdk/XDevice:b	(I)V
    //   124: aload_2
    //   125: aload_1
    //   126: ldc 66
    //   128: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   131: i2b
    //   132: invokevirtual 221	io/xlink/wifi/sdk/XDevice:setMcuHardVersion	(B)V
    //   135: aload_2
    //   136: aload_1
    //   137: ldc 70
    //   139: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   142: i2b
    //   143: invokevirtual 224	io/xlink/wifi/sdk/XDevice:setMcuSoftVersion	(I)V
    //   146: aload_2
    //   147: areturn
    //   148: aload_2
    //   149: ldc 226
    //   151: invokevirtual 193	io/xlink/wifi/sdk/XDevice:setDeviceName	(Ljava/lang/String;)V
    //   154: goto -111 -> 43
    //   157: astore_3
    //   158: aload_1
    //   159: ldc 82
    //   161: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   164: iconst_1
    //   165: if_icmpne +208 -> 373
    //   168: new 182	org/json/JSONObject
    //   171: dup
    //   172: aload_1
    //   173: ldc 86
    //   175: invokevirtual 186	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   178: invokespecial 227	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   181: astore 5
    //   183: new 154	io/xlink/wifi/sdk/XDevice
    //   186: dup
    //   187: aload 5
    //   189: ldc 90
    //   191: invokevirtual 186	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   194: invokespecial 175	io/xlink/wifi/sdk/XDevice:<init>	(Ljava/lang/String;)V
    //   197: astore 6
    //   199: aload 6
    //   201: aload 5
    //   203: ldc 62
    //   205: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   208: i2b
    //   209: invokevirtual 213	io/xlink/wifi/sdk/XDevice:setVersion	(B)V
    //   212: aload 6
    //   214: aload 5
    //   216: ldc 96
    //   218: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   221: invokevirtual 204	io/xlink/wifi/sdk/XDevice:f	(I)V
    //   224: aload 6
    //   226: aload 5
    //   228: ldc 128
    //   230: invokevirtual 186	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   233: invokevirtual 170	io/xlink/wifi/sdk/XDevice:a	(Ljava/lang/String;)V
    //   236: aload 6
    //   238: aload 5
    //   240: ldc 116
    //   242: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   245: i2b
    //   246: invokevirtual 221	io/xlink/wifi/sdk/XDevice:setMcuHardVersion	(B)V
    //   249: aload 5
    //   251: ldc 100
    //   253: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   256: ifeq +174 -> 430
    //   259: aload 6
    //   261: ldc 226
    //   263: invokevirtual 193	io/xlink/wifi/sdk/XDevice:setDeviceName	(Ljava/lang/String;)V
    //   266: aload 5
    //   268: ldc 104
    //   270: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   273: ifeq +172 -> 445
    //   276: aload 6
    //   278: invokestatic 198	io/xlink/wifi/sdk/util/b:b	()Ljava/net/InetAddress;
    //   281: invokevirtual 164	io/xlink/wifi/sdk/XDevice:a	(Ljava/net/InetAddress;)V
    //   284: aload 5
    //   286: ldc 108
    //   288: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   291: ifeq +172 -> 463
    //   294: aload 6
    //   296: getstatic 209	io/xlink/wifi/sdk/global/a:f	I
    //   299: invokevirtual 172	io/xlink/wifi/sdk/XDevice:e	(I)V
    //   302: aload 5
    //   304: ldc 74
    //   306: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   309: ifeq +169 -> 478
    //   312: aload 6
    //   314: iconst_m1
    //   315: invokevirtual 218	io/xlink/wifi/sdk/XDevice:b	(I)V
    //   318: aload 5
    //   320: ldc 78
    //   322: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   325: ifeq +168 -> 493
    //   328: aload 6
    //   330: aload 5
    //   332: ldc 112
    //   334: invokevirtual 230	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   337: invokevirtual 216	io/xlink/wifi/sdk/XDevice:a	(Z)V
    //   340: aload 5
    //   342: ldc 120
    //   344: invokevirtual 190	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   347: ifeq +172 -> 519
    //   350: aload 6
    //   352: aload 5
    //   354: ldc 124
    //   356: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   359: i2b
    //   360: invokevirtual 224	io/xlink/wifi/sdk/XDevice:setMcuSoftVersion	(I)V
    //   363: aload 6
    //   365: areturn
    //   366: astore 4
    //   368: aload 4
    //   370: invokevirtual 233	org/json/JSONException:printStackTrace	()V
    //   373: aconst_null
    //   374: areturn
    //   375: aload_2
    //   376: aload_1
    //   377: ldc 50
    //   379: invokevirtual 186	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   382: invokestatic 236	io/xlink/wifi/sdk/util/b:e	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   385: invokevirtual 164	io/xlink/wifi/sdk/XDevice:a	(Ljava/net/InetAddress;)V
    //   388: goto -329 -> 59
    //   391: aload_2
    //   392: aload_1
    //   393: ldc 58
    //   395: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   398: invokevirtual 172	io/xlink/wifi/sdk/XDevice:e	(I)V
    //   401: goto -316 -> 85
    //   404: aload_2
    //   405: aload_1
    //   406: ldc 78
    //   408: invokevirtual 230	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   411: invokevirtual 216	io/xlink/wifi/sdk/XDevice:a	(Z)V
    //   414: goto -304 -> 110
    //   417: aload_2
    //   418: aload_1
    //   419: ldc 74
    //   421: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   424: invokevirtual 218	io/xlink/wifi/sdk/XDevice:b	(I)V
    //   427: goto -303 -> 124
    //   430: aload 6
    //   432: aload 5
    //   434: ldc 100
    //   436: invokevirtual 186	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   439: invokevirtual 193	io/xlink/wifi/sdk/XDevice:setDeviceName	(Ljava/lang/String;)V
    //   442: goto -176 -> 266
    //   445: aload 6
    //   447: aload 5
    //   449: ldc 104
    //   451: invokevirtual 186	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   454: invokestatic 236	io/xlink/wifi/sdk/util/b:e	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   457: invokevirtual 164	io/xlink/wifi/sdk/XDevice:a	(Ljava/net/InetAddress;)V
    //   460: goto -176 -> 284
    //   463: aload 6
    //   465: aload 5
    //   467: ldc 108
    //   469: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   472: invokevirtual 172	io/xlink/wifi/sdk/XDevice:e	(I)V
    //   475: goto -173 -> 302
    //   478: aload 6
    //   480: aload 5
    //   482: ldc 74
    //   484: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   487: invokevirtual 218	io/xlink/wifi/sdk/XDevice:b	(I)V
    //   490: goto -172 -> 318
    //   493: aload 6
    //   495: aload 5
    //   497: ldc 78
    //   499: invokevirtual 230	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   502: invokevirtual 216	io/xlink/wifi/sdk/XDevice:a	(Z)V
    //   505: goto -165 -> 340
    //   508: astore 7
    //   510: aload 6
    //   512: iconst_1
    //   513: invokevirtual 216	io/xlink/wifi/sdk/XDevice:a	(Z)V
    //   516: goto -176 -> 340
    //   519: aload 6
    //   521: aload 5
    //   523: ldc 120
    //   525: invokevirtual 202	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   528: i2b
    //   529: invokevirtual 224	io/xlink/wifi/sdk/XDevice:setMcuSoftVersion	(I)V
    //   532: aload 6
    //   534: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	43	157	org/json/JSONException
    //   43	59	157	org/json/JSONException
    //   59	85	157	org/json/JSONException
    //   85	110	157	org/json/JSONException
    //   110	124	157	org/json/JSONException
    //   124	146	157	org/json/JSONException
    //   148	154	157	org/json/JSONException
    //   375	388	157	org/json/JSONException
    //   391	401	157	org/json/JSONException
    //   404	414	157	org/json/JSONException
    //   417	427	157	org/json/JSONException
    //   158	266	366	org/json/JSONException
    //   266	284	366	org/json/JSONException
    //   284	302	366	org/json/JSONException
    //   302	318	366	org/json/JSONException
    //   318	340	366	org/json/JSONException
    //   340	363	366	org/json/JSONException
    //   430	442	366	org/json/JSONException
    //   445	460	366	org/json/JSONException
    //   463	475	366	org/json/JSONException
    //   478	490	366	org/json/JSONException
    //   493	505	366	org/json/JSONException
    //   510	516	366	org/json/JSONException
    //   519	532	366	org/json/JSONException
    //   318	340	508	java/lang/Exception
    //   493	505	508	java/lang/Exception
  }

  public XDevice a(boolean paramBoolean, XDevice paramXDevice)
  {
    paramXDevice.a(paramBoolean);
    return paramXDevice;
  }

  public void a(XDevice paramXDevice)
  {
    MyLog.e("DeviceAgent", "reconnectDevice xDevice:" + paramXDevice);
    c.a(-1, paramXDevice);
    XlinkAgent.getInstance().connectDevice(paramXDevice, paramXDevice.getAuthkey(), new ConnectDeviceListener()
    {
      public void onConnectDevice(XDevice paramAnonymousXDevice, int paramAnonymousInt)
      {
        MyLog.e("Reconnect", "auth reconnectDevice:" + paramAnonymousXDevice + " code:" + paramAnonymousInt);
        if ((paramAnonymousInt == 0) || (paramAnonymousInt == 1))
        {
          c.a(-3, paramAnonymousXDevice);
          return;
        }
        paramAnonymousXDevice.c(0);
        c.a(-2, paramAnonymousXDevice);
      }
    });
  }

  public void a(XDevice paramXDevice, String paramString)
  {
    paramXDevice.b(paramString);
  }

  public XDevice b(XDevice paramXDevice, int paramInt)
  {
    paramXDevice.f(paramInt);
    return paramXDevice;
  }

  public void b(XDevice paramXDevice)
  {
    paramXDevice.b();
  }

  public XDevice c(XDevice paramXDevice, int paramInt)
  {
    paramXDevice.b(paramInt);
    return paramXDevice;
  }

  public JSONObject c(XDevice paramXDevice)
    throws JSONException
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("protocol", 1);
    JSONObject localJSONObject2 = new JSONObject();
    localJSONObject2.put("deviceName", paramXDevice.getDeviceName() + "");
    localJSONObject2.put("macAddress", paramXDevice.getMacAddress());
    localJSONObject2.put("deviceIP", paramXDevice.getAddress().getHostAddress());
    localJSONObject2.put("deviceID", paramXDevice.getDeviceId());
    localJSONObject2.put("productID", paramXDevice.getProductId());
    localJSONObject2.put("devicePort", paramXDevice.getPort());
    localJSONObject2.put("version", paramXDevice.getVersion());
    localJSONObject2.put("mcuHardVersion", paramXDevice.getMcuHardVersion());
    localJSONObject2.put("mcuSoftVersion", paramXDevice.getMcuSoftVersion());
    localJSONObject2.put("deviceInit", paramXDevice.isInit());
    localJSONObject2.put("accesskey", paramXDevice.getAccessKey());
    localJSONObject1.put("device", localJSONObject2);
    return localJSONObject1;
  }

  public XDevice d(XDevice paramXDevice, int paramInt)
  {
    paramXDevice.d(paramInt);
    return paramXDevice;
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */