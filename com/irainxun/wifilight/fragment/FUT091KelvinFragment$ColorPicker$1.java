package com.irainxun.wifilight.fragment;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT091KelvinFragment$ColorPicker$1
  implements View.OnClickListener
{
  FUT091KelvinFragment$ColorPicker$1(FUT091KelvinFragment.ColorPicker paramColorPicker)
  {
  }

  public void onClick(View paramView)
  {
    byte[] arrayOfByte = new byte[12];
    if ((paramView == FUT091KelvinFragment.ColorPicker.access$0(this.this$1)) && (FUT091KelvinFragment.ColorPicker.access$0(this.this$1).getDrawable() != null) && ((FUT091KelvinFragment.ColorPicker.access$0(this.this$1).getDrawable() instanceof GradientDrawable)))
    {
      MyApp.PlalyKeySound();
      arrayOfByte[0] = 63;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      if (FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0] == 1)
      {
        MyApp.lightmode = true;
        MyApp.rain_08kelvin = FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0];
        arrayOfByte[4] = FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0];
        arrayOfByte[6] = (byte)FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0];
        arrayOfByte[7] = (byte)FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0];
        arrayOfByte[5] = 0;
        MyApp.rain_08brightness = 0xFF & FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0];
        FUT091KelvinFragment.access$10(FUT091KelvinFragment.ColorPicker.access$5(this.this$1), MyApp.rain_08brightness);
        FUT091KelvinFragment.access$11(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08brightness);
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        int n = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
        FUT091KelvinFragment.access$47(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setText("Kelvin:" + n + "K");
        FUT091KelvinFragment.access$33(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + MyApp.rain_08brightness);
      }
    }
    do
    {
      return;
      arrayOfByte[4] = FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[5] = FUT091KelvinFragment.access$45(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[6] = (byte)(0xFF & FUT091KelvinFragment.access$46(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)) - (0xFF & FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0]));
      arrayOfByte[7] = (byte)FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0];
      MyApp.lightmode = false;
      MyApp.rain_08brightness = FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0];
      MyApp.rain_08saturation = FUT091KelvinFragment.access$45(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[0];
      break;
      if ((paramView == FUT091KelvinFragment.ColorPicker.access$1(this.this$1)) && (FUT091KelvinFragment.ColorPicker.access$1(this.this$1).getDrawable() != null) && ((FUT091KelvinFragment.ColorPicker.access$1(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        if (FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1] == 1)
        {
          MyApp.lightmode = true;
          MyApp.rain_08kelvin = FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
          arrayOfByte[4] = FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
          arrayOfByte[6] = (byte)FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
          arrayOfByte[7] = (byte)FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
          arrayOfByte[5] = 0;
          MyApp.rain_08brightness = 0xFF & FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
        }
        while (true)
        {
          FUT091KelvinFragment.access$10(FUT091KelvinFragment.ColorPicker.access$5(this.this$1), MyApp.rain_08brightness);
          FUT091KelvinFragment.access$11(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08brightness);
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          int m = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
          FUT091KelvinFragment.access$47(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setText("Kelvin:" + m + "K");
          FUT091KelvinFragment.access$33(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + MyApp.rain_08brightness);
          return;
          arrayOfByte[4] = FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
          arrayOfByte[5] = FUT091KelvinFragment.access$45(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
          arrayOfByte[6] = (byte)(0xFF & FUT091KelvinFragment.access$46(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)) - (0xFF & FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1]));
          arrayOfByte[7] = (byte)FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
          MyApp.lightmode = false;
          MyApp.rain_08brightness = FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
          MyApp.rain_08saturation = FUT091KelvinFragment.access$45(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
        }
      }
      if ((paramView == FUT091KelvinFragment.ColorPicker.access$2(this.this$1)) && (FUT091KelvinFragment.ColorPicker.access$2(this.this$1).getDrawable() != null) && ((FUT091KelvinFragment.ColorPicker.access$2(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        if (FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2] == 1)
        {
          MyApp.lightmode = true;
          MyApp.rain_08kelvin = FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2];
          arrayOfByte[4] = FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2];
          arrayOfByte[6] = (byte)FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2];
          arrayOfByte[7] = (byte)FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2];
          arrayOfByte[5] = 0;
          MyApp.rain_08brightness = 0xFF & FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2];
        }
        while (true)
        {
          FUT091KelvinFragment.access$10(FUT091KelvinFragment.ColorPicker.access$5(this.this$1), MyApp.rain_08brightness);
          FUT091KelvinFragment.access$11(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08brightness);
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          int k = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
          FUT091KelvinFragment.access$47(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setText("Kelvin:" + k + "K");
          FUT091KelvinFragment.access$33(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + MyApp.rain_08brightness);
          return;
          arrayOfByte[4] = FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2];
          arrayOfByte[5] = FUT091KelvinFragment.access$45(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2];
          arrayOfByte[6] = (byte)(0xFF & FUT091KelvinFragment.access$46(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)) - (0xFF & FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2]));
          arrayOfByte[7] = (byte)FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2];
          MyApp.lightmode = false;
          MyApp.rain_08brightness = FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2];
          MyApp.rain_08saturation = FUT091KelvinFragment.access$45(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[2];
        }
      }
      if ((paramView == FUT091KelvinFragment.ColorPicker.access$3(this.this$1)) && (FUT091KelvinFragment.ColorPicker.access$3(this.this$1).getDrawable() != null) && ((FUT091KelvinFragment.ColorPicker.access$3(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        if (FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3] == 1)
        {
          MyApp.lightmode = true;
          MyApp.rain_08kelvin = FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3];
          arrayOfByte[4] = FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3];
          arrayOfByte[6] = (byte)FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3];
          arrayOfByte[7] = (byte)FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3];
          arrayOfByte[5] = 0;
          MyApp.rain_08brightness = 0xFF & FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3];
        }
        while (true)
        {
          FUT091KelvinFragment.access$10(FUT091KelvinFragment.ColorPicker.access$5(this.this$1), MyApp.rain_08brightness);
          FUT091KelvinFragment.access$11(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08brightness);
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          int j = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
          FUT091KelvinFragment.access$47(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setText("Kelvin:" + j + "K");
          FUT091KelvinFragment.access$33(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + MyApp.rain_08brightness);
          return;
          arrayOfByte[4] = FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3];
          arrayOfByte[5] = FUT091KelvinFragment.access$45(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3];
          arrayOfByte[6] = (byte)(0xFF & FUT091KelvinFragment.access$46(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)) - (0xFF & FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3]));
          arrayOfByte[7] = (byte)FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3];
          MyApp.lightmode = false;
          MyApp.rain_08brightness = FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3];
          MyApp.rain_08saturation = FUT091KelvinFragment.access$45(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[3];
        }
      }
    }
    while ((paramView != FUT091KelvinFragment.ColorPicker.access$4(this.this$1)) || (FUT091KelvinFragment.ColorPicker.access$4(this.this$1).getDrawable() == null) || (!(FUT091KelvinFragment.ColorPicker.access$4(this.this$1).getDrawable() instanceof GradientDrawable)));
    MyApp.PlalyKeySound();
    arrayOfByte[0] = 63;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = MyApp.rain_remoteID;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = MyApp.rain_remo;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 0;
    if (FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4] == 1)
    {
      MyApp.lightmode = true;
      MyApp.rain_08kelvin = FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4];
      arrayOfByte[4] = FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4];
      arrayOfByte[6] = (byte)FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4];
      arrayOfByte[7] = (byte)FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4];
      arrayOfByte[5] = 0;
      MyApp.rain_08brightness = 0xFF & FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4];
    }
    while (true)
    {
      FUT091KelvinFragment.access$10(FUT091KelvinFragment.ColorPicker.access$5(this.this$1), MyApp.rain_08brightness);
      FUT091KelvinFragment.access$11(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08brightness);
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      int i = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
      FUT091KelvinFragment.access$47(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setText("Kelvin:" + i + "K");
      FUT091KelvinFragment.access$33(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + MyApp.rain_08brightness);
      return;
      arrayOfByte[4] = FUT091KelvinFragment.access$42(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4];
      arrayOfByte[5] = FUT091KelvinFragment.access$45(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4];
      arrayOfByte[6] = (byte)(0xFF & FUT091KelvinFragment.access$46(FUT091KelvinFragment.ColorPicker.access$5(this.this$1)) - (0xFF & FUT091KelvinFragment.access$44(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4]));
      arrayOfByte[7] = (byte)FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[1];
      MyApp.lightmode = false;
      MyApp.rain_08brightness = FUT091KelvinFragment.access$43(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4];
      MyApp.rain_08saturation = FUT091KelvinFragment.access$45(FUT091KelvinFragment.ColorPicker.access$5(this.this$1))[4];
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT091KelvinFragment.ColorPicker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */