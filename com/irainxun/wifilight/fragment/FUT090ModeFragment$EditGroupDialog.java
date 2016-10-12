package com.irainxun.wifilight.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.diydevice;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

public class FUT090ModeFragment$EditGroupDialog extends Dialog
{
  private TextView btnCancel;
  private TextView btnOk;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      byte[] arrayOfByte = new byte[12];
      if (paramAnonymousView == FUT090ModeFragment.EditGroupDialog.this.btnCancel)
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = 2;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        MyApp.rain_setch = Integer.parseInt(FUT090ModeFragment.EditGroupDialog.this.etChannel.getText().toString());
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
      }
      do
      {
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        do
        {
          FUT090ModeFragment.EditGroupDialog.this.dismiss();
          return;
        }
        while (paramAnonymousView != FUT090ModeFragment.EditGroupDialog.this.btnOk);
      }
      while (FUT090ModeFragment.EditGroupDialog.this.etChannel.length() != 2);
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 0;
      arrayOfByte[5] = 2;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      MyApp.rain_setch = Integer.parseInt(FUT090ModeFragment.EditGroupDialog.this.etChannel.getText().toString());
      arrayOfByte[8] = (byte)MyApp.rain_setch;
      if (!MyApp.ch_zone)
        arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
      arrayOfByte[9] = (byte)MyApp.rain_setremo;
      arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      diydevice localdiydevice = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
      localdiydevice.zonech = new DecimalFormat("00").format(MyApp.rain_setch);
      localdiydevice.deviceid = new DecimalFormat("0000").format(MyApp.rain_setremo);
      if (!MyApp.ch_zone)
        FUT090ModeFragment.access$16(FUT090ModeFragment.EditGroupDialog.this.this$0).setText(localdiydevice.zonech);
      while (true)
      {
        MyApp.deviceService.diydevice_edit(localdiydevice);
        break;
        FUT090ModeFragment.access$16(FUT090ModeFragment.EditGroupDialog.this.this$0).setText(localdiydevice.deviceid);
      }
    }
  };
  private EditText etChannel;
  private String setCh;
  private String setRemo;
  private TextView testID;

  public FUT090ModeFragment$EditGroupDialog(FUT090ModeFragment paramFUT090ModeFragment, Context paramContext)
  {
    super(paramContext, R.style.EditLightDialog);
  }

  private FUT090ModeFragment$EditGroupDialog(FUT090ModeFragment paramFUT090ModeFragment, Context paramContext, int paramInt)
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
    this.testID = ((TextView)findViewById(R.id.testID));
    this.testID.setText("ID: " + this.setRemo);
    setCancelable(false);
    setCanceledOnTouchOutside(false);
    Window localWindow = getWindow();
    WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
    localLayoutParams.width = -1;
    localWindow.setAttributes(localLayoutParams);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ModeFragment.EditGroupDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */