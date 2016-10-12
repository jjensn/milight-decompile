package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$EnumTypeAdapter<T extends Enum<T>>
  implements JsonSerializer<T>, JsonDeserializer<T>
{
  private DefaultTypeAdapters$EnumTypeAdapter()
  {
  }

  public T deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    return Enum.valueOf((Class)paramType, paramJsonElement.getAsString());
  }

  public JsonElement serialize(T paramT, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramT.name());
  }

  public String toString()
  {
    return EnumTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.EnumTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */