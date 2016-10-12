package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c extends i<b, c>
{
  private int a;
  private List<Long> b = Collections.emptyList();

  private c()
  {
  }

  private c c(d paramd, g paramg)
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
        g();
        this.b.add(Long.valueOf(paramd.b()));
        break;
      case 10:
      }
      int j = paramd.c(paramd.f());
      while (paramd.g() > 0)
      {
        long l = paramd.b();
        g();
        this.b.add(Long.valueOf(l));
      }
      paramd.d(j);
    }
  }

  private c f()
  {
    return new c().a(b());
  }

  private void g()
  {
    if ((0x1 & this.a) != 1)
    {
      this.b = new ArrayList(this.b);
      this.a = (0x1 | this.a);
    }
  }

  public final b a()
  {
    b localb = b();
    if (!localb.b())
      throw new m();
    return localb;
  }

  public final c a(b paramb)
  {
    if (paramb == b.a());
    while (b.b(paramb).isEmpty())
      return this;
    if (this.b.isEmpty())
    {
      this.b = b.b(paramb);
      this.a = (0xFFFFFFFE & this.a);
      return this;
    }
    g();
    this.b.addAll(b.b(paramb));
    return this;
  }

  public final c a(Iterable<? extends Long> paramIterable)
  {
    g();
    i.a(paramIterable, this.b);
    return this;
  }

  public final b b()
  {
    b localb = new b(this, (byte)0);
    if ((0x1 & this.a) == 1)
    {
      this.b = Collections.unmodifiableList(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    b.a(localb, this.b);
    return localb;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */