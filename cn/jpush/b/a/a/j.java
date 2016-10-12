package cn.jpush.b.a.a;

import cn.jpush.b.a.c.a;
import cn.jpush.b.a.c.b;
import java.nio.ByteBuffer;

public final class j extends i
{
  private static final String[] z;
  int a;
  int b;
  String c;
  int d;

  static
  {
    Object localObject1 = new String[7];
    int i = 0;
    String str1 = "\020F\005O\023J\003\004|\004N\025\037E\017\006";
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
        i3 = 97;
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
        str1 = "\034KV";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\020F\005O\022O\017\031D*Y\037L";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "g*\031M\bR4\023Y\021S\b\005O<\034KVY\bX\\";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\020F\005O\023J\003\004~\bQ\003L";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\020F\033O\022O\007\021O[";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "n\003\005Z\016R\025\023\n\004N\024\031XA\021F\025E\005Y\\";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 60;
        continue;
        i3 = 102;
        continue;
        i3 = 118;
        continue;
        i3 = 42;
      }
    }
  }

  public j(f paramf, ByteBuffer paramByteBuffer)
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
    c(this.a);
    b(this.b);
    a(this.c);
    c(this.d);
  }

  public final void c()
  {
    super.c();
    if (this.g > 0)
    {
      b.b(z[6] + this.g + z[5] + this.h);
      return;
    }
    ByteBuffer localByteBuffer = this.f;
    this.a = cn.jpush.android.util.j.a(localByteBuffer, this);
    this.b = cn.jpush.android.util.j.b(localByteBuffer, this);
    this.c = a.a(localByteBuffer, this);
    this.d = cn.jpush.android.util.j.a(localByteBuffer, this);
  }

  public final int d()
  {
    return this.d;
  }

  public final String toString()
  {
    return z[3] + this.a + z[0] + this.b + z[2] + this.c + z[4] + this.d + z[1] + super.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */