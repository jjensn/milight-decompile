package com.irainxun.wifilight.apsetting.android;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

public class Scanner extends Handler
{
  private Context context;
  private int retry = 0;
  private WifiManager wifiManager;

  public Scanner(Context paramContext)
  {
    this.context = paramContext;
    this.wifiManager = ((WifiManager)paramContext.getSystemService("wifi"));
  }

  public void handleMessage(Message paramMessage)
  {
    if (this.wifiManager.startScan())
      this.retry = 0;
    int i;
    do
    {
      sendEmptyMessageDelayed(0, 6000L);
      return;
      i = 1 + this.retry;
      this.retry = i;
    }
    while (i < 3);
    this.retry = 0;
    Toast.makeText(this.context, "wifi_fail_to_scan", 1).show();
  }

  public void pause()
  {
    this.retry = 0;
    removeMessages(0);
  }

  public void resume()
  {
    if (!hasMessages(0))
      sendEmptyMessage(0);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.Scanner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */