package com.irainxun.wifilight;

import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.irainxun.wifilight.controller.FUT092Activity;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;

class DeviceListActivity$PasswordDialog_Device$1
  implements View.OnClickListener
{
  DeviceListActivity$PasswordDialog_Device$1(DeviceListActivity.PasswordDialog_Device paramPasswordDialog_Device)
  {
  }

  public void onClick(View paramView)
  {
    if (paramView == DeviceListActivity.PasswordDialog_Device.access$0(this.this$1))
    {
      String str1 = MyApp.deviceService.getDevicePassword(DeviceListActivity.access$6(DeviceListActivity.PasswordDialog_Device.access$3(this.this$1)).getItem(DeviceListActivity.PasswordDialog_Device.access$1(this.this$1)).getMacAddress());
      String str2 = DeviceListActivity.PasswordDialog_Device.access$2(this.this$1).getText().toString().trim();
      if (str1.equals(str2))
      {
        Intent localIntent = new Intent(DeviceListActivity.PasswordDialog_Device.access$3(this.this$1), FUT092Activity.class);
        localIntent.putExtra("device-mac", DeviceListActivity.access$6(DeviceListActivity.PasswordDialog_Device.access$3(this.this$1)).getItem(DeviceListActivity.PasswordDialog_Device.access$1(this.this$1)));
        DeviceListActivity.PasswordDialog_Device.access$3(this.this$1).startActivity(localIntent);
        MyApp.deviceService.editcCPassword(DeviceListActivity.access$6(DeviceListActivity.PasswordDialog_Device.access$3(this.this$1)).getItem(DeviceListActivity.PasswordDialog_Device.access$1(this.this$1)).getMacAddress(), str2);
        this.this$1.dismiss();
      }
    }
    else
    {
      return;
    }
    Toast.makeText(this.this$1.getContext(), R.string.tips_pwd_error, 1).show();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.PasswordDialog_Device.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */