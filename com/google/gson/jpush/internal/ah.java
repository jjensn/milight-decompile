package com.google.gson.jpush.internal;

import java.io.Writer;

final class ah extends Writer
{
  private final Appendable a;
  private final ai b = new ai();

  private ah(Appendable paramAppendable)
  {
    this.a = paramAppendable;
  }

  public final void close()
  {
  }

  public final void flush()
  {
  }

  public final void write(int paramInt)
  {
    this.a.append((char)paramInt);
  }

  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.b.a = paramArrayOfChar;
    this.a.append(this.b, paramInt1, paramInt1 + paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.ah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */