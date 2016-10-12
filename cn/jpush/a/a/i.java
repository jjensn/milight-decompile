package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.m;

public final class i extends com.google.protobuf.jpush.i<h, i>
{
  private int a;
  private long b;

  private i()
  {
  }

  private i c(d paramd, g paramg)
  {
    while (true)
    {
      int i = paramd.a();
      switch (i)
      {
      default:
        if (paramd.b(i))
          continue;
      case 0:
        return this;
      case 8:
      }
      this.a = (0x1 | this.a);
      this.b = paramd.b();
    }
  }

  private i f()
  {
    return new i().a(b());
  }

  public final h a()
  {
    h localh = b();
    if (!localh.e())
      throw new m();
    return localh;
  }

  public final i a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final i a(h paramh)
  {
    if (paramh == h.a());
    while (!paramh.b())
      return this;
    a(paramh.d());
    return this;
  }

  public final h b()
  {
    int i = 1;
    h localh = new h(this, (byte)0);
    if ((0x1 & this.a) == i);
    while (true)
    {
      h.a(localh, this.b);
      h.a(localh, i);
      return localh;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */