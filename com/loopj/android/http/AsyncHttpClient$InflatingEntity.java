package com.loopj.android.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

class AsyncHttpClient$InflatingEntity extends HttpEntityWrapper
{
  GZIPInputStream gzippedStream;
  PushbackInputStream pushbackStream;
  InputStream wrappedStream;

  public AsyncHttpClient$InflatingEntity(HttpEntity paramHttpEntity)
  {
    super(paramHttpEntity);
  }

  public void consumeContent()
    throws IOException
  {
    AsyncHttpClient.silentCloseInputStream(this.wrappedStream);
    AsyncHttpClient.silentCloseInputStream(this.pushbackStream);
    AsyncHttpClient.silentCloseInputStream(this.gzippedStream);
    super.consumeContent();
  }

  public InputStream getContent()
    throws IOException
  {
    this.wrappedStream = this.wrappedEntity.getContent();
    this.pushbackStream = new PushbackInputStream(this.wrappedStream, 2);
    if (AsyncHttpClient.isInputStreamGZIPCompressed(this.pushbackStream))
    {
      this.gzippedStream = new GZIPInputStream(this.pushbackStream);
      return this.gzippedStream;
    }
    return this.pushbackStream;
  }

  public long getContentLength()
  {
    if (this.wrappedEntity == null)
      return 0L;
    return this.wrappedEntity.getContentLength();
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.AsyncHttpClient.InflatingEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */