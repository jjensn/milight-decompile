package com.google.gson;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.Date;

final class DefaultTypeAdapters$DefaultTimestampDeserializer
  implements JsonDeserializer<Timestamp>
{
  DefaultTypeAdapters$DefaultTimestampDeserializer()
  {
  }

  public Timestamp deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    return new Timestamp(((Date)paramJsonDeserializationContext.deserialize(paramJsonElement, Date.class)).getTime());
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.DefaultTimestampDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */