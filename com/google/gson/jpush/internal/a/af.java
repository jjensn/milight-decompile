package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;
import java.math.BigDecimal;

final class af extends al<BigDecimal>
{
  af()
  {
  }

  private static BigDecimal b(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    try
    {
      BigDecimal localBigDecimal = new BigDecimal(parama.h());
      return localBigDecimal;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new com.google.gson.jpush.af(localNumberFormatException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */