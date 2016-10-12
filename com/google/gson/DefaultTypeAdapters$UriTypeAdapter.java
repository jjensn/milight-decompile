package com.google.gson;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;

final class DefaultTypeAdapters$UriTypeAdapter
  implements JsonSerializer<URI>, JsonDeserializer<URI>
{
  private DefaultTypeAdapters$UriTypeAdapter()
  {
  }

  public URI deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      URI localURI = new URI(paramJsonElement.getAsString());
      return localURI;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      throw new JsonSyntaxException(localURISyntaxException);
    }
  }

  public JsonElement serialize(URI paramURI, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramURI.toASCIIString());
  }

  public String toString()
  {
    return UriTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.UriTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */