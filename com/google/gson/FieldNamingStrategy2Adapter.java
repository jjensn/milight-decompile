package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;

final class FieldNamingStrategy2Adapter
  implements FieldNamingStrategy2
{
  private final FieldNamingStrategy adaptee;

  FieldNamingStrategy2Adapter(FieldNamingStrategy paramFieldNamingStrategy)
  {
    this.adaptee = ((FieldNamingStrategy).Gson.Preconditions.checkNotNull(paramFieldNamingStrategy));
  }

  public String translateName(FieldAttributes paramFieldAttributes)
  {
    return this.adaptee.translateName(paramFieldAttributes.getFieldObject());
  }
}

/* Location:
 * Qualified Name:     com.google.gson.FieldNamingStrategy2Adapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */