package com.google.gson.jpush.internal;

import java.math.BigDecimal;

public final class v extends Number
{
  private final String a;

  public v(String paramString)
  {
    this.a = paramString;
  }

  public final double doubleValue()
  {
    return Double.parseDouble(this.a);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    v localv;
    do
    {
      return true;
      if (!(paramObject instanceof v))
        break;
      localv = (v)paramObject;
    }
    while ((this.a == localv.a) || (this.a.equals(localv.a)));
    return false;
    return false;
  }

  public final float floatValue()
  {
    return Float.parseFloat(this.a);
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final int intValue()
  {
    try
    {
      int i = Integer.parseInt(this.a);
      return i;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        long l = Long.parseLong(this.a);
        return (int)l;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
      }
    }
    return new BigDecimal(this.a).intValue();
  }

  public final long longValue()
  {
    try
    {
      long l = Long.parseLong(this.a);
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return new BigDecimal(this.a).longValue();
  }

  public final String toString()
  {
    return this.a;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */