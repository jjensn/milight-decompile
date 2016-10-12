package io.xlink.wifi.sdk.manage;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkUdpService;
import io.xlink.wifi.sdk.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class c
{
  public static final LinkedHashMap<String, XDevice> a = new LinkedHashMap();
  public static final ArrayList<XDevice> b = new ArrayList();
  private static c c;
  private boolean d = false;

  private c()
  {
  }

  public static c a()
  {
    if (c == null)
      c = new c();
    return c;
  }

  public XDevice a(int paramInt)
  {
    Iterator localIterator = c().iterator();
    while (localIterator.hasNext())
    {
      XDevice localXDevice = (XDevice)localIterator.next();
      if (localXDevice.getDeviceId() == paramInt)
        return localXDevice;
    }
    return null;
  }

  public void a(String paramString)
  {
    this.d = true;
    XDevice localXDevice = (XDevice)a.get(paramString);
    if (localXDevice != null)
      localXDevice.a = 0;
  }

  public boolean a(XDevice paramXDevice)
  {
    return (paramXDevice == null) || (paramXDevice.getAddress() == null) || (paramXDevice.getMacAddress() == null) || (paramXDevice.getMacAddress().equals(""));
  }

  public XDevice b(String paramString)
  {
    return (XDevice)a.get(paramString);
  }

  public void b()
  {
    this.d = true;
    a.clear();
  }

  public void b(XDevice paramXDevice)
  {
    this.d = true;
    a.put(paramXDevice.getMacAddress(), paramXDevice);
  }

  public ArrayList<XDevice> c()
  {
    try
    {
      if (!this.d)
        break label92;
      b.clear();
      synchronized (a)
      {
        Iterator localIterator = a.entrySet().iterator();
        if (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          b.add(localEntry.getValue());
        }
      }
    }
    finally
    {
    }
    this.d = false;
    label92: ArrayList localArrayList = b;
    return localArrayList;
  }

  public void c(XDevice paramXDevice)
  {
    this.d = true;
    a.remove(paramXDevice.getMacAddress());
    a.put(paramXDevice.getMacAddress(), paramXDevice);
  }

  public void c(String paramString)
  {
    this.d = true;
    a.remove(paramString);
  }

  public void d()
  {
    if (a.size() == 0)
      XlinkUdpService.b().e();
    int i;
    do
    {
      return;
      Iterator localIterator = c().iterator();
      i = 0;
      while (localIterator.hasNext())
      {
        XDevice localXDevice = (XDevice)localIterator.next();
        if (localXDevice.isLAN())
        {
          i = 1;
          localXDevice.checkKeepAlive();
        }
      }
    }
    while (i != 0);
    XlinkUdpService.b().e();
  }

  public void e()
  {
    Iterator localIterator = c().iterator();
    while (localIterator.hasNext())
    {
      XDevice localXDevice1 = (XDevice)localIterator.next();
      if (localXDevice1.isLAN())
      {
        XDevice localXDevice2 = a.a().a(localXDevice1, -1);
        c(localXDevice2);
        a.a().a(localXDevice2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.manage.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */