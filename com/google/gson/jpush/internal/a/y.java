package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;
import com.google.gson.jpush.b.d;
import com.google.gson.jpush.k;
import java.lang.reflect.Type;
import java.lang.reflect.Type;;
import java.lang.reflect.TypeVariable;

final class y<T> extends al<T>
{
  private final k a;
  private final al<T> b;
  private final Type c;

  y(k paramk, al<T> paramal, Type paramType)
  {
    this.a = paramk;
    this.b = paramal;
    this.c = paramType;
  }

  public final T a(com.google.gson.jpush.b.a parama)
  {
    return this.b.a(parama);
  }

  public final void a(d paramd, T paramT)
  {
    al localal1 = this.b;
    Object localObject = this.c;
    if ((paramT != null) && ((localObject == Object.class) || ((localObject instanceof TypeVariable)) || ((localObject instanceof Class))))
      localObject = paramT.getClass();
    if (localObject != this.c)
    {
      localal2 = this.a.a(com.google.gson.jpush.a.a.a((Type)localObject));
      if ((!(localal2 instanceof s)) || ((this.b instanceof s)));
    }
    for (al localal2 = this.b; ; localal2 = localal1)
    {
      localal2.a(paramd, paramT);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */