package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class bc extends h
{
  private static final bc a;
  private int b;
  private long c;
  private int d;
  private long e;
  private long f;
  private c g;
  private byte h = -1;
  private int i = -1;

  static
  {
    bc localbc = new bc();
    a = localbc;
    localbc.c = 0L;
    localbc.d = 0;
    localbc.e = 0L;
    localbc.f = 0L;
    localbc.g = c.a;
  }

  private bc()
  {
  }

  private bc(bd parambd)
  {
    super((byte)0);
  }

  public static bc a()
  {
    return a;
  }

  public static bd a(bc parambc)
  {
    return bd.b().a(parambc);
  }

  public static bd m()
  {
    return bd.b();
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
      m += e.c(2, this.d);
    if ((0x4 & this.b) == 4)
      m += e.b(3, this.e);
    if ((0x8 & this.b) == 8)
      m += e.b(4, this.f);
    if ((0x10 & this.b) == 16)
      m += e.b(5, this.g);
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

  public final int f()
  {
    return this.d;
  }

  public final boolean g()
  {
    return (0x4 & this.b) == 4;
  }

  public final long h()
  {
    return this.e;
  }

  public final boolean i()
  {
    return (0x8 & this.b) == 8;
  }

  public final long j()
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
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */