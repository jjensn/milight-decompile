package com.loopj.android.http;

import android.util.Log;
import org.apache.http.Header;

class BaseJsonHttpResponseHandler$1
  implements Runnable
{
  BaseJsonHttpResponseHandler$1(BaseJsonHttpResponseHandler paramBaseJsonHttpResponseHandler, String paramString, int paramInt, Header[] paramArrayOfHeader)
  {
  }

  public void run()
  {
    try
    {
      final Object localObject = this.this$0.parseResponse(this.val$responseString, false);
      this.this$0.postRunnable(new Runnable()
      {
        public void run()
        {
          BaseJsonHttpResponseHandler.1.this.this$0.onSuccess(BaseJsonHttpResponseHandler.1.this.val$statusCode, BaseJsonHttpResponseHandler.1.this.val$headers, BaseJsonHttpResponseHandler.1.this.val$responseString, localObject);
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
          BaseJsonHttpResponseHandler.1.this.this$0.onFailure(BaseJsonHttpResponseHandler.1.this.val$statusCode, BaseJsonHttpResponseHandler.1.this.val$headers, localThrowable, BaseJsonHttpResponseHandler.1.this.val$responseString, null);
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.BaseJsonHttpResponseHandler.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */