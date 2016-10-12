package com.google.gson;

import com.google.gson.internal..Gson.Types;
import java.lang.reflect.Array;
import java.lang.reflect.Type;

final class JsonArrayDeserializationVisitor<T> extends JsonDeserializationVisitor<T>
{
  JsonArrayDeserializationVisitor(JsonArray paramJsonArray, Type paramType, ObjectNavigator paramObjectNavigator, FieldNamingStrategy2 paramFieldNamingStrategy2, ObjectConstructor paramObjectConstructor, ParameterizedTypeHandlerMap<JsonDeserializer<?>> paramParameterizedTypeHandlerMap, JsonDeserializationContext paramJsonDeserializationContext)
  {
    super(paramJsonArray, paramType, paramObjectNavigator, paramFieldNamingStrategy2, paramObjectConstructor, paramParameterizedTypeHandlerMap, paramJsonDeserializationContext);
  }

  protected T constructTarget()
  {
    if (!this.json.isJsonArray())
      throw new JsonParseException("Expecting array found: " + this.json);
    JsonArray localJsonArray = this.json.getAsJsonArray();
    if (.Gson.Types.isArray(this.targetType))
      return this.objectConstructor.constructArray(.Gson.Types.getArrayComponentType(this.targetType), localJsonArray.size());
    return this.objectConstructor.construct(.Gson.Types.getRawType(this.targetType));
  }

  public void startVisitingObject(Object paramObject)
  {
    throw new JsonParseException("Expecting array but found object: " + paramObject);
  }

  public void visitArray(Object paramObject, Type paramType)
  {
    if (!this.json.isJsonArray())
      throw new JsonParseException("Expecting array found: " + this.json);
    JsonArray localJsonArray = this.json.getAsJsonArray();
    int i = 0;
    if (i < localJsonArray.size())
    {
      JsonElement localJsonElement = localJsonArray.get(i);
      Object localObject;
      if ((localJsonElement == null) || (localJsonElement.isJsonNull()))
        localObject = null;
      while (true)
      {
        Array.set(paramObject, i, localObject);
        i++;
        break;
        if ((localJsonElement instanceof JsonObject))
        {
          localObject = visitChildAsObject(.Gson.Types.getArrayComponentType(paramType), localJsonElement);
        }
        else if ((localJsonElement instanceof JsonArray))
        {
          localObject = visitChildAsArray(.Gson.Types.getArrayComponentType(paramType), localJsonElement.getAsJsonArray());
        }
        else
        {
          if (!(localJsonElement instanceof JsonPrimitive))
            break label173;
          localObject = visitChildAsObject(.Gson.Types.getArrayComponentType(paramType), localJsonElement.getAsJsonPrimitive());
        }
      }
      label173: throw new IllegalStateException();
    }
  }

  public void visitArrayField(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject)
  {
    throw new JsonParseException("Expecting array but found array field " + paramFieldAttributes.getName() + ": " + paramObject);
  }

  public boolean visitFieldUsingCustomHandler(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject)
  {
    throw new JsonParseException("Expecting array but found field " + paramFieldAttributes.getName() + ": " + paramObject);
  }

  public void visitObjectField(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject)
  {
    throw new JsonParseException("Expecting array but found object field " + paramFieldAttributes.getName() + ": " + paramObject);
  }

  public void visitPrimitive(Object paramObject)
  {
    throw new JsonParseException("Type information is unavailable, and the target is not a primitive: " + this.json);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.JsonArrayDeserializationVisitor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */