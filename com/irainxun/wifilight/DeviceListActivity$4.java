package com.irainxun.wifilight;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class DeviceListActivity$4
  implements View.OnClickListener
{
  DeviceListActivity$4(DeviceListActivity paramDeviceListActivity)
  {
  }

  public void onClick(View paramView)
  {
    if (paramView == DeviceListActivity.access$7(this.this$0))
    {
      localIntent1 = new Intent(this.this$0, MoreActivity.class);
      this.this$0.startActivity(localIntent1);
    }
    while (paramView != DeviceListActivity.access$8(this.this$0))
    {
      Intent localIntent1;
      return;
    }
    Intent localIntent2 = new Intent(this.this$0, ConfigurationActivity.class);
    localIntent2.putExtra("from", "deviceList");
    this.this$0.startActivity(localIntent2);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */