package com.google.gson;

import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;

final class DefaultTypeAdapters$UrlTypeAdapter
  implements JsonSerializer<URL>, JsonDeserializer<URL>
{
  private DefaultTypeAdapters$UrlTypeAdapter()
  {
  }

  public URL deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      URL localURL = new URL(paramJsonElement.getAsString());
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      throw new JsonSyntaxException(localMalformedURLException);
    }
  }

  public JsonElement serialize(URL paramURL, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramURL.toExternalForm());
  }

  public String toString()
  {
    return UrlTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.UrlTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */