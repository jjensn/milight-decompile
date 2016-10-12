package cn.jpush.android.data;

import android.content.Context;
import cn.jpush.android.helpers.f;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.b;
import cn.jpush.android.util.p;
import cn.jpush.android.util.r;
import cn.jpush.android.util.s;

final class j extends Thread
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "\0029.i^";
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
          i3 = 50;
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
        str1 = "J86a\b\003~";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 44;
        break label96;
        i3 = 81;
        break label96;
        i3 = 90;
        break label96;
        i3 = 4;
        break label96;
        m = 0;
      }
    }
  }

  j(i parami1, i parami2, Context paramContext, int paramInt)
  {
  }

  public final void run()
  {
    String str1 = this.a.L.j;
    String str2 = this.a.c;
    if (!f.a(str1))
    {
      cn.jpush.android.helpers.i.a(this.a.c, 996, this.b);
      return;
    }
    if (!this.a.L.i)
    {
      cn.jpush.android.helpers.i.a(str2, this.c, this.b);
      i.a(this.d, this.a, this.b);
      return;
    }
    String str3 = null;
    int i = 0;
    String str4;
    if (i < 4)
    {
      str3 = s.a(str1, 5, 5000L);
      if (!s.a(str3))
        str4 = str3;
    }
    for (int j = 1; ; j = 0)
    {
      if (j == 0)
      {
        cn.jpush.android.helpers.i.a(str2, 1014, this.b);
        cn.jpush.android.helpers.i.a(str2, 1021, b.b(this.b, str1), this.b);
        ac.b();
        return;
        i++;
        break;
      }
      String str5 = str1.substring(0, 1 + str1.lastIndexOf("/"));
      if (!c.a(this.a.L.k, this.b, str5, str2, this.a.e()))
      {
        ac.b();
        cn.jpush.android.helpers.i.a(str2, 1014, this.b);
        return;
      }
      if (this.a.e());
      for (String str6 = p.b(this.b, str2) + str2 + z[0]; r.a(str6, str4, this.b); str6 = p.a(this.b, str2) + str2)
      {
        this.a.L.n = (z[1] + str6);
        cn.jpush.android.helpers.i.a(str2, this.c, this.b);
        i.a(this.d, this.a, this.b);
        return;
      }
      cn.jpush.android.helpers.i.a(str2, 1014, this.b);
      return;
      str4 = str3;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */