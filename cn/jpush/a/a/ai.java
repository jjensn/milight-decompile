package cn.jpush.a.a;

import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class ai extends h
{
  private static final ai a;
  private int b;
  private int c;
  private long d;
  private byte e = -1;
  private int f = -1;

  static
  {
    ai localai = new ai();
    a = localai;
    localai.c = 0;
    localai.d = 0L;
  }

  private ai()
  {
  }

  private ai(aj paramaj)
  {
    super((byte)0);
  }

  public static ai a()
  {
    return a;
  }

  public static aj a(ai paramai)
  {
    return aj.e().a(paramai);
  }

  public static aj h()
  {
    return aj.e();
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
 * Qualified Name:     cn.jpush.a.a.ai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */