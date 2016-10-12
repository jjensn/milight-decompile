package com.google.gson;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.StringTokenizer;

final class DefaultTypeAdapters$LocaleTypeAdapter
  implements JsonSerializer<Locale>, JsonDeserializer<Locale>
{
  private DefaultTypeAdapters$LocaleTypeAdapter()
  {
  }

  public Locale deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    StringTokenizer localStringTokenizer = new StringTokenizer(paramJsonElement.getAsString(), "_");
    boolean bool1 = localStringTokenizer.hasMoreElements();
    String str1 = null;
    if (bool1)
      str1 = localStringTokenizer.nextToken();
    boolean bool2 = localStringTokenizer.hasMoreElements();
    String str2 = null;
    if (bool2)
      str2 = localStringTokenizer.nextToken();
    boolean bool3 = localStringTokenizer.hasMoreElements();
    String str3 = null;
    if (bool3)
      str3 = localStringTokenizer.nextToken();
    if ((str2 == null) && (str3 == null))
      return new Locale(str1);
    if (str3 == null)
      return new Locale(str1, str2);
    return new Locale(str1, str2, str3);
  }

  public JsonElement serialize(Locale paramLocale, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramLocale.toString());
  }

  public String toString()
  {
    return LocaleTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.LocaleTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */