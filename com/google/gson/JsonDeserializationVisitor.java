package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import java.lang.reflect.Type;

abstract class JsonDeserializationVisitor<T>
  implements ObjectNavigator.Visitor
{
  protected boolean constructed;
  protected final JsonDeserializationContext context;
  protected final ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers;
  protected final FieldNamingStrategy2 fieldNamingPolicy;
  protected final JsonElement json;
  protected final ObjectConstructor objectConstructor;
  protected final ObjectNavigator objectNavigator;
  protected T target;
  protected final Type targetType;

  JsonDeserializationVisitor(JsonElement paramJsonElement, Type paramType, ObjectNavigator paramObjectNavigator, FieldNamingStrategy2 paramFieldNamingStrategy2, ObjectConstructor paramObjectConstructor, ParameterizedTypeHandlerMap<JsonDeserializer<?>> paramParameterizedTypeHandlerMap, JsonDeserializationContext paramJsonDeserializationContext)
  {
    this.targetType = paramType;
    this.objectNavigator = paramObjectNavigator;
    this.fieldNamingPolicy = paramFieldNamingStrategy2;
    this.objectConstructor = paramObjectConstructor;
    this.deserializers = paramParameterizedTypeHandlerMap;
    this.json = ((JsonElement).Gson.Preconditions.checkNotNull(paramJsonElement));
    this.context = paramJsonDeserializationContext;
    this.constructed = false;
  }

  private Object visitChild(Type paramType, JsonDeserializationVisitor<?> paramJsonDeserializationVisitor)
  {
    this.objectNavigator.accept(new ObjectTypePair(null, paramType, false), paramJsonDeserializationVisitor);
    return paramJsonDeserializationVisitor.getTarget();
  }

  protected abstract T constructTarget();

  public void end(ObjectTypePair paramObjectTypePair)
  {
  }

  public T getTarget()
  {
    if (!this.constructed)
    {
      this.target = constructTarget();
      this.constructed = true;
    }
    return this.target;
  }

  protected Object invokeCustomDeserializer(JsonElement paramJsonElement, Pair<JsonDeserializer<?>, ObjectTypePair> paramPair)
  {
    if ((paramJsonElement == null) || (paramJsonElement.isJsonNull()))
      return null;
    Type localType = ((ObjectTypePair)paramPair.second).type;
    return ((JsonDeserializer)paramPair.first).deserialize(paramJsonElement, localType, this.context);
  }

  public void start(ObjectTypePair paramObjectTypePair)
  {
  }

  final Object visitChildAsArray(Type paramType, JsonArray paramJsonArray)
  {
    return visitChild(paramType, new JsonArrayDeserializationVisitor(paramJsonArray.getAsJsonArray(), paramType, this.objectNavigator, this.fieldNamingPolicy, this.objectConstructor, this.deserializers, this.context));
  }

  final Object visitChildAsObject(Type paramType, JsonElement paramJsonElement)
  {
    return visitChild(paramType, new JsonObjectDeserializationVisitor(paramJsonElement, paramType, this.objectNavigator, this.fieldNamingPolicy, this.objectConstructor, this.deserializers, this.context));
  }

  public final boolean visitUsingCustomHandler(ObjectTypePair paramObjectTypePair)
  {
    Pair localPair = paramObjectTypePair.getMatchingHandler(this.deserializers);
    if (localPair == null)
      return false;
    this.target = invokeCustomDeserializer(this.json, localPair);
    this.constructed = true;
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.JsonDeserializationVisitor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */