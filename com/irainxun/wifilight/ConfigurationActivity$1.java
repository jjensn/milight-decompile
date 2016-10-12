package com.irainxun.wifilight;

import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.hiflying.smartlink.v3.SnifferSmartLinker;

class ConfigurationActivity$1
  implements RadioGroup.OnCheckedChangeListener
{
  ConfigurationActivity$1(ConfigurationActivity paramConfigurationActivity)
  {
  }

  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    switch (paramInt)
    {
    default:
    case R.id.rb1:
    case R.id.rb2:
    }
    do
    {
      return;
      ConfigurationActivity.access$0(this.this$0, false);
      this.this$0.mSnifferSmartLinker = SnifferSmartLinker.getInstence();
      Log.d("debug", "smartLink setting!");
      ConfigurationActivity.access$1(this.this$0).setVisibility(4);
      return;
      Log.d("debug", "AP_mode setting!");
      ConfigurationActivity.access$1(this.this$0).setVisibility(0);
      ConfigurationActivity.access$0(this.this$0, true);
    }
    while (this.this$0.mSnifferSmartLinker == null);
    this.this$0.mSnifferSmartLinker.setOnSmartLinkListener(null);
    this.this$0.mSnifferSmartLinker.stop();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */