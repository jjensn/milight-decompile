package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class bj extends i<bi, bj>
{
  private int a;
  private long b;
  private bg c = bg.a();
  private long d;

  private bj()
  {
  }

  private bj c(d paramd, g paramg)
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
      case 18:
        bh localbh = bg.j();
        if ((0x2 & this.a) == 2);
        for (int j = 1; ; j = 0)
        {
          if (j != 0)
            localbh.a(this.c);
          paramd.a(localbh, paramg);
          a(localbh.b());
          break;
        }
      case 24:
      }
      this.a = (0x4 | this.a);
      this.d = paramd.b();
    }
  }

  private bj f()
  {
    return new bj().a(b());
  }

  public final bi a()
  {
    bi localbi = b();
    if (!localbi.i())
      throw new m();
    return localbi;
  }

  public final bj a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final bj a(bg parambg)
  {
    if (parambg == null)
      throw new NullPointerException();
    this.c = parambg;
    this.a = (0x2 | this.a);
    return this;
  }

  public final bj a(bi parambi)
  {
    if (parambi == bi.a())
      return this;
    if (parambi.b())
      a(parambi.d());
    bg localbg;
    if (parambi.e())
    {
      localbg = parambi.f();
      if (((0x2 & this.a) != 2) || (this.c == bg.a()))
        break label116;
    }
    label116: for (this.c = bg.a(this.c).a(localbg).b(); ; this.c = localbg)
    {
      this.a = (0x2 | this.a);
      if (!parambi.g())
        break;
      long l = parambi.h();
      this.a = (0x4 | this.a);
      this.d = l;
      return this;
    }
  }

  public final bi b()
  {
    int i = 1;
    bi localbi = new bi(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      bi.a(localbi, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      bi.a(localbi, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      bi.b(localbi, this.d);
      bi.a(localbi, i);
      return localbi;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */