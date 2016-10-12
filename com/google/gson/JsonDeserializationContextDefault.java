package com.google.gson;

import java.lang.reflect.Type;

final class JsonDeserializationContextDefault
  implements JsonDeserializationContext
{
  private final ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers;
  private final FieldNamingStrategy2 fieldNamingPolicy;
  private final MappedObjectConstructor objectConstructor;
  private final ObjectNavigator objectNavigator;

  JsonDeserializationContextDefault(ObjectNavigator paramObjectNavigator, FieldNamingStrategy2 paramFieldNamingStrategy2, ParameterizedTypeHandlerMap<JsonDeserializer<?>> paramParameterizedTypeHandlerMap, MappedObjectConstructor paramMappedObjectConstructor)
  {
    this.objectNavigator = paramObjectNavigator;
    this.fieldNamingPolicy = paramFieldNamingStrategy2;
    this.deserializers = paramParameterizedTypeHandlerMap;
    this.objectConstructor = paramMappedObjectConstructor;
  }

  private <T> T fromJsonArray(Type paramType, JsonArray paramJsonArray, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    JsonArrayDeserializationVisitor localJsonArrayDeserializationVisitor = new JsonArrayDeserializationVisitor(paramJsonArray, paramType, this.objectNavigator, this.fieldNamingPolicy, this.objectConstructor, this.deserializers, paramJsonDeserializationContext);
    this.objectNavigator.accept(new ObjectTypePair(null, paramType, true), localJsonArrayDeserializationVisitor);
    return localJsonArrayDeserializationVisitor.getTarget();
  }

  private <T> T fromJsonObject(Type paramType, JsonObject paramJsonObject, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    JsonObjectDeserializationVisitor localJsonObjectDeserializationVisitor = new JsonObjectDeserializationVisitor(paramJsonObject, paramType, this.objectNavigator, this.fieldNamingPolicy, this.objectConstructor, this.deserializers, paramJsonDeserializationContext);
    this.objectNavigator.accept(new ObjectTypePair(null, paramType, true), localJsonObjectDeserializationVisitor);
    return localJsonObjectDeserializationVisitor.getTarget();
  }

  private <T> T fromJsonPrimitive(Type paramType, JsonPrimitive paramJsonPrimitive, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    JsonObjectDeserializationVisitor localJsonObjectDeserializationVisitor = new JsonObjectDeserializationVisitor(paramJsonPrimitive, paramType, this.objectNavigator, this.fieldNamingPolicy, this.objectConstructor, this.deserializers, paramJsonDeserializationContext);
    this.objectNavigator.accept(new ObjectTypePair(paramJsonPrimitive.getAsObject(), paramType, true), localJsonObjectDeserializationVisitor);
    return localJsonObjectDeserializationVisitor.getTarget();
  }

  public <T> T deserialize(JsonElement paramJsonElement, Type paramType)
    throws JsonParseException
  {
    if ((paramJsonElement == null) || (paramJsonElement.isJsonNull()))
      return null;
    if (paramJsonElement.isJsonArray())
      return fromJsonArray(paramType, paramJsonElement.getAsJsonArray(), this);
    if (paramJsonElement.isJsonObject())
      return fromJsonObject(paramType, paramJsonElement.getAsJsonObject(), this);
    if (paramJsonElement.isJsonPrimitive())
      return fromJsonPrimitive(paramType, paramJsonElement.getAsJsonPrimitive(), this);
    throw new JsonParseException("Failed parsing JSON source: " + paramJsonElement + " to Json");
  }

  ObjectConstructor getObjectConstructor()
  {
    return this.objectConstructor;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.JsonDeserializationContextDefault
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */