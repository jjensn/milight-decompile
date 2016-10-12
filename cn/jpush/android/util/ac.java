package cn.jpush.android.util;

import cn.jpush.android.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public final class ac
{
  private static t a;
  private static final SimpleDateFormat b;
  private static ArrayList<String> c;
  private static boolean d;
  private static boolean e;
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "B1";
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
        str1 = "UA\037]/";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "R\\DJ#@Y\"\024*r+\031]\030LB9";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = new n();
        b = new SimpleDateFormat(z[2]);
        c = new ArrayList();
        d = false;
        e = false;
        return;
        i3 = 31;
        break label96;
        i3 = 17;
        break label96;
        i3 = 106;
        break label96;
        i3 = 46;
        break label96;
        m = 0;
      }
    }
  }

  public static void a()
  {
  }

  static void a(t paramt)
  {
    a = paramt;
  }

  public static void a(String paramString1, String paramString2)
  {
    if ((e.a) && (a(2)))
      a.v(z[1], "[" + paramString1 + z[0] + paramString2);
  }

  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if ((e.a) && (a(5)))
      a.w(z[1], "[" + paramString1 + z[0] + paramString2, paramThrowable);
  }

  private static boolean a(int paramInt)
  {
    return paramInt >= 3;
  }

  public static void b()
  {
  }

  public static void b(String paramString1, String paramString2)
  {
    if ((e.a) && (a(3)))
      a.d(z[1], "[" + paramString1 + z[0] + paramString2);
  }

  public static void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a(6))
      a.e(z[1], "[" + paramString1 + z[0] + paramString2, paramThrowable);
  }

  public static void c()
  {
  }

  public static void c(String paramString1, String paramString2)
  {
    if ((e.a) && (a(4)))
      a.i(z[1], "[" + paramString1 + z[0] + paramString2);
  }

  public static void d()
  {
  }

  public static void d(String paramString1, String paramString2)
  {
    if (a(5))
      a.w(z[1], "[" + paramString1 + z[0] + paramString2);
  }

  public static void e()
  {
  }

  public static void e(String paramString1, String paramString2)
  {
    if (a(6))
      a.e(z[1], "[" + paramString1 + z[0] + paramString2);
  }

  public static void f()
  {
  }

  public static void g()
  {
  }

  public static void h()
  {
  }

  public static void i()
  {
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */