package com.loopj.android.http;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JsonHttpResponseHandler$2
  implements Runnable
{
  JsonHttpResponseHandler$2(JsonHttpResponseHandler paramJsonHttpResponseHandler, byte[] paramArrayOfByte, int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable)
  {
  }

  public void run()
  {
    try
    {
      final Object localObject = this.this$0.parseResponse(this.val$responseBytes);
      this.this$0.postRunnable(new Runnable()
      {
        public void run()
        {
          if ((localObject instanceof JSONObject))
          {
            JsonHttpResponseHandler.2.this.this$0.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, JsonHttpResponseHandler.2.this.val$throwable, (JSONObject)localObject);
            return;
          }
          if ((localObject instanceof JSONArray))
          {
            JsonHttpResponseHandler.2.this.this$0.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, JsonHttpResponseHandler.2.this.val$throwable, (JSONArray)localObject);
            return;
          }
          if ((localObject instanceof String))
          {
            JsonHttpResponseHandler.2.this.this$0.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, (String)localObject, JsonHttpResponseHandler.2.this.val$throwable);
            return;
          }
          JsonHttpResponseHandler.2.this.this$0.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, new JSONException("Unexpected response type " + localObject.getClass().getName()), (JSONObject)null);
        }
      });
      return;
    }
    catch (JSONException localJSONException)
    {
      this.this$0.postRunnable(new Runnable()
      {
        public void run()
        {
          JsonHttpResponseHandler.2.this.this$0.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, localJSONException, (JSONObject)null);
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.JsonHttpResponseHandler.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */