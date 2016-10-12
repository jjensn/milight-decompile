package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$NumberTypeAdapter
  implements JsonSerializer<Number>, JsonDeserializer<Number>
{
  private DefaultTypeAdapters$NumberTypeAdapter()
  {
  }

  public Number deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      Number localNumber = paramJsonElement.getAsNumber();
      return localNumber;
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

  public JsonElement serialize(Number paramNumber, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramNumber);
  }

  public String toString()
  {
    return NumberTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.NumberTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */