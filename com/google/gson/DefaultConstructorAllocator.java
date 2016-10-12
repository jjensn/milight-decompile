package com.google.gson;

import java.lang.reflect.Constructor;

final class DefaultConstructorAllocator
{
  private static final Constructor<Null> NULL_CONSTRUCTOR = createNullConstructor();
  private final Cache<Class<?>, Constructor<?>> constructorCache;

  public DefaultConstructorAllocator()
  {
    this(200);
  }

  public DefaultConstructorAllocator(int paramInt)
  {
    this.constructorCache = new LruCache(paramInt);
  }

  private static final Constructor<Null> createNullConstructor()
  {
    try
    {
      Constructor localConstructor = getNoArgsConstructor(Null.class);
      return localConstructor;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private <T> Constructor<T> findConstructor(Class<T> paramClass)
  {
    Constructor localConstructor1 = (Constructor)this.constructorCache.getElement(paramClass);
    if (localConstructor1 != null)
    {
      if (localConstructor1 == NULL_CONSTRUCTOR)
        localConstructor1 = null;
      return localConstructor1;
    }
    Constructor localConstructor2 = getNoArgsConstructor(paramClass);
    if (localConstructor2 != null)
      this.constructorCache.addElement(paramClass, localConstructor2);
    while (true)
    {
      return localConstructor2;
      this.constructorCache.addElement(paramClass, NULL_CONSTRUCTOR);
    }
  }

  private static <T> Constructor<T> getNoArgsConstructor(Class<T> paramClass)
  {
    try
    {
      Constructor localConstructor = paramClass.getDeclaredConstructor(new Class[0]);
      localConstructor.setAccessible(true);
      return localConstructor;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  final boolean isInCache(Class<?> paramClass)
  {
    return this.constructorCache.getElement(paramClass) != null;
  }

  public <T> T newInstance(Class<T> paramClass)
    throws Exception
  {
    Constructor localConstructor = findConstructor(paramClass);
    if (localConstructor != null)
      return localConstructor.newInstance(new Object[0]);
    return null;
  }

  private static final class Null
  {
    private Null()
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultConstructorAllocator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */