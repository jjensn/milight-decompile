package com.google.gson;

import java.lang.reflect.Type;

final class JsonSerializationContextDefault
  implements JsonSerializationContext
{
  private final MemoryRefStack ancestors;
  private final FieldNamingStrategy2 fieldNamingPolicy;
  private final ObjectNavigator objectNavigator;
  private final boolean serializeNulls;
  private final ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers;

  JsonSerializationContextDefault(ObjectNavigator paramObjectNavigator, FieldNamingStrategy2 paramFieldNamingStrategy2, boolean paramBoolean, ParameterizedTypeHandlerMap<JsonSerializer<?>> paramParameterizedTypeHandlerMap)
  {
    this.objectNavigator = paramObjectNavigator;
    this.fieldNamingPolicy = paramFieldNamingStrategy2;
    this.serializeNulls = paramBoolean;
    this.serializers = paramParameterizedTypeHandlerMap;
    this.ancestors = new MemoryRefStack();
  }

  public JsonElement serialize(Object paramObject)
  {
    if (paramObject == null)
      return JsonNull.createJsonNull();
    return serialize(paramObject, paramObject.getClass(), false);
  }

  public JsonElement serialize(Object paramObject, Type paramType)
  {
    return serialize(paramObject, paramType, true);
  }

  JsonElement serialize(Object paramObject, Type paramType, boolean paramBoolean)
  {
    if (paramObject == null)
      return JsonNull.createJsonNull();
    JsonSerializationVisitor localJsonSerializationVisitor = new JsonSerializationVisitor(this.objectNavigator, this.fieldNamingPolicy, this.serializeNulls, this.serializers, this, this.ancestors);
    this.objectNavigator.accept(new ObjectTypePair(paramObject, paramType, paramBoolean), localJsonSerializationVisitor);
    return localJsonSerializationVisitor.getJsonElement();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.JsonSerializationContextDefault
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */