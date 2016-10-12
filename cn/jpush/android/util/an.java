package cn.jpush.android.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class an
{
  private static String a;
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "\023BdL\001l\\d\026丢e龹e\020";
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
          i3 = 34;
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
        str1 = "\005X\r";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "x-\n\b\026}*\017\003\033\t^{g\016";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = z[2];
        return;
        i3 = 72;
        break label96;
        i3 = 28;
        break label96;
        i3 = 56;
        break label96;
        i3 = 59;
        break label96;
        m = 0;
      }
    }
  }

  public static boolean a(String paramString)
  {
    if (paramString == null);
    while ((paramString.length() == 0) || (paramString.trim().length() == 0))
      return true;
    return false;
  }

  public static boolean a(String paramString1, String paramString2)
  {
    if (paramString1 == null);
    while (paramString2 == null)
      return false;
    return paramString1.equals(paramString2);
  }

  public static String b(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString)))
      return null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(z[1]);
      localMessageDigest.update(paramString.getBytes());
      byte[] arrayOfByte = localMessageDigest.digest();
      if (arrayOfByte == null)
        return "";
      StringBuffer localStringBuffer = new StringBuffer(2 * arrayOfByte.length);
      for (int i = 0; i < arrayOfByte.length; i++)
      {
        int j = arrayOfByte[i];
        localStringBuffer.append(z[2].charAt(0xF & j >> 4)).append(z[2].charAt(j & 0xF));
      }
      String str = localStringBuffer.toString();
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    return null;
  }

  public static String c(String paramString)
  {
    if (a(paramString))
      return "";
    return Pattern.compile(z[0]).matcher(paramString).replaceAll("");
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.an
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */