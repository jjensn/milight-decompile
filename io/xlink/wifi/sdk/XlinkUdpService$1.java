package io.xlink.wifi.sdk;

import io.xlink.wifi.sdk.manage.c;
import java.util.TimerTask;

class XlinkUdpService$1 extends TimerTask
{
  XlinkUdpService$1(XlinkUdpService paramXlinkUdpService)
  {
  }

  public void run()
  {
    c.a().d();
    XlinkUdpService.a(this.a, System.currentTimeMillis());
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkUdpService.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */