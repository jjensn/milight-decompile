package com.irainxun.wifilight.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT098ColorFragment$3
  implements View.OnClickListener
{
  FUT098ColorFragment$3(FUT098ColorFragment paramFUT098ColorFragment)
  {
  }

  public void onClick(View paramView)
  {
    MyApp.PlalyKeySound();
    if (paramView == FUT098ColorFragment.access$26(this.this$0))
    {
      byte[] arrayOfByte = new byte[12];
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 2;
      arrayOfByte[5] = 7;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      FUT098ColorFragment.access$26(this.this$0).setTextColor(-1);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT098ColorFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */