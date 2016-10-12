package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$StringTypeAdapter
  implements JsonSerializer<String>, JsonDeserializer<String>
{
  private DefaultTypeAdapters$StringTypeAdapter()
  {
  }

  public String deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    return paramJsonElement.getAsString();
  }

  public JsonElement serialize(String paramString, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramString);
  }

  public String toString()
  {
    return StringTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.StringTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */