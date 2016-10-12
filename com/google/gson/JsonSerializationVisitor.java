package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal..Gson.Types;
import java.lang.reflect.Array;
import java.lang.reflect.Type;

final class JsonSerializationVisitor
  implements ObjectNavigator.Visitor
{
  private final MemoryRefStack ancestors;
  private final JsonSerializationContext context;
  private final FieldNamingStrategy2 fieldNamingPolicy;
  private final ObjectNavigator objectNavigator;
  private JsonElement root;
  private final boolean serializeNulls;
  private final ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers;

  JsonSerializationVisitor(ObjectNavigator paramObjectNavigator, FieldNamingStrategy2 paramFieldNamingStrategy2, boolean paramBoolean, ParameterizedTypeHandlerMap<JsonSerializer<?>> paramParameterizedTypeHandlerMap, JsonSerializationContext paramJsonSerializationContext, MemoryRefStack paramMemoryRefStack)
  {
    this.objectNavigator = paramObjectNavigator;
    this.fieldNamingPolicy = paramFieldNamingStrategy2;
    this.serializeNulls = paramBoolean;
    this.serializers = paramParameterizedTypeHandlerMap;
    this.context = paramJsonSerializationContext;
    this.ancestors = paramMemoryRefStack;
  }

  private void addAsArrayElement(ObjectTypePair paramObjectTypePair)
  {
    if (paramObjectTypePair.getObject() == null)
    {
      this.root.getAsJsonArray().add(JsonNull.createJsonNull());
      return;
    }
    JsonElement localJsonElement = getJsonElementForChild(paramObjectTypePair);
    this.root.getAsJsonArray().add(localJsonElement);
  }

  private void addAsChildOfObject(FieldAttributes paramFieldAttributes, ObjectTypePair paramObjectTypePair)
  {
    addChildAsElement(paramFieldAttributes, getJsonElementForChild(paramObjectTypePair));
  }

  private void addChildAsElement(FieldAttributes paramFieldAttributes, JsonElement paramJsonElement)
  {
    this.root.getAsJsonObject().add(this.fieldNamingPolicy.translateName(paramFieldAttributes), paramJsonElement);
  }

  private void assignToRoot(JsonElement paramJsonElement)
  {
    this.root = ((JsonElement).Gson.Preconditions.checkNotNull(paramJsonElement));
  }

  private JsonElement findAndInvokeCustomSerializer(ObjectTypePair paramObjectTypePair)
  {
    Pair localPair = paramObjectTypePair.getMatchingHandler(this.serializers);
    if (localPair == null)
      return null;
    JsonSerializer localJsonSerializer = (JsonSerializer)localPair.first;
    localObjectTypePair = (ObjectTypePair)localPair.second;
    start(localObjectTypePair);
    try
    {
      Object localObject2 = localJsonSerializer.serialize(localObjectTypePair.getObject(), localObjectTypePair.getType(), this.context);
      if (localObject2 == null)
      {
        JsonNull localJsonNull = JsonNull.createJsonNull();
        localObject2 = localJsonNull;
      }
      return localObject2;
    }
    finally
    {
      end(localObjectTypePair);
    }
  }

  private Object getFieldValue(FieldAttributes paramFieldAttributes, Object paramObject)
  {
    try
    {
      Object localObject = paramFieldAttributes.get(paramObject);
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
  }

  private JsonElement getJsonElementForChild(ObjectTypePair paramObjectTypePair)
  {
    JsonSerializationVisitor localJsonSerializationVisitor = new JsonSerializationVisitor(this.objectNavigator, this.fieldNamingPolicy, this.serializeNulls, this.serializers, this.context, this.ancestors);
    this.objectNavigator.accept(paramObjectTypePair, localJsonSerializationVisitor);
    return localJsonSerializationVisitor.getJsonElement();
  }

  private boolean isFieldNull(FieldAttributes paramFieldAttributes, Object paramObject)
  {
    return getFieldValue(paramFieldAttributes, paramObject) == null;
  }

  public void end(ObjectTypePair paramObjectTypePair)
  {
    if (paramObjectTypePair != null)
      this.ancestors.pop();
  }

  public JsonElement getJsonElement()
  {
    return this.root;
  }

  public Object getTarget()
  {
    return null;
  }

  public void start(ObjectTypePair paramObjectTypePair)
  {
    if (paramObjectTypePair == null)
      return;
    if (this.ancestors.contains(paramObjectTypePair))
      throw new CircularReferenceException(paramObjectTypePair);
    this.ancestors.push(paramObjectTypePair);
  }

  public void startVisitingObject(Object paramObject)
  {
    assignToRoot(new JsonObject());
  }

  public void visitArray(Object paramObject, Type paramType)
  {
    assignToRoot(new JsonArray());
    int i = Array.getLength(paramObject);
    Type localType = .Gson.Types.getArrayComponentType(paramType);
    for (int j = 0; j < i; j++)
      addAsArrayElement(new ObjectTypePair(Array.get(paramObject, j), localType, false));
  }

  public void visitArrayField(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject)
  {
    try
    {
      if (isFieldNull(paramFieldAttributes, paramObject))
      {
        if (this.serializeNulls)
          addChildAsElement(paramFieldAttributes, JsonNull.createJsonNull());
      }
      else
      {
        addAsChildOfObject(paramFieldAttributes, new ObjectTypePair(getFieldValue(paramFieldAttributes, paramObject), paramType, false));
        return;
      }
    }
    catch (CircularReferenceException localCircularReferenceException)
    {
      throw localCircularReferenceException.createDetailedException(paramFieldAttributes);
    }
  }

  public boolean visitFieldUsingCustomHandler(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject)
  {
    try
    {
      .Gson.Preconditions.checkState(this.root.isJsonObject());
      Object localObject = paramFieldAttributes.get(paramObject);
      if (localObject == null)
      {
        if (this.serializeNulls)
        {
          addChildAsElement(paramFieldAttributes, JsonNull.createJsonNull());
          return true;
        }
      }
      else
      {
        JsonElement localJsonElement = findAndInvokeCustomSerializer(new ObjectTypePair(localObject, paramType, false));
        if (localJsonElement != null)
        {
          addChildAsElement(paramFieldAttributes, localJsonElement);
          return true;
        }
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException();
      return false;
    }
    catch (CircularReferenceException localCircularReferenceException)
    {
      throw localCircularReferenceException.createDetailedException(paramFieldAttributes);
    }
    return true;
  }

  public void visitObjectField(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject)
  {
    try
    {
      if (isFieldNull(paramFieldAttributes, paramObject))
      {
        if (this.serializeNulls)
          addChildAsElement(paramFieldAttributes, JsonNull.createJsonNull());
      }
      else
      {
        addAsChildOfObject(paramFieldAttributes, new ObjectTypePair(getFieldValue(paramFieldAttributes, paramObject), paramType, false));
        return;
      }
    }
    catch (CircularReferenceException localCircularReferenceException)
    {
      throw localCircularReferenceException.createDetailedException(paramFieldAttributes);
    }
  }

  public void visitPrimitive(Object paramObject)
  {
    if (paramObject == null);
    for (Object localObject = JsonNull.createJsonNull(); ; localObject = new JsonPrimitive(paramObject))
    {
      assignToRoot((JsonElement)localObject);
      return;
    }
  }

  public boolean visitUsingCustomHandler(ObjectTypePair paramObjectTypePair)
  {
    boolean bool = true;
    try
    {
      if (paramObjectTypePair.getObject() == null)
      {
        if (!this.serializeNulls)
          break label54;
        assignToRoot(JsonNull.createJsonNull());
        return bool;
      }
      JsonElement localJsonElement = findAndInvokeCustomSerializer(paramObjectTypePair);
      if (localJsonElement != null)
      {
        assignToRoot(localJsonElement);
        return bool;
      }
    }
    catch (CircularReferenceException localCircularReferenceException)
    {
      throw localCircularReferenceException.createDetailedException(null);
    }
    bool = false;
    label54: return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.JsonSerializationVisitor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */