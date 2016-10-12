package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;

public final class bd extends i<bc, bd>
{
  private int a;
  private long b;
  private int c;
  private long d;
  private long e;
  private c f = c.a;

  private bd()
  {
  }

  private bd c(d paramd, g paramg)
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
        this.a = (0x2 | this.a);
        this.c = paramd.c();
        break;
      case 24:
        this.a = (0x4 | this.a);
        this.d = paramd.b();
        break;
      case 32:
        this.a = (0x8 | this.a);
        this.e = paramd.b();
        break;
      case 42:
      }
      this.a = (0x10 | this.a);
      this.f = paramd.d();
    }
  }

  private bd e()
  {
    return new bd().a(a());
  }

  public final bc a()
  {
    int i = 1;
    bc localbc = new bc(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      bc.a(localbc, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      bc.a(localbc, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      bc.b(localbc, this.d);
      if ((j & 0x8) == 8)
        i |= 8;
      bc.c(localbc, this.e);
      if ((j & 0x10) == 16)
        i |= 16;
      bc.a(localbc, this.f);
      bc.b(localbc, i);
      return localbc;
      i = 0;
    }
  }

  public final bd a(bc parambc)
  {
    if (parambc == bc.a());
    do
    {
      return this;
      if (parambc.b())
      {
        long l3 = parambc.d();
        this.a = (0x1 | this.a);
        this.b = l3;
      }
      if (parambc.e())
      {
        int i = parambc.f();
        this.a = (0x2 | this.a);
        this.c = i;
      }
      if (parambc.g())
      {
        long l2 = parambc.h();
        this.a = (0x4 | this.a);
        this.d = l2;
      }
      if (parambc.i())
      {
        long l1 = parambc.j();
        this.a = (0x8 | this.a);
        this.e = l1;
      }
    }
    while (!parambc.k());
    c localc = parambc.l();
    if (localc == null)
      throw new NullPointerException();
    this.a = (0x10 | this.a);
    this.f = localc;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */