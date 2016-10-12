package com.google.gson;

import java.lang.reflect.Type;
import java.util.GregorianCalendar;

final class DefaultTypeAdapters$GregorianCalendarTypeAdapter
  implements JsonSerializer<GregorianCalendar>, JsonDeserializer<GregorianCalendar>
{
  private static final String DAY_OF_MONTH = "dayOfMonth";
  private static final String HOUR_OF_DAY = "hourOfDay";
  private static final String MINUTE = "minute";
  private static final String MONTH = "month";
  private static final String SECOND = "second";
  private static final String YEAR = "year";

  private DefaultTypeAdapters$GregorianCalendarTypeAdapter()
  {
  }

  public GregorianCalendar deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
    return new GregorianCalendar(localJsonObject.get("year").getAsInt(), localJsonObject.get("month").getAsInt(), localJsonObject.get("dayOfMonth").getAsInt(), localJsonObject.get("hourOfDay").getAsInt(), localJsonObject.get("minute").getAsInt(), localJsonObject.get("second").getAsInt());
  }

  public JsonElement serialize(GregorianCalendar paramGregorianCalendar, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    JsonObject localJsonObject = new JsonObject();
    localJsonObject.addProperty("year", Integer.valueOf(paramGregorianCalendar.get(1)));
    localJsonObject.addProperty("month", Integer.valueOf(paramGregorianCalendar.get(2)));
    localJsonObject.addProperty("dayOfMonth", Integer.valueOf(paramGregorianCalendar.get(5)));
    localJsonObject.addProperty("hourOfDay", Integer.valueOf(paramGregorianCalendar.get(11)));
    localJsonObject.addProperty("minute", Integer.valueOf(paramGregorianCalendar.get(12)));
    localJsonObject.addProperty("second", Integer.valueOf(paramGregorianCalendar.get(13)));
    return localJsonObject;
  }

  public String toString()
  {
    return GregorianCalendarTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.GregorianCalendarTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */