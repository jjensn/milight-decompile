package com.irainxun.wifilight;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import cn.jpush.android.api.JPushInterface;
import java.util.Set;

class JG_PushSetActivity$3 extends Handler
{
  JG_PushSetActivity$3(JG_PushSetActivity paramJG_PushSetActivity)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
      Log.i("JPush", "Unhandled msg - " + paramMessage.what);
      return;
    case 1001:
      Log.d("JPush", "Set alias in handler.");
      JPushInterface.setAliasAndTags(this.this$0.getApplicationContext(), (String)paramMessage.obj, null, JG_PushSetActivity.access$1(this.this$0));
      return;
    case 1002:
    }
    Log.d("JPush", "Set tags in handler.");
    JPushInterface.setAliasAndTags(this.this$0.getApplicationContext(), null, (Set)paramMessage.obj, JG_PushSetActivity.access$2(this.this$0));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.JG_PushSetActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */