package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class an extends i<am, an>
{
  private int a;
  private long b;
  private long c;

  private an()
  {
  }

  private an c(d paramd, g paramg)
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
        this.a = (0x1 | this.a);
        this.b = paramd.b();
        break;
      case 16:
      }
      this.a = (0x2 | this.a);
      this.c = paramd.b();
    }
  }

  private an f()
  {
    return new an().a(b());
  }

  public final am a()
  {
    am localam = b();
    if (!localam.g())
      throw new m();
    return localam;
  }

  public final an a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final an a(am paramam)
  {
    if (paramam == am.a());
    do
    {
      return this;
      if (paramam.b())
        a(paramam.d());
    }
    while (!paramam.e());
    long l = paramam.f();
    this.a = (0x2 | this.a);
    this.c = l;
    return this;
  }

  public final am b()
  {
    int i = 1;
    am localam = new am(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      am.a(localam, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      am.b(localam, this.c);
      am.a(localam, i);
      return localam;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.an
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */