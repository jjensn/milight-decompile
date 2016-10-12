package io.xlink.wifi.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.xlink.wifi.sdk.manage.c;
import io.xlink.wifi.sdk.util.MyLog;
import java.util.Date;

class XlinkUdpService$2 extends BroadcastReceiver
{
  XlinkUdpService$2(XlinkUdpService paramXlinkUdpService)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    MyLog.e("UDPService", "UDP mReceiver " + new Date() + "  " + System.currentTimeMillis());
    if (str.equals(XlinkUdpService.g()))
      c.a().d();
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkUdpService.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */