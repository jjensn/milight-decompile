package cn.jpush.a.a;

import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class bi extends h
{
  private static final bi a;
  private int b;
  private long c;
  private bg d;
  private long e;
  private byte f = -1;
  private int g = -1;

  static
  {
    bi localbi = new bi();
    a = localbi;
    localbi.c = 0L;
    localbi.d = bg.a();
    localbi.e = 0L;
  }

  private bi()
  {
  }

  private bi(bj parambj)
  {
    super((byte)0);
  }

  public static bi a()
  {
    return a;
  }

  public static bj a(bi parambi)
  {
    return bj.e().a(parambi);
  }

  public static bj j()
  {
    return bj.e();
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

  public final bg f()
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
    int i = this.f;
    if (i != -1)
      return i == 1;
    this.f = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */