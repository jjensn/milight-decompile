package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.internal.b;
import com.google.gson.jpush.internal.f;
import com.google.gson.jpush.k;
import java.lang.reflect.Type;
import java.util.Collection;

public final class c
  implements am
{
  private final f a;

  public c(f paramf)
  {
    this.a = paramf;
  }

  public final <T> al<T> a(k paramk, a<T> parama)
  {
    Type localType1 = parama.b();
    Class localClass = parama.a();
    if (!Collection.class.isAssignableFrom(localClass))
      return null;
    Type localType2 = b.a(localType1, localClass);
    return new d(paramk, localType2, paramk.a(a.a(localType2)), this.a.a(parama));
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */