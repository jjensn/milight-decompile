package com.google.gson.jpush;

import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.d;

final class q<T> extends al<T>
{
  private al<T> a;

  q()
  {
  }

  public final T a(a parama)
  {
    if (this.a == null)
      throw new IllegalStateException();
    return this.a.a(parama);
  }

  public final void a(al<T> paramal)
  {
    if (this.a != null)
      throw new AssertionError();
    this.a = paramal;
  }

  public final void a(d paramd, T paramT)
  {
    if (this.a == null)
      throw new IllegalStateException();
    this.a.a(paramd, paramT);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */