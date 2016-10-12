package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.k;

final class av
  implements am
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "N:7`Cz\"\017`Ux>i";
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
          i3 = 44;
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
        str1 = "$:0u\\|>&)";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 8;
        break label96;
        i3 = 91;
        break label96;
        i3 = 84;
        break label96;
        i3 = 20;
        break label96;
        m = 0;
      }
    }
  }

  av(Class paramClass1, Class paramClass2, al paramal)
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
    return z[0] + this.b.getName() + "+" + this.a.getName() + z[1] + this.c + "]";
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.av
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */