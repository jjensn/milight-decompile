package cn.jpush.android.service;

import cn.jpush.b.a.a.h;

final class p
{
  private static final String[] z;
  h a;
  int b;
  int c = 0;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "N~Zj,p_Kr7rq\0376yaER~6`X\005";
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
          i3 = 89;
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
        str1 = "9\fKr4p_\005";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "9\fM~(`ILoc";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 21;
        break label96;
        i3 = 44;
        break label96;
        i3 = 63;
        break label96;
        i3 = 27;
        break label96;
        m = 0;
      }
    }
  }

  public p(h paramh, int paramInt)
  {
    this.a = paramh;
    this.b = paramInt;
  }

  public final void a()
  {
    this.b = (-10000 + this.b);
    this.c = (1 + this.c);
  }

  public final String toString()
  {
    return z[0] + this.b + z[1] + this.c + z[2] + this.a.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */