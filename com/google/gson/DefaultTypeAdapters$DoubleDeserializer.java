package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$DoubleDeserializer
  implements JsonDeserializer<Double>
{
  private DefaultTypeAdapters$DoubleDeserializer()
  {
  }

  public Double deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      Double localDouble = Double.valueOf(paramJsonElement.getAsDouble());
      return localDouble;
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

  public String toString()
  {
    return DoubleDeserializer.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.DoubleDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */