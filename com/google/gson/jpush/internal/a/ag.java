package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.af;
import com.google.gson.jpush.al;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;
import java.math.BigInteger;

final class ag extends al<BigInteger>
{
  ag()
  {
  }

  private static BigInteger b(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    try
    {
      BigInteger localBigInteger = new BigInteger(parama.h());
      return localBigInteger;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new af(localNumberFormatException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */