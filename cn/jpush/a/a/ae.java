package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class ae extends i<ad, ae>
{
  private int a;
  private int b;
  private int c;
  private long d;
  private c e = c.a;
  private x f = x.a();
  private int g;

  private ae()
  {
  }

  private ae c(d paramd, g paramg)
  {
    while (true)
    {
      int i = paramd.a();
      switch (i)
      {
      default:
        if (paramd.b(i))
          continue;
      case 0:
        return this;
      case 8:
        this.a = (0x1 | this.a);
        this.b = paramd.c();
        break;
      case 16:
        this.a = (0x2 | this.a);
        this.c = paramd.c();
        break;
      case 24:
        this.a = (0x4 | this.a);
        this.d = paramd.b();
        break;
      case 34:
        this.a = (0x8 | this.a);
        this.e = paramd.d();
        break;
      case 42:
        y localy = x.b();
        if ((0x10 & this.a) == 16);
        x localx;
        for (int j = 1; ; j = 0)
        {
          if (j != 0)
            localy.a(this.f);
          paramd.a(localy, paramg);
          localx = localy.a();
          if (localx != null)
            break;
          throw new NullPointerException();
        }
        this.f = localx;
        this.a = (0x10 | this.a);
        break;
      case 48:
      }
      this.a = (0x20 | this.a);
      this.g = paramd.c();
    }
  }

  private ae f()
  {
    return new ae().a(b());
  }

  public final ad a()
  {
    ad localad = b();
    if (!localad.o())
      throw new m();
    return localad;
  }

  public final ae a(int paramInt)
  {
    this.a = (0x1 | this.a);
    this.b = paramInt;
    return this;
  }

  public final ae a(long paramLong)
  {
    this.a = (0x4 | this.a);
    this.d = paramLong;
    return this;
  }

  public final ae a(ad paramad)
  {
    if (paramad == ad.a())
      return this;
    if (paramad.b())
      a(paramad.d());
    if (paramad.e())
      b(paramad.f());
    if (paramad.g())
      a(paramad.h());
    if (paramad.i())
      a(paramad.j());
    x localx;
    if (paramad.k())
    {
      localx = paramad.l();
      if (((0x10 & this.a) != 16) || (this.f == x.a()))
        break label166;
    }
    label166: for (this.f = x.a(this.f).a(localx).a(); ; this.f = localx)
    {
      this.a = (0x10 | this.a);
      if (!paramad.m())
        break;
      int i = paramad.n();
      this.a = (0x20 | this.a);
      this.g = i;
      return this;
    }
  }

  public final ae a(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x8 | this.a);
    this.e = paramc;
    return this;
  }

  public final ad b()
  {
    int i = 1;
    ad localad = new ad(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      ad.a(localad, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      ad.b(localad, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      ad.a(localad, this.d);
      if ((j & 0x8) == 8)
        i |= 8;
      ad.a(localad, this.e);
      if ((j & 0x10) == 16)
        i |= 16;
      ad.a(localad, this.f);
      if ((j & 0x20) == 32)
        i |= 32;
      ad.c(localad, this.g);
      ad.d(localad, i);
      return localad;
      i = 0;
    }
  }

  public final ae b(int paramInt)
  {
    this.a = (0x2 | this.a);
    this.c = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */