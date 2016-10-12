package com.google.gson.jpush.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class af
{
  private static final Map<Class<?>, Class<?>> a = Collections.unmodifiableMap(localHashMap1);
  private static final Map<Class<?>, Class<?>> b = Collections.unmodifiableMap(localHashMap2);

  static
  {
    HashMap localHashMap1 = new HashMap(16);
    HashMap localHashMap2 = new HashMap(16);
    a(localHashMap1, localHashMap2, Boolean.TYPE, Boolean.class);
    a(localHashMap1, localHashMap2, Byte.TYPE, Byte.class);
    a(localHashMap1, localHashMap2, Character.TYPE, Character.class);
    a(localHashMap1, localHashMap2, Double.TYPE, Double.class);
    a(localHashMap1, localHashMap2, Float.TYPE, Float.class);
    a(localHashMap1, localHashMap2, Integer.TYPE, Integer.class);
    a(localHashMap1, localHashMap2, Long.TYPE, Long.class);
    a(localHashMap1, localHashMap2, Short.TYPE, Short.class);
    a(localHashMap1, localHashMap2, Void.TYPE, Void.class);
  }

  public static <T> Class<T> a(Class<T> paramClass)
  {
    Class localClass = (Class)a.get(a.a(paramClass));
    if (localClass == null)
      return paramClass;
    return localClass;
  }

  private static void a(Map<Class<?>, Class<?>> paramMap1, Map<Class<?>, Class<?>> paramMap2, Class<?> paramClass1, Class<?> paramClass2)
  {
    paramMap1.put(paramClass1, paramClass2);
    paramMap2.put(paramClass2, paramClass1);
  }

  public static boolean a(Type paramType)
  {
    return a.containsKey(paramType);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */