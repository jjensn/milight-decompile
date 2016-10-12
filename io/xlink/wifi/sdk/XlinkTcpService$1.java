package io.xlink.wifi.sdk;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import io.xlink.wifi.sdk.encoder.g;
import io.xlink.wifi.sdk.global.a;
import io.xlink.wifi.sdk.tcp.c;
import io.xlink.wifi.sdk.util.MyLog;
import io.xlink.wifi.sdk.util.b;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

class XlinkTcpService$1 extends BroadcastReceiver
{
  XlinkTcpService$1(XlinkTcpService paramXlinkTcpService)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = false;
    String str = paramIntent.getAction();
    MyLog.e("TCPService", "TCP mReceiver " + new Date() + "  " + System.currentTimeMillis());
    if (str.equals(XlinkTcpService.e()))
      if (!XlinkTcpService.c())
      {
        XlinkTcpService.a(this.a);
        XlinkTcpService.a(this.a, "tcp !isConnected stopKeepAlive ");
      }
    do
    {
      long l2;
      do
      {
        return;
        long l1 = (System.currentTimeMillis() - this.a.f) / 1000L;
        if (this.a.e > 3)
        {
          XlinkTcpService.a(this.a, "tcp 3次心跳超时" + l1 + " cloud service 3 times not response ping app logout ");
          XlinkTcpService.a(this.a);
          this.a.a(true, -2, true);
          return;
        }
        l2 = System.currentTimeMillis() - this.a.f;
      }
      while ((this.a.e == 0) && (l2 < 1000 * (-3 + a.e / 2)));
      XlinkTcpService localXlinkTcpService = this.a;
      localXlinkTcpService.e = (1 + localXlinkTcpService.e);
      io.xlink.wifi.sdk.tcp.b.a = 0;
      g localg = c.a().b();
      this.a.a(localg);
      XlinkTcpService.a(this.a, "tcp send keep alive packet ");
      this.a.f = System.currentTimeMillis();
      return;
      if (str.equals(XlinkTcpService.f()))
      {
        XlinkTcpService.b(this.a);
        return;
      }
    }
    while (!paramIntent.getAction().equals("android.intent.action.TIME_TICK"));
    Iterator localIterator = ((ActivityManager)b.a.getSystemService("activity")).getRunningServices(2147483647).iterator();
    label317: if (localIterator.hasNext())
      if (!"io.xlink.wifi.sdk.XlinkTcpService".equals(((ActivityManager.RunningServiceInfo)localIterator.next()).service.getClassName()))
        break label415;
    label415: for (boolean bool2 = true; ; bool2 = bool1)
    {
      bool1 = bool2;
      break label317;
      XlinkTcpService.a(this.a, "tcp isServiceRunning:" + bool1);
      if (bool1)
        break;
      paramContext.startService(new Intent(paramContext, XlinkTcpService.class));
      XlinkTcpService.a(this.a, "tcp RestartService...");
      return;
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkTcpService.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */