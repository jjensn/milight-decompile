package com.loopj.android.http;

import android.util.Log;
import org.apache.http.Header;

class BaseJsonHttpResponseHandler$2
  implements Runnable
{
  BaseJsonHttpResponseHandler$2(BaseJsonHttpResponseHandler paramBaseJsonHttpResponseHandler, String paramString, int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable)
  {
  }

  public void run()
  {
    try
    {
      final Object localObject = this.this$0.parseResponse(this.val$responseString, true);
      this.this$0.postRunnable(new Runnable()
      {
        public void run()
        {
          BaseJsonHttpResponseHandler.2.this.this$0.onFailure(BaseJsonHttpResponseHandler.2.this.val$statusCode, BaseJsonHttpResponseHandler.2.this.val$headers, BaseJsonHttpResponseHandler.2.this.val$throwable, BaseJsonHttpResponseHandler.2.this.val$responseString, localObject);
        }
      });
      return;
    }
    catch (Throwable localThrowable)
    {
      Log.d("BaseJsonHttpResponseHandler", "parseResponse thrown an problem", localThrowable);
      this.this$0.postRunnable(new Runnable()
      {
        public void run()
        {
          BaseJsonHttpResponseHandler.2.this.this$0.onFailure(BaseJsonHttpResponseHandler.2.this.val$statusCode, BaseJsonHttpResponseHandler.2.this.val$headers, BaseJsonHttpResponseHandler.2.this.val$throwable, BaseJsonHttpResponseHandler.2.this.val$responseString, null);
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.BaseJsonHttpResponseHandler.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */