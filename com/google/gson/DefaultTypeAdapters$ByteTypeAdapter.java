package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$ByteTypeAdapter
  implements JsonSerializer<Byte>, JsonDeserializer<Byte>
{
  private DefaultTypeAdapters$ByteTypeAdapter()
  {
  }

  public Byte deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      Byte localByte = Byte.valueOf(paramJsonElement.getAsByte());
      return localByte;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new JsonSyntaxException(localNumberFormatException);
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new JsonSyntaxException(localUnsupportedOperationException);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      throw new JsonSyntaxException(localIllegalStateException);
    }
  }

  public JsonElement serialize(Byte paramByte, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramByte);
  }

  public String toString()
  {
    return ByteTypeAdapter.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.ByteTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */