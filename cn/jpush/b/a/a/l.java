package cn.jpush.b.a.a;

import cn.jpush.android.util.j;
import cn.jpush.b.a.c.a;
import cn.jpush.b.a.c.b;
import java.nio.ByteBuffer;

public final class l extends i
{
  private static final String[] z;
  long a;
  String b;
  String c;
  String d;
  String i;

  static
  {
    Object localObject1 = new String[7];
    int j = 0;
    String str1 = "\005Y\0206X@\032\021\032J\023";
    int k = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int m = localObject3.length;
    int n = 0;
    label36: Object localObject4;
    int i1;
    int i2;
    Object localObject5;
    label52: int i3;
    int i4;
    if (m <= 1)
    {
      localObject4 = localObject3;
      i1 = n;
      i2 = m;
      localObject5 = localObject3;
      i3 = localObject5[n];
      switch (i1 % 5)
      {
      default:
        i4 = 46;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[n] = (char)(i4 ^ i3);
      n = i1 + 1;
      if (i2 == 0)
      {
        localObject5 = localObject4;
        i1 = n;
        n = i2;
        break label52;
      }
      m = i2;
      localObject3 = localObject4;
      if (m > n)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (k)
      {
      default:
        localObject1[j] = str2;
        j = 1;
        str1 = "\005Y\0042]Z\016\033!J\023";
        localObject1 = localObject2;
        k = 0;
        break;
      case 0:
        localObject1[j] = str2;
        j = 2;
        str1 = "\tTT";
        k = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[j] = str2;
        j = 3;
        str1 = "r+\0214GZ\r\021!|L\n\004<@Z\034)s\003\t\023\001:J\023";
        k = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[j] = str2;
        j = 4;
        str1 = "\005Y\0066I`\035N";
        k = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[j] = str2;
        j = 5;
        str1 = "\005Y\0316]Z\030\0236\024";
        k = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[j] = str2;
        j = 6;
        str1 = "{\034\007#AG\n\021sK[\013\033!\016\004Y\027<JLC";
        k = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[j] = str2;
        z = localObject2;
        return;
        i4 = 41;
        continue;
        i4 = 121;
        continue;
        i4 = 116;
        continue;
        i4 = 83;
      }
    }
  }

  public l(f paramf, ByteBuffer paramByteBuffer)
  {
    super(paramf, paramByteBuffer);
  }

  public final long a()
  {
    return this.a;
  }

  protected final void b()
  {
    super.b();
    a(this.a);
    a(this.b);
    a(this.c);
    a(this.d);
  }

  protected final void c()
  {
    super.c();
    if (this.g > 0)
      b.b(z[6] + this.g + z[5] + this.h);
    ByteBuffer localByteBuffer;
    do
    {
      return;
      localByteBuffer = this.f;
      if (this.g == 0)
      {
        this.a = j.d(localByteBuffer, this);
        this.b = a.a(localByteBuffer, this);
        this.c = a.a(localByteBuffer, this);
        this.d = a.a(localByteBuffer, this);
        return;
      }
    }
    while (this.g != 1007);
    this.i = a.a(localByteBuffer, this);
  }

  public final String d()
  {
    return this.b;
  }

  public final String h()
  {
    return this.c;
  }

  public final String i()
  {
    return this.d;
  }

  public final String toString()
  {
    return z[3] + this.a + z[1] + this.b + z[4] + this.c + z[0] + this.d + z[2] + super.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */