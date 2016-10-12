package com.irainxun.wifilight;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;

class DeviceListActivity$5
  implements AdapterView.OnItemClickListener
{
  DeviceListActivity$5(DeviceListActivity paramDeviceListActivity)
  {
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (!MyApp.getApp().auth)
    {
      Log.d("debug", "非法启动");
      MyApp.getApp().auth = true;
      this.this$0.finish();
    }
    do
    {
      return;
      Log.d("debug", " onItemClick pos:" + paramInt);
      String str1 = MyApp.deviceService.getDeviceCPassword(DeviceListActivity.access$6(this.this$0).getItem(paramInt).getMacAddress());
      String str2 = MyApp.deviceService.getDevicePassword(DeviceListActivity.access$6(this.this$0).getItem(paramInt).getMacAddress());
      Log.d("debug", "password CPassword = " + str1);
      Log.d("debug", "password Password = " + str2);
    }
    while (DeviceListActivity.access$6(this.this$0).getItem(paramInt).status <= 0);
    byte[] arrayOfByte = new byte[12];
    this.this$0.logoinDevice = DeviceListActivity.access$6(this.this$0).getItem(paramInt);
    MyApp.DeviceControl = this.this$0.logoinDevice;
    DeviceListActivity.access$9(this.this$0, true);
    arrayOfByte[0] = 51;
    arrayOfByte[1] = 0;
    arrayOfByte[2] = 0;
    arrayOfByte[3] = 0;
    arrayOfByte[4] = 0;
    arrayOfByte[5] = 0;
    arrayOfByte[6] = 0;
    arrayOfByte[7] = 0;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = 0;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 51;
    MyApp.sendData(arrayOfByte, DeviceListActivity.access$6(this.this$0).getItem(paramInt));
    Log.d("debug", "send data to get password");
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */