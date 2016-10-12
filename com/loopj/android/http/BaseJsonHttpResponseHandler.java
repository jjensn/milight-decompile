package com.loopj.android.http;

import android.util.Log;
import org.apache.http.Header;

public abstract class BaseJsonHttpResponseHandler<JSON_TYPE> extends TextHttpResponseHandler
{
  private static final String LOG_TAG = "BaseJsonHttpResponseHandler";

  public BaseJsonHttpResponseHandler()
  {
    this("UTF-8");
  }

  public BaseJsonHttpResponseHandler(String paramString)
  {
    super(paramString);
  }

  public final void onFailure(final int paramInt, final Header[] paramArrayOfHeader, final String paramString, final Throwable paramThrowable)
  {
    if (paramString != null)
    {
      Runnable local2 = new Runnable()
      {
        public void run()
        {
          try
          {
            final Object localObject = BaseJsonHttpResponseHandler.this.parseResponse(paramString, true);
            BaseJsonHttpResponseHandler.this.postRunnable(new Runnable()
            {
              public void run()
              {
                BaseJsonHttpResponseHandler.this.onFailure(BaseJsonHttpResponseHandler.2.this.val$statusCode, BaseJsonHttpResponseHandler.2.this.val$headers, BaseJsonHttpResponseHandler.2.this.val$throwable, BaseJsonHttpResponseHandler.2.this.val$responseString, localObject);
              }
            });
            return;
          }
          catch (Throwable localThrowable)
          {
            Log.d("BaseJsonHttpResponseHandler", "parseResponse thrown an problem", localThrowable);
            BaseJsonHttpResponseHandler.this.postRunnable(new Runnable()
            {
              public void run()
              {
                BaseJsonHttpResponseHandler.this.onFailure(BaseJsonHttpResponseHandler.2.this.val$statusCode, BaseJsonHttpResponseHandler.2.this.val$headers, BaseJsonHttpResponseHandler.2.this.val$throwable, BaseJsonHttpResponseHandler.2.this.val$responseString, null);
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
    onFailure(paramInt, paramArrayOfHeader, paramThrowable, null, null);
  }

  public abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable, String paramString, JSON_TYPE paramJSON_TYPE);

  public final void onSuccess(final int paramInt, final Header[] paramArrayOfHeader, final String paramString)
  {
    if (paramInt != 204)
    {
      Runnable local1 = new Runnable()
      {
        public void run()
        {
          try
          {
            final Object localObject = BaseJsonHttpResponseHandler.this.parseResponse(paramString, false);
            BaseJsonHttpResponseHandler.this.postRunnable(new Runnable()
            {
              public void run()
              {
                BaseJsonHttpResponseHandler.this.onSuccess(BaseJsonHttpResponseHandler.1.this.val$statusCode, BaseJsonHttpResponseHandler.1.this.val$headers, BaseJsonHttpResponseHandler.1.this.val$responseString, localObject);
              }
            });
            return;
          }
          catch (Throwable localThrowable)
          {
            Log.d("BaseJsonHttpResponseHandler", "parseResponse thrown an problem", localThrowable);
            BaseJsonHttpResponseHandler.this.postRunnable(new Runnable()
            {
              public void run()
              {
                BaseJsonHttpResponseHandler.this.onFailure(BaseJsonHttpResponseHandler.1.this.val$statusCode, BaseJsonHttpResponseHandler.1.this.val$headers, localThrowable, BaseJsonHttpResponseHandler.1.this.val$responseString, null);
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
    onSuccess(paramInt, paramArrayOfHeader, null, null);
  }

  public abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString, JSON_TYPE paramJSON_TYPE);

  protected abstract JSON_TYPE parseResponse(String paramString, boolean paramBoolean)
    throws Throwable;
}

/* Location:
 * Qualified Name:     com.loopj.android.http.BaseJsonHttpResponseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */