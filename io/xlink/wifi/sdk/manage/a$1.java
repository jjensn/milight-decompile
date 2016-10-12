package io.xlink.wifi.sdk.manage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.xlink.wifi.sdk.XlinkAgent;
import io.xlink.wifi.sdk.XlinkTcpService;
import io.xlink.wifi.sdk.XlinkUdpService;
import io.xlink.wifi.sdk.util.MyLog;
import io.xlink.wifi.sdk.util.b;

class a$1 extends BroadcastReceiver
{
  a$1(a parama)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (TextUtils.equals(paramIntent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE"))
    {
      NetworkInfo localNetworkInfo = this.a.c();
      if ((localNetworkInfo != null) && (localNetworkInfo.isAvailable()))
      {
        MyLog.e("NetWrok", "NetworkInfo：：" + localNetworkInfo.getType());
        switch (localNetworkInfo.getType())
        {
        default:
        case 1:
        case 0:
        }
      }
    }
    while (true)
    {
      if (!XlinkTcpService.c())
        XlinkAgent.getInstance().login(XlinkTcpService.a, XlinkTcpService.b);
      c.a().e();
      return;
      if ((!XlinkUdpService.a()) && (XlinkUdpService.b() != null))
      {
        Intent localIntent = new Intent(b.a, XlinkUdpService.class);
        b.a.startService(localIntent);
        continue;
        c.a().e();
        if (XlinkUdpService.b() != null)
          XlinkUdpService.b().a(false, 0);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.manage.a.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */