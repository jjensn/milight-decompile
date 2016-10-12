package com.irainxun.wifilight.apsetting.android;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.preference.EditTextPreference;
import android.text.Editable;
import android.widget.EditText;

class SettingActivity$2$1$1
  implements DialogInterface.OnClickListener
{
  SettingActivity$2$1$1(SettingActivity.2.1 param1, EditTextPreference paramEditTextPreference, EditText paramEditText, Dialog paramDialog)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.val$editTextPreference.setText(this.val$editText.getText().toString().trim());
    SettingActivity.access$1(SettingActivity.2.access$0(SettingActivity.2.1.access$0(this.this$2)), this.val$editTextPreference);
    this.val$dialog.dismiss();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.SettingActivity.2.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */