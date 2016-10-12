package io.xlink.wifi.sdk.event;

import android.os.Handler;
import android.os.Message;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.bean.EventNotify;
import io.xlink.wifi.sdk.bean.a;
import io.xlink.wifi.sdk.listener.ScanDeviceListener;
import io.xlink.wifi.sdk.listener.XlinkNetListener;
import io.xlink.wifi.sdk.util.MyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

final class c$1 extends Handler
{
  c$1()
  {
  }

  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if ((paramMessage.obj instanceof a));
    for (a locala = (a)paramMessage.obj; ; locala = null)
    {
      switch (paramMessage.what)
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 6:
      case 5:
      }
      while (true)
      {
        return;
        if ((c.a() != null) && (paramMessage.obj != null) && ((paramMessage.obj instanceof XDevice)))
        {
          c.a().onGotDeviceByScan((XDevice)paramMessage.obj);
          return;
          Iterator localIterator5 = c.b().iterator();
          while (localIterator5.hasNext())
            ((XlinkNetListener)localIterator5.next()).onDataPointUpdate(locala.a, locala.b, locala.d, locala.e, locala.c);
          continue;
          Iterator localIterator4 = c.b().iterator();
          while (localIterator4.hasNext())
          {
            XlinkNetListener localXlinkNetListener2 = (XlinkNetListener)localIterator4.next();
            if (locala.h)
              localXlinkNetListener2.onRecvPipeSyncData(locala.a, locala.g, locala.f);
            else
              localXlinkNetListener2.onRecvPipeData(locala.a, locala.g, locala.f);
          }
          continue;
          XDevice localXDevice = (XDevice)paramMessage.obj;
          Iterator localIterator3 = c.b().iterator();
          while (localIterator3.hasNext())
            ((XlinkNetListener)localIterator3.next()).onDeviceStateChanged(localXDevice, paramMessage.arg1);
          continue;
          EventNotify localEventNotify = (EventNotify)paramMessage.obj;
          Iterator localIterator2 = c.b().iterator();
          while (localIterator2.hasNext())
            ((XlinkNetListener)localIterator2.next()).onEventNotify(localEventNotify);
          continue;
          if (c.c().size() == 0)
          {
            MyLog.e("XlinkNetDispatcher", "XlinkNetListener not found");
            return;
          }
          int i = paramMessage.arg1;
          int j = paramMessage.arg2;
          Iterator localIterator1 = c.b().iterator();
          while (localIterator1.hasNext())
          {
            XlinkNetListener localXlinkNetListener1 = (XlinkNetListener)localIterator1.next();
            switch (i)
            {
            case 2:
            default:
              break;
            case 1:
              localXlinkNetListener1.onStart(j);
              break;
            case 3:
              localXlinkNetListener1.onLocalDisconnect(j);
              break;
            case 4:
              localXlinkNetListener1.onLogin(0);
              break;
            case 6:
              localXlinkNetListener1.onDisconnect(j);
              break;
            case 5:
              localXlinkNetListener1.onLogin(j);
            }
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.event.c.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */