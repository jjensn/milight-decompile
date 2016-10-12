package com.irainxun.wifilight.xlink;

import android.app.Dialog;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.irainxun.wifilight.Conversion;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.bean.Device;

class MyApp$9
  implements View.OnClickListener
{
  MyApp$9(MyApp paramMyApp, EditText paramEditText, Dialog paramDialog)
  {
  }

  public void onClick(View paramView)
  {
    String str1 = this.val$etWiFiPwd.getText().toString();
    if (!TextUtils.isEmpty(str1))
    {
      String str2 = MyApp.deviceService.getDevicePassword(MyApp.DeviceControl.getMacAddress());
      if (str2.equals(str1))
      {
        Conversion.hexStringtoByte(str2, MyApp.PasswordByte);
        MyApp.deviceService.editcCPassword(MyApp.DeviceControl.getMacAddress(), str1);
        this.val$dialog.dismiss();
        MyApp.access$7(this.this$0, false);
        return;
      }
      Toast.makeText(MyApp.access$8(), R.string.password_error, 0).show();
      return;
    }
    Toast.makeText(MyApp.access$8(), R.string.tips_name_empty, 1).show();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.MyApp.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */