package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class ad extends h
{
  private static final ad a;
  private int b;
  private int c;
  private int d;
  private long e;
  private c f;
  private x g;
  private int h;
  private byte i = -1;
  private int j = -1;

  static
  {
    ad localad = new ad();
    a = localad;
    localad.c = 0;
    localad.d = 0;
    localad.e = 0L;
    localad.f = c.a;
    localad.g = x.a();
    localad.h = 0;
  }

  private ad()
  {
  }

  private ad(ae paramae)
  {
    super((byte)0);
  }

  public static ad a()
  {
    return a;
  }

  public static ae a(ad paramad)
  {
    return ae.e().a(paramad);
  }

  public static ae p()
  {
    return ae.e();
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
      parame.a(6, this.h);
  }

  public final boolean b()
  {
    return (0x1 & this.b) == 1;
  }

  public final int c()
  {
    int k = this.j;
    if (k != -1)
      return k;
    int m = 0x1 & this.b;
    int n = 0;
    if (m == 1)
      n = 0 + e.c(1, this.c);
    if ((0x2 & this.b) == 2)
      n += e.c(2, this.d);
    if ((0x4 & this.b) == 4)
      n += e.b(3, this.e);
    if ((0x8 & this.b) == 8)
      n += e.b(4, this.f);
    if ((0x10 & this.b) == 16)
      n += e.b(5, this.g);
    if ((0x20 & this.b) == 32)
      n += e.c(6, this.h);
    this.j = n;
    return n;
  }

  public final int d()
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

  public final c j()
  {
    return this.f;
  }

  public final boolean k()
  {
    return (0x10 & this.b) == 16;
  }

  public final x l()
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
    int k = this.i;
    if (k != -1)
      return k == 1;
    this.i = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */