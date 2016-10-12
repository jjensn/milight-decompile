package com.irainxun.wifilight;

import android.view.View;
import android.view.View.OnClickListener;
import com.irainxun.wifilight.xlink.MyApp;

class LinkUnlinkActivity$1
  implements View.OnClickListener
{
  LinkUnlinkActivity$1(LinkUnlinkActivity paramLinkUnlinkActivity)
  {
  }

  public void onClick(View paramView)
  {
    byte[] arrayOfByte = new byte[12];
    if (paramView == LinkUnlinkActivity.access$0(this.this$0))
      this.this$0.finish();
    do
    {
      return;
      if (paramView == LinkUnlinkActivity.access$1(this.this$0))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 61;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = 0;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        return;
      }
    }
    while (paramView != LinkUnlinkActivity.access$2(this.this$0));
    MyApp.PlalyKeySound();
    arrayOfByte[0] = 62;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = MyApp.rain_remoteID;
    arrayOfByte[4] = 0;
    arrayOfByte[5] = 0;
    arrayOfByte[6] = 0;
    arrayOfByte[7] = 0;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = MyApp.rain_remo;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 0;
    MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.LinkUnlinkActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */