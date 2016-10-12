package cn.jpush.a.a;

import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class ak extends h
{
  private static final ak a;
  private int b;
  private long c;
  private long d;
  private byte e = -1;
  private int f = -1;

  static
  {
    ak localak = new ak();
    a = localak;
    localak.c = 0L;
    localak.d = 0L;
  }

  private ak()
  {
  }

  private ak(al paramal)
  {
    super((byte)0);
  }

  public static ak a()
  {
    return a;
  }

  public static al a(ak paramak)
  {
    return al.e().a(paramak);
  }

  public static al h()
  {
    return al.e();
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
      k = 0 + e.b(1, this.c);
    if ((0x2 & this.b) == 2)
      k += e.b(2, this.d);
    this.f = k;
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

  public final long f()
  {
    return this.d;
  }

  public final boolean g()
  {
    int i = this.e;
    if (i != -1)
      return i == 1;
    this.e = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */