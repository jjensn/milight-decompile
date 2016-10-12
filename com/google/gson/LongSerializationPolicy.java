package com.google.gson;

public enum LongSerializationPolicy
{
  private final Strategy strategy;

  static
  {
    LongSerializationPolicy[] arrayOfLongSerializationPolicy = new LongSerializationPolicy[2];
    arrayOfLongSerializationPolicy[0] = DEFAULT;
    arrayOfLongSerializationPolicy[1] = STRING;
  }

  private LongSerializationPolicy(Strategy paramStrategy)
  {
    this.strategy = paramStrategy;
  }

  public JsonElement serialize(Long paramLong)
  {
    return this.strategy.serialize(paramLong);
  }

  private static class DefaultStrategy
    implements LongSerializationPolicy.Strategy
  {
    private DefaultStrategy()
    {
    }

    public JsonElement serialize(Long paramLong)
    {
      return new JsonPrimitive(paramLong);
    }
  }

  private static abstract interface Strategy
  {
    public abstract JsonElement serialize(Long paramLong);
  }

  private static class StringStrategy
    implements LongSerializationPolicy.Strategy
  {
    private StringStrategy()
    {
    }

    public JsonElement serialize(Long paramLong)
    {
      return new JsonPrimitive(String.valueOf(paramLong));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.LongSerializationPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */