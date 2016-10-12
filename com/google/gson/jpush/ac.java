package com.google.gson.jpush;

import com.google.gson.jpush.internal.a;
import com.google.gson.jpush.internal.v;
import java.math.BigInteger;

public final class ac extends w
{
  private static final Class<?>[] a = arrayOfClass;
  private Object b;

  static
  {
    Class[] arrayOfClass = new Class[16];
    arrayOfClass[0] = Integer.TYPE;
    arrayOfClass[1] = Long.TYPE;
    arrayOfClass[2] = Short.TYPE;
    arrayOfClass[3] = Float.TYPE;
    arrayOfClass[4] = Double.TYPE;
    arrayOfClass[5] = Byte.TYPE;
    arrayOfClass[6] = Boolean.TYPE;
    arrayOfClass[7] = Character.TYPE;
    arrayOfClass[8] = Integer.class;
    arrayOfClass[9] = Long.class;
    arrayOfClass[10] = Short.class;
    arrayOfClass[11] = Float.class;
    arrayOfClass[12] = Double.class;
    arrayOfClass[13] = Byte.class;
    arrayOfClass[14] = Boolean.class;
    arrayOfClass[15] = Character.class;
  }

  public ac(Boolean paramBoolean)
  {
    a(paramBoolean);
  }

  public ac(Number paramNumber)
  {
    a(paramNumber);
  }

  public ac(String paramString)
  {
    a(paramString);
  }

  private void a(Object paramObject)
  {
    if ((paramObject instanceof Character))
    {
      this.b = String.valueOf(((Character)paramObject).charValue());
      return;
    }
    int k;
    if (!(paramObject instanceof Number))
    {
      if (!(paramObject instanceof String))
        break label58;
      k = 1;
    }
    while (true)
    {
      boolean bool = false;
      if (k != 0)
        bool = true;
      a.a(bool);
      this.b = paramObject;
      return;
      label58: Class localClass = paramObject.getClass();
      Class[] arrayOfClass = a;
      int i = arrayOfClass.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label107;
        if (arrayOfClass[j].isAssignableFrom(localClass))
        {
          k = 1;
          break;
        }
      }
      label107: k = 0;
    }
  }

  private static boolean a(ac paramac)
  {
    if ((paramac.b instanceof Number))
    {
      Number localNumber = (Number)paramac.b;
      return ((localNumber instanceof BigInteger)) || ((localNumber instanceof Long)) || ((localNumber instanceof Integer)) || ((localNumber instanceof Short)) || ((localNumber instanceof Byte));
    }
    return false;
  }

  public final boolean a()
  {
    return this.b instanceof Boolean;
  }

  public final Number b()
  {
    if ((this.b instanceof String))
      return new v((String)this.b);
    return (Number)this.b;
  }

  public final String c()
  {
    if ((this.b instanceof Number))
      return b().toString();
    if ((this.b instanceof Boolean))
      return ((Boolean)this.b).toString();
    return (String)this.b;
  }

  public final double d()
  {
    if ((this.b instanceof Number))
      return b().doubleValue();
    return Double.parseDouble(c());
  }

  public final long e()
  {
    if ((this.b instanceof Number))
      return b().longValue();
    return Long.parseLong(c());
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    ac localac;
    double d1;
    double d2;
    do
    {
      do
      {
        do
        {
          return true;
          if ((paramObject == null) || (getClass() != paramObject.getClass()))
            return false;
          localac = (ac)paramObject;
          if (this.b != null)
            break;
        }
        while (localac.b == null);
        return false;
        if ((!a(this)) || (!a(localac)))
          break;
      }
      while (b().longValue() == localac.b().longValue());
      return false;
      if ((!(this.b instanceof Number)) || (!(localac.b instanceof Number)))
        break;
      d1 = b().doubleValue();
      d2 = localac.b().doubleValue();
    }
    while ((d1 == d2) || ((Double.isNaN(d1)) && (Double.isNaN(d2))));
    return false;
    return this.b.equals(localac.b);
  }

  public final int f()
  {
    if ((this.b instanceof Number))
      return b().intValue();
    return Integer.parseInt(c());
  }

  public final boolean g()
  {
    if ((this.b instanceof Boolean))
      return ((Boolean)this.b).booleanValue();
    return Boolean.parseBoolean(c());
  }

  public final int hashCode()
  {
    if (this.b == null)
      return 31;
    if (a(this))
    {
      long l2 = b().longValue();
      return (int)(l2 ^ l2 >>> 32);
    }
    if ((this.b instanceof Number))
    {
      long l1 = Double.doubleToLongBits(b().doubleValue());
      return (int)(l1 ^ l1 >>> 32);
    }
    return this.b.hashCode();
  }

  public final boolean k()
  {
    return this.b instanceof Number;
  }

  public final boolean l()
  {
    return this.b instanceof String;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */