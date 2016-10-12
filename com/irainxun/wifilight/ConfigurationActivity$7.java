package com.irainxun.wifilight;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.hiflying.smartlink.v3.SnifferSmartLinker;

class ConfigurationActivity$7
  implements View.OnClickListener
{
  ConfigurationActivity$7(ConfigurationActivity paramConfigurationActivity, Runnable paramRunnable, TextView paramTextView1, TextView paramTextView2)
  {
  }

  public void onClick(View paramView)
  {
    try
    {
      this.this$0.mSnifferSmartLinker.setOnSmartLinkListener(this.this$0);
      SnifferSmartLinker localSnifferSmartLinker = this.this$0.mSnifferSmartLinker;
      Context localContext = this.this$0.getApplicationContext();
      String str = ConfigurationActivity.access$3(this.this$0).getText().toString().trim();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = ConfigurationActivity.access$18(this.this$0).getText().toString().trim();
      localSnifferSmartLinker.start(localContext, str, arrayOfString);
      ConfigurationActivity.access$19(this.this$0).dismiss();
      ConfigurationActivity.access$20(this.this$0);
      ConfigurationActivity.access$16(this.this$0).removeCallbacks(this.val$updateTime);
      ConfigurationActivity.access$14(this.this$0, 60);
      this.val$tTitle.setText(R.string.configing);
      TextView localTextView = this.val$tMsg;
      ConfigurationActivity localConfigurationActivity = this.this$0;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(ConfigurationActivity.access$15(this.this$0));
      localTextView.setText(localConfigurationActivity.getString(R.string.tips_config_msg, arrayOfObject));
      ConfigurationActivity.access$16(this.this$0).postDelayed(this.val$updateTime, 1000L);
      ConfigurationActivity.access$21(this.this$0);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        localException.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */