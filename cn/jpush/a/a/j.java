package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class j extends h
{
  private static final j a;
  private int b;
  private long c;
  private c d;
  private c e;
  private byte f = -1;
  private int g = -1;

  static
  {
    j localj = new j();
    a = localj;
    localj.c = 0L;
    localj.d = c.a;
    localj.e = c.a;
  }

  private j()
  {
  }

  private j(k paramk)
  {
    super((byte)0);
  }

  public static j a()
  {
    return a;
  }

  public static k a(j paramj)
  {
    return k.e().a(paramj);
  }

  public static k j()
  {
    return k.e();
  }

  public final void a(e parame)
  {
    c();
    if ((0x1 & this.b) == 1)
      parame.a(1, this.c);
    if ((0x2 & this.b) == 2)
      parame.a(2, this.d);
    if ((0x4 & this.b) == 4)
      parame.a(3, this.e);
  }

  public final boolean b()
  {
    return (0x1 & this.b) == 1;
  }

  public final int c()
  {
    int i = this.g;
    if (i != -1)
      return i;
    int j = 0x1 & this.b;
    int k = 0;
    if (j == 1)
      k = 0 + e.b(1, this.c);
    if ((0x2 & this.b) == 2)
      k += e.b(2, this.d);
    if ((0x4 & this.b) == 4)
      k += e.b(3, this.e);
    this.g = k;
    return k;
  }

  public final long d()
  {
    return this.c;
  }

  public final boolean e()
  {
    return (0x2 & this.b) == 2;
  }

  public final c f()
  {
    return this.d;
  }

  public final boolean g()
  {
    return (0x4 & this.b) == 4;
  }

  public final c h()
  {
    return this.e;
  }

  public final boolean i()
  {
    int i = this.f;
    if (i != -1)
      return i == 1;
    this.f = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */