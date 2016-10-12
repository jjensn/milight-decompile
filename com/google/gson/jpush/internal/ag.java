package com.google.gson.jpush.internal;

import com.google.gson.jpush.af;
import com.google.gson.jpush.al;
import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.d;
import com.google.gson.jpush.b.e;
import com.google.gson.jpush.internal.a.z;
import com.google.gson.jpush.w;
import com.google.gson.jpush.x;
import com.google.gson.jpush.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class ag
{
  public static w a(a parama)
  {
    i = 1;
    try
    {
      parama.f();
      i = 0;
      w localw = (w)z.P.a(parama);
      return localw;
    }
    catch (EOFException localEOFException)
    {
      if (i != 0)
        return y.a;
      throw new af(localEOFException);
    }
    catch (e locale)
    {
      throw new af(locale);
    }
    catch (IOException localIOException)
    {
      throw new x(localIOException);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new af(localNumberFormatException);
    }
  }

  public static Writer a(Appendable paramAppendable)
  {
    if ((paramAppendable instanceof Writer))
      return (Writer)paramAppendable;
    return new ah(paramAppendable, (byte)0);
  }

  public static void a(w paramw, d paramd)
  {
    z.P.a(paramd, paramw);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */