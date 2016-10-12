package com.loopj.android.http;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.apache.http.Header;

public abstract class TextHttpResponseHandler extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "TextHttpResponseHandler";

  public TextHttpResponseHandler()
  {
    this("UTF-8");
  }

  public TextHttpResponseHandler(String paramString)
  {
    setCharset(paramString);
  }

  public static String getResponseString(byte[] paramArrayOfByte, String paramString)
  {
    String str;
    if (paramArrayOfByte == null)
      str = null;
    while (true)
      if (str != null)
        try
        {
          if (str.startsWith("﻿"))
          {
            return str.substring(1);
            str = new String(paramArrayOfByte, paramString);
          }
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          Log.e("TextHttpResponseHandler", "Encoding response into string failed", localUnsupportedEncodingException);
          str = null;
        }
    return str;
  }

  public abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable);

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    onFailure(paramInt, paramArrayOfHeader, getResponseString(paramArrayOfByte, getCharset()), paramThrowable);
  }

  public abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString);

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    onSuccess(paramInt, paramArrayOfHeader, getResponseString(paramArrayOfByte, getCharset()));
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.TextHttpResponseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */