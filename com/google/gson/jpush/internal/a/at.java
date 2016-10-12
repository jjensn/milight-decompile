package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.k;

final class at
  implements am
{
  at()
  {
  }

  public final <T> al<T> a(k paramk, a<T> parama)
  {
    Class localClass = parama.a();
    if ((!Enum.class.isAssignableFrom(localClass)) || (localClass == Enum.class))
      return null;
    if (!localClass.isEnum())
      localClass = localClass.getSuperclass();
    return new bg(localClass);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.at
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */