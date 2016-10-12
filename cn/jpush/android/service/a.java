package cn.jpush.android.service;

public enum a
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "'=Q\005F'&V\005D";
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
          i3 = 35;
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
        str1 = "'=Q\005F'&Z\017";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = " ;L\bL*<Z\bW!6";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = new a(z[1], 0);
        b = new a(z[2], 1);
        c = new a(z[0], 2);
        a[] arrayOfa = new a[3];
        arrayOfa[0] = a;
        arrayOfa[1] = b;
        arrayOfa[2] = c;
        d = arrayOfa;
        return;
        i3 = 68;
        break label96;
        i3 = 82;
        break label96;
        i3 = 63;
        break label96;
        i3 = 107;
        break label96;
        m = 0;
      }
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */