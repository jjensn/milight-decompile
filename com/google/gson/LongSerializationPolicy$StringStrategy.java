package com.google.gson;

class LongSerializationPolicy$StringStrategy
  implements LongSerializationPolicy.Strategy
{
  private LongSerializationPolicy$StringStrategy()
  {
  }

  public JsonElement serialize(Long paramLong)
  {
    return new JsonPrimitive(String.valueOf(paramLong));
  }
}

/* Location:
 * Qualified Name:     com.google.gson.LongSerializationPolicy.StringStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */