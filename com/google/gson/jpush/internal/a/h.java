package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.ac;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;
import com.google.gson.jpush.t;
import com.google.gson.jpush.y;
import com.google.gson.jpush.z;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class h extends a
{
  private static final Reader a;
  private static final Object b;
  private static final String[] z;
  private final List<Object> c;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "eDS6:Ixn\032sKd<6{a7}\026~\017~r\036sA~h\021\\-<";
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
          i3 = 26;
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
        str1 = "jol\035y[rxX";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "\017ui\f:XvoX";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "eds\026HJvx\035h\017~oXyCxo\035~";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = new i();
        b = new Object();
        return;
        i3 = 47;
        break label96;
        i3 = 23;
        break label96;
        i3 = 28;
        break label96;
        i3 = 120;
        break label96;
        m = 0;
      }
    }
  }

  private void a(c paramc)
  {
    if (f() != paramc)
      throw new IllegalStateException(z[1] + paramc + z[2] + f());
  }

  private Object r()
  {
    return this.c.get(-1 + this.c.size());
  }

  private Object s()
  {
    return this.c.remove(-1 + this.c.size());
  }

  public final void a()
  {
    a(c.a);
    t localt = (t)r();
    this.c.add(localt.iterator());
  }

  public final void b()
  {
    a(c.b);
    s();
    s();
  }

  public final void c()
  {
    a(c.c);
    z localz = (z)r();
    this.c.add(localz.a().iterator());
  }

  public final void close()
  {
    this.c.clear();
    this.c.add(b);
  }

  public final void d()
  {
    a(c.d);
    s();
    s();
  }

  public final boolean e()
  {
    c localc = f();
    return (localc != c.d) && (localc != c.b);
  }

  public final c f()
  {
    Object localObject;
    boolean bool;
    while (true)
    {
      if (this.c.isEmpty())
        return c.j;
      localObject = r();
      if (!(localObject instanceof Iterator))
        break label109;
      bool = this.c.get(-2 + this.c.size()) instanceof z;
      Iterator localIterator = (Iterator)localObject;
      if (!localIterator.hasNext())
        break;
      if (bool)
        return c.e;
      this.c.add(localIterator.next());
    }
    if (bool)
      return c.d;
    return c.b;
    label109: if ((localObject instanceof z))
      return c.c;
    if ((localObject instanceof t))
      return c.a;
    if ((localObject instanceof ac))
    {
      ac localac = (ac)localObject;
      if (localac.l())
        return c.f;
      if (localac.a())
        return c.h;
      if (localac.k())
        return c.g;
      throw new AssertionError();
    }
    if ((localObject instanceof y))
      return c.i;
    if (localObject == b)
      throw new IllegalStateException(z[3]);
    throw new AssertionError();
  }

  public final String g()
  {
    a(c.e);
    Map.Entry localEntry = (Map.Entry)((Iterator)r()).next();
    this.c.add(localEntry.getValue());
    return (String)localEntry.getKey();
  }

  public final String h()
  {
    c localc = f();
    if ((localc != c.f) && (localc != c.g))
      throw new IllegalStateException(z[1] + c.f + z[2] + localc);
    return ((ac)s()).c();
  }

  public final boolean i()
  {
    a(c.h);
    return ((ac)s()).g();
  }

  public final void j()
  {
    a(c.i);
    s();
  }

  public final double k()
  {
    c localc = f();
    if ((localc != c.g) && (localc != c.f))
      throw new IllegalStateException(z[1] + c.g + z[2] + localc);
    double d = ((ac)r()).d();
    if ((!p()) && ((Double.isNaN(d)) || (Double.isInfinite(d))))
      throw new NumberFormatException(z[0] + d);
    s();
    return d;
  }

  public final long l()
  {
    c localc = f();
    if ((localc != c.g) && (localc != c.f))
      throw new IllegalStateException(z[1] + c.g + z[2] + localc);
    long l = ((ac)r()).e();
    s();
    return l;
  }

  public final int m()
  {
    c localc = f();
    if ((localc != c.g) && (localc != c.f))
      throw new IllegalStateException(z[1] + c.g + z[2] + localc);
    int i = ((ac)r()).f();
    s();
    return i;
  }

  public final void n()
  {
    if (f() == c.e)
    {
      g();
      return;
    }
    s();
  }

  public final void o()
  {
    a(c.e);
    Map.Entry localEntry = (Map.Entry)((Iterator)r()).next();
    this.c.add(localEntry.getValue());
    this.c.add(new ac((String)localEntry.getKey()));
  }

  public final String toString()
  {
    return getClass().getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */