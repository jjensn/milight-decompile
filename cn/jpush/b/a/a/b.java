package cn.jpush.b.a.a;

import cn.jpush.android.util.j;
import cn.jpush.b.a.c.a;
import java.nio.ByteBuffer;

public final class b extends i
{
  private static final String[] z;
  long a;
  String b;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "\002:\034K\bmu\037L\n@nK";
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
          i3 = 111;
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
        str1 = "\0167Q";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 46;
        break label96;
        i3 = 26;
        break label96;
        i3 = 113;
        break label96;
        i3 = 56;
        break label96;
        m = 0;
      }
    }
  }

  public b(f paramf, ByteBuffer paramByteBuffer)
  {
    super(paramf, paramByteBuffer);
  }

  public final long a()
  {
    return this.a;
  }

  public final void b()
  {
    super.b();
    a(this.a);
    a(this.b);
  }

  public final void c()
  {
    super.c();
    ByteBuffer localByteBuffer = this.f;
    this.a = j.d(localByteBuffer, this);
    this.b = a.a(localByteBuffer, this);
  }

  public final String d()
  {
    return this.b;
  }

  public final String toString()
  {
    return z[2] + this.a + z[0] + this.b + z[1] + super.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */