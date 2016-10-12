package com.google.gson;

import java.lang.reflect.Type;
import java.util.Map;

abstract class BaseMapTypeAdapter
  implements JsonSerializer<Map<?, ?>>, JsonDeserializer<Map<?, ?>>
{
  BaseMapTypeAdapter()
  {
  }

  protected static final Map<Object, Object> constructMapType(Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
  {
    return (Map)((JsonDeserializationContextDefault)paramJsonDeserializationContext).getObjectConstructor().construct(paramType);
  }

  protected static final JsonElement serialize(JsonSerializationContext paramJsonSerializationContext, Object paramObject, Type paramType)
  {
    return ((JsonSerializationContextDefault)paramJsonSerializationContext).serialize(paramObject, paramType, false);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.BaseMapTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */