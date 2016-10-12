package cn.jpush.b.a.a;

import cn.jpush.b.a.c.a;
import java.nio.ByteBuffer;

public final class f
{
  private static final String[] z;
  int a;
  int b;
  int c;
  Long d;
  int e;
  long f;
  private boolean g = false;

  static
  {
    Object localObject1 = new String[7];
    int i = 0;
    String str1 = "ti\013\\^b";
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
        i3 = 58;
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
        str1 = "ti\n\\^b";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "ti\022@S<s";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\003\0030P[<\024X\030\0324,\026\017";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\f!\035\025R=(\034\025S+i\026ZNx \026\\N1(\024\\@=-XL_,g";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 88;
        continue;
        i3 = 73;
        continue;
        i3 = 120;
        continue;
        i3 = 53;
      }
    }
  }

  public f(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, long paramLong1, int paramInt4, long paramLong2)
  {
    this.g = paramBoolean;
    this.a = 0;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = Long.valueOf(paramLong1);
    this.e = paramInt4;
    this.f = paramLong2;
  }

  public f(boolean paramBoolean, int paramInt1, int paramInt2, long paramLong)
  {
    this(paramBoolean, 0, paramInt1, paramInt2, paramLong, 0, 0L);
  }

  public f(boolean paramBoolean, byte[] paramArrayOfByte)
  {
    this.g = false;
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.a = localByteBuffer.getShort();
    this.b = localByteBuffer.get();
    this.c = localByteBuffer.get();
    this.d = Long.valueOf(localByteBuffer.getLong());
    this.f = localByteBuffer.getLong();
  }

  public final Long a()
  {
    return this.d;
  }

  public final long b()
  {
    return this.f;
  }

  public final byte[] c()
  {
    if (this.a == 0)
      throw new IllegalStateException(z[6]);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(24);
    localByteBuffer.putShort((short)this.a);
    localByteBuffer.put((byte)this.b);
    localByteBuffer.put((byte)this.c);
    localByteBuffer.putLong(this.d.longValue());
    if (this.g)
      localByteBuffer.putInt(this.e);
    localByteBuffer.putLong(this.f);
    localByteBuffer.flip();
    return a.a(localByteBuffer);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(z[4]).append(this.a).append(z[5]).append(this.b).append(z[3]).append(this.c).append(z[1]).append(this.d);
    if (this.g);
    for (String str = z[0] + this.e; ; str = "")
      return str + z[2] + this.f;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */