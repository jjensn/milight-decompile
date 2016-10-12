package cn.jpush.android.api;

import java.util.Set;

public final class b
{
  private static final String[] z;
  public String a;
  public Set<String> b;
  public TagAliasCallback c;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "kE\f\004'4_";
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
          i3 = 64;
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
        str1 = "\004\004\024\t\002&\006\0235!5\004\025\026`jE\031\t)&\026B";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 71;
        break label96;
        i3 = 101;
        break label96;
        i3 = 120;
        break label96;
        i3 = 101;
        break label96;
        m = 0;
      }
    }
  }

  public b(String paramString, Set<String> paramSet, TagAliasCallback paramTagAliasCallback)
  {
    this.a = paramString;
    this.b = paramSet;
    this.c = paramTagAliasCallback;
  }

  public final String toString()
  {
    return z[1] + this.a + z[0] + this.b;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */