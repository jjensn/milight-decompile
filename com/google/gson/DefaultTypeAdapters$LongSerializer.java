package com.google.gson;

import java.lang.reflect.Type;

final class DefaultTypeAdapters$LongSerializer
  implements JsonSerializer<Long>
{
  private final LongSerializationPolicy longSerializationPolicy;

  private DefaultTypeAdapters$LongSerializer(LongSerializationPolicy paramLongSerializationPolicy)
  {
    this.longSerializationPolicy = paramLongSerializationPolicy;
  }

  public JsonElement serialize(Long paramLong, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return this.longSerializationPolicy.serialize(paramLong);
  }

  public String toString()
  {
    return LongSerializer.class.getSimpleName();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.LongSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */