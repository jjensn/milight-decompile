package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class ap extends i<ao, ap>
{
  private int a;
  private long b;
  private long c;
  private long d;
  private int e;
  private bg f = bg.a();
  private int g;
  private int h;

  private ap()
  {
  }

  private ap c(d paramd, g paramg)
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
        this.b = paramd.b();
        break;
      case 16:
        this.a = (0x2 | this.a);
        this.c = paramd.b();
        break;
      case 24:
        this.a = (0x4 | this.a);
        this.d = paramd.b();
        break;
      case 32:
        this.a = (0x8 | this.a);
        this.e = paramd.c();
        break;
      case 42:
        bh localbh = bg.j();
        if ((0x10 & this.a) == 16);
        bg localbg;
        for (int j = 1; ; j = 0)
        {
          if (j != 0)
            localbh.a(this.f);
          paramd.a(localbh, paramg);
          localbg = localbh.b();
          if (localbg != null)
            break;
          throw new NullPointerException();
        }
        this.f = localbg;
        this.a = (0x10 | this.a);
        break;
      case 48:
        this.a = (0x20 | this.a);
        this.g = paramd.e();
        break;
      case 56:
      }
      this.a = (0x40 | this.a);
      this.h = paramd.c();
    }
  }

  private ap f()
  {
    ap localap = new ap();
    ao localao = b();
    bg localbg;
    if (localao != ao.a())
    {
      if (localao.b())
        localap.a(localao.d());
      if (localao.e())
        localap.b(localao.f());
      if (localao.g())
        localap.c(localao.h());
      if (localao.i())
        localap.a(localao.j());
      if (localao.k())
      {
        localbg = localao.l();
        if (((0x10 & localap.a) != 16) || (localap.f == bg.a()))
          break label209;
      }
    }
    label209: for (localap.f = bg.a(localap.f).a(localbg).b(); ; localap.f = localbg)
    {
      localap.a = (0x10 | localap.a);
      if (localao.m())
      {
        int j = localao.n();
        localap.a = (0x20 | localap.a);
        localap.g = j;
      }
      if (localao.o())
      {
        int i = localao.p();
        localap.a = (0x40 | localap.a);
        localap.h = i;
      }
      return localap;
    }
  }

  public final ao a()
  {
    ao localao = b();
    if (!localao.q())
      throw new m();
    return localao;
  }

  public final ap a(int paramInt)
  {
    this.a = (0x8 | this.a);
    this.e = paramInt;
    return this;
  }

  public final ap a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final ao b()
  {
    int i = 1;
    ao localao = new ao(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      ao.a(localao, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      ao.b(localao, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      ao.c(localao, this.d);
      if ((j & 0x8) == 8)
        i |= 8;
      ao.a(localao, this.e);
      if ((j & 0x10) == 16)
        i |= 16;
      ao.a(localao, this.f);
      if ((j & 0x20) == 32)
        i |= 32;
      ao.b(localao, this.g);
      if ((j & 0x40) == 64)
        i |= 64;
      ao.c(localao, this.h);
      ao.d(localao, i);
      return localao;
      i = 0;
    }
  }

  public final ap b(long paramLong)
  {
    this.a = (0x2 | this.a);
    this.c = paramLong;
    return this;
  }

  public final ap c(long paramLong)
  {
    this.a = (0x4 | this.a);
    this.d = paramLong;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */