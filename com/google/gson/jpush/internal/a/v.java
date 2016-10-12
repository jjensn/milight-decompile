package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.k;
import java.sql.Date;

final class v
  implements am
{
  v()
  {
  }

  public final <T> al<T> a(k paramk, a<T> parama)
  {
    if (parama.a() == Date.class)
      return new u();
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */