package com.loopj.android.http;

import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.ByteArrayBuffer;

public abstract class DataAsyncHttpResponseHandler extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "DataAsyncHttpResponseHandler";
  protected static final int PROGRESS_DATA_MESSAGE = 6;

  public DataAsyncHttpResponseHandler()
  {
  }

  public static byte[] copyOfRange(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NullPointerException
  {
    if (paramInt1 > paramInt2)
      throw new IllegalArgumentException();
    int i = paramArrayOfByte.length;
    if ((paramInt1 < 0) || (paramInt1 > i))
      throw new ArrayIndexOutOfBoundsException();
    int j = paramInt2 - paramInt1;
    int k = Math.min(j, i - paramInt1);
    byte[] arrayOfByte = new byte[j];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, k);
    return arrayOfByte;
  }

  byte[] getResponseData(HttpEntity paramHttpEntity)
    throws IOException
  {
    Object localObject1 = null;
    if (paramHttpEntity != null)
    {
      InputStream localInputStream = paramHttpEntity.getContent();
      localObject1 = null;
      if (localInputStream != null)
      {
        long l = paramHttpEntity.getContentLength();
        if (l > 2147483647L)
          throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        if (l < 0L)
          l = 4096L;
        ByteArrayBuffer localByteArrayBuffer;
        try
        {
          localByteArrayBuffer = new ByteArrayBuffer((int)l);
          try
          {
            byte[] arrayOfByte1 = new byte[4096];
            while (true)
            {
              int i = localInputStream.read(arrayOfByte1);
              if ((i == -1) || (Thread.currentThread().isInterrupted()))
                break;
              localByteArrayBuffer.append(arrayOfByte1, 0, i);
              sendProgressDataMessage(copyOfRange(arrayOfByte1, 0, i));
            }
          }
          finally
          {
            AsyncHttpClient.silentCloseInputStream(localInputStream);
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          System.gc();
          throw new IOException("File too large to fit into available memory");
        }
        AsyncHttpClient.silentCloseInputStream(localInputStream);
        byte[] arrayOfByte2 = localByteArrayBuffer.toByteArray();
        localObject1 = arrayOfByte2;
      }
    }
    return localObject1;
  }

  protected void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
      return;
    case 6:
    }
    Object[] arrayOfObject = (Object[])paramMessage.obj;
    if ((arrayOfObject != null) && (arrayOfObject.length >= 1))
      try
      {
        onProgressData((byte[])arrayOfObject[0]);
        return;
      }
      catch (Throwable localThrowable)
      {
        Log.e("DataAsyncHttpResponseHandler", "custom onProgressData contains an error", localThrowable);
        return;
      }
    Log.e("DataAsyncHttpResponseHandler", "PROGRESS_DATA_MESSAGE didn't got enough params");
  }

  public void onProgressData(byte[] paramArrayOfByte)
  {
    Log.d("DataAsyncHttpResponseHandler", "onProgressData(byte[]) was not overriden, but callback was received");
  }

  public final void sendProgressDataMessage(byte[] paramArrayOfByte)
  {
    sendMessage(obtainMessage(6, new Object[] { paramArrayOfByte }));
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.DataAsyncHttpResponseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */