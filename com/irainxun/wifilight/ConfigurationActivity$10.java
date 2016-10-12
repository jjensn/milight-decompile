package com.irainxun.wifilight;

import android.app.Dialog;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

class ConfigurationActivity$10
  implements View.OnClickListener
{
  ConfigurationActivity$10(ConfigurationActivity paramConfigurationActivity, Runnable paramRunnable, Dialog paramDialog)
  {
  }

  public void onClick(View paramView)
  {
    ConfigurationActivity.access$16(this.this$0).removeCallbacks(this.val$updateTime);
    this.val$dialog.dismiss();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */