package com.google.gson.jpush;

public enum ag
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "F\023aN\017R";
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
          i3 = 65;
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
        str1 = "Q\002uF\024Y\023";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = new ah(z[1], 0);
        b = new ai(z[0], 1);
        ag[] arrayOfag = new ag[2];
        arrayOfag[0] = a;
        arrayOfag[1] = b;
        c = arrayOfag;
        return;
        i3 = 21;
        break label96;
        i3 = 71;
        break label96;
        i3 = 51;
        break label96;
        i3 = 7;
        break label96;
        m = 0;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */