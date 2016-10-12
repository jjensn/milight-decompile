package com.google.gson.jpush.internal;

import java.lang.reflect.Method;

final class al extends UnsafeAllocator
{
  al(Method paramMethod)
  {
  }

  public final <T> T newInstance(Class<T> paramClass)
  {
    return this.a.invoke(null, new Object[] { paramClass, Object.class });
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.al
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */