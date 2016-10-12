package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class ax extends i<aw, ax>
{
  private int a;
  private long b;
  private long c;

  private ax()
  {
  }

  private ax c(d paramd, g paramg)
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

  private ax f()
  {
    return new ax().a(b());
  }

  public final aw a()
  {
    aw localaw = b();
    if (!localaw.g())
      throw new m();
    return localaw;
  }

  public final ax a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final ax a(aw paramaw)
  {
    if (paramaw == aw.a());
    do
    {
      return this;
      if (paramaw.b())
        a(paramaw.d());
    }
    while (!paramaw.e());
    long l = paramaw.f();
    this.a = (0x2 | this.a);
    this.c = l;
    return this;
  }

  public final aw b()
  {
    int i = 1;
    aw localaw = new aw(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      aw.a(localaw, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      aw.b(localaw, this.c);
      aw.a(localaw, i);
      return localaw;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ax
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */