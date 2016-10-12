package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;
import com.google.gson.jpush.b.d;
import com.google.gson.jpush.internal.w;
import com.google.gson.jpush.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class n extends al<Object>
{
  public static final am a = new o();
  private final k b;

  private n(k paramk)
  {
    this.b = paramk;
  }

  public final Object a(a parama)
  {
    c localc = parama.f();
    switch (p.a[localc.ordinal()])
    {
    default:
      throw new IllegalStateException();
    case 1:
      ArrayList localArrayList = new ArrayList();
      parama.a();
      while (parama.e())
        localArrayList.add(a(parama));
      parama.b();
      return localArrayList;
    case 2:
      w localw = new w();
      parama.c();
      while (parama.e())
        localw.put(parama.g(), a(parama));
      parama.d();
      return localw;
    case 3:
      return parama.h();
    case 4:
      return Double.valueOf(parama.k());
    case 5:
      return Boolean.valueOf(parama.i());
    case 6:
    }
    parama.j();
    return null;
  }

  public final void a(d paramd, Object paramObject)
  {
    if (paramObject == null)
    {
      paramd.f();
      return;
    }
    al localal = this.b.a(paramObject.getClass());
    if ((localal instanceof n))
    {
      paramd.d();
      paramd.e();
      return;
    }
    localal.a(paramd, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */