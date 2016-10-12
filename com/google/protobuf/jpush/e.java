package com.google.protobuf.jpush;

import java.io.InputStream;
import java.io.OutputStream;

public final class e
{
  private static final String[] z;
  private final byte[] a;
  private final int b;
  private int c;
  private final OutputStream d = null;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 104;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = "";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 70;
        break label96;
        i3 = 95;
        break label96;
        i3 = 23;
        break label96;
        i3 = 54;
        break label96;
        m = 0;
      }
    }
  }

  private e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.c = paramInt1;
    this.b = (paramInt1 + paramInt2);
  }

  public static int a(int paramInt)
  {
    if (paramInt >= 0)
      return e(paramInt);
    return 10;
  }

  public static int a(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      return 1;
    if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L)
      return 2;
    if ((0xFFFFFFFFFFE00000 & paramLong) == 0L)
      return 3;
    if ((0xFFFFFFFFF0000000 & paramLong) == 0L)
      return 4;
    if ((0xFFFFFFF800000000 & paramLong) == 0L)
      return 5;
    if ((0xFFFFFC0000000000 & paramLong) == 0L)
      return 6;
    if ((0xFFFE000000000000 & paramLong) == 0L)
      return 7;
    if ((0xFF00000000000000 & paramLong) == 0L)
      return 8;
    if ((0x8000000000000000 & paramLong) == 0L)
      return 9;
    return 10;
  }

  public static e a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new e(paramArrayOfByte, 0, paramInt2);
  }

  public static int b(int paramInt, long paramLong)
  {
    return c(paramInt) + a(paramLong);
  }

  public static int b(int paramInt, c paramc)
  {
    return c(paramInt) + (e(paramc.a()) + paramc.a());
  }

  public static int b(int paramInt, k paramk)
  {
    int i = c(paramInt);
    int j = paramk.c();
    return i + (j + e(j));
  }

  private void b()
  {
    if (this.d == null)
      throw new f();
    this.d.write(this.a, 0, this.c);
    this.c = 0;
  }

  private void b(int paramInt)
  {
    int i = (byte)paramInt;
    if (this.c == this.b)
      b();
    byte[] arrayOfByte = this.a;
    int j = this.c;
    this.c = (j + 1);
    arrayOfByte[j] = i;
  }

  private void b(long paramLong)
  {
    while (true)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        b((int)paramLong);
        return;
      }
      b(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }

  private static int c(int paramInt)
  {
    return e(n.a(paramInt, 0));
  }

  public static int c(int paramInt1, int paramInt2)
  {
    return c(paramInt1) + a(paramInt2);
  }

  public static int d(int paramInt1, int paramInt2)
  {
    return c(paramInt1) + e(paramInt2);
  }

  private void d(int paramInt)
  {
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        b(paramInt);
        return;
      }
      b(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }

  private static int e(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0)
      return 1;
    if ((paramInt & 0xFFFFC000) == 0)
      return 2;
    if ((0xFFE00000 & paramInt) == 0)
      return 3;
    if ((0xF0000000 & paramInt) == 0)
      return 4;
    return 5;
  }

  private void e(int paramInt1, int paramInt2)
  {
    d(n.a(paramInt1, paramInt2));
  }

  public final int a()
  {
    if (this.d == null)
      return this.b - this.c;
    throw new UnsupportedOperationException(z[2]);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    e(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      d(paramInt2);
      return;
    }
    b(paramInt2);
  }

  public final void a(int paramInt, long paramLong)
  {
    e(paramInt, 0);
    b(paramLong);
  }

  public final void a(int paramInt, c paramc)
  {
    e(paramInt, 2);
    d(paramc.a());
    int i = paramc.a();
    if (this.b - this.c >= i)
    {
      paramc.a(this.a, 0, this.c, i);
      this.c = (i + this.c);
      return;
    }
    int j = this.b - this.c;
    paramc.a(this.a, 0, this.c, j);
    int k = j + 0;
    int m = i - j;
    this.c = this.b;
    b();
    if (m <= this.b)
    {
      paramc.a(this.a, k, 0, m);
      this.c = m;
      return;
    }
    InputStream localInputStream = paramc.c();
    if (k != localInputStream.skip(k))
      throw new IllegalStateException(z[0]);
    int i1;
    int n;
    do
    {
      this.d.write(this.a, 0, i1);
      m -= i1;
      if (m <= 0)
        break;
      n = Math.min(m, this.b);
      i1 = localInputStream.read(this.a, 0, n);
    }
    while (i1 == n);
    throw new IllegalStateException(z[1]);
  }

  public final void a(int paramInt, k paramk)
  {
    e(paramInt, 2);
    d(paramk.c());
    paramk.a(this);
  }

  public final void b(int paramInt1, int paramInt2)
  {
    e(paramInt1, 0);
    d(paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.jpush.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */