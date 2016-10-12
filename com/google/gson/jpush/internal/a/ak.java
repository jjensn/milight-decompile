package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;
import com.google.gson.jpush.x;
import java.net.URI;
import java.net.URISyntaxException;

final class ak extends al<URI>
{
  private static final String z;

  static
  {
    Object localObject1 = "\fn\bd".toCharArray();
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
        i1 = 49;
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
      i1 = 98;
      continue;
      i1 = 27;
      continue;
      i1 = 100;
      continue;
      i1 = 8;
    }
  }

  ak()
  {
  }

  private static URI b(a parama)
  {
    if (parama.f() == c.i)
      parama.j();
    while (true)
    {
      return null;
      try
      {
        String str = parama.h();
        if (z.equals(str))
          continue;
        URI localURI = new URI(str);
        return localURI;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        throw new x(localURISyntaxException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */