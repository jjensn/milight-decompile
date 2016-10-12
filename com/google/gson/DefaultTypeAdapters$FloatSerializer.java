package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$FloatSerializer
  implements JsonSerializer<Float>
{
  private final boolean serializeSpecialFloatingPointValues;

  DefaultTypeAdapters$FloatSerializer(boolean paramBoolean)
  {
    this.serializeSpecialFloatingPointValues = paramBoolean;
  }

  public JsonElement serialize(Float paramFloat, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    if ((!this.serializeSpecialFloatingPointValues) && ((Float.isNaN(paramFloat.floatValue())) || (Float.isInfinite(paramFloat.floatValue()))))
      throw new IllegalArgumentException(paramFloat + " is not a valid float value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    return new JsonPrimitive(paramFloat);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.FloatSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */