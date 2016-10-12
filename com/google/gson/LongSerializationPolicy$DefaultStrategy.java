package com.google.gson;

class LongSerializationPolicy$DefaultStrategy
  implements LongSerializationPolicy.Strategy
{
  private LongSerializationPolicy$DefaultStrategy()
  {
  }

  public JsonElement serialize(Long paramLong)
  {
    return new JsonPrimitive(paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.LongSerializationPolicy.DefaultStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */