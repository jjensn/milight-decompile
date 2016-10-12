package com.irainxun.wifilight.apsetting.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.irainxun.wifilight.apsetting.utils.Utils;

class SettingActivity$2
  implements Preference.OnPreferenceClickListener
{
  SettingActivity$2(SettingActivity paramSettingActivity, EditTextPreference paramEditTextPreference)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    final Dialog localDialog = this.val$editTextPreference.getDialog();
    Button localButton = (Button)localDialog.findViewById(Utils.getAndroidInternalId("button1"));
    final EditText localEditText = (EditText)localDialog.findViewById(Utils.getAndroidInternalId("edit"));
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        new AlertDialog.Builder(SettingActivity.2.this.this$0).setTitle("R.string.warning").setMessage("R.string.comfirm_modify").setPositiveButton("R.string.yes", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            this.val$editTextPreference.setText(this.val$editText.getText().toString().trim());
            SettingActivity.access$1(SettingActivity.2.this.this$0, this.val$editTextPreference);
            this.val$dialog.dismiss();
          }
        }).setNegativeButton("R.string.no", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            this.val$dialog.dismiss();
          }
        }).create().show();
      }
    });
    return false;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.SettingActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */