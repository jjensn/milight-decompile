package com.irainxun.wifilight.xlink;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

class MyApp$4 extends BroadcastReceiver
{
  MyApp$4(MyApp paramMyApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.TIME_TICK"))
    {
      Log.d("debug", "wifilight ACTION_TIME_TICK");
      if (MyApp.DeviceControl != null)
      {
        MyApp.access$4(this.this$0);
        MyApp.access$5(this.this$0);
        MyApp.access$6(this.this$0);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.MyApp.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */