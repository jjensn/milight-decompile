package cn.jpush.a.a;

import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;
import java.util.Collections;
import java.util.List;

public final class f extends h
{
  private static final f a;
  private List<Long> b;
  private byte c = -1;
  private int d = -1;

  static
  {
    f localf = new f();
    a = localf;
    localf.b = Collections.emptyList();
  }

  private f()
  {
  }

  private f(g paramg)
  {
    super((byte)0);
  }

  public static f a()
  {
    return a;
  }

  public static g a(f paramf)
  {
    return g.e().a(paramf);
  }

  public static g d()
  {
    return g.e();
  }

  public final void a(e parame)
  {
    c();
    for (int i = 0; i < this.b.size(); i++)
      parame.a(1, ((Long)this.b.get(i)).longValue());
  }

  public final boolean b()
  {
    int i = this.c;
    if (i != -1)
      return i == 1;
    this.c = 1;
    return true;
  }

  public final int c()
  {
    int i = this.d;
    if (i != -1)
      return i;
    int j = 0;
    int k = 0;
    while (j < this.b.size())
    {
      k += e.a(((Long)this.b.get(j)).longValue());
      j++;
    }
    int m = k + 0 + 1 * this.b.size();
    this.d = m;
    return m;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */