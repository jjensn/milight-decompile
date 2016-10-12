package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;

public final class aj extends i<ai, aj>
{
  private int a;
  private int b;
  private long c;

  private aj()
  {
  }

  private aj c(d paramd, g paramg)
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
      case 16:
      }
      this.a = (0x2 | this.a);
      this.c = paramd.b();
    }
  }

  private aj f()
  {
    return new aj().a(b());
  }

  public final ai a()
  {
    ai localai = b();
    if (!localai.g())
      throw new m();
    return localai;
  }

  public final aj a(ai paramai)
  {
    if (paramai == ai.a());
    do
    {
      return this;
      if (paramai.b())
      {
        int i = paramai.d();
        this.a = (0x1 | this.a);
        this.b = i;
      }
    }
    while (!paramai.e());
    long l = paramai.f();
    this.a = (0x2 | this.a);
    this.c = l;
    return this;
  }

  public final ai b()
  {
    int i = 1;
    ai localai = new ai(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      ai.a(localai, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      ai.a(localai, this.c);
      ai.b(localai, i);
      return localai;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */