package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class $Gson$Types$GenericArrayTypeImpl
  implements GenericArrayType, Serializable
{
  private static final long serialVersionUID;
  private final Type componentType;

  public $Gson$Types$GenericArrayTypeImpl(Type paramType)
  {
    this.componentType = .Gson.Types.canonicalize(paramType);
  }

  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof Serializable)) && (.Gson.Types.equals(this, (Serializable)paramObject));
  }

  public Type getGenericComponentType()
  {
    return this.componentType;
  }

  public int hashCode()
  {
    return this.componentType.hashCode();
  }

  public String toString()
  {
    return .Gson.Types.typeToString(this.componentType) + "[]";
  }
}

/* Location:
 * Qualified Name:     com.google.gson.internal..Gson.Types.GenericArrayTypeImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */