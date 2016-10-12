package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.af;
import com.google.gson.jpush.al;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;

final class be extends al<Number>
{
  be()
  {
  }

  private static Number b(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    try
    {
      Long localLong = Long.valueOf(parama.l());
      return localLong;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new af(localNumberFormatException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.be
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */