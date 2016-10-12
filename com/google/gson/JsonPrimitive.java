package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class JsonPrimitive extends JsonElement
{
  private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
  private static final BigInteger LONG_MAX = BigInteger.valueOf(9223372036854775807L);
  private static final Class<?>[] PRIMITIVE_TYPES;
  private Object value;

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
    PRIMITIVE_TYPES = arrayOfClass;
  }

  public JsonPrimitive(Boolean paramBoolean)
  {
    setValue(paramBoolean);
  }

  public JsonPrimitive(Character paramCharacter)
  {
    setValue(paramCharacter);
  }

  public JsonPrimitive(Number paramNumber)
  {
    setValue(paramNumber);
  }

  JsonPrimitive(Object paramObject)
  {
    setValue(paramObject);
  }

  public JsonPrimitive(String paramString)
  {
    setValue(paramString);
  }

  private static boolean isFloatingPoint(JsonPrimitive paramJsonPrimitive)
  {
    boolean bool1 = paramJsonPrimitive.value instanceof Number;
    boolean bool2 = false;
    if (bool1)
    {
      Number localNumber = (Number)paramJsonPrimitive.value;
      if ((!(localNumber instanceof BigDecimal)) && (!(localNumber instanceof Double)))
      {
        boolean bool3 = localNumber instanceof Float;
        bool2 = false;
        if (!bool3);
      }
      else
      {
        bool2 = true;
      }
    }
    return bool2;
  }

  private static boolean isIntegral(JsonPrimitive paramJsonPrimitive)
  {
    boolean bool1 = paramJsonPrimitive.value instanceof Number;
    boolean bool2 = false;
    if (bool1)
    {
      Number localNumber = (Number)paramJsonPrimitive.value;
      if ((!(localNumber instanceof BigInteger)) && (!(localNumber instanceof Long)) && (!(localNumber instanceof Integer)) && (!(localNumber instanceof Short)))
      {
        boolean bool3 = localNumber instanceof Byte;
        bool2 = false;
        if (!bool3);
      }
      else
      {
        bool2 = true;
      }
    }
    return bool2;
  }

  private static boolean isPrimitiveOrString(Object paramObject)
  {
    if ((paramObject instanceof String))
      return true;
    Class localClass = paramObject.getClass();
    Class[] arrayOfClass = PRIMITIVE_TYPES;
    int i = arrayOfClass.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        break label47;
      if (arrayOfClass[j].isAssignableFrom(localClass))
        break;
    }
    label47: return false;
  }

  static Number stringToNumber(String paramString)
  {
    try
    {
      long l = Long.parseLong(paramString);
      if ((l >= -2147483648L) && (l <= 2147483647L))
        return Integer.valueOf((int)l);
      Long localLong = Long.valueOf(l);
      return localLong;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        BigDecimal localBigDecimal = new BigDecimal(paramString);
        return localBigDecimal;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
      }
    }
    return Double.valueOf(Double.parseDouble(paramString));
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    JsonPrimitive localJsonPrimitive;
    do
    {
      do
      {
        return true;
        if ((paramObject == null) || (getClass() != paramObject.getClass()))
          return false;
        localJsonPrimitive = (JsonPrimitive)paramObject;
        if (this.value != null)
          break;
      }
      while (localJsonPrimitive.value == null);
      return false;
      if ((!isIntegral(this)) || (!isIntegral(localJsonPrimitive)))
        break;
    }
    while (getAsNumber().longValue() == localJsonPrimitive.getAsNumber().longValue());
    return false;
    if ((isFloatingPoint(this)) && (isFloatingPoint(localJsonPrimitive)))
    {
      double d1 = getAsNumber().doubleValue();
      double d2 = localJsonPrimitive.getAsNumber().doubleValue();
      boolean bool1;
      if (d1 != d2)
      {
        boolean bool2 = Double.isNaN(d1);
        bool1 = false;
        if (bool2)
        {
          boolean bool3 = Double.isNaN(d2);
          bool1 = false;
          if (!bool3);
        }
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    return this.value.equals(localJsonPrimitive.value);
  }

  public BigDecimal getAsBigDecimal()
  {
    if ((this.value instanceof BigDecimal))
      return (BigDecimal)this.value;
    return new BigDecimal(this.value.toString());
  }

  public BigInteger getAsBigInteger()
  {
    if ((this.value instanceof BigInteger))
      return (BigInteger)this.value;
    return new BigInteger(this.value.toString());
  }

  public boolean getAsBoolean()
  {
    if (isBoolean())
      return getAsBooleanWrapper().booleanValue();
    return Boolean.parseBoolean(getAsString());
  }

  Boolean getAsBooleanWrapper()
  {
    return (Boolean)this.value;
  }

  public byte getAsByte()
  {
    if (isNumber())
      return getAsNumber().byteValue();
    return Byte.parseByte(getAsString());
  }

  public char getAsCharacter()
  {
    return getAsString().charAt(0);
  }

  public double getAsDouble()
  {
    if (isNumber())
      return getAsNumber().doubleValue();
    return Double.parseDouble(getAsString());
  }

  public float getAsFloat()
  {
    if (isNumber())
      return getAsNumber().floatValue();
    return Float.parseFloat(getAsString());
  }

  public int getAsInt()
  {
    if (isNumber())
      return getAsNumber().intValue();
    return Integer.parseInt(getAsString());
  }

  public long getAsLong()
  {
    if (isNumber())
      return getAsNumber().longValue();
    return Long.parseLong(getAsString());
  }

  public Number getAsNumber()
  {
    if ((this.value instanceof String))
      return stringToNumber((String)this.value);
    return (Number)this.value;
  }

  Object getAsObject()
  {
    if ((this.value instanceof BigInteger))
    {
      BigInteger localBigInteger = (BigInteger)this.value;
      if (localBigInteger.compareTo(INTEGER_MAX) < 0)
        return Integer.valueOf(localBigInteger.intValue());
      if (localBigInteger.compareTo(LONG_MAX) < 0)
        return Long.valueOf(localBigInteger.longValue());
    }
    return this.value;
  }

  public short getAsShort()
  {
    if (isNumber())
      return getAsNumber().shortValue();
    return Short.parseShort(getAsString());
  }

  public String getAsString()
  {
    if (isNumber())
      return getAsNumber().toString();
    if (isBoolean())
      return getAsBooleanWrapper().toString();
    return (String)this.value;
  }

  public int hashCode()
  {
    if (this.value == null)
      return 31;
    if (isIntegral(this))
    {
      long l2 = getAsNumber().longValue();
      return (int)(l2 ^ l2 >>> 32);
    }
    if (isFloatingPoint(this))
    {
      long l1 = Double.doubleToLongBits(getAsNumber().doubleValue());
      return (int)(l1 ^ l1 >>> 32);
    }
    return this.value.hashCode();
  }

  public boolean isBoolean()
  {
    return this.value instanceof Boolean;
  }

  public boolean isNumber()
  {
    return this.value instanceof Number;
  }

  public boolean isString()
  {
    return this.value instanceof String;
  }

  void setValue(Object paramObject)
  {
    if ((paramObject instanceof Character))
    {
      this.value = String.valueOf(((Character)paramObject).charValue());
      return;
    }
    if (((paramObject instanceof Number)) || (isPrimitiveOrString(paramObject)));
    for (boolean bool = true; ; bool = false)
    {
      .Gson.Preconditions.checkArgument(bool);
      this.value = paramObject;
      return;
    }
  }

  protected void toString(Appendable paramAppendable, Escaper paramEscaper)
    throws IOException
  {
    if (isString())
    {
      paramAppendable.append((char)'"');
      paramAppendable.append(paramEscaper.escapeJsonString(this.value.toString()));
      paramAppendable.append((char)'"');
      return;
    }
    paramAppendable.append(this.value.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.gson.JsonPrimitive
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */