package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class bg extends h
{
  private static final bg a;
  private int b;
  private c c;
  private c d;
  private c e;
  private byte f = -1;
  private int g = -1;

  static
  {
    bg localbg = new bg();
    a = localbg;
    localbg.c = c.a;
    localbg.d = c.a;
    localbg.e = c.a;
  }

  private bg()
  {
  }

  private bg(bh parambh)
  {
    super((byte)0);
  }

  public static bg a()
  {
    return a;
  }

  public static bh a(bg parambg)
  {
    return bh.e().a(parambg);
  }

  public static bh j()
  {
    return bh.e();
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
 * Qualified Name:     cn.jpush.a.a.bg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */