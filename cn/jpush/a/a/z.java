package cn.jpush.a.a;

import com.google.protobuf.jpush.b;
import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;

public final class z extends h
{
  private static final z a;
  private int b;
  private ad c;
  private ab d;
  private byte e = -1;
  private int f = -1;

  static
  {
    z localz = new z();
    a = localz;
    localz.c = ad.a();
    localz.d = ab.a();
  }

  private z()
  {
  }

  private z(aa paramaa)
  {
    super((byte)0);
  }

  public static z a()
  {
    return a;
  }

  public static z a(byte[] paramArrayOfByte)
  {
    return aa.a((aa)aa.b().a(paramArrayOfByte, 0, paramArrayOfByte.length));
  }

  public static aa h()
  {
    return aa.b();
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

  public final ad d()
  {
    return this.c;
  }

  public final boolean e()
  {
    return (0x2 & this.b) == 2;
  }

  public final ab f()
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
 * Qualified Name:     cn.jpush.a.a.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */