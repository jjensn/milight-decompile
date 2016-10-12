package com.loopj.android.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.util.ByteArrayBuffer;

public abstract class AsyncHttpResponseHandler
  implements ResponseHandlerInterface
{
  protected static final int BUFFER_SIZE = 4096;
  protected static final int CANCEL_MESSAGE = 6;
  public static final String DEFAULT_CHARSET = "UTF-8";
  protected static final int FAILURE_MESSAGE = 1;
  protected static final int FINISH_MESSAGE = 3;
  private static final String LOG_TAG = "AsyncHttpResponseHandler";
  protected static final int PROGRESS_MESSAGE = 4;
  protected static final int RETRY_MESSAGE = 5;
  protected static final int START_MESSAGE = 2;
  protected static final int SUCCESS_MESSAGE = 0;
  public static final String UTF8_BOM = "﻿";
  private Handler handler;
  private Looper looper = null;
  private Header[] requestHeaders = null;
  private URI requestURI = null;
  private String responseCharset = "UTF-8";
  private boolean useSynchronousMode;

  public AsyncHttpResponseHandler()
  {
    this(null);
  }

  public AsyncHttpResponseHandler(Looper paramLooper)
  {
    if (paramLooper == null)
      paramLooper = Looper.myLooper();
    this.looper = paramLooper;
    setUseSynchronousMode(false);
  }

  public String getCharset()
  {
    if (this.responseCharset == null)
      return "UTF-8";
    return this.responseCharset;
  }

  public Header[] getRequestHeaders()
  {
    return this.requestHeaders;
  }

  public URI getRequestURI()
  {
    return this.requestURI;
  }

  byte[] getResponseData(HttpEntity paramHttpEntity)
    throws IOException
  {
    int i = 4096;
    Object localObject1 = null;
    if (paramHttpEntity != null)
    {
      InputStream localInputStream = paramHttpEntity.getContent();
      localObject1 = null;
      if (localInputStream != null)
      {
        long l1 = paramHttpEntity.getContentLength();
        if (l1 > 2147483647L)
          throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        ByteArrayBuffer localByteArrayBuffer;
        if (l1 <= 0L)
          try
          {
            localByteArrayBuffer = new ByteArrayBuffer(i);
            try
            {
              arrayOfByte1 = new byte[4096];
              j = 0;
              while (true)
              {
                k = localInputStream.read(arrayOfByte1);
                if ((k == -1) || (Thread.currentThread().isInterrupted()))
                  break label185;
                j += k;
                localByteArrayBuffer.append(arrayOfByte1, 0, k);
                if (l1 > 0L)
                  break;
                l2 = 1L;
                sendProgressMessage(j, (int)l2);
              }
            }
            finally
            {
              AsyncHttpClient.silentCloseInputStream(localInputStream);
              AsyncHttpClient.endEntityViaReflection(paramHttpEntity);
            }
          }
          catch (OutOfMemoryError localOutOfMemoryError)
          {
            System.gc();
            throw new IOException("File too large to fit into available memory");
          }
        while (true)
        {
          byte[] arrayOfByte1;
          int j;
          int k;
          i = (int)l1;
          break;
          long l2 = l1;
        }
        label185: AsyncHttpClient.silentCloseInputStream(localInputStream);
        AsyncHttpClient.endEntityViaReflection(paramHttpEntity);
        byte[] arrayOfByte2 = localByteArrayBuffer.toByteArray();
        localObject1 = arrayOfByte2;
      }
    }
    return localObject1;
  }

  public boolean getUseSynchronousMode()
  {
    return this.useSynchronousMode;
  }

  protected void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
      Object[] arrayOfObject4 = (Object[])paramMessage.obj;
      if ((arrayOfObject4 != null) && (arrayOfObject4.length >= 3))
      {
        onSuccess(((Integer)arrayOfObject4[0]).intValue(), (Header[])arrayOfObject4[1], (byte[])arrayOfObject4[2]);
        return;
      }
      Log.e("AsyncHttpResponseHandler", "SUCCESS_MESSAGE didn't got enough params");
      return;
    case 1:
      Object[] arrayOfObject3 = (Object[])paramMessage.obj;
      if ((arrayOfObject3 != null) && (arrayOfObject3.length >= 4))
      {
        onFailure(((Integer)arrayOfObject3[0]).intValue(), (Header[])arrayOfObject3[1], (byte[])arrayOfObject3[2], (Throwable)arrayOfObject3[3]);
        return;
      }
      Log.e("AsyncHttpResponseHandler", "FAILURE_MESSAGE didn't got enough params");
      return;
    case 2:
      onStart();
      return;
    case 3:
      onFinish();
      return;
    case 4:
      Object[] arrayOfObject2 = (Object[])paramMessage.obj;
      if ((arrayOfObject2 != null) && (arrayOfObject2.length >= 2))
        try
        {
          onProgress(((Integer)arrayOfObject2[0]).intValue(), ((Integer)arrayOfObject2[1]).intValue());
          return;
        }
        catch (Throwable localThrowable)
        {
          Log.e("AsyncHttpResponseHandler", "custom onProgress contains an error", localThrowable);
          return;
        }
      Log.e("AsyncHttpResponseHandler", "PROGRESS_MESSAGE didn't got enough params");
      return;
    case 5:
      Object[] arrayOfObject1 = (Object[])paramMessage.obj;
      if ((arrayOfObject1 != null) && (arrayOfObject1.length == 1))
      {
        onRetry(((Integer)arrayOfObject1[0]).intValue());
        return;
      }
      Log.e("AsyncHttpResponseHandler", "RETRY_MESSAGE didn't get enough params");
      return;
    case 6:
    }
    onCancel();
  }

  protected Message obtainMessage(int paramInt, Object paramObject)
  {
    return Message.obtain(this.handler, paramInt, paramObject);
  }

  public void onCancel()
  {
    Log.d("AsyncHttpResponseHandler", "Request got cancelled");
  }

  public abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable);

  public void onFinish()
  {
  }

  public void onPostProcessResponse(ResponseHandlerInterface paramResponseHandlerInterface, HttpResponse paramHttpResponse)
  {
  }

  public void onPreProcessResponse(ResponseHandlerInterface paramResponseHandlerInterface, HttpResponse paramHttpResponse)
  {
  }

  public void onProgress(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    if (paramInt2 > 0);
    for (double d = 100.0D * (1.0D * paramInt1 / paramInt2); ; d = -1.0D)
    {
      arrayOfObject[2] = Double.valueOf(d);
      Log.v("AsyncHttpResponseHandler", String.format("Progress %d from %d (%2.0f%%)", arrayOfObject));
      return;
    }
  }

  public void onRetry(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    Log.d("AsyncHttpResponseHandler", String.format("Request retry no. %d", arrayOfObject));
  }

  public void onStart()
  {
  }

  public abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte);

  protected void postRunnable(Runnable paramRunnable)
  {
    if (paramRunnable != null)
    {
      if ((getUseSynchronousMode()) || (this.handler == null))
        paramRunnable.run();
    }
    else
      return;
    if (this.handler != null);
    for (boolean bool = true; ; bool = false)
    {
      AssertUtils.asserts(bool, "handler should not be null!");
      this.handler.post(paramRunnable);
      return;
    }
  }

  public final void sendCancelMessage()
  {
    sendMessage(obtainMessage(6, null));
  }

  public final void sendFailureMessage(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramArrayOfHeader;
    arrayOfObject[2] = paramArrayOfByte;
    arrayOfObject[3] = paramThrowable;
    sendMessage(obtainMessage(1, arrayOfObject));
  }

  public final void sendFinishMessage()
  {
    sendMessage(obtainMessage(3, null));
  }

  protected void sendMessage(Message paramMessage)
  {
    if ((getUseSynchronousMode()) || (this.handler == null))
      handleMessage(paramMessage);
    while (Thread.currentThread().isInterrupted())
      return;
    if (this.handler != null);
    for (boolean bool = true; ; bool = false)
    {
      AssertUtils.asserts(bool, "handler should not be null!");
      this.handler.sendMessage(paramMessage);
      return;
    }
  }

  public final void sendProgressMessage(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    sendMessage(obtainMessage(4, arrayOfObject));
  }

  public void sendResponseMessage(HttpResponse paramHttpResponse)
    throws IOException
  {
    StatusLine localStatusLine;
    byte[] arrayOfByte;
    if (!Thread.currentThread().isInterrupted())
    {
      localStatusLine = paramHttpResponse.getStatusLine();
      arrayOfByte = getResponseData(paramHttpResponse.getEntity());
      if (!Thread.currentThread().isInterrupted())
      {
        if (localStatusLine.getStatusCode() < 300)
          break label85;
        sendFailureMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), arrayOfByte, new HttpResponseException(localStatusLine.getStatusCode(), localStatusLine.getReasonPhrase()));
      }
    }
    return;
    label85: sendSuccessMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), arrayOfByte);
  }

  public final void sendRetryMessage(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    sendMessage(obtainMessage(5, arrayOfObject));
  }

  public final void sendStartMessage()
  {
    sendMessage(obtainMessage(2, null));
  }

  public final void sendSuccessMessage(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramArrayOfHeader;
    arrayOfObject[2] = paramArrayOfByte;
    sendMessage(obtainMessage(0, arrayOfObject));
  }

  public void setCharset(String paramString)
  {
    this.responseCharset = paramString;
  }

  public void setRequestHeaders(Header[] paramArrayOfHeader)
  {
    this.requestHeaders = paramArrayOfHeader;
  }

  public void setRequestURI(URI paramURI)
  {
    this.requestURI = paramURI;
  }

  public void setUseSynchronousMode(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.looper == null))
    {
      paramBoolean = true;
      Log.w("AsyncHttpResponseHandler", "Current thread has not called Looper.prepare(). Forcing synchronous mode.");
    }
    if ((!paramBoolean) && (this.handler == null));
    for (this.handler = new ResponderHandler(this, this.looper); ; this.handler = null)
      do
      {
        this.useSynchronousMode = paramBoolean;
        return;
      }
      while ((!paramBoolean) || (this.handler == null));
  }

  private static class ResponderHandler extends Handler
  {
    private final AsyncHttpResponseHandler mResponder;

    ResponderHandler(AsyncHttpResponseHandler paramAsyncHttpResponseHandler, Looper paramLooper)
    {
      super();
      this.mResponder = paramAsyncHttpResponseHandler;
    }

    public void handleMessage(Message paramMessage)
    {
      this.mResponder.handleMessage(paramMessage);
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.AsyncHttpResponseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */