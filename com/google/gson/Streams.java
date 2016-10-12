package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class Streams
{
  Streams()
  {
  }

  static JsonElement parse(JsonReader paramJsonReader)
    throws JsonParseException
  {
    i = 1;
    try
    {
      paramJsonReader.peek();
      i = 0;
      JsonElement localJsonElement = parseRecursive(paramJsonReader);
      return localJsonElement;
    }
    catch (EOFException localEOFException)
    {
      if (i != 0)
        return JsonNull.createJsonNull();
      throw new JsonIOException(localEOFException);
    }
    catch (MalformedJsonException localMalformedJsonException)
    {
      throw new JsonSyntaxException(localMalformedJsonException);
    }
    catch (IOException localIOException)
    {
      throw new JsonIOException(localIOException);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new JsonSyntaxException(localNumberFormatException);
    }
  }

  private static JsonElement parseRecursive(JsonReader paramJsonReader)
    throws IOException
  {
    switch (1.$SwitchMap$com$google$gson$stream$JsonToken[paramJsonReader.peek().ordinal()])
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      return new JsonPrimitive(paramJsonReader.nextString());
    case 2:
      return new JsonPrimitive(JsonPrimitive.stringToNumber(paramJsonReader.nextString()));
    case 3:
      return new JsonPrimitive(Boolean.valueOf(paramJsonReader.nextBoolean()));
    case 4:
      paramJsonReader.nextNull();
      return JsonNull.createJsonNull();
    case 5:
      JsonArray localJsonArray = new JsonArray();
      paramJsonReader.beginArray();
      while (paramJsonReader.hasNext())
        localJsonArray.add(parseRecursive(paramJsonReader));
      paramJsonReader.endArray();
      return localJsonArray;
    case 6:
    }
    JsonObject localJsonObject = new JsonObject();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
      localJsonObject.add(paramJsonReader.nextName(), parseRecursive(paramJsonReader));
    paramJsonReader.endObject();
    return localJsonObject;
  }

  static void write(JsonElement paramJsonElement, boolean paramBoolean, JsonWriter paramJsonWriter)
    throws IOException
  {
    if ((paramJsonElement == null) || (paramJsonElement.isJsonNull()))
    {
      if (paramBoolean)
        paramJsonWriter.nullValue();
      return;
    }
    if (paramJsonElement.isJsonPrimitive())
    {
      JsonPrimitive localJsonPrimitive = paramJsonElement.getAsJsonPrimitive();
      if (localJsonPrimitive.isNumber())
      {
        paramJsonWriter.value(localJsonPrimitive.getAsNumber());
        return;
      }
      if (localJsonPrimitive.isBoolean())
      {
        paramJsonWriter.value(localJsonPrimitive.getAsBoolean());
        return;
      }
      paramJsonWriter.value(localJsonPrimitive.getAsString());
      return;
    }
    if (paramJsonElement.isJsonArray())
    {
      paramJsonWriter.beginArray();
      Iterator localIterator2 = paramJsonElement.getAsJsonArray().iterator();
      while (localIterator2.hasNext())
      {
        JsonElement localJsonElement2 = (JsonElement)localIterator2.next();
        if (localJsonElement2.isJsonNull())
          paramJsonWriter.nullValue();
        else
          write(localJsonElement2, paramBoolean, paramJsonWriter);
      }
      paramJsonWriter.endArray();
      return;
    }
    if (paramJsonElement.isJsonObject())
    {
      paramJsonWriter.beginObject();
      Iterator localIterator1 = paramJsonElement.getAsJsonObject().entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        JsonElement localJsonElement1 = (JsonElement)localEntry.getValue();
        if ((paramBoolean) || (!localJsonElement1.isJsonNull()))
        {
          paramJsonWriter.name((String)localEntry.getKey());
          write(localJsonElement1, paramBoolean, paramJsonWriter);
        }
      }
      paramJsonWriter.endObject();
      return;
    }
    throw new IllegalArgumentException("Couldn't write " + paramJsonElement.getClass());
  }

  static Writer writerForAppendable(Appendable paramAppendable)
  {
    if ((paramAppendable instanceof Writer))
      return (Writer)paramAppendable;
    return new AppendableWriter(paramAppendable, null);
  }

  private static class AppendableWriter extends Writer
  {
    private final Appendable appendable;
    private final CurrentWrite currentWrite = new CurrentWrite();

    private AppendableWriter(Appendable paramAppendable)
    {
      this.appendable = paramAppendable;
    }

    public void close()
    {
    }

    public void flush()
    {
    }

    public void write(int paramInt)
      throws IOException
    {
      this.appendable.append((char)paramInt);
    }

    public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
      throws IOException
    {
      this.currentWrite.chars = paramArrayOfChar;
      this.appendable.append(this.currentWrite, paramInt1, paramInt1 + paramInt2);
    }

    static class CurrentWrite
      implements CharSequence
    {
      char[] chars;

      CurrentWrite()
      {
      }

      public char charAt(int paramInt)
      {
        return this.chars[paramInt];
      }

      public int length()
      {
        return this.chars.length;
      }

      public CharSequence subSequence(int paramInt1, int paramInt2)
      {
        return new String(this.chars, paramInt1, paramInt2 - paramInt1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.Streams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */