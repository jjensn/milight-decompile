package com.google.gson;

import java.lang.reflect.Type;
import java.math.BigDecimal;

final class DefaultTypeAdapters$BigDecimalTypeAdapter
  implements JsonSerializer<BigDecimal>, JsonDeserializer<BigDecimal>
{
  private DefaultTypeAdapters$BigDecimalTypeAdapter()
  {
  }

  public BigDecimal deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      BigDecimal localBigDecimal = paramJsonElement.getAsBigDecimal();
      return localBigDecimal;
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

  public JsonElement serialize(BigDecimal paramBigDecimal, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramBigDecimal);
  }

  public String toString()
  {
    return BigDecimalTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.BigDecimalTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */