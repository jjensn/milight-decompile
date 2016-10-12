package com.google.gson.jpush;

import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.d;
import com.google.gson.jpush.internal.a.j;
import java.io.IOException;

public abstract class al<T>
{
  public al()
  {
  }

  public final w a(T paramT)
  {
    try
    {
      j localj = new j();
      a(localj, paramT);
      w localw = localj.a();
      return localw;
    }
    catch (IOException localIOException)
    {
      throw new x(localIOException);
    }
  }

  public abstract T a(a parama);

  public abstract void a(d paramd, T paramT);
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.al
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */