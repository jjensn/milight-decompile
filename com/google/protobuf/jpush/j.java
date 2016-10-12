package com.google.protobuf.jpush;

import java.io.IOException;

public final class j extends IOException
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[8];
    int i = 0;
    String str1 = "";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label36: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label52: int i2;
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
        i3 = 28;
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
        break label52;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "=\037c\036s\016\002`Jq\b\036\013{\bMo\005r\031\fe\004y\tMm\004<\004\003z\013p\004\t,\036}\nM$\020y\037\002%D";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "=\037c\036s\016\002`Jq\b\036\013{\bMi\004x@\n~\005i\035Mx\013{M\te\016<\003\002xJq\f\031o\002<\b\025|\017\031\bhJh\f\n\"";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "=\037c\036s\016\002`Jq\b\036\013{\bMx\013{M\005m\016<\004\003z\013p\004\t,\035u\037\b,\036e\035\b\"";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 109;
        continue;
        i3 = 109;
        continue;
        i3 = 12;
        continue;
        i3 = 106;
      }
    }
  }

  public j(String paramString)
  {
    super(paramString);
  }

  static j a()
  {
    return new j(z[0]);
  }

  static j b()
  {
    return new j(z[4]);
  }

  static j c()
  {
    return new j(z[6]);
  }

  static j d()
  {
    return new j(z[1]);
  }

  static j e()
  {
    return new j(z[3]);
  }

  static j f()
  {
    return new j(z[7]);
  }

  static j g()
  {
    return new j(z[5]);
  }

  static j h()
  {
    return new j(z[2]);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.jpush.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */