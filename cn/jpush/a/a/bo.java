package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class bo extends i<bn, bo>
{
  private int a;
  private c b = c.a;

  private bo()
  {
  }

  private bo c(d paramd, g paramg)
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

  private bo f()
  {
    return new bo().a(b());
  }

  public final bn a()
  {
    bn localbn = b();
    if (!localbn.e())
      throw new m();
    return localbn;
  }

  public final bo a(bn parambn)
  {
    if (parambn == bn.a());
    while (!parambn.b())
      return this;
    a(parambn.d());
    return this;
  }

  public final bo a(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x1 | this.a);
    this.b = paramc;
    return this;
  }

  public final bn b()
  {
    int i = 1;
    bn localbn = new bn(this, (byte)0);
    if ((0x1 & this.a) == i);
    while (true)
    {
      bn.a(localbn, this.b);
      bn.a(localbn, i);
      return localbn;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */