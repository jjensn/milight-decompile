package com.google.gson;

import com.google.gson.annotations.Expose;

final class ExposeAnnotationSerializationExclusionStrategy
  implements ExclusionStrategy
{
  ExposeAnnotationSerializationExclusionStrategy()
  {
  }

  public boolean shouldSkipClass(Class<?> paramClass)
  {
    return false;
  }

  public boolean shouldSkipField(FieldAttributes paramFieldAttributes)
  {
    Expose localExpose = (Expose)paramFieldAttributes.getAnnotation(Expose.class);
    if (localExpose == null);
    while (!localExpose.serialize())
      return true;
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.ExposeAnnotationSerializationExclusionStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */