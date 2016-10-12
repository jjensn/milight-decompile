package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class $Gson$Types$ParameterizedTypeImpl
  implements ParameterizedType, Serializable
{
  private static final long serialVersionUID;
  private final Type ownerType;
  private final Type rawType;
  private final Type[] typeArguments;

  public $Gson$Types$ParameterizedTypeImpl(Type paramType1, Type paramType2, Type[] paramArrayOfType)
  {
    boolean bool1;
    if ((paramType2 instanceof Class))
    {
      Class localClass1 = (Class)paramType2;
      if ((paramType1 != null) || (localClass1.getEnclosingClass() == null))
      {
        bool1 = true;
        .Gson.Preconditions.checkArgument(bool1);
        boolean bool2;
        if (paramType1 != null)
        {
          Class localClass2 = localClass1.getEnclosingClass();
          bool2 = false;
          if (localClass2 == null);
        }
        else
        {
          bool2 = true;
        }
        .Gson.Preconditions.checkArgument(bool2);
      }
    }
    else
    {
      if (paramType1 != null)
        break label159;
    }
    label159: for (Type localType = null; ; localType = .Gson.Types.canonicalize(paramType1))
    {
      this.ownerType = localType;
      this.rawType = .Gson.Types.canonicalize(paramType2);
      this.typeArguments = ((Type[])paramArrayOfType.clone());
      for (int i = 0; i < this.typeArguments.length; i++)
      {
        .Gson.Preconditions.checkNotNull(this.typeArguments[i]);
        .Gson.Types.access$000(this.typeArguments[i]);
        this.typeArguments[i] = .Gson.Types.canonicalize(this.typeArguments[i]);
      }
      bool1 = false;
      break;
    }
  }

  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof Serializable)) && (.Gson.Types.equals(this, (Serializable)paramObject));
  }

  public Type[] getActualTypeArguments()
  {
    return (Type[])this.typeArguments.clone();
  }

  public Type getOwnerType()
  {
    return this.ownerType;
  }

  public Type getRawType()
  {
    return this.rawType;
  }

  public int hashCode()
  {
    return Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode() ^ .Gson.Types.access$100(this.ownerType);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(30 * (1 + this.typeArguments.length));
    localStringBuilder.append(.Gson.Types.typeToString(this.rawType));
    if (this.typeArguments.length == 0)
      return localStringBuilder.toString();
    localStringBuilder.append("<").append(.Gson.Types.typeToString(this.typeArguments[0]));
    for (int i = 1; i < this.typeArguments.length; i++)
      localStringBuilder.append(", ").append(.Gson.Types.typeToString(this.typeArguments[i]));
    return ">";
  }
}

/* Location:
 * Qualified Name:     com.google.gson.internal..Gson.Types.ParameterizedTypeImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */