package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class p extends i<o, p>
{
  private int a;
  private c b = c.a;
  private c c = c.a;
  private int d;
  private int e;
  private long f;

  private p()
  {
  }

  private p c(d paramd, g paramg)
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
      case 10:
        this.a = (0x1 | this.a);
        this.b = paramd.d();
        break;
      case 18:
        this.a = (0x2 | this.a);
        this.c = paramd.d();
        break;
      case 24:
        this.a = (0x4 | this.a);
        this.d = paramd.c();
        break;
      case 32:
        this.a = (0x8 | this.a);
        this.e = paramd.c();
        break;
      case 40:
      }
      this.a = (0x10 | this.a);
      this.f = paramd.b();
    }
  }

  private p f()
  {
    return new p().a(b());
  }

  public final o a()
  {
    o localo = b();
    if (!localo.m())
      throw new m();
    return localo;
  }

  public final p a(int paramInt)
  {
    this.a = (0x4 | this.a);
    this.d = paramInt;
    return this;
  }

  public final p a(o paramo)
  {
    if (paramo == o.a());
    do
    {
      return this;
      if (paramo.b())
        a(paramo.d());
      if (paramo.e())
        b(paramo.f());
      if (paramo.g())
        a(paramo.h());
      if (paramo.i())
        b(paramo.j());
    }
    while (!paramo.k());
    long l = paramo.l();
    this.a = (0x10 | this.a);
    this.f = l;
    return this;
  }

  public final p a(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x1 | this.a);
    this.b = paramc;
    return this;
  }

  public final o b()
  {
    int i = 1;
    o localo = new o(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      o.a(localo, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      o.b(localo, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      o.a(localo, this.d);
      if ((j & 0x8) == 8)
        i |= 8;
      o.b(localo, this.e);
      if ((j & 0x10) == 16)
        i |= 16;
      o.a(localo, this.f);
      o.c(localo, i);
      return localo;
      i = 0;
    }
  }

  public final p b(int paramInt)
  {
    this.a = (0x8 | this.a);
    this.e = paramInt;
    return this;
  }

  public final p b(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x2 | this.a);
    this.c = paramc;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */