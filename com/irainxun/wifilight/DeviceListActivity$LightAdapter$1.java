package com.irainxun.wifilight;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.irainxun.wifilight.xlink.bean.Device;

class DeviceListActivity$LightAdapter$1
  implements View.OnClickListener
{
  DeviceListActivity$LightAdapter$1(DeviceListActivity.LightAdapter paramLightAdapter, Device paramDevice)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(DeviceListActivity.LightAdapter.access$1(this.this$1), DeviceEditActivity.class);
    localIntent.putExtra("light", this.val$item);
    DeviceListActivity.LightAdapter.access$1(this.this$1).startActivityForResult(localIntent, 100);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.LightAdapter.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */