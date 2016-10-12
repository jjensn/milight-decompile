package com.google.protobuf.jpush;

import java.io.IOException;

public abstract class a
  implements k
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "@\033\035OKk\006Y\030Wm\006\034ODwR\024\032FlR\035\016QeR\030\034\005a\n\t\nFp\027\035A";
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
          i3 = 37;
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
        z = arrayOfString1;
        return;
        i3 = 4;
        break label96;
        i3 = 114;
        break label96;
        i3 = 121;
        break label96;
        i3 = 111;
        break label96;
        m = 0;
      }
    }
  }

  public a()
  {
  }

  public final byte[] ae()
  {
    byte[] arrayOfByte;
    try
    {
      arrayOfByte = new byte[c()];
      e locale = e.a(arrayOfByte, 0, arrayOfByte.length);
      a(locale);
      if (locale.a() != 0)
        throw new IllegalStateException(z[0]);
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(z[1], localIOException);
    }
    return arrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.jpush.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */