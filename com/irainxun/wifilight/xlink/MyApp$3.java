package com.irainxun.wifilight.xlink;

import android.util.Log;
import com.irainxun.wifilight.xlink.manage.DeviceManage;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkAgent;
import io.xlink.wifi.sdk.listener.ConnectDeviceListener;
import java.util.ArrayList;

class MyApp$3 extends ConnectDeviceListener
{
  MyApp$3()
  {
  }

  public void onConnectDevice(XDevice paramXDevice, int paramInt)
  {
    for (int i = 0; ; i++)
    {
      if (i >= MyApp.access$3().size());
      switch (paramInt)
      {
      case 104:
      case 110:
      case 111:
      case 200:
      default:
        return;
        ((MyApp.OnDeviceMessage)MyApp.access$3().get(i)).Aiyuxun_DeviceNetStatus(paramXDevice, paramInt);
      case 0:
      case 1:
      case 102:
      }
    }
    DeviceManage.getInstance().updateDevice(paramXDevice);
    Log.d("debug", "内网");
    XlinkAgent.getInstance().sendProbe(paramXDevice);
    return;
    Log.d("debug", "云端");
    DeviceManage.getInstance().updateDevice(paramXDevice);
    DeviceManage.getInstance().addDevice(paramXDevice);
    return;
    Log.d("debug", "device key false");
    Log.e("MyApp", "Device:" + paramXDevice.getMacAddress() + "设备认证失败");
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.MyApp.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */