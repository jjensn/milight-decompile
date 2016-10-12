package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.internal.ae;
import com.google.gson.jpush.internal.b;
import com.google.gson.jpush.internal.f;
import com.google.gson.jpush.k;
import java.lang.reflect.Type;
import java.util.Map;

public final class l
  implements am
{
  private final f a;
  private final boolean b;

  public l(f paramf, boolean paramBoolean)
  {
    this.a = paramf;
    this.b = paramBoolean;
  }

  public final <T> al<T> a(k paramk, a<T> parama)
  {
    Type localType1 = parama.b();
    if (!Map.class.isAssignableFrom(parama.a()))
      return null;
    Type[] arrayOfType = b.b(localType1, b.b(localType1));
    Type localType2 = arrayOfType[0];
    if ((localType2 == Boolean.TYPE) || (localType2 == Boolean.class));
    for (al localal1 = z.f; ; localal1 = paramk.a(a.a(localType2)))
    {
      al localal2 = paramk.a(a.a(arrayOfType[1]));
      ae localae = this.a.a(parama);
      return new m(this, paramk, arrayOfType[0], localal1, arrayOfType[1], localal2, localae);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */