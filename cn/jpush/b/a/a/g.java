package cn.jpush.b.a.a;

import cn.jpush.b.a.c.a;
import cn.jpush.b.a.c.b;
import cn.jpush.b.a.c.c;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public abstract class g
{
  private static final String[] z;
  private boolean a;
  protected f e;
  protected ByteBuffer f;

  static
  {
    Object localObject1 = new String[6];
    int i = 0;
    String str1 = "";
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
        i3 = 65;
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
        str1 = "H]X";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "3\"\035/4\r\003\f\003";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "3\"\035-1\007\036\013;\034";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "DP\032'5\r\003B~";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = ".\031\026?-H]X2$\006J";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 104;
        continue;
        i3 = 112;
        continue;
        i3 = 120;
        continue;
        i3 = 94;
      }
    }
  }

  public g(boolean paramBoolean, int paramInt1, int paramInt2, long paramLong)
  {
    this.a = true;
    this.e = new f(true, paramInt1, paramInt2, paramLong);
    this.f = ByteBuffer.allocate(7168);
  }

  public g(boolean paramBoolean, int paramInt1, int paramInt2, long paramLong1, int paramInt3, long paramLong2)
  {
    this.a = false;
    this.e = new f(false, 0, paramInt1, paramInt2, paramLong1, -1, paramLong2);
    this.f = ByteBuffer.allocate(7168);
  }

  public g(boolean paramBoolean, f paramf, ByteBuffer paramByteBuffer)
  {
    this.a = false;
    this.e = paramf;
    if (paramByteBuffer != null)
    {
      this.f = paramByteBuffer;
      c();
      return;
    }
    b.a(z[0]);
  }

  private final byte[] a()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte1 = a.b(this.f);
    f localf = this.e;
    if (this.a)
    {
      i = 24;
      while (true)
      {
        localf.a = (i + arrayOfByte1.length);
        try
        {
          localByteArrayOutputStream.write(this.e.c());
          localByteArrayOutputStream.write(arrayOfByte1);
          label57: byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
          new StringBuilder(z[5]).append(arrayOfByte2.length).append(z[4]).append(c.a(arrayOfByte2));
          return arrayOfByte2;
          i = 20;
        }
        catch (Exception localException)
        {
          break label57;
        }
      }
    }
  }

  protected final void a(int paramInt)
  {
    this.f.put((byte)paramInt);
  }

  protected final void a(long paramLong)
  {
    this.f.putLong(paramLong);
  }

  protected final void a(String paramString)
  {
    this.f.put(a.a(paramString));
  }

  protected final void a(byte[] paramArrayOfByte)
  {
    this.f.put(paramArrayOfByte);
  }

  protected abstract void b();

  protected final void b(int paramInt)
  {
    this.f.putShort((short)paramInt);
  }

  protected abstract void c();

  protected final void c(int paramInt)
  {
    this.f.putInt(paramInt);
  }

  public final int e()
  {
    return this.e.c;
  }

  public final f f()
  {
    return this.e;
  }

  public final byte[] g()
  {
    this.f.clear();
    b();
    this.f.flip();
    return a();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.a);
    for (String str = z[2]; ; str = z[3])
      return str + z[1] + this.e.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */