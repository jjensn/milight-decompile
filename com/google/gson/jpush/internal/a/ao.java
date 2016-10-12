package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.k;
import java.sql.Timestamp;
import java.util.Date;

final class ao
  implements am
{
  ao()
  {
  }

  public final <T> al<T> a(k paramk, a<T> parama)
  {
    if (parama.a() != Timestamp.class)
      return null;
    return new ap(this, paramk.a(Date.class));
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */