package com.google.gson;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.internal..Gson.Preconditions;

final class VersionExclusionStrategy
  implements ExclusionStrategy
{
  private final double version;

  VersionExclusionStrategy(double paramDouble)
  {
    if (paramDouble >= 0.0D);
    for (boolean bool = true; ; bool = false)
    {
      .Gson.Preconditions.checkArgument(bool);
      this.version = paramDouble;
      return;
    }
  }

  private boolean isValidSince(Since paramSince)
  {
    return (paramSince == null) || (paramSince.value() <= this.version);
  }

  private boolean isValidUntil(Until paramUntil)
  {
    return (paramUntil == null) || (paramUntil.value() > this.version);
  }

  private boolean isValidVersion(Since paramSince, Until paramUntil)
  {
    return (isValidSince(paramSince)) && (isValidUntil(paramUntil));
  }

  public boolean shouldSkipClass(Class<?> paramClass)
  {
    return !isValidVersion((Since)paramClass.getAnnotation(Since.class), (Until)paramClass.getAnnotation(Until.class));
  }

  public boolean shouldSkipField(FieldAttributes paramFieldAttributes)
  {
    return !isValidVersion((Since)paramFieldAttributes.getAnnotation(Since.class), (Until)paramFieldAttributes.getAnnotation(Until.class));
  }
}

/* Location:
 * Qualified Name:     com.google.gson.VersionExclusionStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */