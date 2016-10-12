package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;

final class ac extends al<Number>
{
  private static final String z;

  static
  {
    Object localObject1 = "8\002trs\t\023jp0\023\017iuu\017V$p\t@$".toCharArray();
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
        i1 = 16;
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
      i1 = 125;
      continue;
      i1 = 122;
      continue;
      i1 = 4;
      continue;
      i1 = 23;
    }
  }

  ac()
  {
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */