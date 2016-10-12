package com.irainxun.wifilight.xlink;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;
import com.irainxun.wifilight.xlink.util.SharedPreferencesUtil;

class AuthActivity$3
  implements DialogInterface.OnClickListener
{
  AuthActivity$3(AuthActivity paramAuthActivity, EditText paramEditText1, EditText paramEditText2, EditText paramEditText3)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str1 = this.val$edit_company_id.getText().toString().trim();
    String str2 = this.val$edit_email.getText().toString().trim();
    String str3 = this.val$edit_passwd.getText().toString().trim();
    com.irainxun.wifilight.xlink.http.HttpManage.COMPANY_ID = str1;
    SharedPreferencesUtil.keepShared("COMPANY_ID", str1);
    SharedPreferencesUtil.keepShared("EMAIL_ID", str2);
    SharedPreferencesUtil.keepShared("PASSWD_ID", str3);
    this.this$0.registerUser();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.AuthActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */