package cn.jpush.a.a;

import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class ao extends h
{
  private static final ao a;
  private int b;
  private long c;
  private long d;
  private long e;
  private int f;
  private bg g;
  private int h;
  private int i;
  private byte j = -1;
  private int k = -1;

  static
  {
    ao localao = new ao();
    a = localao;
    localao.c = 0L;
    localao.d = 0L;
    localao.e = 0L;
    localao.f = 0;
    localao.g = bg.a();
    localao.h = 0;
    localao.i = 0;
  }

  private ao()
  {
  }

  private ao(ap paramap)
  {
    super((byte)0);
  }

  public static ao a()
  {
    return a;
  }

  public static ap r()
  {
    return ap.e();
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
    if ((0x20 & this.b) == 32)
      parame.b(6, this.h);
    if ((0x40 & this.b) == 64)
      parame.a(7, this.i);
  }

  public final boolean b()
  {
    return (0x1 & this.b) == 1;
  }

  public final int c()
  {
    int m = this.k;
    if (m != -1)
      return m;
    int n = 0x1 & this.b;
    int i1 = 0;
    if (n == 1)
      i1 = 0 + e.b(1, this.c);
    if ((0x2 & this.b) == 2)
      i1 += e.b(2, this.d);
    if ((0x4 & this.b) == 4)
      i1 += e.b(3, this.e);
    if ((0x8 & this.b) == 8)
      i1 += e.c(4, this.f);
    if ((0x10 & this.b) == 16)
      i1 += e.b(5, this.g);
    if ((0x20 & this.b) == 32)
      i1 += e.d(6, this.h);
    if ((0x40 & this.b) == 64)
      i1 += e.c(7, this.i);
    this.k = i1;
    return i1;
  }

  public final long d()
  {
    return this.c;
  }

  public final boolean e()
  {
    return (0x2 & this.b) == 2;
  }

  public final long f()
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

  public final int j()
  {
    return this.f;
  }

  public final boolean k()
  {
    return (0x10 & this.b) == 16;
  }

  public final bg l()
  {
    return this.g;
  }

  public final boolean m()
  {
    return (0x20 & this.b) == 32;
  }

  public final int n()
  {
    return this.h;
  }

  public final boolean o()
  {
    return (0x40 & this.b) == 64;
  }

  public final int p()
  {
    return this.i;
  }

  public final boolean q()
  {
    int m = this.j;
    if (m != -1)
      return m == 1;
    this.j = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */