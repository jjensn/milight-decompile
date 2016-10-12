package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class n extends i<m, n>
{
  private int a;
  private long b;
  private int c;
  private List<Long> d = Collections.emptyList();

  private n()
  {
  }

  private n c(d paramd, g paramg)
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
        g();
        this.d.add(Long.valueOf(paramd.b()));
        break;
      case 26:
      }
      int j = paramd.c(paramd.f());
      while (paramd.g() > 0)
      {
        long l = paramd.b();
        g();
        this.d.add(Long.valueOf(l));
      }
      paramd.d(j);
    }
  }

  private n f()
  {
    return new n().a(b());
  }

  private void g()
  {
    if ((0x4 & this.a) != 4)
    {
      this.d = new ArrayList(this.d);
      this.a = (0x4 | this.a);
    }
  }

  public final m a()
  {
    m localm = b();
    if (!localm.g())
      throw new com.google.protobuf.jpush.m();
    return localm;
  }

  public final n a(int paramInt)
  {
    this.a = (0x2 | this.a);
    this.c = paramInt;
    return this;
  }

  public final n a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final n a(m paramm)
  {
    if (paramm == m.a());
    do
    {
      return this;
      if (paramm.b())
        a(paramm.d());
      if (paramm.e())
        a(paramm.f());
    }
    while (m.b(paramm).isEmpty());
    if (this.d.isEmpty())
    {
      this.d = m.b(paramm);
      this.a = (0xFFFFFFFB & this.a);
      return this;
    }
    g();
    this.d.addAll(m.b(paramm));
    return this;
  }

  public final n a(Iterable<? extends Long> paramIterable)
  {
    g();
    i.a(paramIterable, this.d);
    return this;
  }

  public final m b()
  {
    int i = 1;
    m localm = new m(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      m.a(localm, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      m.a(localm, this.c);
      if ((0x4 & this.a) == 4)
      {
        this.d = Collections.unmodifiableList(this.d);
        this.a = (0xFFFFFFFB & this.a);
      }
      m.a(localm, this.d);
      m.b(localm, i);
      return localm;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */