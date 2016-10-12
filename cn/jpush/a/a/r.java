package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class r extends i<q, r>
{
  private int a;
  private long b;
  private int c;
  private List<Long> d = Collections.emptyList();

  private r()
  {
  }

  private r c(d paramd, g paramg)
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

  private r f()
  {
    return new r().a(b());
  }

  private void g()
  {
    if ((0x4 & this.a) != 4)
    {
      this.d = new ArrayList(this.d);
      this.a = (0x4 | this.a);
    }
  }

  public final q a()
  {
    q localq = b();
    if (!localq.g())
      throw new m();
    return localq;
  }

  public final r a(int paramInt)
  {
    this.a = (0x2 | this.a);
    this.c = paramInt;
    return this;
  }

  public final r a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final r a(q paramq)
  {
    if (paramq == q.a());
    do
    {
      return this;
      if (paramq.b())
        a(paramq.d());
      if (paramq.e())
        a(paramq.f());
    }
    while (q.b(paramq).isEmpty());
    if (this.d.isEmpty())
    {
      this.d = q.b(paramq);
      this.a = (0xFFFFFFFB & this.a);
      return this;
    }
    g();
    this.d.addAll(q.b(paramq));
    return this;
  }

  public final r a(Iterable<? extends Long> paramIterable)
  {
    g();
    i.a(paramIterable, this.d);
    return this;
  }

  public final q b()
  {
    int i = 1;
    q localq = new q(this, (byte)0);
    int j = this.a;
    if ((j & 0x1) == i);
    while (true)
    {
      q.a(localq, this.b);
      if ((j & 0x2) == 2)
        i |= 2;
      q.a(localq, this.c);
      if ((0x4 & this.a) == 4)
      {
        this.d = Collections.unmodifiableList(this.d);
        this.a = (0xFFFFFFFB & this.a);
      }
      q.a(localq, this.d);
      q.b(localq, i);
      return localq;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */