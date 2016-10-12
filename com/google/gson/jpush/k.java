package com.google.gson.jpush;

import com.google.gson.jpush.internal.a.g;
import com.google.gson.jpush.internal.a.z;
import com.google.gson.jpush.internal.f;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class k
{
  private static final String[] z;
  final u a = new l(this);
  final ad b = new m(this);
  private final ThreadLocal<Map<com.google.gson.jpush.a.a<?>, q<?>>> c = new ThreadLocal();
  private final Map<com.google.gson.jpush.a.a<?>, al<?>> d = Collections.synchronizedMap(new HashMap());
  private final List<am> e;
  private final f f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final boolean j;

  static
  {
    Object localObject1 = new String[9];
    int k = 0;
    String str1 = "\007z\f\024G\023r\n\023\022";
    int m = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int n = localObject3.length;
    int i1 = 0;
    label36: Object localObject4;
    int i2;
    int i3;
    Object localObject5;
    label52: int i4;
    int i5;
    if (n <= 1)
    {
      localObject4 = localObject3;
      i2 = i1;
      i3 = n;
      localObject5 = localObject3;
      i4 = localObject5[i1];
      switch (i2 % 5)
      {
      default:
        i5 = 40;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[i1] = (char)(i5 ^ i4);
      i1 = i2 + 1;
      if (i3 == 0)
      {
        localObject5 = localObject4;
        i2 = i1;
        i1 = i3;
        break label52;
      }
      n = i3;
      localObject3 = localObject4;
      if (n > i1)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (m)
      {
      default:
        localObject1[k] = str2;
        k = 1;
        str1 = "";
        localObject1 = localObject2;
        m = 0;
        break;
      case 0:
        localObject1[k] = str2;
        k = 2;
        str1 = "";
        m = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[k] = str2;
        k = 3;
        str1 = "&H .\b\002z\001\016G\025;\034\005Z\bz\003\tR\004;";
        m = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[k] = str2;
        k = 4;
        str1 = "";
        m = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[k] = str2;
        k = 5;
        str1 = "&H .\b\002z\001\016G\025;\007\001F\005w\n@";
        m = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[k] = str2;
        k = 6;
        str1 = "A;";
        m = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[k] = str2;
        k = 7;
        str1 = "HF\022G\"";
        m = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[k] = str2;
        k = 8;
        str1 = "";
        m = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[k] = str2;
        z = localObject2;
        return;
        i5 = 97;
        continue;
        i5 = 27;
        continue;
        i5 = 111;
        continue;
        i5 = 96;
      }
    }
  }

  public k()
  {
    this(com.google.gson.jpush.internal.s.a, d.a, Collections.emptyMap(), false, false, false, true, false, false, ag.a, Collections.emptyList());
  }

  k(com.google.gson.jpush.internal.s params, j paramj, Map<Type, s<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, ag paramag, List<am> paramList)
  {
    this.f = new f(paramMap);
    this.g = paramBoolean1;
    this.i = paramBoolean3;
    this.h = paramBoolean4;
    this.j = paramBoolean5;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(z.Q);
    localArrayList.add(com.google.gson.jpush.internal.a.n.a);
    localArrayList.add(params);
    localArrayList.addAll(paramList);
    localArrayList.add(z.x);
    localArrayList.add(z.m);
    localArrayList.add(z.g);
    localArrayList.add(z.i);
    localArrayList.add(z.k);
    Class localClass1 = Long.TYPE;
    Object localObject1;
    Object localObject2;
    label244: Class localClass3;
    if (paramag == ag.a)
    {
      localObject1 = z.n;
      localArrayList.add(z.a(localClass1, Long.class, (al)localObject1));
      Class localClass2 = Double.TYPE;
      if (!paramBoolean6)
        break label626;
      localObject2 = z.p;
      localArrayList.add(z.a(localClass2, Double.class, (al)localObject2));
      localClass3 = Float.TYPE;
      if (!paramBoolean6)
        break label639;
    }
    label626: label639: for (Object localObject3 = z.o; ; localObject3 = new o(this))
    {
      localArrayList.add(z.a(localClass3, Float.class, (al)localObject3));
      localArrayList.add(z.r);
      localArrayList.add(z.t);
      localArrayList.add(z.z);
      localArrayList.add(z.B);
      localArrayList.add(z.a(BigDecimal.class, z.v));
      localArrayList.add(z.a(BigInteger.class, z.w));
      localArrayList.add(z.D);
      localArrayList.add(z.F);
      localArrayList.add(z.J);
      localArrayList.add(z.O);
      localArrayList.add(z.H);
      localArrayList.add(z.d);
      localArrayList.add(com.google.gson.jpush.internal.a.e.a);
      localArrayList.add(z.M);
      localArrayList.add(com.google.gson.jpush.internal.a.w.a);
      localArrayList.add(com.google.gson.jpush.internal.a.u.a);
      localArrayList.add(z.K);
      localArrayList.add(com.google.gson.jpush.internal.a.a.a);
      localArrayList.add(z.b);
      localArrayList.add(new com.google.gson.jpush.internal.a.c(this.f));
      localArrayList.add(new com.google.gson.jpush.internal.a.l(this.f, paramBoolean2));
      localArrayList.add(new g(this.f));
      localArrayList.add(z.R);
      localArrayList.add(new com.google.gson.jpush.internal.a.q(this.f, paramj, params));
      this.e = Collections.unmodifiableList(localArrayList);
      return;
      localObject1 = new p(this);
      break;
      localObject2 = new n(this);
      break label244;
    }
  }

  private com.google.gson.jpush.b.d a(Writer paramWriter)
  {
    if (this.i)
      paramWriter.write(z[7]);
    com.google.gson.jpush.b.d locald = new com.google.gson.jpush.b.d(paramWriter);
    if (this.j)
      locald.c(z[6]);
    locald.d(this.g);
    return locald;
  }

  // ERROR //
  private <T> T a(com.google.gson.jpush.b.a parama, Type paramType)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_1
    //   3: invokevirtual 320	com/google/gson/jpush/b/a:p	()Z
    //   6: istore 4
    //   8: aload_1
    //   9: iload_3
    //   10: invokevirtual 322	com/google/gson/jpush/b/a:a	(Z)V
    //   13: aload_1
    //   14: invokevirtual 325	com/google/gson/jpush/b/a:f	()Lcom/google/gson/jpush/b/c;
    //   17: pop
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_0
    //   21: aload_2
    //   22: invokestatic 330	com/google/gson/jpush/a/a:a	(Ljava/lang/reflect/Type;)Lcom/google/gson/jpush/a/a;
    //   25: invokevirtual 333	com/google/gson/jpush/k:a	(Lcom/google/gson/jpush/a/a;)Lcom/google/gson/jpush/al;
    //   28: aload_1
    //   29: invokevirtual 338	com/google/gson/jpush/al:a	(Lcom/google/gson/jpush/b/a;)Ljava/lang/Object;
    //   32: astore 10
    //   34: aload_1
    //   35: iload 4
    //   37: invokevirtual 322	com/google/gson/jpush/b/a:a	(Z)V
    //   40: aload 10
    //   42: areturn
    //   43: astore 8
    //   45: iload_3
    //   46: ifeq +11 -> 57
    //   49: aload_1
    //   50: iload 4
    //   52: invokevirtual 322	com/google/gson/jpush/b/a:a	(Z)V
    //   55: aconst_null
    //   56: areturn
    //   57: new 340	com/google/gson/jpush/af
    //   60: dup
    //   61: aload 8
    //   63: invokespecial 343	com/google/gson/jpush/af:<init>	(Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore 6
    //   69: aload_1
    //   70: iload 4
    //   72: invokevirtual 322	com/google/gson/jpush/b/a:a	(Z)V
    //   75: aload 6
    //   77: athrow
    //   78: astore 7
    //   80: new 340	com/google/gson/jpush/af
    //   83: dup
    //   84: aload 7
    //   86: invokespecial 343	com/google/gson/jpush/af:<init>	(Ljava/lang/Throwable;)V
    //   89: athrow
    //   90: astore 5
    //   92: new 340	com/google/gson/jpush/af
    //   95: dup
    //   96: aload 5
    //   98: invokespecial 343	com/google/gson/jpush/af:<init>	(Ljava/lang/Throwable;)V
    //   101: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   13	18	43	java/io/EOFException
    //   20	34	43	java/io/EOFException
    //   13	18	67	finally
    //   20	34	67	finally
    //   57	67	67	finally
    //   80	90	67	finally
    //   92	102	67	finally
    //   13	18	78	java/lang/IllegalStateException
    //   20	34	78	java/lang/IllegalStateException
    //   13	18	90	java/io/IOException
    //   20	34	90	java/io/IOException
  }

  private static void a(Object paramObject, com.google.gson.jpush.b.a parama)
  {
    if (paramObject != null)
      try
      {
        if (parama.f() != com.google.gson.jpush.b.c.j)
          throw new x(z[4]);
      }
      catch (com.google.gson.jpush.b.e locale)
      {
        throw new af(locale);
      }
      catch (IOException localIOException)
      {
        throw new x(localIOException);
      }
  }

  public final <T> al<T> a(com.google.gson.jpush.a.a<T> parama)
  {
    Object localObject1 = (al)this.d.get(parama);
    if (localObject1 != null)
      return localObject1;
    Map localMap = (Map)this.c.get();
    Object localObject2;
    if (localMap == null)
    {
      HashMap localHashMap = new HashMap();
      this.c.set(localHashMap);
      localObject2 = localHashMap;
    }
    for (int k = 1; ; k = 0)
    {
      while (true)
      {
        localObject1 = (q)((Map)localObject2).get(parama);
        if (localObject1 != null)
          break;
        try
        {
          q localq = new q();
          ((Map)localObject2).put(parama, localq);
          Iterator localIterator = this.e.iterator();
          while (localIterator.hasNext())
          {
            localObject1 = ((am)localIterator.next()).a(this, parama);
            if (localObject1 != null)
            {
              localq.a((al)localObject1);
              this.d.put(parama, localObject1);
              return localObject1;
            }
          }
          throw new IllegalArgumentException(z[5] + parama);
        }
        finally
        {
          ((Map)localObject2).remove(parama);
          if (k != 0)
            this.c.remove();
        }
      }
      localObject2 = localMap;
    }
  }

  public final <T> al<T> a(am paramam, com.google.gson.jpush.a.a<T> parama)
  {
    boolean bool = this.e.contains(paramam);
    int k = 0;
    if (!bool)
      k = 1;
    Iterator localIterator = this.e.iterator();
    int m = k;
    while (localIterator.hasNext())
    {
      am localam = (am)localIterator.next();
      if (m == 0)
      {
        if (localam == paramam)
          m = 1;
      }
      else
      {
        al localal = localam.a(this, parama);
        if (localal != null)
          return localal;
      }
    }
    throw new IllegalArgumentException(z[3] + parama);
  }

  public final <T> al<T> a(Class<T> paramClass)
  {
    return a(com.google.gson.jpush.a.a.a(paramClass));
  }

  public final <T> T a(String paramString, Class<T> paramClass)
  {
    Object localObject;
    if (paramString == null)
      localObject = null;
    while (true)
    {
      return com.google.gson.jpush.internal.af.a(paramClass).cast(localObject);
      com.google.gson.jpush.b.a locala = new com.google.gson.jpush.b.a(new StringReader(paramString));
      localObject = a(locala, paramClass);
      a(localObject, locala);
    }
  }

  public final void a(w paramw, Appendable paramAppendable)
  {
    try
    {
      locald = a(com.google.gson.jpush.internal.ag.a(paramAppendable));
      bool1 = locald.g();
      locald.b(true);
      bool2 = locald.h();
      locald.c(this.h);
      bool3 = locald.i();
      locald.d(this.g);
      try
      {
        com.google.gson.jpush.internal.ag.a(paramw, locald);
        return;
      }
      catch (IOException localIOException2)
      {
        throw new x(localIOException2);
      }
      finally
      {
        locald.b(bool1);
        locald.c(bool2);
        locald.d(bool3);
      }
    }
    catch (IOException localIOException1)
    {
      com.google.gson.jpush.b.d locald;
      boolean bool1;
      boolean bool2;
      boolean bool3;
      throw new RuntimeException(localIOException1);
    }
  }

  public final void a(Object paramObject, Type paramType, Appendable paramAppendable)
  {
    try
    {
      locald = a(com.google.gson.jpush.internal.ag.a(paramAppendable));
      al localal = a(com.google.gson.jpush.a.a.a(paramType));
      bool1 = locald.g();
      locald.b(true);
      bool2 = locald.h();
      locald.c(this.h);
      bool3 = locald.i();
      locald.d(this.g);
      try
      {
        localal.a(locald, paramObject);
        return;
      }
      catch (IOException localIOException2)
      {
        throw new x(localIOException2);
      }
      finally
      {
        locald.b(bool1);
        locald.c(bool2);
        locald.d(bool3);
      }
    }
    catch (IOException localIOException1)
    {
      com.google.gson.jpush.b.d locald;
      boolean bool1;
      boolean bool2;
      boolean bool3;
      throw new x(localIOException1);
    }
  }

  public final String toString()
  {
    return z[2] + this.g + z[0] + this.e + z[1] + this.f + "}";
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */