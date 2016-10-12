package io.xlink.wifi.sdk;

import android.content.Context;
import android.content.Intent;
import io.xlink.wifi.sdk.manage.c;
import io.xlink.wifi.sdk.util.b;
import java.util.ArrayList;
import java.util.Iterator;

class XlinkAgent$2
  implements Runnable
{
  XlinkAgent$2(XlinkAgent paramXlinkAgent)
  {
  }

  public void run()
  {
    Iterator localIterator = c.a().c().iterator();
    while (localIterator.hasNext())
    {
      XDevice localXDevice = (XDevice)localIterator.next();
      XlinkAgent.a(this.a, localXDevice);
      try
      {
        Thread.sleep(30L);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
    if (XlinkUdpService.b() != null)
      XlinkUdpService.b().a(false, 0);
    Intent localIntent = new Intent(b.a, XlinkUdpService.class);
    b.a.stopService(localIntent);
    this.a.c = false;
    XlinkAgent.a("stop inner service");
    c.a().b();
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkAgent.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */