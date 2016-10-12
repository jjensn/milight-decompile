package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$IntegerTypeAdapter
  implements JsonSerializer<Integer>, JsonDeserializer<Integer>
{
  private DefaultTypeAdapters$IntegerTypeAdapter()
  {
  }

  public Integer deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      Integer localInteger = Integer.valueOf(paramJsonElement.getAsInt());
      return localInteger;
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

  public JsonElement serialize(Integer paramInteger, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramInteger);
  }

  public String toString()
  {
    return IntegerTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.IntegerTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */