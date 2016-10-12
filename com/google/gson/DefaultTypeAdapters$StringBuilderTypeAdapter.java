package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$StringBuilderTypeAdapter
  implements JsonSerializer<StringBuilder>, JsonDeserializer<StringBuilder>
{
  private DefaultTypeAdapters$StringBuilderTypeAdapter()
  {
  }

  public StringBuilder deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    return new StringBuilder(paramJsonElement.getAsString());
  }

  public JsonElement serialize(StringBuilder paramStringBuilder, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramStringBuilder.toString());
  }

  public String toString()
  {
    return StringBuilderTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.StringBuilderTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */