package com.loopj.android.http;

class Base64$Encoder extends Base64.Coder
{
  private static final byte[] ENCODE = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] ENCODE_WEBSAFE = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
  public static final int LINE_GROUPS = 19;
  private final byte[] alphabet;
  private int count;
  public final boolean do_cr;
  public final boolean do_newline;
  public final boolean do_padding;
  private final byte[] tail;
  int tailLen;

  public Base64$Encoder(int paramInt, byte[] paramArrayOfByte)
  {
    this.output = paramArrayOfByte;
    boolean bool2;
    boolean bool3;
    label35: label47: byte[] arrayOfByte;
    if ((paramInt & 0x1) == 0)
    {
      bool2 = bool1;
      this.do_padding = bool2;
      if ((paramInt & 0x2) != 0)
        break label106;
      bool3 = bool1;
      this.do_newline = bool3;
      if ((paramInt & 0x4) == 0)
        break label112;
      this.do_cr = bool1;
      if ((paramInt & 0x8) != 0)
        break label117;
      arrayOfByte = ENCODE;
      label64: this.alphabet = arrayOfByte;
      this.tail = new byte[2];
      this.tailLen = 0;
      if (!this.do_newline)
        break label125;
    }
    label106: label112: label117: label125: for (int i = 19; ; i = -1)
    {
      this.count = i;
      return;
      bool2 = false;
      break;
      bool3 = false;
      break label35;
      bool1 = false;
      break label47;
      arrayOfByte = ENCODE_WEBSAFE;
      break label64;
    }
  }

  public int maxOutputSize(int paramInt)
  {
    return 10 + paramInt * 8 / 5;
  }

  public boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte1 = this.alphabet;
    byte[] arrayOfByte2 = this.output;
    int i = this.count;
    int j = paramInt1;
    int k = paramInt2 + paramInt1;
    int m = -1;
    int i2;
    int i4;
    int i3;
    switch (this.tailLen)
    {
    case 0:
    default:
      i2 = 0;
      if (m != -1)
      {
        int i34 = 0 + 1;
        arrayOfByte2[0] = arrayOfByte1[(0x3F & m >> 18)];
        int i35 = i34 + 1;
        arrayOfByte2[i34] = arrayOfByte1[(0x3F & m >> 12)];
        int i36 = i35 + 1;
        arrayOfByte2[i35] = arrayOfByte1[(0x3F & m >> 6)];
        i2 = i36 + 1;
        arrayOfByte2[i36] = arrayOfByte1[(m & 0x3F)];
        i--;
        if (i == 0)
        {
          if (this.do_cr)
          {
            int i37 = i2 + 1;
            arrayOfByte2[i2] = 13;
            i2 = i37;
          }
          i4 = i2 + 1;
          arrayOfByte2[i2] = 10;
          i = 19;
          i3 = j;
        }
      }
    case 1:
    case 2:
    }
    while (true)
    {
      if (i3 + 3 <= k)
      {
        int i32 = (0xFF & paramArrayOfByte[i3]) << 16 | (0xFF & paramArrayOfByte[(i3 + 1)]) << 8 | 0xFF & paramArrayOfByte[(i3 + 2)];
        arrayOfByte2[i4] = arrayOfByte1[(0x3F & i32 >> 18)];
        arrayOfByte2[(i4 + 1)] = arrayOfByte1[(0x3F & i32 >> 12)];
        arrayOfByte2[(i4 + 2)] = arrayOfByte1[(0x3F & i32 >> 6)];
        arrayOfByte2[(i4 + 3)] = arrayOfByte1[(i32 & 0x3F)];
        j = i3 + 3;
        i2 = i4 + 4;
        i--;
        if (i != 0)
          break label1231;
        if (this.do_cr)
        {
          int i33 = i2 + 1;
          arrayOfByte2[i2] = 13;
          i2 = i33;
        }
        i4 = i2 + 1;
        arrayOfByte2[i2] = 10;
        i = 19;
        i3 = j;
        continue;
        if (j + 2 > k)
          break;
        int i38 = (0xFF & this.tail[0]) << 16;
        int i39 = j + 1;
        int i40 = i38 | (0xFF & paramArrayOfByte[j]) << 8;
        j = i39 + 1;
        m = i40 | 0xFF & paramArrayOfByte[i39];
        this.tailLen = 0;
        break;
        if (j + 1 > k)
          break;
        int n = (0xFF & this.tail[0]) << 16 | (0xFF & this.tail[1]) << 8;
        int i1 = j + 1;
        m = n | 0xFF & paramArrayOfByte[j];
        this.tailLen = 0;
        j = i1;
        break;
      }
      int i5;
      label726: label1021: int i9;
      if (paramBoolean)
      {
        int i19;
        if (i3 - this.tailLen == k - 1)
        {
          int i31;
          int i24;
          if (this.tailLen > 0)
          {
            byte[] arrayOfByte8 = this.tail;
            i31 = 0 + 1;
            i24 = arrayOfByte8[0];
          }
          for (int i25 = i31; ; i25 = 0)
          {
            int i26 = (i24 & 0xFF) << 4;
            this.tailLen -= i25;
            int i27 = i4 + 1;
            arrayOfByte2[i4] = arrayOfByte1[(0x3F & i26 >> 6)];
            int i28 = i27 + 1;
            arrayOfByte2[i27] = arrayOfByte1[(i26 & 0x3F)];
            if (this.do_padding)
            {
              int i30 = i28 + 1;
              arrayOfByte2[i28] = 61;
              i28 = i30 + 1;
              arrayOfByte2[i30] = 61;
            }
            i5 = i28;
            if (this.do_newline)
            {
              if (this.do_cr)
              {
                int i29 = i5 + 1;
                arrayOfByte2[i5] = 13;
                i5 = i29;
              }
              i19 = i5 + 1;
              arrayOfByte2[i5] = 10;
              i5 = i19;
            }
            this.op = i5;
            this.count = i;
            return true;
            (i3 + 1);
            i24 = paramArrayOfByte[i3];
          }
        }
        if (i3 - this.tailLen == k - 2)
        {
          int i12;
          int i13;
          int i11;
          label804: int i14;
          int i15;
          if (this.tailLen > 1)
          {
            byte[] arrayOfByte7 = this.tail;
            int i23 = 0 + 1;
            i12 = arrayOfByte7[0];
            i13 = i23;
            i11 = i3;
            i14 = (i12 & 0xFF) << 10;
            if (this.tailLen <= 0)
              break label1021;
            byte[] arrayOfByte6 = this.tail;
            int i22 = i13 + 1;
            i15 = arrayOfByte6[i13];
            i13 = i22;
          }
          while (true)
          {
            int i16 = i14 | (i15 & 0xFF) << 2;
            this.tailLen -= i13;
            int i17 = i4 + 1;
            arrayOfByte2[i4] = arrayOfByte1[(0x3F & i16 >> 12)];
            int i18 = i17 + 1;
            arrayOfByte2[i17] = arrayOfByte1[(0x3F & i16 >> 6)];
            i5 = i18 + 1;
            arrayOfByte2[i18] = arrayOfByte1[(i16 & 0x3F)];
            if (this.do_padding)
            {
              int i21 = i5 + 1;
              arrayOfByte2[i5] = 61;
              i5 = i21;
            }
            if (!this.do_newline)
              break label726;
            if (this.do_cr)
            {
              int i20 = i5 + 1;
              arrayOfByte2[i5] = 13;
              i5 = i20;
            }
            i19 = i5 + 1;
            arrayOfByte2[i5] = 10;
            break;
            i11 = i3 + 1;
            i12 = paramArrayOfByte[i3];
            i13 = 0;
            break label804;
            (i11 + 1);
            i15 = paramArrayOfByte[i11];
          }
        }
        if ((!this.do_newline) || (i4 <= 0) || (i == 19))
          break label1214;
        if (!this.do_cr)
          break label1224;
        i9 = i4 + 1;
        arrayOfByte2[i4] = 13;
      }
      while (true)
      {
        int i10 = i9 + 1;
        arrayOfByte2[i9] = 10;
        i5 = i10;
        break;
        if (i3 == k - 1)
        {
          byte[] arrayOfByte5 = this.tail;
          int i8 = this.tailLen;
          this.tailLen = (i8 + 1);
          arrayOfByte5[i8] = paramArrayOfByte[i3];
          i5 = i4;
          break;
        }
        if (i3 == k - 2)
        {
          byte[] arrayOfByte3 = this.tail;
          int i6 = this.tailLen;
          this.tailLen = (i6 + 1);
          arrayOfByte3[i6] = paramArrayOfByte[i3];
          byte[] arrayOfByte4 = this.tail;
          int i7 = this.tailLen;
          this.tailLen = (i7 + 1);
          arrayOfByte4[i7] = paramArrayOfByte[(i3 + 1)];
        }
        label1214: i5 = i4;
        break;
        label1224: i9 = i4;
      }
      label1231: i3 = j;
      i4 = i2;
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.Base64.Encoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */