package com.irainxun.wifilight.fragment;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT956ColorFragment$ColorPicker$1
  implements View.OnClickListener
{
  FUT956ColorFragment$ColorPicker$1(FUT956ColorFragment.ColorPicker paramColorPicker)
  {
  }

  public void onClick(View paramView)
  {
    byte[] arrayOfByte = new byte[12];
    if ((paramView == FUT956ColorFragment.ColorPicker.access$0(this.this$1)) && (FUT956ColorFragment.ColorPicker.access$0(this.this$1).getDrawable() != null) && ((FUT956ColorFragment.ColorPicker.access$0(this.this$1).getDrawable() instanceof GradientDrawable)))
    {
      MyApp.PlalyKeySound();
      arrayOfByte[0] = 63;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = FUT956ColorFragment.access$34(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[5] = (byte)(FUT956ColorFragment.access$6(FUT956ColorFragment.ColorPicker.access$5(this.this$1)) - FUT956ColorFragment.access$35(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[0]);
      arrayOfByte[6] = (byte)FUT956ColorFragment.access$36(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      FUT956ColorFragment.access$37(FUT956ColorFragment.ColorPicker.access$5(this.this$1), FUT956ColorFragment.access$36(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[0]);
      FUT956ColorFragment.access$38(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(FUT956ColorFragment.access$8(FUT956ColorFragment.ColorPicker.access$5(this.this$1)));
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      if (FUT956ColorFragment.access$34(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[0] == 0)
        FUT956ColorFragment.access$39(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & FUT956ColorFragment.access$6(FUT956ColorFragment.ColorPicker.access$5(this.this$1)) - FUT956ColorFragment.access$35(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[0]));
      FUT956ColorFragment.access$40(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + FUT956ColorFragment.access$8(FUT956ColorFragment.ColorPicker.access$5(this.this$1)));
    }
    do
    {
      return;
      if ((paramView == FUT956ColorFragment.ColorPicker.access$1(this.this$1)) && (FUT956ColorFragment.ColorPicker.access$1(this.this$1).getDrawable() != null) && ((FUT956ColorFragment.ColorPicker.access$1(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = FUT956ColorFragment.access$34(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[1];
        arrayOfByte[5] = (byte)(FUT956ColorFragment.access$6(FUT956ColorFragment.ColorPicker.access$5(this.this$1)) - FUT956ColorFragment.access$35(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[1]);
        arrayOfByte[6] = (byte)FUT956ColorFragment.access$36(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[1];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        FUT956ColorFragment.access$37(FUT956ColorFragment.ColorPicker.access$5(this.this$1), FUT956ColorFragment.access$36(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[1]);
        FUT956ColorFragment.access$38(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(FUT956ColorFragment.access$8(FUT956ColorFragment.ColorPicker.access$5(this.this$1)));
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        if (FUT956ColorFragment.access$34(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[1] == 0)
          FUT956ColorFragment.access$39(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & FUT956ColorFragment.access$6(FUT956ColorFragment.ColorPicker.access$5(this.this$1)) - FUT956ColorFragment.access$35(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[1]));
        FUT956ColorFragment.access$40(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + FUT956ColorFragment.access$8(FUT956ColorFragment.ColorPicker.access$5(this.this$1)));
        return;
      }
      if ((paramView == FUT956ColorFragment.ColorPicker.access$2(this.this$1)) && (FUT956ColorFragment.ColorPicker.access$2(this.this$1).getDrawable() != null) && ((FUT956ColorFragment.ColorPicker.access$2(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = FUT956ColorFragment.access$34(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[2];
        arrayOfByte[5] = (byte)(FUT956ColorFragment.access$6(FUT956ColorFragment.ColorPicker.access$5(this.this$1)) - FUT956ColorFragment.access$35(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[2]);
        arrayOfByte[6] = (byte)FUT956ColorFragment.access$36(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[2];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        FUT956ColorFragment.access$37(FUT956ColorFragment.ColorPicker.access$5(this.this$1), FUT956ColorFragment.access$36(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[2]);
        FUT956ColorFragment.access$38(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(FUT956ColorFragment.access$8(FUT956ColorFragment.ColorPicker.access$5(this.this$1)));
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        if (FUT956ColorFragment.access$34(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[2] == 0)
          FUT956ColorFragment.access$39(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & FUT956ColorFragment.access$6(FUT956ColorFragment.ColorPicker.access$5(this.this$1)) - FUT956ColorFragment.access$35(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[2]));
        FUT956ColorFragment.access$40(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + FUT956ColorFragment.access$8(FUT956ColorFragment.ColorPicker.access$5(this.this$1)));
        return;
      }
      if ((paramView == FUT956ColorFragment.ColorPicker.access$3(this.this$1)) && (FUT956ColorFragment.ColorPicker.access$3(this.this$1).getDrawable() != null) && ((FUT956ColorFragment.ColorPicker.access$3(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = FUT956ColorFragment.access$34(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[3];
        arrayOfByte[5] = (byte)(FUT956ColorFragment.access$6(FUT956ColorFragment.ColorPicker.access$5(this.this$1)) - FUT956ColorFragment.access$35(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[3]);
        arrayOfByte[6] = (byte)FUT956ColorFragment.access$36(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[3];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        FUT956ColorFragment.access$37(FUT956ColorFragment.ColorPicker.access$5(this.this$1), FUT956ColorFragment.access$36(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[3]);
        FUT956ColorFragment.access$38(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(FUT956ColorFragment.access$8(FUT956ColorFragment.ColorPicker.access$5(this.this$1)));
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        if (FUT956ColorFragment.access$34(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[3] == 0)
          FUT956ColorFragment.access$39(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & FUT956ColorFragment.access$6(FUT956ColorFragment.ColorPicker.access$5(this.this$1)) - FUT956ColorFragment.access$35(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[3]));
        FUT956ColorFragment.access$40(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + FUT956ColorFragment.access$8(FUT956ColorFragment.ColorPicker.access$5(this.this$1)));
        return;
      }
    }
    while ((paramView != FUT956ColorFragment.ColorPicker.access$4(this.this$1)) || (FUT956ColorFragment.ColorPicker.access$4(this.this$1).getDrawable() == null) || (!(FUT956ColorFragment.ColorPicker.access$4(this.this$1).getDrawable() instanceof GradientDrawable)));
    MyApp.PlalyKeySound();
    arrayOfByte[0] = 63;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = MyApp.rain_remoteID;
    arrayOfByte[4] = FUT956ColorFragment.access$34(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[4];
    arrayOfByte[5] = (byte)(FUT956ColorFragment.access$6(FUT956ColorFragment.ColorPicker.access$5(this.this$1)) - FUT956ColorFragment.access$35(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[4]);
    arrayOfByte[6] = (byte)FUT956ColorFragment.access$36(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[4];
    arrayOfByte[7] = 0;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = MyApp.rain_remo;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 0;
    FUT956ColorFragment.access$37(FUT956ColorFragment.ColorPicker.access$5(this.this$1), FUT956ColorFragment.access$36(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[4]);
    FUT956ColorFragment.access$38(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setProgress(FUT956ColorFragment.access$8(FUT956ColorFragment.ColorPicker.access$5(this.this$1)));
    MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
    if (FUT956ColorFragment.access$34(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[4] == 0)
      FUT956ColorFragment.access$39(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & FUT956ColorFragment.access$6(FUT956ColorFragment.ColorPicker.access$5(this.this$1)) - FUT956ColorFragment.access$35(FUT956ColorFragment.ColorPicker.access$5(this.this$1))[4]));
    FUT956ColorFragment.access$40(FUT956ColorFragment.ColorPicker.access$5(this.this$1)).setText("Brightness:" + FUT956ColorFragment.access$8(FUT956ColorFragment.ColorPicker.access$5(this.this$1)));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT956ColorFragment.ColorPicker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */