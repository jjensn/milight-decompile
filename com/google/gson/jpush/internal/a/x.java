package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.k;
import java.sql.Time;

final class x
  implements am
{
  x()
  {
  }

  public final <T> al<T> a(k paramk, a<T> parama)
  {
    if (parama.a() == Time.class)
      return new w();
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */