package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class bn extends h
{
  private static final bn a;
  private int b;
  private c c;
  private byte d = -1;
  private int e = -1;

  static
  {
    bn localbn = new bn();
    a = localbn;
    localbn.c = c.a;
  }

  private bn()
  {
  }

  private bn(bo parambo)
  {
    super((byte)0);
  }

  public static bn a()
  {
    return a;
  }

  public static bo a(bn parambn)
  {
    return bo.e().a(parambn);
  }

  public static bo f()
  {
    return bo.e();
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

  public final c d()
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
 * Qualified Name:     cn.jpush.a.a.bn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */