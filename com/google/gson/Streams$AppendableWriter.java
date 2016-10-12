package com.google.gson;

import java.io.IOException;
import java.io.Writer;

class Streams$AppendableWriter extends Writer
{
  private final Appendable appendable;
  private final CurrentWrite currentWrite = new CurrentWrite();

  private Streams$AppendableWriter(Appendable paramAppendable)
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

/* Location:
 * Qualified Name:     com.google.gson.Streams.AppendableWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */