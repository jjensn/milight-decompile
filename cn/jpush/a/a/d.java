package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.h;

public final class d extends h
{
  private static final d a;
  private int b;
  private long c;
  private c d;
  private c e;
  private int f;
  private c g;
  private byte h = -1;
  private int i = -1;

  static
  {
    d locald = new d();
    a = locald;
    locald.c = 0L;
    locald.d = c.a;
    locald.e = c.a;
    locald.f = 0;
    locald.g = c.a;
  }

  private d()
  {
  }

  private d(e parame)
  {
    super((byte)0);
  }

  public static d a()
  {
    return a;
  }

  public static e a(d paramd)
  {
    return e.e().a(paramd);
  }

  public static e n()
  {
    return e.e();
  }

  public final void a(com.google.protobuf.jpush.e parame)
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
      m = 0 + com.google.protobuf.jpush.e.b(1, this.c);
    if ((0x2 & this.b) == 2)
      m += com.google.protobuf.jpush.e.b(2, this.d);
    if ((0x4 & this.b) == 4)
      m += com.google.protobuf.jpush.e.b(3, this.e);
    if ((0x8 & this.b) == 8)
      m += com.google.protobuf.jpush.e.c(4, this.f);
    if ((0x10 & this.b) == 16)
      m += com.google.protobuf.jpush.e.b(5, this.g);
    this.i = m;
    return m;
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

  public final c l()
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
 * Qualified Name:     cn.jpush.a.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */