package com.google.gson;

import java.lang.reflect.Method;

final class UnsafeAllocator$1 extends UnsafeAllocator
{
  UnsafeAllocator$1(Method paramMethod, Object paramObject)
  {
  }

  public <T> T newInstance(Class<T> paramClass)
    throws Exception
  {
    return this.val$allocateInstance.invoke(this.val$unsafe, new Object[] { paramClass });
  }
}

/* Location:
 * Qualified Name:     com.google.gson.UnsafeAllocator.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */