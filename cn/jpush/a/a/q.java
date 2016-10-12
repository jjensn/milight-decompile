package cn.jpush.a.a;

import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;
import java.util.Collections;
import java.util.List;

public final class q extends h
{
  private static final q a;
  private int b;
  private long c;
  private int d;
  private List<Long> e;
  private byte f = -1;
  private int g = -1;

  static
  {
    q localq = new q();
    a = localq;
    localq.c = 0L;
    localq.d = 0;
    localq.e = Collections.emptyList();
  }

  private q()
  {
  }

  private q(r paramr)
  {
    super((byte)0);
  }

  public static q a()
  {
    return a;
  }

  public static r a(q paramq)
  {
    return r.e().a(paramq);
  }

  public static r h()
  {
    return r.e();
  }

  public final void a(e parame)
  {
    c();
    if ((0x1 & this.b) == 1)
      parame.a(1, this.c);
    if ((0x2 & this.b) == 2)
      parame.a(2, this.d);
    for (int i = 0; i < this.e.size(); i++)
      parame.a(3, ((Long)this.e.get(i)).longValue());
  }

  public final boolean b()
  {
    return (0x1 & this.b) == 1;
  }

  public final int c()
  {
    int i = 0;
    int j = this.g;
    if (j != -1)
      return j;
    if ((0x1 & this.b) == 1);
    for (int k = 0 + e.b(1, this.c); ; k = 0)
    {
      if ((0x2 & this.b) == 2);
      for (int m = k + e.c(2, this.d); ; m = k)
      {
        int i2;
        for (int n = 0; i < this.e.size(); n = i2)
        {
          i2 = n + e.a(((Long)this.e.get(i)).longValue());
          i++;
        }
        int i1 = m + n + 1 * this.e.size();
        this.g = i1;
        return i1;
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
    int i = this.f;
    if (i != -1)
      return i == 1;
    this.f = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */