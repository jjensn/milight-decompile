package com.google.gson.jpush.internal;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public final class f
{
  private final Map<Type, s<?>> a;

  public f(Map<Type, s<?>> paramMap)
  {
    this.a = paramMap;
  }

  private <T> ae<T> a(Class<? super T> paramClass)
  {
    try
    {
      Constructor localConstructor = paramClass.getDeclaredConstructor(new Class[0]);
      if (!localConstructor.isAccessible())
        localConstructor.setAccessible(true);
      l locall = new l(this, localConstructor);
      return locall;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
    return null;
  }

  public final <T> ae<T> a(a<T> parama)
  {
    Type localType = parama.b();
    Class localClass = parama.a();
    s locals1 = (s)this.a.get(localType);
    Object localObject;
    if (locals1 != null)
      localObject = new g(this, locals1, localType);
    while (true)
    {
      return localObject;
      s locals2 = (s)this.a.get(localClass);
      if (locals2 != null)
        return new k(this, locals2, localType);
      localObject = a(localClass);
      if (localObject == null)
      {
        if (Collection.class.isAssignableFrom(localClass))
          if (SortedSet.class.isAssignableFrom(localClass))
            localObject = new m(this);
        while (localObject == null)
        {
          return new j(this, localClass, localType);
          if (EnumSet.class.isAssignableFrom(localClass))
          {
            localObject = new n(this, localType);
          }
          else if (Set.class.isAssignableFrom(localClass))
          {
            localObject = new o(this);
          }
          else if (Queue.class.isAssignableFrom(localClass))
          {
            localObject = new p(this);
          }
          else
          {
            localObject = new q(this);
            continue;
            if (Map.class.isAssignableFrom(localClass))
            {
              if (SortedMap.class.isAssignableFrom(localClass))
                localObject = new r(this);
              else if (((localType instanceof ParameterizedType)) && (!String.class.isAssignableFrom(a.a(((ParameterizedType)localType).getActualTypeArguments()[0]).a())))
                localObject = new h(this);
              else
                localObject = new i(this);
            }
            else
              localObject = null;
          }
        }
      }
    }
  }

  public final String toString()
  {
    return this.a.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */