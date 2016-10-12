package com.irainxun.wifilight.apsetting.android;

import android.app.AlertDialog;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

class SettingActivity$1
  implements Preference.OnPreferenceClickListener
{
  SettingActivity$1(SettingActivity paramSettingActivity)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    final EditText localEditText = SettingActivity.access$0(this.this$0).getEditText();
    localEditText.addTextChangedListener(new TextWatcher()
    {
      public void afterTextChanged(Editable paramAnonymousEditable)
      {
      }

      public void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        try
        {
          int i = Integer.valueOf(localEditText.getText().toString()).intValue();
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

      public void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        try
        {
          int i = Integer.valueOf(localEditText.getText().toString()).intValue();
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
    });
    return false;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.SettingActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */