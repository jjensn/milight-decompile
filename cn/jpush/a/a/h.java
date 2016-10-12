package cn.jpush.a.a;

import com.google.protobuf.jpush.e;

public final class h extends com.google.protobuf.jpush.h
{
  private static final h a;
  private int b;
  private long c;
  private byte d = -1;
  private int e = -1;

  static
  {
    h localh = new h();
    a = localh;
    localh.c = 0L;
  }

  private h()
  {
  }

  private h(i parami)
  {
    super((byte)0);
  }

  public static h a()
  {
    return a;
  }

  public static i a(h paramh)
  {
    return i.e().a(paramh);
  }

  public static i f()
  {
    return i.e();
  }

  public final void a(e parame)
  {
    c();
    if ((0x1 & this.b) == 1)
      parame.a(1, this.c);
  }

  public final boolean b()
  {
    return (0x1 & this.b) == 1;
  }

  public final int c()
  {
    int i = this.e;
    if (i != -1)
      return i;
    int j = 0x1 & this.b;
    int k = 0;
    if (j == 1)
      k = 0 + e.b(1, this.c);
    this.e = k;
    return k;
  }

  public final long d()
  {
    return this.c;
  }

  public final boolean e()
  {
    int i = this.d;
    if (i != -1)
      return i == 1;
    this.d = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */