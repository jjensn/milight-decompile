package com.irainxun.wifilight;

import android.os.Handler;
import android.util.Log;
import com.irainxun.wifilight.apsetting.android.Repeater;
import com.irainxun.wifilight.apsetting.model.ATCommand;
import com.irainxun.wifilight.apsetting.model.ATCommandListener;
import com.irainxun.wifilight.apsetting.model.NetworkProtocol;

class ConfigurationActivity$11
  implements ATCommandListener
{
  ConfigurationActivity$11(ConfigurationActivity paramConfigurationActivity)
  {
  }

  public void onEnterCMDMode(boolean paramBoolean)
  {
    Log.d(this.this$0.TAG, "onEnterCMDMode:" + paramBoolean);
    this.this$0.setProgressBarIndeterminateVisibility(false);
    ConfigurationActivity.access$24(this.this$0, paramBoolean);
    if (paramBoolean)
    {
      if (ConfigurationActivity.access$25(this.this$0) != null)
        ConfigurationActivity.access$25(this.this$0).pause();
      ConfigurationActivity.access$26(this.this$0, new Repeater(30000L)
      {
        public void repeateAction()
        {
          ConfigurationActivity.access$11(ConfigurationActivity.11.this.this$0).send("AT+VER\r\n");
        }
      });
      ConfigurationActivity.access$25(this.this$0).resume();
    }
    do
    {
      return;
      ConfigurationActivity localConfigurationActivity = this.this$0;
      ConfigurationActivity.access$10(localConfigurationActivity, 1 + ConfigurationActivity.access$12(localConfigurationActivity));
      if (ConfigurationActivity.access$12(this.this$0) > 3)
        Log.d("debug", "R.color.red, getString(R.string.enter_cmd_mode_failed)");
    }
    while (ConfigurationActivity.access$27(this.this$0));
    Log.d("debug", "Retry to enter CMD mode again for times");
    ConfigurationActivity.access$28(this.this$0).sendEmptyMessageDelayed(2, 1000L);
  }

  public void onExitCMDMode(boolean paramBoolean, NetworkProtocol paramNetworkProtocol)
  {
    Log.d("debug", "onExitCMDMode:" + paramBoolean);
  }

  public void onReload(boolean paramBoolean)
  {
  }

  public void onReset(boolean paramBoolean)
  {
  }

  public void onResponse(String paramString)
  {
    Log.d(this.this$0.TAG, "onResponse:" + paramString);
    String str = paramString.trim();
    if (((str.equals("+ok")) || (str.startsWith("+ERR"))) && (System.currentTimeMillis() - ConfigurationActivity.access$22(this.this$0) < 2000L))
      synchronized (ConfigurationActivity.access$23(this.this$0))
      {
        ConfigurationActivity.access$23(this.this$0).setLength(0);
        ConfigurationActivity.access$23(this.this$0).append(str);
        ConfigurationActivity.access$23(this.this$0).notifyAll();
        return;
      }
  }

  public void onResponseOfSendFile(String paramString)
  {
  }

  public void onSendFile(boolean paramBoolean)
  {
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */