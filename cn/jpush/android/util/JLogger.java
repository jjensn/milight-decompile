package cn.jpush.android.util;

import android.content.Context;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JLogger
{
  private static final SimpleDateFormat a;
  private static w b;
  private static final String z;

  static
  {
    Object localObject1 = "r\001\023\016&F5G\023o+0\"MffB\031\004".toCharArray();
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    int k;
    int m;
    Object localObject3;
    label27: int n;
    int i1;
    if (i <= 1)
    {
      localObject2 = localObject1;
      k = j;
      m = i;
      localObject3 = localObject1;
      n = localObject3[j];
      switch (k % 5)
      {
      default:
        i1 = 11;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject3[j] = (char)(i1 ^ n);
      j = k + 1;
      if (m == 0)
      {
        localObject3 = localObject2;
        k = j;
        j = m;
        break label27;
      }
      i = m;
      localObject1 = localObject2;
      if (i > j)
        break;
      z = new String((char[])localObject1).intern();
      a = new SimpleDateFormat(z);
      b = new w();
      return;
      i1 = 11;
      continue;
      i1 = 120;
      continue;
      i1 = 106;
      continue;
      i1 = 119;
    }
  }

  public JLogger()
  {
  }

  private static void a(int paramInt, String paramString1, String paramString2)
  {
    String str = "V";
    switch (paramInt)
    {
    default:
      if ((b != null) && (b.b));
    case 1:
    case 2:
    case 4:
    case 8:
    case 16:
    }
    cn.jpush.android.data.e locale;
    do
    {
      do
      {
        return;
        if (cn.jpush.android.e.a)
          Log.v(paramString1, paramString2);
        str = "V";
        break;
        if (cn.jpush.android.e.a)
          Log.d(paramString1, paramString2);
        str = "D";
        break;
        if (cn.jpush.android.e.a)
          Log.i(paramString1, paramString2);
        str = "I";
        break;
        if (cn.jpush.android.e.a)
          Log.w(paramString1, paramString2);
        str = "W";
        break;
        if (cn.jpush.android.e.a)
          Log.e(paramString1, paramString2);
        str = "E";
        break;
      }
      while ((paramInt & b.a) == 0);
      locale = new cn.jpush.android.data.e(paramInt, str, paramString1, paramString2, a.format(new Date()));
    }
    while (b == null);
    b.a(locale);
  }

  public static void d(String paramString1, String paramString2)
  {
    a(2, paramString1, paramString2);
  }

  public static void e(String paramString1, String paramString2)
  {
    a(16, paramString1, paramString2);
  }

  public static void i(String paramString1, String paramString2)
  {
    a(4, paramString1, paramString2);
  }

  public static void parseModalJson(String paramString, Context paramContext)
  {
    if (paramContext == null);
    while (b == null)
      return;
    b.a(paramContext, paramString);
  }

  public static void reportByHeartbeats()
  {
    if (b != null)
      b.a();
  }

  public static void v(String paramString1, String paramString2)
  {
    a(1, paramString1, paramString2);
  }

  public static void w(String paramString1, String paramString2)
  {
    a(8, paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.JLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */