package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$DoubleSerializer
  implements JsonSerializer<Double>
{
  private final boolean serializeSpecialFloatingPointValues;

  DefaultTypeAdapters$DoubleSerializer(boolean paramBoolean)
  {
    this.serializeSpecialFloatingPointValues = paramBoolean;
  }

  public JsonElement serialize(Double paramDouble, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    if ((!this.serializeSpecialFloatingPointValues) && ((Double.isNaN(paramDouble.doubleValue())) || (Double.isInfinite(paramDouble.doubleValue()))))
      throw new IllegalArgumentException(paramDouble + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialDoubleValues() method.");
    return new JsonPrimitive(paramDouble);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.DoubleSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */