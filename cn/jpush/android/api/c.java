package cn.jpush.android.api;

import android.content.Context;
import cn.jpush.android.a;
import cn.jpush.android.util.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  implements Thread.UncaughtExceptionHandler
{
  private static c b;
  private static final String[] z;
  public boolean a = false;
  private Thread.UncaughtExceptionHandler c = null;
  private Context d;

  static
  {
    Object localObject1 = new String[16];
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
        i3 = 4;
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
        str1 = "k?r2a";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "l.o(kp D+}r.";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "a9z,l]'t8";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "v2k:";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "a9z,ln$|,";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "l.o(kp o&tg";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "o.h,ee.";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "G3x:tv\"t1";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "q?z<ov9z<a";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "a9z,lv\"v:";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "a$n1p";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "t.i,mm%u>ig";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "G9i0v";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "t.i,mm%x0`g";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "l>w3";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        z = localObject2;
        b = new c();
        return;
        i3 = 2;
        continue;
        i3 = 75;
        continue;
        i3 = 27;
        continue;
        i3 = 95;
      }
    }
  }

  private c()
  {
  }

  public static c a()
  {
    return b;
  }

  private JSONArray a(Context paramContext, Throwable paramThrowable, String paramString)
  {
    return a(paramContext, d(paramContext), paramThrowable, paramString);
  }

  // ERROR //
  private JSONArray a(Context paramContext, JSONArray paramJSONArray, Throwable paramThrowable, String paramString)
  {
    // Byte code:
    //   0: new 93	java/io/StringWriter
    //   3: dup
    //   4: invokespecial 94	java/io/StringWriter:<init>	()V
    //   7: astore 5
    //   9: aload_3
    //   10: new 96	java/io/PrintWriter
    //   13: dup
    //   14: aload 5
    //   16: invokespecial 99	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   19: invokevirtual 105	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
    //   22: aload 5
    //   24: invokevirtual 108	java/io/StringWriter:toString	()Ljava/lang/String;
    //   27: astore 6
    //   29: aload_2
    //   30: ifnonnull +11 -> 41
    //   33: new 110	org/json/JSONArray
    //   36: dup
    //   37: invokespecial 111	org/json/JSONArray:<init>	()V
    //   40: astore_2
    //   41: new 113	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   48: aload 4
    //   50: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: aload_3
    //   54: invokevirtual 119	java/lang/Throwable:toString	()Ljava/lang/String;
    //   57: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: astore 7
    //   65: aload 7
    //   67: ldc 122
    //   69: invokevirtual 126	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   72: astore 31
    //   74: aload 31
    //   76: arraylength
    //   77: iconst_1
    //   78: if_icmple +56 -> 134
    //   81: iconst_m1
    //   82: aload 31
    //   84: arraylength
    //   85: iadd
    //   86: istore 32
    //   88: iload 32
    //   90: iflt +44 -> 134
    //   93: aload 31
    //   95: iload 32
    //   97: aaload
    //   98: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   101: bipush 8
    //   103: aaload
    //   104: invokevirtual 130	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   107: ifne +20 -> 127
    //   110: aload 31
    //   112: iload 32
    //   114: aaload
    //   115: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   118: bipush 13
    //   120: aaload
    //   121: invokevirtual 130	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   124: ifeq +353 -> 477
    //   127: aload 31
    //   129: iload 32
    //   131: aaload
    //   132: astore 7
    //   134: iconst_0
    //   135: istore 9
    //   137: iload 9
    //   139: aload_2
    //   140: invokevirtual 134	org/json/JSONArray:length	()I
    //   143: if_icmpge +325 -> 468
    //   146: aload_2
    //   147: iload 9
    //   149: invokevirtual 138	org/json/JSONArray:optJSONObject	(I)Lorg/json/JSONObject;
    //   152: astore 26
    //   154: aload 26
    //   156: ifnull +327 -> 483
    //   159: aload 6
    //   161: aload 26
    //   163: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   166: bipush 9
    //   168: aaload
    //   169: invokevirtual 144	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   172: invokevirtual 148	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   175: ifeq +308 -> 483
    //   178: iconst_1
    //   179: aload 26
    //   181: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   184: bipush 11
    //   186: aaload
    //   187: invokevirtual 152	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   190: iadd
    //   191: istore 27
    //   193: aload 26
    //   195: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   198: bipush 11
    //   200: aaload
    //   201: iload 27
    //   203: invokevirtual 156	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   206: pop
    //   207: aload 26
    //   209: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   212: bipush 10
    //   214: aaload
    //   215: invokestatic 162	java/lang/System:currentTimeMillis	()J
    //   218: invokevirtual 165	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   221: pop
    //   222: aload 26
    //   224: astore 12
    //   226: aload 12
    //   228: ifnull +19 -> 247
    //   231: aload_2
    //   232: iload 9
    //   234: invokestatic 168	cn/jpush/android/api/c:a	(Lorg/json/JSONArray;I)Lorg/json/JSONArray;
    //   237: astore_2
    //   238: aload_2
    //   239: aload 12
    //   241: invokevirtual 171	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   244: pop
    //   245: aload_2
    //   246: areturn
    //   247: new 140	org/json/JSONObject
    //   250: dup
    //   251: invokespecial 172	org/json/JSONObject:<init>	()V
    //   254: astore 14
    //   256: aload 14
    //   258: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   261: bipush 10
    //   263: aaload
    //   264: invokestatic 162	java/lang/System:currentTimeMillis	()J
    //   267: invokevirtual 165	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   270: pop
    //   271: aload 14
    //   273: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   276: bipush 9
    //   278: aaload
    //   279: aload 6
    //   281: invokevirtual 175	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   284: pop
    //   285: aload 14
    //   287: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   290: bipush 7
    //   292: aaload
    //   293: aload 7
    //   295: invokevirtual 175	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   298: pop
    //   299: aload 14
    //   301: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   304: bipush 11
    //   306: aaload
    //   307: iconst_1
    //   308: invokevirtual 156	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   311: pop
    //   312: aload_0
    //   313: getfield 177	cn/jpush/android/api/c:d	Landroid/content/Context;
    //   316: ifnonnull +7 -> 323
    //   319: aload_1
    //   320: ifnull +19 -> 339
    //   323: aload 14
    //   325: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   328: bipush 6
    //   330: aaload
    //   331: aload_1
    //   332: invokestatic 182	cn/jpush/android/util/b:c	(Landroid/content/Context;)Ljava/lang/String;
    //   335: invokevirtual 175	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   338: pop
    //   339: aload_0
    //   340: getfield 177	cn/jpush/android/api/c:d	Landroid/content/Context;
    //   343: ifnull +92 -> 435
    //   346: aload_0
    //   347: getfield 177	cn/jpush/android/api/c:d	Landroid/content/Context;
    //   350: invokevirtual 188	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   353: aload_0
    //   354: getfield 177	cn/jpush/android/api/c:d	Landroid/content/Context;
    //   357: invokevirtual 191	android/content/Context:getPackageName	()Ljava/lang/String;
    //   360: iconst_1
    //   361: invokevirtual 197	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   364: astore 20
    //   366: aload 20
    //   368: ifnull +67 -> 435
    //   371: aload 20
    //   373: getfield 203	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   376: ifnonnull +68 -> 444
    //   379: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   382: bipush 15
    //   384: aaload
    //   385: astore 21
    //   387: new 113	java/lang/StringBuilder
    //   390: dup
    //   391: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   394: aload 20
    //   396: getfield 207	android/content/pm/PackageInfo:versionCode	I
    //   399: invokevirtual 210	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   402: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   405: astore 22
    //   407: aload 14
    //   409: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   412: bipush 12
    //   414: aaload
    //   415: aload 21
    //   417: invokevirtual 175	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   420: pop
    //   421: aload 14
    //   423: getstatic 66	cn/jpush/android/api/c:z	[Ljava/lang/String;
    //   426: bipush 14
    //   428: aaload
    //   429: aload 22
    //   431: invokevirtual 175	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   434: pop
    //   435: aload_2
    //   436: aload 14
    //   438: invokevirtual 171	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   441: pop
    //   442: aload_2
    //   443: areturn
    //   444: aload 20
    //   446: getfield 203	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   449: astore 21
    //   451: goto -64 -> 387
    //   454: astore 10
    //   456: aload_2
    //   457: areturn
    //   458: astore 30
    //   460: goto -326 -> 134
    //   463: astore 8
    //   465: goto -331 -> 134
    //   468: iconst_0
    //   469: istore 9
    //   471: aconst_null
    //   472: astore 12
    //   474: goto -248 -> 226
    //   477: iinc 32 255
    //   480: goto -392 -> 88
    //   483: iinc 9 1
    //   486: goto -349 -> 137
    //   489: astore 11
    //   491: aload_2
    //   492: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   137	154	454	android/content/pm/PackageManager$NameNotFoundException
    //   159	222	454	android/content/pm/PackageManager$NameNotFoundException
    //   231	245	454	android/content/pm/PackageManager$NameNotFoundException
    //   247	319	454	android/content/pm/PackageManager$NameNotFoundException
    //   323	339	454	android/content/pm/PackageManager$NameNotFoundException
    //   339	366	454	android/content/pm/PackageManager$NameNotFoundException
    //   371	387	454	android/content/pm/PackageManager$NameNotFoundException
    //   387	435	454	android/content/pm/PackageManager$NameNotFoundException
    //   435	442	454	android/content/pm/PackageManager$NameNotFoundException
    //   444	451	454	android/content/pm/PackageManager$NameNotFoundException
    //   65	88	458	java/util/regex/PatternSyntaxException
    //   93	127	458	java/util/regex/PatternSyntaxException
    //   127	134	458	java/util/regex/PatternSyntaxException
    //   65	88	463	java/lang/NullPointerException
    //   93	127	463	java/lang/NullPointerException
    //   127	134	463	java/lang/NullPointerException
    //   137	154	489	org/json/JSONException
    //   159	222	489	org/json/JSONException
    //   231	245	489	org/json/JSONException
    //   247	319	489	org/json/JSONException
    //   323	339	489	org/json/JSONException
    //   339	366	489	org/json/JSONException
    //   371	387	489	org/json/JSONException
    //   387	435	489	org/json/JSONException
    //   435	442	489	org/json/JSONException
    //   444	451	489	org/json/JSONException
  }

  private static JSONArray a(JSONArray paramJSONArray, int paramInt)
  {
    if (paramJSONArray == null)
      return null;
    localJSONArray = new JSONArray();
    int i = 0;
    while (true)
      if (i < paramJSONArray.length())
      {
        if (i != paramInt);
        try
        {
          localJSONArray.put(paramJSONArray.get(i));
          label39: i++;
          continue;
          return localJSONArray;
        }
        catch (JSONException localJSONException)
        {
          break label39;
        }
      }
  }

  private static void a(Context paramContext, JSONArray paramJSONArray)
  {
    String str = paramJSONArray.toString();
    if ((str != null) && (str.length() > 0) && (paramContext != null));
    try
    {
      FileOutputStream localFileOutputStream = paramContext.openFileOutput(z[0], 0);
      localFileOutputStream.write(str.getBytes());
      localFileOutputStream.flush();
      localFileOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
    }
  }

  public static void b(Context paramContext)
  {
    if (paramContext == null);
    File localFile;
    do
    {
      return;
      localFile = new File(paramContext.getFilesDir(), z[0]);
    }
    while (!localFile.exists());
    localFile.delete();
  }

  private static JSONArray d(Context paramContext)
  {
    if (!new File(paramContext.getFilesDir(), z[0]).exists())
      return null;
    try
    {
      FileInputStream localFileInputStream = paramContext.openFileInput(z[0]);
      byte[] arrayOfByte = new byte[1024];
      StringBuffer localStringBuffer = new StringBuffer();
      while (true)
      {
        int i = localFileInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        localStringBuffer.append(new String(arrayOfByte, 0, i));
      }
      if (localStringBuffer.toString().length() > 0)
        localJSONArray = new JSONArray(localStringBuffer.toString());
    }
    catch (Exception localException)
    {
      localJSONArray = null;
    }
    JSONArray localJSONArray;
    return localJSONArray;
  }

  public final void a(Context paramContext)
  {
    this.d = paramContext;
    if (this.c == null)
      this.c = Thread.getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler(this);
    this.a = true;
  }

  public final void a(Throwable paramThrowable, String paramString)
  {
    if ((!this.a) || (this.d == null))
      return;
    JSONArray localJSONArray = a(this.d, paramThrowable, paramString);
    b(this.d);
    a(this.d, localJSONArray);
  }

  public final JSONObject c(Context paramContext)
  {
    if (!this.a);
    JSONArray localJSONArray;
    do
    {
      return null;
      localJSONArray = d(paramContext);
    }
    while (localJSONArray == null);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(z[5], localJSONArray);
      localJSONObject.put(z[1], a.m());
      localJSONObject.put(z[4], z[3]);
      localJSONObject.put(z[2], b.c(paramContext));
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return localJSONObject;
  }

  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    JSONArray localJSONArray = a(this.d, paramThrowable, "");
    b(this.d);
    a(this.d, localJSONArray);
    if (this.c != this)
      this.c.uncaughtException(paramThread, paramThrowable);
    throw new RuntimeException(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */