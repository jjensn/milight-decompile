package com.google.gson;

import java.lang.reflect.Type;
import java.math.BigInteger;

final class DefaultTypeAdapters$BigIntegerTypeAdapter
  implements JsonSerializer<BigInteger>, JsonDeserializer<BigInteger>
{
  private DefaultTypeAdapters$BigIntegerTypeAdapter()
  {
  }

  public BigInteger deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      BigInteger localBigInteger = paramJsonElement.getAsBigInteger();
      return localBigInteger;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new JsonSyntaxException(localNumberFormatException);
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new JsonSyntaxException(localUnsupportedOperationException);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      throw new JsonSyntaxException(localIllegalStateException);
    }
  }

  public JsonElement serialize(BigInteger paramBigInteger, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramBigInteger);
  }

  public String toString()
  {
    return BigIntegerTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.BigIntegerTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */