package com.irainxun.wifilight;

import android.view.View;
import android.view.View.OnClickListener;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import com.irainxun.wifilight.xlink.manage.DeviceManage;
import java.util.ArrayList;

class DeviceListActivity$LightAdapter$2
  implements View.OnClickListener
{
  DeviceListActivity$LightAdapter$2(DeviceListActivity.LightAdapter paramLightAdapter, int paramInt)
  {
  }

  public void onClick(View paramView)
  {
    Device localDevice = (Device)DeviceListActivity.devices.get(this.val$position);
    String str1 = String.valueOf(localDevice.getMacAddress()) + "aa";
    if (MyApp.deviceService.wifiLight_isDeviceExists(str1))
      MyApp.deviceService.tab1_delDevice(str1);
    String str2 = String.valueOf(localDevice.getMacAddress()) + "00";
    if (MyApp.deviceService.wifiLight_isDeviceExists(str2))
      MyApp.deviceService.tab1_delDevice(str2);
    String str3 = String.valueOf(localDevice.getMacAddress()) + "01";
    MyApp.deviceService.zoneName_delDevice(str3);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str3))
      MyApp.deviceService.tab1_delDevice(str3);
    String str4 = String.valueOf(localDevice.getMacAddress()) + "02";
    MyApp.deviceService.zoneName_delDevice(str4);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str4))
      MyApp.deviceService.tab1_delDevice(str4);
    String str5 = String.valueOf(localDevice.getMacAddress()) + "03";
    MyApp.deviceService.zoneName_delDevice(str5);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str5))
      MyApp.deviceService.tab1_delDevice(str5);
    String str6 = String.valueOf(localDevice.getMacAddress()) + "04";
    MyApp.deviceService.zoneName_delDevice(str6);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str6))
      MyApp.deviceService.tab1_delDevice(str6);
    String str7 = String.valueOf(localDevice.getMacAddress()) + "05";
    MyApp.deviceService.zoneName_delDevice(str7);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str7))
      MyApp.deviceService.tab1_delDevice(str7);
    String str8 = String.valueOf(localDevice.getMacAddress()) + "06";
    MyApp.deviceService.zoneName_delDevice(str8);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str8))
      MyApp.deviceService.tab1_delDevice(str8);
    String str9 = String.valueOf(localDevice.getMacAddress()) + "07";
    MyApp.deviceService.zoneName_delDevice(str9);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str9))
      MyApp.deviceService.tab1_delDevice(str9);
    String str10 = String.valueOf(localDevice.getMacAddress()) + "08";
    MyApp.deviceService.zoneName_delDevice(str10);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str10))
      MyApp.deviceService.tab1_delDevice(str10);
    String str11 = String.valueOf(localDevice.getMacAddress()) + "09";
    MyApp.deviceService.zoneName_delDevice(str11);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str11))
      MyApp.deviceService.tab1_delDevice(str11);
    String str12 = String.valueOf(localDevice.getMacAddress()) + "10";
    MyApp.deviceService.zoneName_delDevice(str12);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str12))
      MyApp.deviceService.tab1_delDevice(str12);
    MyApp.deviceService.delDevice(localDevice.getMacAddress());
    if (MyApp.deviceService.wifiLightTime_isDeviceExists(localDevice.getMacAddress()))
      MyApp.deviceService.wifiLightTime_delDevice(localDevice.getMacAddress());
    DeviceManage.getInstance().removeDevice(localDevice.getMacAddress());
    DeviceListActivity.devices.remove(localDevice);
    this.this$1.notifyDataSetChanged();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.LightAdapter.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */