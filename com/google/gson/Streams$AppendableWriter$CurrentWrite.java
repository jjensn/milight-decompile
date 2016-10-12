package com.google.gson;

class Streams$AppendableWriter$CurrentWrite
  implements CharSequence
{
  char[] chars;

  Streams$AppendableWriter$CurrentWrite()
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

/* Location:
 * Qualified Name:     com.google.gson.Streams.AppendableWriter.CurrentWrite
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */