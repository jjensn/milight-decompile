package cn.jpush.android.data;

public final class q
{
  private static final String[] z;
  private String a = "";
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = "";
  private int f = 0;
  private int g = 0;
  private int h = 0;
  private int i = 0;
  private int j = 0;
  private int k = 0;

  static
  {
    Object localObject1 = new String[11];
    int m = 0;
    String str1 = "J,j\030!\bxVD\013W<4";
    int n = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int i1 = localObject3.length;
    int i2 = 0;
    label36: Object localObject4;
    int i3;
    int i4;
    Object localObject5;
    label52: int i5;
    int i6;
    if (i1 <= 1)
    {
      localObject4 = localObject3;
      i3 = i2;
      i4 = i1;
      localObject5 = localObject3;
      i5 = localObject5[i2];
      switch (i3 % 5)
      {
      default:
        i6 = 84;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[i2] = (char)(i6 ^ i5);
      i2 = i3 + 1;
      if (i4 == 0)
      {
        localObject5 = localObject4;
        i3 = i2;
        i2 = i4;
        break label52;
      }
      i1 = i4;
      localObject3 = localObject4;
      if (i1 > i2)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (n)
      {
      default:
        localObject1[m] = str2;
        m = 1;
        str1 = "5xh\003=\025x`\024'\"NM\026 \007,R\004 9f\005 [";
        localObject1 = localObject2;
        n = 0;
        break;
      case 0:
        localObject1[m] = str2;
        m = 2;
        str1 = "J,o\026=\nimJ";
        n = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[m] = str2;
        m = 3;
        str1 = "J,z\003\013\005cg\031\013\017|4";
        n = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[m] = str2;
        m = 4;
        str1 = "J,j\030!\bxVFi";
        n = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[m] = str2;
        m = 5;
        str1 = "J,z\003\013\bi}J";
        n = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[m] = str2;
        m = 6;
        str1 = "J,}\030 \007`4";
        n = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[m] = str2;
        m = 7;
        str1 = "J,z\003\013\ncj\02689hg\004i";
        n = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[m] = str2;
        m = 8;
        str1 = "J,j\030!\bxVF\013U1";
        n = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[m] = str2;
        m = 9;
        str1 = "J,j\030!\bxVFd[";
        n = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[m] = str2;
        m = 10;
        str1 = "J,z\003\013\025c|\0057\0031";
        n = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[m] = str2;
        z = localObject2;
        return;
        i6 = 102;
        continue;
        i6 = 12;
        continue;
        i6 = 9;
        continue;
        i6 = 119;
      }
    }
  }

  public q()
  {
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    this.f = paramInt;
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }

  public final String b()
  {
    return this.b;
  }

  public final void b(int paramInt)
  {
    this.g = paramInt;
  }

  public final void b(String paramString)
  {
    this.b = paramString;
  }

  public final String c()
  {
    return this.c;
  }

  public final void c(int paramInt)
  {
    this.h = paramInt;
  }

  public final void c(String paramString)
  {
    this.c = paramString;
  }

  public final String d()
  {
    return this.d;
  }

  public final void d(int paramInt)
  {
    this.i = paramInt;
  }

  public final void d(String paramString)
  {
    this.d = paramString;
  }

  public final String e()
  {
    return this.e;
  }

  public final void e(int paramInt)
  {
    this.j = paramInt;
  }

  public final void e(String paramString)
  {
    this.e = paramString;
  }

  public final int f()
  {
    return this.f;
  }

  public final void f(int paramInt)
  {
    this.k = paramInt;
  }

  public final int g()
  {
    return this.g;
  }

  public final int h()
  {
    return this.h;
  }

  public final int i()
  {
    return this.i;
  }

  public final int j()
  {
    return this.j;
  }

  public final int k()
  {
    return this.k;
  }

  public final String toString()
  {
    return z[1] + this.a + z[5] + this.b + z[3] + this.c + z[7] + this.d + z[10] + this.e + z[2] + this.f + z[6] + this.g + z[4] + this.h + z[8] + this.i + z[0] + this.j + z[9] + this.k + "]";
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */