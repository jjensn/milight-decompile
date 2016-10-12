package cn.jpush.android.data;

public final class h
{
  private static final String[] z;
  private long a = 0L;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private String e = "";
  private long f = 0L;
  private long g = 0L;

  static
  {
    Object localObject1 = new String[7];
    int i = 0;
    String str1 = ".n6Pip+7Q@gs";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label36: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label52: int i2;
    int i3;
    if (k <= 1)
    {
      localObject4 = localObject3;
      n = m;
      i1 = k;
      localObject5 = localObject3;
      i2 = localObject5[m];
      switch (n % 5)
      {
      default:
        i3 = 54;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[m] = (char)(i3 ^ i2);
      m = n + 1;
      if (i1 == 0)
      {
        localObject5 = localObject4;
        n = m;
        m = i1;
        break label52;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = ".n6Pic*>aBk#?\003";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = ".n6Piv7*[\013";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "N!9_ZL!.WPk-;J_m \036|rc:;\036mn \005WR?";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = ".n6Pia!/PB?";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = ".n6Piv<3YQg<\005J_o+g";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = ".n6Pig6.LW?";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 2;
        continue;
        i3 = 78;
        continue;
        i3 = 90;
        continue;
        i3 = 62;
      }
    }
  }

  public h()
  {
  }

  public final long a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    this.b = paramInt;
  }

  public final void a(long paramLong)
  {
    this.a = paramLong;
  }

  public final void a(String paramString)
  {
    this.e = paramString;
  }

  public final int b()
  {
    return this.b;
  }

  public final void b(int paramInt)
  {
    this.c = paramInt;
  }

  public final void b(long paramLong)
  {
    this.g = paramLong;
  }

  public final int c()
  {
    return this.c;
  }

  public final void c(int paramInt)
  {
    this.d = paramInt;
  }

  public final void c(long paramLong)
  {
    this.f = paramLong;
  }

  public final String d()
  {
    return this.e;
  }

  public final long e()
  {
    return this.g;
  }

  public final long f()
  {
    return this.f;
  }

  public final String toString()
  {
    return z[3] + this.a + z[4] + this.b + z[0] + this.c + z[2] + this.d + z[6] + this.e + z[5] + this.f + z[1] + this.g + "]";
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */