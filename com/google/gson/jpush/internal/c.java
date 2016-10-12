package com.google.gson.jpush.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class c
  implements Serializable, GenericArrayType
{
  private static final String z;
  private final Type a;

  static
  {
    Object localObject1 = "PO".toCharArray();
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
        i1 = 100;
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
      i1 = 11;
      continue;
      i1 = 18;
      continue;
      i1 = 113;
      continue;
      i1 = 123;
    }
  }

  public c(Type paramType)
  {
    this.a = b.a(paramType);
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof GenericArrayType)) && (b.a(this, (GenericArrayType)paramObject));
  }

  public final Type getGenericComponentType()
  {
    return this.a;
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final String toString()
  {
    return b.c(this.a) + z;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */