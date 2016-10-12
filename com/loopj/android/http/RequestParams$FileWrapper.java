package com.loopj.android.http;

import java.io.File;

public class RequestParams$FileWrapper
{
  public final String contentType;
  public final String customFileName;
  public final File file;

  public RequestParams$FileWrapper(File paramFile, String paramString1, String paramString2)
  {
    this.file = paramFile;
    this.contentType = paramString1;
    this.customFileName = paramString2;
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.RequestParams.FileWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */