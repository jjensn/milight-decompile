package com.loopj.android.http;

class BaseJsonHttpResponseHandler$2$2
  implements Runnable
{
  BaseJsonHttpResponseHandler$2$2(BaseJsonHttpResponseHandler.2 param2)
  {
  }

  public void run()
  {
    this.this$1.this$0.onFailure(this.this$1.val$statusCode, this.this$1.val$headers, this.this$1.val$throwable, this.this$1.val$responseString, null);
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.BaseJsonHttpResponseHandler.2.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */