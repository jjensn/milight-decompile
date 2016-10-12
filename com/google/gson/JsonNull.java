package com.google.gson;

import java.io.IOException;

public final class JsonNull extends JsonElement
{
  private static final JsonNull INSTANCE = new JsonNull();

  public JsonNull()
  {
  }

  static JsonNull createJsonNull()
  {
    return INSTANCE;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || ((paramObject instanceof JsonNull));
  }

  public int hashCode()
  {
    return JsonNull.class.hashCode();
  }

  protected void toString(Appendable paramAppendable, Escaper paramEscaper)
    throws IOException
  {
    paramAppendable.append("null");
  }
}

/* Location:
 * Qualified Name:     com.google.gson.JsonNull
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */