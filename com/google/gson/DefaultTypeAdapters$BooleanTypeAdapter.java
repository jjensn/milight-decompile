package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$BooleanTypeAdapter
  implements JsonSerializer<Boolean>, JsonDeserializer<Boolean>
{
  private DefaultTypeAdapters$BooleanTypeAdapter()
  {
  }

  public Boolean deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      Boolean localBoolean = Boolean.valueOf(paramJsonElement.getAsBoolean());
      return localBoolean;
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

  public JsonElement serialize(Boolean paramBoolean, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramBoolean);
  }

  public String toString()
  {
    return BooleanTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.BooleanTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */