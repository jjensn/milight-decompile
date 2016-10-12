package cn.jpush.android.data;

import cn.jpush.android.util.an;

public final class d
{
  private static final String[] z;
  public String a;
  public String b;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "]LYfC\024\036\013`Q\0243\024zR.\005\035)\bQ";
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
          i3 = 53;
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
        str1 = "\034\037\036V\\\025LD)";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 113;
        break label96;
        i3 = 108;
        break label96;
        i3 = 121;
        break label96;
        i3 = 9;
        break label96;
        m = 0;
      }
    }
  }

  public d(c paramc1, c paramc2)
  {
    this.a = paramc2.c;
    this.b = paramc2.d;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d));
    d locald;
    do
    {
      do
      {
        return false;
        locald = (d)paramObject;
      }
      while ((an.a(this.a)) || (an.a(locald.a)) || (!an.a(this.a, locald.a)));
      if ((an.a(this.b)) && (an.a(locald.b)))
        return true;
    }
    while ((an.a(this.b)) || (an.a(locald.b)) || (!an.a(this.b, locald.b)));
    return true;
  }

  public final String toString()
  {
    return z[1] + this.a + z[0] + this.b;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */