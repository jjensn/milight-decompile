package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.af;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;
import com.google.gson.jpush.b.d;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class w extends al<Time>
{
  public static final am a;
  private static final String z;
  private final DateFormat b = new SimpleDateFormat(z);

  static
  {
    Object localObject1 = "82Kx\tj)\0025\005".toCharArray();
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
        i1 = 100;
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
      a = new x();
      return;
      i1 = 80;
      continue;
      i1 = 90;
      continue;
      i1 = 113;
      continue;
      i1 = 21;
    }
  }

  public w()
  {
  }

  private void a(d paramd, Time paramTime)
  {
    if (paramTime == null)
    {
      localObject2 = null;
      try
      {
        while (true)
        {
          paramd.b((String)localObject2);
          return;
          String str = this.b.format(paramTime);
          localObject2 = str;
        }
      }
      finally
      {
      }
    }
  }

  private Time b(a parama)
  {
    try
    {
      Time localTime;
      if (parama.f() == c.i)
      {
        parama.j();
        localTime = null;
      }
      while (true)
      {
        return localTime;
        try
        {
          localTime = new Time(this.b.parse(parama.h()).getTime());
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
 * Qualified Name:     com.google.gson.jpush.internal.a.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */