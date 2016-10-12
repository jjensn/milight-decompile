package cn.jpush.b.a.a;

import cn.jpush.android.util.j;
import cn.jpush.b.a.c.b;
import java.nio.ByteBuffer;

public final class n extends i
{
  private static final String[] z;
  int a;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "0\003%\026\007B\0031%\016X\022-\031\030N?bZKX\0073\002\016E\001'M";
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
          i3 = 119;
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
        str1 = "K\006B";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "G\013\017'\004\030J\005'M";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "9N\0212\030\005X\007b\022\031Y\r0WF\013\001-\023\016\021";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 107;
        break label96;
        i3 = 43;
        break label96;
        i3 = 98;
        break label96;
        i3 = 66;
        break label96;
        m = 0;
      }
    }
  }

  public n(long paramLong1, long paramLong2, int paramInt1, String paramString, int paramInt2)
  {
    super(2, 10, paramLong1, paramLong2, 0, null);
    this.a = 0;
  }

  public n(f paramf, ByteBuffer paramByteBuffer)
  {
    super(paramf, paramByteBuffer);
  }

  public final void b()
  {
    super.b();
    c(this.a);
  }

  public final void c()
  {
    super.c();
    if (this.g > 0)
    {
      b.b(z[3] + this.g + z[2] + this.h);
      return;
    }
    this.a = j.b(this.f, this);
  }

  public final String toString()
  {
    return z[0] + this.a + z[1] + super.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */