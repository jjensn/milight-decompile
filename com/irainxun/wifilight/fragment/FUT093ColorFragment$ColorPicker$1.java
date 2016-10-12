package com.irainxun.wifilight.fragment;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT093ColorFragment$ColorPicker$1
  implements View.OnClickListener
{
  FUT093ColorFragment$ColorPicker$1(FUT093ColorFragment.ColorPicker paramColorPicker)
  {
  }

  public void onClick(View paramView)
  {
    byte[] arrayOfByte = new byte[12];
    if ((paramView == FUT093ColorFragment.ColorPicker.access$0(this.this$1)) && (FUT093ColorFragment.ColorPicker.access$0(this.this$1).getDrawable() != null) && ((FUT093ColorFragment.ColorPicker.access$0(this.this$1).getDrawable() instanceof GradientDrawable)))
    {
      MyApp.PlalyKeySound();
      arrayOfByte[0] = 63;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 0;
      arrayOfByte[5] = (byte)FUT093ColorFragment.access$43(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[6] = (byte)FUT093ColorFragment.access$44(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = 1;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      FUT093ColorFragment.access$45(FUT093ColorFragment.ColorPicker.access$5(this.this$1), FUT093ColorFragment.access$44(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[0]);
      FUT093ColorFragment.access$46(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(FUT093ColorFragment.access$4(FUT093ColorFragment.ColorPicker.access$5(this.this$1)));
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      FUT093ColorFragment.access$35(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + FUT093ColorFragment.access$2(FUT093ColorFragment.ColorPicker.access$5(this.this$1)));
      int n = (int)(2700.0D + 38.0D * 0xFF & FUT093ColorFragment.access$43(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[0]);
      FUT093ColorFragment.access$47(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setText("Kelvin:" + n + "K");
    }
    do
    {
      return;
      if ((paramView == FUT093ColorFragment.ColorPicker.access$1(this.this$1)) && (FUT093ColorFragment.ColorPicker.access$1(this.this$1).getDrawable() != null) && ((FUT093ColorFragment.ColorPicker.access$1(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = (byte)FUT093ColorFragment.access$43(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[1];
        arrayOfByte[6] = (byte)FUT093ColorFragment.access$44(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[1];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        FUT093ColorFragment.access$45(FUT093ColorFragment.ColorPicker.access$5(this.this$1), FUT093ColorFragment.access$44(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[1]);
        FUT093ColorFragment.access$46(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(FUT093ColorFragment.access$4(FUT093ColorFragment.ColorPicker.access$5(this.this$1)));
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT093ColorFragment.access$35(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + FUT093ColorFragment.access$2(FUT093ColorFragment.ColorPicker.access$5(this.this$1)));
        int m = (int)(2700.0D + 38.0D * 0xFF & FUT093ColorFragment.access$43(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[1]);
        FUT093ColorFragment.access$47(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setText("Kelvin:" + m + "K");
        return;
      }
      if ((paramView == FUT093ColorFragment.ColorPicker.access$2(this.this$1)) && (FUT093ColorFragment.ColorPicker.access$2(this.this$1).getDrawable() != null) && ((FUT093ColorFragment.ColorPicker.access$2(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = (byte)FUT093ColorFragment.access$43(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[2];
        arrayOfByte[6] = (byte)FUT093ColorFragment.access$44(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[2];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        FUT093ColorFragment.access$45(FUT093ColorFragment.ColorPicker.access$5(this.this$1), FUT093ColorFragment.access$44(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[2]);
        FUT093ColorFragment.access$46(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(FUT093ColorFragment.access$4(FUT093ColorFragment.ColorPicker.access$5(this.this$1)));
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT093ColorFragment.access$35(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + FUT093ColorFragment.access$2(FUT093ColorFragment.ColorPicker.access$5(this.this$1)));
        int k = (int)(2700.0D + 38.0D * 0xFF & FUT093ColorFragment.access$43(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[2]);
        FUT093ColorFragment.access$47(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setText("Kelvin:" + k + "K");
        return;
      }
      if ((paramView == FUT093ColorFragment.ColorPicker.access$3(this.this$1)) && (FUT093ColorFragment.ColorPicker.access$3(this.this$1).getDrawable() != null) && ((FUT093ColorFragment.ColorPicker.access$3(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = (byte)FUT093ColorFragment.access$43(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[3];
        arrayOfByte[6] = (byte)FUT093ColorFragment.access$44(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[3];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        FUT093ColorFragment.access$45(FUT093ColorFragment.ColorPicker.access$5(this.this$1), FUT093ColorFragment.access$44(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[3]);
        FUT093ColorFragment.access$46(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(FUT093ColorFragment.access$4(FUT093ColorFragment.ColorPicker.access$5(this.this$1)));
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT093ColorFragment.access$35(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + FUT093ColorFragment.access$2(FUT093ColorFragment.ColorPicker.access$5(this.this$1)));
        int j = (int)(2700.0D + 38.0D * 0xFF & FUT093ColorFragment.access$43(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[3]);
        FUT093ColorFragment.access$47(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setText("Kelvin:" + j + "K");
        return;
      }
    }
    while ((paramView != FUT093ColorFragment.ColorPicker.access$4(this.this$1)) || (FUT093ColorFragment.ColorPicker.access$4(this.this$1).getDrawable() == null) || (!(FUT093ColorFragment.ColorPicker.access$4(this.this$1).getDrawable() instanceof GradientDrawable)));
    MyApp.PlalyKeySound();
    arrayOfByte[0] = 63;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = MyApp.rain_remoteID;
    arrayOfByte[4] = 0;
    arrayOfByte[5] = (byte)FUT093ColorFragment.access$43(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[4];
    arrayOfByte[6] = (byte)FUT093ColorFragment.access$44(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[4];
    arrayOfByte[7] = 0;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = 1;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 0;
    FUT093ColorFragment.access$45(FUT093ColorFragment.ColorPicker.access$5(this.this$1), FUT093ColorFragment.access$44(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[4]);
    FUT093ColorFragment.access$46(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(FUT093ColorFragment.access$4(FUT093ColorFragment.ColorPicker.access$5(this.this$1)));
    MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
    FUT093ColorFragment.access$35(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + FUT093ColorFragment.access$2(FUT093ColorFragment.ColorPicker.access$5(this.this$1)));
    int i = (int)(2700.0D + 38.0D * 0xFF & FUT093ColorFragment.access$43(FUT093ColorFragment.ColorPicker.access$5(this.this$1))[4]);
    FUT093ColorFragment.access$47(FUT093ColorFragment.ColorPicker.access$5(this.this$1)).setText("Kelvin:" + i + "K");
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT093ColorFragment.ColorPicker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */