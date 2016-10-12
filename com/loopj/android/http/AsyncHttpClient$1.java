package com.loopj.android.http;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

class AsyncHttpClient$1
  implements HttpRequestInterceptor
{
  AsyncHttpClient$1(AsyncHttpClient paramAsyncHttpClient)
  {
  }

  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    if (!paramHttpRequest.containsHeader("Accept-Encoding"))
      paramHttpRequest.addHeader("Accept-Encoding", "gzip");
    Iterator localIterator = AsyncHttpClient.access$000(this.this$0).keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramHttpRequest.containsHeader(str))
      {
        Header localHeader = paramHttpRequest.getFirstHeader(str);
        Object[] arrayOfObject = new Object[4];
        arrayOfObject[0] = str;
        arrayOfObject[1] = AsyncHttpClient.access$000(this.this$0).get(str);
        arrayOfObject[2] = localHeader.getName();
        arrayOfObject[3] = localHeader.getValue();
        Log.d("AsyncHttpClient", String.format("Headers were overwritten! (%s | %s) overwrites (%s | %s)", arrayOfObject));
        paramHttpRequest.removeHeader(localHeader);
      }
      paramHttpRequest.addHeader(str, (String)AsyncHttpClient.access$000(this.this$0).get(str));
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.AsyncHttpClient.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */