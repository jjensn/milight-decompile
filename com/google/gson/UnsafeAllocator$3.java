package com.google.gson;

import java.lang.reflect.Method;

final class UnsafeAllocator$3 extends UnsafeAllocator
{
  UnsafeAllocator$3(Method paramMethod, int paramInt)
  {
  }

  public <T> T newInstance(Class<T> paramClass)
    throws Exception
  {
    Method localMethod = this.val$newInstance;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramClass;
    arrayOfObject[1] = Integer.valueOf(this.val$constructorId);
    return localMethod.invoke(null, arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.UnsafeAllocator.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */