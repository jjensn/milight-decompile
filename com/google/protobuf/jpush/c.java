package com.google.protobuf.jpush;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public final class c
{
  public static final c a;
  private static final String[] z;
  private final byte[] b;
  private volatile int c = 0;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "oEj\035|\032CDdId\\@+HeIT{";
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
          i3 = 68;
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
        str1 = "oEj\035|";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = new c(new byte[0]);
        return;
        i3 = 58;
        break label96;
        i3 = 17;
        break label96;
        i3 = 44;
        break label96;
        i3 = 48;
        break label96;
        m = 0;
      }
    }
  }

  private c(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }

  public static c a(String paramString)
  {
    try
    {
      c localc = new c(paramString.getBytes(z[1]));
      return localc;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException(z[0], localUnsupportedEncodingException);
    }
  }

  public static c a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public static c a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new c(arrayOfByte);
  }

  public final byte a(int paramInt)
  {
    return this.b[paramInt];
  }

  public final int a()
  {
    return this.b.length;
  }

  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.b, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }

  public final String b()
  {
    try
    {
      String str = new String(this.b, z[1]);
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException(z[0], localUnsupportedEncodingException);
    }
  }

  public final InputStream c()
  {
    return new ByteArrayInputStream(this.b);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    while (true)
    {
      return true;
      if (!(paramObject instanceof c))
        return false;
      c localc = (c)paramObject;
      int i = this.b.length;
      if (i != localc.b.length)
        return false;
      byte[] arrayOfByte1 = this.b;
      byte[] arrayOfByte2 = localc.b;
      for (int j = 0; j < i; j++)
        if (arrayOfByte1[j] != arrayOfByte2[j])
          return false;
    }
  }

  public final int hashCode()
  {
    int i = this.c;
    if (i == 0)
    {
      byte[] arrayOfByte = this.b;
      int j = this.b.length;
      int k = 0;
      int m;
      for (i = j; k < j; i = m)
      {
        m = i * 31 + arrayOfByte[k];
        k++;
      }
      if (i == 0)
        i = 1;
      this.c = i;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.jpush.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */