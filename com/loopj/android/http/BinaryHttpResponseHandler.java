package com.loopj.android.http;

import android.util.Log;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;

public abstract class BinaryHttpResponseHandler extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "BinaryHttpResponseHandler";
  private String[] mAllowedContentTypes = { "application/octet-stream", "image/jpeg", "image/png", "image/gif" };

  public BinaryHttpResponseHandler()
  {
  }

  public BinaryHttpResponseHandler(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      this.mAllowedContentTypes = paramArrayOfString;
      return;
    }
    Log.e("BinaryHttpResponseHandler", "Constructor passed allowedContentTypes was null !");
  }

  public String[] getAllowedContentTypes()
  {
    return this.mAllowedContentTypes;
  }

  public abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable);

  public abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte);

  public final void sendResponseMessage(HttpResponse paramHttpResponse)
    throws IOException
  {
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    Header[] arrayOfHeader = paramHttpResponse.getHeaders("Content-Type");
    if (arrayOfHeader.length != 1)
    {
      sendFailureMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), null, new HttpResponseException(localStatusLine.getStatusCode(), "None, or more than one, Content-Type Header found!"));
      return;
    }
    Header localHeader = arrayOfHeader[0];
    int i = 0;
    String[] arrayOfString = getAllowedContentTypes();
    int j = arrayOfString.length;
    int k = 0;
    String str;
    while (true)
      if (k < j)
      {
        str = arrayOfString[k];
        try
        {
          boolean bool = Pattern.matches(str, localHeader.getValue());
          if (bool)
            i = 1;
          k++;
        }
        catch (PatternSyntaxException localPatternSyntaxException)
        {
          while (true)
            Log.e("BinaryHttpResponseHandler", "Given pattern is not valid: " + str, localPatternSyntaxException);
        }
      }
    if (i == 0)
    {
      sendFailureMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), null, new HttpResponseException(localStatusLine.getStatusCode(), "Content-Type not allowed!"));
      return;
    }
    super.sendResponseMessage(paramHttpResponse);
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.BinaryHttpResponseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */