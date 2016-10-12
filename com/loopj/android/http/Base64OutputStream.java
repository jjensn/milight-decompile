package com.loopj.android.http;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Base64OutputStream extends FilterOutputStream
{
  private static byte[] EMPTY = new byte[0];
  private int bpos = 0;
  private byte[] buffer = null;
  private final Base64.Coder coder;
  private final int flags;

  public Base64OutputStream(OutputStream paramOutputStream, int paramInt)
  {
    this(paramOutputStream, paramInt, true);
  }

  public Base64OutputStream(OutputStream paramOutputStream, int paramInt, boolean paramBoolean)
  {
    super(paramOutputStream);
    this.flags = paramInt;
    if (paramBoolean)
    {
      this.coder = new Base64.Encoder(paramInt, null);
      return;
    }
    this.coder = new Base64.Decoder(paramInt, null);
  }

  private byte[] embiggen(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < paramInt))
      paramArrayOfByte = new byte[paramInt];
    return paramArrayOfByte;
  }

  private void flushBuffer()
    throws IOException
  {
    if (this.bpos > 0)
    {
      internalWrite(this.buffer, 0, this.bpos, false);
      this.bpos = 0;
    }
  }

  private void internalWrite(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    throws IOException
  {
    this.coder.output = embiggen(this.coder.output, this.coder.maxOutputSize(paramInt2));
    if (!this.coder.process(paramArrayOfByte, paramInt1, paramInt2, paramBoolean))
      throw new Base64DataException("bad base-64");
    this.out.write(this.coder.output, 0, this.coder.op);
  }

  // ERROR //
  public void close()
    throws IOException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokespecial 87	com/loopj/android/http/Base64OutputStream:flushBuffer	()V
    //   6: aload_0
    //   7: getstatic 16	com/loopj/android/http/Base64OutputStream:EMPTY	[B
    //   10: iconst_0
    //   11: iconst_0
    //   12: iconst_1
    //   13: invokespecial 49	com/loopj/android/http/Base64OutputStream:internalWrite	([BIIZ)V
    //   16: bipush 16
    //   18: aload_0
    //   19: getfield 30	com/loopj/android/http/Base64OutputStream:flags	I
    //   22: iand
    //   23: ifne +22 -> 45
    //   26: aload_0
    //   27: getfield 75	com/loopj/android/http/Base64OutputStream:out	Ljava/io/OutputStream;
    //   30: invokevirtual 89	java/io/OutputStream:close	()V
    //   33: aload_1
    //   34: ifnull +31 -> 65
    //   37: aload_1
    //   38: athrow
    //   39: astore_2
    //   40: aload_2
    //   41: astore_1
    //   42: goto -26 -> 16
    //   45: aload_0
    //   46: getfield 75	com/loopj/android/http/Base64OutputStream:out	Ljava/io/OutputStream;
    //   49: invokevirtual 92	java/io/OutputStream:flush	()V
    //   52: goto -19 -> 33
    //   55: astore_3
    //   56: aload_1
    //   57: ifnull -24 -> 33
    //   60: aload_3
    //   61: astore_1
    //   62: goto -29 -> 33
    //   65: return
    //
    // Exception table:
    //   from	to	target	type
    //   2	16	39	java/io/IOException
    //   16	33	55	java/io/IOException
    //   45	52	55	java/io/IOException
  }

  public void write(int paramInt)
    throws IOException
  {
    if (this.buffer == null)
      this.buffer = new byte[1024];
    if (this.bpos >= this.buffer.length)
    {
      internalWrite(this.buffer, 0, this.bpos, false);
      this.bpos = 0;
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.bpos;
    this.bpos = (i + 1);
    arrayOfByte[i] = (byte)paramInt;
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt2 <= 0)
      return;
    flushBuffer();
    internalWrite(paramArrayOfByte, paramInt1, paramInt2, false);
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.Base64OutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */