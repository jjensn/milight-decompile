package cn.jpush.android.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class am
{
  public static byte[] a(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[1024];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    paramInputStream.close();
    return localByteArrayOutputStream.toByteArray();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */