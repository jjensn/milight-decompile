package com.irainxun.wifilight.xlink;

import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.irainxun.wifilight.DeviceListActivity;
import com.irainxun.wifilight.xlink.bean.Device;
import com.irainxun.wifilight.xlink.manage.DeviceManage;
import com.irainxun.wifilight.xlink.util.SharedPreferencesUtil;
import com.irainxun.wifilight.xlink.util.XlinkUtils;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkAgent;
import java.util.ArrayList;

class MyApp$1 extends Handler
{
  MyApp$1(MyApp paramMyApp)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      return;
      if (this.this$0.deviceCount < DeviceManage.getInstance().getDevices().size())
      {
        if ((MyApp.DeviceControl != null) && (MyApp.DeviceControl == DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)))
        {
          if (((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).getAccessKey() != 123456789)
            break label438;
          Log.d("debug", "device mac = " + ((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).getMacAddress());
          Log.d("debug", "device status = " + ((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).isConnect());
          Log.d("debug", "device net status = " + ((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).isConnect());
          Log.d("debug", "device net status = " + ((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).getXDevice().isLAN());
          Log.d("debug", "device getDeviceConnectStates = " + ((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).getXDevice().getDevcieConnectStates());
          ((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).getXDevice().getDevcieConnectStates();
          MyApp.Aiyuxun_ConnectDevice(((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).getXDevice(), ((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).getAccessKey());
        }
        while (true)
        {
          MyApp localMyApp = this.this$0;
          localMyApp.deviceCount = (1 + localMyApp.deviceCount);
          MyApp.access$0(this.this$0).sendEmptyMessageDelayed(1, 4000L);
          break;
          label438: Log.d("debug", "password = " + ((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).getAccessKey());
          if (!((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount)).getXDevice().isInit())
            DeviceListActivity.setDevicePassword((Device)DeviceManage.getInstance().getDevices().get(this.this$0.deviceCount), 123456789);
          Log.d("debug", "device mac set password!");
        }
      }
      this.this$0.deviceCount = 0;
      MyApp.access$0(this.this$0).sendEmptyMessageDelayed(1, 4000L);
      continue;
      if (this.this$0.isHaveAppid())
      {
        Log.d("debug", "isHaveAppid");
        if (!XlinkAgent.getInstance().isConnectedLocal())
          XlinkAgent.getInstance().start();
        if (!XlinkAgent.getInstance().isConnectedOuterNet())
          Log.d("debug", "Login");
        MyApp.getApp().setAppid(this.this$0.appid);
        MyApp.getApp().setAuth(this.this$0.authKey);
      }
      else
      {
        Log.d("debug", "isHaveAppid registerUser");
        MyApp.access$1(this.this$0, XlinkUtils.MD5(this.this$0.tm.getDeviceId()));
        this.this$0.registerUserByMail(SharedPreferencesUtil.queryValue("EMAIL_ID"), MyApp.access$2(this.this$0), SharedPreferencesUtil.queryValue("PASSWD_ID"));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.MyApp.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */