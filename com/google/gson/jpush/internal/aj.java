package com.google.gson.jpush.internal;

import java.lang.reflect.Method;

final class aj extends UnsafeAllocator
{
  aj(Method paramMethod, Object paramObject)
  {
  }

  public final <T> T newInstance(Class<T> paramClass)
  {
    return this.a.invoke(this.b, new Object[] { paramClass });
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */