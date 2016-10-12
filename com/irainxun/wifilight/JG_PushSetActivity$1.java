package com.irainxun.wifilight;

import android.os.Handler;
import android.util.Log;
import cn.jpush.android.api.TagAliasCallback;
import java.util.Set;

class JG_PushSetActivity$1
  implements TagAliasCallback
{
  JG_PushSetActivity$1(JG_PushSetActivity paramJG_PushSetActivity)
  {
  }

  public void gotResult(int paramInt, String paramString, Set<String> paramSet)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "Failed with errorCode = " + paramInt;
      Log.e("JPush", str);
    case 0:
    case 6002:
    }
    while (true)
    {
      JG_ExampleUtil.showToast(str, this.this$0.getApplicationContext());
      return;
      str = "Set tag and alias success";
      Log.i("JPush", str);
      continue;
      str = "Failed to set alias and tags due to timeout. Try again after 60s.";
      Log.i("JPush", str);
      if (JG_ExampleUtil.isConnected(this.this$0.getApplicationContext()))
        JG_PushSetActivity.access$0(this.this$0).sendMessageDelayed(JG_PushSetActivity.access$0(this.this$0).obtainMessage(1001, paramString), 60000L);
      else
        Log.i("JPush", "No network");
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.JG_PushSetActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */