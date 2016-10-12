package com.google.gson.jpush.internal;

import com.google.gson.jpush.al;
import com.google.gson.jpush.b.d;
import com.google.gson.jpush.k;

final class t extends al<T>
{
  private al<T> f;

  t(s params, boolean paramBoolean1, boolean paramBoolean2, k paramk, com.google.gson.jpush.a.a parama)
  {
  }

  private al<T> a()
  {
    al localal1 = this.f;
    if (localal1 != null)
      return localal1;
    al localal2 = this.c.a(this.e, this.d);
    this.f = localal2;
    return localal2;
  }

  public final T a(com.google.gson.jpush.b.a parama)
  {
    if (this.a)
    {
      parama.n();
      return null;
    }
    return a().a(parama);
  }

  public final void a(d paramd, T paramT)
  {
    if (this.b)
    {
      paramd.f();
      return;
    }
    a().a(paramd, paramT);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */