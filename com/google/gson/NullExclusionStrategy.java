package com.google.gson;

final class NullExclusionStrategy
  implements ExclusionStrategy
{
  NullExclusionStrategy()
  {
  }

  public boolean shouldSkipClass(Class<?> paramClass)
  {
    return false;
  }

  public boolean shouldSkipField(FieldAttributes paramFieldAttributes)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.NullExclusionStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */