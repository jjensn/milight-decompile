package com.irainxun.wifilight.xlink.util;

import com.irainxun.wifilight.xlink.http.XHeader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class RequestParams
{
  private HttpEntity entity;
  private ArrayList<XHeader> headers;
  private Map<String, Object> param = new HashMap();
  private String url;

  public RequestParams(String paramString)
  {
    this.url = paramString;
  }

  public static JSONObject getJsonObject(Map<String, Object> paramMap)
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return localJSONObject;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      try
      {
        localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
      }
    }
  }

  public void addHeader(XHeader paramXHeader)
  {
    if (this.headers == null)
      this.headers = new ArrayList();
    this.headers.add(paramXHeader);
  }

  public HttpEntity getEntity()
  {
    if (this.entity == null)
      this.entity = getJsonEntity();
    return this.entity;
  }

  public String getGetRequsetUrl()
  {
    Set localSet = this.param.entrySet();
    if (localSet.isEmpty())
      return "";
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("?");
    Iterator localIterator = localSet.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        localStringBuffer.deleteCharAt(-1 + localStringBuffer.length());
        return localStringBuffer.toString();
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuffer.append((String)localEntry.getKey());
      localStringBuffer.append("=");
      localStringBuffer.append(localEntry.getValue());
      localStringBuffer.append("&");
    }
  }

  public XHeader[] getHeaders()
  {
    XHeader[] arrayOfXHeader = new XHeader[this.headers.size()];
    for (int i = 0; ; i++)
    {
      if (i >= this.headers.size())
        return arrayOfXHeader;
      arrayOfXHeader[i] = ((XHeader)this.headers.get(i));
    }
  }

  public String getJson()
  {
    return getJsonObject(this.param).toString();
  }

  public HttpEntity getJsonEntity()
  {
    JSONObject localJSONObject = getJsonObject(this.param);
    try
    {
      StringEntity localStringEntity = new StringEntity(localJSONObject.toString(), "UTF-8");
      return localStringEntity;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return null;
  }

  public HttpEntity getNameValuePairEntity()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.param.keySet().iterator();
    while (true)
      if (!localIterator.hasNext())
        try
        {
          UrlEncodedFormEntity localUrlEncodedFormEntity = new UrlEncodedFormEntity(localArrayList, "UTF-8");
          return localUrlEncodedFormEntity;
          String str = (String)localIterator.next();
          localArrayList.add(new BasicNameValuePair(str, this.param.get(str)));
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
    return null;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void put(String paramString, Object paramObject)
  {
    this.param.put(paramString, paramObject);
  }

  public void remove(String paramString)
  {
    this.param.remove(paramString);
  }

  public void setEntity(HttpEntity paramHttpEntity)
  {
    this.entity = paramHttpEntity;
  }

  public void setHeaders(ArrayList<XHeader> paramArrayList)
  {
    this.headers = paramArrayList;
  }

  public String toString()
  {
    return this.param.toString();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.util.RequestParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */