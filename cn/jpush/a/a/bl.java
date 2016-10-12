package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class bl extends h
{
  private static final bl a;
  private int b;
  private c c;
  private c d;
  private int e;
  private c f;
  private byte g = -1;
  private int h = -1;

  static
  {
    bl localbl = new bl();
    a = localbl;
    localbl.c = c.a;
    localbl.d = c.a;
    localbl.e = 0;
    localbl.f = c.a;
  }

  private bl()
  {
  }

  private bl(bm parambm)
  {
    super((byte)0);
  }

  public static bl a()
  {
    return a;
  }

  public static bm a(bl parambl)
  {
    return bm.e().a(parambl);
  }

  public static bm l()
  {
    return bm.e();
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
  }

  public final boolean b()
  {
    return (0x1 & this.b) == 1;
  }

  public final int c()
  {
    int i = this.h;
    if (i != -1)
      return i;
    int j = 0x1 & this.b;
    int k = 0;
    if (j == 1)
      k = 0 + e.b(1, this.c);
    if ((0x2 & this.b) == 2)
      k += e.b(2, this.d);
    if ((0x4 & this.b) == 4)
      k += e.c(3, this.e);
    if ((0x8 & this.b) == 8)
      k += e.b(4, this.f);
    this.h = k;
    return k;
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

  public final c j()
  {
    return this.f;
  }

  public final boolean k()
  {
    int i = this.g;
    if (i != -1)
      return i == 1;
    this.g = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */