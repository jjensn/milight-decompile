package com.loopj.android.http;

import java.io.InputStream;

public class RequestParams$StreamWrapper
{
  public final boolean autoClose;
  public final String contentType;
  public final InputStream inputStream;
  public final String name;

  public RequestParams$StreamWrapper(InputStream paramInputStream, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.inputStream = paramInputStream;
    this.name = paramString1;
    this.contentType = paramString2;
    this.autoClose = paramBoolean;
  }

  static StreamWrapper newInstance(InputStream paramInputStream, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramString2 == null)
      paramString2 = "application/octet-stream";
    return new StreamWrapper(paramInputStream, paramString1, paramString2, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.RequestParams.StreamWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */