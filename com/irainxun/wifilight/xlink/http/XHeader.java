package com.irainxun.wifilight.xlink.http;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;

public class XHeader
  implements Header
{
  private String name;
  private String value;

  public XHeader(String paramString1, String paramString2)
  {
    this.value = paramString2;
    this.name = paramString1;
  }

  public XHeader(String paramString1, String paramString2, HeaderElement[] paramArrayOfHeaderElement)
  {
    this.value = paramString2;
    this.name = paramString1;
  }

  public HeaderElement[] getElements()
    throws ParseException
  {
    return null;
  }

  public String getName()
  {
    return this.name;
  }

  public String getValue()
  {
    return this.value;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.http.XHeader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */