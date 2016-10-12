package cn.jpush.android.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class m
{
  public static String a;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[2];
    int i = 0;
    String str1 = "k?3\023\023_\".\"\026+9\031";
    int j = -1;
    Object localObject2 = localObject1;
    int i9;
    label133: String str2;
    while (true)
    {
      Object localObject3 = str1.toCharArray();
      int k = localObject3.length;
      int m = 0;
      if (k <= 1);
      while (k > m)
      {
        Object localObject7 = localObject3;
        int i6 = m;
        int i7 = k;
        Object localObject8 = localObject3;
        while (true)
        {
          int i8 = localObject8[m];
          switch (i6 % 5)
          {
          default:
            i9 = 94;
            localObject8[m] = (char)(i9 ^ i8);
            m = i6 + 1;
            if (i7 != 0)
              break label133;
            localObject8 = localObject7;
            i6 = m;
            m = i7;
          case 0:
          case 1:
          case 2:
          case 3:
          }
        }
        k = i7;
        localObject3 = localObject7;
      }
      str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "k?3\023s_\013g\016:M\016\002P3|9\031";
        localObject1 = localObject2;
        j = 0;
      case 0:
      }
    }
    localObject1[i] = str2;
    z = localObject2;
    Object localObject4 = "k?3\023\023_\".5\026Z+'".toCharArray();
    int n = localObject4.length;
    int i1 = 0;
    if (n <= 1);
    label245: 
    while (n > i1)
    {
      Object localObject5 = localObject4;
      int i2 = i1;
      int i3 = n;
      Object localObject6 = localObject4;
      int i4 = localObject6[i1];
      int i5;
      switch (i2 % 5)
      {
      default:
        i5 = 94;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        localObject6[i1] = (char)(i5 ^ i4);
        i1 = i2 + 1;
        if (i3 != 0)
          break label385;
        localObject6 = localObject5;
        i2 = i1;
        i1 = i3;
        break label245;
        i9 = 18;
        break;
        i9 = 70;
        break;
        i9 = 74;
        break;
        i9 = 106;
        break;
        i5 = 18;
        continue;
        i5 = 70;
        continue;
        i5 = 74;
        continue;
        i5 = 106;
      }
      n = i3;
      localObject4 = localObject5;
    }
    label385: a = new String((char[])localObject4).intern();
  }

  public static String a()
  {
    return new SimpleDateFormat(z[1]).format(new Date());
  }

  public static String b()
  {
    return new SimpleDateFormat(z[0]).format(new Date());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */