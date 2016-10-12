package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class e extends i<d, e>
{
  private int a;
  private long b;
  private c c = c.a;
  private c d = c.a;
  private int e;
  private c f = c.a;

  private e()
  {
  }

  private e c(com.google.protobuf.jpush.d paramd, g paramg)
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
      case 18:
        this.a = (0x2 | this.a);
        this.c = paramd.d();
        break;
      case 26:
        this.a = (0x4 | this.a);
        this.d = paramd.d();
        break;
      case 32:
        this.a = (0x8 | this.a);
        this.e = paramd.c();
        break;
      case 42:
      }
      this.a = (0x10 | this.a);
      this.f = paramd.d();
    }
  }

  private e f()
  {
    return new e().a(b());
  }

  public final d a()
  {
    d locald = b();
    if (!locald.m())
      throw new m();
    return locald;
  }

  public final e a(int paramInt)
  {
    this.a = (0x8 | this.a);
    this.e = paramInt;
    return this;
  }

  public final e a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final e a(d paramd)
  {
    if (paramd == d.a());
    do
    {
      return this;
      if (paramd.b())
        a(paramd.d());
      if (paramd.e())
        a(paramd.f());
      if (paramd.g())
        b(paramd.h());
      if (paramd.i())
        a(paramd.j());
    }
    while (!paramd.k());
    c(paramd.l());
    return this;
  }

  public final e a(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x2 | this.a);
    this.c = paramc;
    return this;
  }

  public final d b()
  {
    int i = 1;
    d locald = new d(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      d.a(locald, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      d.a(locald, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      d.b(locald, this.d);
      if ((j & 0x8) == 8)
        i |= 8;
      d.a(locald, this.e);
      if ((j & 0x10) == 16)
        i |= 16;
      d.c(locald, this.f);
      d.b(locald, i);
      return locald;
      i = 0;
    }
  }

  public final e b(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x4 | this.a);
    this.d = paramc;
    return this;
  }

  public final e c(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x10 | this.a);
    this.f = paramc;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */