package com.google.gson;

import com.google.gson.internal..Gson.Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.Type;;
import java.util.Collection;
import java.util.Iterator;

final class DefaultTypeAdapters$CollectionTypeAdapter
  implements JsonSerializer<Collection>, JsonDeserializer<Collection>
{
  private DefaultTypeAdapters$CollectionTypeAdapter()
  {
  }

  private Collection constructCollectionType(Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
  {
    return (Collection)((JsonDeserializationContextDefault)paramJsonDeserializationContext).getObjectConstructor().construct(paramType);
  }

  public Collection deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    Collection localCollection;
    if (paramJsonElement.isJsonNull())
      localCollection = null;
    while (true)
    {
      return localCollection;
      localCollection = constructCollectionType(paramType, paramJsonDeserializationContext);
      Type localType = .Gson.Types.getCollectionElementType(paramType, .Gson.Types.getRawType(paramType));
      Iterator localIterator = paramJsonElement.getAsJsonArray().iterator();
      while (localIterator.hasNext())
      {
        JsonElement localJsonElement = (JsonElement)localIterator.next();
        if ((localJsonElement == null) || (localJsonElement.isJsonNull()))
          localCollection.add(null);
        else
          localCollection.add(paramJsonDeserializationContext.deserialize(localJsonElement, localType));
      }
    }
  }

  public JsonElement serialize(Collection paramCollection, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    if (paramCollection == null)
    {
      localObject1 = JsonNull.createJsonNull();
      return localObject1;
    }
    Object localObject1 = new JsonArray();
    boolean bool = paramType instanceof ParameterizedType;
    Type localType = null;
    if (bool)
      localType = .Gson.Types.getCollectionElementType(paramType, .Gson.Types.getRawType(paramType));
    Iterator localIterator = paramCollection.iterator();
    label53: Object localObject2;
    while (localIterator.hasNext())
    {
      localObject2 = localIterator.next();
      if (localObject2 == null)
        ((JsonArray)localObject1).add(JsonNull.createJsonNull());
      else
        if ((localType != null) && (localType != Object.class))
          break label125;
    }
    label125: for (Object localObject3 = localObject2.getClass(); ; localObject3 = localType)
    {
      ((JsonArray)localObject1).add(paramJsonSerializationContext.serialize(localObject2, (Type)localObject3));
      break label53;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DefaultTypeAdapters.CollectionTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */