package io.xlink.wifi.sdk.manage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.xlink.wifi.sdk.XlinkAgent;
import io.xlink.wifi.sdk.XlinkTcpService;
import io.xlink.wifi.sdk.XlinkUdpService;
import io.xlink.wifi.sdk.util.MyLog;
import io.xlink.wifi.sdk.util.b;

public class a
{
  private static a c;
  boolean a = true;
  BroadcastReceiver b = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (TextUtils.equals(paramAnonymousIntent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE"))
      {
        NetworkInfo localNetworkInfo = a.this.c();
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
  };

  public a()
  {
  }

  public static a a()
  {
    if (c == null)
      c = new a();
    return c;
  }

  private void f()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    localIntentFilter.setPriority(1000);
    b.a.registerReceiver(this.b, localIntentFilter);
  }

  public void b()
  {
    if (!this.a)
      return;
    this.a = false;
    f();
  }

  public NetworkInfo c()
  {
    return ((ConnectivityManager)b.a.getSystemService("connectivity")).getActiveNetworkInfo();
  }

  public boolean d()
  {
    NetworkInfo localNetworkInfo = c();
    if (localNetworkInfo == null)
      return false;
    return localNetworkInfo.isAvailable();
  }

  public void e()
  {
    if (!this.a)
    {
      this.a = true;
      b.a.unregisterReceiver(this.b);
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.manage.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */