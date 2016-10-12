package com.irainxun.wifilight;

import android.app.Dialog;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifidiyTime;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

class SetTimeActivity$5
  implements View.OnClickListener
{
  SetTimeActivity$5(SetTimeActivity paramSetTimeActivity, EditText paramEditText, boolean paramBoolean, Dialog paramDialog)
  {
  }

  public void onClick(View paramView)
  {
    String str = this.val$etWiFiPwd.getText().toString();
    wifidiyTime localwifidiyTime;
    int i;
    int j;
    if (!TextUtils.isEmpty(str))
    {
      localwifidiyTime = MyApp.deviceService.wifidiyTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
      i = Integer.parseInt(str);
      j = Integer.parseInt(localwifidiyTime.selectValue);
      if (this.val$mode)
        break label134;
      localwifidiyTime.zonech = new DecimalFormat("00").format(i);
      SetTimeActivity.access$18(this.this$0).setText("CH" + localwifidiyTime.zonech);
    }
    for (int k = j & 0xFFFFFFFB; ; k = j | 0x4)
    {
      localwifidiyTime.selectValue = Integer.toString(k);
      MyApp.deviceService.wifidiyTime_edit(localwifidiyTime);
      this.val$dialog.dismiss();
      return;
      label134: localwifidiyTime.deviceid = new DecimalFormat("0000").format(i);
      SetTimeActivity.access$20(this.this$0).setText("ID:" + localwifidiyTime.deviceid);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.SetTimeActivity.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */