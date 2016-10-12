package com.google.gson;

import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.UnknownHostException;

final class DefaultTypeAdapters$DefaultInetAddressAdapter
  implements JsonDeserializer<InetAddress>, JsonSerializer<InetAddress>
{
  DefaultTypeAdapters$DefaultInetAddressAdapter()
  {
  }

  public InetAddress deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      InetAddress localInetAddress = InetAddress.getByName(paramJsonElement.getAsString());
      return localInetAddress;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      throw new JsonParseException(localUnknownHostException);
    }
  }

  public JsonElement serialize(InetAddress paramInetAddress, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramInetAddress.getHostAddress());
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.DefaultInetAddressAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */