package com.google.gson;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class JsonTreeNavigator
{
  private final boolean visitNulls;
  private final JsonElementVisitor visitor;

  JsonTreeNavigator(JsonElementVisitor paramJsonElementVisitor, boolean paramBoolean)
  {
    this.visitor = paramJsonElementVisitor;
    this.visitNulls = paramBoolean;
  }

  private void visitChild(JsonArray paramJsonArray, JsonElement paramJsonElement, boolean paramBoolean)
    throws IOException
  {
    if (paramJsonElement.isJsonNull())
    {
      this.visitor.visitNullArrayMember(paramJsonArray, paramBoolean);
      navigate(paramJsonElement);
      return;
    }
    if (paramJsonElement.isJsonArray())
    {
      JsonArray localJsonArray = paramJsonElement.getAsJsonArray();
      this.visitor.visitArrayMember(paramJsonArray, localJsonArray, paramBoolean);
      navigate(localJsonArray);
      return;
    }
    if (paramJsonElement.isJsonObject())
    {
      JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
      this.visitor.visitArrayMember(paramJsonArray, localJsonObject, paramBoolean);
      navigate(localJsonObject);
      return;
    }
    this.visitor.visitArrayMember(paramJsonArray, paramJsonElement.getAsJsonPrimitive(), paramBoolean);
  }

  private boolean visitChild(JsonObject paramJsonObject, String paramString, JsonElement paramJsonElement, boolean paramBoolean)
    throws IOException
  {
    if (paramJsonElement.isJsonNull())
      if (this.visitNulls)
      {
        this.visitor.visitNullObjectMember(paramJsonObject, paramString, paramBoolean);
        navigate(paramJsonElement.getAsJsonNull());
      }
    while (true)
    {
      return true;
      return false;
      if (paramJsonElement.isJsonArray())
      {
        JsonArray localJsonArray = paramJsonElement.getAsJsonArray();
        this.visitor.visitObjectMember(paramJsonObject, paramString, localJsonArray, paramBoolean);
        navigate(localJsonArray);
      }
      else if (paramJsonElement.isJsonObject())
      {
        JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
        this.visitor.visitObjectMember(paramJsonObject, paramString, localJsonObject, paramBoolean);
        navigate(localJsonObject);
      }
      else
      {
        this.visitor.visitObjectMember(paramJsonObject, paramString, paramJsonElement.getAsJsonPrimitive(), paramBoolean);
      }
    }
  }

  public void navigate(JsonElement paramJsonElement)
    throws IOException
  {
    if (paramJsonElement.isJsonNull())
    {
      this.visitor.visitNull();
      return;
    }
    if (paramJsonElement.isJsonArray())
    {
      JsonArray localJsonArray = paramJsonElement.getAsJsonArray();
      this.visitor.startArray(localJsonArray);
      boolean bool2 = true;
      Iterator localIterator2 = localJsonArray.iterator();
      while (localIterator2.hasNext())
      {
        visitChild(localJsonArray, (JsonElement)localIterator2.next(), bool2);
        if (bool2)
          bool2 = false;
      }
      this.visitor.endArray(localJsonArray);
      return;
    }
    if (paramJsonElement.isJsonObject())
    {
      JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
      this.visitor.startObject(localJsonObject);
      boolean bool1 = true;
      Iterator localIterator1 = localJsonObject.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        if ((visitChild(localJsonObject, (String)localEntry.getKey(), (JsonElement)localEntry.getValue(), bool1)) && (bool1))
          bool1 = false;
      }
      this.visitor.endObject(localJsonObject);
      return;
    }
    this.visitor.visitPrimitive(paramJsonElement.getAsJsonPrimitive());
  }
}

/* Location:
 * Qualified Name:     com.google.gson.JsonTreeNavigator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */