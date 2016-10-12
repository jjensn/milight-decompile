package com.google.gson.jpush.internal;

import com.google.gson.jpush.x;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

final class n
  implements ae<T>
{
  private static final String z;

  static
  {
    Object localObject1 = "YjYWjy`\017shei|Sr0pVFc*$".toCharArray();
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
        i1 = 6;
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
      i1 = 16;
      continue;
      i1 = 4;
      continue;
      i1 = 47;
      continue;
      i1 = 54;
    }
  }

  n(f paramf, Type paramType)
  {
  }

  public final T a()
  {
    if ((this.a instanceof ParameterizedType))
    {
      Type localType = ((ParameterizedType)this.a).getActualTypeArguments()[0];
      if ((localType instanceof Class))
        return EnumSet.noneOf((Class)localType);
      throw new x(z + this.a.toString());
    }
    throw new x(z + this.a.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */