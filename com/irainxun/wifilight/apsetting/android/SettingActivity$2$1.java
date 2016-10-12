package com.irainxun.wifilight.apsetting.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.preference.EditTextPreference;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class SettingActivity$2$1
  implements View.OnClickListener
{
  SettingActivity$2$1(SettingActivity.2 param2, EditTextPreference paramEditTextPreference, EditText paramEditText, Dialog paramDialog)
  {
  }

  public void onClick(View paramView)
  {
    new AlertDialog.Builder(SettingActivity.2.access$0(this.this$1)).setTitle("R.string.warning").setMessage("R.string.comfirm_modify").setPositiveButton("R.string.yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        this.val$editTextPreference.setText(this.val$editText.getText().toString().trim());
        SettingActivity.access$1(SettingActivity.2.access$0(SettingActivity.2.1.this.this$1), this.val$editTextPreference);
        this.val$dialog.dismiss();
      }
    }).setNegativeButton("R.string.no", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        this.val$dialog.dismiss();
      }
    }).create().show();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.SettingActivity.2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */