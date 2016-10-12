package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.af;
import com.google.gson.jpush.al;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;
import com.google.gson.jpush.b.d;
import com.google.gson.jpush.internal.ae;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class s<T> extends al<T>
{
  private final ae<T> a;
  private final Map<String, t> b;

  private s(ae<T> paramae, Map<String, t> paramMap)
  {
    this.a = paramae;
    this.b = paramMap;
  }

  public final T a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    Object localObject = this.a.a();
    try
    {
      parama.c();
      while (true)
      {
        if (!parama.e())
          break label111;
        String str = parama.g();
        localt = (t)this.b.get(str);
        if ((localt != null) && (localt.i))
          break;
        parama.n();
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
      {
        t localt;
        throw new af(localIllegalStateException);
        localt.a(parama, localObject);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    label111: parama.d();
    return localObject;
  }

  public final void a(d paramd, T paramT)
  {
    if (paramT == null)
    {
      paramd.f();
      return;
    }
    paramd.d();
    try
    {
      Iterator localIterator = this.b.values().iterator();
      while (localIterator.hasNext())
      {
        t localt = (t)localIterator.next();
        if (localt.a(paramT))
        {
          paramd.a(localt.g);
          localt.a(paramd, paramT);
        }
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError();
    }
    paramd.e();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */