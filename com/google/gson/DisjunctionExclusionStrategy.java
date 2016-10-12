package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import java.util.Collection;
import java.util.Iterator;

final class DisjunctionExclusionStrategy
  implements ExclusionStrategy
{
  private final Collection<ExclusionStrategy> strategies;

  DisjunctionExclusionStrategy(Collection<ExclusionStrategy> paramCollection)
  {
    this.strategies = ((Collection).Gson.Preconditions.checkNotNull(paramCollection));
  }

  public boolean shouldSkipClass(Class<?> paramClass)
  {
    Iterator localIterator = this.strategies.iterator();
    while (localIterator.hasNext())
      if (((ExclusionStrategy)localIterator.next()).shouldSkipClass(paramClass))
        return true;
    return false;
  }

  public boolean shouldSkipField(FieldAttributes paramFieldAttributes)
  {
    Iterator localIterator = this.strategies.iterator();
    while (localIterator.hasNext())
      if (((ExclusionStrategy)localIterator.next()).shouldSkipField(paramFieldAttributes))
        return true;
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DisjunctionExclusionStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */