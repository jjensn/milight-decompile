package com.irainxun.wifilight;

import android.util.Log;
import com.irainxun.wifilight.xlink.bean.Device;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.listener.SetDeviceAccessKeyListener;

class DeviceListActivity$6 extends SetDeviceAccessKeyListener
{
  DeviceListActivity$6(Device paramDevice, int paramInt)
  {
  }

  public void onSetLocalDeviceAccessKey(XDevice paramXDevice, int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      DeviceListActivity.access$11(this.val$device, paramInt1);
    case 0:
    }
    while (true)
    {
      Log.d("debug", "设置默认密码:" + paramInt1);
      return;
      DeviceListActivity.access$10(this.val$device, this.val$device.getXDevice(), this.val$password);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */