package com.google.gson;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonElement
{
  private static final Escaper BASIC_ESCAPER = new Escaper(false);

  public JsonElement()
  {
  }

  public BigDecimal getAsBigDecimal()
  {
    throw new UnsupportedOperationException();
  }

  public BigInteger getAsBigInteger()
  {
    throw new UnsupportedOperationException();
  }

  public boolean getAsBoolean()
  {
    throw new UnsupportedOperationException();
  }

  Boolean getAsBooleanWrapper()
  {
    throw new UnsupportedOperationException();
  }

  public byte getAsByte()
  {
    throw new UnsupportedOperationException();
  }

  public char getAsCharacter()
  {
    throw new UnsupportedOperationException();
  }

  public double getAsDouble()
  {
    throw new UnsupportedOperationException();
  }

  public float getAsFloat()
  {
    throw new UnsupportedOperationException();
  }

  public int getAsInt()
  {
    throw new UnsupportedOperationException();
  }

  public JsonArray getAsJsonArray()
  {
    if (isJsonArray())
      return (JsonArray)this;
    throw new IllegalStateException("This is not a JSON Array.");
  }

  public JsonNull getAsJsonNull()
  {
    if (isJsonNull())
      return (JsonNull)this;
    throw new IllegalStateException("This is not a JSON Null.");
  }

  public JsonObject getAsJsonObject()
  {
    if (isJsonObject())
      return (JsonObject)this;
    throw new IllegalStateException("This is not a JSON Object.");
  }

  public JsonPrimitive getAsJsonPrimitive()
  {
    if (isJsonPrimitive())
      return (JsonPrimitive)this;
    throw new IllegalStateException("This is not a JSON Primitive.");
  }

  public long getAsLong()
  {
    throw new UnsupportedOperationException();
  }

  public Number getAsNumber()
  {
    throw new UnsupportedOperationException();
  }

  Object getAsObject()
  {
    throw new UnsupportedOperationException();
  }

  public short getAsShort()
  {
    throw new UnsupportedOperationException();
  }

  public String getAsString()
  {
    throw new UnsupportedOperationException();
  }

  public boolean isJsonArray()
  {
    return this instanceof JsonArray;
  }

  public boolean isJsonNull()
  {
    return this instanceof JsonNull;
  }

  public boolean isJsonObject()
  {
    return this instanceof JsonObject;
  }

  public boolean isJsonPrimitive()
  {
    return this instanceof JsonPrimitive;
  }

  public String toString()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      toString(localStringBuilder, BASIC_ESCAPER);
      String str = localStringBuilder.toString();
      return str;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException);
    }
  }

  protected abstract void toString(Appendable paramAppendable, Escaper paramEscaper)
    throws IOException;
}

/* Location:
 * Qualified Name:     com.google.gson.JsonElement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */