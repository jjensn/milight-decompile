package com.irainxun.wifilight.fragment;

import android.app.Dialog;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.diydevice;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

class FUT090ColorFragment$10
  implements View.OnClickListener
{
  FUT090ColorFragment$10(FUT090ColorFragment paramFUT090ColorFragment, EditText paramEditText, boolean paramBoolean, Dialog paramDialog)
  {
  }

  public void onClick(View paramView)
  {
    String str = this.val$etWiFiPwd.getText().toString();
    diydevice localdiydevice;
    if (!TextUtils.isEmpty(str))
    {
      localdiydevice = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
      MyApp.rain_setch = Integer.parseInt(localdiydevice.zonech);
      MyApp.rain_setremo = Integer.parseInt(localdiydevice.deviceid);
      if (this.val$mode)
        break label134;
      MyApp.rain_setch = Integer.parseInt(str);
      localdiydevice.zonech = new DecimalFormat("00").format(MyApp.rain_setch);
      FUT090ColorFragment.access$27(this.this$0).setText(localdiydevice.zonech);
    }
    while (true)
    {
      MyApp.deviceService.diydevice_edit(localdiydevice);
      this.val$dialog.dismiss();
      return;
      label134: MyApp.rain_setremo = Integer.parseInt(str);
      localdiydevice.deviceid = new DecimalFormat("0000").format(MyApp.rain_setremo);
      FUT090ColorFragment.access$27(this.this$0).setText(localdiydevice.deviceid);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ColorFragment.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */