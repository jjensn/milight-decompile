package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;

public final class ag extends i<af, ag>
{
  private int a;
  private int b;
  private c c = c.a;

  private ag()
  {
  }

  private ag c(d paramd, g paramg)
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
      case 18:
      }
      this.a = (0x2 | this.a);
      this.c = paramd.d();
    }
  }

  private ag e()
  {
    return new ag().a(a());
  }

  public final af a()
  {
    int i = 1;
    af localaf = new af(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      af.a(localaf, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      af.a(localaf, this.c);
      af.b(localaf, i);
      return localaf;
      i = 0;
    }
  }

  public final ag a(af paramaf)
  {
    if (paramaf == af.a());
    do
    {
      return this;
      if (paramaf.b())
      {
        int i = paramaf.d();
        this.a = (0x1 | this.a);
        this.b = i;
      }
    }
    while (!paramaf.e());
    c localc = paramaf.f();
    if (localc == null)
      throw new NullPointerException();
    this.a = (0x2 | this.a);
    this.c = localc;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */