package com.google.gson;

import com.google.gson.internal..Gson.Types;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

final class ParameterizedTypeHandlerMap<T>
{
  private static final Logger logger = Logger.getLogger(ParameterizedTypeHandlerMap.class.getName());
  private final Map<Type, T> map = new HashMap();
  private boolean modifiable = true;
  private final List<Pair<Class<?>, T>> typeHierarchyList = new ArrayList();

  ParameterizedTypeHandlerMap()
  {
  }

  private T getHandlerForTypeHierarchy(Class<?> paramClass)
  {
    Iterator localIterator = this.typeHierarchyList.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      if (((Class)localPair.first).isAssignableFrom(paramClass))
        return localPair.second;
    }
    return null;
  }

  private int getIndexOfAnOverriddenHandler(Class<?> paramClass)
  {
    for (int i = -1 + this.typeHierarchyList.size(); i >= 0; i--)
      if (paramClass.isAssignableFrom((Class)((Pair)this.typeHierarchyList.get(i)).first))
        return i;
    return -1;
  }

  private int getIndexOfSpecificHandlerForTypeHierarchy(Class<?> paramClass)
  {
    try
    {
      int i = -1 + this.typeHierarchyList.size();
      if (i >= 0)
      {
        boolean bool = paramClass.equals(((Pair)this.typeHierarchyList.get(i)).first);
        if (!bool);
      }
      while (true)
      {
        return i;
        i--;
        break;
        i = -1;
      }
    }
    finally
    {
    }
  }

  private String typeToString(Type paramType)
  {
    return .Gson.Types.getRawType(paramType).getSimpleName();
  }

  public ParameterizedTypeHandlerMap<T> copyOf()
  {
    try
    {
      ParameterizedTypeHandlerMap localParameterizedTypeHandlerMap = new ParameterizedTypeHandlerMap();
      localParameterizedTypeHandlerMap.map.putAll(this.map);
      localParameterizedTypeHandlerMap.typeHierarchyList.addAll(this.typeHierarchyList);
      return localParameterizedTypeHandlerMap;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public T getHandlerFor(Type paramType)
  {
    try
    {
      Object localObject2 = this.map.get(paramType);
      if (localObject2 == null)
      {
        Class localClass = .Gson.Types.getRawType(paramType);
        if (localClass != paramType)
          localObject2 = getHandlerFor(localClass);
        if (localObject2 == null)
        {
          Object localObject3 = getHandlerForTypeHierarchy(localClass);
          localObject2 = localObject3;
        }
      }
      return localObject2;
    }
    finally
    {
    }
  }

  public boolean hasSpecificHandlerFor(Type paramType)
  {
    try
    {
      boolean bool = this.map.containsKey(paramType);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void makeUnmodifiable()
  {
    try
    {
      this.modifiable = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void register(ParameterizedTypeHandlerMap<T> paramParameterizedTypeHandlerMap)
  {
    try
    {
      if (!this.modifiable)
        throw new IllegalStateException("Attempted to modify an unmodifiable map.");
    }
    finally
    {
    }
    Iterator localIterator = paramParameterizedTypeHandlerMap.map.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      register((Type)localEntry.getKey(), localEntry.getValue());
    }
    for (int i = -1 + paramParameterizedTypeHandlerMap.typeHierarchyList.size(); i >= 0; i--)
      registerForTypeHierarchy((Pair)paramParameterizedTypeHandlerMap.typeHierarchyList.get(i));
  }

  public void register(Type paramType, T paramT)
  {
    try
    {
      if (!this.modifiable)
        throw new IllegalStateException("Attempted to modify an unmodifiable map.");
    }
    finally
    {
    }
    if (hasSpecificHandlerFor(paramType))
      logger.log(Level.WARNING, "Overriding the existing type handler for {0}", paramType);
    this.map.put(paramType, paramT);
  }

  public void registerForTypeHierarchy(Pair<Class<?>, T> paramPair)
  {
    try
    {
      if (!this.modifiable)
        throw new IllegalStateException("Attempted to modify an unmodifiable map.");
    }
    finally
    {
    }
    int i = getIndexOfSpecificHandlerForTypeHierarchy((Class)paramPair.first);
    if (i >= 0)
    {
      logger.log(Level.WARNING, "Overriding the existing type handler for {0}", paramPair.first);
      this.typeHierarchyList.remove(i);
    }
    int j = getIndexOfAnOverriddenHandler((Class)paramPair.first);
    if (j >= 0)
      throw new IllegalArgumentException("The specified type handler for type " + paramPair.first + " hides the previously registered type hierarchy handler for " + ((Pair)this.typeHierarchyList.get(j)).first + ". Gson does not allow this.");
    this.typeHierarchyList.add(0, paramPair);
  }

  public void registerForTypeHierarchy(Class<?> paramClass, T paramT)
  {
    try
    {
      registerForTypeHierarchy(new Pair(paramClass, paramT));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void registerIfAbsent(ParameterizedTypeHandlerMap<T> paramParameterizedTypeHandlerMap)
  {
    try
    {
      if (!this.modifiable)
        throw new IllegalStateException("Attempted to modify an unmodifiable map.");
    }
    finally
    {
    }
    Iterator localIterator = paramParameterizedTypeHandlerMap.map.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (!this.map.containsKey(localEntry.getKey()))
        register((Type)localEntry.getKey(), localEntry.getValue());
    }
    for (int i = -1 + paramParameterizedTypeHandlerMap.typeHierarchyList.size(); i >= 0; i--)
    {
      Pair localPair = (Pair)paramParameterizedTypeHandlerMap.typeHierarchyList.get(i);
      if (getIndexOfSpecificHandlerForTypeHierarchy((Class)localPair.first) < 0)
        registerForTypeHierarchy(localPair);
    }
  }

  public void registerIfAbsent(Type paramType, T paramT)
  {
    try
    {
      if (!this.modifiable)
        throw new IllegalStateException("Attempted to modify an unmodifiable map.");
    }
    finally
    {
    }
    if (!this.map.containsKey(paramType))
      register(paramType, paramT);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{mapForTypeHierarchy:{");
    int i = 1;
    Iterator localIterator1 = this.typeHierarchyList.iterator();
    if (localIterator1.hasNext())
    {
      Pair localPair = (Pair)localIterator1.next();
      if (i != 0)
        i = 0;
      while (true)
      {
        localStringBuilder.append(typeToString((Type)localPair.first)).append((char)':');
        localStringBuilder.append(localPair.second);
        break;
        localStringBuilder.append((char)',');
      }
    }
    localStringBuilder.append("},map:{");
    int j = 1;
    Iterator localIterator2 = this.map.entrySet().iterator();
    if (localIterator2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator2.next();
      if (j != 0)
        j = 0;
      while (true)
      {
        localStringBuilder.append(typeToString((Type)localEntry.getKey())).append((char)':');
        localStringBuilder.append(localEntry.getValue());
        break;
        localStringBuilder.append((char)',');
      }
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.ParameterizedTypeHandlerMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */