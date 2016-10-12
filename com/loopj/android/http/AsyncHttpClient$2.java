package com.loopj.android.http;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

class AsyncHttpClient$2
  implements HttpResponseInterceptor
{
  AsyncHttpClient$2(AsyncHttpClient paramAsyncHttpClient)
  {
  }

  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    HttpEntity localHttpEntity = paramHttpResponse.getEntity();
    if (localHttpEntity == null);
    while (true)
    {
      return;
      Header localHeader = localHttpEntity.getContentEncoding();
      if (localHeader != null)
      {
        HeaderElement[] arrayOfHeaderElement = localHeader.getElements();
        int i = arrayOfHeaderElement.length;
        for (int j = 0; j < i; j++)
          if (arrayOfHeaderElement[j].getName().equalsIgnoreCase("gzip"))
          {
            paramHttpResponse.setEntity(new AsyncHttpClient.InflatingEntity(localHttpEntity));
            return;
          }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.AsyncHttpClient.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */