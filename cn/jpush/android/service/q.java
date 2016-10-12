package cn.jpush.android.service;

final class q
{
  private static final String[] z;
  String a;
  int b;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "\" ?dU\002*iuV\031:i(\031[";
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
          i3 = 57;
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
        str1 = ";!;q\031\002=ik\\\016*,a\031\r!;%XK8(iP\017n(a]\031+:v\025K=9iP\037n+|\031Q";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "\" ?dU\002*iuV\031:i(\031";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "\" ?dU\002*ilIKci";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 107;
        break label96;
        i3 = 78;
        break label96;
        i3 = 73;
        break label96;
        i3 = 5;
        break label96;
        m = 0;
      }
    }
  }

  public q(String paramString)
  {
    int i = paramString.indexOf(':');
    if (i == -1)
      throw new Exception(z[1]);
    this.a = paramString.substring(0, i);
    if (!SisInfo.isValidIPV4(this.a))
      throw new Exception(z[3] + this.a);
    String str = paramString.substring(i + 1);
    try
    {
      this.b = Integer.parseInt(str);
      if (this.b == 0)
        throw new Exception(z[0]);
    }
    catch (Exception localException)
    {
      throw new Exception(z[2] + str);
    }
  }

  public final String toString()
  {
    return this.a + ":" + this.b;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */