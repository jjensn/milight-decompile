package cn.jpush.android.a;

import android.content.Context;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import cn.jpush.android.util.ac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public final class b
{
  private static final String[] z;
  private int a = 0;
  private int b = 0;
  private int c = 0;
  private boolean d = false;
  private boolean e = false;
  private int f = 0;
  private double g = 0.0D;
  private PhoneStateListener h;
  private double i = 0.0D;
  private int j = 0;
  private int k = 0;
  private int l = 0;
  private int m = 0;
  private String n = "";
  private String o = "";
  private String p = "";
  private TelephonyManager q;
  private String r;
  private ArrayList<a> s = new ArrayList();
  private Context t = null;

  static
  {
    Object localObject1 = new String[26];
    int i1 = 0;
    String str1 = "";
    int i2 = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int i3 = localObject3.length;
    int i4 = 0;
    label36: Object localObject4;
    int i5;
    int i6;
    Object localObject5;
    label52: int i7;
    int i8;
    if (i3 <= 1)
    {
      localObject4 = localObject3;
      i5 = i4;
      i6 = i3;
      localObject5 = localObject3;
      i7 = localObject5[i4];
      switch (i5 % 5)
      {
      default:
        i8 = 87;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[i4] = (char)(i8 ^ i7);
      i4 = i5 + 1;
      if (i6 == 0)
      {
        localObject5 = localObject4;
        i5 = i4;
        i4 = i6;
        break label52;
      }
      i3 = i6;
      localObject3 = localObject4;
      if (i3 > i4)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (i2)
      {
      default:
        localObject1[i1] = str2;
        i1 = 1;
        str1 = "\007q*E2";
        localObject1 = localObject2;
        i2 = 0;
        break;
      case 0:
        localObject1[i1] = str2;
        i1 = 2;
        str1 = "\004p\"E6\033F6_%\022w\"_?";
        i2 = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i1] = str2;
        i1 = 3;
        str1 = "\020|1i6\004|\026_6\003p*E\033\030w\"B#\002} ";
        i2 = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i1] = str2;
        i1 = 4;
        str1 = "(w,Om";
        i2 = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i1] = str2;
        i1 = 5;
        str1 = "\020|+N%\026m,D9";
        i2 = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i1] = str2;
        i1 = 6;
        str1 = "\020|1x.\004m F\036\023";
        i2 = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i1] = str2;
        i1 = 7;
        str1 = "\032v'B;\022F&D\"\031m7R\b\024v!N";
        i2 = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i1] = str2;
        i1 = 8;
        str1 = "\005x!B8(m<[2";
        i2 = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i1] = str2;
        i1 = 9;
        str1 = "\004p!\021";
        i2 = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i1] = str2;
        i1 = 10;
        str1 = "\020|1i6\004|\026_6\003p*E\033\026m,_\"\023|";
        i2 = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i1] = str2;
        i1 = 11;
        str1 = "\024|)G\036\023#";
        i2 = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i1] = str2;
        i1 = 12;
        str1 = "";
        i2 = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i1] = str2;
        i1 = 13;
        str1 = "\024}(J";
        i2 = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i1] = str2;
        i1 = 14;
        str1 = "\024x7Y>\022k";
        i2 = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i1] = str2;
        i1 = 15;
        str1 = "[9\"N9\022k$_>\030w";
        i2 = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i1] = str2;
        i1 = 16;
        str1 = "[9&J%\005p Ym";
        i2 = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i1] = str2;
        i1 = 17;
        str1 = "\024|)G\b\036}";
        i2 = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i1] = str2;
        i1 = 18;
        str1 = "\"w S'\022z1N3V9&N;\033U*H6\003p*Ew\036jeE\"\033ui\0130\036o \013\"\00797N'\030k1\0134\022u)\006>\031*";
        i2 = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i1] = str2;
        i1 = 19;
        str1 = "\020|1i6\004|\026_6\003p*E\036\023";
        i2 = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i1] = str2;
        i1 = 20;
        str1 = "4|)G\036\031*f6\031x\"N%";
        i2 = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i1] = str2;
        i1 = 21;
        str1 = "\005x!B8#`5Nm";
        i2 = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i1] = str2;
        i1 = 22;
        str1 = "\020|1e2\003n*Y<>}";
        i2 = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i1] = str2;
        i1 = 23;
        str1 = "\026~ ";
        i2 = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i1] = str2;
        i1 = 24;
        str1 = "\033v&J#\036v+t6\005|$t4\030} ";
        i2 = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i1] = str2;
        i1 = 25;
        str1 = "({,Om";
        i2 = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i1] = str2;
        z = localObject2;
        return;
        i8 = 119;
        continue;
        i8 = 25;
        continue;
        i8 = 69;
        continue;
        i8 = 43;
      }
    }
  }

  public b(Context paramContext)
  {
    this.t = paramContext;
    if (!cn.jpush.android.util.b.c(paramContext, z[0]))
      return;
    try
    {
      this.h = new c(this);
      this.q = ((TelephonyManager)paramContext.getSystemService(z[1]));
      this.q.listen(this.h, 18);
      return;
    }
    catch (Exception localException)
    {
      ac.h();
    }
  }

  private String h()
  {
    if ((this.t != null) && (!cn.jpush.android.util.b.c(this.t, z[0])))
      return null;
    try
    {
      CellLocation localCellLocation = this.q.getCellLocation();
      String str = this.q.getNetworkOperator();
      int i1 = str.length();
      if (i1 != 5)
        if (i1 == 6);
      while ((this.q.getPhoneType() == 2) && ((localCellLocation instanceof CdmaCellLocation)) && (localCellLocation != null))
      {
        CdmaCellLocation localCdmaCellLocation = (CdmaCellLocation)localCellLocation;
        this.g = (localCdmaCellLocation.getBaseStationLatitude() / 14400.0D);
        this.i = (localCdmaCellLocation.getBaseStationLongitude() / 14400.0D);
        this.m = localCdmaCellLocation.getSystemId();
        this.b = localCdmaCellLocation.getBaseStationId();
        this.l = localCdmaCellLocation.getNetworkId();
        new StringBuilder().append(this.m);
        ac.c();
        new StringBuilder().append(this.b);
        ac.c();
        new StringBuilder().append(this.l);
        ac.c();
        a locala = new a();
        locala.a(this.b);
        locala.d(this.l);
        locala.c(this.m);
        locala.b(Integer.parseInt(str.substring(0, 3)));
        locala.a(z[13]);
        this.s.add(locala);
        new StringBuilder().append(locala.a());
        ac.b();
        this.r = locala.toString();
        return this.r;
        this.j = Integer.parseInt(str.substring(0, 3));
        this.k = Integer.parseInt(str.substring(3, i1));
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final int a()
  {
    return this.b;
  }

  public final JSONArray b()
  {
    if ((this.t != null) && (!cn.jpush.android.util.b.c(this.t, z[0])))
      return null;
    try
    {
      CellLocation localCellLocation = this.q.getCellLocation();
      String str = this.q.getNetworkOperator();
      int i1 = str.length();
      if (i1 != 5)
        if (i1 == 6);
      while ((this.q.getPhoneType() == 2) && ((localCellLocation instanceof CdmaCellLocation)) && (localCellLocation != null))
      {
        CdmaCellLocation localCdmaCellLocation = (CdmaCellLocation)localCellLocation;
        this.g = (localCdmaCellLocation.getBaseStationLatitude() / 14400.0D);
        this.i = (localCdmaCellLocation.getBaseStationLongitude() / 14400.0D);
        this.m = localCdmaCellLocation.getSystemId();
        this.b = localCdmaCellLocation.getBaseStationId();
        this.l = localCdmaCellLocation.getNetworkId();
        new StringBuilder().append(this.m);
        ac.c();
        new StringBuilder().append(this.b);
        ac.c();
        new StringBuilder().append(this.l);
        ac.c();
        a locala = new a();
        locala.a(this.b);
        locala.d(this.l);
        locala.c(this.m);
        locala.b(Integer.parseInt(str.substring(0, 3)));
        locala.a(z[13]);
        this.s.add(locala);
        return locala.b();
        this.j = Integer.parseInt(str.substring(0, 3));
        this.k = Integer.parseInt(str.substring(3, i1));
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }

  // ERROR //
  public final JSONArray c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 171	cn/jpush/android/a/b:q	Landroid/telephony/TelephonyManager;
    //   4: invokevirtual 184	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   7: astore 53
    //   9: aload 53
    //   11: astore_2
    //   12: aload_2
    //   13: ifnonnull +29 -> 42
    //   16: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   19: bipush 20
    //   21: aaload
    //   22: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   25: bipush 18
    //   27: aaload
    //   28: invokestatic 273	cn/jpush/android/util/ac:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   31: aconst_null
    //   32: areturn
    //   33: astore_1
    //   34: invokestatic 275	cn/jpush/android/util/ac:i	()V
    //   37: aconst_null
    //   38: astore_2
    //   39: goto -27 -> 12
    //   42: aload_0
    //   43: iconst_0
    //   44: putfield 120	cn/jpush/android/a/b:e	Z
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield 118	cn/jpush/android/a/b:d	Z
    //   52: aload_0
    //   53: iconst_0
    //   54: putfield 116	cn/jpush/android/a/b:c	I
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield 122	cn/jpush/android/a/b:f	I
    //   62: aload_0
    //   63: iconst_0
    //   64: putfield 128	cn/jpush/android/a/b:j	I
    //   67: aload_0
    //   68: iconst_0
    //   69: putfield 130	cn/jpush/android/a/b:k	I
    //   72: aload_0
    //   73: ldc 136
    //   75: putfield 138	cn/jpush/android/a/b:n	Ljava/lang/String;
    //   78: aload_0
    //   79: ldc 136
    //   81: putfield 140	cn/jpush/android/a/b:o	Ljava/lang/String;
    //   84: aload_0
    //   85: ldc 136
    //   87: putfield 142	cn/jpush/android/a/b:p	Ljava/lang/String;
    //   90: aload_0
    //   91: getfield 149	cn/jpush/android/a/b:t	Landroid/content/Context;
    //   94: ifnull +135 -> 229
    //   97: aload_0
    //   98: getfield 149	cn/jpush/android/a/b:t	Landroid/content/Context;
    //   101: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   104: iconst_0
    //   105: aaload
    //   106: invokestatic 154	cn/jpush/android/util/b:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   109: ifne +120 -> 229
    //   112: invokestatic 277	cn/jpush/android/util/ac:d	()V
    //   115: new 279	org/json/JSONArray
    //   118: dup
    //   119: invokespecial 280	org/json/JSONArray:<init>	()V
    //   122: astore 9
    //   124: aload_0
    //   125: invokevirtual 283	cn/jpush/android/a/b:d	()[I
    //   128: astore 10
    //   130: aload_0
    //   131: getfield 122	cn/jpush/android/a/b:f	I
    //   134: i2l
    //   135: lstore 11
    //   137: aload_0
    //   138: getfield 128	cn/jpush/android/a/b:j	I
    //   141: istore 13
    //   143: aload_0
    //   144: getfield 130	cn/jpush/android/a/b:k	I
    //   147: istore 14
    //   149: aload 10
    //   151: arraylength
    //   152: iconst_2
    //   153: if_icmpge +22 -> 175
    //   156: iconst_2
    //   157: newarray int
    //   159: astore 10
    //   161: aload 10
    //   163: iconst_0
    //   164: aload_0
    //   165: getfield 116	cn/jpush/android/a/b:c	I
    //   168: iastore
    //   169: aload 10
    //   171: iconst_1
    //   172: bipush 196
    //   174: iastore
    //   175: iconst_0
    //   176: istore 15
    //   178: iload 15
    //   180: aload 10
    //   182: arraylength
    //   183: if_icmpge +9 -> 192
    //   186: iload 15
    //   188: iconst_4
    //   189: if_icmple +746 -> 935
    //   192: aload_0
    //   193: getfield 118	cn/jpush/android/a/b:d	Z
    //   196: ifeq +943 -> 1139
    //   199: new 285	org/json/JSONObject
    //   202: dup
    //   203: aload_0
    //   204: invokespecial 287	cn/jpush/android/a/b:h	()Ljava/lang/String;
    //   207: invokespecial 289	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   210: astore 16
    //   212: new 279	org/json/JSONArray
    //   215: dup
    //   216: invokespecial 280	org/json/JSONArray:<init>	()V
    //   219: aload 16
    //   221: invokevirtual 293	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   224: astore 19
    //   226: aload 19
    //   228: areturn
    //   229: aload_0
    //   230: getfield 171	cn/jpush/android/a/b:q	Landroid/telephony/TelephonyManager;
    //   233: invokevirtual 184	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   236: astore 52
    //   238: aload 52
    //   240: astore 4
    //   242: aload 4
    //   244: ifnonnull +19 -> 263
    //   247: invokestatic 295	cn/jpush/android/util/ac:a	()V
    //   250: goto -135 -> 115
    //   253: astore_3
    //   254: invokestatic 275	cn/jpush/android/util/ac:i	()V
    //   257: aconst_null
    //   258: astore 4
    //   260: goto -18 -> 242
    //   263: aload_0
    //   264: aload_0
    //   265: getfield 171	cn/jpush/android/a/b:q	Landroid/telephony/TelephonyManager;
    //   268: invokevirtual 298	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   271: putfield 142	cn/jpush/android/a/b:p	Ljava/lang/String;
    //   274: aload_0
    //   275: aload_0
    //   276: getfield 171	cn/jpush/android/a/b:q	Landroid/telephony/TelephonyManager;
    //   279: invokevirtual 301	android/telephony/TelephonyManager:getNetworkType	()I
    //   282: invokestatic 304	cn/jpush/android/util/b:a	(I)Ljava/lang/String;
    //   285: putfield 138	cn/jpush/android/a/b:n	Ljava/lang/String;
    //   288: aload_0
    //   289: aload_0
    //   290: getfield 149	cn/jpush/android/a/b:t	Landroid/content/Context;
    //   293: invokestatic 307	cn/jpush/android/util/b:r	(Landroid/content/Context;)Ljava/lang/String;
    //   296: putfield 140	cn/jpush/android/a/b:o	Ljava/lang/String;
    //   299: new 215	java/lang/StringBuilder
    //   302: dup
    //   303: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   306: bipush 21
    //   308: aaload
    //   309: invokespecial 308	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   312: aload_0
    //   313: getfield 138	cn/jpush/android/a/b:n	Ljava/lang/String;
    //   316: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   322: bipush 16
    //   324: aaload
    //   325: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: aload_0
    //   329: getfield 142	cn/jpush/android/a/b:p	Ljava/lang/String;
    //   332: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   338: bipush 15
    //   340: aaload
    //   341: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: aload_0
    //   345: getfield 140	cn/jpush/android/a/b:o	Ljava/lang/String;
    //   348: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: pop
    //   352: invokestatic 295	cn/jpush/android/util/ac:a	()V
    //   355: aload_0
    //   356: getfield 171	cn/jpush/android/a/b:q	Landroid/telephony/TelephonyManager;
    //   359: invokevirtual 194	android/telephony/TelephonyManager:getPhoneType	()I
    //   362: istore 50
    //   364: iload 50
    //   366: istore 7
    //   368: aload 4
    //   370: instanceof 313
    //   373: ifeq +33 -> 406
    //   376: aload_0
    //   377: iconst_1
    //   378: putfield 120	cn/jpush/android/a/b:e	Z
    //   381: aload 4
    //   383: checkcast 313	android/telephony/gsm/GsmCellLocation
    //   386: astore 51
    //   388: aload_0
    //   389: aload 51
    //   391: invokevirtual 316	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   394: putfield 116	cn/jpush/android/a/b:c	I
    //   397: aload_0
    //   398: aload 51
    //   400: invokevirtual 319	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   403: putfield 122	cn/jpush/android/a/b:f	I
    //   406: aload_0
    //   407: getfield 171	cn/jpush/android/a/b:q	Landroid/telephony/TelephonyManager;
    //   410: invokevirtual 187	android/telephony/TelephonyManager:getNetworkOperator	()Ljava/lang/String;
    //   413: astore 35
    //   415: aload 35
    //   417: invokevirtual 191	java/lang/String:length	()I
    //   420: istore 36
    //   422: iload 36
    //   424: iconst_3
    //   425: if_icmple +32 -> 457
    //   428: aload_0
    //   429: aload 35
    //   431: iconst_0
    //   432: iconst_3
    //   433: invokevirtual 236	java/lang/String:substring	(II)Ljava/lang/String;
    //   436: invokestatic 242	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   439: putfield 128	cn/jpush/android/a/b:j	I
    //   442: aload_0
    //   443: aload 35
    //   445: iconst_3
    //   446: iload 36
    //   448: invokevirtual 236	java/lang/String:substring	(II)Ljava/lang/String;
    //   451: invokestatic 242	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   454: putfield 130	cn/jpush/android/a/b:k	I
    //   457: iload 7
    //   459: iconst_2
    //   460: if_icmpne -345 -> 115
    //   463: aload 4
    //   465: instanceof 196
    //   468: ifeq +269 -> 737
    //   471: aload 4
    //   473: checkcast 196	android/telephony/cdma/CdmaCellLocation
    //   476: astore 45
    //   478: aload_0
    //   479: aload 45
    //   481: invokevirtual 199	android/telephony/cdma/CdmaCellLocation:getBaseStationLatitude	()I
    //   484: i2d
    //   485: ldc2_w 200
    //   488: ddiv
    //   489: putfield 124	cn/jpush/android/a/b:g	D
    //   492: aload_0
    //   493: aload 45
    //   495: invokevirtual 204	android/telephony/cdma/CdmaCellLocation:getBaseStationLongitude	()I
    //   498: i2d
    //   499: ldc2_w 200
    //   502: ddiv
    //   503: putfield 126	cn/jpush/android/a/b:i	D
    //   506: aload_0
    //   507: aload 45
    //   509: invokevirtual 207	android/telephony/cdma/CdmaCellLocation:getSystemId	()I
    //   512: putfield 134	cn/jpush/android/a/b:m	I
    //   515: aload_0
    //   516: aload 45
    //   518: invokevirtual 210	android/telephony/cdma/CdmaCellLocation:getBaseStationId	()I
    //   521: putfield 114	cn/jpush/android/a/b:b	I
    //   524: aload_0
    //   525: aload 45
    //   527: invokevirtual 213	android/telephony/cdma/CdmaCellLocation:getNetworkId	()I
    //   530: putfield 132	cn/jpush/android/a/b:l	I
    //   533: new 215	java/lang/StringBuilder
    //   536: dup
    //   537: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   540: bipush 9
    //   542: aaload
    //   543: invokespecial 308	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   546: aload_0
    //   547: getfield 134	cn/jpush/android/a/b:m	I
    //   550: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   553: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   556: bipush 25
    //   558: aaload
    //   559: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   562: aload_0
    //   563: getfield 114	cn/jpush/android/a/b:b	I
    //   566: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   569: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   572: iconst_4
    //   573: aaload
    //   574: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: aload_0
    //   578: getfield 132	cn/jpush/android/a/b:l	I
    //   581: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   584: pop
    //   585: invokestatic 222	cn/jpush/android/util/ac:c	()V
    //   588: new 224	cn/jpush/android/a/a
    //   591: dup
    //   592: invokespecial 225	cn/jpush/android/a/a:<init>	()V
    //   595: astore 47
    //   597: aload 47
    //   599: aload_0
    //   600: getfield 114	cn/jpush/android/a/b:b	I
    //   603: invokevirtual 228	cn/jpush/android/a/a:a	(I)V
    //   606: aload 47
    //   608: aload_0
    //   609: getfield 132	cn/jpush/android/a/b:l	I
    //   612: invokevirtual 230	cn/jpush/android/a/a:d	(I)V
    //   615: aload 47
    //   617: aload_0
    //   618: getfield 134	cn/jpush/android/a/b:m	I
    //   621: invokevirtual 232	cn/jpush/android/a/a:c	(I)V
    //   624: aload 35
    //   626: ifnull +27 -> 653
    //   629: aload 35
    //   631: invokevirtual 191	java/lang/String:length	()I
    //   634: iconst_3
    //   635: if_icmplt +18 -> 653
    //   638: aload 47
    //   640: aload 35
    //   642: iconst_0
    //   643: iconst_3
    //   644: invokevirtual 236	java/lang/String:substring	(II)Ljava/lang/String;
    //   647: invokestatic 242	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   650: invokevirtual 244	cn/jpush/android/a/a:b	(I)V
    //   653: aload 47
    //   655: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   658: bipush 13
    //   660: aaload
    //   661: invokevirtual 247	cn/jpush/android/a/a:a	(Ljava/lang/String;)V
    //   664: aload_0
    //   665: getfield 147	cn/jpush/android/a/b:s	Ljava/util/ArrayList;
    //   668: aload 47
    //   670: invokevirtual 251	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   673: pop
    //   674: new 215	java/lang/StringBuilder
    //   677: dup
    //   678: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   681: bipush 11
    //   683: aaload
    //   684: invokespecial 308	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   687: aload 47
    //   689: invokevirtual 253	cn/jpush/android/a/a:a	()I
    //   692: invokevirtual 220	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   695: pop
    //   696: invokestatic 255	cn/jpush/android/util/ac:b	()V
    //   699: aload_0
    //   700: aload 47
    //   702: invokevirtual 258	cn/jpush/android/a/a:toString	()Ljava/lang/String;
    //   705: putfield 260	cn/jpush/android/a/b:r	Ljava/lang/String;
    //   708: aload_0
    //   709: iconst_1
    //   710: putfield 118	cn/jpush/android/a/b:d	Z
    //   713: goto -598 -> 115
    //   716: astore 8
    //   718: invokestatic 275	cn/jpush/android/util/ac:i	()V
    //   721: goto -606 -> 115
    //   724: astore 6
    //   726: iconst_0
    //   727: istore 7
    //   729: aload 6
    //   731: invokevirtual 266	java/lang/Exception:printStackTrace	()V
    //   734: goto -328 -> 406
    //   737: aload 4
    //   739: invokevirtual 323	java/lang/Object:getClass	()Ljava/lang/Class;
    //   742: astore 37
    //   744: iconst_0
    //   745: anewarray 325	java/lang/Class
    //   748: astore 38
    //   750: aload 37
    //   752: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   755: bipush 19
    //   757: aaload
    //   758: aload 38
    //   760: invokevirtual 329	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   763: astore 39
    //   765: aload 37
    //   767: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   770: bipush 6
    //   772: aaload
    //   773: aload 38
    //   775: invokevirtual 329	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   778: astore 40
    //   780: aload 37
    //   782: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   785: bipush 22
    //   787: aaload
    //   788: aload 38
    //   790: invokevirtual 329	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   793: astore 41
    //   795: iconst_0
    //   796: anewarray 4	java/lang/Object
    //   799: astore 42
    //   801: aload_0
    //   802: aload 39
    //   804: aload 4
    //   806: aload 42
    //   808: invokevirtual 335	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   811: checkcast 238	java/lang/Integer
    //   814: invokevirtual 338	java/lang/Integer:intValue	()I
    //   817: putfield 114	cn/jpush/android/a/b:b	I
    //   820: aload_0
    //   821: aload 40
    //   823: aload 4
    //   825: aload 42
    //   827: invokevirtual 335	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   830: checkcast 238	java/lang/Integer
    //   833: invokevirtual 338	java/lang/Integer:intValue	()I
    //   836: putfield 134	cn/jpush/android/a/b:m	I
    //   839: aload_0
    //   840: aload 41
    //   842: aload 4
    //   844: aload 42
    //   846: invokevirtual 335	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   849: checkcast 238	java/lang/Integer
    //   852: invokevirtual 338	java/lang/Integer:intValue	()I
    //   855: putfield 132	cn/jpush/android/a/b:l	I
    //   858: aload 37
    //   860: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   863: bipush 10
    //   865: aaload
    //   866: aload 38
    //   868: invokevirtual 329	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   871: astore 43
    //   873: aload 37
    //   875: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   878: iconst_3
    //   879: aaload
    //   880: aload 38
    //   882: invokevirtual 329	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   885: astore 44
    //   887: aload_0
    //   888: aload 43
    //   890: aload 4
    //   892: aload 42
    //   894: invokevirtual 335	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   897: checkcast 238	java/lang/Integer
    //   900: invokevirtual 338	java/lang/Integer:intValue	()I
    //   903: i2d
    //   904: putfield 124	cn/jpush/android/a/b:g	D
    //   907: aload_0
    //   908: aload 44
    //   910: aload 4
    //   912: aload 42
    //   914: invokevirtual 335	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   917: checkcast 238	java/lang/Integer
    //   920: invokevirtual 338	java/lang/Integer:intValue	()I
    //   923: i2d
    //   924: putfield 126	cn/jpush/android/a/b:i	D
    //   927: aload_0
    //   928: iconst_1
    //   929: putfield 118	cn/jpush/android/a/b:d	Z
    //   932: goto -817 -> 115
    //   935: iload 15
    //   937: iconst_1
    //   938: iadd
    //   939: istore 20
    //   941: iload 20
    //   943: iflt +174 -> 1117
    //   946: iload 20
    //   948: bipush 31
    //   950: if_icmpgt +167 -> 1117
    //   953: bipush 143
    //   955: iload 20
    //   957: iconst_2
    //   958: imul
    //   959: iadd
    //   960: istore 21
    //   962: new 285	org/json/JSONObject
    //   965: dup
    //   966: invokespecial 339	org/json/JSONObject:<init>	()V
    //   969: astore 22
    //   971: aload 22
    //   973: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   976: bipush 17
    //   978: aaload
    //   979: aload 10
    //   981: iload 15
    //   983: iaload
    //   984: invokevirtual 342	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   987: pop
    //   988: aload 22
    //   990: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   993: bipush 24
    //   995: aaload
    //   996: lload 11
    //   998: invokevirtual 345	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   1001: pop
    //   1002: aload 22
    //   1004: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   1007: bipush 7
    //   1009: aaload
    //   1010: iload 13
    //   1012: invokevirtual 342	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   1015: pop
    //   1016: aload 22
    //   1018: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   1021: bipush 12
    //   1023: aaload
    //   1024: iload 14
    //   1026: invokevirtual 342	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   1029: pop
    //   1030: aload 22
    //   1032: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   1035: iconst_2
    //   1036: aaload
    //   1037: iload 21
    //   1039: invokevirtual 342	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   1042: pop
    //   1043: aload 22
    //   1045: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   1048: bipush 23
    //   1050: aaload
    //   1051: iconst_0
    //   1052: invokevirtual 342	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   1055: pop
    //   1056: aload 22
    //   1058: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   1061: bipush 8
    //   1063: aaload
    //   1064: aload_0
    //   1065: getfield 138	cn/jpush/android/a/b:n	Ljava/lang/String;
    //   1068: invokevirtual 348	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1071: pop
    //   1072: aload 22
    //   1074: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   1077: iconst_5
    //   1078: aaload
    //   1079: aload_0
    //   1080: getfield 140	cn/jpush/android/a/b:o	Ljava/lang/String;
    //   1083: invokevirtual 348	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1086: pop
    //   1087: aload 22
    //   1089: getstatic 105	cn/jpush/android/a/b:z	[Ljava/lang/String;
    //   1092: bipush 14
    //   1094: aaload
    //   1095: aload_0
    //   1096: getfield 142	cn/jpush/android/a/b:p	Ljava/lang/String;
    //   1099: invokevirtual 348	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1102: pop
    //   1103: aload 9
    //   1105: aload 22
    //   1107: invokevirtual 293	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   1110: pop
    //   1111: iinc 15 2
    //   1114: goto -936 -> 178
    //   1117: iconst_0
    //   1118: istore 21
    //   1120: goto -158 -> 962
    //   1123: astore 23
    //   1125: aload 23
    //   1127: invokevirtual 351	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1130: pop
    //   1131: invokestatic 353	cn/jpush/android/util/ac:e	()V
    //   1134: goto -23 -> 1111
    //   1137: astore 18
    //   1139: aload 9
    //   1141: areturn
    //   1142: astore 17
    //   1144: goto -5 -> 1139
    //   1147: astore 6
    //   1149: goto -420 -> 729
    //
    // Exception table:
    //   from	to	target	type
    //   0	9	33	java/lang/Exception
    //   229	238	253	java/lang/Exception
    //   406	422	716	java/lang/Exception
    //   428	457	716	java/lang/Exception
    //   463	624	716	java/lang/Exception
    //   629	653	716	java/lang/Exception
    //   653	713	716	java/lang/Exception
    //   737	932	716	java/lang/Exception
    //   355	364	724	java/lang/Exception
    //   962	1111	1123	java/lang/Exception
    //   199	226	1137	java/lang/NullPointerException
    //   199	226	1142	org/json/JSONException
    //   368	406	1147	java/lang/Exception
  }

  public final int[] d()
  {
    if (this.c == 0)
      return new int[0];
    List localList = this.q.getNeighboringCellInfo();
    if ((localList == null) || (localList.size() == 0))
    {
      int[] arrayOfInt1 = new int[1];
      arrayOfInt1[0] = this.c;
      return arrayOfInt1;
    }
    int[] arrayOfInt2 = new int[2 + 2 * localList.size()];
    arrayOfInt2[0] = this.c;
    arrayOfInt2[1] = this.a;
    Iterator localIterator = localList.iterator();
    int i1 = 2;
    while (localIterator.hasNext())
    {
      NeighboringCellInfo localNeighboringCellInfo = (NeighboringCellInfo)localIterator.next();
      int i2 = localNeighboringCellInfo.getCid();
      if ((i2 > 0) && (i2 != 65535))
      {
        int i3 = i1 + 1;
        arrayOfInt2[i1] = i2;
        i1 = i3 + 1;
        arrayOfInt2[i3] = localNeighboringCellInfo.getRssi();
      }
    }
    int[] arrayOfInt3 = new int[i1];
    System.arraycopy(arrayOfInt2, 0, arrayOfInt3, 0, i1);
    return arrayOfInt3;
  }

  public final boolean e()
  {
    return this.d;
  }

  public final boolean f()
  {
    return this.e;
  }

  public final float g()
  {
    if (this.d);
    while (!this.e)
      return 1.065353E+09F;
    d();
    return 1.065353E+09F;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */