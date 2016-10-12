package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;
import com.google.gson.jpush.internal.ae;
import com.google.gson.jpush.k;
import java.lang.reflect.Type;
import java.util.Map;

final class m<K, V> extends al<Map<K, V>>
{
  private static final String[] z;
  private final al<K> b;
  private final al<V> c;
  private final ae<? extends Map<K, V>> d;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "\036=fw.\031)b~g\021-o!g";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 71;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = "\024=zw";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 122;
        break label96;
        i3 = 72;
        break label96;
        i3 = 22;
        break label96;
        i3 = 27;
        break label96;
        m = 0;
      }
    }
  }

  public m(k paramk, Type paramType1, al<K> paramal, Type paramType2, al<V> paramal1, ae<? extends Map<K, V>> paramae)
  {
    this.b = new y(paramType1, paramType2, paramal);
    this.c = new y(paramType1, paramae, paramal1);
    Object localObject;
    this.d = localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */