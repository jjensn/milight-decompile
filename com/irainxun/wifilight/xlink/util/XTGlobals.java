package com.irainxun.wifilight.xlink.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class XTGlobals
{
  private static XTProperties properties = null;

  public XTGlobals()
  {
  }

  public static void deleteProperty(String paramString)
  {
    if (properties == null)
      properties = XTProperties.getInstance();
    properties.remove(paramString);
  }

  public static Map<String, String> getAllProperty()
  {
    if (properties == null)
      properties = XTProperties.getInstance();
    return properties.getProperties();
  }

  public static boolean getBooleanProperty(String paramString)
  {
    return Boolean.valueOf(getProperty(paramString)).booleanValue();
  }

  public static boolean getBooleanProperty(String paramString, boolean paramBoolean)
  {
    String str = getProperty(paramString);
    if (str != null)
      paramBoolean = Boolean.valueOf(str).booleanValue();
    return paramBoolean;
  }

  public static int getIntProperty(String paramString, int paramInt)
  {
    String str = getProperty(paramString);
    if (str != null)
      try
      {
        int i = Integer.parseInt(str);
        paramInt = i;
        return paramInt;
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
    return paramInt;
  }

  public static long getLongProperty(String paramString, long paramLong)
  {
    String str = getProperty(paramString);
    if (str != null)
      try
      {
        long l = Long.parseLong(str);
        paramLong = l;
        return paramLong;
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
    return paramLong;
  }

  public static List<String> getProperties(String paramString)
  {
    if (properties == null)
      properties = XTProperties.getInstance();
    Collection localCollection = properties.getChildrenNames(paramString);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localCollection.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return localArrayList;
      String str = getProperty((String)localIterator.next());
      if (str != null)
        localArrayList.add(str);
    }
  }

  public static String getProperty(String paramString)
  {
    if (properties == null)
      properties = XTProperties.getInstance();
    return properties.get(paramString);
  }

  public static String getProperty(String paramString1, String paramString2)
  {
    if (properties == null)
      properties = XTProperties.getInstance();
    String str = properties.get(paramString1);
    if (str != null)
      return str;
    return paramString2;
  }

  public static List<String> getPropertyNames()
  {
    if (properties == null)
      properties = XTProperties.getInstance();
    return new ArrayList(properties.getPropertyNames());
  }

  public static List<String> getPropertyNames(String paramString)
  {
    if (properties == null)
      properties = XTProperties.getInstance();
    return new ArrayList(properties.getChildrenNames(paramString));
  }

  public static void setProperties(Map<String, String> paramMap)
  {
    if (properties == null)
      properties = XTProperties.getInstance();
    properties.putAll(paramMap);
  }

  public static void setProperty(String paramString1, String paramString2)
  {
    if (properties == null)
      properties = XTProperties.getInstance();
    properties.put(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.util.XTGlobals
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */