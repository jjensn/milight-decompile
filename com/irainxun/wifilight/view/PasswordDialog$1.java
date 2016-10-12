package com.irainxun.wifilight.view;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

class PasswordDialog$1
  implements View.OnClickListener
{
  PasswordDialog$1(PasswordDialog paramPasswordDialog)
  {
  }

  public void onClick(View paramView)
  {
    if (paramView == PasswordDialog.access$0(this.this$0))
    {
      if ("0000".equals(PasswordDialog.access$1(this.this$0).getText().toString().trim()))
        this.this$0.dismiss();
    }
    else
      return;
    Toast.makeText(this.this$0.getContext(), R.string.tips_pwd_error, 1).show();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.PasswordDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */