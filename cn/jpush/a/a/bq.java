package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class bq extends i<bp, bq>
{
  private int a;
  private c b = c.a;

  private bq()
  {
  }

  private bq c(d paramd, g paramg)
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
      case 10:
      }
      this.a = (0x1 | this.a);
      this.b = paramd.d();
    }
  }

  private bq f()
  {
    return new bq().a(b());
  }

  public final bp a()
  {
    bp localbp = b();
    if (!localbp.e())
      throw new m();
    return localbp;
  }

  public final bq a(bp parambp)
  {
    if (parambp == bp.a());
    while (!parambp.b())
      return this;
    a(parambp.d());
    return this;
  }

  public final bq a(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x1 | this.a);
    this.b = paramc;
    return this;
  }

  public final bp b()
  {
    int i = 1;
    bp localbp = new bp(this, (byte)0);
    if ((0x1 & this.a) == i);
    while (true)
    {
      bp.a(localbp, this.b);
      bp.a(localbp, i);
      return localbp;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */