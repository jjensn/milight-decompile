package com.loopj.android.http;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.SyncBasicHttpContext;

public class AsyncHttpClient
{
  public static final int DEFAULT_MAX_CONNECTIONS = 10;
  public static final int DEFAULT_MAX_RETRIES = 5;
  public static final int DEFAULT_RETRY_SLEEP_TIME_MILLIS = 1500;
  public static final int DEFAULT_SOCKET_BUFFER_SIZE = 8192;
  public static final int DEFAULT_SOCKET_TIMEOUT = 10000;
  public static final String ENCODING_GZIP = "gzip";
  public static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
  public static final String HEADER_CONTENT_DISPOSITION = "Content-Disposition";
  public static final String HEADER_CONTENT_ENCODING = "Content-Encoding";
  public static final String HEADER_CONTENT_RANGE = "Content-Range";
  public static final String HEADER_CONTENT_TYPE = "Content-Type";
  public static final String LOG_TAG = "AsyncHttpClient";
  private final Map<String, String> clientHeaderMap;
  private int connectTimeout = 10000;
  private final DefaultHttpClient httpClient;
  private final HttpContext httpContext;
  private boolean isUrlEncodingEnabled = true;
  private int maxConnections = 10;
  private final Map<Context, List<RequestHandle>> requestMap;
  private int responseTimeout = 10000;
  private ExecutorService threadPool;

  public AsyncHttpClient()
  {
    this(false, 80, 443);
  }

  public AsyncHttpClient(int paramInt)
  {
    this(false, paramInt, 443);
  }

  public AsyncHttpClient(int paramInt1, int paramInt2)
  {
    this(false, paramInt1, paramInt2);
  }

  public AsyncHttpClient(SchemeRegistry paramSchemeRegistry)
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    ConnManagerParams.setTimeout(localBasicHttpParams, this.connectTimeout);
    ConnManagerParams.setMaxConnectionsPerRoute(localBasicHttpParams, new ConnPerRouteBean(this.maxConnections));
    ConnManagerParams.setMaxTotalConnections(localBasicHttpParams, 10);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, this.responseTimeout);
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, this.connectTimeout);
    HttpConnectionParams.setTcpNoDelay(localBasicHttpParams, true);
    HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 8192);
    HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
    ThreadSafeClientConnManager localThreadSafeClientConnManager = new ThreadSafeClientConnManager(localBasicHttpParams, paramSchemeRegistry);
    this.threadPool = getDefaultThreadPool();
    this.requestMap = Collections.synchronizedMap(new WeakHashMap());
    this.clientHeaderMap = new HashMap();
    this.httpContext = new SyncBasicHttpContext(new BasicHttpContext());
    this.httpClient = new DefaultHttpClient(localThreadSafeClientConnManager, localBasicHttpParams);
    this.httpClient.addRequestInterceptor(new HttpRequestInterceptor()
    {
      public void process(HttpRequest paramAnonymousHttpRequest, HttpContext paramAnonymousHttpContext)
      {
        if (!paramAnonymousHttpRequest.containsHeader("Accept-Encoding"))
          paramAnonymousHttpRequest.addHeader("Accept-Encoding", "gzip");
        Iterator localIterator = AsyncHttpClient.this.clientHeaderMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (paramAnonymousHttpRequest.containsHeader(str))
          {
            Header localHeader = paramAnonymousHttpRequest.getFirstHeader(str);
            Object[] arrayOfObject = new Object[4];
            arrayOfObject[0] = str;
            arrayOfObject[1] = AsyncHttpClient.this.clientHeaderMap.get(str);
            arrayOfObject[2] = localHeader.getName();
            arrayOfObject[3] = localHeader.getValue();
            Log.d("AsyncHttpClient", String.format("Headers were overwritten! (%s | %s) overwrites (%s | %s)", arrayOfObject));
            paramAnonymousHttpRequest.removeHeader(localHeader);
          }
          paramAnonymousHttpRequest.addHeader(str, (String)AsyncHttpClient.this.clientHeaderMap.get(str));
        }
      }
    });
    this.httpClient.addResponseInterceptor(new HttpResponseInterceptor()
    {
      public void process(HttpResponse paramAnonymousHttpResponse, HttpContext paramAnonymousHttpContext)
      {
        HttpEntity localHttpEntity = paramAnonymousHttpResponse.getEntity();
        if (localHttpEntity == null);
        while (true)
        {
          return;
          Header localHeader = localHttpEntity.getContentEncoding();
          if (localHeader != null)
          {
            HeaderElement[] arrayOfHeaderElement = localHeader.getElements();
            int i = arrayOfHeaderElement.length;
            for (int j = 0; j < i; j++)
              if (arrayOfHeaderElement[j].getName().equalsIgnoreCase("gzip"))
              {
                paramAnonymousHttpResponse.setEntity(new AsyncHttpClient.InflatingEntity(localHttpEntity));
                return;
              }
          }
        }
      }
    });
    this.httpClient.addRequestInterceptor(new HttpRequestInterceptor()
    {
      public void process(HttpRequest paramAnonymousHttpRequest, HttpContext paramAnonymousHttpContext)
        throws HttpException, IOException
      {
        AuthState localAuthState = (AuthState)paramAnonymousHttpContext.getAttribute("http.auth.target-scope");
        CredentialsProvider localCredentialsProvider = (CredentialsProvider)paramAnonymousHttpContext.getAttribute("http.auth.credentials-provider");
        HttpHost localHttpHost = (HttpHost)paramAnonymousHttpContext.getAttribute("http.target_host");
        if (localAuthState.getAuthScheme() == null)
        {
          Credentials localCredentials = localCredentialsProvider.getCredentials(new AuthScope(localHttpHost.getHostName(), localHttpHost.getPort()));
          if (localCredentials != null)
          {
            localAuthState.setAuthScheme(new BasicScheme());
            localAuthState.setCredentials(localCredentials);
          }
        }
      }
    }
    , 0);
    this.httpClient.setHttpRequestRetryHandler(new RetryHandler(5, 1500));
  }

  public AsyncHttpClient(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this(getDefaultSchemeRegistry(paramBoolean, paramInt1, paramInt2));
  }

  private HttpEntityEnclosingRequestBase addEntityToRequestBase(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, HttpEntity paramHttpEntity)
  {
    if (paramHttpEntity != null)
      paramHttpEntityEnclosingRequestBase.setEntity(paramHttpEntity);
    return paramHttpEntityEnclosingRequestBase;
  }

  public static void allowRetryExceptionClass(Class<?> paramClass)
  {
    if (paramClass != null)
      RetryHandler.addClassToWhitelist(paramClass);
  }

  public static void blockRetryExceptionClass(Class<?> paramClass)
  {
    if (paramClass != null)
      RetryHandler.addClassToBlacklist(paramClass);
  }

  public static void endEntityViaReflection(HttpEntity paramHttpEntity)
  {
    if ((paramHttpEntity instanceof HttpEntityWrapper))
      try
      {
        Field[] arrayOfField = HttpEntityWrapper.class.getDeclaredFields();
        int i = arrayOfField.length;
        for (int j = 0; ; j++)
        {
          Object localObject = null;
          if (j < i)
          {
            Field localField = arrayOfField[j];
            if (localField.getName().equals("wrappedEntity"))
              localObject = localField;
          }
          else
          {
            if (localObject != null)
            {
              localObject.setAccessible(true);
              HttpEntity localHttpEntity = (HttpEntity)localObject.get(paramHttpEntity);
              if (localHttpEntity != null)
                localHttpEntity.consumeContent();
            }
            return;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        Log.e("AsyncHttpClient", "wrappedEntity consume", localThrowable);
      }
  }

  private static SchemeRegistry getDefaultSchemeRegistry(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramBoolean)
      Log.d("AsyncHttpClient", "Beware! Using the fix is insecure, as it doesn't verify SSL certificates.");
    if (paramInt1 < 1)
    {
      paramInt1 = 80;
      Log.d("AsyncHttpClient", "Invalid HTTP port number specified, defaulting to 80");
    }
    if (paramInt2 < 1)
    {
      paramInt2 = 443;
      Log.d("AsyncHttpClient", "Invalid HTTPS port number specified, defaulting to 443");
    }
    if (paramBoolean);
    for (SSLSocketFactory localSSLSocketFactory = MySSLSocketFactory.getFixedSocketFactory(); ; localSSLSocketFactory = SSLSocketFactory.getSocketFactory())
    {
      SchemeRegistry localSchemeRegistry = new SchemeRegistry();
      localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), paramInt1));
      localSchemeRegistry.register(new Scheme("https", localSSLSocketFactory, paramInt2));
      return localSchemeRegistry;
    }
  }

  public static String getUrlWithQueryString(boolean paramBoolean, String paramString, RequestParams paramRequestParams)
  {
    if (paramString == null)
      return null;
    if (paramBoolean)
      paramString = paramString.replace(" ", "%20");
    String str1;
    StringBuilder localStringBuilder;
    if (paramRequestParams != null)
    {
      str1 = paramRequestParams.getParamString().trim();
      if ((!str1.equals("")) && (!str1.equals("?")))
      {
        localStringBuilder = new StringBuilder().append(paramString);
        if (!paramString.contains("?"))
          break label115;
      }
    }
    label115: for (String str2 = "&"; ; str2 = "?")
    {
      String str3 = str2;
      paramString = str3 + str1;
      return paramString;
    }
  }

  public static boolean isInputStreamGZIPCompressed(PushbackInputStream paramPushbackInputStream)
    throws IOException
  {
    boolean bool = true;
    if (paramPushbackInputStream == null)
      return false;
    byte[] arrayOfByte = new byte[2];
    int i = paramPushbackInputStream.read(arrayOfByte);
    paramPushbackInputStream.unread(arrayOfByte);
    int j = 0xFF & arrayOfByte[0] | 0xFF00 & arrayOfByte[bool] << 8;
    if ((i == 2) && (35615 == j));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private HttpEntity paramsToEntity(RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    Object localObject = null;
    if (paramRequestParams != null)
      try
      {
        HttpEntity localHttpEntity = paramRequestParams.getEntity(paramResponseHandlerInterface);
        localObject = localHttpEntity;
        return localObject;
      }
      catch (IOException localIOException)
      {
        if (paramResponseHandlerInterface != null)
        {
          paramResponseHandlerInterface.sendFailureMessage(0, null, null, localIOException);
          return null;
        }
        localIOException.printStackTrace();
      }
    return null;
  }

  public static void silentCloseInputStream(InputStream paramInputStream)
  {
    if (paramInputStream != null);
    try
    {
      paramInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      Log.w("AsyncHttpClient", "Cannot close input stream", localIOException);
    }
  }

  public static void silentCloseOutputStream(OutputStream paramOutputStream)
  {
    if (paramOutputStream != null);
    try
    {
      paramOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      Log.w("AsyncHttpClient", "Cannot close output stream", localIOException);
    }
  }

  public void addHeader(String paramString1, String paramString2)
  {
    this.clientHeaderMap.put(paramString1, paramString2);
  }

  public void cancelAllRequests(boolean paramBoolean)
  {
    Iterator localIterator1 = this.requestMap.values().iterator();
    while (localIterator1.hasNext())
    {
      List localList = (List)localIterator1.next();
      if (localList != null)
      {
        Iterator localIterator2 = localList.iterator();
        while (localIterator2.hasNext())
          ((RequestHandle)localIterator2.next()).cancel(paramBoolean);
      }
    }
    this.requestMap.clear();
  }

  public void cancelRequests(final Context paramContext, final boolean paramBoolean)
  {
    if (paramContext == null)
    {
      Log.e("AsyncHttpClient", "Passed null Context to cancelRequests");
      return;
    }
    Runnable local4 = new Runnable()
    {
      public void run()
      {
        List localList = (List)AsyncHttpClient.this.requestMap.get(paramContext);
        if (localList != null)
        {
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
            ((RequestHandle)localIterator.next()).cancel(paramBoolean);
          AsyncHttpClient.this.requestMap.remove(paramContext);
        }
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      new Thread(local4).start();
      return;
    }
    local4.run();
  }

  @Deprecated
  public void clearBasicAuth()
  {
    clearCredentialsProvider();
  }

  public void clearCredentialsProvider()
  {
    this.httpClient.getCredentialsProvider().clear();
  }

  public RequestHandle delete(Context paramContext, String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpDelete localHttpDelete = new HttpDelete(URI.create(paramString).normalize());
    return sendRequest(this.httpClient, this.httpContext, localHttpDelete, null, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle delete(Context paramContext, String paramString, Header[] paramArrayOfHeader, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpDelete localHttpDelete = new HttpDelete(getUrlWithQueryString(this.isUrlEncodingEnabled, paramString, paramRequestParams));
    if (paramArrayOfHeader != null)
      localHttpDelete.setHeaders(paramArrayOfHeader);
    return sendRequest(this.httpClient, this.httpContext, localHttpDelete, null, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle delete(Context paramContext, String paramString, Header[] paramArrayOfHeader, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpDelete localHttpDelete = new HttpDelete(URI.create(paramString).normalize());
    if (paramArrayOfHeader != null)
      localHttpDelete.setHeaders(paramArrayOfHeader);
    return sendRequest(this.httpClient, this.httpContext, localHttpDelete, null, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle delete(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return delete(null, paramString, paramResponseHandlerInterface);
  }

  public RequestHandle get(Context paramContext, String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return sendRequest(this.httpClient, this.httpContext, new HttpGet(getUrlWithQueryString(this.isUrlEncodingEnabled, paramString, paramRequestParams)), null, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle get(Context paramContext, String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return get(paramContext, paramString, null, paramResponseHandlerInterface);
  }

  public RequestHandle get(Context paramContext, String paramString, Header[] paramArrayOfHeader, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpGet localHttpGet = new HttpGet(getUrlWithQueryString(this.isUrlEncodingEnabled, paramString, paramRequestParams));
    if (paramArrayOfHeader != null)
      localHttpGet.setHeaders(paramArrayOfHeader);
    return sendRequest(this.httpClient, this.httpContext, localHttpGet, null, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle get(String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return get(null, paramString, paramRequestParams, paramResponseHandlerInterface);
  }

  public RequestHandle get(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return get(null, paramString, null, paramResponseHandlerInterface);
  }

  public int getConnectTimeout()
  {
    return this.connectTimeout;
  }

  protected ExecutorService getDefaultThreadPool()
  {
    return Executors.newCachedThreadPool();
  }

  public HttpClient getHttpClient()
  {
    return this.httpClient;
  }

  public HttpContext getHttpContext()
  {
    return this.httpContext;
  }

  public int getMaxConnections()
  {
    return this.maxConnections;
  }

  public int getResponseTimeout()
  {
    return this.responseTimeout;
  }

  public ExecutorService getThreadPool()
  {
    return this.threadPool;
  }

  public int getTimeout()
  {
    return this.connectTimeout;
  }

  public RequestHandle head(Context paramContext, String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return sendRequest(this.httpClient, this.httpContext, new HttpHead(getUrlWithQueryString(this.isUrlEncodingEnabled, paramString, paramRequestParams)), null, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle head(Context paramContext, String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return head(paramContext, paramString, null, paramResponseHandlerInterface);
  }

  public RequestHandle head(Context paramContext, String paramString, Header[] paramArrayOfHeader, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpHead localHttpHead = new HttpHead(getUrlWithQueryString(this.isUrlEncodingEnabled, paramString, paramRequestParams));
    if (paramArrayOfHeader != null)
      localHttpHead.setHeaders(paramArrayOfHeader);
    return sendRequest(this.httpClient, this.httpContext, localHttpHead, null, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle head(String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return head(null, paramString, paramRequestParams, paramResponseHandlerInterface);
  }

  public RequestHandle head(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return head(null, paramString, null, paramResponseHandlerInterface);
  }

  public boolean isUrlEncodingEnabled()
  {
    return this.isUrlEncodingEnabled;
  }

  protected AsyncHttpRequest newAsyncHttpRequest(DefaultHttpClient paramDefaultHttpClient, HttpContext paramHttpContext, HttpUriRequest paramHttpUriRequest, String paramString, ResponseHandlerInterface paramResponseHandlerInterface, Context paramContext)
  {
    return new AsyncHttpRequest(paramDefaultHttpClient, paramHttpContext, paramHttpUriRequest, paramResponseHandlerInterface);
  }

  public RequestHandle post(Context paramContext, String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return post(paramContext, paramString, paramsToEntity(paramRequestParams, paramResponseHandlerInterface), null, paramResponseHandlerInterface);
  }

  public RequestHandle post(Context paramContext, String paramString1, HttpEntity paramHttpEntity, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return sendRequest(this.httpClient, this.httpContext, addEntityToRequestBase(new HttpPost(URI.create(paramString1).normalize()), paramHttpEntity), paramString2, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle post(Context paramContext, String paramString1, Header[] paramArrayOfHeader, RequestParams paramRequestParams, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpPost localHttpPost = new HttpPost(URI.create(paramString1).normalize());
    if (paramRequestParams != null)
      localHttpPost.setEntity(paramsToEntity(paramRequestParams, paramResponseHandlerInterface));
    if (paramArrayOfHeader != null)
      localHttpPost.setHeaders(paramArrayOfHeader);
    return sendRequest(this.httpClient, this.httpContext, localHttpPost, paramString2, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle post(Context paramContext, String paramString1, Header[] paramArrayOfHeader, HttpEntity paramHttpEntity, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpEntityEnclosingRequestBase localHttpEntityEnclosingRequestBase = addEntityToRequestBase(new HttpPost(URI.create(paramString1).normalize()), paramHttpEntity);
    if (paramArrayOfHeader != null)
      localHttpEntityEnclosingRequestBase.setHeaders(paramArrayOfHeader);
    return sendRequest(this.httpClient, this.httpContext, localHttpEntityEnclosingRequestBase, paramString2, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle post(String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return post(null, paramString, paramRequestParams, paramResponseHandlerInterface);
  }

  public RequestHandle post(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return post(null, paramString, null, paramResponseHandlerInterface);
  }

  public RequestHandle put(Context paramContext, String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return put(paramContext, paramString, paramsToEntity(paramRequestParams, paramResponseHandlerInterface), null, paramResponseHandlerInterface);
  }

  public RequestHandle put(Context paramContext, String paramString1, HttpEntity paramHttpEntity, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return sendRequest(this.httpClient, this.httpContext, addEntityToRequestBase(new HttpPut(URI.create(paramString1).normalize()), paramHttpEntity), paramString2, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle put(Context paramContext, String paramString1, Header[] paramArrayOfHeader, HttpEntity paramHttpEntity, String paramString2, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    HttpEntityEnclosingRequestBase localHttpEntityEnclosingRequestBase = addEntityToRequestBase(new HttpPut(URI.create(paramString1).normalize()), paramHttpEntity);
    if (paramArrayOfHeader != null)
      localHttpEntityEnclosingRequestBase.setHeaders(paramArrayOfHeader);
    return sendRequest(this.httpClient, this.httpContext, localHttpEntityEnclosingRequestBase, paramString2, paramResponseHandlerInterface, paramContext);
  }

  public RequestHandle put(String paramString, RequestParams paramRequestParams, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return put(null, paramString, paramRequestParams, paramResponseHandlerInterface);
  }

  public RequestHandle put(String paramString, ResponseHandlerInterface paramResponseHandlerInterface)
  {
    return put(null, paramString, null, paramResponseHandlerInterface);
  }

  public void removeAllHeaders()
  {
    this.clientHeaderMap.clear();
  }

  public void removeHeader(String paramString)
  {
    this.clientHeaderMap.remove(paramString);
  }

  protected RequestHandle sendRequest(DefaultHttpClient paramDefaultHttpClient, HttpContext paramHttpContext, HttpUriRequest paramHttpUriRequest, String paramString, ResponseHandlerInterface paramResponseHandlerInterface, Context paramContext)
  {
    if (paramHttpUriRequest == null)
      throw new IllegalArgumentException("HttpUriRequest must not be null");
    if (paramResponseHandlerInterface == null)
      throw new IllegalArgumentException("ResponseHandler must not be null");
    if (paramResponseHandlerInterface.getUseSynchronousMode())
      throw new IllegalArgumentException("Synchronous ResponseHandler used in AsyncHttpClient. You should create your response handler in a looper thread or use SyncHttpClient instead.");
    RequestHandle localRequestHandle;
    List localList;
    Map localMap;
    if (paramString != null)
    {
      if (((paramHttpUriRequest instanceof HttpEntityEnclosingRequestBase)) && (((HttpEntityEnclosingRequestBase)paramHttpUriRequest).getEntity() != null))
        Log.w("AsyncHttpClient", "Passed contentType will be ignored because HttpEntity sets content type");
    }
    else
      while (true)
      {
        paramResponseHandlerInterface.setRequestHeaders(paramHttpUriRequest.getAllHeaders());
        paramResponseHandlerInterface.setRequestURI(paramHttpUriRequest.getURI());
        AsyncHttpRequest localAsyncHttpRequest = newAsyncHttpRequest(paramDefaultHttpClient, paramHttpContext, paramHttpUriRequest, paramString, paramResponseHandlerInterface, paramContext);
        this.threadPool.submit(localAsyncHttpRequest);
        localRequestHandle = new RequestHandle(localAsyncHttpRequest);
        if (paramContext != null)
        {
          localList = (List)this.requestMap.get(paramContext);
          localMap = this.requestMap;
          if (localList == null);
          try
          {
            localList = Collections.synchronizedList(new LinkedList());
            this.requestMap.put(paramContext, localList);
            if ((paramResponseHandlerInterface instanceof RangeFileAsyncHttpResponseHandler))
              ((RangeFileAsyncHttpResponseHandler)paramResponseHandlerInterface).updateRequestHeaders(paramHttpUriRequest);
            localList.add(localRequestHandle);
            Iterator localIterator = localList.iterator();
            while (true)
              if (localIterator.hasNext())
                if (((RequestHandle)localIterator.next()).shouldBeGarbageCollected())
                {
                  localIterator.remove();
                  continue;
                  paramHttpUriRequest.setHeader("Content-Type", paramString);
                  break;
                }
          }
          finally
          {
          }
        }
      }
    return localRequestHandle;
  }

  public void setAuthenticationPreemptive(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.httpClient.addRequestInterceptor(new PreemtiveAuthorizationHttpRequestInterceptor(), 0);
      return;
    }
    this.httpClient.removeRequestInterceptorByClass(PreemtiveAuthorizationHttpRequestInterceptor.class);
  }

  public void setBasicAuth(String paramString1, String paramString2)
  {
    setBasicAuth(paramString1, paramString2, false);
  }

  public void setBasicAuth(String paramString1, String paramString2, AuthScope paramAuthScope)
  {
    setBasicAuth(paramString1, paramString2, paramAuthScope, false);
  }

  public void setBasicAuth(String paramString1, String paramString2, AuthScope paramAuthScope, boolean paramBoolean)
  {
    setCredentials(paramAuthScope, new UsernamePasswordCredentials(paramString1, paramString2));
    setAuthenticationPreemptive(paramBoolean);
  }

  public void setBasicAuth(String paramString1, String paramString2, boolean paramBoolean)
  {
    setBasicAuth(paramString1, paramString2, null, paramBoolean);
  }

  public void setConnectTimeout(int paramInt)
  {
    if (paramInt < 1000)
      paramInt = 10000;
    this.connectTimeout = paramInt;
    HttpParams localHttpParams = this.httpClient.getParams();
    ConnManagerParams.setTimeout(localHttpParams, this.connectTimeout);
    HttpConnectionParams.setConnectionTimeout(localHttpParams, this.connectTimeout);
  }

  public void setCookieStore(CookieStore paramCookieStore)
  {
    this.httpContext.setAttribute("http.cookie-store", paramCookieStore);
  }

  public void setCredentials(AuthScope paramAuthScope, Credentials paramCredentials)
  {
    if (paramCredentials == null)
    {
      Log.d("AsyncHttpClient", "Provided credentials are null, not setting");
      return;
    }
    CredentialsProvider localCredentialsProvider = this.httpClient.getCredentialsProvider();
    if (paramAuthScope == null)
      paramAuthScope = AuthScope.ANY;
    localCredentialsProvider.setCredentials(paramAuthScope, paramCredentials);
  }

  public void setEnableRedirects(boolean paramBoolean)
  {
    setEnableRedirects(paramBoolean, paramBoolean, paramBoolean);
  }

  public void setEnableRedirects(boolean paramBoolean1, boolean paramBoolean2)
  {
    setEnableRedirects(paramBoolean1, paramBoolean2, true);
  }

  public void setEnableRedirects(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    HttpParams localHttpParams = this.httpClient.getParams();
    if (!paramBoolean2);
    for (boolean bool = true; ; bool = false)
    {
      localHttpParams.setBooleanParameter("http.protocol.reject-relative-redirect", bool);
      this.httpClient.getParams().setBooleanParameter("http.protocol.allow-circular-redirects", paramBoolean3);
      this.httpClient.setRedirectHandler(new MyRedirectHandler(paramBoolean1));
      return;
    }
  }

  public void setMaxConnections(int paramInt)
  {
    if (paramInt < 1)
      paramInt = 10;
    this.maxConnections = paramInt;
    ConnManagerParams.setMaxConnectionsPerRoute(this.httpClient.getParams(), new ConnPerRouteBean(this.maxConnections));
  }

  public void setMaxRetriesAndTimeout(int paramInt1, int paramInt2)
  {
    this.httpClient.setHttpRequestRetryHandler(new RetryHandler(paramInt1, paramInt2));
  }

  public void setProxy(String paramString, int paramInt)
  {
    HttpHost localHttpHost = new HttpHost(paramString, paramInt);
    this.httpClient.getParams().setParameter("http.route.default-proxy", localHttpHost);
  }

  public void setProxy(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    this.httpClient.getCredentialsProvider().setCredentials(new AuthScope(paramString1, paramInt), new UsernamePasswordCredentials(paramString2, paramString3));
    HttpHost localHttpHost = new HttpHost(paramString1, paramInt);
    this.httpClient.getParams().setParameter("http.route.default-proxy", localHttpHost);
  }

  public void setRedirectHandler(RedirectHandler paramRedirectHandler)
  {
    this.httpClient.setRedirectHandler(paramRedirectHandler);
  }

  public void setResponseTimeout(int paramInt)
  {
    if (paramInt < 1000)
      paramInt = 10000;
    this.responseTimeout = paramInt;
    HttpConnectionParams.setSoTimeout(this.httpClient.getParams(), this.responseTimeout);
  }

  public void setSSLSocketFactory(SSLSocketFactory paramSSLSocketFactory)
  {
    this.httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", paramSSLSocketFactory, 443));
  }

  public void setThreadPool(ExecutorService paramExecutorService)
  {
    this.threadPool = paramExecutorService;
  }

  public void setTimeout(int paramInt)
  {
    if (paramInt < 1000)
      paramInt = 10000;
    setConnectTimeout(paramInt);
    setResponseTimeout(paramInt);
  }

  public void setURLEncodingEnabled(boolean paramBoolean)
  {
    this.isUrlEncodingEnabled = paramBoolean;
  }

  public void setUserAgent(String paramString)
  {
    HttpProtocolParams.setUserAgent(this.httpClient.getParams(), paramString);
  }

  private static class InflatingEntity extends HttpEntityWrapper
  {
    GZIPInputStream gzippedStream;
    PushbackInputStream pushbackStream;
    InputStream wrappedStream;

    public InflatingEntity(HttpEntity paramHttpEntity)
    {
      super();
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
}

/* Location:
 * Qualified Name:     com.loopj.android.http.AsyncHttpClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */