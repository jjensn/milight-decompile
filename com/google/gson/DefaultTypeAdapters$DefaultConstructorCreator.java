package com.google.gson;

import com.google.gson.internal..Gson.Types;
import java.lang.reflect.Type;

final class DefaultTypeAdapters$DefaultConstructorCreator<T>
  implements InstanceCreator<T>
{
  private final DefaultConstructorAllocator allocator;
  private final Class<? extends T> defaultInstance;

  public DefaultTypeAdapters$DefaultConstructorCreator(Class<? extends T> paramClass, DefaultConstructorAllocator paramDefaultConstructorAllocator)
  {
    this.defaultInstance = paramClass;
    this.allocator = paramDefaultConstructorAllocator;
  }

  public T createInstance(Type paramType)
  {
    Class localClass = .Gson.Types.getRawType(paramType);
    try
    {
      Object localObject1 = this.allocator.newInstance(localClass);
      if (localObject1 == null)
      {
        Object localObject2 = this.allocator.newInstance(this.defaultInstance);
        localObject1 = localObject2;
      }
      return localObject1;
    }
    catch (Exception localException)
    {
      throw new JsonIOException(localException);
    }
  }

  public String toString()
  {
    return DefaultConstructorCreator.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.DefaultConstructorCreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */