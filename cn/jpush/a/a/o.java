package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class o extends h
{
  private static final o a;
  private int b;
  private c c;
  private c d;
  private int e;
  private int f;
  private long g;
  private byte h = -1;
  private int i = -1;

  static
  {
    o localo = new o();
    a = localo;
    localo.c = c.a;
    localo.d = c.a;
    localo.e = 0;
    localo.f = 0;
    localo.g = 0L;
  }

  private o()
  {
  }

  private o(p paramp)
  {
    super((byte)0);
  }

  public static o a()
  {
    return a;
  }

  public static p a(o paramo)
  {
    return p.e().a(paramo);
  }

  public static p n()
  {
    return p.e();
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
    if ((0x8 & this.b) == 8)
      parame.a(4, this.f);
    if ((0x10 & this.b) == 16)
      parame.a(5, this.g);
  }

  public final boolean b()
  {
    return (0x1 & this.b) == 1;
  }

  public final int c()
  {
    int j = this.i;
    if (j != -1)
      return j;
    int k = 0x1 & this.b;
    int m = 0;
    if (k == 1)
      m = 0 + e.b(1, this.c);
    if ((0x2 & this.b) == 2)
      m += e.b(2, this.d);
    if ((0x4 & this.b) == 4)
      m += e.c(3, this.e);
    if ((0x8 & this.b) == 8)
      m += e.c(4, this.f);
    if ((0x10 & this.b) == 16)
      m += e.b(5, this.g);
    this.i = m;
    return m;
  }

  public final c d()
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

  public final int h()
  {
    return this.e;
  }

  public final boolean i()
  {
    return (0x8 & this.b) == 8;
  }

  public final int j()
  {
    return this.f;
  }

  public final boolean k()
  {
    return (0x10 & this.b) == 16;
  }

  public final long l()
  {
    return this.g;
  }

  public final boolean m()
  {
    int j = this.h;
    if (j != -1)
      return j == 1;
    this.h = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */