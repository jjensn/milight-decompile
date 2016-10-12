package com.google.gson.jpush.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;

public final class w<K, V> extends AbstractMap<K, V>
  implements Serializable
{
  private static final Comparator<Comparable> g;
  private static final String[] z;
  Comparator<? super K> a;
  ad<K, V> b;
  int c = 0;
  int d = 0;
  final ad<K, V> e = new ad();
  private w<K, V>.y h;
  private w<K, V>.aa i;

  static
  {
    int j = 1;
    String[] arrayOfString1 = new String[2];
    String str1 = "\fP\\B7CM\017!6AIN\0208NUJ";
    int k = -1;
    String[] arrayOfString2 = arrayOfString1;
    int m = 0;
    Object localObject1 = str1.toCharArray();
    int n = localObject1.length;
    int i1;
    label38: int i5;
    if (n <= j)
    {
      i1 = 0;
      Object localObject2 = localObject1;
      int i2 = i1;
      int i3 = n;
      Object localObject3 = localObject1;
      while (true)
      {
        int i4 = localObject3[i1];
        switch (i2 % 5)
        {
        default:
          i5 = 89;
          localObject3[i1] = (char)(i5 ^ i4);
          i1 = i2 + 1;
          if (i3 != 0)
            break label137;
          localObject3 = localObject2;
          i2 = i1;
          i1 = i3;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label137: n = i3;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (n > i1)
        break label38;
      String str2 = new String((char[])localObject1).intern();
      switch (k)
      {
      default:
        arrayOfString2[m] = str2;
        str1 = "G\\VBd\021\031A\0275@";
        m = j;
        arrayOfString2 = arrayOfString1;
        k = 0;
        break;
      case 0:
        arrayOfString2[m] = str2;
        z = arrayOfString1;
        if (!w.class.desiredAssertionStatus());
        while (true)
        {
          f = j;
          g = new x();
          return;
          i5 = 44;
          break;
          i5 = 57;
          break;
          i5 = 47;
          break;
          i5 = 98;
          break;
          j = 0;
        }
        i1 = 0;
      }
    }
  }

  public w()
  {
    this(g);
  }

  private w(Comparator<? super K> paramComparator)
  {
    if (paramComparator != null);
    while (true)
    {
      this.a = paramComparator;
      return;
      paramComparator = g;
    }
  }

  private ad<K, V> a(K paramK, boolean paramBoolean)
  {
    Comparator localComparator = this.a;
    Object localObject1 = this.b;
    Object localObject3;
    label66: label83: label117: int m;
    Object localObject2;
    if (localObject1 != null)
    {
      Comparable localComparable;
      if (localComparator == g)
      {
        localComparable = (Comparable)paramK;
        if (localComparable == null)
          break label66;
      }
      for (int k = localComparable.compareTo(((ad)localObject1).f); ; k = localComparator.compare(paramK, ((ad)localObject1).f))
      {
        if (k != 0)
          break label83;
        localObject3 = localObject1;
        return localObject3;
        localComparable = null;
        break;
      }
      if (k < 0);
      for (ad localad3 = ((ad)localObject1).b; ; localad3 = ((ad)localObject1).c)
      {
        if (localad3 == null)
          break label117;
        localObject1 = localad3;
        break;
      }
      m = k;
      localObject2 = localObject1;
    }
    for (int j = m; ; j = 0)
    {
      localObject3 = null;
      if (!paramBoolean)
        break;
      ad localad1 = this.e;
      if (localObject2 == null)
      {
        if ((localComparator == g) && (!(paramK instanceof Comparable)))
          throw new ClassCastException(paramK.getClass().getName() + z[0]);
        localad2 = new ad(localObject2, paramK, localad1, localad1.e);
        this.b = localad2;
        this.c = (1 + this.c);
        this.d = (1 + this.d);
        return localad2;
      }
      ad localad2 = new ad(localObject2, paramK, localad1, localad1.e);
      if (j < 0)
        localObject2.b = localad2;
      while (true)
      {
        b(localObject2, true);
        break;
        localObject2.c = localad2;
      }
      localObject2 = localObject1;
    }
  }

  private void a(ad<K, V> paramad)
  {
    ad localad1 = paramad.b;
    ad localad2 = paramad.c;
    ad localad3 = localad2.b;
    ad localad4 = localad2.c;
    paramad.c = localad3;
    if (localad3 != null)
      localad3.a = paramad;
    a(paramad, localad2);
    localad2.b = paramad;
    paramad.a = localad2;
    int j;
    if (localad1 != null)
    {
      j = localad1.h;
      if (localad3 == null)
        break label131;
    }
    label131: for (int k = localad3.h; ; k = 0)
    {
      paramad.h = (1 + Math.max(j, k));
      int m = paramad.h;
      int n = 0;
      if (localad4 != null)
        n = localad4.h;
      localad2.h = (1 + Math.max(m, n));
      return;
      j = 0;
      break;
    }
  }

  private void a(ad<K, V> paramad1, ad<K, V> paramad2)
  {
    ad localad = paramad1.a;
    paramad1.a = null;
    if (paramad2 != null)
      paramad2.a = localad;
    if (localad != null)
    {
      if (localad.b == paramad1)
      {
        localad.b = paramad2;
        return;
      }
      if ((!f) && (localad.c != paramad1))
        throw new AssertionError();
      localad.c = paramad2;
      return;
    }
    this.b = paramad2;
  }

  private ad<K, V> b(Object paramObject)
  {
    Object localObject = null;
    if (paramObject != null)
      try
      {
        ad localad = a(paramObject, false);
        localObject = localad;
        return localObject;
      }
      catch (ClassCastException localClassCastException)
      {
      }
    return null;
  }

  private void b(ad<K, V> paramad)
  {
    ad localad1 = paramad.b;
    ad localad2 = paramad.c;
    ad localad3 = localad1.b;
    ad localad4 = localad1.c;
    paramad.b = localad4;
    if (localad4 != null)
      localad4.a = paramad;
    a(paramad, localad1);
    localad1.c = paramad;
    paramad.a = localad1;
    int j;
    if (localad2 != null)
    {
      j = localad2.h;
      if (localad4 == null)
        break label131;
    }
    label131: for (int k = localad4.h; ; k = 0)
    {
      paramad.h = (1 + Math.max(j, k));
      int m = paramad.h;
      int n = 0;
      if (localad3 != null)
        n = localad3.h;
      localad1.h = (1 + Math.max(m, n));
      return;
      j = 0;
      break;
    }
  }

  private void b(ad<K, V> paramad, boolean paramBoolean)
  {
    ad localad1;
    ad localad2;
    int j;
    label25: int k;
    label37: int m;
    int i3;
    label77: int i4;
    label89: int i5;
    if (paramad != null)
    {
      localad1 = paramad.b;
      localad2 = paramad.c;
      if (localad1 != null)
      {
        j = localad1.h;
        if (localad2 == null)
          break label134;
        k = localad2.h;
        m = j - k;
        if (m != -2)
          break label186;
        ad localad5 = localad2.b;
        ad localad6 = localad2.c;
        if (localad6 == null)
          break label140;
        i3 = localad6.h;
        if (localad5 == null)
          break label146;
        i4 = localad5.h;
        i5 = i4 - i3;
        if ((i5 != -1) && ((i5 != 0) || (paramBoolean)))
          break label152;
        a(paramad);
        label116: if (paramBoolean)
          break label259;
      }
    }
    while (true)
    {
      paramad = paramad.a;
      break;
      j = 0;
      break label25;
      label134: k = 0;
      break label37;
      label140: i3 = 0;
      break label77;
      label146: i4 = 0;
      break label89;
      label152: if ((!f) && (i5 != 1))
        throw new AssertionError();
      b(localad2);
      a(paramad);
      break label116;
      label186: int n;
      label216: int i1;
      label228: int i2;
      if (m == 2)
      {
        ad localad3 = localad1.b;
        ad localad4 = localad1.c;
        if (localad4 != null)
        {
          n = localad4.h;
          if (localad3 == null)
            break label266;
          i1 = localad3.h;
          i2 = i1 - n;
          if ((i2 != 1) && ((i2 != 0) || (paramBoolean)))
            break label272;
          b(paramad);
          label255: if (!paramBoolean)
            break label303;
        }
      }
      label259: label266: label272: label303: 
      do
      {
        return;
        n = 0;
        break label216;
        i1 = 0;
        break label228;
        if ((!f) && (i2 != -1))
          throw new AssertionError();
        a(localad1);
        b(paramad);
        break label255;
        break;
        if (m == 0)
        {
          paramad.h = (j + 1);
          if (!paramBoolean)
            break;
          return;
        }
        if ((!f) && (m != -1) && (m != 1))
          throw new AssertionError();
        paramad.h = (1 + Math.max(j, k));
      }
      while (!paramBoolean);
    }
  }

  final ad<K, V> a(Object paramObject)
  {
    ad localad = b(paramObject);
    if (localad != null)
      a(localad, true);
    return localad;
  }

  final ad<K, V> a(Map.Entry<?, ?> paramEntry)
  {
    int j = 1;
    ad localad = b(paramEntry.getKey());
    int k;
    if (localad != null)
    {
      Object localObject1 = localad.g;
      Object localObject2 = paramEntry.getValue();
      if ((localObject1 == localObject2) || ((localObject1 != null) && (localObject1.equals(localObject2))))
      {
        k = j;
        if (k == 0)
          break label73;
      }
    }
    while (true)
    {
      if (j == 0)
        break label78;
      return localad;
      k = 0;
      break;
      label73: j = 0;
    }
    label78: return null;
  }

  final void a(ad<K, V> paramad, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramad.e.d = paramad.d;
      paramad.d.e = paramad.e;
    }
    ad localad1 = paramad.b;
    ad localad2 = paramad.c;
    ad localad3 = paramad.a;
    Object localObject1;
    int j;
    if ((localad1 != null) && (localad2 != null))
    {
      if (localad1.h > localad2.h)
      {
        Object localObject3 = localad1.c;
        localObject1 = localad1;
        while (localObject3 != null)
        {
          ad localad8 = ((ad)localObject3).c;
          localObject1 = localObject3;
          localObject3 = localad8;
        }
      }
      ad localad4 = localad2.b;
      localObject1 = localad2;
      ad localad7;
      for (Object localObject2 = localad4; localObject2 != null; localObject2 = localad7)
      {
        localad7 = ((ad)localObject2).b;
        localObject1 = localObject2;
      }
      a((ad)localObject1, false);
      ad localad5 = paramad.b;
      if (localad5 == null)
        break label312;
      j = localad5.h;
      ((ad)localObject1).b = localad5;
      localad5.a = ((ad)localObject1);
      paramad.b = null;
    }
    while (true)
    {
      ad localad6 = paramad.c;
      int k = 0;
      if (localad6 != null)
      {
        k = localad6.h;
        ((ad)localObject1).c = localad6;
        localad6.a = ((ad)localObject1);
        paramad.c = null;
      }
      ((ad)localObject1).h = (1 + Math.max(j, k));
      a(paramad, (ad)localObject1);
      return;
      if (localad1 != null)
      {
        a(paramad, localad1);
        paramad.b = null;
      }
      while (true)
      {
        b(localad3, false);
        this.c = (-1 + this.c);
        this.d = (1 + this.d);
        return;
        if (localad2 != null)
        {
          a(paramad, localad2);
          paramad.c = null;
        }
        else
        {
          a(paramad, null);
        }
      }
      label312: j = 0;
    }
  }

  public final void clear()
  {
    this.b = null;
    this.c = 0;
    this.d = (1 + this.d);
    ad localad = this.e;
    localad.e = localad;
    localad.d = localad;
  }

  public final boolean containsKey(Object paramObject)
  {
    return b(paramObject) != null;
  }

  public final Set<Map.Entry<K, V>> entrySet()
  {
    y localy1 = this.h;
    if (localy1 != null)
      return localy1;
    y localy2 = new y(this);
    this.h = localy2;
    return localy2;
  }

  public final V get(Object paramObject)
  {
    ad localad = b(paramObject);
    if (localad != null)
      return localad.g;
    return null;
  }

  public final Set<K> keySet()
  {
    aa localaa1 = this.i;
    if (localaa1 != null)
      return localaa1;
    aa localaa2 = new aa(this);
    this.i = localaa2;
    return localaa2;
  }

  public final V put(K paramK, V paramV)
  {
    if (paramK == null)
      throw new NullPointerException(z[1]);
    ad localad = a(paramK, true);
    Object localObject = localad.g;
    localad.g = paramV;
    return localObject;
  }

  public final V remove(Object paramObject)
  {
    ad localad = a(paramObject);
    if (localad != null)
      return localad.g;
    return null;
  }

  public final int size()
  {
    return this.c;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */