package com.loopj.android.http;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class RequestParams
  implements Serializable
{
  public static final String APPLICATION_JSON = "application/json";
  public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";
  protected static final String LOG_TAG = "RequestParams";
  protected boolean autoCloseInputStreams;
  protected String contentEncoding = "UTF-8";
  protected final ConcurrentHashMap<String, FileWrapper> fileParams = new ConcurrentHashMap();
  protected boolean isRepeatable;
  protected final ConcurrentHashMap<String, StreamWrapper> streamParams = new ConcurrentHashMap();
  protected final ConcurrentHashMap<String, String> urlParams = new ConcurrentHashMap();
  protected final ConcurrentHashMap<String, Object> urlParamsWithObjects = new ConcurrentHashMap();
  protected boolean useJsonStreamer;

  public RequestParams()
  {
    this((Map)null);
  }

  public RequestParams(String paramString1, final String paramString2)
  {
    this(new HashMap()
    {
    });
  }

  public RequestParams(Map<String, String> paramMap)
  {
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        put((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
  }

  public RequestParams(Object[] paramArrayOfObject)
  {
    int i = paramArrayOfObject.length;
    if (i % 2 != 0)
      throw new IllegalArgumentException("Supplied arguments must be even");
    for (int j = 0; j < i; j += 2)
      put(String.valueOf(paramArrayOfObject[j]), String.valueOf(paramArrayOfObject[(j + 1)]));
  }

  private HttpEntity createFormEntity()
  {
    try
    {
      UrlEncodedFormEntity localUrlEncodedFormEntity = new UrlEncodedFormEntity(getParamsList(), this.contentEncoding);
      return localUrlEncodedFormEntity;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Log.e("RequestParams", "createFormEntity failed", localUnsupportedEncodingException);
    }
    return null;
  }

  private HttpEntity createJsonStreamerEntity(ResponseHandlerInterface paramResponseHandlerInterface)
    throws IOException
  {
    if ((!this.fileParams.isEmpty()) || (!this.streamParams.isEmpty()));
    JsonStreamerEntity localJsonStreamerEntity;
    for (boolean bool = true; ; bool = false)
    {
      localJsonStreamerEntity = new JsonStreamerEntity(paramResponseHandlerInterface, bool);
      Iterator localIterator1 = this.urlParams.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry4 = (Map.Entry)localIterator1.next();
        localJsonStreamerEntity.addPart((String)localEntry4.getKey(), localEntry4.getValue());
      }
    }
    Iterator localIterator2 = this.urlParamsWithObjects.entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry3 = (Map.Entry)localIterator2.next();
      localJsonStreamerEntity.addPart((String)localEntry3.getKey(), localEntry3.getValue());
    }
    Iterator localIterator3 = this.fileParams.entrySet().iterator();
    while (localIterator3.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator3.next();
      localJsonStreamerEntity.addPart((String)localEntry2.getKey(), localEntry2.getValue());
    }
    Iterator localIterator4 = this.streamParams.entrySet().iterator();
    while (localIterator4.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator4.next();
      StreamWrapper localStreamWrapper = (StreamWrapper)localEntry1.getValue();
      if (localStreamWrapper.inputStream != null)
        localJsonStreamerEntity.addPart((String)localEntry1.getKey(), StreamWrapper.newInstance(localStreamWrapper.inputStream, localStreamWrapper.name, localStreamWrapper.contentType, localStreamWrapper.autoClose));
    }
    return localJsonStreamerEntity;
  }

  private HttpEntity createMultipartEntity(ResponseHandlerInterface paramResponseHandlerInterface)
    throws IOException
  {
    SimpleMultipartEntity localSimpleMultipartEntity = new SimpleMultipartEntity(paramResponseHandlerInterface);
    localSimpleMultipartEntity.setIsRepeatable(this.isRepeatable);
    Iterator localIterator1 = this.urlParams.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry3 = (Map.Entry)localIterator1.next();
      localSimpleMultipartEntity.addPartWithCharset((String)localEntry3.getKey(), (String)localEntry3.getValue(), this.contentEncoding);
    }
    Iterator localIterator2 = getParamsList(null, this.urlParamsWithObjects).iterator();
    while (localIterator2.hasNext())
    {
      BasicNameValuePair localBasicNameValuePair = (BasicNameValuePair)localIterator2.next();
      localSimpleMultipartEntity.addPartWithCharset(localBasicNameValuePair.getName(), localBasicNameValuePair.getValue(), this.contentEncoding);
    }
    Iterator localIterator3 = this.streamParams.entrySet().iterator();
    while (localIterator3.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator3.next();
      StreamWrapper localStreamWrapper = (StreamWrapper)localEntry2.getValue();
      if (localStreamWrapper.inputStream != null)
        localSimpleMultipartEntity.addPart((String)localEntry2.getKey(), localStreamWrapper.name, localStreamWrapper.inputStream, localStreamWrapper.contentType);
    }
    Iterator localIterator4 = this.fileParams.entrySet().iterator();
    while (localIterator4.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator4.next();
      FileWrapper localFileWrapper = (FileWrapper)localEntry1.getValue();
      localSimpleMultipartEntity.addPart((String)localEntry1.getKey(), localFileWrapper.file, localFileWrapper.contentType, localFileWrapper.customFileName);
    }
    return localSimpleMultipartEntity;
  }

  private List<BasicNameValuePair> getParamsList(String paramString, Object paramObject)
  {
    LinkedList localLinkedList = new LinkedList();
    if ((paramObject instanceof Map))
    {
      Map localMap = (Map)paramObject;
      ArrayList localArrayList = new ArrayList(localMap.keySet());
      if ((localArrayList.size() > 0) && ((localArrayList.get(0) instanceof Comparable)))
        Collections.sort(localArrayList);
      Iterator localIterator2 = localArrayList.iterator();
      Object localObject1;
      Object localObject2;
      do
      {
        do
        {
          if (!localIterator2.hasNext())
            break;
          localObject1 = localIterator2.next();
        }
        while (!(localObject1 instanceof String));
        localObject2 = localMap.get(localObject1);
      }
      while (localObject2 == null);
      if (paramString == null);
      for (String str = (String)localObject1; ; str = String.format("%s[%s]", new Object[] { paramString, localObject1 }))
      {
        localLinkedList.addAll(getParamsList(str, localObject2));
        break;
      }
    }
    if ((paramObject instanceof List))
    {
      List localList = (List)paramObject;
      int k = localList.size();
      for (int m = 0; m < k; m++)
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = paramString;
        arrayOfObject3[1] = Integer.valueOf(m);
        localLinkedList.addAll(getParamsList(String.format("%s[%d]", arrayOfObject3), localList.get(m)));
      }
    }
    if ((paramObject instanceof Object[]))
    {
      Object[] arrayOfObject1 = (Object[])paramObject;
      int i = arrayOfObject1.length;
      for (int j = 0; j < i; j++)
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = paramString;
        arrayOfObject2[1] = Integer.valueOf(j);
        localLinkedList.addAll(getParamsList(String.format("%s[%d]", arrayOfObject2), arrayOfObject1[j]));
      }
    }
    if ((paramObject instanceof Set))
    {
      Iterator localIterator1 = ((Set)paramObject).iterator();
      while (localIterator1.hasNext())
        localLinkedList.addAll(getParamsList(paramString, localIterator1.next()));
    }
    localLinkedList.add(new BasicNameValuePair(paramString, paramObject.toString()));
    return localLinkedList;
  }

  public void add(String paramString1, String paramString2)
  {
    Object localObject;
    if ((paramString1 != null) && (paramString2 != null))
    {
      localObject = this.urlParamsWithObjects.get(paramString1);
      if (localObject == null)
      {
        localObject = new HashSet();
        put(paramString1, localObject);
      }
      if (!(localObject instanceof List))
        break label54;
      ((List)localObject).add(paramString2);
    }
    label54: 
    while (!(localObject instanceof Set))
      return;
    ((Set)localObject).add(paramString2);
  }

  public HttpEntity getEntity(ResponseHandlerInterface paramResponseHandlerInterface)
    throws IOException
  {
    if (this.useJsonStreamer)
      return createJsonStreamerEntity(paramResponseHandlerInterface);
    if ((this.streamParams.isEmpty()) && (this.fileParams.isEmpty()))
      return createFormEntity();
    return createMultipartEntity(paramResponseHandlerInterface);
  }

  protected String getParamString()
  {
    return URLEncodedUtils.format(getParamsList(), this.contentEncoding);
  }

  protected List<BasicNameValuePair> getParamsList()
  {
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.urlParams.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localLinkedList.add(new BasicNameValuePair((String)localEntry.getKey(), (String)localEntry.getValue()));
    }
    localLinkedList.addAll(getParamsList(null, this.urlParamsWithObjects));
    return localLinkedList;
  }

  public boolean has(String paramString)
  {
    return (this.urlParams.get(paramString) != null) || (this.streamParams.get(paramString) != null) || (this.fileParams.get(paramString) != null) || (this.urlParamsWithObjects.get(paramString) != null);
  }

  public void put(String paramString, int paramInt)
  {
    if (paramString != null)
      this.urlParams.put(paramString, String.valueOf(paramInt));
  }

  public void put(String paramString, long paramLong)
  {
    if (paramString != null)
      this.urlParams.put(paramString, String.valueOf(paramLong));
  }

  public void put(String paramString, File paramFile)
    throws FileNotFoundException
  {
    put(paramString, paramFile, null, null);
  }

  public void put(String paramString1, File paramFile, String paramString2)
    throws FileNotFoundException
  {
    put(paramString1, paramFile, paramString2, null);
  }

  public void put(String paramString1, File paramFile, String paramString2, String paramString3)
    throws FileNotFoundException
  {
    if ((paramFile == null) || (!paramFile.exists()))
      throw new FileNotFoundException();
    if (paramString1 != null)
      this.fileParams.put(paramString1, new FileWrapper(paramFile, paramString2, paramString3));
  }

  public void put(String paramString, InputStream paramInputStream)
  {
    put(paramString, paramInputStream, null);
  }

  public void put(String paramString1, InputStream paramInputStream, String paramString2)
  {
    put(paramString1, paramInputStream, paramString2, null);
  }

  public void put(String paramString1, InputStream paramInputStream, String paramString2, String paramString3)
  {
    put(paramString1, paramInputStream, paramString2, paramString3, this.autoCloseInputStreams);
  }

  public void put(String paramString1, InputStream paramInputStream, String paramString2, String paramString3, boolean paramBoolean)
  {
    if ((paramString1 != null) && (paramInputStream != null))
      this.streamParams.put(paramString1, StreamWrapper.newInstance(paramInputStream, paramString2, paramString3, paramBoolean));
  }

  public void put(String paramString, Object paramObject)
  {
    if ((paramString != null) && (paramObject != null))
      this.urlParamsWithObjects.put(paramString, paramObject);
  }

  public void put(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null))
      this.urlParams.put(paramString1, paramString2);
  }

  public void put(String paramString1, String paramString2, File paramFile)
    throws FileNotFoundException
  {
    put(paramString1, paramFile, null, paramString2);
  }

  public void remove(String paramString)
  {
    this.urlParams.remove(paramString);
    this.streamParams.remove(paramString);
    this.fileParams.remove(paramString);
    this.urlParamsWithObjects.remove(paramString);
  }

  public void setAutoCloseInputStreams(boolean paramBoolean)
  {
    this.autoCloseInputStreams = paramBoolean;
  }

  public void setContentEncoding(String paramString)
  {
    if (paramString != null)
    {
      this.contentEncoding = paramString;
      return;
    }
    Log.d("RequestParams", "setContentEncoding called with null attribute");
  }

  public void setHttpEntityIsRepeatable(boolean paramBoolean)
  {
    this.isRepeatable = paramBoolean;
  }

  public void setUseJsonStreamer(boolean paramBoolean)
  {
    this.useJsonStreamer = paramBoolean;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = this.urlParams.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry3 = (Map.Entry)localIterator1.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("&");
      localStringBuilder.append((String)localEntry3.getKey());
      localStringBuilder.append("=");
      localStringBuilder.append((String)localEntry3.getValue());
    }
    Iterator localIterator2 = this.streamParams.entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator2.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("&");
      localStringBuilder.append((String)localEntry2.getKey());
      localStringBuilder.append("=");
      localStringBuilder.append("STREAM");
    }
    Iterator localIterator3 = this.fileParams.entrySet().iterator();
    while (localIterator3.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator3.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("&");
      localStringBuilder.append((String)localEntry1.getKey());
      localStringBuilder.append("=");
      localStringBuilder.append("FILE");
    }
    Iterator localIterator4 = getParamsList(null, this.urlParamsWithObjects).iterator();
    while (localIterator4.hasNext())
    {
      BasicNameValuePair localBasicNameValuePair = (BasicNameValuePair)localIterator4.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("&");
      localStringBuilder.append(localBasicNameValuePair.getName());
      localStringBuilder.append("=");
      localStringBuilder.append(localBasicNameValuePair.getValue());
    }
    return localStringBuilder.toString();
  }

  public static class FileWrapper
  {
    public final String contentType;
    public final String customFileName;
    public final File file;

    public FileWrapper(File paramFile, String paramString1, String paramString2)
    {
      this.file = paramFile;
      this.contentType = paramString1;
      this.customFileName = paramString2;
    }
  }

  public static class StreamWrapper
  {
    public final boolean autoClose;
    public final String contentType;
    public final InputStream inputStream;
    public final String name;

    public StreamWrapper(InputStream paramInputStream, String paramString1, String paramString2, boolean paramBoolean)
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
}

/* Location:
 * Qualified Name:     com.loopj.android.http.RequestParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */