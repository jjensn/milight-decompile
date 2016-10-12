package com.irainxun.wifilight;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.irainxun.wifilight.controller.FUT092Activity;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;

public class DeviceListActivity$PasswordDialog_Device extends Dialog
{
  private Button btnOk;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == DeviceListActivity.PasswordDialog_Device.this.btnOk)
      {
        String str1 = MyApp.deviceService.getDevicePassword(DeviceListActivity.access$6(DeviceListActivity.PasswordDialog_Device.this.this$0).getItem(DeviceListActivity.PasswordDialog_Device.this.device_id).getMacAddress());
        String str2 = DeviceListActivity.PasswordDialog_Device.this.etPwd.getText().toString().trim();
        if (str1.equals(str2))
        {
          Intent localIntent = new Intent(DeviceListActivity.PasswordDialog_Device.this.this$0, FUT092Activity.class);
          localIntent.putExtra("device-mac", DeviceListActivity.access$6(DeviceListActivity.PasswordDialog_Device.this.this$0).getItem(DeviceListActivity.PasswordDialog_Device.this.device_id));
          DeviceListActivity.PasswordDialog_Device.this.this$0.startActivity(localIntent);
          MyApp.deviceService.editcCPassword(DeviceListActivity.access$6(DeviceListActivity.PasswordDialog_Device.this.this$0).getItem(DeviceListActivity.PasswordDialog_Device.this.device_id).getMacAddress(), str2);
          DeviceListActivity.PasswordDialog_Device.this.dismiss();
        }
      }
      else
      {
        return;
      }
      Toast.makeText(DeviceListActivity.PasswordDialog_Device.this.getContext(), R.string.tips_pwd_error, 1).show();
    }
  };
  private int device_id = 0;
  private EditText etPwd;

  public DeviceListActivity$PasswordDialog_Device(DeviceListActivity paramDeviceListActivity, Context paramContext)
  {
    super(paramContext, R.style.pwdDialog);
  }

  private DeviceListActivity$PasswordDialog_Device(DeviceListActivity paramDeviceListActivity, Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }

  private void SetDeviceID(int paramInt)
  {
    this.device_id = paramInt;
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
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.PasswordDialog_Device
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */