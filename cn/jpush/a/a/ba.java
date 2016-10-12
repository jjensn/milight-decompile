package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;
import java.util.Collections;
import java.util.List;

public final class ba extends h
{
  private static final ba a;
  private int b;
  private long c;
  private int d;
  private long e;
  private long f;
  private List<Long> g;
  private c h;
  private int i;
  private int j;
  private int k;
  private byte l = -1;
  private int m = -1;

  static
  {
    ba localba = new ba();
    a = localba;
    localba.c = 0L;
    localba.d = 0;
    localba.e = 0L;
    localba.f = 0L;
    localba.g = Collections.emptyList();
    localba.h = c.a;
    localba.i = 0;
    localba.j = 0;
    localba.k = 0;
  }

  private ba()
  {
  }

  private ba(bb parambb)
  {
    super((byte)0);
  }

  public static ba a()
  {
    return a;
  }

  public static bb a(ba paramba)
  {
    return bb.e().a(paramba);
  }

  public static bb t()
  {
    return bb.e();
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
    for (int n = 0; n < this.g.size(); n++)
      parame.a(5, ((Long)this.g.get(n)).longValue());
    if ((0x10 & this.b) == 16)
      parame.a(6, this.h);
    if ((0x20 & this.b) == 32)
      parame.b(7, this.i);
    if ((0x40 & this.b) == 64)
      parame.a(8, this.j);
    if ((0x80 & this.b) == 128)
      parame.a(9, this.k);
  }

  public final boolean b()
  {
    return (0x1 & this.b) == 1;
  }

  public final int c()
  {
    int n = 0;
    int i1 = this.m;
    if (i1 != -1)
      return i1;
    if ((0x1 & this.b) == 1);
    for (int i2 = 0 + e.b(1, this.c); ; i2 = 0)
    {
      if ((0x2 & this.b) == 2)
        i2 += e.c(2, this.d);
      if ((0x4 & this.b) == 4)
        i2 += e.b(3, this.e);
      if ((0x8 & this.b) == 8);
      for (int i3 = i2 + e.b(4, this.f); ; i3 = i2)
      {
        int i6;
        for (int i4 = 0; n < this.g.size(); i4 = i6)
        {
          i6 = i4 + e.a(((Long)this.g.get(n)).longValue());
          n++;
        }
        int i5 = i3 + i4 + 1 * this.g.size();
        if ((0x10 & this.b) == 16)
          i5 += e.b(6, this.h);
        if ((0x20 & this.b) == 32)
          i5 += e.d(7, this.i);
        if ((0x40 & this.b) == 64)
          i5 += e.c(8, this.j);
        if ((0x80 & this.b) == 128)
          i5 += e.c(9, this.k);
        this.m = i5;
        return i5;
      }
    }
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

  public final long h()
  {
    return this.e;
  }

  public final boolean i()
  {
    return (0x8 & this.b) == 8;
  }

  public final long j()
  {
    return this.f;
  }

  public final boolean k()
  {
    return (0x10 & this.b) == 16;
  }

  public final c l()
  {
    return this.h;
  }

  public final boolean m()
  {
    return (0x20 & this.b) == 32;
  }

  public final int n()
  {
    return this.i;
  }

  public final boolean o()
  {
    return (0x40 & this.b) == 64;
  }

  public final int p()
  {
    return this.j;
  }

  public final boolean q()
  {
    return (0x80 & this.b) == 128;
  }

  public final int r()
  {
    return this.k;
  }

  public final boolean s()
  {
    int n = this.l;
    if (n != -1)
      return n == 1;
    this.l = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */