package com.irainxun.wifilight;

import android.util.Log;
import com.irainxun.wifilight.xlink.bean.Device;
import com.irainxun.wifilight.xlink.manage.DeviceManage;
import com.irainxun.wifilight.xlink.util.XlinkUtils;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.listener.ScanDeviceListener;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

class DeviceListActivity$3 extends ScanDeviceListener
{
  DeviceListActivity$3(DeviceListActivity paramDeviceListActivity)
  {
  }

  public void onGotDeviceByScan(XDevice paramXDevice)
  {
    XlinkUtils.shortTips("扫描到设备:" + paramXDevice.getMacAddress());
    XlinkUtils.shortTips("设备名字:" + paramXDevice.getDeviceName());
    Log.d("debug", "设备名字:" + paramXDevice.getDeviceName());
    Device localDevice;
    if (DeviceListActivity.access$5(this.this$0))
    {
      DeviceManage.getInstance().addDevice(paramXDevice);
      localDevice = (Device)DeviceManage.deviceMap.get(paramXDevice.getMacAddress());
      if (localDevice != null)
      {
        if (DeviceListActivity.devices.size() != 0)
          break label132;
        DeviceListActivity.devices.add(localDevice);
        DeviceListActivity.access$6(this.this$0).notifyDataSetChanged();
      }
    }
    return;
    label132: label229: for (int i = 0; ; i++)
    {
      int j = DeviceListActivity.devices.size();
      int k = 0;
      if (i >= j);
      while (k == 0)
      {
        DeviceListActivity.devices.add(localDevice);
        XlinkUtils.shortTips("device mac = " + paramXDevice.getMacAddress());
        DeviceListActivity.access$6(this.this$0).notifyDataSetChanged();
        return;
        if (!((Device)DeviceListActivity.devices.get(i)).getMacAddress().equals(paramXDevice.getMacAddress()))
          break label229;
        k = 1;
      }
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */