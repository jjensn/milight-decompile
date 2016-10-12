package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.b.c;
import com.google.gson.jpush.b.d;
import com.google.gson.jpush.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class a<E> extends al<Object>
{
  public static final am a = new b();
  private final Class<E> b;
  private final al<E> c;

  public a(k paramk, al<E> paramal, Class<E> paramClass)
  {
    this.c = new y(paramk, paramal, paramClass);
    this.b = paramClass;
  }

  public final Object a(com.google.gson.jpush.b.a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    parama.a();
    while (parama.e())
      localArrayList.add(this.c.a(parama));
    parama.b();
    Object localObject = Array.newInstance(this.b, localArrayList.size());
    for (int i = 0; i < localArrayList.size(); i++)
      Array.set(localObject, i, localArrayList.get(i));
    return localObject;
  }

  public final void a(d paramd, Object paramObject)
  {
    if (paramObject == null)
    {
      paramd.f();
      return;
    }
    paramd.b();
    int i = 0;
    int j = Array.getLength(paramObject);
    while (i < j)
    {
      Object localObject = Array.get(paramObject, i);
      this.c.a(paramd, localObject);
      i++;
    }
    paramd.c();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */