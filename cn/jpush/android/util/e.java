package cn.jpush.android.util;

import java.io.UnsupportedEncodingException;

public class e
{
  private static final String[] z;

  static
  {
    int i = 1;
    String[] arrayOfString1 = new String[2];
    String str1 = "\023!Jyj\0203Kt>E";
    int j = -1;
    String[] arrayOfString2 = arrayOfString1;
    int k = 0;
    Object localObject1 = str1.toCharArray();
    int m = localObject1.length;
    int n;
    label38: int i4;
    if (m <= i)
    {
      n = 0;
      Object localObject2 = localObject1;
      int i1 = n;
      int i2 = m;
      Object localObject3 = localObject1;
      while (true)
      {
        int i3 = localObject3[n];
        switch (i1 % 5)
        {
        default:
          i4 = 8;
          localObject3[n] = (char)(i4 ^ i3);
          n = i1 + 1;
          if (i2 != 0)
            break label137;
          localObject3 = localObject2;
          i1 = n;
          n = i2;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label137: m = i2;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (m > n)
        break label38;
      String str2 = new String((char[])localObject1).intern();
      switch (j)
      {
      default:
        arrayOfString2[k] = str2;
        str1 = "$\023\003\030[2\tg";
        k = i;
        arrayOfString2 = arrayOfString1;
        j = 0;
        break;
      case 0:
        arrayOfString2[k] = str2;
        z = arrayOfString1;
        if (!e.class.desiredAssertionStatus());
        while (true)
        {
          a = i;
          return;
          i4 = 113;
          break;
          i4 = 64;
          break;
          i4 = 46;
          break;
          i4 = 89;
          break;
          i = 0;
        }
        n = 0;
      }
    }
  }

  private e()
  {
  }

  public static String a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 1;
    int j;
    h localh;
    int k;
    try
    {
      j = paramArrayOfByte.length;
      localh = new h(paramInt, null);
      k = 4 * (j / 3);
      if (localh.d)
      {
        if (j % 3 > 0)
          k += 4;
        if ((!localh.e) || (j <= 0))
          break label186;
        m = 1 + (j - 1) / 57;
        if (!localh.f)
          break label193;
        i = 2;
        break label193;
        localh.a = new byte[n];
        localh.a(paramArrayOfByte, 0, j, true);
        if ((a) || (localh.b == n))
          break label164;
        throw new AssertionError();
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError(localUnsupportedEncodingException);
    }
    while (true)
    {
      int m;
      int n;
      switch (j % 3)
      {
      case 0:
        String str = new String(localh.a, z[1]);
        return str;
        n = k;
        continue;
        n = k + i * m;
        break;
      default:
        break;
      case 1:
        k += 2;
        break;
      case 2:
        label164: label186: label193: k += 3;
      }
    }
  }

  public static byte[] a(String paramString, int paramInt)
  {
    byte[] arrayOfByte1 = paramString.getBytes();
    int i = arrayOfByte1.length;
    g localg = new g(2, new byte[i * 3 / 4]);
    if (!localg.a(arrayOfByte1, 0, i, true))
      throw new IllegalArgumentException(z[0]);
    if (localg.b == localg.a.length)
      return localg.a;
    byte[] arrayOfByte2 = new byte[localg.b];
    System.arraycopy(localg.a, 0, arrayOfByte2, 0, localg.b);
    return arrayOfByte2;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */