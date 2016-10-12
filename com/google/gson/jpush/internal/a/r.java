package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;
import com.google.gson.jpush.b.d;
import com.google.gson.jpush.k;
import java.lang.reflect.Field;

final class r extends t
{
  final al<?> a = q.a(this.f, this.b, this.c, this.d);

  r(q paramq, String paramString, boolean paramBoolean1, boolean paramBoolean2, k paramk, Field paramField, com.google.gson.jpush.a.a parama, boolean paramBoolean3)
  {
    super(paramString, paramBoolean1, paramBoolean2);
  }

  final void a(com.google.gson.jpush.b.a parama, Object paramObject)
  {
    Object localObject = this.a.a(parama);
    if ((localObject != null) || (!this.e))
      this.c.set(paramObject, localObject);
  }

  final void a(d paramd, Object paramObject)
  {
    Object localObject = this.c.get(paramObject);
    new y(this.b, this.a, this.d.b()).a(paramd, localObject);
  }

  public final boolean a(Object paramObject)
  {
    if (!this.h);
    while (this.c.get(paramObject) == paramObject)
      return false;
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */