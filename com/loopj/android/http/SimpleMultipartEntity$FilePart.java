package com.loopj.android.http;

import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

class SimpleMultipartEntity$FilePart
{
  public File file;
  public byte[] header;

  public SimpleMultipartEntity$FilePart(SimpleMultipartEntity paramSimpleMultipartEntity, String paramString1, File paramFile, String paramString2)
  {
    this.header = createHeader(paramString1, paramFile.getName(), paramString2);
    this.file = paramFile;
  }

  public SimpleMultipartEntity$FilePart(SimpleMultipartEntity paramSimpleMultipartEntity, String paramString1, File paramFile, String paramString2, String paramString3)
  {
    if (TextUtils.isEmpty(paramString3))
      paramString3 = paramFile.getName();
    this.header = createHeader(paramString1, paramString3, paramString2);
    this.file = paramFile;
  }

  private byte[] createHeader(String paramString1, String paramString2, String paramString3)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      localByteArrayOutputStream.write(SimpleMultipartEntity.access$000(this.this$0));
      localByteArrayOutputStream.write(SimpleMultipartEntity.access$100(this.this$0, paramString1, paramString2));
      localByteArrayOutputStream.write(SimpleMultipartEntity.access$200(this.this$0, paramString3));
      localByteArrayOutputStream.write(SimpleMultipartEntity.access$300());
      localByteArrayOutputStream.write(SimpleMultipartEntity.access$400());
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
    return this.file.length() + SimpleMultipartEntity.access$400().length + this.header.length;
  }

  public void writeTo(OutputStream paramOutputStream)
    throws IOException
  {
    paramOutputStream.write(this.header);
    SimpleMultipartEntity.access$500(this.this$0, this.header.length);
    FileInputStream localFileInputStream = new FileInputStream(this.file);
    byte[] arrayOfByte = new byte[4096];
    while (true)
    {
      int i = localFileInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      paramOutputStream.write(arrayOfByte, 0, i);
      SimpleMultipartEntity.access$500(this.this$0, i);
    }
    paramOutputStream.write(SimpleMultipartEntity.access$400());
    SimpleMultipartEntity.access$500(this.this$0, SimpleMultipartEntity.access$400().length);
    paramOutputStream.flush();
    AsyncHttpClient.silentCloseInputStream(localFileInputStream);
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.SimpleMultipartEntity.FilePart
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */