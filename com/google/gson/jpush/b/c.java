package com.google.gson.jpush.b;

public enum c
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[10];
    int m = 0;
    String str1 = "I)y&XT-l=WR";
    int n = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int i1 = localObject3.length;
    int i2 = 0;
    label36: Object localObject4;
    int i3;
    int i4;
    Object localObject5;
    label52: int i5;
    int i6;
    if (i1 <= 1)
    {
      localObject4 = localObject3;
      i3 = i2;
      i4 = i1;
      localObject5 = localObject3;
      i5 = localObject5[i2];
      switch (i3 % 5)
      {
      default:
        i6 = 22;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[i2] = (char)(i6 ^ i5);
      i2 = i3 + 1;
      if (i4 == 0)
      {
        localObject5 = localObject4;
        i3 = i2;
        i2 = i4;
        break label52;
      }
      i1 = i4;
      localObject3 = localObject4;
      if (i1 > i2)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (n)
      {
      default:
        localObject1[m] = str2;
        m = 1;
        str1 = "I#q#SJ\"";
        localObject1 = localObject2;
        n = 0;
        break;
      case 0:
        localObject1[m] = str2;
        m = 2;
        str1 = "N\"z0YI&{,B";
        n = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[m] = str2;
        m = 3;
        str1 = "E-s*";
        n = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[m] = str2;
        m = 4;
        str1 = "I)y&XT#|%SH8";
        n = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[m] = str2;
        m = 5;
        str1 = "N\"z0WY>6";
        n = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[m] = str2;
        m = 6;
        str1 = "N\"z0RD/k\"SE8";
        n = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[m] = str2;
        m = 7;
        str1 = "E9r#";
        n = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[m] = str2;
        m = 8;
        str1 = "E9s-SY";
        n = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[m] = str2;
        m = 9;
        str1 = "X8l&XL";
        n = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[m] = str2;
        z = localObject2;
        a = new c(z[0], 0);
        b = new c(z[5], 1);
        c = new c(z[4], 2);
        d = new c(z[2], 3);
        e = new c(z[3], 4);
        f = new c(z[9], 5);
        g = new c(z[8], 6);
        h = new c(z[1], 7);
        i = new c(z[7], 8);
        j = new c(z[6], 9);
        c[] arrayOfc = new c[10];
        arrayOfc[0] = a;
        arrayOfc[1] = b;
        arrayOfc[2] = c;
        arrayOfc[3] = d;
        arrayOfc[4] = e;
        arrayOfc[5] = f;
        arrayOfc[6] = g;
        arrayOfc[7] = h;
        arrayOfc[8] = i;
        arrayOfc[9] = j;
        k = arrayOfc;
        return;
        i6 = 11;
        continue;
        i6 = 108;
        continue;
        i6 = 62;
        continue;
        i6 = 111;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */