package cn.jpush.android.helpers;

import android.content.Context;
import cn.jpush.android.a;
import cn.jpush.android.service.ServiceInterface;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import cn.jpush.android.util.o;

public final class k
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "+<";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 18;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = "6}fCD`yN}t(";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "iva\007d`yN}t2'\007qo`\\B`i{eI(";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "J`oAa\\{fB";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 26;
        break label96;
        i3 = 18;
        break label96;
        i3 = 10;
        break label96;
        i3 = 39;
        break label96;
        m = 0;
      }
    }
  }

  public static void a(Context paramContext)
  {
    ac.b();
    String str1 = ServiceInterface.a();
    String str2 = o.a(paramContext);
    if (an.a(str2))
      str2 = a.I();
    new StringBuilder(z[2]).append(str1).append(z[1]).append(str2);
    ac.a();
    if (an.a(str2))
      ac.b();
    while (true)
    {
      a.m(str1);
      return;
      if ((!str1.equals(str2)) && (!str1.startsWith(z[0])) && (str2.startsWith(z[0])))
      {
        o.a(paramContext, str1);
        ac.b();
        b(paramContext);
        a.p(paramContext);
      }
    }
  }

  // ERROR //
  private static boolean b(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 39	cn/jpush/android/util/ac:b	()V
    //   6: ldc 94
    //   8: astore_2
    //   9: ldc 94
    //   11: astore_3
    //   12: bipush 8
    //   14: newarray byte
    //   16: astore 9
    //   18: aload_0
    //   19: getstatic 32	cn/jpush/android/helpers/k:z	[Ljava/lang/String;
    //   22: iconst_3
    //   23: aaload
    //   24: invokevirtual 100	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   27: astore 10
    //   29: aload 10
    //   31: aload 9
    //   33: iconst_0
    //   34: bipush 8
    //   36: invokevirtual 106	java/io/FileInputStream:read	([BII)I
    //   39: pop
    //   40: iconst_0
    //   41: istore 12
    //   43: lconst_0
    //   44: lstore 5
    //   46: iload 12
    //   48: bipush 8
    //   50: if_icmpge +35 -> 85
    //   53: lload 5
    //   55: bipush 8
    //   57: lshl
    //   58: lstore 18
    //   60: lload 18
    //   62: sipush 255
    //   65: aload 9
    //   67: iload 12
    //   69: baload
    //   70: iand
    //   71: i2l
    //   72: ladd
    //   73: lstore 20
    //   75: iinc 12 1
    //   78: lload 20
    //   80: lstore 5
    //   82: goto -36 -> 46
    //   85: new 60	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 108	java/lang/StringBuilder:<init>	()V
    //   92: astore 13
    //   94: aload 10
    //   96: invokevirtual 111	java/io/FileInputStream:read	()I
    //   99: istore 15
    //   101: iload 15
    //   103: iconst_m1
    //   104: if_icmpeq +39 -> 143
    //   107: aload 13
    //   109: iload 15
    //   111: i2c
    //   112: invokevirtual 114	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: goto -22 -> 94
    //   119: astore 8
    //   121: invokestatic 39	cn/jpush/android/util/ac:b	()V
    //   124: lconst_0
    //   125: lstore 5
    //   127: lload 5
    //   129: lconst_0
    //   130: lcmp
    //   131: ifne +47 -> 178
    //   134: iconst_0
    //   135: istore 7
    //   137: ldc 2
    //   139: monitorexit
    //   140: iload 7
    //   142: ireturn
    //   143: aload 10
    //   145: invokevirtual 117	java/io/FileInputStream:close	()V
    //   148: aload 13
    //   150: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: astore 17
    //   155: aload 17
    //   157: astore_2
    //   158: goto -31 -> 127
    //   161: astore 4
    //   163: lconst_0
    //   164: lstore 5
    //   166: invokestatic 123	cn/jpush/android/util/ac:g	()V
    //   169: goto -42 -> 127
    //   172: astore_1
    //   173: ldc 2
    //   175: monitorexit
    //   176: aload_1
    //   177: athrow
    //   178: aload_3
    //   179: invokestatic 53	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   182: ifeq +7 -> 189
    //   185: invokestatic 126	cn/jpush/android/a:B	()Ljava/lang/String;
    //   188: astore_3
    //   189: aload_3
    //   190: invokestatic 53	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   193: ifeq +12 -> 205
    //   196: invokestatic 39	cn/jpush/android/util/ac:b	()V
    //   199: iconst_0
    //   200: istore 7
    //   202: goto -65 -> 137
    //   205: lload 5
    //   207: aload_2
    //   208: aload_3
    //   209: aload_0
    //   210: invokestatic 131	cn/jpush/android/util/b:j	(Landroid/content/Context;)Ljava/lang/String;
    //   213: getstatic 137	cn/jpush/android/e:f	Ljava/lang/String;
    //   216: invokestatic 140	cn/jpush/android/a:a	(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   219: iconst_1
    //   220: istore 7
    //   222: goto -85 -> 137
    //   225: astore 14
    //   227: goto -61 -> 166
    //
    // Exception table:
    //   from	to	target	type
    //   12	40	119	java/io/FileNotFoundException
    //   60	75	119	java/io/FileNotFoundException
    //   85	94	119	java/io/FileNotFoundException
    //   94	101	119	java/io/FileNotFoundException
    //   107	116	119	java/io/FileNotFoundException
    //   143	155	119	java/io/FileNotFoundException
    //   12	40	161	java/io/IOException
    //   3	6	172	finally
    //   12	40	172	finally
    //   60	75	172	finally
    //   85	94	172	finally
    //   94	101	172	finally
    //   107	116	172	finally
    //   121	124	172	finally
    //   143	155	172	finally
    //   166	169	172	finally
    //   178	189	172	finally
    //   189	199	172	finally
    //   205	219	172	finally
    //   60	75	225	java/io/IOException
    //   85	94	225	java/io/IOException
    //   94	101	225	java/io/IOException
    //   107	116	225	java/io/IOException
    //   143	155	225	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */