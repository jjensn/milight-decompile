package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;

public final class az extends i<ay, az>
{
  private int a;
  private long b;
  private int c;
  private int d;

  private az()
  {
  }

  private az c(d paramd, g paramg)
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
      }
      this.a = (0x4 | this.a);
      this.d = paramd.c();
    }
  }

  private az e()
  {
    return new az().a(a());
  }

  public final ay a()
  {
    int i = 1;
    ay localay = new ay(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      ay.a(localay, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      ay.a(localay, this.c);
      if ((j & 0x4) == 4)
        i |= 4;
      ay.b(localay, this.d);
      ay.c(localay, i);
      return localay;
      i = 0;
    }
  }

  public final az a(ay paramay)
  {
    if (paramay == ay.a());
    do
    {
      return this;
      if (paramay.b())
      {
        long l = paramay.d();
        this.a = (0x1 | this.a);
        this.b = l;
      }
      if (paramay.e())
      {
        int j = paramay.f();
        this.a = (0x2 | this.a);
        this.c = j;
      }
    }
    while (!paramay.g());
    int i = paramay.h();
    this.a = (0x4 | this.a);
    this.d = i;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.az
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */