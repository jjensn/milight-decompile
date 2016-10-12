package com.irainxun.wifilight;

import android.graphics.Color;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

class ConfigurationActivity$9
  implements Runnable
{
  ConfigurationActivity$9(ConfigurationActivity paramConfigurationActivity, TextView paramTextView1, TextView paramTextView2, Button paramButton)
  {
  }

  public void run()
  {
    if (ConfigurationActivity.access$15(this.this$0) > 1)
    {
      ConfigurationActivity localConfigurationActivity1 = this.this$0;
      ConfigurationActivity.access$14(localConfigurationActivity1, -1 + ConfigurationActivity.access$15(localConfigurationActivity1));
      TextView localTextView = this.val$tMsg;
      ConfigurationActivity localConfigurationActivity2 = this.this$0;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(ConfigurationActivity.access$15(this.this$0));
      localTextView.setText(localConfigurationActivity2.getString(R.string.tips_config_msg, arrayOfObject));
      ConfigurationActivity.access$16(this.this$0).postDelayed(this, 1000L);
      return;
    }
    if (ConfigurationActivity.access$17(this.this$0))
    {
      this.val$tTitle.setText("Configured");
      this.val$tTitle.setTextColor(Color.rgb(255, 0, 0));
      this.val$tMsg.setText(null);
      this.val$btnCancel.setText("OK");
      return;
    }
    this.val$tTitle.setText(R.string.config_fail);
    this.val$tTitle.setTextColor(-65536);
    this.val$tMsg.setText(R.string.apdesc_config_fail);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */