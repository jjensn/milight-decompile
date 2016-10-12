package com.google.protobuf.jpush;

import java.io.IOException;

public final class f extends IOException
{
  private static final String z;

  static
  {
    Object localObject1 = "|$JSXp>ZFIK\030ZDY^&\016A]LkYDUK\"@Q\034K$\016W\034Y'OB\034]2ZS\034^9\\WE\037*@R\034M*@\026SJ?\016YZ\0378^W_Ze".toCharArray();
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
        i1 = 60;
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
      i1 = 63;
      continue;
      i1 = 75;
      continue;
      i1 = 46;
      continue;
      i1 = 54;
    }
  }

  f()
  {
    super(z);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.jpush.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */