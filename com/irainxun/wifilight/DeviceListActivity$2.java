package com.irainxun.wifilight;

import android.os.Handler;
import android.util.Log;
import com.irainxun.wifilight.view.SearchDialog;

class DeviceListActivity$2
  implements Runnable
{
  DeviceListActivity$2(DeviceListActivity paramDeviceListActivity)
  {
  }

  public void run()
  {
    Log.d("debug", "time count = " + this.this$0.count);
    DeviceListActivity localDeviceListActivity = this.this$0;
    localDeviceListActivity.count = (1 + localDeviceListActivity.count);
    if (this.this$0.count < 7)
      DeviceListActivity.access$4(this.this$0).postDelayed(this.this$0.runnable, 800L);
    while (this.this$0.searchDialog == null)
      return;
    this.this$0.searchDialog.dismiss();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */