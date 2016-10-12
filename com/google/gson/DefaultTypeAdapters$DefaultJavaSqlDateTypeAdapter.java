package com.google.gson;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

final class DefaultTypeAdapters$DefaultJavaSqlDateTypeAdapter
  implements JsonSerializer<java.sql.Date>, JsonDeserializer<java.sql.Date>
{
  private final DateFormat format = new SimpleDateFormat("MMM d, yyyy");

  DefaultTypeAdapters$DefaultJavaSqlDateTypeAdapter()
  {
  }

  public java.sql.Date deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    if (!(paramJsonElement instanceof JsonPrimitive))
      throw new JsonParseException("The date should be a string value");
    try
    {
      synchronized (this.format)
      {
        java.sql.Date localDate = new java.sql.Date(this.format.parse(paramJsonElement.getAsString()).getTime());
        return localDate;
      }
    }
    catch (ParseException localParseException)
    {
      throw new JsonSyntaxException(localParseException);
    }
  }

  public JsonElement serialize(java.sql.Date paramDate, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    synchronized (this.format)
    {
      JsonPrimitive localJsonPrimitive = new JsonPrimitive(this.format.format(paramDate));
      return localJsonPrimitive;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.DefaultJavaSqlDateTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */