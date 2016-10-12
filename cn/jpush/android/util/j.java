package cn.jpush.android.util;

import cn.jpush.android.api.c;
import cn.jpush.b.a.a.i;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public final class j
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[6];
    int i = 0;
    String str1 = "mI[B7=LHE3=M[C=o\bZE3~C}C3~M\023";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label36: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label52: int i2;
    int i3;
    if (k <= 1)
    {
      localObject4 = localObject3;
      n = m;
      i1 = k;
      localObject5 = localObject3;
      i2 = localObject5[m];
      switch (n % 5)
      {
      default:
        i3 = 82;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[m] = (char)(i3 ^ i2);
      m = n + 1;
      if (i1 == 0)
      {
        localObject5 = localObject4;
        n = m;
        m = i1;
        break label52;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "_Q]T\020hNOT H\\@]!";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "Q]T\020hNOT =AZ\021<hDE";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "aJPE7]OW7o\022";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "Q]T\020hNOT =AGW='";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "wzLB\"rFZTrt[\t_'qD";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 29;
        continue;
        i3 = 40;
        continue;
        i3 = 41;
        continue;
        i3 = 49;
      }
    }
  }

  public static int a(ByteBuffer paramByteBuffer, i parami)
  {
    try
    {
      int i = paramByteBuffer.getInt();
      return i;
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      a(localBufferUnderflowException.fillInStackTrace(), parami, paramByteBuffer);
      if (parami != null)
        parami.g = 10000;
      return -1;
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      while (true)
        a(localBufferOverflowException.fillInStackTrace(), parami, paramByteBuffer);
    }
    catch (Exception localException)
    {
      while (true)
        a(localException.fillInStackTrace(), parami, paramByteBuffer);
    }
  }

  public static ByteBuffer a(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte, i parami)
  {
    try
    {
      ByteBuffer localByteBuffer = paramByteBuffer.get(paramArrayOfByte);
      return localByteBuffer;
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      a(localBufferUnderflowException.fillInStackTrace(), parami, paramByteBuffer);
      if (parami != null)
        parami.g = 10000;
      return null;
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      while (true)
        a(localBufferOverflowException.fillInStackTrace(), parami, paramByteBuffer);
    }
    catch (Exception localException)
    {
      while (true)
        a(localException.fillInStackTrace(), parami, paramByteBuffer);
    }
  }

  private static void a(Throwable paramThrowable, i parami, ByteBuffer paramByteBuffer)
  {
    c localc = c.a();
    StringBuilder localStringBuilder1 = new StringBuilder();
    String str1;
    StringBuilder localStringBuilder2;
    if (parami != null)
    {
      if (parami != null)
        break label152;
      str1 = z[5];
      localStringBuilder1.append(str1);
      localStringBuilder2 = new StringBuilder(z[3]);
      if (paramByteBuffer != null)
        break label161;
    }
    label152: label161: for (String str2 = z[2]; ; str2 = paramByteBuffer.toString())
    {
      localStringBuilder1.append(str2);
      ac.e(z[1], z[4] + localStringBuilder1.toString());
      ac.e(z[1], z[0] + paramThrowable.getStackTrace().toString());
      localc.a(paramThrowable, localStringBuilder1.toString());
      return;
      str1 = parami.toString();
      break;
    }
  }

  public static short b(ByteBuffer paramByteBuffer, i parami)
  {
    try
    {
      short s = paramByteBuffer.getShort();
      return s;
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      a(localBufferUnderflowException.fillInStackTrace(), parami, paramByteBuffer);
      if (parami != null)
        parami.g = 10000;
      return -1;
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      while (true)
        a(localBufferOverflowException.fillInStackTrace(), parami, paramByteBuffer);
    }
    catch (Exception localException)
    {
      while (true)
        a(localException.fillInStackTrace(), parami, paramByteBuffer);
    }
  }

  public static Byte c(ByteBuffer paramByteBuffer, i parami)
  {
    try
    {
      Byte localByte = Byte.valueOf(paramByteBuffer.get());
      return localByte;
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      a(localBufferUnderflowException.fillInStackTrace(), parami, paramByteBuffer);
      if (parami != null)
        parami.g = 10000;
      return null;
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      while (true)
        a(localBufferOverflowException.fillInStackTrace(), parami, paramByteBuffer);
    }
    catch (Exception localException)
    {
      while (true)
        a(localException.fillInStackTrace(), parami, paramByteBuffer);
    }
  }

  public static long d(ByteBuffer paramByteBuffer, i parami)
  {
    try
    {
      long l = paramByteBuffer.getLong();
      return l;
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      a(localBufferUnderflowException.fillInStackTrace(), parami, paramByteBuffer);
      if (parami != null)
        parami.g = 10000;
      return 0L;
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      while (true)
        a(localBufferOverflowException.fillInStackTrace(), parami, paramByteBuffer);
    }
    catch (Exception localException)
    {
      while (true)
        a(localException.fillInStackTrace(), parami, paramByteBuffer);
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */