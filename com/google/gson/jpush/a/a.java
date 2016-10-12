package com.google.gson.jpush.a;

import com.google.gson.jpush.internal.b;
import java.lang.reflect.Type;

public final class a<T>
{
  private static final String z;
  final Class<? super T> a;
  final Type b;
  final int c;

  static
  {
    Object localObject1 = "XB zS{Ls}CeNsy[gJ>lNpY}".toCharArray();
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
        i1 = 58;
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
      i1 = 21;
      continue;
      i1 = 43;
      continue;
      i1 = 83;
      continue;
      i1 = 9;
    }
  }

  protected a()
  {
    Type localType = getClass().getGenericSuperclass();
    if ((localType instanceof Class))
      throw new RuntimeException(z);
    this.b = b.a(((java.lang.reflect.ParameterizedType)localType).getActualTypeArguments()[0]);
    this.a = b.b(this.b);
    this.c = this.b.hashCode();
  }

  private a(Type paramType)
  {
    this.b = b.a((Type)com.google.gson.jpush.internal.a.a(paramType));
    this.a = b.b(this.b);
    this.c = this.b.hashCode();
  }

  public static <T> a<T> a(Class<T> paramClass)
  {
    return new a(paramClass);
  }

  public static a<?> a(Type paramType)
  {
    return new a(paramType);
  }

  public final Class<? super T> a()
  {
    return this.a;
  }

  public final Type b()
  {
    return this.b;
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof a)) && (b.a(this.b, ((a)paramObject).b));
  }

  public final int hashCode()
  {
    return this.c;
  }

  public final String toString()
  {
    return b.c(this.b);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */