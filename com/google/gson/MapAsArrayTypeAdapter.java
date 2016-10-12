package com.google.gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class MapAsArrayTypeAdapter extends BaseMapTypeAdapter
  implements JsonSerializer<Map<?, ?>>, JsonDeserializer<Map<?, ?>>
{
  MapAsArrayTypeAdapter()
  {
  }

  private void checkSize(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2)
  {
    if (paramInt1 != paramInt2)
      throw new JsonSyntaxException("Input size " + paramInt1 + " != output size " + paramInt2 + " for input " + paramObject1 + " and output " + paramObject2);
  }

  private Type[] typeToTypeArguments(Type paramType)
  {
    Type[] arrayOfType;
    if ((paramType instanceof ParameterizedType))
    {
      arrayOfType = ((ParameterizedType)paramType).getActualTypeArguments();
      if (arrayOfType.length != 2)
        throw new IllegalArgumentException("MapAsArrayTypeAdapter cannot handle " + paramType);
    }
    else
    {
      arrayOfType = new Type[] { Object.class, Object.class };
    }
    return arrayOfType;
  }

  public Map<?, ?> deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    Map localMap = constructMapType(paramType, paramJsonDeserializationContext);
    Type[] arrayOfType = typeToTypeArguments(paramType);
    if (paramJsonElement.isJsonArray())
    {
      JsonArray localJsonArray1 = paramJsonElement.getAsJsonArray();
      for (int i = 0; i < localJsonArray1.size(); i++)
      {
        JsonArray localJsonArray2 = localJsonArray1.get(i).getAsJsonArray();
        localMap.put(paramJsonDeserializationContext.deserialize(localJsonArray2.get(0), arrayOfType[0]), paramJsonDeserializationContext.deserialize(localJsonArray2.get(1), arrayOfType[1]));
      }
      checkSize(localJsonArray1, localJsonArray1.size(), localMap, localMap.size());
      return localMap;
    }
    JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
    Iterator localIterator = localJsonObject.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localMap.put(paramJsonDeserializationContext.deserialize(new JsonPrimitive((String)localEntry.getKey()), arrayOfType[0]), paramJsonDeserializationContext.deserialize((JsonElement)localEntry.getValue(), arrayOfType[1]));
    }
    checkSize(localJsonObject, localJsonObject.entrySet().size(), localMap, localMap.size());
    return localMap;
  }

  public JsonElement serialize(Map<?, ?> paramMap, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    Type[] arrayOfType = typeToTypeArguments(paramType);
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramMap.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      JsonElement localJsonElement = serialize(paramJsonSerializationContext, localEntry.getKey(), arrayOfType[0]);
      if ((localJsonElement.isJsonObject()) || (localJsonElement.isJsonArray()));
      for (int m = 1; ; m = 0)
      {
        i |= m;
        localArrayList.add(localJsonElement);
        localArrayList.add(serialize(paramJsonSerializationContext, localEntry.getValue(), arrayOfType[1]));
        break;
      }
    }
    if (i != 0)
    {
      localObject = new JsonArray();
      for (int j = 0; j < localArrayList.size(); j += 2)
      {
        JsonArray localJsonArray = new JsonArray();
        localJsonArray.add((JsonElement)localArrayList.get(j));
        localJsonArray.add((JsonElement)localArrayList.get(j + 1));
        ((JsonArray)localObject).add(localJsonArray);
      }
    }
    Object localObject = new JsonObject();
    for (int k = 0; k < localArrayList.size(); k += 2)
      ((JsonObject)localObject).add(((JsonElement)localArrayList.get(k)).getAsString(), (JsonElement)localArrayList.get(k + 1));
    checkSize(paramMap, paramMap.size(), localObject, ((JsonObject)localObject).entrySet().size());
    return localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.MapAsArrayTypeAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */