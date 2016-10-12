package com.irainxun.wifilight.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

public class EditGroupDialog extends Dialog
{
  private TextView btnCancel;
  private TextView btnOk;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      byte[] arrayOfByte = new byte[12];
      if (paramAnonymousView == EditGroupDialog.this.btnCancel)
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = 2;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        MyApp.rain_setch = Integer.parseInt(EditGroupDialog.this.etChannel.getText().toString());
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        MyApp.rain_setremo = Integer.parseInt(EditGroupDialog.this.etID.getText().toString());
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      }
      while (true)
      {
        EditGroupDialog.this.dismiss();
        return;
        if (paramAnonymousView == EditGroupDialog.this.btnOk)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 0;
          arrayOfByte[5] = 2;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          MyApp.rain_setch = Integer.parseInt(EditGroupDialog.this.etChannel.getText().toString());
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          MyApp.rain_setremo = Integer.parseInt(EditGroupDialog.this.etID.getText().toString());
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        }
      }
    }
  };
  private EditText etChannel;
  private EditText etID;
  private String setCh;
  private String setRemo;

  public EditGroupDialog(Context paramContext)
  {
    super(paramContext, R.style.EditLightDialog);
  }

  private EditGroupDialog(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }

  public void EditGroupDialogInit(String paramString1, String paramString2)
  {
    this.setRemo = paramString1;
    this.setCh = paramString2;
    Log.d("debug", "setRemo = " + this.setRemo);
    Log.d("debug", "setCh = " + this.setCh);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.dialog_fut090_edit_group);
    this.etChannel = ((EditText)findViewById(R.id.et_channel));
    this.btnOk = ((TextView)findViewById(R.id.tv_ok));
    this.btnCancel = ((TextView)findViewById(R.id.tv_cancel));
    this.btnOk.setOnClickListener(this.clickListener);
    this.btnCancel.setOnClickListener(this.clickListener);
    this.etChannel.setText(this.setCh);
    this.etID.setText(this.setRemo);
    setCancelable(false);
    setCanceledOnTouchOutside(false);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.EditGroupDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */