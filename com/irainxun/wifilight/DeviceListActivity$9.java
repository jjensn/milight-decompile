package com.irainxun.wifilight;

import android.app.Dialog;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;

class DeviceListActivity$9
  implements View.OnClickListener
{
  DeviceListActivity$9(DeviceListActivity paramDeviceListActivity, EditText paramEditText, Dialog paramDialog)
  {
  }

  public void onClick(View paramView)
  {
    String str1 = this.val$etWiFiPwd.getText().toString();
    if (!TextUtils.isEmpty(str1))
    {
      String str2 = MyApp.deviceService.getDevicePassword(this.this$0.logoinDevice.getMacAddress());
      if (str2.equals(str1))
      {
        MyApp.DeviceControl = this.this$0.logoinDevice;
        Conversion.hexStringtoByte(str2, MyApp.PasswordByte);
        MyApp.deviceService.editcCPassword(this.this$0.logoinDevice.getMacAddress(), str1);
        DeviceListActivity.access$12(this.this$0);
        this.val$dialog.dismiss();
        return;
      }
      Toast.makeText(this.this$0, R.string.tips_pwd_error, 0).show();
      return;
    }
    Toast.makeText(this.this$0, R.string.tips_name_empty, 1).show();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */