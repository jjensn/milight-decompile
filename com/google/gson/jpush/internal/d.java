package com.google.gson.jpush.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class d
  implements Serializable, ParameterizedType
{
  private static final String z;
  private final Type a;
  private final Type b;
  private final Type[] c;

  static
  {
    Object localObject1 = "^\003".toCharArray();
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    int k;
    int m;
    Object localObject3;
    label27: int n;
    int i1;
    if (i <= 1)
    {
      localObject2 = localObject1;
      k = j;
      m = i;
      localObject3 = localObject1;
      n = localObject3[j];
      switch (k % 5)
      {
      default:
        i1 = 34;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject3[j] = (char)(i1 ^ n);
      j = k + 1;
      if (m == 0)
      {
        localObject3 = localObject2;
        k = j;
        j = m;
        break label27;
      }
      i = m;
      localObject1 = localObject2;
      if (i > j)
        break;
      z = new String((char[])localObject1).intern();
      return;
      i1 = 114;
      continue;
      i1 = 35;
      continue;
      i1 = 37;
      continue;
      i1 = 77;
    }
  }

  public d(Type paramType1, Type paramType2, Type[] paramArrayOfType)
  {
    int j;
    boolean bool;
    if ((paramType2 instanceof Class))
    {
      Class localClass = (Class)paramType2;
      if ((Modifier.isStatic(localClass.getModifiers())) || (localClass.getEnclosingClass() == null))
      {
        j = 1;
        if ((paramType1 == null) && (j == 0))
          break label151;
        bool = true;
        label54: a.a(bool);
      }
    }
    else
    {
      if (paramType1 != null)
        break label157;
    }
    label151: label157: for (Type localType = null; ; localType = b.a(paramType1))
    {
      this.a = localType;
      this.b = b.a(paramType2);
      this.c = ((Type[])paramArrayOfType.clone());
      while (i < this.c.length)
      {
        a.a(this.c[i]);
        b.e(this.c[i]);
        this.c[i] = b.a(this.c[i]);
        i++;
      }
      j = 0;
      break;
      bool = false;
      break label54;
    }
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ParameterizedType)) && (b.a(this, (ParameterizedType)paramObject));
  }

  public final Type[] getActualTypeArguments()
  {
    return (Type[])this.c.clone();
  }

  public final Type getOwnerType()
  {
    return this.a;
  }

  public final Type getRawType()
  {
    return this.b;
  }

  public final int hashCode()
  {
    return Arrays.hashCode(this.c) ^ this.b.hashCode() ^ b.a(this.a);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(30 * (1 + this.c.length));
    localStringBuilder.append(b.c(this.b));
    if (this.c.length == 0)
      return localStringBuilder.toString();
    localStringBuilder.append("<").append(b.c(this.c[0]));
    for (int i = 1; i < this.c.length; i++)
      localStringBuilder.append(z).append(b.c(this.c[i]));
    return ">";
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */