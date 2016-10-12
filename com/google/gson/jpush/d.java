package com.google.gson.jpush;

public enum d
  implements j
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[5];
    int i = 0;
    String str1 = "zM\0302up^\t:bcB\0136tjB\037>sgB\033'flX\033";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label35: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label51: int i2;
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
        i3 = 39;
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
        break label51;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "cR\0372up^\t$bpJ\001#opH\0063b}N\0138ujN";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "fY\r9sfI\021";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "cR\0372up^\t$bpJ\001#opY\t$ojN";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "zM\0302up^\t:bcB\0136tj";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        z = localObject2;
        a = new e(z[2], 0);
        b = new f(z[4], 1);
        c = new g(z[0], 2);
        d = new h(z[1], 3);
        e = new i(z[3], 4);
        d[] arrayOfd = new d[5];
        arrayOfd[0] = a;
        arrayOfd[1] = b;
        arrayOfd[2] = c;
        arrayOfd[3] = d;
        arrayOfd[4] = e;
        f = arrayOfd;
        return;
        i3 = 47;
        continue;
        i3 = 29;
        continue;
        i3 = 72;
        continue;
        i3 = 119;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */