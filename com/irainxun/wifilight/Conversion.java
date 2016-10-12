package com.irainxun.wifilight;

import java.util.Formatter;

public class Conversion
{
  public Conversion()
  {
  }

  public static String BytetohexString(byte[] paramArrayOfByte, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder(3 * paramArrayOfByte.length);
    Formatter localFormatter = new Formatter(localStringBuilder);
    int i = 0;
    if (i >= paramInt)
    {
      localFormatter.close();
      return localStringBuilder.toString();
    }
    if (i < paramInt - 1)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Byte.valueOf(paramArrayOfByte[i]);
      localFormatter.format("%02X:", arrayOfObject2);
    }
    while (true)
    {
      i++;
      break;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Byte.valueOf(paramArrayOfByte[i]);
      localFormatter.format("%02X", arrayOfObject1);
    }
  }

  static String BytetohexString(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder(3 * paramArrayOfByte.length);
    Formatter localFormatter = new Formatter(localStringBuilder);
    if (!paramBoolean)
    {
      int j = 0;
      if (j >= paramArrayOfByte.length)
      {
        localFormatter.close();
        return localStringBuilder.toString();
      }
      if (j < -1 + paramArrayOfByte.length)
      {
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Byte.valueOf(paramArrayOfByte[j]);
        localFormatter.format("%02X:", arrayOfObject4);
      }
      while (true)
      {
        j++;
        break;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Byte.valueOf(paramArrayOfByte[j]);
        localFormatter.format("%02X", arrayOfObject3);
      }
    }
    int i = -1 + paramArrayOfByte.length;
    label120: if (i >= 0)
    {
      if (i <= 0)
        break label162;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Byte.valueOf(paramArrayOfByte[i]);
      localFormatter.format("%02X:", arrayOfObject2);
    }
    while (true)
    {
      i--;
      break label120;
      break;
      label162: Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Byte.valueOf(paramArrayOfByte[i]);
      localFormatter.format("%02X", arrayOfObject1);
    }
  }

  public static short buildUint16(byte paramByte1, byte paramByte2)
  {
    return (short)((paramByte1 << 8) + (paramByte2 & 0xFF));
  }

  public static String bytesToHexString(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      return null;
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfByte.length)
        return localStringBuilder.toString();
      String str = Integer.toHexString(0xFF & paramArrayOfByte[i]);
      if (str.length() < 2)
        localStringBuilder.append(0);
      localStringBuilder.append(str);
    }
  }

  public static int hexStringtoByte(String paramString, byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 0;
    int k;
    if (paramString != null)
    {
      k = 0;
      if (k < paramString.length());
    }
    else
    {
      return j;
    }
    if (((paramString.charAt(k) >= '0') && (paramString.charAt(k) <= '9')) || ((paramString.charAt(k) >= 'a') && (paramString.charAt(k) <= 'f')) || ((paramString.charAt(k) >= 'A') && (paramString.charAt(k) <= 'F')))
    {
      if (i == 0)
        break label127;
      paramArrayOfByte[j] = (byte)(paramArrayOfByte[j] + (byte)Character.digit(paramString.charAt(k), 16));
      j++;
      label115: if (i == 0)
        break label147;
    }
    label147: for (i = 0; ; i = 1)
    {
      k++;
      break;
      label127: paramArrayOfByte[j] = (byte)(Character.digit(paramString.charAt(k), 16) << 4);
      break label115;
    }
  }

  public static byte hiUint16(short paramShort)
  {
    return (byte)(paramShort >> 8);
  }

  private static boolean isAsciiPrintable(char paramChar)
  {
    return (paramChar >= ' ') && (paramChar < '');
  }

  public static boolean isAsciiPrintable(String paramString)
  {
    if (paramString == null)
      return false;
    int i = paramString.length();
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return true;
      if (!isAsciiPrintable(paramString.charAt(j)))
        break;
    }
  }

  public static byte loUint16(short paramShort)
  {
    return (byte)(paramShort & 0xFF);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.Conversion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */