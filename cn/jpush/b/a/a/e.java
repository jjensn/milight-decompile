package cn.jpush.b.a.a;

import cn.jpush.b.a.c.c;
import java.nio.ByteBuffer;

public final class e
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "LZ\bT|\030W\005AuK\025Q\025";
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
          i3 = 16;
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
        str1 = "m[\027[O[\\VUX\035[t\030S\023G0HT\016FyVR\\\\~ZZ\t[t\026";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "HT\016Fu\\\025\024Pq\\\025Q\025";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 56;
        break label96;
        i3 = 53;
        break label96;
        i3 = 124;
        break label96;
        i3 = 53;
        break label96;
        m = 0;
      }
    }
  }

  public static i a(byte[] paramArrayOfByte)
  {
    new StringBuilder(z[0]).append(c.a(paramArrayOfByte));
    int i = -20 + paramArrayOfByte.length;
    byte[] arrayOfByte1 = new byte[20];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 0, 20);
    byte[] arrayOfByte2 = new byte[i];
    System.arraycopy(paramArrayOfByte, 20, arrayOfByte2, 0, i);
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte2);
    f localf = new f(false, arrayOfByte1);
    new StringBuilder(z[2]).append(localf.toString());
    switch (localf.c)
    {
    default:
      cn.jpush.b.a.c.b.a(z[1]);
      return null;
    case 0:
      return new l(localf, localByteBuffer);
    case 1:
      return new j(localf, localByteBuffer);
    case 19:
      return new a(localf, localByteBuffer);
    case 10:
      return new n(localf, localByteBuffer);
    case 25:
      return new b(localf, localByteBuffer);
    case 3:
      return new k(localf, localByteBuffer);
    case 100:
    }
    return new d(localf, localByteBuffer);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */