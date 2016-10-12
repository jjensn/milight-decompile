package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.global.a;
import java.net.InetAddress;

public class d
{
  public boolean a = false;
  public io.xlink.wifi.sdk.buffer.b b;
  private int c = -1;
  private int d;
  private int e;
  private String f;
  private XDevice g;
  private int h = 2;
  private boolean i;
  private int j;
  private InetAddress k;
  private int l;

  public d(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.b = new io.xlink.wifi.sdk.buffer.b(paramInt1 + 5);
    this.c = (paramInt1 + 5);
    a(paramInt2, paramInt1, paramBoolean);
  }

  public d(io.xlink.wifi.sdk.buffer.b paramb)
  {
    this.b = paramb;
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.e = paramInt1;
    this.i = paramBoolean;
    this.j = paramInt2;
    if (paramBoolean)
      this.b.a(io.xlink.wifi.sdk.util.b.a(paramInt1, 1));
    while (true)
    {
      byte[] arrayOfByte = new byte[4];
      this.b.a(io.xlink.wifi.sdk.util.b.a(paramInt2, arrayOfByte));
      return;
      this.b.a(io.xlink.wifi.sdk.util.b.a(paramInt1, 0));
    }
  }

  public int a()
  {
    return this.h;
  }

  public void a(int paramInt)
  {
    this.d = paramInt;
  }

  public void a(XDevice paramXDevice)
  {
    this.g = paramXDevice;
  }

  public void a(String paramString)
  {
    this.f = paramString;
  }

  public void a(InetAddress paramInetAddress)
  {
    this.k = paramInetAddress;
    this.h = 1;
  }

  public XDevice b()
  {
    return this.g;
  }

  public int c()
  {
    if (this.d == 0)
      this.d = a.f;
    return this.d;
  }

  public InetAddress d()
  {
    return this.k;
  }

  public int e()
  {
    return this.e;
  }

  public String f()
  {
    return this.f + "";
  }

  public int g()
  {
    return this.l;
  }

  public void h()
  {
    short s = (short)io.xlink.wifi.sdk.util.b.c();
    this.b.a(s);
    this.f = (s + "");
    this.l = Math.abs(s);
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.k != null)
    {
      localStringBuffer.append("send address：");
      localStringBuffer.append(this.k.getHostAddress());
    }
    localStringBuffer.append("type ：");
    localStringBuffer.append(this.e);
    localStringBuffer.append(" isResponse：");
    localStringBuffer.append(this.i);
    localStringBuffer.append(" dataLength：");
    localStringBuffer.append(this.j);
    localStringBuffer.append(" msgId：");
    localStringBuffer.append(f());
    localStringBuffer.append("size:");
    localStringBuffer.append(this.c);
    return localStringBuffer.toString();
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */