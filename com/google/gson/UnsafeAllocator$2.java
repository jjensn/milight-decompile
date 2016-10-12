package com.google.gson;

import java.lang.reflect.Method;

final class UnsafeAllocator$2 extends UnsafeAllocator
{
  UnsafeAllocator$2(Method paramMethod)
  {
  }

  public <T> T newInstance(Class<T> paramClass)
    throws Exception
  {
    return this.val$newInstance.invoke(null, new Object[] { paramClass, Object.class });
  }
}

/* Location:
 * Qualified Name:     com.google.gson.UnsafeAllocator.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */