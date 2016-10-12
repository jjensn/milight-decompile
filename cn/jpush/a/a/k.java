package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class k extends i<j, k>
{
  private int a;
  private long b;
  private c c = c.a;
  private c d = c.a;

  private k()
  {
  }

  private k c(d paramd, g paramg)
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

  private k f()
  {
    return new k().a(b());
  }

  public final j a()
  {
    j localj = b();
    if (!localj.i())
      throw new m();
    return localj;
  }

  public final k a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final k a(j paramj)
  {
    if (paramj == j.a());
    do
    {
      return this;
      if (paramj.b())
        a(paramj.d());
      if (paramj.e())
        a(paramj.f());
    }
    while (!paramj.g());
    b(paramj.h());
    return this;
  }

  public final k a(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x2 | this.a);
    this.c = paramc;
    return this;
  }

  public final j b()
  {
    int i = 1;
    j localj = new j(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      j.a(localj, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      j.a(localj, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      j.b(localj, this.d);
      j.a(localj, i);
      return localj;
      i = 0;
    }
  }

  public final k b(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x4 | this.a);
    this.d = paramc;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */