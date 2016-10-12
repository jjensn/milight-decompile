package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import java.io.IOException;

final class DelegatingJsonElementVisitor
  implements JsonElementVisitor
{
  private final JsonElementVisitor delegate;

  protected DelegatingJsonElementVisitor(JsonElementVisitor paramJsonElementVisitor)
  {
    this.delegate = ((JsonElementVisitor).Gson.Preconditions.checkNotNull(paramJsonElementVisitor));
  }

  public void endArray(JsonArray paramJsonArray)
    throws IOException
  {
    this.delegate.endArray(paramJsonArray);
  }

  public void endObject(JsonObject paramJsonObject)
    throws IOException
  {
    this.delegate.endObject(paramJsonObject);
  }

  public void startArray(JsonArray paramJsonArray)
    throws IOException
  {
    this.delegate.startArray(paramJsonArray);
  }

  public void startObject(JsonObject paramJsonObject)
    throws IOException
  {
    this.delegate.startObject(paramJsonObject);
  }

  public void visitArrayMember(JsonArray paramJsonArray1, JsonArray paramJsonArray2, boolean paramBoolean)
    throws IOException
  {
    this.delegate.visitArrayMember(paramJsonArray1, paramJsonArray2, paramBoolean);
  }

  public void visitArrayMember(JsonArray paramJsonArray, JsonObject paramJsonObject, boolean paramBoolean)
    throws IOException
  {
    this.delegate.visitArrayMember(paramJsonArray, paramJsonObject, paramBoolean);
  }

  public void visitArrayMember(JsonArray paramJsonArray, JsonPrimitive paramJsonPrimitive, boolean paramBoolean)
    throws IOException
  {
    this.delegate.visitArrayMember(paramJsonArray, paramJsonPrimitive, paramBoolean);
  }

  public void visitNull()
    throws IOException
  {
    this.delegate.visitNull();
  }

  public void visitNullArrayMember(JsonArray paramJsonArray, boolean paramBoolean)
    throws IOException
  {
    this.delegate.visitNullArrayMember(paramJsonArray, paramBoolean);
  }

  public void visitNullObjectMember(JsonObject paramJsonObject, String paramString, boolean paramBoolean)
    throws IOException
  {
    this.delegate.visitNullObjectMember(paramJsonObject, paramString, paramBoolean);
  }

  public void visitObjectMember(JsonObject paramJsonObject, String paramString, JsonArray paramJsonArray, boolean paramBoolean)
    throws IOException
  {
    this.delegate.visitObjectMember(paramJsonObject, paramString, paramJsonArray, paramBoolean);
  }

  public void visitObjectMember(JsonObject paramJsonObject1, String paramString, JsonObject paramJsonObject2, boolean paramBoolean)
    throws IOException
  {
    this.delegate.visitObjectMember(paramJsonObject1, paramString, paramJsonObject2, paramBoolean);
  }

  public void visitObjectMember(JsonObject paramJsonObject, String paramString, JsonPrimitive paramJsonPrimitive, boolean paramBoolean)
    throws IOException
  {
    this.delegate.visitObjectMember(paramJsonObject, paramString, paramJsonPrimitive, paramBoolean);
  }

  public void visitPrimitive(JsonPrimitive paramJsonPrimitive)
    throws IOException
  {
    this.delegate.visitPrimitive(paramJsonPrimitive);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.DelegatingJsonElementVisitor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */