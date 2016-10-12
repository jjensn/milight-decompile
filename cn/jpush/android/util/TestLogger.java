package cn.jpush.android.util;

import java.io.PrintStream;

public class TestLogger
  implements t
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "ATd(";
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
          i3 = 118;
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
        str1 = "<Yi";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 28;
        break label96;
        i3 = 116;
        break label96;
        i3 = 73;
        break label96;
        i3 = 8;
        break label96;
        m = 0;
      }
    }
  }

  public TestLogger()
  {
  }

  public static void setTestLogger()
  {
    ac.a(new TestLogger());
  }

  public void d(String paramString1, String paramString2)
  {
    System.out.println("[" + paramString1 + z[0] + paramString2);
  }

  public void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    System.out.println("[" + paramString1 + z[0] + paramString2 + z[1] + paramThrowable.getMessage());
  }

  public void e(String paramString1, String paramString2)
  {
    System.out.println("[" + paramString1 + z[0] + paramString2);
  }

  public void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    System.out.println("[" + paramString1 + z[0] + paramString2 + z[1] + paramThrowable.getMessage());
  }

  public void i(String paramString1, String paramString2)
  {
    System.out.println("[" + paramString1 + z[0] + paramString2);
  }

  public void i(String paramString1, String paramString2, Throwable paramThrowable)
  {
    System.out.println("[" + paramString1 + z[0] + paramString2 + z[1] + paramThrowable.getMessage());
  }

  public void v(String paramString1, String paramString2)
  {
    System.out.println("[" + paramString1 + z[0] + paramString2);
  }

  public void v(String paramString1, String paramString2, Throwable paramThrowable)
  {
    System.out.println("[" + paramString1 + z[0] + paramString2 + z[1] + paramThrowable.getMessage());
  }

  public void w(String paramString1, String paramString2)
  {
    System.out.println("[" + paramString1 + z[0] + paramString2);
  }

  public void w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    System.out.println("[" + paramString1 + z[0] + paramString2 + z[1] + paramThrowable.getMessage());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.TestLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */