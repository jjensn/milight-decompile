package com.google.gson;

import com.google.gson.annotations.SerializedName;

final class SerializedNameAnnotationInterceptingNamingPolicy
  implements FieldNamingStrategy2
{
  private final FieldNamingStrategy2 delegate;

  SerializedNameAnnotationInterceptingNamingPolicy(FieldNamingStrategy2 paramFieldNamingStrategy2)
  {
    this.delegate = paramFieldNamingStrategy2;
  }

  public String translateName(FieldAttributes paramFieldAttributes)
  {
    SerializedName localSerializedName = (SerializedName)paramFieldAttributes.getAnnotation(SerializedName.class);
    if (localSerializedName == null)
      return this.delegate.translateName(paramFieldAttributes);
    return localSerializedName.value();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.SerializedNameAnnotationInterceptingNamingPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */