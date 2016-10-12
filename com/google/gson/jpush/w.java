package com.google.gson.jpush;

import com.google.gson.jpush.b.d;
import com.google.gson.jpush.internal.ag;
import java.io.IOException;
import java.io.StringWriter;

public abstract class w
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "\016|N^?3g\007Cp.4F\rU\t[i\r^(fFT1";
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
          i3 = 31;
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
        str1 = "\016|N^?3g\007Cp.4F\rU\t[i\rO(}JDk3bB\003";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "\024{S\r~z^tbQz[EGz9`\035\r";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 90;
        break label96;
        i3 = 20;
        break label96;
        i3 = 39;
        break label96;
        i3 = 45;
        break label96;
        m = 0;
      }
    }
  }

  public w()
  {
  }

  public Number b()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public String c()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public double d()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public long e()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public int f()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public boolean g()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public final z h()
  {
    if ((this instanceof z))
      return (z)this;
    throw new IllegalStateException(z[2] + this);
  }

  public final t i()
  {
    if ((this instanceof t))
      return (t)this;
    throw new IllegalStateException(z[0]);
  }

  public final ac j()
  {
    if ((this instanceof ac))
      return (ac)this;
    throw new IllegalStateException(z[1]);
  }

  public String toString()
  {
    try
    {
      StringWriter localStringWriter = new StringWriter();
      d locald = new d(localStringWriter);
      locald.b(true);
      ag.a(this, locald);
      String str = localStringWriter.toString();
      return str;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */