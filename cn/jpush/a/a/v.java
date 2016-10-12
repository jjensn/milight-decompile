package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class v extends i<u, v>
{
  private int a;
  private long b;
  private c c = c.a;
  private c d = c.a;

  private v()
  {
  }

  private v c(d paramd, g paramg)
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
      }
      this.a = (0x4 | this.a);
      this.d = paramd.d();
    }
  }

  private v f()
  {
    return new v().a(b());
  }

  public final u a()
  {
    u localu = b();
    if (!localu.i())
      throw new m();
    return localu;
  }

  public final v a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final v a(u paramu)
  {
    if (paramu == u.a());
    do
    {
      return this;
      if (paramu.b())
        a(paramu.d());
      if (paramu.e())
        a(paramu.f());
    }
    while (!paramu.g());
    b(paramu.h());
    return this;
  }

  public final v a(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x2 | this.a);
    this.c = paramc;
    return this;
  }

  public final u b()
  {
    int i = 1;
    u localu = new u(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      u.a(localu, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      u.a(localu, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      u.b(localu, this.d);
      u.a(localu, i);
      return localu;
      i = 0;
    }
  }

  public final v b(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x4 | this.a);
    this.d = paramc;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */