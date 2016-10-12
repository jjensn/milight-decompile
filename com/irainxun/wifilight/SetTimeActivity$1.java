package com.irainxun.wifilight;

import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifiLightTime;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;

class SetTimeActivity$1
  implements View.OnClickListener
{
  SetTimeActivity$1(SetTimeActivity paramSetTimeActivity)
  {
  }

  public void onClick(View paramView)
  {
    MyApp.PlalyKeySound();
    if (paramView == SetTimeActivity.access$0(this.this$0))
      this.this$0.finish();
    do
    {
      do
        return;
      while (paramView == SetTimeActivity.access$1(this.this$0));
      if (paramView == SetTimeActivity.access$2(this.this$0))
      {
        SetTimeActivity.access$2(this.this$0).setBackgroundColor(Color.parseColor("#B4B4B4"));
        SetTimeActivity.access$3(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$4(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$5(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$6(this.this$0, 1);
        return;
      }
      if (paramView == SetTimeActivity.access$7(this.this$0))
      {
        SetTimeActivity.access$2(this.this$0).setBackgroundColor(Color.parseColor("#B4B4B4"));
        SetTimeActivity.access$3(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$4(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$5(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$6(this.this$0, 1);
        if (!SetTimeActivity.access$8(this.this$0))
        {
          SetTimeActivity.access$9(this.this$0, true);
          return;
        }
        SetTimeActivity.access$10(this.this$0, true);
        return;
      }
      if (paramView == SetTimeActivity.access$3(this.this$0))
      {
        SetTimeActivity.access$2(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$3(this.this$0).setBackgroundColor(Color.parseColor("#B4B4B4"));
        SetTimeActivity.access$4(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$5(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$6(this.this$0, 2);
        return;
      }
      if (paramView == SetTimeActivity.access$11(this.this$0))
      {
        SetTimeActivity.access$2(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$3(this.this$0).setBackgroundColor(Color.parseColor("#B4B4B4"));
        SetTimeActivity.access$4(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$5(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$6(this.this$0, 2);
        if (!SetTimeActivity.access$8(this.this$0))
        {
          SetTimeActivity.access$9(this.this$0, false);
          return;
        }
        SetTimeActivity.access$10(this.this$0, false);
        return;
      }
      if (paramView == SetTimeActivity.access$4(this.this$0))
      {
        SetTimeActivity.access$4(this.this$0).setBackgroundColor(Color.parseColor("#B4B4B4"));
        SetTimeActivity.access$5(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$2(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$3(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$6(this.this$0, 3);
        return;
      }
      if (paramView == SetTimeActivity.access$12(this.this$0))
      {
        SetTimeActivity.access$4(this.this$0).setBackgroundColor(Color.parseColor("#B4B4B4"));
        SetTimeActivity.access$5(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$2(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$3(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$6(this.this$0, 3);
        wifiLightTime localwifiLightTime2 = MyApp.deviceService.wifiLightTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
        int k = Integer.parseInt(localwifiLightTime2.selectValue);
        int m;
        if (!SetTimeActivity.access$13(this.this$0))
        {
          SetTimeActivity.access$14(this.this$0, true);
          m = k | 0x1;
          SetTimeActivity.access$12(this.this$0).setBackgroundResource(R.drawable.choice_on);
        }
        while (true)
        {
          localwifiLightTime2.selectValue = Integer.toString(m);
          MyApp.deviceService.wifiLightTime_edit(localwifiLightTime2);
          return;
          SetTimeActivity.access$14(this.this$0, false);
          m = k & 0xFFFFFFFE;
          SetTimeActivity.access$12(this.this$0).setBackgroundResource(R.drawable.choice_off);
        }
      }
      if (paramView == SetTimeActivity.access$5(this.this$0))
      {
        SetTimeActivity.access$5(this.this$0).setBackgroundColor(Color.parseColor("#B4B4B4"));
        SetTimeActivity.access$4(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$2(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$3(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$6(this.this$0, 4);
        return;
      }
      if (paramView == SetTimeActivity.access$15(this.this$0))
      {
        SetTimeActivity.access$5(this.this$0).setBackgroundColor(Color.parseColor("#B4B4B4"));
        SetTimeActivity.access$4(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$2(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$3(this.this$0).setBackgroundResource(R.drawable.white);
        SetTimeActivity.access$6(this.this$0, 4);
        wifiLightTime localwifiLightTime1 = MyApp.deviceService.wifiLightTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
        int i = Integer.parseInt(localwifiLightTime1.selectValue);
        int j;
        if (!SetTimeActivity.access$16(this.this$0))
        {
          SetTimeActivity.access$17(this.this$0, true);
          j = i | 0x2;
          SetTimeActivity.access$15(this.this$0).setBackgroundResource(R.drawable.choice_on);
        }
        while (true)
        {
          localwifiLightTime1.selectValue = Integer.toString(j);
          MyApp.deviceService.wifiLightTime_edit(localwifiLightTime1);
          return;
          SetTimeActivity.access$17(this.this$0, false);
          j = i & 0xFFFFFFFD;
          SetTimeActivity.access$15(this.this$0).setBackgroundResource(R.drawable.choice_off);
        }
      }
      if (paramView == SetTimeActivity.access$18(this.this$0))
      {
        SetTimeActivity.access$19(this.this$0, false);
        return;
      }
    }
    while (paramView != SetTimeActivity.access$20(this.this$0));
    SetTimeActivity.access$19(this.this$0, true);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.SetTimeActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */