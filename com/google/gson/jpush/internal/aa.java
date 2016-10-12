package com.google.gson.jpush.internal;

import java.util.AbstractSet;
import java.util.Iterator;

final class aa extends AbstractSet<K>
{
  aa(w paramw)
  {
  }

  public final void clear()
  {
    this.a.clear();
  }

  public final boolean contains(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }

  public final Iterator<K> iterator()
  {
    return new ab(this);
  }

  public final boolean remove(Object paramObject)
  {
    return this.a.a(paramObject) != null;
  }

  public final int size()
  {
    return this.a.c;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */