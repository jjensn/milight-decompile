package com.loopj.android.http;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class AsyncHttpClient$4
  implements Runnable
{
  AsyncHttpClient$4(AsyncHttpClient paramAsyncHttpClient, Context paramContext, boolean paramBoolean)
  {
  }

  public void run()
  {
    List localList = (List)AsyncHttpClient.access$100(this.this$0).get(this.val$context);
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
        ((RequestHandle)localIterator.next()).cancel(this.val$mayInterruptIfRunning);
      AsyncHttpClient.access$100(this.this$0).remove(this.val$context);
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.AsyncHttpClient.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */