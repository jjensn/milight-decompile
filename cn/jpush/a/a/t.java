package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class t extends i<s, t>
{
  private int a;
  private long b;

  private t()
  {
  }

  private t c(d paramd, g paramg)
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

  private t f()
  {
    return new t().a(b());
  }

  public final s a()
  {
    s locals = b();
    if (!locals.e())
      throw new m();
    return locals;
  }

  public final t a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final t a(s params)
  {
    if (params == s.a());
    while (!params.b())
      return this;
    a(params.d());
    return this;
  }

  public final s b()
  {
    int i = 1;
    s locals = new s(this, (byte)0);
    if ((0x1 & this.a) == i);
    while (true)
    {
      s.a(locals, this.b);
      s.a(locals, i);
      return locals;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */