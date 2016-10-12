package com.irainxun.wifilight.apsetting.android;

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

class SettingActivity$1$1
  implements TextWatcher
{
  SettingActivity$1$1(SettingActivity.1 param1, EditText paramEditText, AlertDialog paramAlertDialog)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      int i = Integer.valueOf(this.val$editText.getText().toString()).intValue();
      if ((i >= 0) && (i <= 65535))
      {
        this.val$dialog.getButton(-1).setEnabled(true);
        return;
      }
      this.val$dialog.getButton(-1).setEnabled(false);
      return;
    }
    catch (Exception localException)
    {
      this.val$dialog.getButton(-1).setEnabled(false);
    }
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      int i = Integer.valueOf(this.val$editText.getText().toString()).intValue();
      if ((i >= 0) && (i <= 65535))
      {
        this.val$dialog.getButton(-1).setEnabled(true);
        return;
      }
      this.val$dialog.getButton(-1).setEnabled(false);
      return;
    }
    catch (Exception localException)
    {
      this.val$dialog.getButton(-1).setEnabled(false);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.SettingActivity.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */