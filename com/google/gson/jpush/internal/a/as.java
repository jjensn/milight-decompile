package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.ac;
import com.google.gson.jpush.al;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.d;
import com.google.gson.jpush.internal.v;
import com.google.gson.jpush.t;
import com.google.gson.jpush.w;
import com.google.gson.jpush.y;
import com.google.gson.jpush.z;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class as extends al<w>
{
  private static final String z;

  static
  {
    Object localObject1 = "I\n3N\006dB2\002\025x\f2GB".toCharArray();
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
        i1 = 98;
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
      i1 = 10;
      continue;
      i1 = 101;
      continue;
      i1 = 70;
      continue;
      i1 = 34;
    }
  }

  as()
  {
  }

  private void a(d paramd, w paramw)
  {
    if ((paramw == null) || ((paramw instanceof y)))
    {
      paramd.f();
      return;
    }
    if ((paramw instanceof ac))
    {
      ac localac = paramw.j();
      if (localac.k())
      {
        paramd.a(localac.b());
        return;
      }
      if (localac.a())
      {
        paramd.a(localac.g());
        return;
      }
      paramd.b(localac.c());
      return;
    }
    if ((paramw instanceof t))
    {
      paramd.b();
      Iterator localIterator2 = paramw.i().iterator();
      while (localIterator2.hasNext())
        a(paramd, (w)localIterator2.next());
      paramd.c();
      return;
    }
    if ((paramw instanceof z))
    {
      paramd.d();
      Iterator localIterator1 = paramw.h().a().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        paramd.a((String)localEntry.getKey());
        a(paramd, (w)localEntry.getValue());
      }
      paramd.e();
      return;
    }
    throw new IllegalArgumentException(z + paramw.getClass());
  }

  private w b(a parama)
  {
    switch (az.a[parama.f().ordinal()])
    {
    default:
      throw new IllegalArgumentException();
    case 3:
      return new ac(parama.h());
    case 1:
      return new ac(new v(parama.h()));
    case 2:
      return new ac(Boolean.valueOf(parama.i()));
    case 4:
      parama.j();
      return y.a;
    case 5:
      t localt = new t();
      parama.a();
      while (parama.e())
        localt.a(b(parama));
      parama.b();
      return localt;
    case 6:
    }
    z localz = new z();
    parama.c();
    while (parama.e())
      localz.a(parama.g(), b(parama));
    parama.d();
    return localz;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.as
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */