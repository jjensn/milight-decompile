package com.google.gson;

import java.lang.reflect.Type;

final class JsonObjectDeserializationVisitor<T> extends JsonDeserializationVisitor<T>
{
  JsonObjectDeserializationVisitor(JsonElement paramJsonElement, Type paramType, ObjectNavigator paramObjectNavigator, FieldNamingStrategy2 paramFieldNamingStrategy2, ObjectConstructor paramObjectConstructor, ParameterizedTypeHandlerMap<JsonDeserializer<?>> paramParameterizedTypeHandlerMap, JsonDeserializationContext paramJsonDeserializationContext)
  {
    super(paramJsonElement, paramType, paramObjectNavigator, paramFieldNamingStrategy2, paramObjectConstructor, paramParameterizedTypeHandlerMap, paramJsonDeserializationContext);
  }

  private String getFieldName(FieldAttributes paramFieldAttributes)
  {
    return this.fieldNamingPolicy.translateName(paramFieldAttributes);
  }

  protected T constructTarget()
  {
    return this.objectConstructor.construct(this.targetType);
  }

  public void startVisitingObject(Object paramObject)
  {
  }

  public void visitArray(Object paramObject, Type paramType)
  {
    throw new JsonParseException("Expecting object but found array: " + paramObject);
  }

  public void visitArrayField(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject)
  {
    try
    {
      if (!this.json.isJsonObject())
        throw new JsonParseException("Expecting object found: " + this.json);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    JsonArray localJsonArray = (JsonArray)this.json.getAsJsonObject().get(getFieldName(paramFieldAttributes));
    if (localJsonArray != null)
    {
      paramFieldAttributes.set(paramObject, visitChildAsArray(paramType, localJsonArray));
      return;
    }
    paramFieldAttributes.set(paramObject, null);
  }

  public boolean visitFieldUsingCustomHandler(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject)
  {
    String str;
    try
    {
      str = getFieldName(paramFieldAttributes);
      if (!this.json.isJsonObject())
        throw new JsonParseException("Expecting object found: " + this.json);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException();
    }
    JsonElement localJsonElement = this.json.getAsJsonObject().get(str);
    boolean bool = Primitives.isPrimitive(paramType);
    if (localJsonElement == null)
      return true;
    if (localJsonElement.isJsonNull())
    {
      if (!bool)
      {
        paramFieldAttributes.set(paramObject, null);
        return true;
      }
    }
    else
    {
      Pair localPair = new ObjectTypePair(null, paramType, false).getMatchingHandler(this.deserializers);
      if (localPair == null)
        return false;
      Object localObject = invokeCustomDeserializer(localJsonElement, localPair);
      if ((localObject != null) || (!bool))
        paramFieldAttributes.set(paramObject, localObject);
    }
    return true;
  }

  public void visitObjectField(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject)
  {
    try
    {
      if (!this.json.isJsonObject())
        throw new JsonParseException("Expecting object found: " + this.json);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    JsonElement localJsonElement = this.json.getAsJsonObject().get(getFieldName(paramFieldAttributes));
    if (localJsonElement != null)
    {
      paramFieldAttributes.set(paramObject, visitChildAsObject(paramType, localJsonElement));
      return;
    }
    paramFieldAttributes.set(paramObject, null);
  }

  public void visitPrimitive(Object paramObject)
  {
    if (!this.json.isJsonPrimitive())
      throw new JsonParseException("Type information is unavailable, and the target object is not a primitive: " + this.json);
    this.target = this.json.getAsJsonPrimitive().getAsObject();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.JsonObjectDeserializationVisitor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */