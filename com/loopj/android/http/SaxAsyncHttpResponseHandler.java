package com.loopj.android.http;

import org.apache.http.Header;
import org.xml.sax.helpers.DefaultHandler;

public abstract class SaxAsyncHttpResponseHandler<T extends DefaultHandler> extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "SaxAsyncHttpResponseHandler";
  private T handler = null;

  public SaxAsyncHttpResponseHandler(T paramT)
  {
    if (paramT == null)
      throw new Error("null instance of <T extends DefaultHandler> passed to constructor");
    this.handler = paramT;
  }

  // ERROR //
  protected byte[] getResponseData(org.apache.http.HttpEntity paramHttpEntity)
    throws java.io.IOException
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +80 -> 81
    //   4: aload_1
    //   5: invokeinterface 40 1 0
    //   10: astore_2
    //   11: aconst_null
    //   12: astore_3
    //   13: aload_2
    //   14: ifnull +67 -> 81
    //   17: invokestatic 46	javax/xml/parsers/SAXParserFactory:newInstance	()Ljavax/xml/parsers/SAXParserFactory;
    //   20: invokevirtual 50	javax/xml/parsers/SAXParserFactory:newSAXParser	()Ljavax/xml/parsers/SAXParser;
    //   23: invokevirtual 56	javax/xml/parsers/SAXParser:getXMLReader	()Lorg/xml/sax/XMLReader;
    //   26: astore 12
    //   28: aload 12
    //   30: aload_0
    //   31: getfield 19	com/loopj/android/http/SaxAsyncHttpResponseHandler:handler	Lorg/xml/sax/helpers/DefaultHandler;
    //   34: invokeinterface 62 2 0
    //   39: new 64	java/io/InputStreamReader
    //   42: dup
    //   43: aload_2
    //   44: ldc 66
    //   46: invokespecial 69	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   49: astore 13
    //   51: aload 12
    //   53: new 71	org/xml/sax/InputSource
    //   56: dup
    //   57: aload 13
    //   59: invokespecial 74	org/xml/sax/InputSource:<init>	(Ljava/io/Reader;)V
    //   62: invokeinterface 78 2 0
    //   67: aload_2
    //   68: invokestatic 84	com/loopj/android/http/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   71: aload 13
    //   73: ifnull +8 -> 81
    //   76: aload 13
    //   78: invokevirtual 87	java/io/InputStreamReader:close	()V
    //   81: aconst_null
    //   82: areturn
    //   83: astore 9
    //   85: ldc 9
    //   87: ldc 89
    //   89: aload 9
    //   91: invokestatic 95	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   94: pop
    //   95: aload_2
    //   96: invokestatic 84	com/loopj/android/http/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   99: aload_3
    //   100: ifnull -19 -> 81
    //   103: aload_3
    //   104: invokevirtual 87	java/io/InputStreamReader:close	()V
    //   107: goto -26 -> 81
    //   110: astore 11
    //   112: goto -31 -> 81
    //   115: astore 6
    //   117: ldc 9
    //   119: ldc 89
    //   121: aload 6
    //   123: invokestatic 95	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   126: pop
    //   127: aload_2
    //   128: invokestatic 84	com/loopj/android/http/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   131: aload_3
    //   132: ifnull -51 -> 81
    //   135: aload_3
    //   136: invokevirtual 87	java/io/InputStreamReader:close	()V
    //   139: goto -58 -> 81
    //   142: astore 8
    //   144: goto -63 -> 81
    //   147: astore 4
    //   149: aload_2
    //   150: invokestatic 84	com/loopj/android/http/AsyncHttpClient:silentCloseInputStream	(Ljava/io/InputStream;)V
    //   153: aload_3
    //   154: ifnull +7 -> 161
    //   157: aload_3
    //   158: invokevirtual 87	java/io/InputStreamReader:close	()V
    //   161: aload 4
    //   163: athrow
    //   164: astore 14
    //   166: goto -85 -> 81
    //   169: astore 5
    //   171: goto -10 -> 161
    //   174: astore 4
    //   176: aload 13
    //   178: astore_3
    //   179: goto -30 -> 149
    //   182: astore 6
    //   184: aload 13
    //   186: astore_3
    //   187: goto -70 -> 117
    //   190: astore 9
    //   192: aload 13
    //   194: astore_3
    //   195: goto -110 -> 85
    //
    // Exception table:
    //   from	to	target	type
    //   17	51	83	org/xml/sax/SAXException
    //   103	107	110	java/io/IOException
    //   17	51	115	javax/xml/parsers/ParserConfigurationException
    //   135	139	142	java/io/IOException
    //   17	51	147	finally
    //   85	95	147	finally
    //   117	127	147	finally
    //   76	81	164	java/io/IOException
    //   157	161	169	java/io/IOException
    //   51	67	174	finally
    //   51	67	182	javax/xml/parsers/ParserConfigurationException
    //   51	67	190	org/xml/sax/SAXException
  }

  public abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, T paramT);

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    onSuccess(paramInt, paramArrayOfHeader, this.handler);
  }

  public abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, T paramT);

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    onSuccess(paramInt, paramArrayOfHeader, this.handler);
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.SaxAsyncHttpResponseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */