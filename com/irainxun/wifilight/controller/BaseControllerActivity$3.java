package com.irainxun.wifilight.controller;

import android.app.Dialog;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;

class BaseControllerActivity$3
  implements AdapterView.OnItemClickListener
{
  BaseControllerActivity$3(BaseControllerActivity paramBaseControllerActivity, Dialog paramDialog)
  {
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Log.d("debug", "onItemClick = " + paramInt);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    }
    while (true)
    {
      MyApp.deviceService.editcLogin(MyApp.DeviceControl.getMacAddress(), BaseControllerActivity.access$6(this.this$0));
      if (BaseControllerActivity.access$8(this.this$0) == BaseControllerActivity.access$6(this.this$0))
        break label363;
      if (((BaseControllerActivity.access$6(this.this$0) != 10) && (BaseControllerActivity.access$6(this.this$0) != 11) && (BaseControllerActivity.access$6(this.this$0) != 12)) || ((BaseControllerActivity.access$8(this.this$0) != 10) && (BaseControllerActivity.access$8(this.this$0) != 11) && (BaseControllerActivity.access$8(this.this$0) != 12)))
        break;
      this.val$dialog.dismiss();
      return;
      MyApp.rain_remoteID = 8;
      continue;
      MyApp.rain_remoteID = 7;
      continue;
      MyApp.rain_remoteID = 6;
      continue;
      MyApp.rain_remoteID = 5;
      continue;
      MyApp.rain_remoteID = 4;
      continue;
      MyApp.rain_remoteID = 4;
      continue;
      MyApp.rain_remoteID = 4;
      continue;
      MyApp.rain_remoteID = 2;
      continue;
      MyApp.rain_remoteID = 3;
      continue;
      MyApp.rain_remoteID = 1;
      continue;
      MyApp.rain_remoteID = 9;
    }
    if (((BaseControllerActivity.access$6(this.this$0) == 1) || (BaseControllerActivity.access$6(this.this$0) == 2)) && ((BaseControllerActivity.access$8(this.this$0) == 1) || (BaseControllerActivity.access$8(this.this$0) == 2)))
    {
      this.val$dialog.dismiss();
      return;
    }
    this.this$0.finish();
    this.val$dialog.dismiss();
    BaseControllerActivity.access$9(this.this$0);
    return;
    label363: this.val$dialog.dismiss();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.BaseControllerActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */