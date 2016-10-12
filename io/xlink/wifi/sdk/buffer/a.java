package io.xlink.wifi.sdk.buffer;

import io.xlink.wifi.sdk.util.b;

public class a
{
  private int a;
  private byte[] b;

  public a(byte[] paramArrayOfByte, int paramInt)
  {
    this.b = paramArrayOfByte;
    this.a = paramInt;
  }

  private void b(int paramInt)
  {
    this.a = (paramInt + this.a);
    if (this.b.length == this.a);
  }

  public void a()
  {
    this.b = null;
    this.a = 0;
  }

  public byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(this.b, this.a, arrayOfByte, 0, arrayOfByte.length);
    b(paramInt);
    return arrayOfByte;
  }

  public byte[] b()
  {
    return this.b;
  }

  public boolean c()
  {
    int i = this.b[this.a];
    b(1);
    return i != 0;
  }

  public byte d()
  {
    byte b1 = this.b[this.a];
    b(1);
    return b1;
  }

  public byte[] e()
  {
    byte[] arrayOfByte = new byte[this.b.length - this.a];
    System.arraycopy(this.b, this.a, arrayOfByte, 0, arrayOfByte.length);
    this.a += arrayOfByte.length;
    a();
    return arrayOfByte;
  }

  public int f()
  {
    byte[] arrayOfByte = new byte[4];
    System.arraycopy(this.b, this.a, arrayOfByte, 0, arrayOfByte.length);
    b(arrayOfByte.length);
    return b.b(arrayOfByte);
  }

  public short g()
  {
    short s = b.a(this.b, this.a);
    b(2);
    return s;
  }

  public String toString()
  {
    return "当前索引: " + this.a + " 数据总长度 ：" + this.b.length + " " + this.b;
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.buffer.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */