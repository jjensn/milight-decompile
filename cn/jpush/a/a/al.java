package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class al extends i<ak, al>
{
  private int a;
  private long b;
  private long c;

  private al()
  {
  }

  private al c(d paramd, g paramg)
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

  private al f()
  {
    return new al().a(b());
  }

  public final ak a()
  {
    ak localak = b();
    if (!localak.g())
      throw new m();
    return localak;
  }

  public final al a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final al a(ak paramak)
  {
    if (paramak == ak.a());
    do
    {
      return this;
      if (paramak.b())
        a(paramak.d());
    }
    while (!paramak.e());
    long l = paramak.f();
    this.a = (0x2 | this.a);
    this.c = l;
    return this;
  }

  public final ak b()
  {
    int i = 1;
    ak localak = new ak(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      ak.a(localak, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      ak.b(localak, this.c);
      ak.a(localak, i);
      return localak;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.al
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */