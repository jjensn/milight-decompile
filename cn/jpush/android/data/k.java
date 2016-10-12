package cn.jpush.android.data;

import android.content.Context;
import cn.jpush.android.helpers.f;
import cn.jpush.android.util.an;

final class k extends Thread
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "?lgl5 f";
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
          i3 = 106;
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
        str1 = "?lgl5 b";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 73;
        break label96;
        i3 = 5;
        break label96;
        i3 = 2;
        break label96;
        i3 = 27;
        break label96;
        m = 0;
      }
    }
  }

  k(i parami1, Context paramContext, int paramInt, i parami2)
  {
  }

  public final void run()
  {
    if (f.a(this.d.L.b))
      this.d.L.l = c.a(this.d.L.b, this.d.c, z[0], this.a);
    if (f.a(this.d.L.h))
      this.d.L.m = c.a(this.d.L.h, this.d.c, z[1], this.a);
    if ((an.a(this.d.L.l)) || (an.a(this.d.L.m)))
    {
      cn.jpush.android.helpers.i.a(this.d.c, 1014, this.a);
      return;
    }
    cn.jpush.android.helpers.i.a(this.d.c, this.b, this.a);
    i.a(this.d, this.c, this.a);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */