package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$LongDeserializer
  implements JsonDeserializer<Long>
{
  private DefaultTypeAdapters$LongDeserializer()
  {
  }

  public Long deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      Long localLong = Long.valueOf(paramJsonElement.getAsLong());
      return localLong;
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

  public String toString()
  {
    return LongDeserializer.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.LongDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */