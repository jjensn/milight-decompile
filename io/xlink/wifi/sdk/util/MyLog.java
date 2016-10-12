package io.xlink.wifi.sdk.util;

import android.util.Log;
import io.xlink.wifi.sdk.listener.LogListener;

public class MyLog
{
  public static Boolean a = Boolean.valueOf(true);
  private static char b = 'v';
  private static LogListener c;

  public MyLog()
  {
  }

  private static void a(String paramString1, String paramString2, char paramChar)
  {
    try
    {
      if (a.booleanValue())
      {
        if (('e' != paramChar) || (('e' != b) && ('v' != b)))
          break label79;
        Log.e(paramString1, paramString2);
      }
      while (true)
      {
        if (c != null)
          c.onLog(paramChar, paramString1, paramString2 + "");
        return;
        if (('w' != paramChar) || (('w' != b) && ('v' != b)))
          break;
        Log.w(paramString1, paramString2);
      }
    }
    finally
    {
    }
    while (true)
      label79: if (('d' == paramChar) && (('d' == b) || ('v' == b)))
        Log.d(paramString1, paramString2);
      else if (('i' == paramChar) && (('d' == b) || ('v' == b)))
        Log.i(paramString1, paramString2);
      else
        Log.v(paramString1, paramString2);
  }

  public static void d(String paramString, Object paramObject)
  {
    a(paramString, paramObject.toString(), (char)'d');
  }

  public static void d(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, (char)'d');
  }

  public static void e(String paramString, Object paramObject)
  {
    a(paramString, paramObject.toString(), (char)'e');
  }

  public static void e(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, (char)'e');
  }

  public static void i(String paramString, Object paramObject)
  {
    a(paramString, paramObject.toString(), (char)'i');
  }

  public static void i(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, (char)'i');
  }

  public static void setListener(LogListener paramLogListener)
  {
    c = paramLogListener;
  }

  public static void v(String paramString, Object paramObject)
  {
    a(paramString, paramObject.toString(), (char)'v');
  }

  public static void v(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, (char)'v');
  }

  public static void w(String paramString, Object paramObject)
  {
    a(paramString, paramObject.toString(), (char)'w');
  }

  public static void w(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, (char)'w');
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.util.MyLog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */