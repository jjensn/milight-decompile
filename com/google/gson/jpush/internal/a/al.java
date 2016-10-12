package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.af;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;
import java.util.BitSet;

final class al extends com.google.gson.jpush.al<BitSet>
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "p-AL2P'\027O7M0RY~O\"[X;\0317N];\003c";
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
          i3 = 94;
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
        str1 = "|1EB,\003crU.\\ CD0^y\027O7M0RY~W6ZO;KcAL2L&\027\005o\025c\007\004r\031\005XX0]y\027";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 57;
        break label96;
        i3 = 67;
        break label96;
        i3 = 55;
        break label96;
        i3 = 45;
        break label96;
        m = 0;
      }
    }
  }

  al()
  {
  }

  private static BitSet b(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    BitSet localBitSet = new BitSet();
    parama.a();
    c localc = parama.f();
    int i = 0;
    boolean bool;
    String str;
    if (localc != c.b)
    {
      switch (az.a[localc.ordinal()])
      {
      default:
        throw new af(z[0] + localc);
      case 1:
        if (parama.m() != 0)
          bool = true;
      case 2:
      case 3:
      }
      while (true)
      {
        if (bool)
          localBitSet.set(i);
        i++;
        localc = parama.f();
        break;
        bool = false;
        continue;
        bool = parama.i();
        continue;
        str = parama.h();
        try
        {
          int j = Integer.parseInt(str);
          if (j != 0)
            bool = true;
          else
            bool = false;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          throw new af(z[1] + str);
        }
      }
    }
    parama.b();
    return localBitSet;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.al
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */