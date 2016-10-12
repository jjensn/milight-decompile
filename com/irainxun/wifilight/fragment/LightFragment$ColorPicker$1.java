package com.irainxun.wifilight.fragment;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class LightFragment$ColorPicker$1
  implements View.OnClickListener
{
  LightFragment$ColorPicker$1(LightFragment.ColorPicker paramColorPicker)
  {
  }

  public void onClick(View paramView)
  {
    byte[] arrayOfByte = new byte[12];
    if ((paramView == LightFragment.ColorPicker.access$0(this.this$1)) && (LightFragment.ColorPicker.access$0(this.this$1).getDrawable() != null) && ((LightFragment.ColorPicker.access$0(this.this$1).getDrawable() instanceof GradientDrawable)))
    {
      MyApp.PlalyKeySound();
      arrayOfByte[0] = 63;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = 0;
      arrayOfByte[4] = LightFragment.access$31(LightFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[5] = (byte)(LightFragment.access$9(LightFragment.ColorPicker.access$5(this.this$1)) - LightFragment.access$32(LightFragment.ColorPicker.access$5(this.this$1))[0]);
      arrayOfByte[6] = (byte)LightFragment.access$33(LightFragment.ColorPicker.access$5(this.this$1))[0];
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = 1;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      LightFragment.access$34(LightFragment.ColorPicker.access$5(this.this$1), 0xFF & LightFragment.access$33(LightFragment.ColorPicker.access$5(this.this$1))[0]);
      LightFragment.access$35(LightFragment.ColorPicker.access$5(this.this$1)).setProgress(LightFragment.access$1(LightFragment.ColorPicker.access$5(this.this$1)));
      LightFragment.access$36(LightFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & LightFragment.access$9(LightFragment.ColorPicker.access$5(this.this$1)) - LightFragment.access$32(LightFragment.ColorPicker.access$5(this.this$1))[0]));
    }
    do
    {
      return;
      if ((paramView == LightFragment.ColorPicker.access$1(this.this$1)) && (LightFragment.ColorPicker.access$1(this.this$1).getDrawable() != null) && ((LightFragment.ColorPicker.access$1(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = LightFragment.access$31(LightFragment.ColorPicker.access$5(this.this$1))[1];
        arrayOfByte[5] = (byte)(LightFragment.access$9(LightFragment.ColorPicker.access$5(this.this$1)) - LightFragment.access$32(LightFragment.ColorPicker.access$5(this.this$1))[1]);
        arrayOfByte[6] = (byte)LightFragment.access$33(LightFragment.ColorPicker.access$5(this.this$1))[1];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        LightFragment.access$34(LightFragment.ColorPicker.access$5(this.this$1), 0xFF & LightFragment.access$33(LightFragment.ColorPicker.access$5(this.this$1))[1]);
        LightFragment.access$35(LightFragment.ColorPicker.access$5(this.this$1)).setProgress(LightFragment.access$1(LightFragment.ColorPicker.access$5(this.this$1)));
        LightFragment.access$36(LightFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & LightFragment.access$9(LightFragment.ColorPicker.access$5(this.this$1)) - LightFragment.access$32(LightFragment.ColorPicker.access$5(this.this$1))[1]));
        return;
      }
      if ((paramView == LightFragment.ColorPicker.access$2(this.this$1)) && (LightFragment.ColorPicker.access$2(this.this$1).getDrawable() != null) && ((LightFragment.ColorPicker.access$2(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = LightFragment.access$31(LightFragment.ColorPicker.access$5(this.this$1))[2];
        arrayOfByte[5] = (byte)(LightFragment.access$9(LightFragment.ColorPicker.access$5(this.this$1)) - LightFragment.access$32(LightFragment.ColorPicker.access$5(this.this$1))[2]);
        arrayOfByte[6] = (byte)LightFragment.access$33(LightFragment.ColorPicker.access$5(this.this$1))[2];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        LightFragment.access$34(LightFragment.ColorPicker.access$5(this.this$1), 0xFF & LightFragment.access$33(LightFragment.ColorPicker.access$5(this.this$1))[2]);
        LightFragment.access$35(LightFragment.ColorPicker.access$5(this.this$1)).setProgress(LightFragment.access$1(LightFragment.ColorPicker.access$5(this.this$1)));
        LightFragment.access$36(LightFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & LightFragment.access$9(LightFragment.ColorPicker.access$5(this.this$1)) - LightFragment.access$32(LightFragment.ColorPicker.access$5(this.this$1))[2]));
        return;
      }
      if ((paramView == LightFragment.ColorPicker.access$3(this.this$1)) && (LightFragment.ColorPicker.access$3(this.this$1).getDrawable() != null) && ((LightFragment.ColorPicker.access$3(this.this$1).getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = LightFragment.access$31(LightFragment.ColorPicker.access$5(this.this$1))[3];
        arrayOfByte[5] = (byte)(LightFragment.access$9(LightFragment.ColorPicker.access$5(this.this$1)) - LightFragment.access$32(LightFragment.ColorPicker.access$5(this.this$1))[3]);
        arrayOfByte[6] = (byte)LightFragment.access$33(LightFragment.ColorPicker.access$5(this.this$1))[3];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        LightFragment.access$34(LightFragment.ColorPicker.access$5(this.this$1), 0xFF & LightFragment.access$33(LightFragment.ColorPicker.access$5(this.this$1))[3]);
        LightFragment.access$35(LightFragment.ColorPicker.access$5(this.this$1)).setProgress(LightFragment.access$1(LightFragment.ColorPicker.access$5(this.this$1)));
        LightFragment.access$36(LightFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & LightFragment.access$9(LightFragment.ColorPicker.access$5(this.this$1)) - LightFragment.access$32(LightFragment.ColorPicker.access$5(this.this$1))[3]));
        return;
      }
    }
    while ((paramView != LightFragment.ColorPicker.access$4(this.this$1)) || (LightFragment.ColorPicker.access$4(this.this$1).getDrawable() == null) || (!(LightFragment.ColorPicker.access$4(this.this$1).getDrawable() instanceof GradientDrawable)));
    MyApp.PlalyKeySound();
    arrayOfByte[0] = 63;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = 0;
    arrayOfByte[4] = LightFragment.access$31(LightFragment.ColorPicker.access$5(this.this$1))[4];
    arrayOfByte[5] = (byte)(LightFragment.access$9(LightFragment.ColorPicker.access$5(this.this$1)) - LightFragment.access$32(LightFragment.ColorPicker.access$5(this.this$1))[4]);
    arrayOfByte[6] = (byte)LightFragment.access$33(LightFragment.ColorPicker.access$5(this.this$1))[4];
    arrayOfByte[7] = 0;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = 1;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 0;
    MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
    LightFragment.access$34(LightFragment.ColorPicker.access$5(this.this$1), 0xFF & LightFragment.access$33(LightFragment.ColorPicker.access$5(this.this$1))[4]);
    LightFragment.access$35(LightFragment.ColorPicker.access$5(this.this$1)).setProgress(LightFragment.access$1(LightFragment.ColorPicker.access$5(this.this$1)));
    LightFragment.access$36(LightFragment.ColorPicker.access$5(this.this$1)).setText("RGB:" + (0xFF & LightFragment.access$9(LightFragment.ColorPicker.access$5(this.this$1)) - LightFragment.access$32(LightFragment.ColorPicker.access$5(this.this$1))[4]));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.LightFragment.ColorPicker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */