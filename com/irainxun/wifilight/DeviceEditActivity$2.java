package com.irainxun.wifilight;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class DeviceEditActivity$2
  implements AdapterView.OnItemSelectedListener
{
  DeviceEditActivity$2(DeviceEditActivity paramDeviceEditActivity)
  {
  }

  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Log.d("debug", "first dispFlag = " + DeviceEditActivity.access$4(this.this$0));
    if (!DeviceEditActivity.access$11(this.this$0))
    {
      DeviceEditActivity.access$13(this.this$0, DeviceEditActivity.access$12(this.this$0).getItem(paramInt).intValue());
      DeviceEditActivity.access$14(this.this$0, 1);
      Log.d("debug", "icon seletc dispFlag = " + DeviceEditActivity.access$4(this.this$0));
      return;
    }
    DeviceEditActivity.access$15(this.this$0, false);
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceEditActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */