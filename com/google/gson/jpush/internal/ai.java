package com.google.gson.jpush.internal;

final class ai
  implements CharSequence
{
  char[] a;

  ai()
  {
  }

  public final char charAt(int paramInt)
  {
    return this.a[paramInt];
  }

  public final int length()
  {
    return this.a.length;
  }

  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return new String(this.a, paramInt1, paramInt2 - paramInt1);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.ai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */