package com.irainxun.wifilight;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

class SmartSettingActivity$2
  implements CompoundButton.OnCheckedChangeListener
{
  SmartSettingActivity$2(SmartSettingActivity paramSmartSettingActivity)
  {
  }

  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramCompoundButton == SmartSettingActivity.access$1(this.this$0))
    {
      if (!paramBoolean)
        break label49;
      SmartSettingActivity.access$2(this.this$0).setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }
    while (true)
    {
      SmartSettingActivity.access$2(this.this$0).setSelection(SmartSettingActivity.access$2(this.this$0).length());
      return;
      label49: SmartSettingActivity.access$2(this.this$0).setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.SmartSettingActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */