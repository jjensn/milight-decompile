package cn.jpush.b.a.a;

import cn.jpush.b.a.c.a;
import java.nio.ByteBuffer;

public final class m extends h
{
  private static final String[] z;
  String a;
  String b;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = ";l5;,~#:b";
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
          i3 = 88;
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
        str1 = "7at";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "L\0305?9{%5+\nr=!=+c\021tuxv<$\023=nv";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 23;
        break label96;
        i3 = 76;
        break label96;
        i3 = 84;
        break label96;
        i3 = 88;
        break label96;
        m = 0;
      }
    }
  }

  public m(long paramLong, String paramString1, String paramString2)
  {
    super(2, 10, paramLong);
    this.a = paramString1;
    this.b = paramString2;
  }

  public final String a()
  {
    return this.b;
  }

  public final void b()
  {
    a(this.a);
    a(this.b);
  }

  public final void c()
  {
    ByteBuffer localByteBuffer = this.f;
    this.a = a.c(localByteBuffer);
    this.b = a.c(localByteBuffer);
  }

  public final String toString()
  {
    return z[2] + this.a + z[0] + this.b + z[1] + super.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */