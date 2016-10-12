package cn.jpush.a.a;

import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class am extends h
{
  private static final am a;
  private int b;
  private long c;
  private long d;
  private byte e = -1;
  private int f = -1;

  static
  {
    am localam = new am();
    a = localam;
    localam.c = 0L;
    localam.d = 0L;
  }

  private am()
  {
  }

  private am(an paraman)
  {
    super((byte)0);
  }

  public static am a()
  {
    return a;
  }

  public static an a(am paramam)
  {
    return an.e().a(paramam);
  }

  public static an h()
  {
    return an.e();
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
 * Qualified Name:     cn.jpush.a.a.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */