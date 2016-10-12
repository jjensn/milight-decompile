package com.loopj.android.http;

abstract class Base64$Coder
{
  public int op;
  public byte[] output;

  Base64$Coder()
  {
  }

  public abstract int maxOutputSize(int paramInt);

  public abstract boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.loopj.android.http.Base64.Coder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */