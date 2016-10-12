package com.google.gson.jpush.internal;

import java.lang.reflect.Type;

final class j
  implements ae<T>
{
  private static final String[] z;
  private final UnsafeAllocator d = UnsafeAllocator.create();

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "~e=@\021N+(M]Be*M\026N+2MPJy;Q]Hd2Q\tY~?V\022Y+:M\017\013";
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
          i3 = 125;
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
        str1 = "\005+\016G\032Bx(G\017\013j2\0024Ex(C\023Hn\037P\030J3P]\\b(J]lx3L]Md.\002\tCb/\002\tR{9\002\020Jr|D\024S+(J\024X+,P\022Ig9OS";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 43;
        break label96;
        i3 = 11;
        break label96;
        i3 = 92;
        break label96;
        i3 = 34;
        break label96;
        m = 0;
      }
    }
  }

  j(f paramf, Class paramClass, Type paramType)
  {
  }

  public final T a()
  {
    try
    {
      Object localObject = this.d.newInstance(this.a);
      return localObject;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(z[0] + this.b + z[1], localException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */