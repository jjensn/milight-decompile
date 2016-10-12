package com.google.gson.jpush.internal;

import java.util.Map.Entry;

final class ad<K, V>
  implements Map.Entry<K, V>
{
  ad<K, V> a;
  ad<K, V> b;
  ad<K, V> c;
  ad<K, V> d;
  ad<K, V> e;
  final K f;
  V g;
  int h;

  ad()
  {
    this.f = null;
    this.e = this;
    this.d = this;
  }

  ad(ad<K, V> paramad1, K paramK, ad<K, V> paramad2, ad<K, V> paramad3)
  {
    this.a = paramad1;
    this.f = paramK;
    this.h = 1;
    this.d = paramad2;
    this.e = paramad3;
    paramad3.d = this;
    paramad2.e = this;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    Map.Entry localEntry;
    if (bool1)
    {
      localEntry = (Map.Entry)paramObject;
      if (this.f != null)
        break label67;
      Object localObject2 = localEntry.getKey();
      bool2 = false;
      if (localObject2 == null)
      {
        if (this.g != null)
          break label93;
        Object localObject1 = localEntry.getValue();
        bool2 = false;
        if (localObject1 != null);
      }
    }
    while (true)
    {
      bool2 = true;
      label67: label93: boolean bool4;
      do
      {
        boolean bool3;
        do
        {
          return bool2;
          bool3 = this.f.equals(localEntry.getKey());
          bool2 = false;
        }
        while (!bool3);
        break;
        bool4 = this.g.equals(localEntry.getValue());
        bool2 = false;
      }
      while (!bool4);
    }
  }

  public final K getKey()
  {
    return this.f;
  }

  public final V getValue()
  {
    return this.g;
  }

  public final int hashCode()
  {
    int i;
    int j;
    if (this.f == null)
    {
      i = 0;
      Object localObject = this.g;
      j = 0;
      if (localObject != null)
        break label35;
    }
    while (true)
    {
      return i ^ j;
      i = this.f.hashCode();
      break;
      label35: j = this.g.hashCode();
    }
  }

  public final V setValue(V paramV)
  {
    Object localObject = this.g;
    this.g = paramV;
    return localObject;
  }

  public final String toString()
  {
    return this.f + "=" + this.g;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */