package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class bh extends i<bg, bh>
{
  private int a;
  private c b = c.a;
  private c c = c.a;
  private c d = c.a;

  private bh()
  {
  }

  private bh c(d paramd, g paramg)
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
        this.a = (0x1 | this.a);
        this.b = paramd.d();
        break;
      case 18:
        this.a = (0x2 | this.a);
        this.c = paramd.d();
        break;
      case 26:
      }
      this.a = (0x4 | this.a);
      this.d = paramd.d();
    }
  }

  private bh f()
  {
    return new bh().a(b());
  }

  public final bg a()
  {
    bg localbg = b();
    if (!localbg.i())
      throw new m();
    return localbg;
  }

  public final bh a(bg parambg)
  {
    if (parambg == bg.a());
    do
    {
      return this;
      if (parambg.b())
        a(parambg.d());
      if (parambg.e())
      {
        c localc2 = parambg.f();
        if (localc2 == null)
          throw new NullPointerException();
        this.a = (0x2 | this.a);
        this.c = localc2;
      }
    }
    while (!parambg.g());
    c localc1 = parambg.h();
    if (localc1 == null)
      throw new NullPointerException();
    this.a = (0x4 | this.a);
    this.d = localc1;
    return this;
  }

  public final bh a(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x1 | this.a);
    this.b = paramc;
    return this;
  }

  public final bg b()
  {
    int i = 1;
    bg localbg = new bg(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      bg.a(localbg, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      bg.b(localbg, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      bg.c(localbg, this.d);
      bg.a(localbg, i);
      return localbg;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */