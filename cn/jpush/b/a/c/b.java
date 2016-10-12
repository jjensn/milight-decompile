package cn.jpush.b.a.c;

import java.io.PrintStream;

public final class b
{
  private static final String z;

  static
  {
    Object localObject1 = "z\023-\r#I\004]Up".toCharArray();
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
        i1 = 80;
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
      i1 = 33;
      continue;
      i1 = 89;
      continue;
      i1 = 125;
      continue;
      i1 = 120;
    }
  }

  public static void a(String paramString)
  {
    System.out.println(z + paramString);
  }

  public static void b(String paramString)
  {
    System.out.println(z + paramString);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */