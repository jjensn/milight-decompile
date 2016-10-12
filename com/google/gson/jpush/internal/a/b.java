package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.k;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class b
  implements am
{
  b()
  {
  }

  public final <T> al<T> a(k paramk, com.google.gson.jpush.a.a<T> parama)
  {
    Type localType1 = parama.b();
    if ((!(localType1 instanceof GenericArrayType)) && ((!(localType1 instanceof Class)) || (!((Class)localType1).isArray())))
      return null;
    Type localType2 = com.google.gson.jpush.internal.b.d(localType1);
    return new a(paramk, paramk.a(com.google.gson.jpush.a.a.a(localType2)), com.google.gson.jpush.internal.b.b(localType2));
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */