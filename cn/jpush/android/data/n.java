package cn.jpush.android.data;

import android.content.Context;
import cn.jpush.android.helpers.i;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.b;
import cn.jpush.android.util.p;
import cn.jpush.android.util.r;
import cn.jpush.android.util.s;
import java.util.ArrayList;

final class n extends Thread
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[10];
    int i = 0;
    String str1 = "\\S:YEl^+DQ3\035*O^gR(O\025zU0V\025)P0EP)\020";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label36: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label52: int i2;
    int i3;
    if (k <= 1)
    {
      localObject4 = localObject3;
      n = m;
      i1 = k;
      localObject5 = localObject3;
      i2 = localObject5[m];
      switch (n % 5)
      {
      default:
        i3 = 53;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[m] = (char)(i3 ^ i2);
      m = n + 1;
      if (i1 == 0)
      {
        localObject5 = localObject4;
        n = m;
        m = i1;
        break label52;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "'U+LY";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "oT3D\017&\022";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "`P8\001F{^b\003";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "hS;SZ`YqQP{P6RF`R1\017b[t\013djLe\013dgG|\023~f]r\r`rL";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "[T<I\030yH,I\025gX:EF)I7D\025yX-L\\zN6N[)R9\001b[t\013djLe\013dgG|\023~f]r\r`rL\021QYl\\,D\025{X.TPzIHA'";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "ZU0VpgI6UL";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 9;
        continue;
        i3 = 61;
        continue;
        i3 = 95;
        continue;
        i3 = 33;
      }
    }
  }

  n(m paramm1, m paramm2, Context paramContext)
  {
  }

  public final void run()
  {
    new StringBuilder(z[8]).append(this.c.H).append(z[2]).append(this.c.G).append(z[6]).append(this.c.F);
    ac.a();
    if (this.c.H != 0)
    {
      new StringBuilder(z[0]).append(this.c.H);
      ac.b();
      return;
    }
    String str1 = this.a.c;
    String str2 = this.a.a;
    if (this.a.G == 0)
    {
      i.a(str1, 995, this.b);
      cn.jpush.android.api.m.a(this.b, this.a);
      return;
    }
    if (4 == this.a.G)
    {
      this.a.L = str2;
      i.a(str1, 995, this.b);
      cn.jpush.android.api.m.a(this.b, this.a);
      return;
    }
    if (!b.c(this.b, z[5]))
    {
      ac.e(z[9], z[7]);
      i.a(str1, 1014, this.b);
      return;
    }
    String str3 = null;
    int i = 0;
    String str4;
    if (i < 4)
    {
      str3 = s.a(str2, 5, 5000L);
      if (!s.a(str3))
        str4 = str3;
    }
    for (int j = 1; ; j = 0)
    {
      String str5 = p.b(this.b, str1);
      String str6;
      String str7;
      if (j != 0)
      {
        str6 = str5 + str1 + z[1];
        str7 = str2.substring(0, 1 + str2.lastIndexOf("/"));
        if (this.a.I.isEmpty())
          break label544;
        if (c.a(this.a.I, this.b, str7, str1, this.a.e()))
          break label425;
        ac.b();
        i.a(str1, 1014, this.b);
        return;
        i++;
        break;
      }
      ac.d();
      i.a(str1, 1014, this.b);
      i.a(str1, 1021, b.b(this.b, str2), this.b);
      return;
      label425: if (r.a(str6, str4.replaceAll(z[4] + str7, z[4] + str5), this.b))
      {
        this.a.L = (z[3] + str6);
        i.a(str1, 995, this.b);
        cn.jpush.android.api.m.a(this.b, this.a);
        return;
      }
      i.a(str1, 1014, this.b);
      return;
      label544: this.a.L = this.a.a;
      cn.jpush.android.api.m.a(this.b, this.a);
      return;
      str4 = str3;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */