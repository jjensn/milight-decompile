package com.google.gson.jpush.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class e
  implements Serializable, WildcardType
{
  private static final String[] z;
  private final Type a;
  private final Type b;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "9#d|3cmewg";
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
        str1 = "9#rq7cq!";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 6;
        break label96;
        i3 = 3;
        break label96;
        i3 = 1;
        break label96;
        i3 = 4;
        break label96;
        m = 0;
      }
    }
  }

  public e(Type[] paramArrayOfType1, Type[] paramArrayOfType2)
  {
    if (paramArrayOfType2.length <= i)
    {
      int k = i;
      a.a(k);
      if (paramArrayOfType1.length != i)
        break label88;
      int n = i;
      label29: a.a(n);
      if (paramArrayOfType2.length != i)
        break label99;
      a.a(paramArrayOfType2[0]);
      b.e(paramArrayOfType2[0]);
      if (paramArrayOfType1[0] != Object.class)
        break label94;
    }
    while (true)
    {
      a.a(i);
      this.b = b.a(paramArrayOfType2[0]);
      this.a = Object.class;
      return;
      int m = 0;
      break;
      label88: int i1 = 0;
      break label29;
      label94: int j = 0;
    }
    label99: a.a(paramArrayOfType1[0]);
    b.e(paramArrayOfType1[0]);
    this.b = null;
    this.a = b.a(paramArrayOfType1[0]);
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof WildcardType)) && (b.a(this, (WildcardType)paramObject));
  }

  public final Type[] getLowerBounds()
  {
    if (this.b != null)
    {
      Type[] arrayOfType = new Type[1];
      arrayOfType[0] = this.b;
      return arrayOfType;
    }
    return b.a;
  }

  public final Type[] getUpperBounds()
  {
    Type[] arrayOfType = new Type[1];
    arrayOfType[0] = this.a;
    return arrayOfType;
  }

  public final int hashCode()
  {
    if (this.b != null);
    for (int i = 31 + this.b.hashCode(); ; i = 1)
      return i ^ 31 + this.a.hashCode();
  }

  public final String toString()
  {
    if (this.b != null)
      return z[1] + b.c(this.b);
    if (this.a == Object.class)
      return "?";
    return z[0] + b.c(this.a);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */