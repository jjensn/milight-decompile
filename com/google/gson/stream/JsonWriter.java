package com.google.gson.stream;

import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class JsonWriter
  implements Closeable
{
  private boolean htmlSafe;
  private String indent;
  private boolean lenient;
  private final Writer out;
  private String separator;
  private final List<JsonScope> stack = new ArrayList();

  public JsonWriter(Writer paramWriter)
  {
    this.stack.add(JsonScope.EMPTY_DOCUMENT);
    this.separator = ":";
    if (paramWriter == null)
      throw new NullPointerException("out == null");
    this.out = paramWriter;
  }

  private void beforeName()
    throws IOException
  {
    JsonScope localJsonScope = peek();
    if (localJsonScope == JsonScope.NONEMPTY_OBJECT)
      this.out.write(44);
    while (localJsonScope == JsonScope.EMPTY_OBJECT)
    {
      newline();
      replaceTop(JsonScope.DANGLING_NAME);
      return;
    }
    throw new IllegalStateException("Nesting problem: " + this.stack);
  }

  private void beforeValue(boolean paramBoolean)
    throws IOException
  {
    switch (1.$SwitchMap$com$google$gson$stream$JsonScope[peek().ordinal()])
    {
    default:
      throw new IllegalStateException("Nesting problem: " + this.stack);
    case 1:
      if ((!this.lenient) && (!paramBoolean))
        throw new IllegalStateException("JSON must start with an array or an object.");
      replaceTop(JsonScope.NONEMPTY_DOCUMENT);
      return;
    case 2:
      replaceTop(JsonScope.NONEMPTY_ARRAY);
      newline();
      return;
    case 3:
      this.out.append((char)',');
      newline();
      return;
    case 4:
      this.out.append(this.separator);
      replaceTop(JsonScope.NONEMPTY_OBJECT);
      return;
    case 5:
    }
    throw new IllegalStateException("JSON must have only one top-level value.");
  }

  private JsonWriter close(JsonScope paramJsonScope1, JsonScope paramJsonScope2, String paramString)
    throws IOException
  {
    JsonScope localJsonScope = peek();
    if ((localJsonScope != paramJsonScope2) && (localJsonScope != paramJsonScope1))
      throw new IllegalStateException("Nesting problem: " + this.stack);
    this.stack.remove(-1 + this.stack.size());
    if (localJsonScope == paramJsonScope2)
      newline();
    this.out.write(paramString);
    return this;
  }

  private void newline()
    throws IOException
  {
    if (this.indent == null);
    while (true)
    {
      return;
      this.out.write("\n");
      for (int i = 1; i < this.stack.size(); i++)
        this.out.write(this.indent);
    }
  }

  private JsonWriter open(JsonScope paramJsonScope, String paramString)
    throws IOException
  {
    beforeValue(true);
    this.stack.add(paramJsonScope);
    this.out.write(paramString);
    return this;
  }

  private JsonScope peek()
  {
    return (JsonScope)this.stack.get(-1 + this.stack.size());
  }

  private void replaceTop(JsonScope paramJsonScope)
  {
    this.stack.set(-1 + this.stack.size(), paramJsonScope);
  }

  private void string(String paramString)
    throws IOException
  {
    this.out.write("\"");
    int i = 0;
    int j = paramString.length();
    if (i < j)
    {
      int k = paramString.charAt(i);
      switch (k)
      {
      default:
        if (k <= 31)
        {
          Writer localWriter2 = this.out;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(k);
          localWriter2.write(String.format("\\u%04x", arrayOfObject2));
        }
      case 34:
      case 92:
      case 9:
      case 8:
      case 10:
      case 13:
      case 12:
      case 38:
      case 39:
      case 60:
      case 61:
      case 62:
      }
      while (true)
      {
        i++;
        break;
        this.out.write(92);
        this.out.write(k);
        continue;
        this.out.write("\\t");
        continue;
        this.out.write("\\b");
        continue;
        this.out.write("\\n");
        continue;
        this.out.write("\\r");
        continue;
        this.out.write("\\f");
        continue;
        if (this.htmlSafe)
        {
          Writer localWriter1 = this.out;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(k);
          localWriter1.write(String.format("\\u%04x", arrayOfObject1));
        }
        else
        {
          this.out.write(k);
          continue;
          this.out.write(k);
        }
      }
    }
    this.out.write("\"");
  }

  public JsonWriter beginArray()
    throws IOException
  {
    return open(JsonScope.EMPTY_ARRAY, "[");
  }

  public JsonWriter beginObject()
    throws IOException
  {
    return open(JsonScope.EMPTY_OBJECT, "{");
  }

  public void close()
    throws IOException
  {
    this.out.close();
    if (peek() != JsonScope.NONEMPTY_DOCUMENT)
      throw new IOException("Incomplete document");
  }

  public JsonWriter endArray()
    throws IOException
  {
    return close(JsonScope.EMPTY_ARRAY, JsonScope.NONEMPTY_ARRAY, "]");
  }

  public JsonWriter endObject()
    throws IOException
  {
    return close(JsonScope.EMPTY_OBJECT, JsonScope.NONEMPTY_OBJECT, "}");
  }

  public void flush()
    throws IOException
  {
    this.out.flush();
  }

  public boolean isHtmlSafe()
  {
    return this.htmlSafe;
  }

  public boolean isLenient()
  {
    return this.lenient;
  }

  public JsonWriter name(String paramString)
    throws IOException
  {
    if (paramString == null)
      throw new NullPointerException("name == null");
    beforeName();
    string(paramString);
    return this;
  }

  public JsonWriter nullValue()
    throws IOException
  {
    beforeValue(false);
    this.out.write("null");
    return this;
  }

  public void setHtmlSafe(boolean paramBoolean)
  {
    this.htmlSafe = paramBoolean;
  }

  public void setIndent(String paramString)
  {
    if (paramString.length() == 0)
    {
      this.indent = null;
      this.separator = ":";
      return;
    }
    this.indent = paramString;
    this.separator = ": ";
  }

  public void setLenient(boolean paramBoolean)
  {
    this.lenient = paramBoolean;
  }

  public JsonWriter value(double paramDouble)
    throws IOException
  {
    if ((Double.isNaN(paramDouble)) || (Double.isInfinite(paramDouble)))
      throw new IllegalArgumentException("Numeric values must be finite, but was " + paramDouble);
    beforeValue(false);
    this.out.append(Double.toString(paramDouble));
    return this;
  }

  public JsonWriter value(long paramLong)
    throws IOException
  {
    beforeValue(false);
    this.out.write(Long.toString(paramLong));
    return this;
  }

  public JsonWriter value(Number paramNumber)
    throws IOException
  {
    if (paramNumber == null)
      return nullValue();
    String str = paramNumber.toString();
    if ((!this.lenient) && ((str.equals("-Infinity")) || (str.equals("Infinity")) || (str.equals("NaN"))))
      throw new IllegalArgumentException("Numeric values must be finite, but was " + paramNumber);
    beforeValue(false);
    this.out.append(str);
    return this;
  }

  public JsonWriter value(String paramString)
    throws IOException
  {
    if (paramString == null)
      return nullValue();
    beforeValue(false);
    string(paramString);
    return this;
  }

  public JsonWriter value(boolean paramBoolean)
    throws IOException
  {
    beforeValue(false);
    Writer localWriter = this.out;
    if (paramBoolean);
    for (String str = "true"; ; str = "false")
    {
      localWriter.write(str);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.stream.JsonWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */