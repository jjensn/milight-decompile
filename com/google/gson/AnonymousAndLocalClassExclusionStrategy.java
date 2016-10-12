package com.google.gson;

final class AnonymousAndLocalClassExclusionStrategy
  implements ExclusionStrategy
{
  AnonymousAndLocalClassExclusionStrategy()
  {
  }

  private boolean isAnonymousOrLocal(Class<?> paramClass)
  {
    return (!Enum.class.isAssignableFrom(paramClass)) && ((paramClass.isAnonymousClass()) || (paramClass.isLocalClass()));
  }

  public boolean shouldSkipClass(Class<?> paramClass)
  {
    return isAnonymousOrLocal(paramClass);
  }

  public boolean shouldSkipField(FieldAttributes paramFieldAttributes)
  {
    return isAnonymousOrLocal(paramFieldAttributes.getDeclaredClass());
  }
}

/* Location:
 * Qualified Name:     com.google.gson.AnonymousAndLocalClassExclusionStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */