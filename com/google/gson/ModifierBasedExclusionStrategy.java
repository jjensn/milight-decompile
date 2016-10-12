package com.google.gson;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

final class ModifierBasedExclusionStrategy
  implements ExclusionStrategy
{
  private final Collection<Integer> modifiers = new HashSet();

  public ModifierBasedExclusionStrategy(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null)
    {
      int i = paramArrayOfInt.length;
      for (int j = 0; j < i; j++)
      {
        int k = paramArrayOfInt[j];
        this.modifiers.add(Integer.valueOf(k));
      }
    }
  }

  public boolean shouldSkipClass(Class<?> paramClass)
  {
    return false;
  }

  public boolean shouldSkipField(FieldAttributes paramFieldAttributes)
  {
    Iterator localIterator = this.modifiers.iterator();
    while (localIterator.hasNext())
      if (paramFieldAttributes.hasModifier(((Integer)localIterator.next()).intValue()))
        return true;
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.ModifierBasedExclusionStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */