package cn.jpush.android.util;

import android.content.Context;
import cn.jpush.android.a;
import cn.jpush.android.service.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends Thread
{
  private static Object c;
  private static Object d;
  private static final String[] z;
  private String a;
  private Context b;

  static
  {
    Object localObject1 = new String[17];
    int i = 0;
    String str1 = "";
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
        i3 = 16;
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
        str1 = "";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\016\007BCu]\022]A@\034\020FPw\030=L\\u\016I";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "[U";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\034\003]aq\036\030LVu3\022@Tc";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\016\022[T0\021\034J\021y\023SZCy\t\026eXc\t\034_H\\\022\024\027;";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "('k\034(";
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
        str1 = "";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "\036\022C\026d]\034]T~]\022]A@\034\020FPw\030=L\\u\016SBDd\r\006Ybd\017\026L\\<]\024DGu]\006]\021c\034\005H\021*";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "\036\022C\026d]\034]T~]\022]A@\034\020FPw\030=L\\u\016SD_`\b\007~Eb\030\022@\0350\032\032[T0\b\003\rCu\034\027\r\021*";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "\036\022C\026d]\026CR\031\032CV0\034\003]aq\036\030LVu3\022@TcQSJXf\030SXA0\017\026LU0G";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "\036\022C\026d]\001HPt]\022]A@\034\020FPw\030=L\\u\016_\rVy\013\026\rD`]\001HPt]I";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "wSD_c\t\022A]u\031SLA`-\022NZq\032\026cP}\030I";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "/\026]^b\t&^Tb(\003IPd\0302]Ac]\034AUQ\r\003AXc\t]^Xj\030[\004\013";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "\b\035D_c\t\022A]u\031SLA`-\022NZq\032\026cP}\030I";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        z = localObject2;
        c = new Object();
        d = new Object();
        return;
        i3 = 125;
        continue;
        i3 = 115;
        continue;
        i3 = 45;
        continue;
        i3 = 49;
      }
    }
  }

  public d(Context paramContext, String paramString)
  {
    this.b = paramContext;
    this.a = paramString;
  }

  // ERROR //
  private static String a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +8 -> 9
    //   4: invokestatic 90	cn/jpush/android/util/ac:d	()V
    //   7: aconst_null
    //   8: areturn
    //   9: aload_0
    //   10: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   13: iconst_4
    //   14: aaload
    //   15: invokevirtual 96	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   18: astore 8
    //   20: aload 8
    //   22: astore_2
    //   23: iconst_1
    //   24: aload_2
    //   25: invokevirtual 102	java/io/FileInputStream:available	()I
    //   28: iadd
    //   29: newarray byte
    //   31: astore 9
    //   33: aload_2
    //   34: aload 9
    //   36: invokevirtual 106	java/io/FileInputStream:read	([B)I
    //   39: pop
    //   40: aload_2
    //   41: invokestatic 111	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   44: new 17	java/lang/String
    //   47: dup
    //   48: aload 9
    //   50: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   53: bipush 7
    //   55: aaload
    //   56: invokespecial 114	java/lang/String:<init>	([BLjava/lang/String;)V
    //   59: astore 11
    //   61: aload 11
    //   63: invokestatic 119	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   66: ifeq +118 -> 184
    //   69: invokestatic 121	cn/jpush/android/util/ac:b	()V
    //   72: aconst_null
    //   73: areturn
    //   74: astore 12
    //   76: new 123	java/lang/StringBuilder
    //   79: dup
    //   80: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   83: bipush 12
    //   85: aaload
    //   86: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: aload 12
    //   91: invokevirtual 129	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
    //   94: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: invokestatic 121	cn/jpush/android/util/ac:b	()V
    //   101: aconst_null
    //   102: areturn
    //   103: astore 6
    //   105: aconst_null
    //   106: astore_2
    //   107: new 123	java/lang/StringBuilder
    //   110: dup
    //   111: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   114: bipush 11
    //   116: aaload
    //   117: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   120: aload 6
    //   122: invokevirtual 134	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   125: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: invokestatic 121	cn/jpush/android/util/ac:b	()V
    //   132: aload_2
    //   133: invokestatic 111	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   136: aconst_null
    //   137: areturn
    //   138: astore 4
    //   140: aconst_null
    //   141: astore_2
    //   142: new 123	java/lang/StringBuilder
    //   145: dup
    //   146: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   149: bipush 13
    //   151: aaload
    //   152: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   155: aload 4
    //   157: invokevirtual 135	java/io/IOException:getMessage	()Ljava/lang/String;
    //   160: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: invokestatic 121	cn/jpush/android/util/ac:b	()V
    //   167: aload_2
    //   168: invokestatic 111	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   171: aconst_null
    //   172: areturn
    //   173: astore_1
    //   174: aconst_null
    //   175: astore_2
    //   176: aload_1
    //   177: astore_3
    //   178: aload_2
    //   179: invokestatic 111	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   182: aload_3
    //   183: athrow
    //   184: aload 11
    //   186: areturn
    //   187: astore_3
    //   188: goto -10 -> 178
    //   191: astore 4
    //   193: goto -51 -> 142
    //   196: astore 6
    //   198: goto -91 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   44	72	74	java/io/UnsupportedEncodingException
    //   9	20	103	java/io/FileNotFoundException
    //   9	20	138	java/io/IOException
    //   9	20	173	finally
    //   23	40	187	finally
    //   107	132	187	finally
    //   142	167	187	finally
    //   23	40	191	java/io/IOException
    //   23	40	196	java/io/FileNotFoundException
  }

  private static HashSet<String> a(String paramString)
  {
    if (paramString == null)
      ac.a();
    String[] arrayOfString = paramString.replace("", "").split(z[3]);
    HashSet localHashSet = new HashSet();
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
      localHashSet.add(arrayOfString[j]);
    return localHashSet;
  }

  private void a(ArrayList<ad> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      ac.a();
    StringBuilder localStringBuilder;
    do
    {
      return;
      localStringBuilder = new StringBuilder();
      for (int i = 0; i < paramArrayList.size(); i++)
      {
        localStringBuilder.append(((ad)paramArrayList.get(i)).b);
        if (i != -1 + paramArrayList.size())
          localStringBuilder.append(z[3]);
      }
      new StringBuilder(z[2]).append(localStringBuilder.toString());
      ac.b();
    }
    while (!a(this.b, localStringBuilder.toString()));
    ac.b();
  }

  private void a(HashSet<String> paramHashSet)
  {
    if (this.b == null)
      ac.d();
    JSONArray localJSONArray;
    ArrayList localArrayList1;
    do
    {
      return;
      if ((paramHashSet == null) || (paramHashSet.isEmpty()))
      {
        ac.d();
        return;
      }
      new StringBuilder(z[15]).append(paramHashSet.size());
      ac.b();
      localJSONArray = new JSONArray();
      localArrayList1 = v.a(this.b, true);
      ArrayList localArrayList2 = new ArrayList();
      localArrayList2.addAll(localArrayList1);
      Iterator localIterator1 = localArrayList1.iterator();
      while (localIterator1.hasNext())
      {
        ad localad = (ad)localIterator1.next();
        if (paramHashSet.remove(localad.b))
          localArrayList2.remove(localad);
        if ((!an.a(this.a)) && (localad.b.equals(this.a)))
          localArrayList2.remove(localad);
      }
      if (!an.a(this.a))
        paramHashSet.remove(this.a);
      new StringBuilder(z[16]).append(paramHashSet.toString()).append(z[14]).append(localArrayList2.toString());
      ac.b();
      Iterator localIterator2 = paramHashSet.iterator();
      while (localIterator2.hasNext())
      {
        JSONObject localJSONObject2 = r.b((String)localIterator2.next());
        if (localJSONObject2 != null)
          localJSONArray.put(localJSONObject2);
      }
      Iterator localIterator3 = localArrayList2.iterator();
      while (localIterator3.hasNext())
      {
        JSONObject localJSONObject1 = r.a(((ad)localIterator3.next()).b);
        if (localJSONObject1 != null)
          localJSONArray.put(localJSONObject1);
      }
      if (localJSONArray.length() > 0)
        ah.a(this.b, localJSONArray);
    }
    while ((localJSONArray.length() <= 0) && (an.a(this.a)));
    a(localArrayList1);
  }

  // ERROR //
  private static boolean a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +8 -> 9
    //   4: invokestatic 90	cn/jpush/android/util/ac:d	()V
    //   7: iconst_0
    //   8: ireturn
    //   9: getstatic 73	cn/jpush/android/util/d:d	Ljava/lang/Object;
    //   12: astore_2
    //   13: aload_2
    //   14: monitorenter
    //   15: aload_1
    //   16: ifnull +23 -> 39
    //   19: new 123	java/lang/StringBuilder
    //   22: dup
    //   23: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   26: iconst_5
    //   27: aaload
    //   28: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   31: aload_1
    //   32: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: invokestatic 138	cn/jpush/android/util/ac:a	()V
    //   39: aconst_null
    //   40: astore_3
    //   41: aload_0
    //   42: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   45: iconst_4
    //   46: aaload
    //   47: iconst_0
    //   48: invokevirtual 251	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   51: astore_3
    //   52: aload_3
    //   53: aload_1
    //   54: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   57: bipush 7
    //   59: aaload
    //   60: invokevirtual 255	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   63: invokevirtual 261	java/io/FileOutputStream:write	([B)V
    //   66: aload_3
    //   67: invokestatic 111	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   70: aload_2
    //   71: monitorexit
    //   72: iconst_1
    //   73: ireturn
    //   74: astore 14
    //   76: invokestatic 264	cn/jpush/android/util/ac:h	()V
    //   79: goto -40 -> 39
    //   82: astore 5
    //   84: aload_2
    //   85: monitorexit
    //   86: aload 5
    //   88: athrow
    //   89: astore 12
    //   91: new 123	java/lang/StringBuilder
    //   94: dup
    //   95: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   98: bipush 10
    //   100: aaload
    //   101: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   104: aload 12
    //   106: invokevirtual 134	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   109: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: invokestatic 121	cn/jpush/android/util/ac:b	()V
    //   116: aload_3
    //   117: invokestatic 111	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   120: aload_2
    //   121: monitorexit
    //   122: iconst_0
    //   123: ireturn
    //   124: astore 10
    //   126: new 123	java/lang/StringBuilder
    //   129: dup
    //   130: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   133: bipush 9
    //   135: aaload
    //   136: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   139: aload 10
    //   141: invokevirtual 129	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
    //   144: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: invokestatic 121	cn/jpush/android/util/ac:b	()V
    //   151: aload_3
    //   152: invokestatic 111	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   155: aload_2
    //   156: monitorexit
    //   157: iconst_0
    //   158: ireturn
    //   159: astore 8
    //   161: new 123	java/lang/StringBuilder
    //   164: dup
    //   165: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   168: bipush 8
    //   170: aaload
    //   171: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   174: aload 8
    //   176: invokevirtual 135	java/io/IOException:getMessage	()Ljava/lang/String;
    //   179: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: invokestatic 121	cn/jpush/android/util/ac:b	()V
    //   186: aload_3
    //   187: invokestatic 111	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   190: aload_2
    //   191: monitorexit
    //   192: iconst_0
    //   193: ireturn
    //   194: astore 6
    //   196: new 123	java/lang/StringBuilder
    //   199: dup
    //   200: getstatic 65	cn/jpush/android/util/d:z	[Ljava/lang/String;
    //   203: bipush 6
    //   205: aaload
    //   206: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   209: aload 6
    //   211: invokevirtual 265	java/lang/NullPointerException:getMessage	()Ljava/lang/String;
    //   214: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: invokestatic 121	cn/jpush/android/util/ac:b	()V
    //   221: aload_3
    //   222: invokestatic 111	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   225: aload_2
    //   226: monitorexit
    //   227: iconst_0
    //   228: ireturn
    //   229: astore 4
    //   231: aload_3
    //   232: invokestatic 111	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   235: aload 4
    //   237: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   19	39	74	java/lang/Exception
    //   19	39	82	finally
    //   66	72	82	finally
    //   76	79	82	finally
    //   84	86	82	finally
    //   116	122	82	finally
    //   151	157	82	finally
    //   186	192	82	finally
    //   221	227	82	finally
    //   231	238	82	finally
    //   41	66	89	java/io/FileNotFoundException
    //   41	66	124	java/io/UnsupportedEncodingException
    //   41	66	159	java/io/IOException
    //   41	66	194	java/lang/NullPointerException
    //   41	66	229	finally
    //   91	116	229	finally
    //   126	151	229	finally
    //   161	186	229	finally
    //   196	221	229	finally
  }

  public final void run()
  {
    try
    {
      synchronized (c)
      {
        if (this.b == null)
        {
          ac.d();
          return;
        }
        str = a(this.b);
        new StringBuilder(z[0]).append(str);
        ac.b();
        if (str == null)
        {
          a(v.a(this.b, true));
          return;
        }
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      new StringBuilder(z[1]).append(localException.getMessage());
      ac.b();
      return;
    }
    while (true)
    {
      String str;
      if (!a.y())
        return;
      a.e();
      a(a(str));
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */