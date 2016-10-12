package com.loopj.android.http;

class BaseJsonHttpResponseHandler$1$1
  implements Runnable
{
  BaseJsonHttpResponseHandler$1$1(BaseJsonHttpResponseHandler.1 param1, Object paramObject)
  {
  }

  public void run()
  {
    this.this$1.this$0.onSuccess(this.this$1.val$statusCode, this.this$1.val$headers, this.this$1.val$responseString, this.val$jsonResponse);
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.BaseJsonHttpResponseHandler.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */