package com.loopj.android.http;

class Base64$Decoder extends Base64.Coder
{
  private static final int[] DECODE = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  private static final int[] DECODE_WEBSAFE = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  private static final int EQUALS = -2;
  private static final int SKIP = -1;
  private final int[] alphabet;
  private int state;
  private int value;

  public Base64$Decoder(int paramInt, byte[] paramArrayOfByte)
  {
    this.output = paramArrayOfByte;
    if ((paramInt & 0x8) == 0);
    for (int[] arrayOfInt = DECODE; ; arrayOfInt = DECODE_WEBSAFE)
    {
      this.alphabet = arrayOfInt;
      this.state = 0;
      this.value = 0;
      return;
    }
  }

  public int maxOutputSize(int paramInt)
  {
    return 10 + paramInt * 3 / 4;
  }

  public boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.state == 6)
      return false;
    int i = paramInt1;
    int j = paramInt2 + paramInt1;
    int k = this.state;
    int m = this.value;
    int n = 0;
    byte[] arrayOfByte = this.output;
    int[] arrayOfInt = this.alphabet;
    if (i < j)
      if (k == 0)
      {
        while (i + 4 <= j)
        {
          m = arrayOfInt[(0xFF & paramArrayOfByte[i])] << 18 | arrayOfInt[(0xFF & paramArrayOfByte[(i + 1)])] << 12 | arrayOfInt[(0xFF & paramArrayOfByte[(i + 2)])] << 6 | arrayOfInt[(0xFF & paramArrayOfByte[(i + 3)])];
          if (m < 0)
            break;
          arrayOfByte[(n + 2)] = (byte)m;
          arrayOfByte[(n + 1)] = (byte)(m >> 8);
          arrayOfByte[n] = (byte)(m >> 16);
          n += 3;
          i += 4;
        }
        if (i < j);
      }
    for (int i1 = n; ; i1 = n)
    {
      if (!paramBoolean)
      {
        this.state = k;
        this.value = m;
        this.op = i1;
        return true;
        int i5 = i + 1;
        int i6 = arrayOfInt[(0xFF & paramArrayOfByte[i])];
        switch (k)
        {
        default:
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
        label539: 
        do
        {
          do
            while (true)
            {
              i = i5;
              break;
              if (i6 >= 0)
              {
                m = i6;
                k++;
              }
              else if (i6 != -1)
              {
                this.state = 6;
                return false;
                if (i6 >= 0)
                {
                  m = i6 | m << 6;
                  k++;
                }
                else if (i6 != -1)
                {
                  this.state = 6;
                  return false;
                  if (i6 >= 0)
                  {
                    m = i6 | m << 6;
                    k++;
                  }
                  else if (i6 == -2)
                  {
                    int i7 = n + 1;
                    arrayOfByte[n] = (byte)(m >> 4);
                    k = 4;
                    n = i7;
                  }
                  else if (i6 != -1)
                  {
                    this.state = 6;
                    return false;
                    if (i6 >= 0)
                    {
                      m = i6 | m << 6;
                      arrayOfByte[(n + 2)] = (byte)m;
                      arrayOfByte[(n + 1)] = (byte)(m >> 8);
                      arrayOfByte[n] = (byte)(m >> 16);
                      n += 3;
                      k = 0;
                    }
                    else if (i6 == -2)
                    {
                      arrayOfByte[(n + 1)] = (byte)(m >> 2);
                      arrayOfByte[n] = (byte)(m >> 10);
                      n += 2;
                      k = 5;
                    }
                    else if (i6 != -1)
                    {
                      this.state = 6;
                      return false;
                      if (i6 != -2)
                        break label539;
                      k++;
                    }
                  }
                }
              }
            }
          while (i6 == -1);
          this.state = 6;
          return false;
        }
        while (i6 == -1);
        this.state = 6;
        return false;
      }
      int i4;
      switch (k)
      {
      default:
        i4 = i1;
      case 0:
      case 1:
      case 2:
      case 3:
        while (true)
        {
          this.state = k;
          this.op = i4;
          return true;
          i4 = i1;
          continue;
          this.state = 6;
          return false;
          i4 = i1 + 1;
          arrayOfByte[i1] = (byte)(m >> 4);
          continue;
          int i2 = i1 + 1;
          arrayOfByte[i1] = (byte)(m >> 10);
          int i3 = i2 + 1;
          arrayOfByte[i2] = (byte)(m >> 2);
          i4 = i3;
        }
      case 4:
      }
      this.state = 6;
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.Base64.Decoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */