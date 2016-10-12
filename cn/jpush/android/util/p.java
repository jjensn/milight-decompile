package cn.jpush.android.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class p
{
  public static final String a = new String((char[])localObject4).intern() + File.separator;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[7];
    int i = 0;
    String str1 = "\033V";
    int j = -1;
    Object localObject2 = localObject1;
    int i9;
    label133: String str2;
    while (true)
    {
      Object localObject3 = str1.toCharArray();
      int k = localObject3.length;
      int m = 0;
      if (k <= 1);
      while (k > m)
      {
        Object localObject7 = localObject3;
        int i6 = m;
        int i7 = k;
        Object localObject8 = localObject3;
        while (true)
        {
          int i8 = localObject8[m];
          switch (i6 % 5)
          {
          default:
            i9 = 110;
            localObject8[m] = (char)(i9 ^ i8);
            m = i6 + 1;
            if (i7 != 0)
              break label133;
            localObject8 = localObject7;
            i6 = m;
            m = i7;
          case 0:
          case 1:
          case 2:
          case 3:
          }
        }
        k = i7;
        localObject3 = localObject7;
      }
      str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "j<egWi\034f7J";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\033U";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "\033&;.\034[\0161e\nU\0234e";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "P\006!+NP\016'pN";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "`\0170j\032U\0252/\032\024\003<8T\024";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "P\016'";
        j = 5;
        localObject1 = localObject2;
      case 5:
      }
    }
    localObject1[i] = str2;
    z = localObject2;
    StringBuilder localStringBuilder = new StringBuilder().append(File.separator);
    Object localObject4 = "F\0166\"".toCharArray();
    int n = localObject4.length;
    int i1 = 0;
    if (n <= 1);
    label371: label509: 
    while (n > i1)
    {
      Object localObject5 = localObject4;
      int i2 = i1;
      int i3 = n;
      Object localObject6 = localObject4;
      int i4 = localObject6[i1];
      int i5;
      switch (i2 % 5)
      {
      default:
        i5 = 110;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        localObject6[i1] = (char)(i5 ^ i4);
        i1 = i2 + 1;
        if (i3 != 0)
          break label509;
        localObject6 = localObject5;
        i2 = i1;
        i1 = i3;
        break label371;
        i9 = 52;
        break;
        i9 = 103;
        break;
        i9 = 85;
        break;
        i9 = 74;
        break;
        i5 = 52;
        continue;
        i5 = 103;
        continue;
        i5 = 85;
        continue;
        i5 = 74;
      }
      n = i3;
      localObject4 = localObject5;
    }
  }

  public static String a(Context paramContext)
  {
    if (b.a())
    {
      String str1 = a(Environment.getExternalStorageDirectory().getAbsolutePath());
      String str2 = str1 + e(paramContext) + z[0];
      if (!new File(str2).isDirectory())
        d(paramContext);
      return str2 + File.separator;
    }
    return "";
  }

  public static String a(Context paramContext, String paramString)
  {
    str = paramContext.getFilesDir() + "/" + paramString;
    try
    {
      File localFile = new File(str);
      if (!localFile.exists())
        localFile.mkdir();
      return str + "/";
    }
    catch (Exception localException)
    {
      while (true)
        localException.printStackTrace();
    }
  }

  private static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      paramString = "";
    while (paramString.lastIndexOf(File.separator) == 0)
      return paramString;
    return paramString + File.separator;
  }

  private static boolean a(File paramFile)
  {
    try
    {
      if (!paramFile.exists())
        return false;
      if (paramFile.isFile())
        return paramFile.delete();
      arrayOfString = paramFile.list();
      i = arrayOfString.length;
      j = 0;
      if (j < i)
      {
        localFile = new File(paramFile, arrayOfString[j]);
        if (localFile.isDirectory())
          a(localFile);
        else
          localFile.delete();
      }
    }
    catch (Exception localException)
    {
      ac.e();
      return false;
    }
    while (true)
    {
      String[] arrayOfString;
      int i;
      int j;
      File localFile;
      boolean bool = paramFile.delete();
      return bool;
      j++;
    }
  }

  public static String b(Context paramContext)
  {
    if (b.a())
    {
      String str1 = a(Environment.getExternalStorageDirectory().getAbsolutePath());
      String str2 = str1 + e(paramContext) + z[2];
      if (!new File(str2).isDirectory())
        d(paramContext);
      return str2 + "/";
    }
    return "";
  }

  public static String b(Context paramContext, String paramString)
  {
    String str1;
    try
    {
      if (b.a())
      {
        String str3 = Environment.getExternalStorageDirectory().getAbsolutePath();
        str1 = str3 + z[3] + paramContext.getPackageName() + File.separator + paramString + File.separator;
        File localFile2 = new File(str1);
        if (!localFile2.exists())
        {
          localFile2.mkdirs();
          return str1;
        }
      }
      else
      {
        File localFile1 = new File(paramContext.getFilesDir() + a);
        if ((localFile1.exists()) && (localFile1.isDirectory()))
        {
          File[] arrayOfFile = localFile1.listFiles();
          if (arrayOfFile.length > 10)
          {
            Arrays.sort(arrayOfFile, new q());
            a(arrayOfFile[(-1 + arrayOfFile.length)]);
          }
        }
        String str2 = c(paramContext, paramString);
        return str2;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      str1 = "";
    }
    return str1;
  }

  private static String c(Context paramContext, String paramString)
  {
    str = paramContext.getFilesDir() + a + paramString;
    try
    {
      File localFile = new File(str);
      if (!localFile.exists())
        localFile.mkdirs();
      return str + "/";
    }
    catch (Exception localException)
    {
      while (true)
        localException.printStackTrace();
    }
  }

  public static void c(Context paramContext)
  {
    try
    {
      File[] arrayOfFile = paramContext.getFilesDir().listFiles();
      int i = arrayOfFile.length;
      j = 0;
      if (j < i)
      {
        localFile = arrayOfFile[j];
        str = localFile.getName();
        if (TextUtils.isEmpty(str));
        for (k = 0; k != 0; k = bool)
        {
          r.a(localFile.getAbsolutePath());
          break;
          bool = Pattern.compile(z[1]).matcher(str).matches();
        }
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    while (true)
    {
      int j;
      File localFile;
      String str;
      int k;
      boolean bool;
      return;
      j++;
    }
  }

  private static void d(Context paramContext)
  {
    try
    {
      if (b.a())
      {
        String str1 = e(paramContext);
        String str2 = Environment.getExternalStorageDirectory().getAbsolutePath();
        File localFile1 = new File(str2 + str1);
        if (!localFile1.isDirectory())
          localFile1.mkdirs();
        File localFile2 = new File(str2 + str1 + z[0]);
        if (!localFile2.isDirectory())
          localFile2.mkdirs();
        File localFile3 = new File(str2 + str1 + z[2]);
        if (!localFile3.isDirectory())
          localFile3.mkdirs();
        File localFile4 = new File(str2 + str1 + File.separator + paramContext.getPackageName());
        if (!localFile4.isDirectory())
          localFile4.mkdirs();
      }
      else
      {
        ac.e();
        return;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  // ERROR //
  private static String e(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: invokestatic 196	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   6: astore_2
    //   7: aload_2
    //   8: getstatic 40	cn/jpush/android/util/p:z	[Ljava/lang/String;
    //   11: bipush 6
    //   13: aaload
    //   14: ldc 93
    //   16: invokeinterface 202 3 0
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 121	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   26: ifeq +232 -> 258
    //   29: invokestatic 72	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   32: invokevirtual 75	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   35: astore 4
    //   37: getstatic 40	cn/jpush/android/util/p:z	[Ljava/lang/String;
    //   40: iconst_3
    //   41: aaload
    //   42: astore 5
    //   44: new 46	java/io/File
    //   47: dup
    //   48: new 42	java/lang/StringBuilder
    //   51: dup
    //   52: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   55: aload 4
    //   57: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload 5
    //   62: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: invokespecial 84	java/io/File:<init>	(Ljava/lang/String;)V
    //   71: astore 6
    //   73: aload 6
    //   75: invokevirtual 109	java/io/File:exists	()Z
    //   78: ifeq +216 -> 294
    //   81: new 204	java/util/ArrayList
    //   84: dup
    //   85: invokespecial 205	java/util/ArrayList:<init>	()V
    //   88: astore 12
    //   90: aload 6
    //   92: invokevirtual 156	java/io/File:listFiles	()[Ljava/io/File;
    //   95: astore 13
    //   97: aload 13
    //   99: arraylength
    //   100: istore 14
    //   102: iload_1
    //   103: iload 14
    //   105: if_icmpge +55 -> 160
    //   108: aload 13
    //   110: iload_1
    //   111: aaload
    //   112: astore 15
    //   114: aload 15
    //   116: invokevirtual 87	java/io/File:isDirectory	()Z
    //   119: ifeq +241 -> 360
    //   122: aload 12
    //   124: aload 15
    //   126: invokevirtual 171	java/io/File:getName	()Ljava/lang/String;
    //   129: invokevirtual 209	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   132: pop
    //   133: new 42	java/lang/StringBuilder
    //   136: dup
    //   137: getstatic 40	cn/jpush/android/util/p:z	[Ljava/lang/String;
    //   140: iconst_4
    //   141: aaload
    //   142: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   145: aload 15
    //   147: invokevirtual 171	java/io/File:getName	()Ljava/lang/String;
    //   150: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: invokestatic 212	cn/jpush/android/util/ac:a	()V
    //   157: goto +203 -> 360
    //   160: aload 12
    //   162: invokevirtual 216	java/util/ArrayList:size	()I
    //   165: istore 18
    //   167: iload 18
    //   169: ifle +91 -> 260
    //   172: aload 12
    //   174: iload 18
    //   176: iconst_2
    //   177: idiv
    //   178: invokevirtual 220	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   181: checkcast 12	java/lang/String
    //   184: astore 8
    //   186: new 42	java/lang/StringBuilder
    //   189: dup
    //   190: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   193: aload 5
    //   195: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: aload 8
    //   200: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: astore 19
    //   208: aload 19
    //   210: astore 8
    //   212: new 42	java/lang/StringBuilder
    //   215: dup
    //   216: getstatic 40	cn/jpush/android/util/p:z	[Ljava/lang/String;
    //   219: iconst_5
    //   220: aaload
    //   221: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   224: aload 8
    //   226: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: invokestatic 222	cn/jpush/android/util/ac:c	()V
    //   233: aload_2
    //   234: invokeinterface 226 1 0
    //   239: getstatic 40	cn/jpush/android/util/p:z	[Ljava/lang/String;
    //   242: bipush 6
    //   244: aaload
    //   245: aload 8
    //   247: invokeinterface 232 3 0
    //   252: invokeinterface 235 1 0
    //   257: pop
    //   258: aload_3
    //   259: areturn
    //   260: new 42	java/lang/StringBuilder
    //   263: dup
    //   264: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   267: aload 5
    //   269: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: invokestatic 241	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   275: invokevirtual 242	java/util/UUID:toString	()Ljava/lang/String;
    //   278: iconst_0
    //   279: iconst_5
    //   280: invokevirtual 246	java/lang/String:substring	(II)Ljava/lang/String;
    //   283: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   289: astore 8
    //   291: goto -79 -> 212
    //   294: aload 6
    //   296: invokevirtual 152	java/io/File:mkdirs	()Z
    //   299: pop
    //   300: new 42	java/lang/StringBuilder
    //   303: dup
    //   304: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   307: aload 5
    //   309: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: invokestatic 241	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   315: invokevirtual 242	java/util/UUID:toString	()Ljava/lang/String;
    //   318: iconst_0
    //   319: iconst_5
    //   320: invokevirtual 246	java/lang/String:substring	(II)Ljava/lang/String;
    //   323: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   329: astore 21
    //   331: aload 21
    //   333: astore 8
    //   335: goto -123 -> 212
    //   338: astore 7
    //   340: aconst_null
    //   341: astore 8
    //   343: aload 7
    //   345: astore 9
    //   347: aload 9
    //   349: invokevirtual 115	java/lang/Exception:printStackTrace	()V
    //   352: goto -140 -> 212
    //   355: astore 9
    //   357: goto -10 -> 347
    //   360: iinc 1 1
    //   363: goto -261 -> 102
    //
    // Exception table:
    //   from	to	target	type
    //   73	102	338	java/lang/Exception
    //   108	157	338	java/lang/Exception
    //   160	167	338	java/lang/Exception
    //   172	186	338	java/lang/Exception
    //   260	291	338	java/lang/Exception
    //   294	331	338	java/lang/Exception
    //   186	208	355	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */