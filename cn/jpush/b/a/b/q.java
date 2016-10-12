package cn.jpush.b.a.b;

import java.io.PrintStream;

public abstract class q
{
  protected static com.google.gson.jpush.k f;
  private static final String z;

  @com.google.gson.jpush.annotations.a
  protected long g = 0L;

  @com.google.gson.jpush.annotations.a
  protected long h = 0L;

  static
  {
    Object localObject1 = "+>\f\rH\032<\001\b\006\035?\t\001G\0204DA\006".toCharArray();
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    int k;
    int m;
    Object localObject3;
    label27: int n;
    int i1;
    if (i <= 1)
    {
      localObject2 = localObject1;
      k = j;
      m = i;
      localObject3 = localObject1;
      n = localObject3[j];
      switch (k % 5)
      {
      default:
        i1 = 38;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject3[j] = (char)(i1 ^ n);
      j = k + 1;
      if (m == 0)
      {
        localObject3 = localObject2;
        k = j;
        j = m;
        break label27;
      }
      i = m;
      localObject1 = localObject2;
      if (i > j)
        break;
      z = new String((char[])localObject1).intern();
      f = new com.google.gson.jpush.r().a().b();
      return;
      i1 = 126;
      continue;
      i1 = 80;
      continue;
      i1 = 100;
      continue;
      i1 = 108;
    }
  }

  public q()
  {
  }

  public static q a(String paramString, int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 20:
    case 21:
    case 22:
    case 24:
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    default:
      System.out.println(z + paramInt);
      return null;
    case 1:
      localObject = r.class;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 18:
    case 19:
    case 23:
    case 31:
    case 32:
    case 33:
    case 34:
    case 35:
    case 36:
    }
    while (true)
    {
      return (q)f.a(paramString, (java.lang.Class)localObject);
      localObject = s.class;
      continue;
      localObject = v.class;
      continue;
      localObject = o.class;
      continue;
      localObject = b.class;
      continue;
      localObject = i.class;
      continue;
      localObject = x.class;
      continue;
      localObject = g.class;
      continue;
      localObject = n.class;
      continue;
      localObject = c.class;
      continue;
      localObject = j.class;
      continue;
      localObject = w.class;
      continue;
      localObject = a.class;
      continue;
      localObject = h.class;
      continue;
      localObject = u.class;
      continue;
      localObject = f.class;
      continue;
      localObject = m.class;
      continue;
      localObject = e.class;
      continue;
      localObject = l.class;
      continue;
      localObject = d.class;
      continue;
      localObject = k.class;
    }
  }

  public final cn.jpush.b.a.a.c a(String paramString)
  {
    return new cn.jpush.b.a.a.c(this.g, a(this.h, paramString));
  }

  abstract p a(long paramLong, String paramString);
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */