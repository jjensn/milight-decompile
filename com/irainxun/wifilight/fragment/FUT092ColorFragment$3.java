package com.irainxun.wifilight.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.xlink.MyApp;

class FUT092ColorFragment$3
  implements View.OnClickListener
{
  FUT092ColorFragment$3(FUT092ColorFragment paramFUT092ColorFragment)
  {
  }

  public void onClick(View paramView)
  {
    MyApp.PlalyKeySound();
    if (paramView == FUT092ColorFragment.access$24(this.this$0))
    {
      FUT092ColorFragment.access$25(this.this$0).selectAll(true);
      MyApp.rain_remo = 0;
    }
    do
    {
      return;
      if (paramView == FUT092ColorFragment.access$26(this.this$0))
      {
        FUT092ColorFragment.access$27(this.this$0).addColorPoint(MyApp.rain_08curColor);
        return;
      }
    }
    while (paramView != FUT092ColorFragment.access$28(this.this$0));
    byte[] arrayOfByte = new byte[12];
    arrayOfByte[0] = 49;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = MyApp.rain_remoteID;
    arrayOfByte[4] = 5;
    arrayOfByte[5] = (byte)MyApp.rain_08kelvin;
    arrayOfByte[6] = 0;
    arrayOfByte[7] = 0;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = MyApp.rain_remo;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 0;
    MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
    FUT092ColorFragment.access$28(this.this$0).setTextColor(FUT092ColorFragment.access$29(this.this$0, MyApp.rain_08kelvin));
    MyApp.lightmode = true;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ColorFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */