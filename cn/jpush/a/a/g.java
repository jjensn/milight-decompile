package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class g extends i<f, g>
{
  private int a;
  private List<Long> b = Collections.emptyList();

  private g()
  {
  }

  private g c(d paramd, com.google.protobuf.jpush.g paramg)
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

  private g f()
  {
    return new g().a(b());
  }

  private void g()
  {
    if ((0x1 & this.a) != 1)
    {
      this.b = new ArrayList(this.b);
      this.a = (0x1 | this.a);
    }
  }

  public final f a()
  {
    f localf = b();
    if (!localf.b())
      throw new m();
    return localf;
  }

  public final g a(f paramf)
  {
    if (paramf == f.a());
    while (f.b(paramf).isEmpty())
      return this;
    if (this.b.isEmpty())
    {
      this.b = f.b(paramf);
      this.a = (0xFFFFFFFE & this.a);
      return this;
    }
    g();
    this.b.addAll(f.b(paramf));
    return this;
  }

  public final g a(Iterable<? extends Long> paramIterable)
  {
    g();
    i.a(paramIterable, this.b);
    return this;
  }

  public final f b()
  {
    f localf = new f(this, (byte)0);
    if ((0x1 & this.a) == 1)
    {
      this.b = Collections.unmodifiableList(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    f.a(localf, this.b);
    return localf;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */