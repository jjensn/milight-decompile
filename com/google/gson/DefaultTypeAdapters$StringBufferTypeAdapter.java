package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$StringBufferTypeAdapter
  implements JsonSerializer<StringBuffer>, JsonDeserializer<StringBuffer>
{
  private DefaultTypeAdapters$StringBufferTypeAdapter()
  {
  }

  public StringBuffer deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    return new StringBuffer(paramJsonElement.getAsString());
  }

  public JsonElement serialize(StringBuffer paramStringBuffer, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramStringBuffer.toString());
  }

  public String toString()
  {
    return StringBufferTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.StringBufferTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */