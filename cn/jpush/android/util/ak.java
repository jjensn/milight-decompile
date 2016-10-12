package cn.jpush.android.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import cn.jpush.android.e;

public final class ak
{
  private static SharedPreferences a;
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "\027/l*B\0245h>B6\"c;B\0245b;B74";
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
          i3 = 39;
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
        str1 = "'(c,B<3-1Td)x4Khgd6\007\027/l*B\0245h>B6\"c;B\0245b;B74#1I-3";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "')#2W14evF*#7N ix+B6i}*H\".a=";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = null;
        return;
        i3 = 68;
        break label96;
        i3 = 71;
        break label96;
        i3 = 13;
        break label96;
        i3 = 88;
        break label96;
        m = 0;
      }
    }
  }

  public static void a(Context paramContext, String paramString, int paramInt)
  {
    if (a(paramContext))
    {
      b(paramContext);
      SharedPreferences.Editor localEditor = a.edit();
      localEditor.putInt(paramString, paramInt);
      localEditor.apply();
      return;
    }
    ac.d();
  }

  public static void a(Context paramContext, String paramString, long paramLong)
  {
    if (a(paramContext))
    {
      b(paramContext);
      SharedPreferences.Editor localEditor = a.edit();
      localEditor.putLong(paramString, paramLong);
      localEditor.apply();
      return;
    }
    ac.d();
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    if (a(paramContext))
    {
      b(paramContext);
      SharedPreferences.Editor localEditor = a.edit();
      localEditor.putString(paramString1, paramString2);
      localEditor.apply();
      return;
    }
    ac.d();
  }

  public static void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (a(paramContext))
    {
      b(paramContext);
      SharedPreferences.Editor localEditor = a.edit();
      localEditor.putBoolean(paramString, paramBoolean);
      localEditor.apply();
      return;
    }
    ac.d();
  }

  private static boolean a(Context paramContext)
  {
    if (paramContext == null)
    {
      ac.d(z[0], z[1]);
      return false;
    }
    return true;
  }

  public static int b(Context paramContext, String paramString, int paramInt)
  {
    if (a(paramContext))
    {
      b(paramContext);
      return a.getInt(paramString, paramInt);
    }
    ac.d();
    return paramInt;
  }

  public static long b(Context paramContext, String paramString, long paramLong)
  {
    if (a(paramContext))
    {
      b(paramContext);
      return a.getLong(paramString, paramLong);
    }
    ac.d();
    return paramLong;
  }

  public static String b(Context paramContext, String paramString1, String paramString2)
  {
    if (a(paramContext))
    {
      b(paramContext);
      return a.getString(paramString1, paramString2);
    }
    ac.d();
    return paramString2;
  }

  private static void b(Context paramContext)
  {
    if (a != null)
    {
      if ((e.o == null) && (!e.l))
        a = paramContext.getSharedPreferences(z[2], 4);
      return;
    }
    a = paramContext.getSharedPreferences(z[2], 4);
  }

  public static boolean b(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (a(paramContext))
    {
      b(paramContext);
      return a.getBoolean(paramString, paramBoolean);
    }
    ac.d();
    return paramBoolean;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */