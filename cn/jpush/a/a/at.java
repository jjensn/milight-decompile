package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class at extends i<as, at>
{
  private int a;
  private int b;
  private long c;

  private at()
  {
  }

  private at c(d paramd, g paramg)
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
        this.b = paramd.c();
        break;
      case 16:
      }
      this.a = (0x2 | this.a);
      this.c = paramd.b();
    }
  }

  private at f()
  {
    return new at().a(b());
  }

  public final as a()
  {
    as localas = b();
    if (!localas.g())
      throw new m();
    return localas;
  }

  public final at a(as paramas)
  {
    if (paramas == as.a());
    do
    {
      return this;
      if (paramas.b())
      {
        int i = paramas.d();
        this.a = (0x1 | this.a);
        this.b = i;
      }
    }
    while (!paramas.e());
    long l = paramas.f();
    this.a = (0x2 | this.a);
    this.c = l;
    return this;
  }

  public final as b()
  {
    int i = 1;
    as localas = new as(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      as.a(localas, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      as.a(localas, this.c);
      as.b(localas, i);
      return localas;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.at
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */