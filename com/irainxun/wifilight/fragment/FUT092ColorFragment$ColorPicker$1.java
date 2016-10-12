package com.irainxun.wifilight.fragment;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT092ColorFragment$ColorPicker$1
  implements View.OnClickListener
{
  FUT092ColorFragment$ColorPicker$1(FUT092ColorFragment.ColorPicker paramColorPicker)
  {
  }

  public void onClick(View paramView)
  {
    byte[] arrayOfByte = new byte[12];
    if ((paramView == FUT092ColorFragment.ColorPicker.access$0(this.this$1)) && (FUT092ColorFragment.ColorPicker.access$0(this.this$1).getDrawable() != null) && ((FUT092ColorFragment.ColorPicker.access$0(this.this$1).getDrawable() instanceof GradientDrawable)))
    {
      MyApp.PlalyKeySound();
      arrayOfByte[0] = 63;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = FUT092ColorFragment.access$30(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[5] = FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[6] = (byte)(0xFF & FUT092ColorFragment.access$6(FUT092ColorFragment.ColorPicker.access$5(this.this$1)) - FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[0]);
      arrayOfByte[7] = (byte)FUT092ColorFragment.access$33(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      if (FUT092ColorFragment.access$30(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[0] == 1)
      {
        MyApp.lightmode = true;
        MyApp.rain_08kelvin = FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[0];
        FUT092ColorFragment.access$28(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setTextColor(FUT092ColorFragment.access$29(FUT092ColorFragment.ColorPicker.access$5(this.this$1), MyApp.rain_08kelvin));
        MyApp.rain_08brightness = 0xFF & FUT092ColorFragment.access$33(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[0];
        FUT092ColorFragment.access$15(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08brightness);
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT092ColorFragment.access$37(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + MyApp.rain_08brightness);
      }
    }
    do
    {
      return;
      MyApp.lightmode = false;
      FUT092ColorFragment.access$34(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & FUT092ColorFragment.access$6(FUT092ColorFragment.ColorPicker.access$5(this.this$1)) - (0xFF & FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[0])));
      MyApp.rain_08curColor = FUT092ColorFragment.access$35(FUT092ColorFragment.ColorPicker.access$5(this.this$1), (int)(1.411764705882353D * 0xFF & FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[0]));
      FUT092ColorFragment.access$28(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setTextColor(MyApp.rain_08curColor);
      MyApp.rain_08saturation = 0xFF & FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[0];
      FUT092ColorFragment.access$14(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08saturation);
      FUT092ColorFragment.access$36(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("Saturation:" + MyApp.rain_08saturation);
      break;
      if ((paramView == FUT092ColorFragment.ColorPicker.access$1(this.this$1)) && (FUT092ColorFragment.ColorPicker.access$1(this.this$1).getDrawable() != null) && ((FUT092ColorFragment.ColorPicker.access$1(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = FUT092ColorFragment.access$30(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[1];
        arrayOfByte[5] = FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[1];
        arrayOfByte[6] = (byte)(0xFF & FUT092ColorFragment.access$6(FUT092ColorFragment.ColorPicker.access$5(this.this$1)) - FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[1]);
        arrayOfByte[7] = (byte)FUT092ColorFragment.access$33(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[1];
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        if (FUT092ColorFragment.access$30(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[1] == 1)
        {
          MyApp.lightmode = true;
          MyApp.rain_08kelvin = FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[1];
          FUT092ColorFragment.access$28(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setTextColor(FUT092ColorFragment.access$29(FUT092ColorFragment.ColorPicker.access$5(this.this$1), MyApp.rain_08kelvin));
        }
        while (true)
        {
          MyApp.rain_08brightness = 0xFF & FUT092ColorFragment.access$33(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[1];
          FUT092ColorFragment.access$15(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08brightness);
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ColorFragment.access$37(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + MyApp.rain_08brightness);
          return;
          MyApp.lightmode = false;
          FUT092ColorFragment.access$34(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & FUT092ColorFragment.access$6(FUT092ColorFragment.ColorPicker.access$5(this.this$1)) - (0xFF & FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[1])));
          MyApp.rain_08curColor = FUT092ColorFragment.access$35(FUT092ColorFragment.ColorPicker.access$5(this.this$1), (int)(1.411764705882353D * 0xFF & FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[1]));
          FUT092ColorFragment.access$28(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setTextColor(MyApp.rain_08curColor);
          MyApp.rain_08saturation = 0xFF & FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[1];
          FUT092ColorFragment.access$14(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08saturation);
          FUT092ColorFragment.access$36(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("Saturation:" + MyApp.rain_08saturation);
        }
      }
      if ((paramView == FUT092ColorFragment.ColorPicker.access$2(this.this$1)) && (FUT092ColorFragment.ColorPicker.access$2(this.this$1).getDrawable() != null) && ((FUT092ColorFragment.ColorPicker.access$2(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = FUT092ColorFragment.access$30(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[2];
        arrayOfByte[5] = FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[2];
        arrayOfByte[6] = (byte)(0xFF & FUT092ColorFragment.access$6(FUT092ColorFragment.ColorPicker.access$5(this.this$1)) - FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[2]);
        arrayOfByte[7] = (byte)FUT092ColorFragment.access$33(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[2];
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        if (FUT092ColorFragment.access$30(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[2] == 1)
        {
          MyApp.lightmode = true;
          MyApp.rain_08kelvin = FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[2];
          FUT092ColorFragment.access$28(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setTextColor(FUT092ColorFragment.access$29(FUT092ColorFragment.ColorPicker.access$5(this.this$1), MyApp.rain_08kelvin));
        }
        while (true)
        {
          MyApp.rain_08brightness = 0xFF & FUT092ColorFragment.access$33(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[2];
          FUT092ColorFragment.access$15(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08brightness);
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ColorFragment.access$37(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + MyApp.rain_08brightness);
          return;
          MyApp.lightmode = false;
          FUT092ColorFragment.access$34(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & FUT092ColorFragment.access$6(FUT092ColorFragment.ColorPicker.access$5(this.this$1)) - (0xFF & FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[2])));
          MyApp.rain_08curColor = FUT092ColorFragment.access$35(FUT092ColorFragment.ColorPicker.access$5(this.this$1), (int)(1.411764705882353D * 0xFF & FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[2]));
          FUT092ColorFragment.access$28(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setTextColor(MyApp.rain_08curColor);
          MyApp.rain_08saturation = 0xFF & FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[2];
          FUT092ColorFragment.access$14(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08saturation);
          FUT092ColorFragment.access$36(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("Saturation:" + MyApp.rain_08saturation);
        }
      }
      if ((paramView == FUT092ColorFragment.ColorPicker.access$3(this.this$1)) && (FUT092ColorFragment.ColorPicker.access$3(this.this$1).getDrawable() != null) && ((FUT092ColorFragment.ColorPicker.access$3(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = FUT092ColorFragment.access$30(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[3];
        arrayOfByte[5] = FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[3];
        arrayOfByte[6] = (byte)(0xFF & FUT092ColorFragment.access$6(FUT092ColorFragment.ColorPicker.access$5(this.this$1)) - FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[3]);
        arrayOfByte[7] = (byte)FUT092ColorFragment.access$33(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[3];
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        if (FUT092ColorFragment.access$30(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[3] == 1)
        {
          MyApp.lightmode = true;
          MyApp.rain_08kelvin = FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[3];
          FUT092ColorFragment.access$28(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setTextColor(FUT092ColorFragment.access$29(FUT092ColorFragment.ColorPicker.access$5(this.this$1), MyApp.rain_08kelvin));
        }
        while (true)
        {
          MyApp.rain_08brightness = 0xFF & FUT092ColorFragment.access$33(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[3];
          FUT092ColorFragment.access$15(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08brightness);
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ColorFragment.access$37(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + MyApp.rain_08brightness);
          return;
          MyApp.lightmode = false;
          FUT092ColorFragment.access$34(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & FUT092ColorFragment.access$6(FUT092ColorFragment.ColorPicker.access$5(this.this$1)) - (0xFF & FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[3])));
          MyApp.rain_08curColor = FUT092ColorFragment.access$35(FUT092ColorFragment.ColorPicker.access$5(this.this$1), (int)(1.411764705882353D * 0xFF & FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[3]));
          FUT092ColorFragment.access$28(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setTextColor(MyApp.rain_08curColor);
          MyApp.rain_08saturation = 0xFF & FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[3];
          FUT092ColorFragment.access$14(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08saturation);
          FUT092ColorFragment.access$36(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("Saturation:" + MyApp.rain_08saturation);
        }
      }
    }
    while ((paramView != FUT092ColorFragment.ColorPicker.access$4(this.this$1)) || (FUT092ColorFragment.ColorPicker.access$4(this.this$1).getDrawable() == null) || (!(FUT092ColorFragment.ColorPicker.access$4(this.this$1).getDrawable() instanceof GradientDrawable)));
    MyApp.PlalyKeySound();
    arrayOfByte[0] = 63;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = MyApp.rain_remoteID;
    arrayOfByte[4] = FUT092ColorFragment.access$30(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[4];
    arrayOfByte[5] = FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[4];
    arrayOfByte[6] = (byte)(0xFF & FUT092ColorFragment.access$6(FUT092ColorFragment.ColorPicker.access$5(this.this$1)) - FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[4]);
    arrayOfByte[7] = (byte)FUT092ColorFragment.access$33(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[4];
    arrayOfByte[8] = 0;
    arrayOfByte[9] = MyApp.rain_remo;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 0;
    if (FUT092ColorFragment.access$30(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[4] == 1)
    {
      MyApp.lightmode = true;
      MyApp.rain_08kelvin = FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[4];
      FUT092ColorFragment.access$28(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setTextColor(FUT092ColorFragment.access$29(FUT092ColorFragment.ColorPicker.access$5(this.this$1), MyApp.rain_08kelvin));
    }
    while (true)
    {
      MyApp.rain_08brightness = 0xFF & FUT092ColorFragment.access$33(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[4];
      FUT092ColorFragment.access$15(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08brightness);
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      FUT092ColorFragment.access$37(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + MyApp.rain_08brightness);
      return;
      MyApp.lightmode = false;
      FUT092ColorFragment.access$34(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & FUT092ColorFragment.access$6(FUT092ColorFragment.ColorPicker.access$5(this.this$1)) - (0xFF & FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[4])));
      MyApp.rain_08curColor = FUT092ColorFragment.access$35(FUT092ColorFragment.ColorPicker.access$5(this.this$1), (int)(1.411764705882353D * 0xFF & FUT092ColorFragment.access$32(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[4]));
      FUT092ColorFragment.access$28(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setTextColor(MyApp.rain_08curColor);
      MyApp.rain_08saturation = 0xFF & FUT092ColorFragment.access$31(FUT092ColorFragment.ColorPicker.access$5(this.this$1))[4];
      FUT092ColorFragment.access$14(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(MyApp.rain_08saturation);
      FUT092ColorFragment.access$36(FUT092ColorFragment.ColorPicker.access$5(this.this$1)).setText("Saturation:" + MyApp.rain_08saturation);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ColorFragment.ColorPicker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */