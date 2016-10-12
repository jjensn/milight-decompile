package cn.jpush.b.a.c;

public final class c
{
  private static final String z;

  static
  {
    Object localObject1 = "9&Sy<!zXtHU\016$\bO".toCharArray();
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    int k;
    int m;
    Object localObject3;
    label27: int n;
    int i1;
    if (i <= 1)
    {
      localObject2 = localObject1;
      k = j;
      m = i;
      localObject3 = localObject1;
      n = localObject3[j];
      switch (k % 5)
      {
      default:
        i1 = 77;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject3[j] = (char)(i1 ^ n);
      j = k + 1;
      if (m == 0)
      {
        localObject3 = localObject2;
        k = j;
        j = m;
        break label27;
      }
      i = m;
      localObject1 = localObject2;
      if (i > j)
        break;
      z = new String((char[])localObject1).intern();
      return;
      i1 = 9;
      continue;
      i1 = 23;
      continue;
      i1 = 77;
      continue;
      i1 = 96;
    }
  }

  public static String a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return "";
    StringBuffer localStringBuffer = new StringBuffer(2 * paramArrayOfByte.length);
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramArrayOfByte[i];
      localStringBuffer.append(z.charAt(0xF & j >> 4)).append(z.charAt(j & 0xF));
      localStringBuffer.append((char)' ');
    }
    return localStringBuffer.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */