package com.google.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public final class JsonReader
  implements Closeable
{
  private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
  private final char[] buffer = new char[1024];
  private boolean hasToken;
  private final Reader in;
  private boolean lenient = false;
  private int limit = 0;
  private String name;
  private int pos = 0;
  private boolean skipping;
  private final List<JsonScope> stack = new ArrayList();
  private JsonToken token;
  private String value;

  public JsonReader(Reader paramReader)
  {
    push(JsonScope.EMPTY_DOCUMENT);
    this.skipping = false;
    if (paramReader == null)
      throw new NullPointerException("in == null");
    this.in = paramReader;
  }

  private JsonToken advance()
    throws IOException
  {
    quickPeek();
    JsonToken localJsonToken = this.token;
    this.hasToken = false;
    this.token = null;
    this.value = null;
    this.name = null;
    return localJsonToken;
  }

  private void checkLenient()
    throws IOException
  {
    if (!this.lenient)
      throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
  }

  private void consumeNonExecutePrefix()
    throws IOException
  {
    nextNonWhitespace();
    this.pos = (-1 + this.pos);
    if ((this.pos + NON_EXECUTE_PREFIX.length > this.limit) && (!fillBuffer(NON_EXECUTE_PREFIX.length)))
      return;
    for (int i = 0; ; i++)
    {
      if (i >= NON_EXECUTE_PREFIX.length)
        break label78;
      if (this.buffer[(i + this.pos)] != NON_EXECUTE_PREFIX[i])
        break;
    }
    label78: this.pos += NON_EXECUTE_PREFIX.length;
  }

  private void decodeLiteral()
    throws IOException
  {
    if (this.value.equalsIgnoreCase("null"))
    {
      this.token = JsonToken.NULL;
      return;
    }
    if ((this.value.equalsIgnoreCase("true")) || (this.value.equalsIgnoreCase("false")))
    {
      this.token = JsonToken.BOOLEAN;
      return;
    }
    try
    {
      Double.parseDouble(this.value);
      this.token = JsonToken.NUMBER;
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      checkLenient();
      this.token = JsonToken.STRING;
    }
  }

  private void expect(JsonToken paramJsonToken)
    throws IOException
  {
    quickPeek();
    if (this.token != paramJsonToken)
      throw new IllegalStateException("Expected " + paramJsonToken + " but was " + peek());
    advance();
  }

  private boolean fillBuffer(int paramInt)
    throws IOException
  {
    if (this.limit != this.pos)
    {
      this.limit -= this.pos;
      System.arraycopy(this.buffer, this.pos, this.buffer, 0, this.limit);
    }
    while (true)
    {
      this.pos = 0;
      do
      {
        int i = this.in.read(this.buffer, this.limit, this.buffer.length - this.limit);
        bool = false;
        if (i == -1)
          break;
        this.limit = (i + this.limit);
      }
      while (this.limit < paramInt);
      boolean bool = true;
      return bool;
      this.limit = 0;
    }
  }

  private CharSequence getSnippet()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = Math.min(this.pos, 20);
    localStringBuilder.append(this.buffer, this.pos - i, i);
    int j = Math.min(this.limit - this.pos, 20);
    localStringBuilder.append(this.buffer, this.pos, j);
    return localStringBuilder;
  }

  private JsonToken nextInArray(boolean paramBoolean)
    throws IOException
  {
    if (paramBoolean)
      replaceTop(JsonScope.NONEMPTY_ARRAY);
    while (true)
      switch (nextNonWhitespace())
      {
      default:
        this.pos = (-1 + this.pos);
        return nextValue();
        switch (nextNonWhitespace())
        {
        case 44:
        default:
          throw syntaxError("Unterminated array");
        case 93:
          pop();
          this.hasToken = true;
          JsonToken localJsonToken3 = JsonToken.END_ARRAY;
          this.token = localJsonToken3;
          return localJsonToken3;
        case 59:
        }
        checkLenient();
      case 93:
      case 44:
      case 59:
      }
    if (paramBoolean)
    {
      pop();
      this.hasToken = true;
      JsonToken localJsonToken2 = JsonToken.END_ARRAY;
      this.token = localJsonToken2;
      return localJsonToken2;
    }
    checkLenient();
    this.pos = (-1 + this.pos);
    this.hasToken = true;
    this.value = "null";
    JsonToken localJsonToken1 = JsonToken.NULL;
    this.token = localJsonToken1;
    return localJsonToken1;
  }

  private JsonToken nextInObject(boolean paramBoolean)
    throws IOException
  {
    int i;
    if (paramBoolean)
    {
      switch (nextNonWhitespace())
      {
      default:
        this.pos = (-1 + this.pos);
        i = nextNonWhitespace();
        switch (i)
        {
        default:
          checkLenient();
          this.pos = (-1 + this.pos);
          this.name = nextLiteral();
          if (this.name.length() != 0)
            break label215;
          throw syntaxError("Expected name");
        case 39:
        case 34:
        }
      case 125:
        pop();
        this.hasToken = true;
        JsonToken localJsonToken3 = JsonToken.END_OBJECT;
        this.token = localJsonToken3;
        return localJsonToken3;
      }
    }
    else
    {
      switch (nextNonWhitespace())
      {
      case 44:
      case 59:
      default:
        throw syntaxError("Unterminated object");
      case 125:
      }
      pop();
      this.hasToken = true;
      JsonToken localJsonToken1 = JsonToken.END_OBJECT;
      this.token = localJsonToken1;
      return localJsonToken1;
      checkLenient();
      this.name = nextString((char)i);
    }
    label215: replaceTop(JsonScope.DANGLING_NAME);
    this.hasToken = true;
    JsonToken localJsonToken2 = JsonToken.NAME;
    this.token = localJsonToken2;
    return localJsonToken2;
  }

  private String nextLiteral()
    throws IOException
  {
    StringBuilder localStringBuilder = null;
    do
    {
      int i = this.pos;
      while (this.pos < this.limit)
      {
        char[] arrayOfChar = this.buffer;
        int j = this.pos;
        this.pos = (j + 1);
        switch (arrayOfChar[j])
        {
        default:
          break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
        case ',':
        case ':':
        case '[':
        case ']':
        case '{':
        case '}':
        case '#':
        case '/':
        case ';':
        case '=':
        case '\\':
          while (true)
          {
            this.pos = (-1 + this.pos);
            if (!this.skipping)
              break;
            return "skipped!";
            checkLenient();
          }
          if (localStringBuilder == null)
            return new String(this.buffer, i, this.pos - i);
          localStringBuilder.append(this.buffer, i, this.pos - i);
          return localStringBuilder.toString();
        }
      }
      if (localStringBuilder == null)
        localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.buffer, i, this.pos - i);
    }
    while (fillBuffer(1));
    return localStringBuilder.toString();
  }

  private int nextNonWhitespace()
    throws IOException
  {
    while ((this.pos < this.limit) || (fillBuffer(1)))
    {
      char[] arrayOfChar = this.buffer;
      int i = this.pos;
      this.pos = (i + 1);
      int j = arrayOfChar[i];
      switch (j)
      {
      case 9:
      case 10:
      case 13:
      case 32:
      default:
      case 47:
        do
          return j;
        while ((this.pos == this.limit) && (!fillBuffer(1)));
        checkLenient();
        switch (this.buffer[this.pos])
        {
        default:
          return j;
        case '*':
          this.pos = (1 + this.pos);
          if (!skipTo("*/"))
            throw syntaxError("Unterminated comment");
          this.pos = (2 + this.pos);
          break;
        case '/':
        }
        this.pos = (1 + this.pos);
        skipToEndOfLine();
        break;
      case 35:
      }
      checkLenient();
      skipToEndOfLine();
    }
    throw new EOFException("End of input");
  }

  private String nextString(char paramChar)
    throws IOException
  {
    StringBuilder localStringBuilder = null;
    do
    {
      int i = this.pos;
      while (this.pos < this.limit)
      {
        char[] arrayOfChar = this.buffer;
        int j = this.pos;
        this.pos = (j + 1);
        char c = arrayOfChar[j];
        if (c == paramChar)
        {
          if (this.skipping)
            return "skipped!";
          if (localStringBuilder == null)
            return new String(this.buffer, i, -1 + (this.pos - i));
          localStringBuilder.append(this.buffer, i, -1 + (this.pos - i));
          return localStringBuilder.toString();
        }
        if (c == '\\')
        {
          if (localStringBuilder == null)
            localStringBuilder = new StringBuilder();
          localStringBuilder.append(this.buffer, i, -1 + (this.pos - i));
          localStringBuilder.append(readEscapeCharacter());
          i = this.pos;
        }
      }
      if (localStringBuilder == null)
        localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.buffer, i, this.pos - i);
    }
    while (fillBuffer(1));
    throw syntaxError("Unterminated string");
  }

  private JsonToken nextValue()
    throws IOException
  {
    int i = nextNonWhitespace();
    switch (i)
    {
    default:
      this.pos = (-1 + this.pos);
      return readLiteral();
    case 123:
      push(JsonScope.EMPTY_OBJECT);
      this.hasToken = true;
      JsonToken localJsonToken3 = JsonToken.BEGIN_OBJECT;
      this.token = localJsonToken3;
      return localJsonToken3;
    case 91:
      push(JsonScope.EMPTY_ARRAY);
      this.hasToken = true;
      JsonToken localJsonToken2 = JsonToken.BEGIN_ARRAY;
      this.token = localJsonToken2;
      return localJsonToken2;
    case 39:
      checkLenient();
    case 34:
    }
    this.value = nextString((char)i);
    this.hasToken = true;
    JsonToken localJsonToken1 = JsonToken.STRING;
    this.token = localJsonToken1;
    return localJsonToken1;
  }

  private JsonToken objectValue()
    throws IOException
  {
    switch (nextNonWhitespace())
    {
    case 59:
    case 60:
    default:
      throw syntaxError("Expected ':'");
    case 61:
      checkLenient();
      if (((this.pos < this.limit) || (fillBuffer(1))) && (this.buffer[this.pos] == '>'))
        this.pos = (1 + this.pos);
    case 58:
    }
    replaceTop(JsonScope.NONEMPTY_OBJECT);
    return nextValue();
  }

  private JsonScope peekStack()
  {
    return (JsonScope)this.stack.get(-1 + this.stack.size());
  }

  private JsonScope pop()
  {
    return (JsonScope)this.stack.remove(-1 + this.stack.size());
  }

  private void push(JsonScope paramJsonScope)
  {
    this.stack.add(paramJsonScope);
  }

  private JsonToken quickPeek()
    throws IOException
  {
    JsonToken localJsonToken3;
    if (this.hasToken)
      localJsonToken3 = this.token;
    do
    {
      return localJsonToken3;
      switch (1.$SwitchMap$com$google$gson$stream$JsonScope[peekStack().ordinal()])
      {
      default:
        throw new AssertionError();
      case 1:
        if (this.lenient)
          consumeNonExecutePrefix();
        replaceTop(JsonScope.NONEMPTY_DOCUMENT);
        localJsonToken3 = nextValue();
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      }
    }
    while ((this.lenient) || (localJsonToken3 == JsonToken.BEGIN_ARRAY) || (localJsonToken3 == JsonToken.BEGIN_OBJECT));
    syntaxError("Expected JSON document to start with '[' or '{'");
    return localJsonToken3;
    return nextInArray(true);
    return nextInArray(false);
    return nextInObject(true);
    return objectValue();
    return nextInObject(false);
    try
    {
      JsonToken localJsonToken2 = nextValue();
      if (this.lenient)
        return localJsonToken2;
      throw syntaxError("Expected EOF");
    }
    catch (EOFException localEOFException)
    {
      this.hasToken = true;
      JsonToken localJsonToken1 = JsonToken.END_DOCUMENT;
      this.token = localJsonToken1;
      return localJsonToken1;
    }
    throw new IllegalStateException("JsonReader is closed");
  }

  private char readEscapeCharacter()
    throws IOException
  {
    if ((this.pos == this.limit) && (!fillBuffer(1)))
      throw syntaxError("Unterminated escape sequence");
    char[] arrayOfChar = this.buffer;
    int i = this.pos;
    this.pos = (i + 1);
    char c = arrayOfChar[i];
    switch (c)
    {
    default:
      return c;
    case 'u':
      if ((4 + this.pos > this.limit) && (!fillBuffer(4)))
        throw syntaxError("Unterminated escape sequence");
      String str = new String(this.buffer, this.pos, 4);
      this.pos = (4 + this.pos);
      return (char)Integer.parseInt(str, 16);
    case 't':
      return '\t';
    case 'b':
      return '\b';
    case 'n':
      return '\n';
    case 'r':
      return '\r';
    case 'f':
    }
    return '\f';
  }

  private JsonToken readLiteral()
    throws IOException
  {
    String str = nextLiteral();
    if (str.length() == 0)
      throw syntaxError("Expected literal value");
    this.value = str;
    this.hasToken = true;
    this.token = null;
    return null;
  }

  private void replaceTop(JsonScope paramJsonScope)
  {
    this.stack.set(-1 + this.stack.size(), paramJsonScope);
  }

  private boolean skipTo(String paramString)
    throws IOException
  {
    if ((this.pos + paramString.length() < this.limit) || (fillBuffer(paramString.length())))
    {
      for (int i = 0; ; i++)
      {
        if (i >= paramString.length())
          break label75;
        if (this.buffer[(i + this.pos)] != paramString.charAt(i))
        {
          this.pos = (1 + this.pos);
          break;
        }
      }
      label75: return true;
    }
    return false;
  }

  private void skipToEndOfLine()
    throws IOException
  {
    int j;
    do
    {
      if ((this.pos >= this.limit) && (!fillBuffer(1)))
        break;
      char[] arrayOfChar = this.buffer;
      int i = this.pos;
      this.pos = (i + 1);
      j = arrayOfChar[i];
    }
    while ((j != 13) && (j != 10));
  }

  private IOException syntaxError(String paramString)
    throws IOException
  {
    throw new MalformedJsonException(paramString + " near " + getSnippet());
  }

  public void beginArray()
    throws IOException
  {
    expect(JsonToken.BEGIN_ARRAY);
  }

  public void beginObject()
    throws IOException
  {
    expect(JsonToken.BEGIN_OBJECT);
  }

  public void close()
    throws IOException
  {
    this.hasToken = false;
    this.value = null;
    this.token = null;
    this.stack.clear();
    this.stack.add(JsonScope.CLOSED);
    this.in.close();
  }

  public void endArray()
    throws IOException
  {
    expect(JsonToken.END_ARRAY);
  }

  public void endObject()
    throws IOException
  {
    expect(JsonToken.END_OBJECT);
  }

  public boolean hasNext()
    throws IOException
  {
    quickPeek();
    return (this.token != JsonToken.END_OBJECT) && (this.token != JsonToken.END_ARRAY);
  }

  public boolean isLenient()
  {
    return this.lenient;
  }

  public boolean nextBoolean()
    throws IOException
  {
    quickPeek();
    if ((this.value == null) || (this.token == JsonToken.STRING))
      throw new IllegalStateException("Expected a boolean but was " + peek());
    if (this.value.equalsIgnoreCase("true"));
    for (boolean bool = true; ; bool = false)
    {
      advance();
      return bool;
      if (!this.value.equalsIgnoreCase("false"))
        break;
    }
    throw new IllegalStateException("Not a boolean: " + this.value);
  }

  public double nextDouble()
    throws IOException
  {
    quickPeek();
    if (this.value == null)
      throw new IllegalStateException("Expected a double but was " + peek());
    double d = Double.parseDouble(this.value);
    if ((d >= 1.0D) && (this.value.startsWith("0")))
      throw new NumberFormatException("JSON forbids octal prefixes: " + this.value);
    if ((!this.lenient) && ((Double.isNaN(d)) || (Double.isInfinite(d))))
      throw new NumberFormatException("JSON forbids NaN and infinities: " + this.value);
    advance();
    return d;
  }

  public int nextInt()
    throws IOException
  {
    quickPeek();
    if (this.value == null)
      throw new IllegalStateException("Expected an int but was " + peek());
    try
    {
      int j = Integer.parseInt(this.value);
      i = j;
      if ((i >= 1L) && (this.value.startsWith("0")))
        throw new NumberFormatException("JSON forbids octal prefixes: " + this.value);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      double d;
      do
      {
        d = Double.parseDouble(this.value);
        i = (int)d;
      }
      while (i == d);
      throw new NumberFormatException(this.value);
    }
    int i;
    advance();
    return i;
  }

  public long nextLong()
    throws IOException
  {
    quickPeek();
    if (this.value == null)
      throw new IllegalStateException("Expected a long but was " + peek());
    try
    {
      long l2 = Long.parseLong(this.value);
      l1 = l2;
      if ((l1 >= 1L) && (this.value.startsWith("0")))
        throw new NumberFormatException("JSON forbids octal prefixes: " + this.value);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      double d;
      do
      {
        d = Double.parseDouble(this.value);
        l1 = ()d;
      }
      while (l1 == d);
      throw new NumberFormatException(this.value);
    }
    long l1;
    advance();
    return l1;
  }

  public String nextName()
    throws IOException
  {
    quickPeek();
    if (this.token != JsonToken.NAME)
      throw new IllegalStateException("Expected a name but was " + peek());
    String str = this.name;
    advance();
    return str;
  }

  public void nextNull()
    throws IOException
  {
    quickPeek();
    if ((this.value == null) || (this.token == JsonToken.STRING))
      throw new IllegalStateException("Expected null but was " + peek());
    if (!this.value.equalsIgnoreCase("null"))
      throw new IllegalStateException("Not a null: " + this.value);
    advance();
  }

  public String nextString()
    throws IOException
  {
    peek();
    if ((this.value == null) || ((this.token != JsonToken.STRING) && (this.token != JsonToken.NUMBER)))
      throw new IllegalStateException("Expected a string but was " + peek());
    String str = this.value;
    advance();
    return str;
  }

  public JsonToken peek()
    throws IOException
  {
    quickPeek();
    if (this.token == null)
      decodeLiteral();
    return this.token;
  }

  public void setLenient(boolean paramBoolean)
  {
    this.lenient = paramBoolean;
  }

  public void skipValue()
    throws IOException
  {
    this.skipping = true;
    i = 0;
    try
    {
      JsonToken localJsonToken1 = advance();
      if (localJsonToken1 != JsonToken.BEGIN_ARRAY)
      {
        JsonToken localJsonToken2 = JsonToken.BEGIN_OBJECT;
        if (localJsonToken1 != localJsonToken2);
      }
      else
      {
        i++;
      }
      while (i == 0)
      {
        return;
        if (localJsonToken1 != JsonToken.END_ARRAY)
        {
          JsonToken localJsonToken3 = JsonToken.END_OBJECT;
          if (localJsonToken1 != localJsonToken3);
        }
        else
        {
          i--;
        }
      }
    }
    finally
    {
      this.skipping = false;
    }
  }

  public String toString()
  {
    return getClass().getSimpleName() + " near " + getSnippet();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.stream.JsonReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */