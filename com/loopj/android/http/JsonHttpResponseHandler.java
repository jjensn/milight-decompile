package com.loopj.android.http;

import android.util.Log;
import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHttpResponseHandler extends TextHttpResponseHandler
{
  private static final String LOG_TAG = "JsonHttpResponseHandler";

  public JsonHttpResponseHandler()
  {
    super("UTF-8");
  }

  public JsonHttpResponseHandler(String paramString)
  {
    super(paramString);
  }

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable)
  {
    Log.w("JsonHttpResponseHandler", "onFailure(int, Header[], String, Throwable) was not overriden, but callback was received", paramThrowable);
  }

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable, JSONArray paramJSONArray)
  {
    Log.w("JsonHttpResponseHandler", "onFailure(int, Header[], Throwable, JSONArray) was not overriden, but callback was received", paramThrowable);
  }

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable, JSONObject paramJSONObject)
  {
    Log.w("JsonHttpResponseHandler", "onFailure(int, Header[], Throwable, JSONObject) was not overriden, but callback was received", paramThrowable);
  }

  public final void onFailure(final int paramInt, final Header[] paramArrayOfHeader, final byte[] paramArrayOfByte, final Throwable paramThrowable)
  {
    if (paramArrayOfByte != null)
    {
      Runnable local2 = new Runnable()
      {
        public void run()
        {
          try
          {
            final Object localObject = JsonHttpResponseHandler.this.parseResponse(paramArrayOfByte);
            JsonHttpResponseHandler.this.postRunnable(new Runnable()
            {
              public void run()
              {
                if ((localObject instanceof JSONObject))
                {
                  JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, JsonHttpResponseHandler.2.this.val$throwable, (JSONObject)localObject);
                  return;
                }
                if ((localObject instanceof JSONArray))
                {
                  JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, JsonHttpResponseHandler.2.this.val$throwable, (JSONArray)localObject);
                  return;
                }
                if ((localObject instanceof String))
                {
                  JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, (String)localObject, JsonHttpResponseHandler.2.this.val$throwable);
                  return;
                }
                JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, new JSONException("Unexpected response type " + localObject.getClass().getName()), (JSONObject)null);
              }
            });
            return;
          }
          catch (JSONException localJSONException)
          {
            JsonHttpResponseHandler.this.postRunnable(new Runnable()
            {
              public void run()
              {
                JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, localJSONException, (JSONObject)null);
              }
            });
          }
        }
      };
      if (!getUseSynchronousMode())
      {
        new Thread(local2).start();
        return;
      }
      local2.run();
      return;
    }
    Log.v("JsonHttpResponseHandler", "response body is null, calling onFailure(Throwable, JSONObject)");
    onFailure(paramInt, paramArrayOfHeader, paramThrowable, (JSONObject)null);
  }

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString)
  {
    Log.w("JsonHttpResponseHandler", "onSuccess(int, Header[], String) was not overriden, but callback was received");
  }

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, JSONArray paramJSONArray)
  {
    Log.w("JsonHttpResponseHandler", "onSuccess(int, Header[], JSONArray) was not overriden, but callback was received");
  }

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, JSONObject paramJSONObject)
  {
    Log.w("JsonHttpResponseHandler", "onSuccess(int, Header[], JSONObject) was not overriden, but callback was received");
  }

  public final void onSuccess(final int paramInt, final Header[] paramArrayOfHeader, final byte[] paramArrayOfByte)
  {
    if (paramInt != 204)
    {
      Runnable local1 = new Runnable()
      {
        public void run()
        {
          try
          {
            final Object localObject = JsonHttpResponseHandler.this.parseResponse(paramArrayOfByte);
            JsonHttpResponseHandler.this.postRunnable(new Runnable()
            {
              public void run()
              {
                if ((localObject instanceof JSONObject))
                {
                  JsonHttpResponseHandler.this.onSuccess(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (JSONObject)localObject);
                  return;
                }
                if ((localObject instanceof JSONArray))
                {
                  JsonHttpResponseHandler.this.onSuccess(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (JSONArray)localObject);
                  return;
                }
                if ((localObject instanceof String))
                {
                  JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (String)localObject, new JSONException("Response cannot be parsed as JSON data"));
                  return;
                }
                JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, new JSONException("Unexpected response type " + localObject.getClass().getName()), (JSONObject)null);
              }
            });
            return;
          }
          catch (JSONException localJSONException)
          {
            JsonHttpResponseHandler.this.postRunnable(new Runnable()
            {
              public void run()
              {
                JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, localJSONException, (JSONObject)null);
              }
            });
          }
        }
      };
      if (!getUseSynchronousMode())
      {
        new Thread(local1).start();
        return;
      }
      local1.run();
      return;
    }
    onSuccess(paramInt, paramArrayOfHeader, new JSONObject());
  }

  protected Object parseResponse(byte[] paramArrayOfByte)
    throws JSONException
  {
    Object localObject;
    if (paramArrayOfByte == null)
      localObject = null;
    String str;
    do
    {
      return localObject;
      str = getResponseString(paramArrayOfByte, getCharset());
      localObject = null;
      if (str != null)
      {
        str = str.trim();
        if (str.startsWith("﻿"))
          str = str.substring(1);
        if (!str.startsWith("{"))
        {
          boolean bool = str.startsWith("[");
          localObject = null;
          if (!bool);
        }
        else
        {
          localObject = new JSONTokener(str).nextValue();
        }
      }
    }
    while (localObject != null);
    return str;
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.JsonHttpResponseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */