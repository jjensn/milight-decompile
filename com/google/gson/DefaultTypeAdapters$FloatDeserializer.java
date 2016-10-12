package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$FloatDeserializer
  implements JsonDeserializer<Float>
{
  private DefaultTypeAdapters$FloatDeserializer()
  {
  }

  public Float deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    try
    {
      Float localFloat = Float.valueOf(paramJsonElement.getAsFloat());
      return localFloat;
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
    return FloatDeserializer.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.FloatDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */