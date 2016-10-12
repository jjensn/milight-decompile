package io.xlink.wifi.sdk.decoder;

public class b
{
  private int a = -1;
  private boolean b = false;
  private byte c;
  private int d = -1;
  private byte[] e;

  public b(byte[] paramArrayOfByte)
  {
    this.e = paramArrayOfByte;
    this.c = paramArrayOfByte[0];
    this.a = a(this.c);
    this.b = b(this.c);
    this.d = a(paramArrayOfByte);
  }

  private int a(byte paramByte)
  {
    return 0x0 | 0xF & paramByte >> 4;
  }

  private int a(byte[] paramArrayOfByte)
  {
    return 0x0 | 0xFF & paramArrayOfByte[4] | (0xFF & paramArrayOfByte[3]) << 8 | (0xFF & paramArrayOfByte[2]) << 16 | (0xFF & paramArrayOfByte[1]) << 24;
  }

  private boolean b(byte paramByte)
  {
    return (0x0 | 0x1 & paramByte >> 3) == 1;
  }

  public int a()
  {
    return this.d;
  }

  public boolean b()
  {
    return (this.a > 0) && (this.a < 16);
  }

  public int c()
  {
    return this.a;
  }

  public boolean d()
  {
    return this.b;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = io.xlink.wifi.sdk.util.b.b(this.c);
    arrayOfObject[1] = Integer.valueOf(this.a);
    if (this.b);
    for (String str = "true"; ; str = "false")
    {
      arrayOfObject[2] = str;
      return String.format("Fix message header %s; type: %d; response: %s;", arrayOfObject);
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.decoder.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */