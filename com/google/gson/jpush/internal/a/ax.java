package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.k;

final class ax
  implements am
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "]zGJb\005~Q\026";
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
          i3 = 18;
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
        str1 = "7z@_}\003bx_k\001~\036";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 113;
        break label96;
        i3 = 27;
        break label96;
        i3 = 35;
        break label96;
        i3 = 43;
        break label96;
        m = 0;
      }
    }
  }

  ax(Class paramClass1, Class paramClass2, al paramal)
  {
  }

  public final <T> al<T> a(k paramk, a<T> parama)
  {
    Class localClass = parama.a();
    if ((localClass == this.a) || (localClass == this.b))
      return this.c;
    return null;
  }

  public final String toString()
  {
    return z[1] + this.a.getName() + "+" + this.b.getName() + z[0] + this.c + "]";
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.ax
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */