package com.loopj.android.http;

import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

class SimpleMultipartEntity
  implements HttpEntity
{
  private static final byte[] CR_LF = "\r\n".getBytes();
  private static final String LOG_TAG = "SimpleMultipartEntity";
  private static final char[] MULTIPART_CHARS = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  private static final String STR_CR_LF = "\r\n";
  private static final byte[] TRANSFER_ENCODING_BINARY = "Content-Transfer-Encoding: binary\r\n".getBytes();
  private final String boundary;
  private final byte[] boundaryEnd;
  private final byte[] boundaryLine;
  private int bytesWritten;
  private final List<FilePart> fileParts = new ArrayList();
  private boolean isRepeatable;
  private final ByteArrayOutputStream out = new ByteArrayOutputStream();
  private final ResponseHandlerInterface progressHandler;
  private int totalSize;

  public SimpleMultipartEntity(ResponseHandlerInterface paramResponseHandlerInterface)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Random localRandom = new Random();
    for (int i = 0; i < 30; i++)
      localStringBuilder.append(MULTIPART_CHARS[localRandom.nextInt(MULTIPART_CHARS.length)]);
    this.boundary = localStringBuilder.toString();
    this.boundaryLine = ("--" + this.boundary + "\r\n").getBytes();
    this.boundaryEnd = ("--" + this.boundary + "--" + "\r\n").getBytes();
    this.progressHandler = paramResponseHandlerInterface;
  }

  private byte[] createContentDisposition(String paramString)
  {
    return ("Content-Disposition: form-data; name=\"" + paramString + "\"" + "\r\n").getBytes();
  }

  private byte[] createContentDisposition(String paramString1, String paramString2)
  {
    return ("Content-Disposition: form-data; name=\"" + paramString1 + "\"" + "; filename=\"" + paramString2 + "\"" + "\r\n").getBytes();
  }

  private byte[] createContentType(String paramString)
  {
    return ("Content-Type: " + normalizeContentType(paramString) + "\r\n").getBytes();
  }

  private String normalizeContentType(String paramString)
  {
    if (paramString == null)
      paramString = "application/octet-stream";
    return paramString;
  }

  private void updateProgress(int paramInt)
  {
    this.bytesWritten = (paramInt + this.bytesWritten);
    this.progressHandler.sendProgressMessage(this.bytesWritten, this.totalSize);
  }

  public void addPart(String paramString, File paramFile)
  {
    addPart(paramString, paramFile, null);
  }

  public void addPart(String paramString1, File paramFile, String paramString2)
  {
    this.fileParts.add(new FilePart(paramString1, paramFile, normalizeContentType(paramString2)));
  }

  public void addPart(String paramString1, File paramFile, String paramString2, String paramString3)
  {
    this.fileParts.add(new FilePart(paramString1, paramFile, normalizeContentType(paramString2), paramString3));
  }

  public void addPart(String paramString1, String paramString2)
  {
    addPartWithCharset(paramString1, paramString2, null);
  }

  public void addPart(String paramString1, String paramString2, InputStream paramInputStream, String paramString3)
    throws IOException
  {
    this.out.write(this.boundaryLine);
    this.out.write(createContentDisposition(paramString1, paramString2));
    this.out.write(createContentType(paramString3));
    this.out.write(TRANSFER_ENCODING_BINARY);
    this.out.write(CR_LF);
    byte[] arrayOfByte = new byte[4096];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      this.out.write(arrayOfByte, 0, i);
    }
    this.out.write(CR_LF);
    this.out.flush();
    AsyncHttpClient.silentCloseOutputStream(this.out);
  }

  public void addPart(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      this.out.write(this.boundaryLine);
      this.out.write(createContentDisposition(paramString1));
      this.out.write(createContentType(paramString3));
      this.out.write(CR_LF);
      this.out.write(paramString2.getBytes());
      this.out.write(CR_LF);
      return;
    }
    catch (IOException localIOException)
    {
      Log.e("SimpleMultipartEntity", "addPart ByteArrayOutputStream exception", localIOException);
    }
  }

  public void addPartWithCharset(String paramString1, String paramString2, String paramString3)
  {
    if (paramString3 == null)
      paramString3 = "UTF-8";
    addPart(paramString1, paramString2, "text/plain; charset=" + paramString3);
  }

  public void consumeContent()
    throws IOException, UnsupportedOperationException
  {
    if (isStreaming())
      throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
  }

  public InputStream getContent()
    throws IOException, UnsupportedOperationException
  {
    throw new UnsupportedOperationException("getContent() is not supported. Use writeTo() instead.");
  }

  public Header getContentEncoding()
  {
    return null;
  }

  public long getContentLength()
  {
    long l1 = this.out.size();
    Iterator localIterator = this.fileParts.iterator();
    while (localIterator.hasNext())
    {
      long l2 = ((FilePart)localIterator.next()).getTotalLength();
      if (l2 < 0L)
        return -1L;
      l1 += l2;
    }
    return l1 + this.boundaryEnd.length;
  }

  public Header getContentType()
  {
    return new BasicHeader("Content-Type", "multipart/form-data; boundary=" + this.boundary);
  }

  public boolean isChunked()
  {
    return false;
  }

  public boolean isRepeatable()
  {
    return this.isRepeatable;
  }

  public boolean isStreaming()
  {
    return false;
  }

  public void setIsRepeatable(boolean paramBoolean)
  {
    this.isRepeatable = paramBoolean;
  }

  public void writeTo(OutputStream paramOutputStream)
    throws IOException
  {
    this.bytesWritten = 0;
    this.totalSize = (int)getContentLength();
    this.out.writeTo(paramOutputStream);
    updateProgress(this.out.size());
    Iterator localIterator = this.fileParts.iterator();
    while (localIterator.hasNext())
      ((FilePart)localIterator.next()).writeTo(paramOutputStream);
    paramOutputStream.write(this.boundaryEnd);
    updateProgress(this.boundaryEnd.length);
  }

  private class FilePart
  {
    public File file;
    public byte[] header;

    public FilePart(String paramFile, File paramString1, String arg4)
    {
      String str;
      this.header = createHeader(paramFile, paramString1.getName(), str);
      this.file = paramString1;
    }

    public FilePart(String paramFile, File paramString1, String paramString2, String arg5)
    {
      Object localObject;
      if (TextUtils.isEmpty((java.lang.CharSequence)localObject))
        localObject = paramString1.getName();
      this.header = createHeader(paramFile, (String)localObject, paramString2);
      this.file = paramString1;
    }

    private byte[] createHeader(String paramString1, String paramString2, String paramString3)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      try
      {
        localByteArrayOutputStream.write(SimpleMultipartEntity.this.boundaryLine);
        localByteArrayOutputStream.write(SimpleMultipartEntity.this.createContentDisposition(paramString1, paramString2));
        localByteArrayOutputStream.write(SimpleMultipartEntity.this.createContentType(paramString3));
        localByteArrayOutputStream.write(SimpleMultipartEntity.TRANSFER_ENCODING_BINARY);
        localByteArrayOutputStream.write(SimpleMultipartEntity.CR_LF);
        return localByteArrayOutputStream.toByteArray();
      }
      catch (IOException localIOException)
      {
        while (true)
          Log.e("SimpleMultipartEntity", "createHeader ByteArrayOutputStream exception", localIOException);
      }
    }

    public long getTotalLength()
    {
      return this.file.length() + SimpleMultipartEntity.CR_LF.length + this.header.length;
    }

    public void writeTo(OutputStream paramOutputStream)
      throws IOException
    {
      paramOutputStream.write(this.header);
      SimpleMultipartEntity.this.updateProgress(this.header.length);
      FileInputStream localFileInputStream = new FileInputStream(this.file);
      byte[] arrayOfByte = new byte[4096];
      while (true)
      {
        int i = localFileInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        paramOutputStream.write(arrayOfByte, 0, i);
        SimpleMultipartEntity.this.updateProgress(i);
      }
      paramOutputStream.write(SimpleMultipartEntity.CR_LF);
      SimpleMultipartEntity.this.updateProgress(SimpleMultipartEntity.CR_LF.length);
      paramOutputStream.flush();
      AsyncHttpClient.silentCloseInputStream(localFileInputStream);
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.SimpleMultipartEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */