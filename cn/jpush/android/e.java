package cn.jpush.android;

import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e
{
  public static boolean a;
  public static int b;
  public static String c;
  public static String d;
  public static Context e;
  public static String f;
  public static long g;
  public static String h;
  public static int i;
  public static String j;
  public static boolean k;
  public static boolean l;
  public static boolean m;
  public static boolean n;
  public static b o;
  private static AtomicBoolean p;
  private static ServiceConnection q;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[24];
    int i1 = 0;
    String str1 = "\005\006@\030_\t\027UC\033\"3A\nSH\002D\tp\r\032\024T\033\006\f@Y_\r\005]\027^\fC]\027\033\005\002Z\020]\r\020@";
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
        i8 = 59;
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
        str1 = "\005\006@\030_\t\027UC\033\013\013U\027U\r\017\024T\033\006\f@Y_\r\005]\027^\fC]\027\033\005\002Z\020]\r\020@";
        localObject1 = localObject2;
        i2 = 0;
        break;
      case 0:
        localObject1[i1] = str2;
        i1 = 2;
        str1 = "\"3a*s7\"d)p-:";
        i2 = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i1] = str2;
        i1 = 3;
        str1 = "";
        i2 = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i1] = str2;
        i1 = 4;
        str1 = "";
        i2 = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i1] = str2;
        i1 = 5;
        str1 = "\005\006@\030_\t\027UC\033\013\013U\027U\r\017\024T\033";
        i2 = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i1] = str2;
        i1 = 6;
        str1 = "\"3A\nS/\017[\033Z\004";
        i2 = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i1] = str2;
        i1 = 7;
        str1 = "";
        i2 = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i1] = str2;
        i1 = 8;
        str1 = "";
        i2 = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i1] = str2;
        i1 = 9;
        str1 = "&,\024\024^\034\002\024\035Z\034\002\024\035^\016\nZ\034_H\nZYV\t\r]\037^\033\027\032";
        i2 = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i1] = str2;
        i1 = 10;
        str1 = "\"3a*s7 |8u&&x";
        i2 = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i1] = str2;
        i1 = 11;
        str1 = "\005\006@\030_\t\027UC\033\t\023D2^\021C\031Y";
        i2 = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i1] = str2;
        i1 = 12;
        str1 = "\033\fb\034I\033\n[\027\001";
        i2 = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i1] = str2;
        i1 = 13;
        str1 = "/\006@YH\f\b\024\017^\032\020]\026UH\005U\020WI8莃厯H\f\b牼杕夊赍Bi";
        i2 = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i1] = str2;
        i1 = 14;
        str1 = "&,\024\017^\032\020]\026U+\fP\034\033\007\021\024\017^\032\020]\026U&\002Y\034\033\f\006R\020U\r\007\024\020UH\016U\027R\016\006G\r\025";
        i2 = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i1] = str2;
        i1 = 15;
        str1 = "";
        i2 = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i1] = str2;
        i1 = 16;
        str1 = "\016\002X\n^";
        i2 = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i1] = str2;
        i1 = 17;
        str1 = ":\006Y\026O\rCg\034I\036\nW\034\033\n\nZ\035\033\016\002]\025^\fCW\030N\033\006PYY\021Cg\034X\035\021]\rB-\033W\034K\034\n[\027\032";
        i2 = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i1] = str2;
        i1 = 18;
        str1 = "\034\021A\034";
        i2 = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i1] = str2;
        i1 = 19;
        str1 = "\002\002B\030\025\006\006@WK\032\006R\034I!3BMh\034\002W\022";
        i2 = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i1] = str2;
        i1 = 20;
        str1 = "";
        i2 = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i1] = str2;
        i1 = 21;
        str1 = "\002\002B\030\025\006\006@WK\032\006R\034I!3BOz\f\007F\034H\033\006G";
        i2 = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i1] = str2;
        i1 = 22;
        str1 = "<\"s";
        i2 = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i1] = str2;
        i1 = 23;
        str1 = "";
        i2 = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i1] = str2;
        z = localObject2;
        a = false;
        p = new AtomicBoolean(false);
        g = 0L;
        h = "";
        k = false;
        l = false;
        m = false;
        n = true;
        q = new f();
        return;
        i8 = 104;
        continue;
        i8 = 99;
        continue;
        i8 = 52;
        continue;
        i8 = 121;
      }
    }
  }

  // ERROR //
  private static boolean a()
  {
    // Byte code:
    //   0: invokestatic 135	cn/jpush/android/service/PushProtocol:GetSdkVersion	()I
    //   3: istore_3
    //   4: iload_3
    //   5: istore_1
    //   6: new 137	java/lang/StringBuilder
    //   9: dup
    //   10: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   13: bipush 12
    //   15: aaload
    //   16: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: iload_1
    //   20: invokevirtual 144	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: invokestatic 148	cn/jpush/android/util/ac:a	()V
    //   27: iconst_0
    //   28: istore_2
    //   29: iload_1
    //   30: sipush 200
    //   33: if_icmplt +5 -> 38
    //   36: iconst_1
    //   37: istore_2
    //   38: iload_2
    //   39: ireturn
    //   40: astore_0
    //   41: iconst_0
    //   42: istore_1
    //   43: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   46: bipush 6
    //   48: aaload
    //   49: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   52: bipush 13
    //   54: aaload
    //   55: invokestatic 151	cn/jpush/android/util/ac:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: aload_0
    //   59: invokevirtual 154	java/lang/UnsatisfiedLinkError:printStackTrace	()V
    //   62: goto -35 -> 27
    //   65: astore_0
    //   66: goto -23 -> 43
    //
    // Exception table:
    //   from	to	target	type
    //   0	4	40	java/lang/UnsatisfiedLinkError
    //   6	27	65	java/lang/UnsatisfiedLinkError
  }

  // ERROR //
  public static boolean a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 106	cn/jpush/android/e:p	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: invokevirtual 162	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   9: istore_2
    //   10: iload_2
    //   11: ifeq +12 -> 23
    //   14: iconst_1
    //   15: istore 4
    //   17: ldc 2
    //   19: monitorexit
    //   20: iload 4
    //   22: ireturn
    //   23: invokestatic 164	cn/jpush/android/util/ac:b	()V
    //   26: aload_0
    //   27: invokevirtual 170	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   30: invokestatic 175	cn/jpush/android/util/i:q	(Landroid/content/Context;)V
    //   33: aload_0
    //   34: invokestatic 179	cn/jpush/android/helpers/k:a	(Landroid/content/Context;)V
    //   37: invokestatic 181	cn/jpush/android/e:a	()Z
    //   40: ifne +30 -> 70
    //   43: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   46: bipush 6
    //   48: aaload
    //   49: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   52: bipush 20
    //   54: aaload
    //   55: invokestatic 151	cn/jpush/android/util/ac:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: iconst_0
    //   59: istore 4
    //   61: goto -44 -> 17
    //   64: astore_1
    //   65: ldc 2
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    //   70: aload_0
    //   71: invokevirtual 184	android/content/Context:getPackageName	()Ljava/lang/String;
    //   74: putstatic 186	cn/jpush/android/e:c	Ljava/lang/String;
    //   77: aload_0
    //   78: invokevirtual 170	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   81: putstatic 188	cn/jpush/android/e:e	Landroid/content/Context;
    //   84: invokestatic 194	cn/jpush/android/a:x	()J
    //   87: putstatic 108	cn/jpush/android/e:g	J
    //   90: invokestatic 197	cn/jpush/android/a:A	()Ljava/lang/String;
    //   93: putstatic 112	cn/jpush/android/e:h	Ljava/lang/String;
    //   96: aload_0
    //   97: invokestatic 200	cn/jpush/android/e:c	(Landroid/content/Context;)Landroid/content/pm/ApplicationInfo;
    //   100: astore_3
    //   101: aload_3
    //   102: ifnonnull +24 -> 126
    //   105: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   108: bipush 6
    //   110: aaload
    //   111: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   114: bipush 15
    //   116: aaload
    //   117: invokestatic 151	cn/jpush/android/util/ac:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   120: iconst_0
    //   121: istore 4
    //   123: goto -106 -> 17
    //   126: aload_3
    //   127: getfield 205	android/content/pm/ApplicationInfo:icon	I
    //   130: putstatic 207	cn/jpush/android/e:b	I
    //   133: getstatic 207	cn/jpush/android/e:b	I
    //   136: ifne +18 -> 154
    //   139: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   142: bipush 6
    //   144: aaload
    //   145: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   148: bipush 23
    //   150: aaload
    //   151: invokestatic 151	cn/jpush/android/util/ac:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   154: aload_0
    //   155: invokevirtual 211	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   158: aload_3
    //   159: invokevirtual 217	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   162: invokeinterface 222 1 0
    //   167: putstatic 224	cn/jpush/android/e:d	Ljava/lang/String;
    //   170: aload_0
    //   171: invokevirtual 211	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   174: aload_0
    //   175: invokevirtual 184	android/content/Context:getPackageName	()Ljava/lang/String;
    //   178: iconst_0
    //   179: invokevirtual 228	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   182: astore 14
    //   184: aload 14
    //   186: getfield 233	android/content/pm/PackageInfo:versionCode	I
    //   189: putstatic 235	cn/jpush/android/e:i	I
    //   192: aload 14
    //   194: getfield 238	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   197: astore 15
    //   199: aload 15
    //   201: putstatic 240	cn/jpush/android/e:j	Ljava/lang/String;
    //   204: aload 15
    //   206: invokevirtual 243	java/lang/String:length	()I
    //   209: bipush 30
    //   211: if_icmple +15 -> 226
    //   214: getstatic 240	cn/jpush/android/e:j	Ljava/lang/String;
    //   217: iconst_0
    //   218: bipush 30
    //   220: invokevirtual 247	java/lang/String:substring	(II)Ljava/lang/String;
    //   223: putstatic 240	cn/jpush/android/e:j	Ljava/lang/String;
    //   226: aload_0
    //   227: invokestatic 249	cn/jpush/android/e:b	(Landroid/content/Context;)Z
    //   230: istore 6
    //   232: iconst_0
    //   233: istore 4
    //   235: iload 6
    //   237: ifeq -220 -> 17
    //   240: getstatic 254	android/os/Build$VERSION:SDK_INT	I
    //   243: bipush 14
    //   245: if_icmplt +36 -> 281
    //   248: aload_0
    //   249: instanceof 256
    //   252: ifeq +29 -> 281
    //   255: aload_0
    //   256: invokestatic 260	cn/jpush/android/util/b:g	(Landroid/content/Context;)Z
    //   259: istore 13
    //   261: iload 13
    //   263: putstatic 263	cn/jpush/android/api/k:a	Z
    //   266: iload 13
    //   268: ifeq +13 -> 281
    //   271: aload_0
    //   272: invokevirtual 170	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   275: checkcast 256	android/app/Application
    //   278: invokestatic 266	cn/jpush/android/api/k:a	(Landroid/app/Application;)V
    //   281: getstatic 254	android/os/Build$VERSION:SDK_INT	I
    //   284: bipush 8
    //   286: if_icmpne +35 -> 321
    //   289: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   292: bipush 19
    //   294: aaload
    //   295: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   298: bipush 18
    //   300: aaload
    //   301: invokestatic 272	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   304: pop
    //   305: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   308: bipush 21
    //   310: aaload
    //   311: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   314: bipush 16
    //   316: aaload
    //   317: invokestatic 272	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   320: pop
    //   321: getstatic 106	cn/jpush/android/e:p	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   324: iconst_1
    //   325: invokevirtual 275	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   328: aload_0
    //   329: invokevirtual 170	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   332: astore 7
    //   334: new 277	android/content/Intent
    //   337: dup
    //   338: invokespecial 278	android/content/Intent:<init>	()V
    //   341: astore 8
    //   343: aload 8
    //   345: aload 7
    //   347: ldc_w 280
    //   350: invokevirtual 284	android/content/Intent:setClass	(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
    //   353: pop
    //   354: aload 7
    //   356: aload 8
    //   358: getstatic 126	cn/jpush/android/e:q	Landroid/content/ServiceConnection;
    //   361: iconst_1
    //   362: invokevirtual 288	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   365: ifeq +32 -> 397
    //   368: invokestatic 148	cn/jpush/android/util/ac:a	()V
    //   371: iconst_1
    //   372: istore 4
    //   374: goto -357 -> 17
    //   377: astore 5
    //   379: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   382: bipush 6
    //   384: aaload
    //   385: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   388: bipush 14
    //   390: aaload
    //   391: invokestatic 290	cn/jpush/android/util/ac:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   394: goto -168 -> 226
    //   397: invokestatic 148	cn/jpush/android/util/ac:a	()V
    //   400: goto -29 -> 371
    //   403: astore 10
    //   405: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   408: bipush 22
    //   410: aaload
    //   411: getstatic 97	cn/jpush/android/e:z	[Ljava/lang/String;
    //   414: bipush 17
    //   416: aaload
    //   417: invokestatic 292	cn/jpush/android/util/ac:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   420: goto -49 -> 371
    //
    // Exception table:
    //   from	to	target	type
    //   3	10	64	finally
    //   23	58	64	finally
    //   70	101	64	finally
    //   105	120	64	finally
    //   126	154	64	finally
    //   154	170	64	finally
    //   170	226	64	finally
    //   226	232	64	finally
    //   240	266	64	finally
    //   271	281	64	finally
    //   281	321	64	finally
    //   321	354	64	finally
    //   354	371	64	finally
    //   379	394	64	finally
    //   397	400	64	finally
    //   405	420	64	finally
    //   170	226	377	java/lang/Exception
    //   354	371	403	java/lang/SecurityException
    //   397	400	403	java/lang/SecurityException
  }

  private static boolean b(Context paramContext)
  {
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if (localApplicationInfo != null)
      {
        localBundle = localApplicationInfo.metaData;
        if (localBundle == null)
          break label287;
        String str1 = localBundle.getString(z[2]);
        f = str1;
        if (an.a(str1))
        {
          ac.e(z[6], z[0]);
          return false;
        }
      }
      else
      {
        ac.b(z[6], z[3]);
        return false;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      ac.a(z[6], z[4], localNameNotFoundException);
      return false;
    }
    Bundle localBundle;
    if (f.length() != 24)
    {
      ac.e(z[6], z[7] + f + z[8]);
      a.c(paramContext, 1008);
      return false;
    }
    f = f.toLowerCase(Locale.getDefault());
    ac.b(z[6], z[11] + f);
    a.h(f);
    String str2 = an.c(localBundle.getString(z[10]));
    if (an.a(str2))
      ac.b(z[6], z[1]);
    while (true)
    {
      return true;
      ac.b(z[6], z[5] + str2);
      a.i(str2);
    }
    label287: ac.b(z[6], z[9]);
    return false;
  }

  private static ApplicationInfo c(Context paramContext)
  {
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 0);
      return localApplicationInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      ac.b(z[6], z[4], localNameNotFoundException);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */