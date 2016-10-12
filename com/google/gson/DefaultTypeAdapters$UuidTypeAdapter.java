package com.google.gson;

import java.lang.reflect.Type;
import java.util.UUID;

final class DefaultTypeAdapters$UuidTypeAdapter
  implements JsonSerializer<UUID>, JsonDeserializer<UUID>
{
  private DefaultTypeAdapters$UuidTypeAdapter()
  {
  }

  public UUID deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    return UUID.fromString(paramJsonElement.getAsString());
  }

  public JsonElement serialize(UUID paramUUID, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramUUID.toString());
  }

  public String toString()
  {
    return UuidTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.UuidTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */