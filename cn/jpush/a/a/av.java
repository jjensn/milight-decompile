package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class av extends i<au, av>
{
  private int a;
  private long b;
  private long c;

  private av()
  {
  }

  private av c(d paramd, g paramg)
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

  private av f()
  {
    return new av().a(b());
  }

  public final au a()
  {
    au localau = b();
    if (!localau.g())
      throw new m();
    return localau;
  }

  public final av a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final av a(au paramau)
  {
    if (paramau == au.a());
    do
    {
      return this;
      if (paramau.b())
        a(paramau.d());
    }
    while (!paramau.e());
    long l = paramau.f();
    this.a = (0x2 | this.a);
    this.c = l;
    return this;
  }

  public final au b()
  {
    int i = 1;
    au localau = new au(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      au.a(localau, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      au.b(localau, this.c);
      au.a(localau, i);
      return localau;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.av
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */