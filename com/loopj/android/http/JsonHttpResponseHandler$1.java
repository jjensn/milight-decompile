package com.loopj.android.http;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JsonHttpResponseHandler$1
  implements Runnable
{
  JsonHttpResponseHandler$1(JsonHttpResponseHandler paramJsonHttpResponseHandler, byte[] paramArrayOfByte, int paramInt, Header[] paramArrayOfHeader)
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
            JsonHttpResponseHandler.1.this.this$0.onSuccess(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (JSONObject)localObject);
            return;
          }
          if ((localObject instanceof JSONArray))
          {
            JsonHttpResponseHandler.1.this.this$0.onSuccess(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (JSONArray)localObject);
            return;
          }
          if ((localObject instanceof String))
          {
            JsonHttpResponseHandler.1.this.this$0.onFailure(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (String)localObject, new JSONException("Response cannot be parsed as JSON data"));
            return;
          }
          JsonHttpResponseHandler.1.this.this$0.onFailure(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, new JSONException("Unexpected response type " + localObject.getClass().getName()), (JSONObject)null);
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
          JsonHttpResponseHandler.1.this.this$0.onFailure(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, localJSONException, (JSONObject)null);
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.JsonHttpResponseHandler.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */