package cn.jpush.android.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public final class r
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[6];
    int i = 0;
    String str1 = "j*m!'\037";
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
        i3 = 22;
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
        str1 = "\025Pj+I\034";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "c=\023^6N\0071fsU\034";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "x<\031?.";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\001H<}xY\r1f,";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 45;
        continue;
        i3 = 104;
        continue;
        i3 = 95;
        continue;
        i3 = 18;
      }
    }
  }

  public static ArrayList<String> a(InputStream paramInputStream)
  {
    ArrayList localArrayList = new ArrayList();
    InputStreamReader localInputStreamReader;
    BufferedReader localBufferedReader;
    try
    {
      localInputStreamReader = new InputStreamReader(paramInputStream, z[4]);
      localBufferedReader = new BufferedReader(localInputStreamReader, 2048);
      while (true)
      {
        String str1 = localBufferedReader.readLine();
        if (str1 == null)
          break;
        String str2 = str1.trim();
        if (!"".equals(str2))
          localArrayList.add(str2);
      }
    }
    catch (Exception localException)
    {
      localException.getMessage();
      ac.e();
      return localArrayList;
    }
    localInputStreamReader.close();
    localBufferedReader.close();
    return localArrayList;
  }

  private static void a(File paramFile, ZipOutputStream paramZipOutputStream, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(paramString);
    if (paramString.trim().length() == 0);
    String str2;
    for (String str1 = ""; ; str1 = File.separator)
    {
      str2 = new String((str1 + paramFile.getName()).getBytes(z[1]), z[0]);
      if (!paramFile.isDirectory())
        break;
      File[] arrayOfFile = paramFile.listFiles();
      int j = arrayOfFile.length;
      for (int k = 0; k < j; k++)
        a(arrayOfFile[k], paramZipOutputStream, str2);
    }
    byte[] arrayOfByte = new byte[1048576];
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile), 1048576);
    paramZipOutputStream.putNextEntry(new ZipEntry(str2));
    while (true)
    {
      int i = localBufferedInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      paramZipOutputStream.write(arrayOfByte, 0, i);
    }
    localBufferedInputStream.close();
    paramZipOutputStream.flush();
    paramZipOutputStream.closeEntry();
  }

  public static void a(String paramString)
  {
    File localFile1 = new File(paramString);
    if (localFile1.exists())
    {
      if (localFile1.isDirectory())
        for (File localFile2 : localFile1.listFiles())
        {
          a(localFile2.getAbsolutePath());
          localFile2.delete();
        }
      localFile1.delete();
    }
  }

  public static void a(Collection<File> paramCollection, File paramFile)
  {
    ZipOutputStream localZipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(paramFile), 1048576));
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      a((File)localIterator.next(), localZipOutputStream, "");
    localZipOutputStream.close();
  }

  // ERROR //
  public static boolean a(String paramString1, String paramString2, android.content.Context paramContext)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +16 -> 17
    //   4: new 204	java/lang/IllegalArgumentException
    //   7: dup
    //   8: getstatic 36	cn/jpush/android/util/r:z	[Ljava/lang/String;
    //   11: iconst_2
    //   12: aaload
    //   13: invokespecial 205	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: new 84	java/lang/StringBuilder
    //   20: dup
    //   21: getstatic 36	cn/jpush/android/util/r:z	[Ljava/lang/String;
    //   24: iconst_3
    //   25: aaload
    //   26: invokespecial 206	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: aload_0
    //   30: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: getstatic 36	cn/jpush/android/util/r:z	[Ljava/lang/String;
    //   36: iconst_5
    //   37: aaload
    //   38: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_1
    //   42: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: invokestatic 208	cn/jpush/android/util/ac:a	()V
    //   49: aload_0
    //   50: invokestatic 214	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   53: ifne +89 -> 142
    //   56: aload_1
    //   57: invokestatic 214	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   60: ifne +82 -> 142
    //   63: new 95	java/io/File
    //   66: dup
    //   67: aload_0
    //   68: invokespecial 160	java/io/File:<init>	(Ljava/lang/String;)V
    //   71: astore 4
    //   73: aload 4
    //   75: invokevirtual 163	java/io/File:exists	()Z
    //   78: ifne +9 -> 87
    //   81: aload 4
    //   83: invokevirtual 217	java/io/File:createNewFile	()Z
    //   86: pop
    //   87: new 176	java/io/FileOutputStream
    //   90: dup
    //   91: aload 4
    //   93: invokespecial 177	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   96: astore 6
    //   98: aload 6
    //   100: aload_1
    //   101: getstatic 36	cn/jpush/android/util/r:z	[Ljava/lang/String;
    //   104: iconst_4
    //   105: aaload
    //   106: invokevirtual 105	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   109: invokevirtual 220	java/io/FileOutputStream:write	([B)V
    //   112: aload 6
    //   114: invokevirtual 221	java/io/FileOutputStream:flush	()V
    //   117: aload 6
    //   119: invokevirtual 222	java/io/FileOutputStream:close	()V
    //   122: iconst_1
    //   123: ireturn
    //   124: aload 6
    //   126: ifnull +8 -> 134
    //   129: aload 6
    //   131: invokevirtual 222	java/io/FileOutputStream:close	()V
    //   134: aload 7
    //   136: athrow
    //   137: astore 5
    //   139: invokestatic 225	cn/jpush/android/util/ac:g	()V
    //   142: iconst_0
    //   143: ireturn
    //   144: astore 7
    //   146: goto -22 -> 124
    //   149: astore 7
    //   151: aconst_null
    //   152: astore 6
    //   154: goto -30 -> 124
    //
    // Exception table:
    //   from	to	target	type
    //   63	87	137	java/io/IOException
    //   117	122	137	java/io/IOException
    //   129	134	137	java/io/IOException
    //   134	137	137	java/io/IOException
    //   98	117	144	finally
    //   87	98	149	finally
  }

  // ERROR //
  public static boolean a(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 214	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4: ifne +68 -> 72
    //   7: aload_1
    //   8: arraylength
    //   9: ifle +63 -> 72
    //   12: new 95	java/io/File
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 160	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: astore_2
    //   21: aload_2
    //   22: invokevirtual 163	java/io/File:exists	()Z
    //   25: ifne +8 -> 33
    //   28: aload_2
    //   29: invokevirtual 217	java/io/File:createNewFile	()Z
    //   32: pop
    //   33: new 176	java/io/FileOutputStream
    //   36: dup
    //   37: aload_2
    //   38: invokespecial 177	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   41: astore_3
    //   42: aload_3
    //   43: aload_1
    //   44: invokevirtual 220	java/io/FileOutputStream:write	([B)V
    //   47: aload_3
    //   48: invokevirtual 221	java/io/FileOutputStream:flush	()V
    //   51: aload_3
    //   52: invokevirtual 222	java/io/FileOutputStream:close	()V
    //   55: iconst_1
    //   56: ireturn
    //   57: astore 4
    //   59: aconst_null
    //   60: astore_3
    //   61: aload_3
    //   62: ifnull +7 -> 69
    //   65: aload_3
    //   66: invokevirtual 222	java/io/FileOutputStream:close	()V
    //   69: aload 4
    //   71: athrow
    //   72: iconst_0
    //   73: ireturn
    //   74: astore 4
    //   76: goto -15 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   33	42	57	finally
    //   42	51	74	finally
  }

  public static String b(String paramString)
  {
    if (!an.a(paramString))
    {
      int i = paramString.lastIndexOf(".");
      int j = paramString.length();
      if ((i > 0) && (i + 1 != j))
        return paramString.substring(i, paramString.length());
    }
    return "";
  }

  public static String c(String paramString)
  {
    if (an.a(paramString))
      return "";
    return paramString.substring(1 + paramString.lastIndexOf("/"), paramString.length());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */