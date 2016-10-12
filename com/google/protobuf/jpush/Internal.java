package com.google.protobuf.jpush;

import java.io.UnsupportedEncodingException;

public class Internal
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "{w[cB\n\021-cK";
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
          i3 = 122;
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
        str1 = "gpRcB";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "xEb/Zdi4*\025WW4 \025F\004g;\nBKf:ZS\004g:\033\\@u<\036\022G|/\bSG`+\b\022Wq:T";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 50;
        break label96;
        i3 = 36;
        break label96;
        i3 = 20;
        break label96;
        i3 = 78;
        break label96;
        m = 0;
      }
    }
  }

  public Internal()
  {
  }

  public static c bytesDefaultValue(String paramString)
  {
    try
    {
      c localc = c.a(paramString.getBytes(z[0]));
      return localc;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new IllegalStateException(z[2], localUnsupportedEncodingException);
    }
  }

  public static boolean isValidUtf8(c paramc)
  {
    int i = paramc.a();
    int j = 0;
    while (true)
    {
      int k;
      int n;
      if (j < i)
      {
        k = j + 1;
        int m = 0xFF & paramc.a(j);
        if (m >= 128)
        {
          if ((m < 194) || (m > 244))
            return false;
          if (k >= i)
            return false;
          n = k + 1;
          int i1 = 0xFF & paramc.a(k);
          if ((i1 < 128) || (i1 > 191))
            return false;
          if (m > 223)
          {
            if (n >= i)
              return false;
            j = n + 1;
            int i2 = 0xFF & paramc.a(n);
            if ((i2 < 128) || (i2 > 191))
              return false;
            if (m <= 239)
            {
              if (((m != 224) || (i1 >= 160)) && ((m != 237) || (i1 <= 159)))
                continue;
              return false;
            }
            if (j >= i)
              return false;
            n = j + 1;
            int i3 = 0xFF & paramc.a(j);
            if ((i3 < 128) || (i3 > 191))
              return false;
            if (((m == 240) && (i1 < 144)) || ((m == 244) && (i1 > 143)))
              return false;
          }
        }
      }
      else
      {
        return true;
        j = n;
        continue;
        j = k;
      }
    }
  }

  public static String stringDefaultValue(String paramString)
  {
    try
    {
      String str = new String(paramString.getBytes(z[0]), z[1]);
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new IllegalStateException(z[2], localUnsupportedEncodingException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.jpush.Internal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */