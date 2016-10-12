package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$CharacterTypeAdapter
  implements JsonSerializer<Character>, JsonDeserializer<Character>
{
  private DefaultTypeAdapters$CharacterTypeAdapter()
  {
  }

  public Character deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    return Character.valueOf(paramJsonElement.getAsCharacter());
  }

  public JsonElement serialize(Character paramCharacter, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramCharacter);
  }

  public String toString()
  {
    return CharacterTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.CharacterTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */