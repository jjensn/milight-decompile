package com.irainxun.wifilight.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordDialog extends Dialog
{
  private Button btnOk;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == PasswordDialog.this.btnOk)
      {
        if ("0000".equals(PasswordDialog.this.etPwd.getText().toString().trim()))
          PasswordDialog.this.dismiss();
      }
      else
        return;
      Toast.makeText(PasswordDialog.this.getContext(), R.string.tips_pwd_error, 1).show();
    }
  };
  private EditText etPwd;

  public PasswordDialog(Context paramContext)
  {
    super(paramContext, R.style.pwdDialog);
  }

  private PasswordDialog(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.dialog_password);
    this.etPwd = ((EditText)findViewById(R.id.et_pwd));
    this.btnOk = ((Button)findViewById(R.id.btn_ok));
    this.btnOk.setOnClickListener(this.clickListener);
    setCancelable(false);
    setCanceledOnTouchOutside(false);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.PasswordDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */