package com.google.gson.jpush;

import com.google.gson.jpush.b.d;
import com.google.gson.jpush.internal.ag;

final class aj<T> extends al<T>
{
  private final ae<T> a;
  private final v<T> b;
  private final k c;
  private final com.google.gson.jpush.a.a<T> d;
  private final am e;
  private al<T> f;

  private aj(ae<T> paramae, v<T> paramv, k paramk, com.google.gson.jpush.a.a<T> parama, am paramam)
  {
    this.a = paramae;
    this.b = paramv;
    this.c = paramk;
    this.d = parama;
    this.e = paramam;
  }

  private al<T> a()
  {
    al localal1 = this.f;
    if (localal1 != null)
      return localal1;
    al localal2 = this.c.a(this.e, this.d);
    this.f = localal2;
    return localal2;
  }

  public static am a(com.google.gson.jpush.a.a<?> parama, Object paramObject)
  {
    return new ak(paramObject, parama, false, null, (byte)0);
  }

  public final T a(com.google.gson.jpush.b.a parama)
  {
    if (this.b == null)
      return a().a(parama);
    w localw = ag.a(parama);
    if ((localw instanceof y))
      return null;
    return this.b.a(localw, this.d.b(), this.c.a);
  }

  public final void a(d paramd, T paramT)
  {
    if (this.a == null)
    {
      a().a(paramd, paramT);
      return;
    }
    if (paramT == null)
    {
      paramd.f();
      return;
    }
    ag.a(this.a.a(paramT, this.d.b(), this.c.b), paramd);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */