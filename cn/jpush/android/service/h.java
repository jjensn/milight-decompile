package cn.jpush.android.service;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import cn.jpush.android.data.f;
import cn.jpush.android.util.ac;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class h
{
  private static h a;
  private static ExecutorService b;
  private static f f;
  private static cn.jpush.android.data.h g;
  private static Object h;
  private static final String[] z;
  private Handler c = null;
  private Context d = null;
  private String e = "";

  static
  {
    Object localObject1 = new String[14];
    int i = 0;
    String str1 = "\005WNEt\003hXWp\001hO_z&dZBu ixSr;bI";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label36: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label52: int i2;
    int i3;
    if (k <= 1)
    {
      localObject4 = localObject3;
      n = m;
      i1 = k;
      localObject5 = localObject3;
      i2 = localObject5[m];
      switch (n % 5)
      {
      default:
        i3 = 28;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[m] = (char)(i3 ^ i2);
      m = n + 1;
      if (i1 == 0)
      {
        localObject5 = localObject4;
        n = m;
        m = i1;
        break label52;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = ",k^WnofWZ<#hXWpoiTBu)nXWh&hU\026";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "=bVYj*'WY.k\033Us:iO\026&o";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "=bVYj*'wY.kuYh&aRU};nTX<";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "?hHB<+bWWe*c\033\f<";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = ".c_\026P dZZR sRPu,fO_s!";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "&iRB<\003hXWp\001hO_z&dZBu i\033U}<s\033Sd?s\001";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "aw^Dq&tH_s!)qfI\034Od{Y\034TzqY";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "!hO_z&dZ_s!XOOl*";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "\"bHE}(b";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = ".wKx";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "<bURy=N_";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = ";uRQ{*uwxW&kWfn d^Eou'";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        z = localObject2;
        a = null;
        b = Executors.newSingleThreadExecutor();
        f = null;
        g = new cn.jpush.android.data.h();
        h = new Object();
        return;
        i3 = 79;
        continue;
        i3 = 7;
        continue;
        i3 = 59;
        continue;
        i3 = 54;
      }
    }
  }

  private h(Context paramContext)
  {
    ac.b();
    this.c = new Handler(Looper.getMainLooper());
    this.d = paramContext;
    this.e = this.d.getPackageName();
  }

  public static h a(Context paramContext)
  {
    ac.b();
    synchronized (h)
    {
      if (a == null)
        a = new h(paramContext);
      return a;
    }
  }

  private void a(long paramLong1, long paramLong2)
  {
    try
    {
      ac.b();
      if (paramLong1 < 0L)
        ac.e();
      while (true)
      {
        return;
        if (this.c != null)
        {
          localj = new j(this, paramLong1);
          if (paramLong2 > 0L)
            break;
          ac.b();
          this.c.post(localj);
        }
      }
    }
    finally
    {
    }
    while (true)
    {
      j localj;
      new StringBuilder(z[4]).append(paramLong2);
      ac.b();
      this.c.postDelayed(localj, paramLong2);
    }
  }

  private void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    ac.b();
    Intent localIntent = new Intent(z[8]);
    localIntent.putExtra(z[12], paramString3);
    localIntent.putExtra(z[11], paramString2);
    localIntent.putExtra(z[10], paramString1);
    localIntent.putExtra(z[9], 1);
    localIntent.addCategory(paramString2);
    paramContext.sendOrderedBroadcast(localIntent, paramString2 + z[7]);
    ac.b();
  }

  // ERROR //
  private void e(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 102	cn/jpush/android/util/ac:b	()V
    //   5: aconst_null
    //   6: astore_3
    //   7: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   10: ifnonnull +14 -> 24
    //   13: new 187	cn/jpush/android/data/f
    //   16: dup
    //   17: aload_1
    //   18: invokespecial 188	cn/jpush/android/data/f:<init>	(Landroid/content/Context;)V
    //   21: putstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   24: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   27: iconst_1
    //   28: invokevirtual 191	cn/jpush/android/data/f:a	(Z)Z
    //   31: pop
    //   32: invokestatic 197	java/lang/System:currentTimeMillis	()J
    //   35: lstore 8
    //   37: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   40: iconst_1
    //   41: lload 8
    //   43: invokevirtual 200	cn/jpush/android/data/f:a	(IJ)Landroid/database/Cursor;
    //   46: astore 10
    //   48: aload 10
    //   50: astore 5
    //   52: aload 5
    //   54: invokeinterface 206 1 0
    //   59: ifeq +75 -> 134
    //   62: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   65: aload 5
    //   67: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   70: invokevirtual 209	cn/jpush/android/data/f:a	(Landroid/database/Cursor;Lcn/jpush/android/data/h;)V
    //   73: aload_0
    //   74: aload_1
    //   75: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   78: invokevirtual 211	cn/jpush/android/data/h:d	()Ljava/lang/String;
    //   81: aload_0
    //   82: getfield 98	cn/jpush/android/service/h:e	Ljava/lang/String;
    //   85: ldc 96
    //   87: invokespecial 181	cn/jpush/android/service/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   90: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   93: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   96: invokevirtual 213	cn/jpush/android/data/h:a	()J
    //   99: iconst_0
    //   100: iconst_0
    //   101: iconst_0
    //   102: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   105: invokevirtual 211	cn/jpush/android/data/h:d	()Ljava/lang/String;
    //   108: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   111: invokevirtual 215	cn/jpush/android/data/h:f	()J
    //   114: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   117: invokevirtual 217	cn/jpush/android/data/h:e	()J
    //   120: invokevirtual 220	cn/jpush/android/data/f:b	(JIIILjava/lang/String;JJ)Z
    //   123: pop
    //   124: aload 5
    //   126: invokeinterface 223 1 0
    //   131: ifne -69 -> 62
    //   134: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   137: invokevirtual 225	cn/jpush/android/data/f:a	()V
    //   140: aload 5
    //   142: ifnull +10 -> 152
    //   145: aload 5
    //   147: invokeinterface 228 1 0
    //   152: aload_0
    //   153: monitorexit
    //   154: return
    //   155: astore 6
    //   157: getstatic 68	cn/jpush/android/service/h:z	[Ljava/lang/String;
    //   160: iconst_0
    //   161: aaload
    //   162: new 138	java/lang/StringBuilder
    //   165: dup
    //   166: getstatic 68	cn/jpush/android/service/h:z	[Ljava/lang/String;
    //   169: bipush 13
    //   171: aaload
    //   172: invokespecial 141	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   175: aload 6
    //   177: invokevirtual 231	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   180: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: invokestatic 234	cn/jpush/android/util/ac:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   189: aload 6
    //   191: invokevirtual 237	java/lang/Exception:printStackTrace	()V
    //   194: aload_3
    //   195: ifnull -43 -> 152
    //   198: aload_3
    //   199: invokeinterface 228 1 0
    //   204: goto -52 -> 152
    //   207: astore_2
    //   208: aload_0
    //   209: monitorexit
    //   210: aload_2
    //   211: athrow
    //   212: astore 4
    //   214: aconst_null
    //   215: astore 5
    //   217: aload 5
    //   219: ifnull +10 -> 229
    //   222: aload 5
    //   224: invokeinterface 228 1 0
    //   229: aload 4
    //   231: athrow
    //   232: astore 4
    //   234: goto -17 -> 217
    //   237: astore 4
    //   239: aload_3
    //   240: astore 5
    //   242: goto -25 -> 217
    //   245: astore 6
    //   247: aload 5
    //   249: astore_3
    //   250: goto -93 -> 157
    //
    // Exception table:
    //   from	to	target	type
    //   7	24	155	java/lang/Exception
    //   24	48	155	java/lang/Exception
    //   2	5	207	finally
    //   145	152	207	finally
    //   198	204	207	finally
    //   222	229	207	finally
    //   229	232	207	finally
    //   7	24	212	finally
    //   24	48	212	finally
    //   52	62	232	finally
    //   62	134	232	finally
    //   134	140	232	finally
    //   157	194	237	finally
    //   52	62	245	java/lang/Exception
    //   62	134	245	java/lang/Exception
    //   134	140	245	java/lang/Exception
  }

  // ERROR //
  public final boolean a(Context paramContext, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 68	cn/jpush/android/service/h:z	[Ljava/lang/String;
    //   5: iconst_0
    //   6: aaload
    //   7: getstatic 68	cn/jpush/android/service/h:z	[Ljava/lang/String;
    //   10: iconst_3
    //   11: aaload
    //   12: invokestatic 240	cn/jpush/android/util/ac:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   18: ifnonnull +14 -> 32
    //   21: new 187	cn/jpush/android/data/f
    //   24: dup
    //   25: aload_1
    //   26: invokespecial 188	cn/jpush/android/data/f:<init>	(Landroid/content/Context;)V
    //   29: putstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   32: aconst_null
    //   33: astore 5
    //   35: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   38: iconst_1
    //   39: invokevirtual 191	cn/jpush/android/data/f:a	(Z)Z
    //   42: pop
    //   43: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   46: lload_2
    //   47: iconst_0
    //   48: invokevirtual 243	cn/jpush/android/data/f:a	(JI)Landroid/database/Cursor;
    //   51: astore 11
    //   53: aload 11
    //   55: astore 5
    //   57: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   60: aload 5
    //   62: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   65: invokevirtual 209	cn/jpush/android/data/f:a	(Landroid/database/Cursor;Lcn/jpush/android/data/h;)V
    //   68: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   71: invokevirtual 246	cn/jpush/android/data/h:b	()I
    //   74: ifle +57 -> 131
    //   77: new 138	java/lang/StringBuilder
    //   80: dup
    //   81: getstatic 68	cn/jpush/android/service/h:z	[Ljava/lang/String;
    //   84: iconst_2
    //   85: aaload
    //   86: invokespecial 141	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   92: invokevirtual 246	cn/jpush/android/data/h:b	()I
    //   95: invokevirtual 249	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: invokestatic 102	cn/jpush/android/util/ac:b	()V
    //   102: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   105: lload_2
    //   106: iconst_0
    //   107: iconst_1
    //   108: iconst_0
    //   109: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   112: invokevirtual 211	cn/jpush/android/data/h:d	()Ljava/lang/String;
    //   115: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   118: invokevirtual 215	cn/jpush/android/data/h:f	()J
    //   121: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   124: invokevirtual 217	cn/jpush/android/data/h:e	()J
    //   127: invokevirtual 220	cn/jpush/android/data/f:b	(JIIILjava/lang/String;JJ)Z
    //   130: pop
    //   131: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   134: invokevirtual 225	cn/jpush/android/data/f:a	()V
    //   137: aload 5
    //   139: ifnull +10 -> 149
    //   142: aload 5
    //   144: invokeinterface 228 1 0
    //   149: aload_0
    //   150: monitorexit
    //   151: iconst_1
    //   152: ireturn
    //   153: astore 9
    //   155: aload 5
    //   157: ifnull -8 -> 149
    //   160: aload 5
    //   162: invokeinterface 228 1 0
    //   167: goto -18 -> 149
    //   170: astore 4
    //   172: aload_0
    //   173: monitorexit
    //   174: aload 4
    //   176: athrow
    //   177: astore 6
    //   179: aconst_null
    //   180: astore 7
    //   182: aload 6
    //   184: astore 8
    //   186: aload 7
    //   188: ifnull +10 -> 198
    //   191: aload 7
    //   193: invokeinterface 228 1 0
    //   198: aload 8
    //   200: athrow
    //   201: astore 12
    //   203: aload 5
    //   205: astore 7
    //   207: aload 12
    //   209: astore 8
    //   211: goto -25 -> 186
    //
    // Exception table:
    //   from	to	target	type
    //   35	53	153	java/lang/Exception
    //   57	131	153	java/lang/Exception
    //   131	137	153	java/lang/Exception
    //   2	32	170	finally
    //   142	149	170	finally
    //   160	167	170	finally
    //   191	198	170	finally
    //   198	201	170	finally
    //   35	53	177	finally
    //   57	131	201	finally
    //   131	137	201	finally
  }

  // ERROR //
  public final boolean a(Context paramContext, cn.jpush.android.data.JPushLocalNotification paramJPushLocalNotification)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 68	cn/jpush/android/service/h:z	[Ljava/lang/String;
    //   5: iconst_0
    //   6: aaload
    //   7: getstatic 68	cn/jpush/android/service/h:z	[Ljava/lang/String;
    //   10: iconst_5
    //   11: aaload
    //   12: invokestatic 240	cn/jpush/android/util/ac:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: invokestatic 197	java/lang/System:currentTimeMillis	()J
    //   18: lstore 4
    //   20: aload_2
    //   21: invokevirtual 255	cn/jpush/android/data/JPushLocalNotification:getBroadcastTime	()J
    //   24: lload 4
    //   26: lsub
    //   27: lstore 6
    //   29: aload_1
    //   30: invokestatic 260	cn/jpush/android/service/ServiceInterface:e	(Landroid/content/Context;)Z
    //   33: ifeq +6 -> 39
    //   36: invokestatic 102	cn/jpush/android/util/ac:b	()V
    //   39: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   42: ifnonnull +14 -> 56
    //   45: new 187	cn/jpush/android/data/f
    //   48: dup
    //   49: aload_1
    //   50: invokespecial 188	cn/jpush/android/data/f:<init>	(Landroid/content/Context;)V
    //   53: putstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   56: aconst_null
    //   57: astore 8
    //   59: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   62: iconst_1
    //   63: invokevirtual 191	cn/jpush/android/data/f:a	(Z)Z
    //   66: pop
    //   67: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   70: aload_2
    //   71: invokevirtual 263	cn/jpush/android/data/JPushLocalNotification:getNotificationId	()J
    //   74: iconst_0
    //   75: invokevirtual 243	cn/jpush/android/data/f:a	(JI)Landroid/database/Cursor;
    //   78: astore 15
    //   80: aload 15
    //   82: astore 8
    //   84: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   87: aload 8
    //   89: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   92: invokevirtual 209	cn/jpush/android/data/f:a	(Landroid/database/Cursor;Lcn/jpush/android/data/h;)V
    //   95: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   98: invokevirtual 213	cn/jpush/android/data/h:a	()J
    //   101: aload_2
    //   102: invokevirtual 263	cn/jpush/android/data/JPushLocalNotification:getNotificationId	()J
    //   105: lcmp
    //   106: ifeq +72 -> 178
    //   109: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   112: aload_2
    //   113: invokevirtual 263	cn/jpush/android/data/JPushLocalNotification:getNotificationId	()J
    //   116: iconst_1
    //   117: iconst_0
    //   118: iconst_0
    //   119: aload_2
    //   120: invokevirtual 266	cn/jpush/android/data/JPushLocalNotification:toJSON	()Ljava/lang/String;
    //   123: aload_2
    //   124: invokevirtual 255	cn/jpush/android/data/JPushLocalNotification:getBroadcastTime	()J
    //   127: lload 4
    //   129: invokevirtual 269	cn/jpush/android/data/f:a	(JIIILjava/lang/String;JJ)J
    //   132: pop2
    //   133: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   136: invokevirtual 225	cn/jpush/android/data/f:a	()V
    //   139: aload 8
    //   141: ifnull +10 -> 151
    //   144: aload 8
    //   146: invokeinterface 228 1 0
    //   151: lload 6
    //   153: ldc2_w 270
    //   156: lcmp
    //   157: ifge +94 -> 251
    //   160: aload_0
    //   161: aload_2
    //   162: invokevirtual 263	cn/jpush/android/data/JPushLocalNotification:getNotificationId	()J
    //   165: lload 6
    //   167: invokespecial 273	cn/jpush/android/service/h:a	(JJ)V
    //   170: iconst_1
    //   171: istore 13
    //   173: aload_0
    //   174: monitorexit
    //   175: iload 13
    //   177: ireturn
    //   178: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   181: aload_2
    //   182: invokevirtual 263	cn/jpush/android/data/JPushLocalNotification:getNotificationId	()J
    //   185: iconst_1
    //   186: iconst_0
    //   187: iconst_0
    //   188: aload_2
    //   189: invokevirtual 266	cn/jpush/android/data/JPushLocalNotification:toJSON	()Ljava/lang/String;
    //   192: aload_2
    //   193: invokevirtual 255	cn/jpush/android/data/JPushLocalNotification:getBroadcastTime	()J
    //   196: lload 4
    //   198: invokevirtual 220	cn/jpush/android/data/f:b	(JIIILjava/lang/String;JJ)Z
    //   201: pop
    //   202: goto -69 -> 133
    //   205: astore 12
    //   207: aload 8
    //   209: ifnull -58 -> 151
    //   212: aload 8
    //   214: invokeinterface 228 1 0
    //   219: goto -68 -> 151
    //   222: astore_3
    //   223: aload_0
    //   224: monitorexit
    //   225: aload_3
    //   226: athrow
    //   227: astore 9
    //   229: aconst_null
    //   230: astore 10
    //   232: aload 9
    //   234: astore 11
    //   236: aload 10
    //   238: ifnull +10 -> 248
    //   241: aload 10
    //   243: invokeinterface 228 1 0
    //   248: aload 11
    //   250: athrow
    //   251: iconst_1
    //   252: istore 13
    //   254: goto -81 -> 173
    //   257: astore 16
    //   259: aload 8
    //   261: astore 10
    //   263: aload 16
    //   265: astore 11
    //   267: goto -31 -> 236
    //
    // Exception table:
    //   from	to	target	type
    //   59	80	205	java/lang/Exception
    //   84	133	205	java/lang/Exception
    //   133	139	205	java/lang/Exception
    //   178	202	205	java/lang/Exception
    //   2	39	222	finally
    //   39	56	222	finally
    //   144	151	222	finally
    //   160	170	222	finally
    //   212	219	222	finally
    //   241	248	222	finally
    //   248	251	222	finally
    //   59	80	227	finally
    //   84	133	257	finally
    //   133	139	257	finally
    //   178	202	257	finally
  }

  public final void b(Context paramContext)
  {
    try
    {
      ac.b(z[0], z[1]);
      if (f == null)
        f = new f(paramContext);
      f.a(true);
      if (f.b())
        ac.b();
      f.a();
      return;
    }
    finally
    {
    }
  }

  // ERROR //
  public final void c(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 102	cn/jpush/android/util/ac:b	()V
    //   5: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   8: ifnonnull +14 -> 22
    //   11: new 187	cn/jpush/android/data/f
    //   14: dup
    //   15: aload_1
    //   16: invokespecial 188	cn/jpush/android/data/f:<init>	(Landroid/content/Context;)V
    //   19: putstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   22: aconst_null
    //   23: astore 5
    //   25: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   28: iconst_0
    //   29: invokevirtual 191	cn/jpush/android/data/f:a	(Z)Z
    //   32: pop
    //   33: invokestatic 197	java/lang/System:currentTimeMillis	()J
    //   36: lstore 11
    //   38: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   41: lload 11
    //   43: ldc2_w 270
    //   46: invokevirtual 278	cn/jpush/android/data/f:a	(JJ)Landroid/database/Cursor;
    //   49: astore 13
    //   51: aload 13
    //   53: astore 5
    //   55: aload 5
    //   57: invokeinterface 206 1 0
    //   62: ifeq +43 -> 105
    //   65: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   68: aload 5
    //   70: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   73: invokevirtual 209	cn/jpush/android/data/f:a	(Landroid/database/Cursor;Lcn/jpush/android/data/h;)V
    //   76: aload_0
    //   77: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   80: invokevirtual 213	cn/jpush/android/data/h:a	()J
    //   83: getstatic 86	cn/jpush/android/service/h:g	Lcn/jpush/android/data/h;
    //   86: invokevirtual 215	cn/jpush/android/data/h:f	()J
    //   89: lload 11
    //   91: lsub
    //   92: invokespecial 273	cn/jpush/android/service/h:a	(JJ)V
    //   95: aload 5
    //   97: invokeinterface 223 1 0
    //   102: ifne -37 -> 65
    //   105: getstatic 80	cn/jpush/android/service/h:f	Lcn/jpush/android/data/f;
    //   108: invokevirtual 225	cn/jpush/android/data/f:a	()V
    //   111: aload 5
    //   113: ifnull +10 -> 123
    //   116: aload 5
    //   118: invokeinterface 228 1 0
    //   123: aload_0
    //   124: monitorexit
    //   125: return
    //   126: astore 9
    //   128: aload 5
    //   130: ifnull -7 -> 123
    //   133: aload 5
    //   135: invokeinterface 228 1 0
    //   140: goto -17 -> 123
    //   143: astore_3
    //   144: new 138	java/lang/StringBuilder
    //   147: dup
    //   148: getstatic 68	cn/jpush/android/service/h:z	[Ljava/lang/String;
    //   151: bipush 6
    //   153: aaload
    //   154: invokespecial 141	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   157: aload_3
    //   158: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: invokestatic 102	cn/jpush/android/util/ac:b	()V
    //   165: aload_3
    //   166: invokevirtual 237	java/lang/Exception:printStackTrace	()V
    //   169: goto -46 -> 123
    //   172: astore_2
    //   173: aload_0
    //   174: monitorexit
    //   175: aload_2
    //   176: athrow
    //   177: astore 6
    //   179: aconst_null
    //   180: astore 7
    //   182: aload 6
    //   184: astore 8
    //   186: aload 7
    //   188: ifnull +10 -> 198
    //   191: aload 7
    //   193: invokeinterface 228 1 0
    //   198: aload 8
    //   200: athrow
    //   201: astore 14
    //   203: aload 5
    //   205: astore 7
    //   207: aload 14
    //   209: astore 8
    //   211: goto -25 -> 186
    //
    // Exception table:
    //   from	to	target	type
    //   25	51	126	java/lang/Exception
    //   55	65	126	java/lang/Exception
    //   65	105	126	java/lang/Exception
    //   105	111	126	java/lang/Exception
    //   5	22	143	java/lang/Exception
    //   116	123	143	java/lang/Exception
    //   133	140	143	java/lang/Exception
    //   191	198	143	java/lang/Exception
    //   198	201	143	java/lang/Exception
    //   2	5	172	finally
    //   5	22	172	finally
    //   116	123	172	finally
    //   133	140	172	finally
    //   144	169	172	finally
    //   191	198	172	finally
    //   198	201	172	finally
    //   25	51	177	finally
    //   55	65	201	finally
    //   65	105	201	finally
    //   105	111	201	finally
  }

  public final void d(Context paramContext)
  {
    ac.b();
    b.execute(new i(this, paramContext));
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */