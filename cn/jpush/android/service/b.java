package cn.jpush.android.service;

import android.content.Context;
import android.os.Bundle;
import cn.jpush.android.g;
import cn.jpush.android.util.ac;
import java.net.HttpURLConnection;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class b
{
  public static boolean b;
  private static final String[] z;
  public boolean a = false;
  private c c = null;
  private long d = 0L;
  private long e = 0L;
  private Bundle f;

  static
  {
    Object localObject1 = new String[22];
    int i = 0;
    String str1 = "C!Z^fL!\016\030{H!\016\n}P%B^~A*I\nz\004\"\\\021\004,Z\nb\004-]^\"\n";
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
        i3 = 18;
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
        str1 = "g+@\nwJ0\0032wJ#Z\026";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\bd]\037dA\002G\022wt%Z\026(";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "E'Z\027}J~J\021eJ(A\037v\004i\016\013`H~";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "J!Z\t}V/\016\035}J*K\035f\0047Z\037fQ7\016\035}@!\016\013|A<^\033qP!J^?\004";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "t%\\\037\004!\\\f}Vd\017_2Q6BD";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "W0A\0162@+Y\020~K%J^p]d[\rwVj";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "\004\"G\022wj%C\033(";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "\bdH\027~A\020A\nsH\bK\020uP,\024";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "\0047O\bwB-B\033BE0FD";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "p,K^`A7A\013`G!\016\032}A7\016\020}PdK\006{W0\016S2";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "\n%^\025";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "\bdH\027~A\nO\023w\036";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "a<]\027f\004\"G\022w\004(K\020uP,\024";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "W0O\fft+]\n{K*\024^";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "F=Z\033a\031";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "g+@\020wG0G\021|";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "v%@\031w";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "g(A\rw";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "`+Y\020~K%J^sC%G\020>\0040\\\0072V!]\n2\td";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "I \033^qL!M\0252A6\\\021`\bdZ\fk\004%I\037{Jd\003^";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "g+@\020wG0\016\n{I!\016\021gPh\016\n`]d\\\033aPd\003^";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        z = localObject2;
        b = true;
        return;
        i3 = 36;
        continue;
        i3 = 68;
        continue;
        i3 = 46;
        continue;
        i3 = 126;
      }
    }
  }

  public b(Context paramContext, cn.jpush.android.data.c paramc, Bundle paramBundle, d paramd, int paramInt)
  {
    ac.a();
    this.a = false;
    this.f = paramBundle;
    this.c = new c(this, paramContext.getMainLooper(), paramd);
    this.c.sendEmptyMessageDelayed(0, 2000L);
    int j;
    while (true)
    {
      if (!b)
      {
        ac.c();
        this.c.removeCallbacksAndMessages(null);
        this.a = true;
        paramd.a(1);
      }
      do
      {
        do
        {
          return;
          if (this.a)
          {
            ac.c();
            this.c.removeCallbacksAndMessages(null);
            paramd.a(1);
            return;
          }
          if (paramc.z != 0)
            break;
          ac.d();
        }
        while (paramd == null);
        this.a = true;
        DownloadService.a.remove(paramc);
        this.c.removeCallbacksAndMessages(null);
        paramd.a(2);
        return;
        if (i < 3)
          break;
        ac.d();
      }
      while (paramd == null);
      this.a = true;
      DownloadService.a.remove(paramc);
      this.c.removeCallbacksAndMessages(null);
      paramd.a(2);
      return;
      j = a(paramContext, paramd, paramc);
      paramc.z = (-1 + paramc.z);
      if (j == -1)
      {
        new StringBuilder(z[21]).append(paramc.z);
        ac.b();
        try
        {
          Thread.sleep(3000L);
        }
        catch (InterruptedException localInterruptedException2)
        {
        }
      }
      else if (j == 0)
      {
        new StringBuilder(z[19]).append(paramc.z);
        ac.b();
        try
        {
          Thread.sleep(3000L);
        }
        catch (InterruptedException localInterruptedException1)
        {
        }
      }
      else
      {
        if (j == 1)
        {
          ac.b();
          this.c.removeCallbacksAndMessages(null);
          this.a = true;
          return;
        }
        if (j != 2)
          break;
        new StringBuilder(z[20]).append(paramc.z);
        ac.b();
        i++;
      }
    }
    if (j == -3)
    {
      this.a = true;
      DownloadService.a.remove(paramc);
      this.c.removeCallbacksAndMessages(null);
      paramd.a(3);
      return;
    }
    ac.b();
    this.a = true;
    DownloadService.a.remove(paramc);
    this.c.removeCallbacksAndMessages(null);
    paramd.a(2);
  }

  private static int a(long paramLong)
  {
    long l = paramLong / 10485760L;
    int i;
    if (l < 1L)
      i = 10;
    while (true)
    {
      return (int)(1.1D * i);
      if (l > 5L)
        i = 50;
      else
        i = (int)(l * 10L);
    }
  }

  // ERROR //
  private int a(Context paramContext, d paramd, cn.jpush.android.data.c paramc)
  {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual 190	cn/jpush/android/data/c:d	()Ljava/lang/String;
    //   4: astore 4
    //   6: ldc 192
    //   8: astore 5
    //   10: aload_3
    //   11: invokevirtual 195	cn/jpush/android/data/c:a	()Z
    //   14: ifeq +474 -> 488
    //   17: aload_3
    //   18: checkcast 197	cn/jpush/android/data/i
    //   21: getfield 201	cn/jpush/android/data/i:M	Ljava/lang/String;
    //   24: astore 169
    //   26: aload 169
    //   28: ifnull +454 -> 482
    //   31: ldc 192
    //   33: aload 169
    //   35: invokevirtual 204	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   38: ifne +444 -> 482
    //   41: aload 169
    //   43: invokevirtual 207	java/lang/String:trim	()Ljava/lang/String;
    //   46: astore 5
    //   48: ldc 192
    //   50: astore 7
    //   52: ldc 192
    //   54: astore 8
    //   56: aload_3
    //   57: invokevirtual 195	cn/jpush/android/data/c:a	()Z
    //   60: ifeq +475 -> 535
    //   63: aload_1
    //   64: invokestatic 212	cn/jpush/android/util/p:a	(Landroid/content/Context;)Ljava/lang/String;
    //   67: astore 7
    //   69: new 150	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 213	java/lang/StringBuilder:<init>	()V
    //   76: aload_3
    //   77: getfield 215	cn/jpush/android/data/c:c	Ljava/lang/String;
    //   80: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   86: bipush 11
    //   88: aaload
    //   89: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: astore 8
    //   97: aload 4
    //   99: invokestatic 227	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   102: ifne +2172 -> 2274
    //   105: aload 7
    //   107: invokestatic 227	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   110: ifne +2164 -> 2274
    //   113: aload 8
    //   115: invokestatic 227	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   118: ifne +2156 -> 2274
    //   121: new 150	java/lang/StringBuilder
    //   124: dup
    //   125: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   128: iconst_3
    //   129: aaload
    //   130: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   133: aload 4
    //   135: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   141: iconst_2
    //   142: aaload
    //   143: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: aload 7
    //   148: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   154: bipush 12
    //   156: aaload
    //   157: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: aload 8
    //   162: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: invokestatic 118	cn/jpush/android/util/ac:c	()V
    //   169: new 229	java/io/File
    //   172: dup
    //   173: aload 7
    //   175: invokespecial 230	java/io/File:<init>	(Ljava/lang/String;)V
    //   178: astore 11
    //   180: aload 11
    //   182: invokevirtual 233	java/io/File:isDirectory	()Z
    //   185: ifne +9 -> 194
    //   188: aload 11
    //   190: invokevirtual 236	java/io/File:mkdirs	()Z
    //   193: pop
    //   194: aload_0
    //   195: getfield 99	cn/jpush/android/service/b:f	Landroid/os/Bundle;
    //   198: aload 4
    //   200: ldc2_w 237
    //   203: invokevirtual 244	android/os/Bundle:getLong	(Ljava/lang/String;J)J
    //   206: lstore 12
    //   208: lconst_0
    //   209: lstore 14
    //   211: aconst_null
    //   212: astore 16
    //   214: aconst_null
    //   215: astore 17
    //   217: aconst_null
    //   218: astore 18
    //   220: aconst_null
    //   221: astore 19
    //   223: aconst_null
    //   224: astore 20
    //   226: lload 12
    //   228: lconst_0
    //   229: lcmp
    //   230: ifgt +1083 -> 1313
    //   233: new 229	java/io/File
    //   236: dup
    //   237: aload 7
    //   239: aload 8
    //   241: invokespecial 247	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   244: astore 21
    //   246: aload 21
    //   248: invokevirtual 250	java/io/File:exists	()Z
    //   251: ifeq +13 -> 264
    //   254: aload 21
    //   256: invokevirtual 254	java/io/File:length	()J
    //   259: lconst_0
    //   260: lcmp
    //   261: ifgt +892 -> 1153
    //   264: invokestatic 97	cn/jpush/android/util/ac:a	()V
    //   267: aload 4
    //   269: ldc2_w 237
    //   272: invokestatic 257	cn/jpush/android/service/b:a	(Ljava/lang/String;J)Ljava/net/HttpURLConnection;
    //   275: astore 22
    //   277: aload 22
    //   279: invokevirtual 263	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   282: astore 45
    //   284: aload 45
    //   286: astore 31
    //   288: aload 31
    //   290: ifnull +658 -> 948
    //   293: aload 22
    //   295: invokevirtual 267	java/net/HttpURLConnection:getResponseCode	()I
    //   298: istore 53
    //   300: iload 53
    //   302: sipush 200
    //   305: if_icmpne +548 -> 853
    //   308: aload 22
    //   310: invokestatic 270	cn/jpush/android/service/b:a	(Ljava/net/HttpURLConnection;)J
    //   313: lstore 54
    //   315: aload_0
    //   316: getfield 99	cn/jpush/android/service/b:f	Landroid/os/Bundle;
    //   319: aload 4
    //   321: lload 54
    //   323: invokevirtual 274	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   326: aload_3
    //   327: lload 54
    //   329: invokestatic 276	cn/jpush/android/service/b:a	(J)I
    //   332: putfield 132	cn/jpush/android/data/c:z	I
    //   335: aload 31
    //   337: ifnull +491 -> 828
    //   340: new 278	java/io/BufferedInputStream
    //   343: dup
    //   344: aload 31
    //   346: invokespecial 281	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   349: astore 30
    //   351: aload 21
    //   353: invokevirtual 284	java/io/File:delete	()Z
    //   356: pop
    //   357: aload 21
    //   359: invokevirtual 287	java/io/File:createNewFile	()Z
    //   362: pop
    //   363: new 289	java/io/FileOutputStream
    //   366: dup
    //   367: aload 21
    //   369: invokespecial 292	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   372: astore 71
    //   374: new 294	java/io/BufferedOutputStream
    //   377: dup
    //   378: aload 71
    //   380: invokespecial 297	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   383: astore 72
    //   385: sipush 1024
    //   388: newarray byte
    //   390: astore 79
    //   392: aload 30
    //   394: aload 79
    //   396: invokevirtual 301	java/io/BufferedInputStream:read	([B)I
    //   399: istore 80
    //   401: iload 80
    //   403: iconst_m1
    //   404: if_icmpeq +278 -> 682
    //   407: aload_0
    //   408: getfield 93	cn/jpush/android/service/b:a	Z
    //   411: ifeq +195 -> 606
    //   414: invokestatic 134	cn/jpush/android/util/ac:d	()V
    //   417: new 188	cn/jpush/android/g
    //   420: dup
    //   421: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   424: bipush 6
    //   426: aaload
    //   427: invokespecial 302	cn/jpush/android/g:<init>	(Ljava/lang/String;)V
    //   430: athrow
    //   431: astore 78
    //   433: aload 31
    //   435: astore 24
    //   437: aload 31
    //   439: astore 28
    //   441: aload 72
    //   443: astore 25
    //   445: aload 71
    //   447: astore 26
    //   449: aload 30
    //   451: astore 27
    //   453: invokestatic 305	cn/jpush/android/util/ac:i	()V
    //   456: aload 24
    //   458: ifnull +8 -> 466
    //   461: aload 24
    //   463: invokevirtual 310	java/io/InputStream:close	()V
    //   466: aload 28
    //   468: aload 27
    //   470: aload 26
    //   472: aload 25
    //   474: aload 22
    //   476: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   479: bipush 254
    //   481: ireturn
    //   482: aconst_null
    //   483: astore 5
    //   485: goto -437 -> 48
    //   488: aload_3
    //   489: invokevirtual 315	cn/jpush/android/data/c:b	()Z
    //   492: ifeq -444 -> 48
    //   495: aload_3
    //   496: checkcast 317	cn/jpush/android/data/s
    //   499: getfield 320	cn/jpush/android/data/s:H	Ljava/lang/String;
    //   502: astore 6
    //   504: aload 6
    //   506: ifnull +23 -> 529
    //   509: ldc 192
    //   511: aload 6
    //   513: invokevirtual 204	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   516: ifne +13 -> 529
    //   519: aload 6
    //   521: invokevirtual 207	java/lang/String:trim	()Ljava/lang/String;
    //   524: astore 5
    //   526: goto -478 -> 48
    //   529: aconst_null
    //   530: astore 5
    //   532: goto -484 -> 48
    //   535: aload_3
    //   536: invokevirtual 315	cn/jpush/android/data/c:b	()Z
    //   539: ifeq +18 -> 557
    //   542: aload_1
    //   543: invokestatic 322	cn/jpush/android/util/p:b	(Landroid/content/Context;)Ljava/lang/String;
    //   546: astore 7
    //   548: aload_3
    //   549: getfield 215	cn/jpush/android/data/c:c	Ljava/lang/String;
    //   552: astore 8
    //   554: goto -457 -> 97
    //   557: aload_3
    //   558: invokevirtual 324	cn/jpush/android/data/c:e	()Z
    //   561: ifeq -464 -> 97
    //   564: aload_1
    //   565: aload_3
    //   566: getfield 215	cn/jpush/android/data/c:c	Ljava/lang/String;
    //   569: invokestatic 327	cn/jpush/android/util/p:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   572: astore 7
    //   574: new 150	java/lang/StringBuilder
    //   577: dup
    //   578: invokespecial 213	java/lang/StringBuilder:<init>	()V
    //   581: aload_3
    //   582: getfield 215	cn/jpush/android/data/c:c	Ljava/lang/String;
    //   585: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   588: aload_3
    //   589: invokevirtual 190	cn/jpush/android/data/c:d	()Ljava/lang/String;
    //   592: invokestatic 332	cn/jpush/android/util/r:b	(Ljava/lang/String;)Ljava/lang/String;
    //   595: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   598: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   601: astore 8
    //   603: goto -506 -> 97
    //   606: aload 72
    //   608: aload 79
    //   610: iconst_0
    //   611: iload 80
    //   613: invokevirtual 336	java/io/BufferedOutputStream:write	([BII)V
    //   616: lload 14
    //   618: iload 80
    //   620: i2l
    //   621: ladd
    //   622: lstore 14
    //   624: aload_0
    //   625: lload 14
    //   627: putfield 89	cn/jpush/android/service/b:d	J
    //   630: aload_0
    //   631: lload 54
    //   633: putfield 91	cn/jpush/android/service/b:e	J
    //   636: goto -244 -> 392
    //   639: astore 77
    //   641: aload 72
    //   643: astore 19
    //   645: aload 71
    //   647: astore 18
    //   649: aload 31
    //   651: astore 16
    //   653: invokestatic 305	cn/jpush/android/util/ac:i	()V
    //   656: aload 31
    //   658: ifnull +8 -> 666
    //   661: aload 31
    //   663: invokevirtual 310	java/io/InputStream:close	()V
    //   666: aload 16
    //   668: aload 30
    //   670: aload 18
    //   672: aload 19
    //   674: aload 22
    //   676: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   679: bipush 254
    //   681: ireturn
    //   682: aload 72
    //   684: invokevirtual 339	java/io/BufferedOutputStream:flush	()V
    //   687: aload 21
    //   689: ifnull +74 -> 763
    //   692: aload 21
    //   694: invokevirtual 254	java/io/File:length	()J
    //   697: lload 54
    //   699: lcmp
    //   700: ifne +63 -> 763
    //   703: aload 5
    //   705: aload 21
    //   707: invokestatic 344	cn/jpush/android/util/k:a	(Ljava/lang/String;Ljava/io/File;)Z
    //   710: ifeq +53 -> 763
    //   713: aload_0
    //   714: getfield 99	cn/jpush/android/service/b:f	Landroid/os/Bundle;
    //   717: aload 4
    //   719: invokevirtual 346	android/os/Bundle:remove	(Ljava/lang/String;)V
    //   722: aload_2
    //   723: ifnull +15 -> 738
    //   726: aload_2
    //   727: aload 21
    //   729: invokevirtual 349	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   732: iconst_0
    //   733: invokeinterface 352 3 0
    //   738: aload 31
    //   740: ifnull +8 -> 748
    //   743: aload 31
    //   745: invokevirtual 310	java/io/InputStream:close	()V
    //   748: aload 31
    //   750: aload 30
    //   752: aload 71
    //   754: aload 72
    //   756: aload 22
    //   758: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   761: iconst_1
    //   762: ireturn
    //   763: invokestatic 134	cn/jpush/android/util/ac:d	()V
    //   766: aload 21
    //   768: invokevirtual 284	java/io/File:delete	()Z
    //   771: ifne +32 -> 803
    //   774: invokestatic 354	cn/jpush/android/util/ac:e	()V
    //   777: aload 31
    //   779: ifnull +8 -> 787
    //   782: aload 31
    //   784: invokevirtual 310	java/io/InputStream:close	()V
    //   787: aload 31
    //   789: aload 30
    //   791: aload 71
    //   793: aload 72
    //   795: aload 22
    //   797: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   800: bipush 254
    //   802: ireturn
    //   803: aload 31
    //   805: ifnull +8 -> 813
    //   808: aload 31
    //   810: invokevirtual 310	java/io/InputStream:close	()V
    //   813: aload 31
    //   815: aload 30
    //   817: aload 71
    //   819: aload 72
    //   821: aload 22
    //   823: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   826: iconst_2
    //   827: ireturn
    //   828: invokestatic 134	cn/jpush/android/util/ac:d	()V
    //   831: aload 31
    //   833: ifnull +8 -> 841
    //   836: aload 31
    //   838: invokevirtual 310	java/io/InputStream:close	()V
    //   841: aload 31
    //   843: aconst_null
    //   844: aconst_null
    //   845: aconst_null
    //   846: aload 22
    //   848: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   851: iconst_0
    //   852: ireturn
    //   853: iload 53
    //   855: sipush 404
    //   858: if_icmpne +47 -> 905
    //   861: new 150	java/lang/StringBuilder
    //   864: dup
    //   865: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   868: bipush 10
    //   870: aaload
    //   871: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   874: aload 4
    //   876: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   879: pop
    //   880: invokestatic 159	cn/jpush/android/util/ac:b	()V
    //   883: aload 31
    //   885: ifnull +8 -> 893
    //   888: aload 31
    //   890: invokevirtual 310	java/io/InputStream:close	()V
    //   893: aconst_null
    //   894: aconst_null
    //   895: aconst_null
    //   896: aconst_null
    //   897: aload 22
    //   899: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   902: bipush 253
    //   904: ireturn
    //   905: new 150	java/lang/StringBuilder
    //   908: dup
    //   909: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   912: iconst_4
    //   913: aaload
    //   914: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   917: iload 53
    //   919: invokevirtual 157	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   922: pop
    //   923: invokestatic 134	cn/jpush/android/util/ac:d	()V
    //   926: aload 31
    //   928: ifnull +8 -> 936
    //   931: aload 31
    //   933: invokevirtual 310	java/io/InputStream:close	()V
    //   936: aconst_null
    //   937: aconst_null
    //   938: aconst_null
    //   939: aconst_null
    //   940: aload 22
    //   942: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   945: bipush 254
    //   947: ireturn
    //   948: invokestatic 134	cn/jpush/android/util/ac:d	()V
    //   951: aload 31
    //   953: ifnull +8 -> 961
    //   956: aload 31
    //   958: invokevirtual 310	java/io/InputStream:close	()V
    //   961: aconst_null
    //   962: aconst_null
    //   963: aconst_null
    //   964: aconst_null
    //   965: aload 22
    //   967: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   970: iconst_0
    //   971: ireturn
    //   972: astore 43
    //   974: aconst_null
    //   975: astore 31
    //   977: aconst_null
    //   978: astore 30
    //   980: invokestatic 305	cn/jpush/android/util/ac:i	()V
    //   983: aload 31
    //   985: ifnull +8 -> 993
    //   988: aload 31
    //   990: invokevirtual 310	java/io/InputStream:close	()V
    //   993: aload 16
    //   995: aload 30
    //   997: aload 18
    //   999: aload 19
    //   1001: aload 22
    //   1003: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1006: bipush 254
    //   1008: ireturn
    //   1009: astore 41
    //   1011: aconst_null
    //   1012: astore 31
    //   1014: aconst_null
    //   1015: astore 30
    //   1017: invokestatic 305	cn/jpush/android/util/ac:i	()V
    //   1020: aload 31
    //   1022: ifnull +8 -> 1030
    //   1025: aload 31
    //   1027: invokevirtual 310	java/io/InputStream:close	()V
    //   1030: aload 16
    //   1032: aload 30
    //   1034: aload 18
    //   1036: aload 19
    //   1038: aload 22
    //   1040: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1043: bipush 254
    //   1045: ireturn
    //   1046: astore 39
    //   1048: aconst_null
    //   1049: astore 31
    //   1051: aconst_null
    //   1052: astore 30
    //   1054: invokestatic 357	cn/jpush/android/util/ac:g	()V
    //   1057: aload 31
    //   1059: ifnull +8 -> 1067
    //   1062: aload 31
    //   1064: invokevirtual 310	java/io/InputStream:close	()V
    //   1067: aload 16
    //   1069: aload 30
    //   1071: aload 18
    //   1073: aload 19
    //   1075: aload 22
    //   1077: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1080: iconst_m1
    //   1081: ireturn
    //   1082: astore 37
    //   1084: aconst_null
    //   1085: astore 31
    //   1087: aconst_null
    //   1088: astore 30
    //   1090: invokestatic 360	cn/jpush/android/util/ac:h	()V
    //   1093: aload 31
    //   1095: ifnull +8 -> 1103
    //   1098: aload 31
    //   1100: invokevirtual 310	java/io/InputStream:close	()V
    //   1103: aload 16
    //   1105: aload 30
    //   1107: aload 18
    //   1109: aload 19
    //   1111: aload 22
    //   1113: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1116: bipush 254
    //   1118: ireturn
    //   1119: astore 32
    //   1121: aconst_null
    //   1122: astore 31
    //   1124: aconst_null
    //   1125: astore 30
    //   1127: aload 31
    //   1129: ifnull +8 -> 1137
    //   1132: aload 31
    //   1134: invokevirtual 310	java/io/InputStream:close	()V
    //   1137: aload 16
    //   1139: aload 30
    //   1141: aload 18
    //   1143: aload 19
    //   1145: aload 22
    //   1147: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1150: aload 32
    //   1152: athrow
    //   1153: aload 21
    //   1155: invokevirtual 254	java/io/File:length	()J
    //   1158: lconst_0
    //   1159: lcmp
    //   1160: ifle +147 -> 1307
    //   1163: aload 4
    //   1165: ldc2_w 237
    //   1168: invokestatic 257	cn/jpush/android/service/b:a	(Ljava/lang/String;J)Ljava/net/HttpURLConnection;
    //   1171: astore 94
    //   1173: aload 94
    //   1175: invokevirtual 263	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   1178: pop
    //   1179: aload 94
    //   1181: invokestatic 270	cn/jpush/android/service/b:a	(Ljava/net/HttpURLConnection;)J
    //   1184: lstore 99
    //   1186: aload 21
    //   1188: invokevirtual 254	java/io/File:length	()J
    //   1191: lload 99
    //   1193: lcmp
    //   1194: ifne +35 -> 1229
    //   1197: aload 5
    //   1199: aload 21
    //   1201: invokestatic 344	cn/jpush/android/util/k:a	(Ljava/lang/String;Ljava/io/File;)Z
    //   1204: ifeq +25 -> 1229
    //   1207: invokestatic 159	cn/jpush/android/util/ac:b	()V
    //   1210: aload_2
    //   1211: ifnull +2448 -> 3659
    //   1214: aload_2
    //   1215: aload 21
    //   1217: invokevirtual 349	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1220: iconst_1
    //   1221: invokeinterface 352 3 0
    //   1226: goto +2433 -> 3659
    //   1229: new 150	java/lang/StringBuilder
    //   1232: dup
    //   1233: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   1236: bipush 13
    //   1238: aaload
    //   1239: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1242: aload 21
    //   1244: invokevirtual 254	java/io/File:length	()J
    //   1247: invokevirtual 363	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1250: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   1253: bipush 8
    //   1255: aaload
    //   1256: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1259: lload 99
    //   1261: invokevirtual 363	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1264: pop
    //   1265: invokestatic 118	cn/jpush/android/util/ac:c	()V
    //   1268: aload 21
    //   1270: invokevirtual 284	java/io/File:delete	()Z
    //   1273: ifne +9 -> 1282
    //   1276: invokestatic 354	cn/jpush/android/util/ac:e	()V
    //   1279: bipush 254
    //   1281: ireturn
    //   1282: iconst_2
    //   1283: ireturn
    //   1284: astore 97
    //   1286: invokestatic 305	cn/jpush/android/util/ac:i	()V
    //   1289: bipush 254
    //   1291: ireturn
    //   1292: astore 96
    //   1294: invokestatic 357	cn/jpush/android/util/ac:g	()V
    //   1297: iconst_m1
    //   1298: ireturn
    //   1299: astore 95
    //   1301: invokestatic 360	cn/jpush/android/util/ac:h	()V
    //   1304: bipush 254
    //   1306: ireturn
    //   1307: invokestatic 354	cn/jpush/android/util/ac:e	()V
    //   1310: bipush 254
    //   1312: ireturn
    //   1313: invokestatic 118	cn/jpush/android/util/ac:c	()V
    //   1316: new 229	java/io/File
    //   1319: dup
    //   1320: aload 7
    //   1322: aload 8
    //   1324: invokespecial 247	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1327: astore 102
    //   1329: aload 102
    //   1331: invokevirtual 250	java/io/File:exists	()Z
    //   1334: ifeq +265 -> 1599
    //   1337: invokestatic 97	cn/jpush/android/util/ac:a	()V
    //   1340: aload 102
    //   1342: invokevirtual 254	java/io/File:length	()J
    //   1345: lstore 103
    //   1347: lload 103
    //   1349: lstore 14
    //   1351: new 150	java/lang/StringBuilder
    //   1354: dup
    //   1355: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   1358: bipush 14
    //   1360: aaload
    //   1361: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1364: lload 103
    //   1366: invokevirtual 363	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1369: pop
    //   1370: invokestatic 118	cn/jpush/android/util/ac:c	()V
    //   1373: aload_3
    //   1374: getfield 132	cn/jpush/android/data/c:z	I
    //   1377: iconst_m1
    //   1378: if_icmpne +15 -> 1393
    //   1381: invokestatic 159	cn/jpush/android/util/ac:b	()V
    //   1384: aload_3
    //   1385: lload 12
    //   1387: invokestatic 276	cn/jpush/android/service/b:a	(J)I
    //   1390: putfield 132	cn/jpush/android/data/c:z	I
    //   1393: aload 4
    //   1395: lload 103
    //   1397: invokestatic 257	cn/jpush/android/service/b:a	(Ljava/lang/String;J)Ljava/net/HttpURLConnection;
    //   1400: astore 108
    //   1402: aload 108
    //   1404: invokevirtual 263	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   1407: astore 20
    //   1409: aconst_null
    //   1410: astore 19
    //   1412: aconst_null
    //   1413: astore 18
    //   1415: aconst_null
    //   1416: astore 17
    //   1418: aconst_null
    //   1419: astore 16
    //   1421: aload 20
    //   1423: ifnull +676 -> 2099
    //   1426: aload 108
    //   1428: invokevirtual 267	java/net/HttpURLConnection:getResponseCode	()I
    //   1431: istore 123
    //   1433: iload 123
    //   1435: sipush 200
    //   1438: if_icmpeq +11 -> 1449
    //   1441: iload 123
    //   1443: sipush 206
    //   1446: if_icmpne +490 -> 1936
    //   1449: aload 108
    //   1451: invokestatic 270	cn/jpush/android/service/b:a	(Ljava/net/HttpURLConnection;)J
    //   1454: lstore 124
    //   1456: lload 124
    //   1458: lload 14
    //   1460: ladd
    //   1461: lload 12
    //   1463: lcmp
    //   1464: ifne +412 -> 1876
    //   1467: aload 20
    //   1469: ifnull +382 -> 1851
    //   1472: new 278	java/io/BufferedInputStream
    //   1475: dup
    //   1476: aload 20
    //   1478: invokespecial 281	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   1481: astore 135
    //   1483: new 289	java/io/FileOutputStream
    //   1486: dup
    //   1487: aload 102
    //   1489: iconst_1
    //   1490: invokespecial 366	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   1493: astore 136
    //   1495: new 294	java/io/BufferedOutputStream
    //   1498: dup
    //   1499: aload 136
    //   1501: invokespecial 297	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   1504: astore 137
    //   1506: sipush 1024
    //   1509: newarray byte
    //   1511: astore 144
    //   1513: aload 135
    //   1515: aload 144
    //   1517: invokevirtual 301	java/io/BufferedInputStream:read	([B)I
    //   1520: istore 145
    //   1522: iload 145
    //   1524: iconst_m1
    //   1525: if_icmpeq +177 -> 1702
    //   1528: aload_0
    //   1529: getfield 93	cn/jpush/android/service/b:a	Z
    //   1532: ifeq +90 -> 1622
    //   1535: invokestatic 134	cn/jpush/android/util/ac:d	()V
    //   1538: new 188	cn/jpush/android/g
    //   1541: dup
    //   1542: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   1545: bipush 6
    //   1547: aaload
    //   1548: invokespecial 302	cn/jpush/android/g:<init>	(Ljava/lang/String;)V
    //   1551: athrow
    //   1552: astore 143
    //   1554: aload 137
    //   1556: astore 19
    //   1558: aload 136
    //   1560: astore 18
    //   1562: aload 135
    //   1564: astore 17
    //   1566: aload 20
    //   1568: astore 16
    //   1570: invokestatic 305	cn/jpush/android/util/ac:i	()V
    //   1573: aload 20
    //   1575: ifnull +8 -> 1583
    //   1578: aload 20
    //   1580: invokevirtual 310	java/io/InputStream:close	()V
    //   1583: aload 16
    //   1585: aload 17
    //   1587: aload 18
    //   1589: aload 19
    //   1591: aload 108
    //   1593: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1596: bipush 254
    //   1598: ireturn
    //   1599: invokestatic 97	cn/jpush/android/util/ac:a	()V
    //   1602: lconst_0
    //   1603: lstore 103
    //   1605: aload 102
    //   1607: invokevirtual 287	java/io/File:createNewFile	()Z
    //   1610: pop
    //   1611: goto -260 -> 1351
    //   1614: astore 105
    //   1616: invokestatic 305	cn/jpush/android/util/ac:i	()V
    //   1619: bipush 254
    //   1621: ireturn
    //   1622: aload 137
    //   1624: aload 144
    //   1626: iconst_0
    //   1627: iload 145
    //   1629: invokevirtual 336	java/io/BufferedOutputStream:write	([BII)V
    //   1632: lload 14
    //   1634: iload 145
    //   1636: i2l
    //   1637: ladd
    //   1638: lstore 14
    //   1640: aload_0
    //   1641: lload 14
    //   1643: putfield 89	cn/jpush/android/service/b:d	J
    //   1646: aload_0
    //   1647: lload 12
    //   1649: putfield 91	cn/jpush/android/service/b:e	J
    //   1652: goto -139 -> 1513
    //   1655: astore 142
    //   1657: aload 137
    //   1659: astore 19
    //   1661: aload 136
    //   1663: astore 18
    //   1665: aload 135
    //   1667: astore 17
    //   1669: aload 20
    //   1671: astore 16
    //   1673: invokestatic 305	cn/jpush/android/util/ac:i	()V
    //   1676: aload 20
    //   1678: ifnull +8 -> 1686
    //   1681: aload 20
    //   1683: invokevirtual 310	java/io/InputStream:close	()V
    //   1686: aload 16
    //   1688: aload 17
    //   1690: aload 18
    //   1692: aload 19
    //   1694: aload 108
    //   1696: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1699: bipush 254
    //   1701: ireturn
    //   1702: aload 137
    //   1704: invokevirtual 339	java/io/BufferedOutputStream:flush	()V
    //   1707: invokestatic 159	cn/jpush/android/util/ac:b	()V
    //   1710: aload 102
    //   1712: ifnull +74 -> 1786
    //   1715: aload 102
    //   1717: invokevirtual 254	java/io/File:length	()J
    //   1720: lload 12
    //   1722: lcmp
    //   1723: ifne +63 -> 1786
    //   1726: aload 5
    //   1728: aload 102
    //   1730: invokestatic 344	cn/jpush/android/util/k:a	(Ljava/lang/String;Ljava/io/File;)Z
    //   1733: ifeq +53 -> 1786
    //   1736: aload_0
    //   1737: getfield 99	cn/jpush/android/service/b:f	Landroid/os/Bundle;
    //   1740: aload 4
    //   1742: invokevirtual 346	android/os/Bundle:remove	(Ljava/lang/String;)V
    //   1745: aload_2
    //   1746: ifnull +15 -> 1761
    //   1749: aload_2
    //   1750: aload 102
    //   1752: invokevirtual 349	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1755: iconst_0
    //   1756: invokeinterface 352 3 0
    //   1761: aload 20
    //   1763: ifnull +8 -> 1771
    //   1766: aload 20
    //   1768: invokevirtual 310	java/io/InputStream:close	()V
    //   1771: aload 20
    //   1773: aload 135
    //   1775: aload 136
    //   1777: aload 137
    //   1779: aload 108
    //   1781: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1784: iconst_1
    //   1785: ireturn
    //   1786: invokestatic 134	cn/jpush/android/util/ac:d	()V
    //   1789: aload 102
    //   1791: invokevirtual 284	java/io/File:delete	()Z
    //   1794: ifne +32 -> 1826
    //   1797: invokestatic 354	cn/jpush/android/util/ac:e	()V
    //   1800: aload 20
    //   1802: ifnull +8 -> 1810
    //   1805: aload 20
    //   1807: invokevirtual 310	java/io/InputStream:close	()V
    //   1810: aload 20
    //   1812: aload 135
    //   1814: aload 136
    //   1816: aload 137
    //   1818: aload 108
    //   1820: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1823: bipush 254
    //   1825: ireturn
    //   1826: aload 20
    //   1828: ifnull +8 -> 1836
    //   1831: aload 20
    //   1833: invokevirtual 310	java/io/InputStream:close	()V
    //   1836: aload 20
    //   1838: aload 135
    //   1840: aload 136
    //   1842: aload 137
    //   1844: aload 108
    //   1846: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1849: iconst_2
    //   1850: ireturn
    //   1851: invokestatic 134	cn/jpush/android/util/ac:d	()V
    //   1854: aload 20
    //   1856: ifnull +8 -> 1864
    //   1859: aload 20
    //   1861: invokevirtual 310	java/io/InputStream:close	()V
    //   1864: aload 20
    //   1866: aconst_null
    //   1867: aconst_null
    //   1868: aconst_null
    //   1869: aload 108
    //   1871: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1874: iconst_0
    //   1875: ireturn
    //   1876: invokestatic 354	cn/jpush/android/util/ac:e	()V
    //   1879: aload_0
    //   1880: getfield 99	cn/jpush/android/service/b:f	Landroid/os/Bundle;
    //   1883: aload 4
    //   1885: invokevirtual 346	android/os/Bundle:remove	(Ljava/lang/String;)V
    //   1888: aload 102
    //   1890: invokevirtual 284	java/io/File:delete	()Z
    //   1893: istore 126
    //   1895: aconst_null
    //   1896: astore 19
    //   1898: aconst_null
    //   1899: astore 18
    //   1901: aconst_null
    //   1902: astore 17
    //   1904: aconst_null
    //   1905: astore 16
    //   1907: iload 126
    //   1909: ifne +6 -> 1915
    //   1912: invokestatic 354	cn/jpush/android/util/ac:e	()V
    //   1915: aload 20
    //   1917: ifnull +8 -> 1925
    //   1920: aload 20
    //   1922: invokevirtual 310	java/io/InputStream:close	()V
    //   1925: aconst_null
    //   1926: aconst_null
    //   1927: aconst_null
    //   1928: aconst_null
    //   1929: aload 108
    //   1931: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   1934: iconst_0
    //   1935: ireturn
    //   1936: iload 123
    //   1938: sipush 416
    //   1941: if_icmpne +63 -> 2004
    //   1944: invokestatic 354	cn/jpush/android/util/ac:e	()V
    //   1947: aload_0
    //   1948: getfield 99	cn/jpush/android/service/b:f	Landroid/os/Bundle;
    //   1951: aload 4
    //   1953: invokevirtual 346	android/os/Bundle:remove	(Ljava/lang/String;)V
    //   1956: aload 102
    //   1958: invokevirtual 284	java/io/File:delete	()Z
    //   1961: istore 165
    //   1963: aconst_null
    //   1964: astore 19
    //   1966: aconst_null
    //   1967: astore 18
    //   1969: aconst_null
    //   1970: astore 17
    //   1972: aconst_null
    //   1973: astore 16
    //   1975: iload 165
    //   1977: ifne +6 -> 1983
    //   1980: invokestatic 354	cn/jpush/android/util/ac:e	()V
    //   1983: aload 20
    //   1985: ifnull +8 -> 1993
    //   1988: aload 20
    //   1990: invokevirtual 310	java/io/InputStream:close	()V
    //   1993: aconst_null
    //   1994: aconst_null
    //   1995: aconst_null
    //   1996: aconst_null
    //   1997: aload 108
    //   1999: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   2002: iconst_0
    //   2003: ireturn
    //   2004: iload 123
    //   2006: sipush 404
    //   2009: if_icmpne +47 -> 2056
    //   2012: new 150	java/lang/StringBuilder
    //   2015: dup
    //   2016: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   2019: bipush 10
    //   2021: aaload
    //   2022: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2025: aload 4
    //   2027: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2030: pop
    //   2031: invokestatic 159	cn/jpush/android/util/ac:b	()V
    //   2034: aload 20
    //   2036: ifnull +8 -> 2044
    //   2039: aload 20
    //   2041: invokevirtual 310	java/io/InputStream:close	()V
    //   2044: aconst_null
    //   2045: aconst_null
    //   2046: aconst_null
    //   2047: aconst_null
    //   2048: aload 108
    //   2050: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   2053: bipush 253
    //   2055: ireturn
    //   2056: new 150	java/lang/StringBuilder
    //   2059: dup
    //   2060: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   2063: iconst_4
    //   2064: aaload
    //   2065: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2068: iload 123
    //   2070: invokevirtual 157	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2073: pop
    //   2074: invokestatic 134	cn/jpush/android/util/ac:d	()V
    //   2077: aload 20
    //   2079: ifnull +8 -> 2087
    //   2082: aload 20
    //   2084: invokevirtual 310	java/io/InputStream:close	()V
    //   2087: aconst_null
    //   2088: aconst_null
    //   2089: aconst_null
    //   2090: aconst_null
    //   2091: aload 108
    //   2093: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   2096: bipush 254
    //   2098: ireturn
    //   2099: invokestatic 134	cn/jpush/android/util/ac:d	()V
    //   2102: aload 20
    //   2104: ifnull +8 -> 2112
    //   2107: aload 20
    //   2109: invokevirtual 310	java/io/InputStream:close	()V
    //   2112: aconst_null
    //   2113: aconst_null
    //   2114: aconst_null
    //   2115: aconst_null
    //   2116: aload 108
    //   2118: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   2121: iconst_0
    //   2122: ireturn
    //   2123: astore 121
    //   2125: invokestatic 305	cn/jpush/android/util/ac:i	()V
    //   2128: aload 20
    //   2130: ifnull +8 -> 2138
    //   2133: aload 20
    //   2135: invokevirtual 310	java/io/InputStream:close	()V
    //   2138: aload 16
    //   2140: aload 17
    //   2142: aload 18
    //   2144: aload 19
    //   2146: aload 108
    //   2148: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   2151: bipush 254
    //   2153: ireturn
    //   2154: astore 119
    //   2156: invokestatic 305	cn/jpush/android/util/ac:i	()V
    //   2159: aload 20
    //   2161: ifnull +8 -> 2169
    //   2164: aload 20
    //   2166: invokevirtual 310	java/io/InputStream:close	()V
    //   2169: aload 16
    //   2171: aload 17
    //   2173: aload 18
    //   2175: aload 19
    //   2177: aload 108
    //   2179: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   2182: bipush 254
    //   2184: ireturn
    //   2185: astore 117
    //   2187: invokestatic 357	cn/jpush/android/util/ac:g	()V
    //   2190: aload 20
    //   2192: ifnull +8 -> 2200
    //   2195: aload 20
    //   2197: invokevirtual 310	java/io/InputStream:close	()V
    //   2200: aload 16
    //   2202: aload 17
    //   2204: aload 18
    //   2206: aload 19
    //   2208: aload 108
    //   2210: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   2213: iconst_m1
    //   2214: ireturn
    //   2215: astore 115
    //   2217: invokestatic 360	cn/jpush/android/util/ac:h	()V
    //   2220: aload 20
    //   2222: ifnull +8 -> 2230
    //   2225: aload 20
    //   2227: invokevirtual 310	java/io/InputStream:close	()V
    //   2230: aload 16
    //   2232: aload 17
    //   2234: aload 18
    //   2236: aload 19
    //   2238: aload 108
    //   2240: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   2243: bipush 254
    //   2245: ireturn
    //   2246: astore 110
    //   2248: aload 20
    //   2250: ifnull +8 -> 2258
    //   2253: aload 20
    //   2255: invokevirtual 310	java/io/InputStream:close	()V
    //   2258: aload 16
    //   2260: aload 17
    //   2262: aload 18
    //   2264: aload 19
    //   2266: aload 108
    //   2268: invokestatic 313	cn/jpush/android/service/b:a	(Ljava/io/InputStream;Ljava/io/BufferedInputStream;Ljava/io/FileOutputStream;Ljava/io/BufferedOutputStream;Ljava/net/HttpURLConnection;)V
    //   2271: aload 110
    //   2273: athrow
    //   2274: new 150	java/lang/StringBuilder
    //   2277: dup
    //   2278: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   2281: iconst_5
    //   2282: aaload
    //   2283: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2286: aload 4
    //   2288: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2291: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   2294: bipush 9
    //   2296: aaload
    //   2297: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2300: aload 7
    //   2302: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2305: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   2308: bipush 7
    //   2310: aaload
    //   2311: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2314: aload 8
    //   2316: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2319: pop
    //   2320: invokestatic 354	cn/jpush/android/util/ac:e	()V
    //   2323: bipush 254
    //   2325: ireturn
    //   2326: astore 83
    //   2328: goto -1580 -> 748
    //   2331: astore 82
    //   2333: goto -1546 -> 787
    //   2336: astore 81
    //   2338: goto -1525 -> 813
    //   2341: astore 62
    //   2343: goto -1502 -> 841
    //   2346: astore 93
    //   2348: goto -1455 -> 893
    //   2351: astore 91
    //   2353: goto -1417 -> 936
    //   2356: astore 52
    //   2358: goto -1397 -> 961
    //   2361: astore 34
    //   2363: goto -1897 -> 466
    //   2366: astore 36
    //   2368: goto -1702 -> 666
    //   2371: astore 44
    //   2373: goto -1380 -> 993
    //   2376: astore 42
    //   2378: goto -1348 -> 1030
    //   2381: astore 40
    //   2383: goto -1316 -> 1067
    //   2386: astore 38
    //   2388: goto -1285 -> 1103
    //   2391: astore 33
    //   2393: goto -1256 -> 1137
    //   2396: astore 148
    //   2398: goto -627 -> 1771
    //   2401: astore 147
    //   2403: goto -593 -> 1810
    //   2406: astore 146
    //   2408: goto -572 -> 1836
    //   2411: astore 134
    //   2413: goto -549 -> 1864
    //   2416: astore 127
    //   2418: goto -493 -> 1925
    //   2421: astore 166
    //   2423: goto -430 -> 1993
    //   2426: astore 164
    //   2428: goto -384 -> 2044
    //   2431: astore 162
    //   2433: goto -346 -> 2087
    //   2436: astore 167
    //   2438: goto -326 -> 2112
    //   2441: astore 112
    //   2443: goto -860 -> 1583
    //   2446: astore 114
    //   2448: goto -762 -> 1686
    //   2451: astore 122
    //   2453: goto -315 -> 2138
    //   2456: astore 120
    //   2458: goto -289 -> 2169
    //   2461: astore 118
    //   2463: goto -263 -> 2200
    //   2466: astore 116
    //   2468: goto -238 -> 2230
    //   2471: astore 111
    //   2473: goto -215 -> 2258
    //   2476: astore 110
    //   2478: aload 20
    //   2480: astore 16
    //   2482: aconst_null
    //   2483: astore 19
    //   2485: aconst_null
    //   2486: astore 18
    //   2488: aconst_null
    //   2489: astore 17
    //   2491: goto -243 -> 2248
    //   2494: astore 110
    //   2496: aload 135
    //   2498: astore 17
    //   2500: aload 20
    //   2502: astore 16
    //   2504: aconst_null
    //   2505: astore 19
    //   2507: aconst_null
    //   2508: astore 18
    //   2510: goto -262 -> 2248
    //   2513: astore 110
    //   2515: aload 136
    //   2517: astore 18
    //   2519: aload 135
    //   2521: astore 17
    //   2523: aload 20
    //   2525: astore 16
    //   2527: aconst_null
    //   2528: astore 19
    //   2530: goto -282 -> 2248
    //   2533: astore 110
    //   2535: aload 137
    //   2537: astore 19
    //   2539: aload 136
    //   2541: astore 18
    //   2543: aload 135
    //   2545: astore 17
    //   2547: aload 20
    //   2549: astore 16
    //   2551: goto -303 -> 2248
    //   2554: astore 133
    //   2556: aload 20
    //   2558: astore 16
    //   2560: aconst_null
    //   2561: astore 19
    //   2563: aconst_null
    //   2564: astore 18
    //   2566: aconst_null
    //   2567: astore 17
    //   2569: goto -352 -> 2217
    //   2572: astore 160
    //   2574: aload 135
    //   2576: astore 17
    //   2578: aload 20
    //   2580: astore 16
    //   2582: aconst_null
    //   2583: astore 19
    //   2585: aconst_null
    //   2586: astore 18
    //   2588: goto -371 -> 2217
    //   2591: astore 154
    //   2593: aload 136
    //   2595: astore 18
    //   2597: aload 135
    //   2599: astore 17
    //   2601: aload 20
    //   2603: astore 16
    //   2605: aconst_null
    //   2606: astore 19
    //   2608: goto -391 -> 2217
    //   2611: astore 141
    //   2613: aload 137
    //   2615: astore 19
    //   2617: aload 136
    //   2619: astore 18
    //   2621: aload 135
    //   2623: astore 17
    //   2625: aload 20
    //   2627: astore 16
    //   2629: goto -412 -> 2217
    //   2632: astore 132
    //   2634: aload 20
    //   2636: astore 16
    //   2638: aconst_null
    //   2639: astore 19
    //   2641: aconst_null
    //   2642: astore 18
    //   2644: aconst_null
    //   2645: astore 17
    //   2647: goto -460 -> 2187
    //   2650: astore 159
    //   2652: aload 135
    //   2654: astore 17
    //   2656: aload 20
    //   2658: astore 16
    //   2660: aconst_null
    //   2661: astore 19
    //   2663: aconst_null
    //   2664: astore 18
    //   2666: goto -479 -> 2187
    //   2669: astore 153
    //   2671: aload 136
    //   2673: astore 18
    //   2675: aload 135
    //   2677: astore 17
    //   2679: aload 20
    //   2681: astore 16
    //   2683: aconst_null
    //   2684: astore 19
    //   2686: goto -499 -> 2187
    //   2689: astore 140
    //   2691: aload 137
    //   2693: astore 19
    //   2695: aload 136
    //   2697: astore 18
    //   2699: aload 135
    //   2701: astore 17
    //   2703: aload 20
    //   2705: astore 16
    //   2707: goto -520 -> 2187
    //   2710: astore 131
    //   2712: aload 20
    //   2714: astore 16
    //   2716: aconst_null
    //   2717: astore 19
    //   2719: aconst_null
    //   2720: astore 18
    //   2722: aconst_null
    //   2723: astore 17
    //   2725: goto -569 -> 2156
    //   2728: astore 158
    //   2730: aload 135
    //   2732: astore 17
    //   2734: aload 20
    //   2736: astore 16
    //   2738: aconst_null
    //   2739: astore 19
    //   2741: aconst_null
    //   2742: astore 18
    //   2744: goto -588 -> 2156
    //   2747: astore 152
    //   2749: aload 136
    //   2751: astore 18
    //   2753: aload 135
    //   2755: astore 17
    //   2757: aload 20
    //   2759: astore 16
    //   2761: aconst_null
    //   2762: astore 19
    //   2764: goto -608 -> 2156
    //   2767: astore 139
    //   2769: aload 137
    //   2771: astore 19
    //   2773: aload 136
    //   2775: astore 18
    //   2777: aload 135
    //   2779: astore 17
    //   2781: aload 20
    //   2783: astore 16
    //   2785: goto -629 -> 2156
    //   2788: astore 130
    //   2790: aload 20
    //   2792: astore 16
    //   2794: aconst_null
    //   2795: astore 19
    //   2797: aconst_null
    //   2798: astore 18
    //   2800: aconst_null
    //   2801: astore 17
    //   2803: goto -678 -> 2125
    //   2806: astore 157
    //   2808: aload 135
    //   2810: astore 17
    //   2812: aload 20
    //   2814: astore 16
    //   2816: aconst_null
    //   2817: astore 19
    //   2819: aconst_null
    //   2820: astore 18
    //   2822: goto -697 -> 2125
    //   2825: astore 151
    //   2827: aload 136
    //   2829: astore 18
    //   2831: aload 135
    //   2833: astore 17
    //   2835: aload 20
    //   2837: astore 16
    //   2839: aconst_null
    //   2840: astore 19
    //   2842: goto -717 -> 2125
    //   2845: astore 138
    //   2847: aload 137
    //   2849: astore 19
    //   2851: aload 136
    //   2853: astore 18
    //   2855: aload 135
    //   2857: astore 17
    //   2859: aload 20
    //   2861: astore 16
    //   2863: goto -738 -> 2125
    //   2866: astore 113
    //   2868: aconst_null
    //   2869: astore 19
    //   2871: aconst_null
    //   2872: astore 18
    //   2874: aconst_null
    //   2875: astore 17
    //   2877: aconst_null
    //   2878: astore 16
    //   2880: goto -1207 -> 1673
    //   2883: astore 129
    //   2885: aload 20
    //   2887: astore 16
    //   2889: aconst_null
    //   2890: astore 19
    //   2892: aconst_null
    //   2893: astore 18
    //   2895: aconst_null
    //   2896: astore 17
    //   2898: goto -1225 -> 1673
    //   2901: astore 156
    //   2903: aload 135
    //   2905: astore 17
    //   2907: aload 20
    //   2909: astore 16
    //   2911: aconst_null
    //   2912: astore 19
    //   2914: aconst_null
    //   2915: astore 18
    //   2917: goto -1244 -> 1673
    //   2920: astore 150
    //   2922: aload 136
    //   2924: astore 18
    //   2926: aload 135
    //   2928: astore 17
    //   2930: aload 20
    //   2932: astore 16
    //   2934: aconst_null
    //   2935: astore 19
    //   2937: goto -1264 -> 1673
    //   2940: astore 109
    //   2942: aconst_null
    //   2943: astore 19
    //   2945: aconst_null
    //   2946: astore 18
    //   2948: aconst_null
    //   2949: astore 17
    //   2951: aconst_null
    //   2952: astore 16
    //   2954: goto -1384 -> 1570
    //   2957: astore 128
    //   2959: aload 20
    //   2961: astore 16
    //   2963: aconst_null
    //   2964: astore 19
    //   2966: aconst_null
    //   2967: astore 18
    //   2969: aconst_null
    //   2970: astore 17
    //   2972: goto -1402 -> 1570
    //   2975: astore 155
    //   2977: aload 135
    //   2979: astore 17
    //   2981: aload 20
    //   2983: astore 16
    //   2985: aconst_null
    //   2986: astore 19
    //   2988: aconst_null
    //   2989: astore 18
    //   2991: goto -1421 -> 1570
    //   2994: astore 149
    //   2996: aload 136
    //   2998: astore 18
    //   3000: aload 135
    //   3002: astore 17
    //   3004: aload 20
    //   3006: astore 16
    //   3008: aconst_null
    //   3009: astore 19
    //   3011: goto -1441 -> 1570
    //   3014: astore 32
    //   3016: aconst_null
    //   3017: astore 30
    //   3019: aconst_null
    //   3020: astore 19
    //   3022: aconst_null
    //   3023: astore 18
    //   3025: aconst_null
    //   3026: astore 16
    //   3028: goto -1901 -> 1127
    //   3031: astore 32
    //   3033: aload 31
    //   3035: astore 16
    //   3037: aconst_null
    //   3038: astore 30
    //   3040: aconst_null
    //   3041: astore 19
    //   3043: aconst_null
    //   3044: astore 18
    //   3046: goto -1919 -> 1127
    //   3049: astore 32
    //   3051: aload 31
    //   3053: astore 16
    //   3055: aconst_null
    //   3056: astore 19
    //   3058: aconst_null
    //   3059: astore 18
    //   3061: goto -1934 -> 1127
    //   3064: astore 32
    //   3066: aload 71
    //   3068: astore 18
    //   3070: aload 31
    //   3072: astore 16
    //   3074: aconst_null
    //   3075: astore 19
    //   3077: goto -1950 -> 1127
    //   3080: astore 32
    //   3082: aload 72
    //   3084: astore 19
    //   3086: aload 71
    //   3088: astore 18
    //   3090: aload 31
    //   3092: astore 16
    //   3094: goto -1967 -> 1127
    //   3097: astore 29
    //   3099: aload 25
    //   3101: astore 19
    //   3103: aload 26
    //   3105: astore 18
    //   3107: aload 27
    //   3109: astore 30
    //   3111: aload 28
    //   3113: astore 16
    //   3115: aload 24
    //   3117: astore 31
    //   3119: aload 29
    //   3121: astore 32
    //   3123: goto -1996 -> 1127
    //   3126: astore 32
    //   3128: goto -2001 -> 1127
    //   3131: astore 51
    //   3133: aconst_null
    //   3134: astore 30
    //   3136: aconst_null
    //   3137: astore 19
    //   3139: aconst_null
    //   3140: astore 18
    //   3142: aconst_null
    //   3143: astore 16
    //   3145: goto -2055 -> 1090
    //   3148: astore 61
    //   3150: aload 31
    //   3152: astore 16
    //   3154: aconst_null
    //   3155: astore 30
    //   3157: aconst_null
    //   3158: astore 19
    //   3160: aconst_null
    //   3161: astore 18
    //   3163: goto -2073 -> 1090
    //   3166: astore 68
    //   3168: aload 31
    //   3170: astore 16
    //   3172: aconst_null
    //   3173: astore 19
    //   3175: aconst_null
    //   3176: astore 18
    //   3178: goto -2088 -> 1090
    //   3181: astore 89
    //   3183: aload 71
    //   3185: astore 18
    //   3187: aload 31
    //   3189: astore 16
    //   3191: aconst_null
    //   3192: astore 19
    //   3194: goto -2104 -> 1090
    //   3197: astore 76
    //   3199: aload 72
    //   3201: astore 19
    //   3203: aload 71
    //   3205: astore 18
    //   3207: aload 31
    //   3209: astore 16
    //   3211: goto -2121 -> 1090
    //   3214: astore 50
    //   3216: aconst_null
    //   3217: astore 30
    //   3219: aconst_null
    //   3220: astore 19
    //   3222: aconst_null
    //   3223: astore 18
    //   3225: aconst_null
    //   3226: astore 16
    //   3228: goto -2174 -> 1054
    //   3231: astore 60
    //   3233: aload 31
    //   3235: astore 16
    //   3237: aconst_null
    //   3238: astore 30
    //   3240: aconst_null
    //   3241: astore 19
    //   3243: aconst_null
    //   3244: astore 18
    //   3246: goto -2192 -> 1054
    //   3249: astore 67
    //   3251: aload 31
    //   3253: astore 16
    //   3255: aconst_null
    //   3256: astore 19
    //   3258: aconst_null
    //   3259: astore 18
    //   3261: goto -2207 -> 1054
    //   3264: astore 88
    //   3266: aload 71
    //   3268: astore 18
    //   3270: aload 31
    //   3272: astore 16
    //   3274: aconst_null
    //   3275: astore 19
    //   3277: goto -2223 -> 1054
    //   3280: astore 75
    //   3282: aload 72
    //   3284: astore 19
    //   3286: aload 71
    //   3288: astore 18
    //   3290: aload 31
    //   3292: astore 16
    //   3294: goto -2240 -> 1054
    //   3297: astore 49
    //   3299: aconst_null
    //   3300: astore 30
    //   3302: aconst_null
    //   3303: astore 19
    //   3305: aconst_null
    //   3306: astore 18
    //   3308: aconst_null
    //   3309: astore 16
    //   3311: goto -2294 -> 1017
    //   3314: astore 59
    //   3316: aload 31
    //   3318: astore 16
    //   3320: aconst_null
    //   3321: astore 30
    //   3323: aconst_null
    //   3324: astore 19
    //   3326: aconst_null
    //   3327: astore 18
    //   3329: goto -2312 -> 1017
    //   3332: astore 66
    //   3334: aload 31
    //   3336: astore 16
    //   3338: aconst_null
    //   3339: astore 19
    //   3341: aconst_null
    //   3342: astore 18
    //   3344: goto -2327 -> 1017
    //   3347: astore 87
    //   3349: aload 71
    //   3351: astore 18
    //   3353: aload 31
    //   3355: astore 16
    //   3357: aconst_null
    //   3358: astore 19
    //   3360: goto -2343 -> 1017
    //   3363: astore 74
    //   3365: aload 72
    //   3367: astore 19
    //   3369: aload 71
    //   3371: astore 18
    //   3373: aload 31
    //   3375: astore 16
    //   3377: goto -2360 -> 1017
    //   3380: astore 48
    //   3382: aconst_null
    //   3383: astore 30
    //   3385: aconst_null
    //   3386: astore 19
    //   3388: aconst_null
    //   3389: astore 18
    //   3391: aconst_null
    //   3392: astore 16
    //   3394: goto -2414 -> 980
    //   3397: astore 58
    //   3399: aload 31
    //   3401: astore 16
    //   3403: aconst_null
    //   3404: astore 30
    //   3406: aconst_null
    //   3407: astore 19
    //   3409: aconst_null
    //   3410: astore 18
    //   3412: goto -2432 -> 980
    //   3415: astore 65
    //   3417: aload 31
    //   3419: astore 16
    //   3421: aconst_null
    //   3422: astore 19
    //   3424: aconst_null
    //   3425: astore 18
    //   3427: goto -2447 -> 980
    //   3430: astore 86
    //   3432: aload 71
    //   3434: astore 18
    //   3436: aload 31
    //   3438: astore 16
    //   3440: aconst_null
    //   3441: astore 19
    //   3443: goto -2463 -> 980
    //   3446: astore 73
    //   3448: aload 72
    //   3450: astore 19
    //   3452: aload 71
    //   3454: astore 18
    //   3456: aload 31
    //   3458: astore 16
    //   3460: goto -2480 -> 980
    //   3463: astore 35
    //   3465: aconst_null
    //   3466: astore 31
    //   3468: aconst_null
    //   3469: astore 30
    //   3471: aconst_null
    //   3472: astore 19
    //   3474: aconst_null
    //   3475: astore 18
    //   3477: aconst_null
    //   3478: astore 16
    //   3480: goto -2827 -> 653
    //   3483: astore 47
    //   3485: aconst_null
    //   3486: astore 30
    //   3488: aconst_null
    //   3489: astore 19
    //   3491: aconst_null
    //   3492: astore 18
    //   3494: aconst_null
    //   3495: astore 16
    //   3497: goto -2844 -> 653
    //   3500: astore 57
    //   3502: aload 31
    //   3504: astore 16
    //   3506: aconst_null
    //   3507: astore 30
    //   3509: aconst_null
    //   3510: astore 19
    //   3512: aconst_null
    //   3513: astore 18
    //   3515: goto -2862 -> 653
    //   3518: astore 64
    //   3520: aload 31
    //   3522: astore 16
    //   3524: aconst_null
    //   3525: astore 19
    //   3527: aconst_null
    //   3528: astore 18
    //   3530: goto -2877 -> 653
    //   3533: astore 85
    //   3535: aload 71
    //   3537: astore 18
    //   3539: aload 31
    //   3541: astore 16
    //   3543: aconst_null
    //   3544: astore 19
    //   3546: goto -2893 -> 653
    //   3549: astore 23
    //   3551: aconst_null
    //   3552: astore 24
    //   3554: aconst_null
    //   3555: astore 25
    //   3557: aconst_null
    //   3558: astore 26
    //   3560: aconst_null
    //   3561: astore 27
    //   3563: aconst_null
    //   3564: astore 28
    //   3566: goto -3113 -> 453
    //   3569: astore 46
    //   3571: aload 31
    //   3573: astore 24
    //   3575: aconst_null
    //   3576: astore 25
    //   3578: aconst_null
    //   3579: astore 26
    //   3581: aconst_null
    //   3582: astore 27
    //   3584: aconst_null
    //   3585: astore 28
    //   3587: goto -3134 -> 453
    //   3590: astore 56
    //   3592: aload 31
    //   3594: astore 24
    //   3596: aload 31
    //   3598: astore 28
    //   3600: aconst_null
    //   3601: astore 25
    //   3603: aconst_null
    //   3604: astore 26
    //   3606: aconst_null
    //   3607: astore 27
    //   3609: goto -3156 -> 453
    //   3612: astore 63
    //   3614: aload 31
    //   3616: astore 24
    //   3618: aload 30
    //   3620: astore 27
    //   3622: aload 31
    //   3624: astore 28
    //   3626: aconst_null
    //   3627: astore 25
    //   3629: aconst_null
    //   3630: astore 26
    //   3632: goto -3179 -> 453
    //   3635: astore 84
    //   3637: aload 31
    //   3639: astore 24
    //   3641: aload 71
    //   3643: astore 26
    //   3645: aload 31
    //   3647: astore 28
    //   3649: aload 30
    //   3651: astore 27
    //   3653: aconst_null
    //   3654: astore 25
    //   3656: goto -3203 -> 453
    //   3659: iconst_1
    //   3660: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   385	392	431	java/lang/NumberFormatException
    //   392	401	431	java/lang/NumberFormatException
    //   407	431	431	java/lang/NumberFormatException
    //   606	616	431	java/lang/NumberFormatException
    //   624	636	431	java/lang/NumberFormatException
    //   682	687	431	java/lang/NumberFormatException
    //   692	722	431	java/lang/NumberFormatException
    //   726	738	431	java/lang/NumberFormatException
    //   763	777	431	java/lang/NumberFormatException
    //   385	392	639	java/net/ProtocolException
    //   392	401	639	java/net/ProtocolException
    //   407	431	639	java/net/ProtocolException
    //   606	616	639	java/net/ProtocolException
    //   624	636	639	java/net/ProtocolException
    //   682	687	639	java/net/ProtocolException
    //   692	722	639	java/net/ProtocolException
    //   726	738	639	java/net/ProtocolException
    //   763	777	639	java/net/ProtocolException
    //   277	284	972	java/lang/IllegalStateException
    //   277	284	1009	java/io/FileNotFoundException
    //   277	284	1046	java/io/IOException
    //   277	284	1082	cn/jpush/android/g
    //   277	284	1119	finally
    //   1173	1210	1284	java/net/ProtocolException
    //   1214	1226	1284	java/net/ProtocolException
    //   1229	1279	1284	java/net/ProtocolException
    //   1173	1210	1292	java/io/IOException
    //   1214	1226	1292	java/io/IOException
    //   1229	1279	1292	java/io/IOException
    //   1173	1210	1299	cn/jpush/android/g
    //   1214	1226	1299	cn/jpush/android/g
    //   1229	1279	1299	cn/jpush/android/g
    //   1506	1513	1552	java/lang/NumberFormatException
    //   1513	1522	1552	java/lang/NumberFormatException
    //   1528	1552	1552	java/lang/NumberFormatException
    //   1622	1632	1552	java/lang/NumberFormatException
    //   1640	1652	1552	java/lang/NumberFormatException
    //   1702	1710	1552	java/lang/NumberFormatException
    //   1715	1745	1552	java/lang/NumberFormatException
    //   1749	1761	1552	java/lang/NumberFormatException
    //   1786	1800	1552	java/lang/NumberFormatException
    //   1605	1611	1614	java/io/IOException
    //   1506	1513	1655	java/net/ProtocolException
    //   1513	1522	1655	java/net/ProtocolException
    //   1528	1552	1655	java/net/ProtocolException
    //   1622	1632	1655	java/net/ProtocolException
    //   1640	1652	1655	java/net/ProtocolException
    //   1702	1710	1655	java/net/ProtocolException
    //   1715	1745	1655	java/net/ProtocolException
    //   1749	1761	1655	java/net/ProtocolException
    //   1786	1800	1655	java/net/ProtocolException
    //   1402	1409	2123	java/lang/IllegalStateException
    //   1426	1433	2123	java/lang/IllegalStateException
    //   1449	1456	2123	java/lang/IllegalStateException
    //   1876	1895	2123	java/lang/IllegalStateException
    //   1912	1915	2123	java/lang/IllegalStateException
    //   1944	1963	2123	java/lang/IllegalStateException
    //   1980	1983	2123	java/lang/IllegalStateException
    //   2012	2034	2123	java/lang/IllegalStateException
    //   2056	2077	2123	java/lang/IllegalStateException
    //   2099	2102	2123	java/lang/IllegalStateException
    //   1402	1409	2154	java/io/FileNotFoundException
    //   1426	1433	2154	java/io/FileNotFoundException
    //   1449	1456	2154	java/io/FileNotFoundException
    //   1876	1895	2154	java/io/FileNotFoundException
    //   1912	1915	2154	java/io/FileNotFoundException
    //   1944	1963	2154	java/io/FileNotFoundException
    //   1980	1983	2154	java/io/FileNotFoundException
    //   2012	2034	2154	java/io/FileNotFoundException
    //   2056	2077	2154	java/io/FileNotFoundException
    //   2099	2102	2154	java/io/FileNotFoundException
    //   1402	1409	2185	java/io/IOException
    //   1426	1433	2185	java/io/IOException
    //   1449	1456	2185	java/io/IOException
    //   1876	1895	2185	java/io/IOException
    //   1912	1915	2185	java/io/IOException
    //   1944	1963	2185	java/io/IOException
    //   1980	1983	2185	java/io/IOException
    //   2012	2034	2185	java/io/IOException
    //   2056	2077	2185	java/io/IOException
    //   2099	2102	2185	java/io/IOException
    //   1402	1409	2215	cn/jpush/android/g
    //   1426	1433	2215	cn/jpush/android/g
    //   1449	1456	2215	cn/jpush/android/g
    //   1876	1895	2215	cn/jpush/android/g
    //   1912	1915	2215	cn/jpush/android/g
    //   1944	1963	2215	cn/jpush/android/g
    //   1980	1983	2215	cn/jpush/android/g
    //   2012	2034	2215	cn/jpush/android/g
    //   2056	2077	2215	cn/jpush/android/g
    //   2099	2102	2215	cn/jpush/android/g
    //   1402	1409	2246	finally
    //   1426	1433	2246	finally
    //   1449	1456	2246	finally
    //   1570	1573	2246	finally
    //   1673	1676	2246	finally
    //   1876	1895	2246	finally
    //   1912	1915	2246	finally
    //   1944	1963	2246	finally
    //   1980	1983	2246	finally
    //   2012	2034	2246	finally
    //   2056	2077	2246	finally
    //   2099	2102	2246	finally
    //   2125	2128	2246	finally
    //   2156	2159	2246	finally
    //   2187	2190	2246	finally
    //   2217	2220	2246	finally
    //   743	748	2326	java/io/IOException
    //   782	787	2331	java/io/IOException
    //   808	813	2336	java/io/IOException
    //   836	841	2341	java/io/IOException
    //   888	893	2346	java/io/IOException
    //   931	936	2351	java/io/IOException
    //   956	961	2356	java/io/IOException
    //   461	466	2361	java/io/IOException
    //   661	666	2366	java/io/IOException
    //   988	993	2371	java/io/IOException
    //   1025	1030	2376	java/io/IOException
    //   1062	1067	2381	java/io/IOException
    //   1098	1103	2386	java/io/IOException
    //   1132	1137	2391	java/io/IOException
    //   1766	1771	2396	java/io/IOException
    //   1805	1810	2401	java/io/IOException
    //   1831	1836	2406	java/io/IOException
    //   1859	1864	2411	java/io/IOException
    //   1920	1925	2416	java/io/IOException
    //   1988	1993	2421	java/io/IOException
    //   2039	2044	2426	java/io/IOException
    //   2082	2087	2431	java/io/IOException
    //   2107	2112	2436	java/io/IOException
    //   1578	1583	2441	java/io/IOException
    //   1681	1686	2446	java/io/IOException
    //   2133	2138	2451	java/io/IOException
    //   2164	2169	2456	java/io/IOException
    //   2195	2200	2461	java/io/IOException
    //   2225	2230	2466	java/io/IOException
    //   2253	2258	2471	java/io/IOException
    //   1472	1483	2476	finally
    //   1851	1854	2476	finally
    //   1483	1495	2494	finally
    //   1495	1506	2513	finally
    //   1506	1513	2533	finally
    //   1513	1522	2533	finally
    //   1528	1552	2533	finally
    //   1622	1632	2533	finally
    //   1640	1652	2533	finally
    //   1702	1710	2533	finally
    //   1715	1745	2533	finally
    //   1749	1761	2533	finally
    //   1786	1800	2533	finally
    //   1472	1483	2554	cn/jpush/android/g
    //   1851	1854	2554	cn/jpush/android/g
    //   1483	1495	2572	cn/jpush/android/g
    //   1495	1506	2591	cn/jpush/android/g
    //   1506	1513	2611	cn/jpush/android/g
    //   1513	1522	2611	cn/jpush/android/g
    //   1528	1552	2611	cn/jpush/android/g
    //   1622	1632	2611	cn/jpush/android/g
    //   1640	1652	2611	cn/jpush/android/g
    //   1702	1710	2611	cn/jpush/android/g
    //   1715	1745	2611	cn/jpush/android/g
    //   1749	1761	2611	cn/jpush/android/g
    //   1786	1800	2611	cn/jpush/android/g
    //   1472	1483	2632	java/io/IOException
    //   1851	1854	2632	java/io/IOException
    //   1483	1495	2650	java/io/IOException
    //   1495	1506	2669	java/io/IOException
    //   1506	1513	2689	java/io/IOException
    //   1513	1522	2689	java/io/IOException
    //   1528	1552	2689	java/io/IOException
    //   1622	1632	2689	java/io/IOException
    //   1640	1652	2689	java/io/IOException
    //   1702	1710	2689	java/io/IOException
    //   1715	1745	2689	java/io/IOException
    //   1749	1761	2689	java/io/IOException
    //   1786	1800	2689	java/io/IOException
    //   1472	1483	2710	java/io/FileNotFoundException
    //   1851	1854	2710	java/io/FileNotFoundException
    //   1483	1495	2728	java/io/FileNotFoundException
    //   1495	1506	2747	java/io/FileNotFoundException
    //   1506	1513	2767	java/io/FileNotFoundException
    //   1513	1522	2767	java/io/FileNotFoundException
    //   1528	1552	2767	java/io/FileNotFoundException
    //   1622	1632	2767	java/io/FileNotFoundException
    //   1640	1652	2767	java/io/FileNotFoundException
    //   1702	1710	2767	java/io/FileNotFoundException
    //   1715	1745	2767	java/io/FileNotFoundException
    //   1749	1761	2767	java/io/FileNotFoundException
    //   1786	1800	2767	java/io/FileNotFoundException
    //   1472	1483	2788	java/lang/IllegalStateException
    //   1851	1854	2788	java/lang/IllegalStateException
    //   1483	1495	2806	java/lang/IllegalStateException
    //   1495	1506	2825	java/lang/IllegalStateException
    //   1506	1513	2845	java/lang/IllegalStateException
    //   1513	1522	2845	java/lang/IllegalStateException
    //   1528	1552	2845	java/lang/IllegalStateException
    //   1622	1632	2845	java/lang/IllegalStateException
    //   1640	1652	2845	java/lang/IllegalStateException
    //   1702	1710	2845	java/lang/IllegalStateException
    //   1715	1745	2845	java/lang/IllegalStateException
    //   1749	1761	2845	java/lang/IllegalStateException
    //   1786	1800	2845	java/lang/IllegalStateException
    //   1402	1409	2866	java/net/ProtocolException
    //   1426	1433	2866	java/net/ProtocolException
    //   1449	1456	2866	java/net/ProtocolException
    //   1876	1895	2866	java/net/ProtocolException
    //   1912	1915	2866	java/net/ProtocolException
    //   1944	1963	2866	java/net/ProtocolException
    //   1980	1983	2866	java/net/ProtocolException
    //   2012	2034	2866	java/net/ProtocolException
    //   2056	2077	2866	java/net/ProtocolException
    //   2099	2102	2866	java/net/ProtocolException
    //   1472	1483	2883	java/net/ProtocolException
    //   1851	1854	2883	java/net/ProtocolException
    //   1483	1495	2901	java/net/ProtocolException
    //   1495	1506	2920	java/net/ProtocolException
    //   1402	1409	2940	java/lang/NumberFormatException
    //   1426	1433	2940	java/lang/NumberFormatException
    //   1449	1456	2940	java/lang/NumberFormatException
    //   1876	1895	2940	java/lang/NumberFormatException
    //   1912	1915	2940	java/lang/NumberFormatException
    //   1944	1963	2940	java/lang/NumberFormatException
    //   1980	1983	2940	java/lang/NumberFormatException
    //   2012	2034	2940	java/lang/NumberFormatException
    //   2056	2077	2940	java/lang/NumberFormatException
    //   2099	2102	2940	java/lang/NumberFormatException
    //   1472	1483	2957	java/lang/NumberFormatException
    //   1851	1854	2957	java/lang/NumberFormatException
    //   1483	1495	2975	java/lang/NumberFormatException
    //   1495	1506	2994	java/lang/NumberFormatException
    //   293	300	3014	finally
    //   308	335	3014	finally
    //   861	883	3014	finally
    //   905	926	3014	finally
    //   948	951	3014	finally
    //   340	351	3031	finally
    //   828	831	3031	finally
    //   351	374	3049	finally
    //   374	385	3064	finally
    //   385	392	3080	finally
    //   392	401	3080	finally
    //   407	431	3080	finally
    //   606	616	3080	finally
    //   624	636	3080	finally
    //   682	687	3080	finally
    //   692	722	3080	finally
    //   726	738	3080	finally
    //   763	777	3080	finally
    //   453	456	3097	finally
    //   653	656	3126	finally
    //   980	983	3126	finally
    //   1017	1020	3126	finally
    //   1054	1057	3126	finally
    //   1090	1093	3126	finally
    //   293	300	3131	cn/jpush/android/g
    //   308	335	3131	cn/jpush/android/g
    //   861	883	3131	cn/jpush/android/g
    //   905	926	3131	cn/jpush/android/g
    //   948	951	3131	cn/jpush/android/g
    //   340	351	3148	cn/jpush/android/g
    //   828	831	3148	cn/jpush/android/g
    //   351	374	3166	cn/jpush/android/g
    //   374	385	3181	cn/jpush/android/g
    //   385	392	3197	cn/jpush/android/g
    //   392	401	3197	cn/jpush/android/g
    //   407	431	3197	cn/jpush/android/g
    //   606	616	3197	cn/jpush/android/g
    //   624	636	3197	cn/jpush/android/g
    //   682	687	3197	cn/jpush/android/g
    //   692	722	3197	cn/jpush/android/g
    //   726	738	3197	cn/jpush/android/g
    //   763	777	3197	cn/jpush/android/g
    //   293	300	3214	java/io/IOException
    //   308	335	3214	java/io/IOException
    //   861	883	3214	java/io/IOException
    //   905	926	3214	java/io/IOException
    //   948	951	3214	java/io/IOException
    //   340	351	3231	java/io/IOException
    //   828	831	3231	java/io/IOException
    //   351	374	3249	java/io/IOException
    //   374	385	3264	java/io/IOException
    //   385	392	3280	java/io/IOException
    //   392	401	3280	java/io/IOException
    //   407	431	3280	java/io/IOException
    //   606	616	3280	java/io/IOException
    //   624	636	3280	java/io/IOException
    //   682	687	3280	java/io/IOException
    //   692	722	3280	java/io/IOException
    //   726	738	3280	java/io/IOException
    //   763	777	3280	java/io/IOException
    //   293	300	3297	java/io/FileNotFoundException
    //   308	335	3297	java/io/FileNotFoundException
    //   861	883	3297	java/io/FileNotFoundException
    //   905	926	3297	java/io/FileNotFoundException
    //   948	951	3297	java/io/FileNotFoundException
    //   340	351	3314	java/io/FileNotFoundException
    //   828	831	3314	java/io/FileNotFoundException
    //   351	374	3332	java/io/FileNotFoundException
    //   374	385	3347	java/io/FileNotFoundException
    //   385	392	3363	java/io/FileNotFoundException
    //   392	401	3363	java/io/FileNotFoundException
    //   407	431	3363	java/io/FileNotFoundException
    //   606	616	3363	java/io/FileNotFoundException
    //   624	636	3363	java/io/FileNotFoundException
    //   682	687	3363	java/io/FileNotFoundException
    //   692	722	3363	java/io/FileNotFoundException
    //   726	738	3363	java/io/FileNotFoundException
    //   763	777	3363	java/io/FileNotFoundException
    //   293	300	3380	java/lang/IllegalStateException
    //   308	335	3380	java/lang/IllegalStateException
    //   861	883	3380	java/lang/IllegalStateException
    //   905	926	3380	java/lang/IllegalStateException
    //   948	951	3380	java/lang/IllegalStateException
    //   340	351	3397	java/lang/IllegalStateException
    //   828	831	3397	java/lang/IllegalStateException
    //   351	374	3415	java/lang/IllegalStateException
    //   374	385	3430	java/lang/IllegalStateException
    //   385	392	3446	java/lang/IllegalStateException
    //   392	401	3446	java/lang/IllegalStateException
    //   407	431	3446	java/lang/IllegalStateException
    //   606	616	3446	java/lang/IllegalStateException
    //   624	636	3446	java/lang/IllegalStateException
    //   682	687	3446	java/lang/IllegalStateException
    //   692	722	3446	java/lang/IllegalStateException
    //   726	738	3446	java/lang/IllegalStateException
    //   763	777	3446	java/lang/IllegalStateException
    //   277	284	3463	java/net/ProtocolException
    //   293	300	3483	java/net/ProtocolException
    //   308	335	3483	java/net/ProtocolException
    //   861	883	3483	java/net/ProtocolException
    //   905	926	3483	java/net/ProtocolException
    //   948	951	3483	java/net/ProtocolException
    //   340	351	3500	java/net/ProtocolException
    //   828	831	3500	java/net/ProtocolException
    //   351	374	3518	java/net/ProtocolException
    //   374	385	3533	java/net/ProtocolException
    //   277	284	3549	java/lang/NumberFormatException
    //   293	300	3569	java/lang/NumberFormatException
    //   308	335	3569	java/lang/NumberFormatException
    //   861	883	3569	java/lang/NumberFormatException
    //   905	926	3569	java/lang/NumberFormatException
    //   948	951	3569	java/lang/NumberFormatException
    //   340	351	3590	java/lang/NumberFormatException
    //   828	831	3590	java/lang/NumberFormatException
    //   351	374	3612	java/lang/NumberFormatException
    //   374	385	3635	java/lang/NumberFormatException
  }

  private static long a(HttpURLConnection paramHttpURLConnection)
  {
    long l = Long.valueOf(paramHttpURLConnection.getHeaderField(z[1])).longValue();
    if (l <= 0L)
      throw new g(z[0]);
    return l;
  }

  // ERROR //
  private static HttpURLConnection a(String paramString, long paramLong)
  {
    // Byte code:
    //   0: new 381	java/net/URL
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 382	java/net/URL:<init>	(Ljava/lang/String;)V
    //   8: invokevirtual 386	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   11: checkcast 259	java/net/HttpURLConnection
    //   14: astore 4
    //   16: aload 4
    //   18: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   21: bipush 16
    //   23: aaload
    //   24: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   27: bipush 18
    //   29: aaload
    //   30: invokevirtual 389	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   33: lload_1
    //   34: lconst_0
    //   35: lcmp
    //   36: iflt +40 -> 76
    //   39: aload 4
    //   41: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   44: bipush 17
    //   46: aaload
    //   47: new 150	java/lang/StringBuilder
    //   50: dup
    //   51: getstatic 78	cn/jpush/android/service/b:z	[Ljava/lang/String;
    //   54: bipush 15
    //   56: aaload
    //   57: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   60: lload_1
    //   61: invokevirtual 363	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   64: ldc_w 391
    //   67: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: invokevirtual 389	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   76: aload 4
    //   78: iconst_0
    //   79: invokestatic 396	cn/jpush/android/util/s:a	(Ljava/net/HttpURLConnection;Z)V
    //   82: aload 4
    //   84: areturn
    //   85: astore_3
    //   86: aconst_null
    //   87: astore 4
    //   89: aload_3
    //   90: astore 5
    //   92: aload 5
    //   94: invokevirtual 399	java/io/IOException:printStackTrace	()V
    //   97: aload 4
    //   99: areturn
    //   100: astore 5
    //   102: goto -10 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   0	16	85	java/io/IOException
    //   16	33	100	java/io/IOException
    //   39	76	100	java/io/IOException
    //   76	82	100	java/io/IOException
  }

  // ERROR //
  private static void a(java.io.InputStream paramInputStream, java.io.BufferedInputStream paramBufferedInputStream, java.io.FileOutputStream paramFileOutputStream, java.io.BufferedOutputStream paramBufferedOutputStream, HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: aload_3
    //   1: ifnull +7 -> 8
    //   4: aload_3
    //   5: invokevirtual 400	java/io/BufferedOutputStream:close	()V
    //   8: aload_2
    //   9: ifnull +7 -> 16
    //   12: aload_2
    //   13: invokevirtual 401	java/io/FileOutputStream:close	()V
    //   16: aload_1
    //   17: ifnull +7 -> 24
    //   20: aload_1
    //   21: invokevirtual 402	java/io/BufferedInputStream:close	()V
    //   24: aload_0
    //   25: ifnull +7 -> 32
    //   28: aload_0
    //   29: invokevirtual 310	java/io/InputStream:close	()V
    //   32: aload 4
    //   34: ifnull +8 -> 42
    //   37: aload 4
    //   39: invokevirtual 405	java/net/HttpURLConnection:disconnect	()V
    //   42: return
    //   43: astore 8
    //   45: goto -37 -> 8
    //   48: astore 7
    //   50: goto -34 -> 16
    //   53: astore 6
    //   55: goto -31 -> 24
    //   58: astore 5
    //   60: goto -28 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   4	8	43	java/io/IOException
    //   12	16	48	java/io/IOException
    //   20	24	53	java/io/IOException
    //   28	32	58	java/io/IOException
  }

  public static boolean a(int paramInt)
  {
    return (2 == paramInt) || (3 == paramInt);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */