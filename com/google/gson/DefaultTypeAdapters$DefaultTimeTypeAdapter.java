package com.google.gson;

import java.lang.reflect.Type;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

final class DefaultTypeAdapters$DefaultTimeTypeAdapter
  implements JsonSerializer<Time>, JsonDeserializer<Time>
{
  private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");

  DefaultTypeAdapters$DefaultTimeTypeAdapter()
  {
  }

  public Time deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    if (!(paramJsonElement instanceof JsonPrimitive))
      throw new JsonParseException("The date should be a string value");
    try
    {
      synchronized (this.format)
      {
        Time localTime = new Time(this.format.parse(paramJsonElement.getAsString()).getTime());
        return localTime;
      }
    }
    catch (ParseException localParseException)
    {
      throw new JsonSyntaxException(localParseException);
    }
  }

  public JsonElement serialize(Time paramTime, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    synchronized (this.format)
    {
      JsonPrimitive localJsonPrimitive = new JsonPrimitive(this.format.format(paramTime));
      return localJsonPrimitive;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.DefaultTimeTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */