package com.loopj.android.http;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.protocol.HttpContext;

class MyRedirectHandler extends DefaultRedirectHandler
{
  private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
  private final boolean enableRedirects;

  public MyRedirectHandler(boolean paramBoolean)
  {
    this.enableRedirects = paramBoolean;
  }

  // ERROR //
  public java.net.URI getLocationURI(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
    throws org.apache.http.ProtocolException
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +13 -> 14
    //   4: new 25	java/lang/IllegalArgumentException
    //   7: dup
    //   8: ldc 27
    //   10: invokespecial 30	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   13: athrow
    //   14: aload_1
    //   15: ldc 32
    //   17: invokeinterface 38 2 0
    //   22: astore_3
    //   23: aload_3
    //   24: ifnonnull +40 -> 64
    //   27: new 21	org/apache/http/ProtocolException
    //   30: dup
    //   31: new 40	java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial 41	java/lang/StringBuilder:<init>	()V
    //   38: ldc 43
    //   40: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: aload_1
    //   44: invokeinterface 51 1 0
    //   49: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   52: ldc 56
    //   54: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: invokespecial 61	org/apache/http/ProtocolException:<init>	(Ljava/lang/String;)V
    //   63: athrow
    //   64: aload_3
    //   65: invokeinterface 66 1 0
    //   70: ldc 68
    //   72: ldc 70
    //   74: invokevirtual 76	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   77: astore 4
    //   79: new 78	java/net/URI
    //   82: dup
    //   83: aload 4
    //   85: invokespecial 79	java/net/URI:<init>	(Ljava/lang/String;)V
    //   88: astore 5
    //   90: aload_1
    //   91: invokeinterface 83 1 0
    //   96: astore 6
    //   98: aload 5
    //   100: invokevirtual 87	java/net/URI:isAbsolute	()Z
    //   103: ifne +157 -> 260
    //   106: aload 6
    //   108: ldc 89
    //   110: invokeinterface 95 2 0
    //   115: ifeq +68 -> 183
    //   118: new 21	org/apache/http/ProtocolException
    //   121: dup
    //   122: new 40	java/lang/StringBuilder
    //   125: dup
    //   126: invokespecial 41	java/lang/StringBuilder:<init>	()V
    //   129: ldc 97
    //   131: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload 5
    //   136: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   139: ldc 99
    //   141: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: invokespecial 61	org/apache/http/ProtocolException:<init>	(Ljava/lang/String;)V
    //   150: athrow
    //   151: astore 15
    //   153: new 21	org/apache/http/ProtocolException
    //   156: dup
    //   157: new 40	java/lang/StringBuilder
    //   160: dup
    //   161: invokespecial 41	java/lang/StringBuilder:<init>	()V
    //   164: ldc 101
    //   166: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: aload 4
    //   171: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: aload 15
    //   179: invokespecial 104	org/apache/http/ProtocolException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   182: athrow
    //   183: aload_2
    //   184: ldc 106
    //   186: invokeinterface 112 2 0
    //   191: checkcast 114	org/apache/http/HttpHost
    //   194: astore 11
    //   196: aload 11
    //   198: ifnonnull +13 -> 211
    //   201: new 116	java/lang/IllegalStateException
    //   204: dup
    //   205: ldc 118
    //   207: invokespecial 119	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   210: athrow
    //   211: aload_2
    //   212: ldc 121
    //   214: invokeinterface 112 2 0
    //   219: checkcast 123	org/apache/http/HttpRequest
    //   222: astore 12
    //   224: new 78	java/net/URI
    //   227: dup
    //   228: aload 12
    //   230: invokeinterface 127 1 0
    //   235: invokeinterface 132 1 0
    //   240: invokespecial 79	java/net/URI:<init>	(Ljava/lang/String;)V
    //   243: aload 11
    //   245: iconst_1
    //   246: invokestatic 138	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;Lorg/apache/http/HttpHost;Z)Ljava/net/URI;
    //   249: aload 5
    //   251: invokestatic 142	org/apache/http/client/utils/URIUtils:resolve	(Ljava/net/URI;Ljava/net/URI;)Ljava/net/URI;
    //   254: astore 14
    //   256: aload 14
    //   258: astore 5
    //   260: aload 6
    //   262: ldc 144
    //   264: invokeinterface 147 2 0
    //   269: ifeq +173 -> 442
    //   272: aload_2
    //   273: ldc 8
    //   275: invokeinterface 112 2 0
    //   280: checkcast 149	org/apache/http/impl/client/RedirectLocations
    //   283: astore 7
    //   285: aload 7
    //   287: ifnonnull +22 -> 309
    //   290: new 149	org/apache/http/impl/client/RedirectLocations
    //   293: dup
    //   294: invokespecial 150	org/apache/http/impl/client/RedirectLocations:<init>	()V
    //   297: astore 7
    //   299: aload_2
    //   300: ldc 8
    //   302: aload 7
    //   304: invokeinterface 154 3 0
    //   309: aload 5
    //   311: invokevirtual 157	java/net/URI:getFragment	()Ljava/lang/String;
    //   314: ifnull +114 -> 428
    //   317: aload 5
    //   319: new 114	org/apache/http/HttpHost
    //   322: dup
    //   323: aload 5
    //   325: invokevirtual 160	java/net/URI:getHost	()Ljava/lang/String;
    //   328: aload 5
    //   330: invokevirtual 164	java/net/URI:getPort	()I
    //   333: aload 5
    //   335: invokevirtual 167	java/net/URI:getScheme	()Ljava/lang/String;
    //   338: invokespecial 170	org/apache/http/HttpHost:<init>	(Ljava/lang/String;ILjava/lang/String;)V
    //   341: iconst_1
    //   342: invokestatic 138	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;Lorg/apache/http/HttpHost;Z)Ljava/net/URI;
    //   345: astore 10
    //   347: aload 10
    //   349: astore 8
    //   351: aload 7
    //   353: aload 8
    //   355: invokevirtual 174	org/apache/http/impl/client/RedirectLocations:contains	(Ljava/net/URI;)Z
    //   358: ifeq +77 -> 435
    //   361: new 176	org/apache/http/client/CircularRedirectException
    //   364: dup
    //   365: new 40	java/lang/StringBuilder
    //   368: dup
    //   369: invokespecial 41	java/lang/StringBuilder:<init>	()V
    //   372: ldc 178
    //   374: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: aload 8
    //   379: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   382: ldc 180
    //   384: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   390: invokespecial 181	org/apache/http/client/CircularRedirectException:<init>	(Ljava/lang/String;)V
    //   393: athrow
    //   394: astore 13
    //   396: new 21	org/apache/http/ProtocolException
    //   399: dup
    //   400: aload 13
    //   402: invokevirtual 184	java/net/URISyntaxException:getMessage	()Ljava/lang/String;
    //   405: aload 13
    //   407: invokespecial 104	org/apache/http/ProtocolException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   410: athrow
    //   411: astore 9
    //   413: new 21	org/apache/http/ProtocolException
    //   416: dup
    //   417: aload 9
    //   419: invokevirtual 184	java/net/URISyntaxException:getMessage	()Ljava/lang/String;
    //   422: aload 9
    //   424: invokespecial 104	org/apache/http/ProtocolException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   427: athrow
    //   428: aload 5
    //   430: astore 8
    //   432: goto -81 -> 351
    //   435: aload 7
    //   437: aload 8
    //   439: invokevirtual 188	org/apache/http/impl/client/RedirectLocations:add	(Ljava/net/URI;)V
    //   442: aload 5
    //   444: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   79	90	151	java/net/URISyntaxException
    //   224	256	394	java/net/URISyntaxException
    //   317	347	411	java/net/URISyntaxException
  }

  public boolean isRedirectRequested(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    if (!this.enableRedirects)
      return false;
    if (paramHttpResponse == null)
      throw new IllegalArgumentException("HTTP response may not be null");
    switch (paramHttpResponse.getStatusLine().getStatusCode())
    {
    case 304:
    case 305:
    case 306:
    default:
      return false;
    case 301:
    case 302:
    case 303:
    case 307:
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.MyRedirectHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */