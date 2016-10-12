package com.google.gson.jpush.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class y extends AbstractSet<Map.Entry<K, V>>
{
  y(w paramw)
  {
  }

  public final void clear()
  {
    this.a.clear();
  }

  public final boolean contains(Object paramObject)
  {
    return ((paramObject instanceof Map.Entry)) && (this.a.a((Map.Entry)paramObject) != null);
  }

  public final Iterator<Map.Entry<K, V>> iterator()
  {
    return new z(this);
  }

  public final boolean remove(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry));
    ad localad;
    do
    {
      return false;
      localad = this.a.a((Map.Entry)paramObject);
    }
    while (localad == null);
    this.a.a(localad, true);
    return true;
  }

  public final int size()
  {
    return this.a.c;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */