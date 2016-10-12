package cn.jpush.b.a.b;

import cn.jpush.a.a.aa;
import cn.jpush.a.a.ab;
import cn.jpush.a.a.ac;
import cn.jpush.a.a.ad;
import cn.jpush.a.a.ae;
import cn.jpush.a.a.af;
import cn.jpush.a.a.ai;
import cn.jpush.a.a.ak;
import cn.jpush.a.a.am;
import cn.jpush.a.a.aq;
import cn.jpush.a.a.as;
import cn.jpush.a.a.au;
import cn.jpush.a.a.aw;
import cn.jpush.a.a.ay;
import cn.jpush.a.a.ba;
import cn.jpush.a.a.bc;
import cn.jpush.a.a.be;
import cn.jpush.a.a.bi;
import cn.jpush.a.a.bl;
import cn.jpush.a.a.bn;
import cn.jpush.a.a.bp;
import cn.jpush.a.a.d;
import cn.jpush.a.a.f;
import cn.jpush.a.a.h;
import cn.jpush.a.a.j;
import cn.jpush.a.a.m;
import cn.jpush.a.a.o;
import cn.jpush.a.a.q;
import cn.jpush.a.a.s;
import cn.jpush.a.a.u;
import cn.jpush.a.a.z;
import com.google.protobuf.jpush.c;
import java.io.PrintStream;

public final class p
{
  private static final String[] z;
  int a;
  int b;
  long c;
  String d;
  Object e;
  af f;
  int g = -1;
  String h;

  static
  {
    Object localObject1 = new String[10];
    int i = 0;
    String str1 = "\034Xi-F-Zd(\b*[el\005i";
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
        i3 = 40;
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
        str1 = "\022L\034Z&Bn/G%k!a\b*Yl!I'R;";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "e\026w)Z:_n\"\022";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "e\026d\"\\ Bxv";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "e\026t%Ls";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "e\026s)[9Yo?M\004Sr?I.S;";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "e\026s)[9Yo?M\nYe)\022";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "e\026`<X\"Sxv";
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
        str1 = "\022|Q9[!k!a\b";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 73;
        continue;
        i3 = 54;
        continue;
        i3 = 1;
        continue;
        i3 = 76;
      }
    }
  }

  public p(int paramInt1, int paramInt2, long paramLong, String paramString, Object paramObject)
  {
    this.a = paramInt1;
    this.b = 1;
    this.c = paramLong;
    this.d = paramString;
    this.e = paramObject;
  }

  public p(byte[] paramArrayOfByte)
  {
    z localz = z.a(paramArrayOfByte);
    ad localad = localz.d();
    ab localab = localz.f();
    this.a = localad.d();
    this.b = localad.f();
    this.c = localad.h();
    if (localad.j() != null)
      this.d = localad.j().b();
    this.f = localab.N();
    switch (this.a)
    {
    case 17:
    case 20:
    case 21:
    case 22:
    case 24:
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    default:
      String str = z[8] + this.a;
      System.out.println(z[9] + str);
      this.e = null;
      return;
    case 1:
      this.e = localab.d();
      return;
    case 2:
      this.e = localab.f();
      return;
    case 3:
      this.e = localab.h();
      return;
    case 4:
      this.e = localab.j();
      return;
    case 5:
      this.e = localab.l();
      return;
    case 6:
      this.e = localab.n();
      return;
    case 7:
      this.e = localab.p();
      return;
    case 8:
      this.e = localab.r();
      return;
    case 9:
      this.e = localab.t();
      return;
    case 10:
      this.e = localab.v();
      return;
    case 11:
      this.e = localab.x();
      return;
    case 12:
      this.e = localab.z();
      return;
    case 13:
      this.e = localab.B();
      return;
    case 14:
      this.e = localab.D();
      return;
    case 15:
      this.e = localab.F();
      return;
    case 16:
      this.e = localab.H();
      return;
    case 18:
      this.e = localab.J();
      return;
    case 19:
      this.e = localab.L();
      return;
    case 23:
      this.e = localab.P();
      return;
    case 31:
      this.e = localab.R();
      return;
    case 32:
      this.e = localab.T();
      return;
    case 33:
      this.e = localab.V();
      return;
    case 34:
      this.e = localab.X();
      return;
    case 35:
      this.e = localab.Z();
      return;
    case 36:
    }
    this.e = localab.ab();
  }

  public final z a()
  {
    ae localae = ad.p().a(this.a).b(this.b).a(this.c);
    if ((this.d != null) && (!"".equalsIgnoreCase(this.d.trim())))
      localae.a(c.a(this.d));
    aa localaa = z.h().a(localae.a());
    int i = this.a;
    Object localObject = this.e;
    af localaf = this.f;
    ac localac = ab.ad();
    if (localaf != null)
      localac.a(localaf);
    if (localObject == null);
    while (true)
    {
      return localaa.a(localac.a()).a();
      switch (i)
      {
      case 17:
      case 20:
      case 21:
      case 22:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      default:
        cn.jpush.b.a.c.b.a(z[0] + i);
        break;
      case 1:
        localac.a((bl)localObject);
        break;
      case 2:
        localac.a((bn)localObject);
        break;
      case 3:
        localac.a((bi)localObject);
        break;
      case 4:
        localac.a((be)localObject);
        break;
      case 5:
        localac.a((d)localObject);
        break;
      case 6:
        localac.a((h)localObject);
        break;
      case 7:
        localac.a((j)localObject);
        break;
      case 8:
        localac.a((o)localObject);
        break;
      case 9:
        localac.a((s)localObject);
        break;
      case 10:
        localac.a((m)localObject);
        break;
      case 11:
        localac.a((q)localObject);
        break;
      case 12:
        localac.a((u)localObject);
        break;
      case 13:
        localac.a((ba)localObject);
        break;
      case 14:
        localac.a((aq)localObject);
        break;
      case 15:
        localac.a((bc)localObject);
        break;
      case 16:
        localac.a((ay)localObject);
        break;
      case 18:
        localac.a((cn.jpush.a.a.b)localObject);
        break;
      case 19:
        localac.a((f)localObject);
        break;
      case 23:
        localac.a((bp)localObject);
        break;
      case 31:
        localac.a((am)localObject);
        break;
      case 32:
        localac.a((aw)localObject);
        break;
      case 33:
        localac.a((ak)localObject);
        break;
      case 34:
        localac.a((au)localObject);
        break;
      case 35:
        localac.a((ai)localObject);
        break;
      case 36:
        localac.a((as)localObject);
      }
    }
  }

  public final int b()
  {
    return this.a;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder(z[1]).append(this.a).append(z[2]).append(this.b).append(z[4]).append(this.c).append(z[7]).append(this.d);
    String str1;
    String str2;
    label141: StringBuilder localStringBuilder3;
    if (this.g >= 0)
    {
      str1 = z[6] + this.g;
      StringBuilder localStringBuilder2 = localStringBuilder1.append(str1);
      if ((this.g < 0) || (this.h == null))
        break label177;
      str2 = z[5] + this.h;
      localStringBuilder3 = localStringBuilder2.append(str2);
      if (this.e != null)
        break label184;
    }
    label177: label184: for (String str3 = ""; ; str3 = z[3] + this.e.toString())
    {
      return str3;
      str1 = "";
      break;
      str2 = "";
      break label141;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */