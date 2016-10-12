package com.irainxun.wifilight;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.apsetting.model.ATCommand;
import com.irainxun.wifilight.apsetting.model.Module;
import com.irainxun.wifilight.apsetting.net.UdpUnicast;
import com.irainxun.wifilight.apsetting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

class ConfigurationActivity$5 extends Handler
{
  ConfigurationActivity$5(ConfigurationActivity paramConfigurationActivity)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    case 3:
    default:
      return;
    case 1:
      Log.d("debug", "try to enter cmd mode");
      Module localModule = Utils.getDevice(this.this$0, ConfigurationActivity.access$8(this.this$0));
      if (localModule != null)
      {
        if (ConfigurationActivity.access$7(this.this$0) != null)
          break label176;
        ConfigurationActivity.access$6(this.this$0, new ArrayList());
        ConfigurationActivity.access$7(this.this$0).add(localModule);
      }
      while (true)
      {
        ConfigurationActivity.access$9(this.this$0).setIp(((Module)ConfigurationActivity.access$7(this.this$0).get(0)).getIp());
        ConfigurationActivity.access$9(this.this$0).open();
        ConfigurationActivity.access$10(this.this$0, 0);
        new Thread(new Runnable()
        {
          public void run()
          {
            ConfigurationActivity.access$11(ConfigurationActivity.5.this.this$0).enterCMDMode();
          }
        }).start();
        return;
        ConfigurationActivity.access$7(this.this$0).add(0, localModule);
      }
    case 2:
      label176: Log.d("debug", "MSG_RETRY_ENTER_CMD");
      this.this$0.setProgressBarIndeterminateVisibility(true);
      if (ConfigurationActivity.access$12(this.this$0) > 3)
      {
        Log.d("debug", "MSG_RETRY_ENTER_CMD = R.string.retry");
        ConfigurationActivity.access$13(this.this$0, false);
        ConfigurationActivity.access$14(this.this$0, 0);
        return;
      }
      Log.d("debug", "MSG_RETRY_ENTER_CMD = R.string.waitting");
      return;
    case 4:
    }
    ConfigurationActivity.access$13(this.this$0, true);
    ConfigurationActivity.access$14(this.this$0, 0);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */