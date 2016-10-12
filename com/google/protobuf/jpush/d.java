package com.google.protobuf.jpush;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static final String[] z;
  private final byte[] a;
  private int b;
  private int c;
  private int d;
  private final InputStream e;
  private int f;
  private int g;
  private int h = 2147483647;
  private int i;
  private int j = 64;
  private int k = 67108864;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "";
    int m = -1;
    String[] arrayOfString2 = arrayOfString1;
    int n = 0;
    Object localObject1 = str1.toCharArray();
    int i1 = localObject1.length;
    int i2;
    label35: int i6;
    if (i1 <= 1)
    {
      i2 = 0;
      Object localObject2 = localObject1;
      int i3 = i2;
      int i4 = i1;
      Object localObject3 = localObject1;
      while (true)
      {
        int i5 = localObject3[i2];
        switch (i3 % 5)
        {
        default:
          i6 = 41;
          label96: localObject3[i2] = (char)(i6 ^ i5);
          i2 = i3 + 1;
          if (i4 != 0)
            break label133;
          localObject3 = localObject2;
          i3 = i2;
          i2 = i4;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: i1 = i4;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (i1 > i2)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (m)
      {
      default:
        arrayOfString2[n] = str2;
        str1 = "";
        n = 1;
        arrayOfString2 = arrayOfString1;
        m = 0;
        break;
      case 0:
        arrayOfString2[n] = str2;
        n = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "{E\007L\t8\037\\]\"e\035LH\0341\006DY\035t\002LG\005p\033@F\0371\006Z\t\023d\bNP_";
        m = 1;
        break;
      case 1:
        arrayOfString2[n] = str2;
        z = arrayOfString1;
        return;
        i6 = 113;
        break label96;
        i6 = 17;
        break label96;
        i6 = 111;
        break label96;
        i6 = 41;
        break label96;
        i2 = 0;
      }
    }
  }

  private d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = (paramInt1 + paramInt2);
    this.d = paramInt1;
    this.g = (-paramInt1);
    this.e = null;
  }

  public static d a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    d locald = new d(paramArrayOfByte, paramInt1, paramInt2);
    try
    {
      locald.c(paramInt2);
      return locald;
    }
    catch (j localj)
    {
      throw new IllegalArgumentException(localj);
    }
  }

  private boolean a(boolean paramBoolean)
  {
    if (this.d < this.b)
      throw new IllegalStateException(z[0]);
    if (this.g + this.b == this.h)
    {
      if (paramBoolean)
        throw j.a();
      return false;
    }
    this.g += this.b;
    this.d = 0;
    if (this.e == null);
    for (int m = -1; ; m = this.e.read(this.a))
    {
      this.b = m;
      if ((this.b != 0) && (this.b >= -1))
        break;
      throw new IllegalStateException(z[1] + this.b + z[2]);
    }
    if (this.b == -1)
    {
      this.b = 0;
      if (paramBoolean)
        throw j.a();
      return false;
    }
    h();
    int n = this.g + this.b + this.c;
    if ((n > this.k) || (n < 0))
      throw j.h();
    return true;
  }

  private void e(int paramInt)
  {
    if (paramInt < 0)
      throw j.b();
    if (paramInt + (this.g + this.d) > this.h)
    {
      e(this.h - this.g - this.d);
      throw j.a();
    }
    if (paramInt <= this.b - this.d)
    {
      this.d = (paramInt + this.d);
      return;
    }
    int m = this.b - this.d;
    this.d = this.b;
    a(true);
    while (paramInt - m > this.b)
    {
      m += this.b;
      this.d = this.b;
      a(true);
    }
    this.d = (paramInt - m);
  }

  private void h()
  {
    this.b += this.c;
    int m = this.g + this.b;
    if (m > this.h)
    {
      this.c = (m - this.h);
      this.b -= this.c;
      return;
    }
    this.c = 0;
  }

  private byte i()
  {
    if (this.d == this.b)
      a(true);
    byte[] arrayOfByte = this.a;
    int m = this.d;
    this.d = (m + 1);
    return arrayOfByte[m];
  }

  public final int a()
  {
    if ((this.d == this.b) && (!a(false)));
    for (int m = 1; m != 0; m = 0)
    {
      this.f = 0;
      return 0;
    }
    this.f = f();
    if (n.b(this.f) == 0)
      throw j.d();
    return this.f;
  }

  public final void a(int paramInt)
  {
    if (this.f != paramInt)
      throw j.e();
  }

  public final void a(l paraml, g paramg)
  {
    int m = f();
    if (this.i >= this.j)
      throw j.g();
    int n = c(m);
    this.i = (1 + this.i);
    paraml.b(this, paramg);
    a(0);
    this.i = (-1 + this.i);
    d(n);
  }

  public final long b()
  {
    int m = 0;
    long l = 0L;
    while (m < 64)
    {
      int n = i();
      l |= n & 0x7F << m;
      if ((n & 0x80) == 0)
        return l;
      m += 7;
    }
    throw j.c();
  }

  public final boolean b(int paramInt)
  {
    switch (n.a(paramInt))
    {
    default:
      throw j.f();
    case 0:
      f();
      return true;
    case 1:
      int i4 = i();
      int i5 = i();
      int i6 = i();
      int i7 = i();
      int i8 = i();
      int i9 = i();
      int i10 = i();
      int i11 = i();
      (0xFF & i4 | (0xFF & i5) << 8 | (0xFF & i6) << 16 | (0xFF & i7) << 24 | (0xFF & i8) << 32 | (0xFF & i9) << 40 | (0xFF & i10) << 48 | (0xFF & i11) << 56);
      return true;
    case 2:
      e(f());
      return true;
    case 3:
      int i3;
      do
        i3 = a();
      while ((i3 != 0) && (b(i3)));
      a(n.a(n.b(paramInt), 4));
      return true;
    case 4:
      return false;
    case 5:
    }
    int m = i();
    int n = i();
    int i1 = i();
    int i2 = i();
    (m & 0xFF | (n & 0xFF) << 8 | (i1 & 0xFF) << 16 | (i2 & 0xFF) << 24);
    return true;
  }

  public final int c()
  {
    return f();
  }

  public final int c(int paramInt)
  {
    if (paramInt < 0)
      throw j.b();
    int m = paramInt + (this.g + this.d);
    int n = this.h;
    if (m > n)
      throw j.a();
    this.h = m;
    h();
    return n;
  }

  public final c d()
  {
    int m = f();
    if (m == 0)
      return c.a;
    if ((m <= this.b - this.d) && (m > 0))
    {
      c localc = c.a(this.a, this.d, m);
      this.d = (m + this.d);
      return localc;
    }
    if (m < 0)
      throw j.b();
    if (m + (this.g + this.d) > this.h)
    {
      e(this.h - this.g - this.d);
      throw j.a();
    }
    Object localObject;
    if (m <= this.b - this.d)
    {
      localObject = new byte[m];
      System.arraycopy(this.a, this.d, localObject, 0, m);
      this.d = (m + this.d);
    }
    while (true)
    {
      return c.a((byte[])localObject);
      if (m < 4096)
      {
        byte[] arrayOfByte4 = new byte[m];
        int i9 = this.b - this.d;
        System.arraycopy(this.a, this.d, arrayOfByte4, 0, i9);
        this.d = this.b;
        a(true);
        while (m - i9 > this.b)
        {
          System.arraycopy(this.a, 0, arrayOfByte4, i9, this.b);
          i9 += this.b;
          this.d = this.b;
          a(true);
        }
        System.arraycopy(this.a, 0, arrayOfByte4, i9, m - i9);
        this.d = (m - i9);
        localObject = arrayOfByte4;
      }
      else
      {
        int n = this.d;
        int i1 = this.b;
        this.g += this.b;
        this.d = 0;
        this.b = 0;
        int i2 = m - (i1 - n);
        ArrayList localArrayList = new ArrayList();
        int i7;
        for (int i3 = i2; i3 > 0; i3 = i7)
        {
          byte[] arrayOfByte3 = new byte[Math.min(i3, 4096)];
          int i6 = 0;
          while (i6 < arrayOfByte3.length)
          {
            if (this.e == null);
            for (int i8 = -1; i8 == -1; i8 = this.e.read(arrayOfByte3, i6, arrayOfByte3.length - i6))
              throw j.a();
            this.g = (i8 + this.g);
            i6 += i8;
          }
          i7 = i3 - arrayOfByte3.length;
          localArrayList.add(arrayOfByte3);
        }
        byte[] arrayOfByte1 = new byte[m];
        int i4 = i1 - n;
        System.arraycopy(this.a, n, arrayOfByte1, 0, i4);
        Iterator localIterator = localArrayList.iterator();
        int i5 = i4;
        while (localIterator.hasNext())
        {
          byte[] arrayOfByte2 = (byte[])localIterator.next();
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i5, arrayOfByte2.length);
          i5 += arrayOfByte2.length;
        }
        localObject = arrayOfByte1;
      }
    }
  }

  public final void d(int paramInt)
  {
    this.h = paramInt;
    h();
  }

  public final int e()
  {
    return f();
  }

  public final int f()
  {
    int m = i();
    if (m >= 0);
    int i7;
    do
    {
      return m;
      int n = m & 0x7F;
      int i1 = i();
      if (i1 >= 0)
        return n | i1 << 7;
      int i2 = n | (i1 & 0x7F) << 7;
      int i3 = i();
      if (i3 >= 0)
        return i2 | i3 << 14;
      int i4 = i2 | (i3 & 0x7F) << 14;
      int i5 = i();
      if (i5 >= 0)
        return i4 | i5 << 21;
      int i6 = i4 | (i5 & 0x7F) << 21;
      i7 = i();
      m = i6 | i7 << 28;
    }
    while (i7 >= 0);
    for (int i8 = 0; ; i8++)
    {
      if (i8 >= 5)
        break label151;
      if (i() >= 0)
        break;
    }
    label151: throw j.c();
  }

  public final int g()
  {
    if (this.h == 2147483647)
      return -1;
    int m = this.g + this.d;
    return this.h - m;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.jpush.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */