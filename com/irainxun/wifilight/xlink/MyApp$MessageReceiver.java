package com.irainxun.wifilight.xlink;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.irainxun.wifilight.JG_ExampleUtil;

public class MyApp$MessageReceiver extends BroadcastReceiver
{
  public MyApp$MessageReceiver(MyApp paramMyApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("com.example.jpushdemo.MESSAGE_RECEIVED_ACTION".equals(paramIntent.getAction()))
    {
      String str1 = paramIntent.getStringExtra("message");
      String str2 = paramIntent.getStringExtra("extras");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("message : " + str1 + "\n");
      if (!JG_ExampleUtil.isEmpty(str2))
        localStringBuilder.append("extras : " + str2 + "\n");
      Toast.makeText(this.this$0.getApplicationContext(), localStringBuilder.toString(), 0).show();
      Log.d("debug", "jg showMsg.toString() = " + localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.MyApp.MessageReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */