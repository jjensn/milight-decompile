package com.google.gson;

final class InnerClassExclusionStrategy
  implements ExclusionStrategy
{
  InnerClassExclusionStrategy()
  {
  }

  private boolean isInnerClass(Class<?> paramClass)
  {
    return (paramClass.isMemberClass()) && (!isStatic(paramClass));
  }

  private boolean isStatic(Class<?> paramClass)
  {
    return (0x8 & paramClass.getModifiers()) != 0;
  }

  public boolean shouldSkipClass(Class<?> paramClass)
  {
    return isInnerClass(paramClass);
  }

  public boolean shouldSkipField(FieldAttributes paramFieldAttributes)
  {
    return isInnerClass(paramFieldAttributes.getDeclaredClass());
  }
}

/* Location:
 * Qualified Name:     com.google.gson.InnerClassExclusionStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */