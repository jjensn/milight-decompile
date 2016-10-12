package cn.jpush.b.a.a;

import cn.jpush.android.util.j;
import cn.jpush.b.a.c.a;
import java.nio.ByteBuffer;

public abstract class i extends g
{
  private static final String[] z;
  public int g;
  public String h;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "T|\b";
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
          i3 = 68;
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
        str1 = "XqM%6\033#\022";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "/\033z27\004>F$!)q\005w'\0335Mm";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 116;
        break label96;
        i3 = 81;
        break label96;
        i3 = 40;
        break label96;
        i3 = 87;
        break label96;
        m = 0;
      }
    }
  }

  public i(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, String paramString)
  {
    super(false, 2, 10, paramLong1, -1, paramLong2);
    this.g = paramInt3;
    this.h = paramString;
  }

  public i(f paramf, ByteBuffer paramByteBuffer)
  {
    super(false, paramf, paramByteBuffer);
  }

  protected void b()
  {
    if (this.g >= 0)
    {
      b(this.g);
      if (this.g > 0)
        a(this.h);
    }
  }

  protected void c()
  {
    int i = e();
    if ((i != 19) && (i != 3) && (i != 100) && (i != 25))
    {
      this.g = j.b(this.f, this);
      if (this.g > 0)
        this.h = a.a(this.f, this);
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(z[2]).append(this.g);
    if (this.h == null);
    for (String str = ""; ; str = z[1] + this.h)
      return str + z[0] + super.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */