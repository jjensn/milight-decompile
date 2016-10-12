package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.af;
import com.google.gson.jpush.al;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;

final class bd extends al<Number>
{
  bd()
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
      Integer localInteger = Integer.valueOf(parama.m());
      return localInteger;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new af(localNumberFormatException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.bd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */