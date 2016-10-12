package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;
import com.google.gson.jpush.internal.ae;
import com.google.gson.jpush.k;
import java.lang.reflect.Type;
import java.util.Collection;

final class d<E> extends al<Collection<E>>
{
  private final al<E> a;
  private final ae<? extends Collection<E>> b;

  public d(k paramk, Type paramType, al<E> paramal, ae<? extends Collection<E>> paramae)
  {
    this.a = new y(paramk, paramal, paramType);
    this.b = paramae;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */