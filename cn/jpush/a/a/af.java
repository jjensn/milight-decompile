package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class af extends h
{
  private static final af a;
  private int b;
  private int c;
  private c d;
  private byte e = -1;
  private int f = -1;

  static
  {
    af localaf = new af();
    a = localaf;
    localaf.c = 0;
    localaf.d = c.a;
  }

  private af()
  {
  }

  private af(ag paramag)
  {
    super((byte)0);
  }

  public static af a()
  {
    return a;
  }

  public static ag a(af paramaf)
  {
    return ag.b().a(paramaf);
  }

  public static ag g()
  {
    return ag.b();
  }

  public final void a(e parame)
  {
    c();
    if ((0x1 & this.b) == 1)
      parame.a(1, this.c);
    if ((0x2 & this.b) == 2)
      parame.a(2, this.d);
  }

  public final boolean b()
  {
    return (0x1 & this.b) == 1;
  }

  public final int c()
  {
    int i = this.f;
    if (i != -1)
      return i;
    int j = 0x1 & this.b;
    int k = 0;
    if (j == 1)
      k = 0 + e.c(1, this.c);
    if ((0x2 & this.b) == 2)
      k += e.b(2, this.d);
    this.f = k;
    return k;
  }

  public final int d()
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
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */