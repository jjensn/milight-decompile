package com.irainxun.wifilight;

import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;

class ChangePwdActivity$1
  implements View.OnClickListener
{
  ChangePwdActivity$1(ChangePwdActivity paramChangePwdActivity)
  {
  }

  public void onClick(View paramView)
  {
    if (paramView == ChangePwdActivity.access$0(this.this$0))
      this.this$0.finish();
    while (paramView != ChangePwdActivity.access$1(this.this$0))
      return;
    if ((ChangePwdActivity.access$2(this.this$0).length() == 0) || (ChangePwdActivity.access$3(this.this$0).length() == 0))
    {
      new Toast(this.this$0);
      Toast localToast = Toast.makeText(this.this$0, "ERROR! Name is NULL", 1);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if ((ChangePwdActivity.access$2(this.this$0).length() == 4) && (ChangePwdActivity.access$3(this.this$0).length() == 4))
    {
      ChangePwdActivity.access$4(this.this$0, true);
      byte[] arrayOfByte = { 51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Log.d("debug", "light.mac = " + ChangePwdActivity.access$5().getMacAddress());
      if (MyApp.sendData(arrayOfByte, ChangePwdActivity.access$5()));
      Log.d("debug", "etOldPwd = " + ChangePwdActivity.access$2(this.this$0).getText().toString());
      Log.d("debug", "database password = " + MyApp.deviceService.getDevicePassword(ChangePwdActivity.access$5().getMacAddress()));
    }
    Log.d("debug", "btnOk");
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ChangePwdActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */