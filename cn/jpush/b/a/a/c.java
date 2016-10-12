package cn.jpush.b.a.a;

import cn.jpush.a.a.z;
import cn.jpush.b.a.b.p;
import cn.jpush.b.a.c.a;
import com.google.protobuf.jpush.j;
import java.nio.ByteBuffer;

public final class c extends h
{
  private static final String[] z;
  int a;
  p b;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "\\N6m\026mG7mS(";
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
          i3 = 126;
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
        str1 = "Aks\017\021l_s\001\033fA'%^%\006";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "So\036\037\033yS6>\nU\006~m\016zI'\"\035gJi";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "(\013s";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 8;
        break label96;
        i3 = 38;
        break label96;
        i3 = 83;
        break label96;
        i3 = 77;
        break label96;
        m = 0;
      }
    }
  }

  public c(long paramLong, p paramp)
  {
    super(1, 100, paramLong);
    this.b = paramp;
  }

  public final p a()
  {
    return this.b;
  }

  public final void b()
  {
    if (this.b != null)
    {
      byte[] arrayOfByte = this.b.a().ae();
      this.a = arrayOfByte.length;
      b(this.a);
      a(arrayOfByte);
    }
  }

  public final void c()
  {
    new StringBuilder(z[0]).append(cn.jpush.b.a.c.c.a(this.e.c()));
    this.a = this.f.getShort();
    new StringBuilder(z[1]).append(this.a);
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
    StringBuilder localStringBuilder = new StringBuilder(z[2]);
    if (this.b == null);
    for (String str = ""; ; str = this.b.toString())
      return str + z[3] + super.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */