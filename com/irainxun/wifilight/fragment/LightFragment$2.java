package com.irainxun.wifilight.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.irainxun.wifilight.view.wifilightPopM;
import com.irainxun.wifilight.xlink.MyApp;

class LightFragment$2
  implements View.OnClickListener
{
  LightFragment$2(LightFragment paramLightFragment)
  {
  }

  public void onClick(View paramView)
  {
    MyApp.PlalyKeySound();
    if (paramView == LightFragment.access$14(this.this$0))
      new wifilightPopM(this.this$0.getActivity()).show(LightFragment.access$14(this.this$0), null);
    do
    {
      return;
      if (paramView == LightFragment.access$15(this.this$0))
      {
        LightFragment.access$16(this.this$0).addColorPoint(LightFragment.access$17(this.this$0));
        return;
      }
    }
    while (paramView != LightFragment.access$18(this.this$0));
    byte[] arrayOfByte = new byte[12];
    arrayOfByte[0] = 49;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = 0;
    arrayOfByte[4] = 3;
    arrayOfByte[5] = 5;
    arrayOfByte[6] = 0;
    arrayOfByte[7] = 0;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = 1;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 0;
    MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
    LightFragment.access$18(this.this$0).setTextColor(-1);
    LightFragment.access$19(this.this$0, true);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.LightFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */