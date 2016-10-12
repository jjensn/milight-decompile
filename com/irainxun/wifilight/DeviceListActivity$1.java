package com.irainxun.wifilight;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import com.irainxun.wifilight.xlink.manage.DeviceManage;
import io.xlink.wifi.sdk.XDevice;
import java.util.ArrayList;

class DeviceListActivity$1 extends Handler
{
  DeviceListActivity$1(DeviceListActivity paramDeviceListActivity)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1:
    }
    do
    {
      super.handleMessage(paramMessage);
      return;
    }
    while ((!DeviceListActivity.access$0(this.this$0)) || (DeviceListActivity.access$1(this.this$0) >= DeviceManage.getInstance().getDevices().size()));
    int i;
    if (((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getAccessKey() == 123456789)
    {
      Log.d("debug", "device mac = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getMacAddress());
      Log.d("debug", "device status = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).isConnect());
      Log.d("debug", "device net status = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).isConnect());
      Log.d("debug", "device net status = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getXDevice().isLAN());
      Log.d("debug", "device getDeviceConnectStates = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getXDevice().getDevcieConnectStates());
      if (((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getXDevice().getDevcieConnectStates() < 0)
        this.this$0.SetDeviceStatus(((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getXDevice(), 0);
      MyApp.Aiyuxun_ConnectDevice(((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getXDevice(), ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getAccessKey());
      i = 0;
      label415: if (i < DeviceListActivity.devices.size());
    }
    while (true)
    {
      DeviceListActivity localDeviceListActivity = this.this$0;
      DeviceListActivity.access$2(localDeviceListActivity, 1 + DeviceListActivity.access$1(localDeviceListActivity));
      DeviceListActivity.access$3(this.this$0).sendEmptyMessageDelayed(1, 4000L);
      break;
      if (((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getMacAddress().equals(((Device)DeviceListActivity.devices.get(i)).getMacAddress()))
      {
        if (((Device)DeviceListActivity.devices.get(i)).getPassword == 0)
          MyApp.sendData(new byte[] { 51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 51 }, (Device)DeviceListActivity.devices.get(i));
      }
      else
      {
        i++;
        break label415;
        Log.d("debug", "password = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getAccessKey());
        if (!((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0))).getXDevice().isInit())
          DeviceListActivity.setDevicePassword((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.access$1(this.this$0)), 123456789);
        Log.d("debug", "device mac set password!");
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */