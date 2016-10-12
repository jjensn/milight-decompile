package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.annotations.b;
import com.google.gson.jpush.internal.ae;
import com.google.gson.jpush.internal.f;
import com.google.gson.jpush.k;

public final class g
  implements am
{
  private static final String z;
  private final f a;

  static
  {
    Object localObject1 = "".toCharArray();
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
        i1 = 113;
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
      i1 = 51;
      continue;
      i1 = 122;
      continue;
      i1 = 114;
      continue;
      i1 = 110;
    }
  }

  public g(f paramf)
  {
    this.a = paramf;
  }

  static al<?> a(f paramf, k paramk, a<?> parama, b paramb)
  {
    Class localClass = paramb.a();
    if (al.class.isAssignableFrom(localClass))
      return (al)paramf.a(a.a(localClass)).a();
    if (am.class.isAssignableFrom(localClass))
      return ((am)paramf.a(a.a(localClass)).a()).a(paramk, parama);
    throw new IllegalArgumentException(z);
  }

  public final <T> al<T> a(k paramk, a<T> parama)
  {
    b localb = (b)parama.a().getAnnotation(b.class);
    if (localb == null)
      return null;
    return a(this.a, paramk, parama, localb);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */