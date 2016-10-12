package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class aa extends i<z, aa>
{
  private int a;
  private ad b = ad.a();
  private ab c = ab.a();

  private aa()
  {
  }

  private aa c(d paramd, g paramg)
  {
    int i;
    do
    {
      i = paramd.a();
      switch (i)
      {
      default:
      case 0:
      case 10:
      case 18:
      }
    }
    while (paramd.b(i));
    return this;
    ae localae = ad.p();
    if ((0x1 & this.a) == 1);
    for (int k = 1; ; k = 0)
    {
      if (k != 0)
        localae.a(this.b);
      paramd.a(localae, paramg);
      a(localae.b());
      break;
    }
    ac localac = ab.ad();
    if ((0x2 & this.a) == 2);
    for (int j = 1; ; j = 0)
    {
      if (j != 0)
        localac.a(this.c);
      paramd.a(localac, paramg);
      a(localac.b());
      break;
    }
  }

  private aa e()
  {
    aa localaa = new aa();
    z localz = f();
    ad localad;
    ab localab;
    if (localz != z.a())
    {
      if (localz.b())
      {
        localad = localz.d();
        if (((0x1 & localaa.a) != 1) || (localaa.b == ad.a()))
          break label144;
        localaa.b = ad.a(localaa.b).a(localad).b();
        localaa.a = (0x1 | localaa.a);
      }
      if (localz.e())
      {
        localab = localz.f();
        if (((0x2 & localaa.a) != 2) || (localaa.c == ab.a()))
          break label153;
      }
    }
    label144: label153: for (localaa.c = ab.a(localaa.c).a(localab).b(); ; localaa.c = localab)
    {
      localaa.a = (0x2 | localaa.a);
      return localaa;
      localaa.b = localad;
      break;
    }
  }

  private z f()
  {
    int i = 1;
    z localz = new z(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      z.a(localz, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      z.a(localz, this.c);
      z.a(localz, i);
      return localz;
      i = 0;
    }
  }

  public final aa a(ab paramab)
  {
    if (paramab == null)
      throw new NullPointerException();
    this.c = paramab;
    this.a = (0x2 | this.a);
    return this;
  }

  public final aa a(ad paramad)
  {
    if (paramad == null)
      throw new NullPointerException();
    this.b = paramad;
    this.a = (0x1 | this.a);
    return this;
  }

  public final z a()
  {
    z localz = f();
    if (!localz.g())
      throw new m();
    return localz;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */