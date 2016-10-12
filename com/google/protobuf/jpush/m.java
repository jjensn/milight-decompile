package com.google.protobuf.jpush;

import java.util.List;

public final class m extends RuntimeException
{
  private static final String z;
  private final List<String> a = null;

  static
  {
    Object localObject1 = "".toCharArray();
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
        i1 = 74;
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
      i1 = 99;
      continue;
      i1 = 20;
      continue;
      i1 = 85;
      continue;
      i1 = 105;
    }
  }

  public m()
  {
    super(z);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.jpush.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */