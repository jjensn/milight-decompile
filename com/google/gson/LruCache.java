package com.google.gson;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class LruCache<K, V> extends LinkedHashMap<K, V>
  implements Cache<K, V>
{
  private static final long serialVersionUID = 1L;
  private final int maxCapacity;

  public LruCache(int paramInt)
  {
    super(paramInt, 0.7F, true);
    this.maxCapacity = paramInt;
  }

  public void addElement(K paramK, V paramV)
  {
    try
    {
      put(paramK, paramV);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public V getElement(K paramK)
  {
    try
    {
      Object localObject2 = get(paramK);
      return localObject2;
    }
    finally
    {
      localObject1 = finally;
      throw localObject1;
    }
  }

  protected boolean removeEldestEntry(Map.Entry<K, V> paramEntry)
  {
    return size() > this.maxCapacity;
  }

  public V removeElement(K paramK)
  {
    try
    {
      Object localObject2 = remove(paramK);
      return localObject2;
    }
    finally
    {
      localObject1 = finally;
      throw localObject1;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.LruCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */