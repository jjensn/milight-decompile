package cn.jpush.b.a.a;

import cn.jpush.a.a.z;
import cn.jpush.b.a.b.p;
import cn.jpush.b.a.c.a;
import com.google.protobuf.jpush.j;
import java.nio.ByteBuffer;

public final class d extends i
{
  private static final String[] z;
  int a;
  p b;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = ":k\"";
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
          i3 = 81;
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
        str1 = "A\017O 4i6m\034\"\033\"_qj4m\006>y)nH";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "T\023N>qU$h\0272n";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "S\013\"0>~?\">4t!v\032q7f";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 26;
        break label96;
        i3 = 70;
        break label96;
        i3 = 2;
        break label96;
        i3 = 114;
        break label96;
        m = 0;
      }
    }
  }

  public d(f paramf, ByteBuffer paramByteBuffer)
  {
    super(paramf, paramByteBuffer);
  }

  public final p a()
  {
    return this.b;
  }

  public final void b()
  {
    super.b();
    if (this.b != null)
    {
      byte[] arrayOfByte = this.b.a().ae();
      this.a = arrayOfByte.length;
      new StringBuilder(z[3]).append(this.a);
      b(this.a);
      a(arrayOfByte);
    }
  }

  public final void c()
  {
    super.c();
    this.a = this.f.getShort();
    new StringBuilder(z[3]).append(this.a);
    ByteBuffer localByteBuffer = this.f;
    try
    {
      this.b = new p(a.a(localByteBuffer));
      return;
    }
    catch (j localj)
    {
      localj.printStackTrace();
    }
  }

  public final String toString()
  {
    if (this.b == null);
    for (String str = z[2]; ; str = this.b.toString())
      return z[1] + str + z[0] + super.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */