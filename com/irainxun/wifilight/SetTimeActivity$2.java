package com.irainxun.wifilight;

import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifiLightTime;
import com.irainxun.wifilight.view.wheelview.OnWheelChangedListener;
import com.irainxun.wifilight.view.wheelview.WheelAdapter;
import com.irainxun.wifilight.view.wheelview.WheelView;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;

class SetTimeActivity$2
  implements OnWheelChangedListener
{
  SetTimeActivity$2(SetTimeActivity paramSetTimeActivity)
  {
  }

  public void onChanged(WheelView paramWheelView, int paramInt1, int paramInt2)
  {
    MyApp.PlalyKeySound();
    String str1 = SetTimeActivity.access$21(this.this$0).getItem(SetTimeActivity.access$22(this.this$0).getCurrentItem());
    String str2 = SetTimeActivity.access$23(this.this$0).getItem(SetTimeActivity.access$24(this.this$0).getCurrentItem());
    if (SetTimeActivity.access$25(this.this$0) == 1)
    {
      SetTimeActivity.access$26(this.this$0).setText(String.valueOf(str1) + ":" + str2);
      if (!SetTimeActivity.access$8(this.this$0))
        SetTimeActivity.access$27(this.this$0, str1, str2);
    }
    do
    {
      return;
      SetTimeActivity.access$28(this.this$0, str1, str2);
      return;
      if (SetTimeActivity.access$25(this.this$0) == 2)
      {
        SetTimeActivity.access$29(this.this$0).setText(String.valueOf(str1) + ":" + str2);
        if (!SetTimeActivity.access$8(this.this$0))
        {
          SetTimeActivity.access$30(this.this$0, str1, str2);
          return;
        }
        SetTimeActivity.access$31(this.this$0, str1, str2);
        return;
      }
      if (SetTimeActivity.access$25(this.this$0) == 3)
      {
        SetTimeActivity.access$32(this.this$0).setText(String.valueOf(str1) + ":" + str2);
        wifiLightTime localwifiLightTime2 = MyApp.deviceService.wifiLightTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
        localwifiLightTime2.on_hour = str1;
        localwifiLightTime2.on_minute = str2;
        MyApp.deviceService.wifiLightTime_edit(localwifiLightTime2);
        return;
      }
    }
    while (SetTimeActivity.access$25(this.this$0) != 4);
    SetTimeActivity.access$33(this.this$0).setText(String.valueOf(str1) + ":" + str2);
    wifiLightTime localwifiLightTime1 = MyApp.deviceService.wifiLightTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
    localwifiLightTime1.off_hour = str1;
    localwifiLightTime1.off_minute = str2;
    MyApp.deviceService.wifiLightTime_edit(localwifiLightTime1);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.SetTimeActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */