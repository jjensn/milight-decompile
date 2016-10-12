package cn.jpush.b.a.a;

import cn.jpush.android.util.j;
import java.nio.ByteBuffer;

public final class a extends i
{
  private static final String[] z;
  int a;
  int b;
  int c;
  long d;

  static
  {
    String[] arrayOfString1 = new String[5];
    String str1 = "\0023;\030 ^)";
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
          i3 = 69;
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
        str1 = "\0023;\030$Zf;V";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "\016>h";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        str1 = "\0023;\030,Cvr";
        j = 3;
        arrayOfString2 = arrayOfString1;
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        j = 4;
        arrayOfString2 = arrayOfString1;
        str1 = "uR+\007\013Aa%\r)s3eL7Kb=\t6ZP'\001(O},V";
        i = 3;
        break;
      case 3:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 46;
        break label96;
        i3 = 19;
        break label96;
        i3 = 72;
        break label96;
        i3 = 108;
        break label96;
        m = 0;
      }
    }
  }

  public a(f paramf, ByteBuffer paramByteBuffer)
  {
    super(paramf, paramByteBuffer);
  }

  public final int a()
  {
    return this.a;
  }

  public final void b()
  {
    super.b();
    a(this.a);
    a(this.b);
    a(this.c);
    a(this.d);
  }

  public final void c()
  {
    super.c();
    ByteBuffer localByteBuffer = this.f;
    this.a = j.c(localByteBuffer, this).byteValue();
    this.b = j.c(localByteBuffer, this).byteValue();
    this.c = j.c(localByteBuffer, this).byteValue();
    this.d = j.d(localByteBuffer, this);
  }

  public final String toString()
  {
    return z[4] + this.a + z[0] + this.b + z[1] + this.c + z[3] + this.d + z[2] + super.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */