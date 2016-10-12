package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$ShortTypeAdapter
  implements JsonSerializer<Short>, JsonDeserializer<Short>
{
  private DefaultTypeAdapters$ShortTypeAdapter()
  {
  }

  public Short deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      Short localShort = Short.valueOf(paramJsonElement.getAsShort());
      return localShort;
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

  public JsonElement serialize(Short paramShort, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramShort);
  }

  public String toString()
  {
    return ShortTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.ShortTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */