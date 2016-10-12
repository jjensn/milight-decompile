package cn.jpush.b.a.a;

import cn.jpush.android.util.j;
import cn.jpush.b.a.c.a;
import java.nio.ByteBuffer;

public final class k extends i
{
  private static final String[] z;
  int a;
  long b;
  String c;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "RS(";
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
          i3 = 108;
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
        str1 = "^^e\025\0131\021f\022\t\034\n2";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = ")3m\025\037\023\031m6\031\001\026UFAR\023{\0018\013\016m\\";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "^^e\025\013;\0322";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 114;
        break label96;
        i3 = 126;
        break label96;
        i3 = 8;
        break label96;
        i3 = 102;
        break label96;
        m = 0;
      }
    }
  }

  public k(f paramf, ByteBuffer paramByteBuffer)
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
  }

  public final void c()
  {
    super.c();
    ByteBuffer localByteBuffer = this.f;
    this.a = j.c(localByteBuffer, this).byteValue();
    this.b = j.d(localByteBuffer, this);
    this.c = a.a(localByteBuffer, this);
  }

  public final long d()
  {
    return this.b;
  }

  public final String h()
  {
    return this.c;
  }

  public final String toString()
  {
    return z[2] + this.a + z[3] + this.b + z[1] + this.c + z[0] + super.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */