package cn.jpush.android.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class i
{
  private static SharedPreferences a;
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "\fk}N7\032v;\n7\035`5A5\nk0A4Asa";
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
          i3 = 71;
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
        str1 = "";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "+C\022\034s-4cfp.F\027`uZ";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = null;
        return;
        i3 = 111;
        break label96;
        i3 = 5;
        break label96;
        i3 = 83;
        break label96;
        i3 = 36;
        break label96;
        m = 0;
      }
    }
  }

  protected static void a(Context paramContext, String paramString, int paramInt)
  {
    q(paramContext);
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.putInt(paramString, paramInt);
    localEditor.apply();
  }

  protected static void a(Context paramContext, String paramString, long paramLong)
  {
    q(paramContext);
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.putLong(paramString, paramLong);
    localEditor.apply();
  }

  protected static void a(String paramString, int paramInt)
  {
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.putInt(paramString, paramInt);
    localEditor.apply();
  }

  protected static void a(String paramString, long paramLong)
  {
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.putLong(paramString, paramLong);
    localEditor.apply();
  }

  protected static int b(String paramString, int paramInt)
  {
    return a.getInt(paramString, paramInt);
  }

  protected static long b(String paramString, long paramLong)
  {
    return a.getLong(paramString, paramLong);
  }

  protected static void b(Context paramContext, String paramString1, String paramString2)
  {
    q(paramContext);
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.putString(paramString1, paramString2);
    localEditor.apply();
  }

  protected static String c(Context paramContext, String paramString1, String paramString2)
  {
    q(paramContext);
    return a.getString(paramString1, paramString2);
  }

  protected static void c(String paramString1, String paramString2)
  {
    if (a != null)
    {
      SharedPreferences.Editor localEditor = a.edit();
      localEditor.putString(paramString1, paramString2);
      localEditor.apply();
    }
  }

  protected static String d(String paramString1, String paramString2)
  {
    return a.getString(paramString1, paramString2);
  }

  public static String e(String paramString1, String paramString2)
  {
    try
    {
      String str = a.a(paramString1, z[3]);
      return str;
    }
    catch (Exception localException)
    {
      ac.d();
    }
    return paramString2;
  }

  public static void n(String paramString)
  {
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.remove(paramString);
    localEditor.commit();
  }

  public static String o(String paramString)
  {
    try
    {
      String str1 = z[3];
      if (str1.length() != 16)
        return null;
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(str1.getBytes(), z[2]);
      Cipher localCipher = Cipher.getInstance(z[1]);
      localCipher.init(1, localSecretKeySpec, new IvParameterSpec(str1.getBytes()));
      String str2 = e.a(localCipher.doFinal(paramString.getBytes()), 2);
      return str2;
    }
    catch (Exception localException)
    {
      ac.d();
    }
    return "";
  }

  public static void q(Context paramContext)
  {
    if (a == null)
      a = paramContext.getSharedPreferences(z[0], 0);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */