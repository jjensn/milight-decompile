package com.irainxun.wifilight;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

class ConfigurationActivity$2
  implements CompoundButton.OnCheckedChangeListener
{
  ConfigurationActivity$2(ConfigurationActivity paramConfigurationActivity)
  {
  }

  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramCompoundButton == ConfigurationActivity.access$2(this.this$0))
    {
      if (!paramBoolean)
        break label49;
      ConfigurationActivity.access$3(this.this$0).setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }
    while (true)
    {
      ConfigurationActivity.access$3(this.this$0).setSelection(ConfigurationActivity.access$3(this.this$0).length());
      return;
      label49: ConfigurationActivity.access$3(this.this$0).setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */