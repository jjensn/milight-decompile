package com.google.gson.jpush.internal;

import java.lang.reflect.Method;

final class ak extends UnsafeAllocator
{
  ak(Method paramMethod, int paramInt)
  {
  }

  public final <T> T newInstance(Class<T> paramClass)
  {
    Method localMethod = this.a;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramClass;
    arrayOfObject[1] = Integer.valueOf(this.b);
    return localMethod.invoke(null, arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */