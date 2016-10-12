package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.ac;
import com.google.gson.jpush.b.d;
import com.google.gson.jpush.t;
import com.google.gson.jpush.w;
import com.google.gson.jpush.y;
import com.google.gson.jpush.z;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class j extends d
{
  private static final Writer a;
  private static final ac b;
  private static final String[] z;
  private final List<w> c = new ArrayList();
  private String d;
  private w e = y.a;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "?x\fUz\023D1y3\021XcU;;\013\"u>UB-}3\033B7r?\006\021c";
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
          i3 = 90;
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
        str1 = "0S3~9\001N';5\033NcQ\t:ec~6\020F&u.UI6oz\002J0;";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "<E t7\005G&o?UO,x/\030N-o";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        str1 = "\026G,h?\021";
        j = 3;
        arrayOfString2 = arrayOfString1;
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = new k();
        b = new ac(z[3]);
        return;
        i3 = 117;
        break label96;
        i3 = 43;
        break label96;
        i3 = 67;
        break label96;
        i3 = 27;
        break label96;
        m = 0;
      }
    }
  }

  public j()
  {
    super(a);
  }

  private void a(w paramw)
  {
    if (this.d != null)
    {
      if ((!(paramw instanceof y)) || (i()))
        ((z)j()).a(this.d, paramw);
      this.d = null;
      return;
    }
    if (this.c.isEmpty())
    {
      this.e = paramw;
      return;
    }
    w localw = j();
    if ((localw instanceof t))
    {
      ((t)localw).a(paramw);
      return;
    }
    throw new IllegalStateException();
  }

  private w j()
  {
    return (w)this.c.get(-1 + this.c.size());
  }

  public final d a(long paramLong)
  {
    a(new ac(Long.valueOf(paramLong)));
    return this;
  }

  public final d a(Number paramNumber)
  {
    if (paramNumber == null)
      return f();
    if (!g())
    {
      double d1 = paramNumber.doubleValue();
      if ((Double.isNaN(d1)) || (Double.isInfinite(d1)))
        throw new IllegalArgumentException(z[0] + paramNumber);
    }
    a(new ac(paramNumber));
    return this;
  }

  public final d a(String paramString)
  {
    if ((this.c.isEmpty()) || (this.d != null))
      throw new IllegalStateException();
    if ((j() instanceof z))
    {
      this.d = paramString;
      return this;
    }
    throw new IllegalStateException();
  }

  public final d a(boolean paramBoolean)
  {
    a(new ac(Boolean.valueOf(paramBoolean)));
    return this;
  }

  public final w a()
  {
    if (!this.c.isEmpty())
      throw new IllegalStateException(z[1] + this.c);
    return this.e;
  }

  public final d b()
  {
    t localt = new t();
    a(localt);
    this.c.add(localt);
    return this;
  }

  public final d b(String paramString)
  {
    if (paramString == null)
      return f();
    a(new ac(paramString));
    return this;
  }

  public final d c()
  {
    if ((this.c.isEmpty()) || (this.d != null))
      throw new IllegalStateException();
    if ((j() instanceof t))
    {
      this.c.remove(-1 + this.c.size());
      return this;
    }
    throw new IllegalStateException();
  }

  public final void close()
  {
    if (!this.c.isEmpty())
      throw new IOException(z[2]);
    this.c.add(b);
  }

  public final d d()
  {
    z localz = new z();
    a(localz);
    this.c.add(localz);
    return this;
  }

  public final d e()
  {
    if ((this.c.isEmpty()) || (this.d != null))
      throw new IllegalStateException();
    if ((j() instanceof z))
    {
      this.c.remove(-1 + this.c.size());
      return this;
    }
    throw new IllegalStateException();
  }

  public final d f()
  {
    a(y.a);
    return this;
  }

  public final void flush()
  {
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */