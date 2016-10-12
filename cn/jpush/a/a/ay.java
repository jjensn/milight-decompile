package cn.jpush.a.a;

import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class ay extends h
{
  private static final ay a;
  private int b;
  private long c;
  private int d;
  private int e;
  private byte f = -1;
  private int g = -1;

  static
  {
    ay localay = new ay();
    a = localay;
    localay.c = 0L;
    localay.d = 0;
    localay.e = 0;
  }

  private ay()
  {
  }

  private ay(az paramaz)
  {
    super((byte)0);
  }

  public static ay a()
  {
    return a;
  }

  public static az a(ay paramay)
  {
    return az.b().a(paramay);
  }

  public static az i()
  {
    return az.b();
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
      k += e.c(2, this.d);
    if ((0x4 & this.b) == 4)
      k += e.c(3, this.e);
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

  public final int f()
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
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */