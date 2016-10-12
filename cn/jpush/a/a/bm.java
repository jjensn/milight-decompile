package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class bm extends i<bl, bm>
{
  private int a;
  private c b = c.a;
  private c c = c.a;
  private int d;
  private c e = c.a;

  private bm()
  {
  }

  private bm c(d paramd, g paramg)
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
      case 24:
        this.a = (0x4 | this.a);
        this.d = paramd.c();
        break;
      case 34:
      }
      this.a = (0x8 | this.a);
      this.e = paramd.d();
    }
  }

  private bm f()
  {
    return new bm().a(b());
  }

  public final bl a()
  {
    bl localbl = b();
    if (!localbl.k())
      throw new m();
    return localbl;
  }

  public final bm a(int paramInt)
  {
    this.a = (0x4 | this.a);
    this.d = paramInt;
    return this;
  }

  public final bm a(bl parambl)
  {
    if (parambl == bl.a());
    do
    {
      return this;
      if (parambl.b())
        a(parambl.d());
      if (parambl.e())
        b(parambl.f());
      if (parambl.g())
        a(parambl.h());
    }
    while (!parambl.i());
    c(parambl.j());
    return this;
  }

  public final bm a(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x1 | this.a);
    this.b = paramc;
    return this;
  }

  public final bl b()
  {
    int i = 1;
    bl localbl = new bl(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      bl.a(localbl, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      bl.b(localbl, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      bl.a(localbl, this.d);
      if ((j & 0x8) == 8)
        i |= 8;
      bl.c(localbl, this.e);
      bl.b(localbl, i);
      return localbl;
      i = 0;
    }
  }

  public final bm b(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x2 | this.a);
    this.c = paramc;
    return this;
  }

  public final bm c(c paramc)
  {
    if (paramc == null)
      throw new NullPointerException();
    this.a = (0x8 | this.a);
    this.e = paramc;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */