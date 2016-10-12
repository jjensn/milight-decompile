package com.loopj.android.http;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JsonHttpResponseHandler$2$1
  implements Runnable
{
  JsonHttpResponseHandler$2$1(JsonHttpResponseHandler.2 param2, Object paramObject)
  {
  }

  public void run()
  {
    if ((this.val$jsonResponse instanceof JSONObject))
    {
      this.this$1.this$0.onFailure(this.this$1.val$statusCode, this.this$1.val$headers, this.this$1.val$throwable, (JSONObject)this.val$jsonResponse);
      return;
    }
    if ((this.val$jsonResponse instanceof JSONArray))
    {
      this.this$1.this$0.onFailure(this.this$1.val$statusCode, this.this$1.val$headers, this.this$1.val$throwable, (JSONArray)this.val$jsonResponse);
      return;
    }
    if ((this.val$jsonResponse instanceof String))
    {
      this.this$1.this$0.onFailure(this.this$1.val$statusCode, this.this$1.val$headers, (String)this.val$jsonResponse, this.this$1.val$throwable);
      return;
    }
    this.this$1.this$0.onFailure(this.this$1.val$statusCode, this.this$1.val$headers, new JSONException("Unexpected response type " + this.val$jsonResponse.getClass().getName()), (JSONObject)null);
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.JsonHttpResponseHandler.2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */