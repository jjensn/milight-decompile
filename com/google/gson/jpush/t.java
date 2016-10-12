package com.google.gson.jpush;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class t extends w
  implements Iterable<w>
{
  private final List<w> a = new ArrayList();

  public t()
  {
  }

  public final int a()
  {
    return this.a.size();
  }

  public final w a(int paramInt)
  {
    return (w)this.a.get(2);
  }

  public final void a(w paramw)
  {
    if (paramw == null)
      paramw = y.a;
    this.a.add(paramw);
  }

  public final Number b()
  {
    if (this.a.size() == 1)
      return ((w)this.a.get(0)).b();
    throw new IllegalStateException();
  }

  public final String c()
  {
    if (this.a.size() == 1)
      return ((w)this.a.get(0)).c();
    throw new IllegalStateException();
  }

  public final double d()
  {
    if (this.a.size() == 1)
      return ((w)this.a.get(0)).d();
    throw new IllegalStateException();
  }

  public final long e()
  {
    if (this.a.size() == 1)
      return ((w)this.a.get(0)).e();
    throw new IllegalStateException();
  }

  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof t)) && (((t)paramObject).a.equals(this.a)));
  }

  public final int f()
  {
    if (this.a.size() == 1)
      return ((w)this.a.get(0)).f();
    throw new IllegalStateException();
  }

  public final boolean g()
  {
    if (this.a.size() == 1)
      return ((w)this.a.get(0)).g();
    throw new IllegalStateException();
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final Iterator<w> iterator()
  {
    return this.a.iterator();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */