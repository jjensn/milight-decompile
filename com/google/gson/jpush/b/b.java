package com.google.gson.jpush.b;

import com.google.gson.jpush.internal.a.h;
import com.google.gson.jpush.internal.u;

final class b extends u
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "tOz\0378\006un\037";
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
          i3 = 63;
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
        str1 = "\021\027kn\\ \n+^t\001zfZt\rn\037#\016h+";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "t\ftgJ9\001;";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "t\037zWt";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 84;
        break label96;
        i3 = 111;
        break label96;
        i3 = 27;
        break label96;
        i3 = 11;
        break label96;
        m = 0;
      }
    }
  }

  b()
  {
  }

  public final void a(a parama)
  {
    if ((parama instanceof h))
    {
      ((h)parama).o();
      return;
    }
    int i = a.a(parama);
    if (i == 0)
      i = a.b(parama);
    if (i == 13)
    {
      a.a(parama, 9);
      return;
    }
    if (i == 12)
    {
      a.a(parama, 8);
      return;
    }
    if (i == 14)
    {
      a.a(parama, 10);
      return;
    }
    throw new IllegalStateException(z[1] + parama.f() + z[0] + a.c(parama) + z[2] + a.d(parama) + z[3] + parama.q());
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */