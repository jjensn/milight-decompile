package cn.jpush.b.a.c;

import cn.jpush.android.util.ac;
import cn.jpush.android.util.j;
import cn.jpush.b.a.a.i;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class a
{
  private static final String z;

  static
  {
    Object localObject1 = "\035Do\031n".toCharArray();
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    int k;
    int m;
    Object localObject3;
    label27: int n;
    int i1;
    if (i <= 1)
    {
      localObject2 = localObject1;
      k = j;
      m = i;
      localObject3 = localObject1;
      n = localObject3[j];
      switch (k % 5)
      {
      default:
        i1 = 86;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject3[j] = (char)(i1 ^ n);
      j = k + 1;
      if (m == 0)
      {
        localObject3 = localObject2;
        k = j;
        j = m;
        break label27;
      }
      i = m;
      localObject1 = localObject2;
      if (i > j)
        break;
      z = new String((char[])localObject1).intern();
      return;
      i1 = 72;
      continue;
      i1 = 16;
      continue;
      i1 = 41;
      continue;
      i1 = 52;
    }
  }

  public static String a(ByteBuffer paramByteBuffer, i parami)
  {
    int i = j.b(paramByteBuffer, parami);
    if (i < 0)
    {
      ac.d();
      return null;
    }
    byte[] arrayOfByte = new byte[i];
    j.a(paramByteBuffer, arrayOfByte, parami);
    try
    {
      String str = new String(arrayOfByte, z);
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return null;
  }

  public static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = (byte)(paramInt1 >>> 24);
    arrayOfByte[1] = (byte)(paramInt1 >>> 16);
    arrayOfByte[2] = (byte)(paramInt1 >>> 8);
    arrayOfByte[3] = (byte)paramInt1;
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt2, 4);
  }

  public static void a(byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    byte[] arrayOfByte = paramString.getBytes();
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt, arrayOfByte.length);
  }

  public static byte[] a(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString)))
      return new byte[] { 0, 0 };
    try
    {
      byte[] arrayOfByte4 = paramString.getBytes(z);
      arrayOfByte1 = arrayOfByte4;
      int i = (short)arrayOfByte1.length;
      byte[] arrayOfByte2 = new byte[i + 2];
      byte[] arrayOfByte3 = new byte[2];
      arrayOfByte3[0] = (byte)(i >>> 8);
      arrayOfByte3[1] = (byte)i;
      System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, 2);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 2, i);
      return arrayOfByte2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        byte[] arrayOfByte1 = null;
    }
  }

  public static byte[] a(ByteBuffer paramByteBuffer)
  {
    try
    {
      byte[] arrayOfByte = new byte[paramByteBuffer.remaining()];
      paramByteBuffer.get(arrayOfByte);
      return arrayOfByte;
    }
    catch (NegativeArraySizeException localNegativeArraySizeException)
    {
      ac.d();
      return null;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static byte[] b(ByteBuffer paramByteBuffer)
  {
    try
    {
      byte[] arrayOfByte = new byte[paramByteBuffer.remaining()];
      paramByteBuffer.asReadOnlyBuffer().flip();
      paramByteBuffer.get(arrayOfByte);
      return arrayOfByte;
    }
    catch (NegativeArraySizeException localNegativeArraySizeException)
    {
      ac.d();
      return null;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String c(ByteBuffer paramByteBuffer)
  {
    try
    {
      byte[] arrayOfByte = new byte[paramByteBuffer.getShort()];
      paramByteBuffer.get(arrayOfByte);
      String str = new String(arrayOfByte, z);
      return str;
    }
    catch (Exception localException)
    {
      return null;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label30;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */