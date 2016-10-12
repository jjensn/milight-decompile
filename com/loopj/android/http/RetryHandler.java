package com.loopj.android.http;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

class RetryHandler
  implements HttpRequestRetryHandler
{
  private static final HashSet<Class<?>> exceptionBlacklist;
  private static final HashSet<Class<?>> exceptionWhitelist = new HashSet();
  private final int maxRetries;
  private final int retrySleepTimeMS;

  static
  {
    exceptionBlacklist = new HashSet();
    exceptionWhitelist.add(NoHttpResponseException.class);
    exceptionWhitelist.add(UnknownHostException.class);
    exceptionWhitelist.add(SocketException.class);
    exceptionBlacklist.add(InterruptedIOException.class);
    exceptionBlacklist.add(SSLException.class);
  }

  public RetryHandler(int paramInt1, int paramInt2)
  {
    this.maxRetries = paramInt1;
    this.retrySleepTimeMS = paramInt2;
  }

  static void addClassToBlacklist(Class<?> paramClass)
  {
    exceptionBlacklist.add(paramClass);
  }

  static void addClassToWhitelist(Class<?> paramClass)
  {
    exceptionWhitelist.add(paramClass);
  }

  protected boolean isInList(HashSet<Class<?>> paramHashSet, Throwable paramThrowable)
  {
    Iterator localIterator = paramHashSet.iterator();
    while (localIterator.hasNext())
      if (((Class)localIterator.next()).isInstance(paramThrowable))
        return true;
    return false;
  }

  public boolean retryRequest(IOException paramIOException, int paramInt, HttpContext paramHttpContext)
  {
    boolean bool = true;
    Boolean localBoolean = (Boolean)paramHttpContext.getAttribute("http.request_sent");
    int i;
    if ((localBoolean != null) && (localBoolean.booleanValue()))
    {
      i = 1;
      if (paramInt <= this.maxRetries)
        break label70;
      bool = false;
    }
    while (true)
    {
      if ((!bool) || ((HttpUriRequest)paramHttpContext.getAttribute("http.request") != null))
        break label115;
      return false;
      i = 0;
      break;
      label70: if (isInList(exceptionWhitelist, paramIOException))
        bool = true;
      else if (isInList(exceptionBlacklist, paramIOException))
        bool = false;
      else if (i == 0)
        bool = true;
    }
    label115: if (bool)
      SystemClock.sleep(this.retrySleepTimeMS);
    while (true)
    {
      return bool;
      paramIOException.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.RetryHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */