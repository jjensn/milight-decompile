package com.loopj.android.http;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JsonHttpResponseHandler$1$1
  implements Runnable
{
  JsonHttpResponseHandler$1$1(JsonHttpResponseHandler.1 param1, Object paramObject)
  {
  }

  public void run()
  {
    if ((this.val$jsonResponse instanceof JSONObject))
    {
      this.this$1.this$0.onSuccess(this.this$1.val$statusCode, this.this$1.val$headers, (JSONObject)this.val$jsonResponse);
      return;
    }
    if ((this.val$jsonResponse instanceof JSONArray))
    {
      this.this$1.this$0.onSuccess(this.this$1.val$statusCode, this.this$1.val$headers, (JSONArray)this.val$jsonResponse);
      return;
    }
    if ((this.val$jsonResponse instanceof String))
    {
      this.this$1.this$0.onFailure(this.this$1.val$statusCode, this.this$1.val$headers, (String)this.val$jsonResponse, new JSONException("Response cannot be parsed as JSON data"));
      return;
    }
    this.this$1.this$0.onFailure(this.this$1.val$statusCode, this.this$1.val$headers, new JSONException("Unexpected response type " + this.val$jsonResponse.getClass().getName()), (JSONObject)null);
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.JsonHttpResponseHandler.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */