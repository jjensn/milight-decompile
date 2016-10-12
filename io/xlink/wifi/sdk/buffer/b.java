package io.xlink.wifi.sdk.buffer;

public class b
{
  private byte[] a;
  private int b;

  public b(int paramInt)
  {
    this.a = new byte[paramInt];
    this.b = 0;
  }

  public void a(byte paramByte)
  {
    this.a[this.b] = paramByte;
    this.b = (1 + this.b);
  }

  public void a(int paramInt)
  {
    a((short)paramInt);
  }

  public void a(short paramShort)
  {
    a(io.xlink.wifi.sdk.util.b.a(paramShort));
  }

  public void a(boolean paramBoolean)
  {
    byte b1 = 0;
    if (paramBoolean)
      b1 = 1;
    a(b1);
  }

  public void a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    System.arraycopy(paramArrayOfByte, 0, this.a, this.b, i);
    this.b = (i + this.b);
  }

  public byte[] a()
  {
    return this.a;
  }

  public void b(int paramInt)
  {
    a(io.xlink.wifi.sdk.util.b.b(paramInt));
  }

  public void c(int paramInt)
  {
    a((byte)paramInt);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.buffer.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */