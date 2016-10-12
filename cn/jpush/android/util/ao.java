package cn.jpush.android.util;

import cn.jpush.android.e;

public final class ao
{
  private static final String[] z;
  private String a;
  private String b;
  private boolean c = false;
  private long d;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = ".46";
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
          i3 = 83;
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
        str1 = "$#;<\007`cs<$hzut6{.ps!))";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "d}";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 9;
        break label96;
        i3 = 14;
        break label96;
        i3 = 22;
        break label96;
        i3 = 28;
        break label96;
        m = 0;
      }
    }
  }

  public ao(String paramString1, String paramString2)
  {
    if (e.a)
    {
      this.a = paramString1;
      this.b = paramString2;
      this.d = System.currentTimeMillis();
    }
  }

  public final void a()
  {
    if (e.a)
    {
      new StringBuilder(z[1]).append(this.b).append(z[0]).append(System.currentTimeMillis() - this.d).append(z[2]);
      ac.b();
      if (!this.c)
        this.d = System.currentTimeMillis();
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */