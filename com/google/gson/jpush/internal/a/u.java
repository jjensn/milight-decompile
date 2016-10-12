package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.af;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;
import com.google.gson.jpush.b.d;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class u extends al<java.sql.Date>
{
  public static final am a;
  private static final String z;
  private final DateFormat b = new SimpleDateFormat(z);

  static
  {
    Object localObject1 = "vB{%B\027/O|_B".toCharArray();
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
        i1 = 38;
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
      a = new v();
      return;
      i1 = 59;
      continue;
      i1 = 15;
      continue;
      i1 = 54;
      continue;
      i1 = 5;
    }
  }

  public u()
  {
  }

  private void a(d paramd, java.sql.Date paramDate)
  {
    if (paramDate == null)
    {
      localObject2 = null;
      try
      {
        while (true)
        {
          paramd.b((String)localObject2);
          return;
          String str = this.b.format(paramDate);
          localObject2 = str;
        }
      }
      finally
      {
      }
    }
  }

  private java.sql.Date b(a parama)
  {
    try
    {
      java.sql.Date localDate;
      if (parama.f() == c.i)
      {
        parama.j();
        localDate = null;
      }
      while (true)
      {
        return localDate;
        try
        {
          localDate = new java.sql.Date(this.b.parse(parama.h()).getTime());
        }
        catch (ParseException localParseException)
        {
          throw new af(localParseException);
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */