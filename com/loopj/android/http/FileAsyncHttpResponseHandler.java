package com.loopj.android.http;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public abstract class FileAsyncHttpResponseHandler extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "FileAsyncHttpResponseHandler";
  protected final boolean append;
  protected final File mFile;

  static
  {
    if (!FileAsyncHttpResponseHandler.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public FileAsyncHttpResponseHandler(Context paramContext)
  {
    this.mFile = getTemporaryFile(paramContext);
    this.append = false;
  }

  public FileAsyncHttpResponseHandler(File paramFile)
  {
    this(paramFile, false);
  }

  public FileAsyncHttpResponseHandler(File paramFile, boolean paramBoolean)
  {
    if (paramFile != null);
    for (boolean bool = true; ; bool = false)
    {
      AssertUtils.asserts(bool, "File passed into FileAsyncHttpResponseHandler constructor must not be null");
      this.mFile = paramFile;
      this.append = paramBoolean;
      return;
    }
  }

  public boolean deleteTargetFile()
  {
    return (getTargetFile() != null) && (getTargetFile().delete());
  }

  protected byte[] getResponseData(HttpEntity paramHttpEntity)
    throws IOException
  {
    if (paramHttpEntity != null)
    {
      InputStream localInputStream = paramHttpEntity.getContent();
      long l = paramHttpEntity.getContentLength();
      FileOutputStream localFileOutputStream = new FileOutputStream(getTargetFile(), this.append);
      if (localInputStream != null)
      {
        try
        {
          byte[] arrayOfByte = new byte[4096];
          int i = 0;
          while (true)
          {
            int j = localInputStream.read(arrayOfByte);
            if ((j == -1) || (Thread.currentThread().isInterrupted()))
              break;
            i += j;
            localFileOutputStream.write(arrayOfByte, 0, j);
            sendProgressMessage(i, (int)l);
          }
        }
        finally
        {
          AsyncHttpClient.silentCloseInputStream(localInputStream);
          localFileOutputStream.flush();
          AsyncHttpClient.silentCloseOutputStream(localFileOutputStream);
        }
        AsyncHttpClient.silentCloseInputStream(localInputStream);
        localFileOutputStream.flush();
        AsyncHttpClient.silentCloseOutputStream(localFileOutputStream);
      }
    }
    return null;
  }

  protected File getTargetFile()
  {
    assert (this.mFile != null);
    return this.mFile;
  }

  protected File getTemporaryFile(Context paramContext)
  {
    if (paramContext != null);
    for (boolean bool = true; ; bool = false)
    {
      AssertUtils.asserts(bool, "Tried creating temporary file without having Context");
      try
      {
        if (($assertionsDisabled) || (paramContext != null))
          break;
        throw new AssertionError();
      }
      catch (IOException localIOException)
      {
        Log.e("FileAsyncHttpResponseHandler", "Cannot create temporary file", localIOException);
        return null;
      }
    }
    File localFile = File.createTempFile("temp_", "_handled", paramContext.getCacheDir());
    return localFile;
  }

  public abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable, File paramFile);

  public final void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    onFailure(paramInt, paramArrayOfHeader, paramThrowable, getTargetFile());
  }

  public abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, File paramFile);

  public final void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    onSuccess(paramInt, paramArrayOfHeader, getTargetFile());
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.FileAsyncHttpResponseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */