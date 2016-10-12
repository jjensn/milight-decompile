package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class bf extends i<be, bf>
{
  private int a;
  private long b;
  private bg c = bg.a();
  private long d;

  private bf()
  {
  }

  private bf c(d paramd, g paramg)
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

  private bf f()
  {
    return new bf().a(b());
  }

  public final be a()
  {
    be localbe = b();
    if (!localbe.i())
      throw new m();
    return localbe;
  }

  public final bf a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final bf a(be parambe)
  {
    if (parambe == be.a())
      return this;
    if (parambe.b())
      a(parambe.d());
    bg localbg;
    if (parambe.e())
    {
      localbg = parambe.f();
      if (((0x2 & this.a) != 2) || (this.c == bg.a()))
        break label116;
    }
    label116: for (this.c = bg.a(this.c).a(localbg).b(); ; this.c = localbg)
    {
      this.a = (0x2 | this.a);
      if (!parambe.g())
        break;
      long l = parambe.h();
      this.a = (0x4 | this.a);
      this.d = l;
      return this;
    }
  }

  public final bf a(bg parambg)
  {
    if (parambg == null)
      throw new NullPointerException();
    this.c = parambg;
    this.a = (0x2 | this.a);
    return this;
  }

  public final be b()
  {
    int i = 1;
    be localbe = new be(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      be.a(localbe, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      be.a(localbe, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      be.b(localbe, this.d);
      be.a(localbe, i);
      return localbe;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */