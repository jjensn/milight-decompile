package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT090ColorFragment$1 extends Handler
{
  FUT090ColorFragment$1(FUT090ColorFragment paramFUT090ColorFragment)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    byte[] arrayOfByte = new byte[12];
    switch (paramMessage.what)
    {
    default:
    case 4354:
    case 4356:
    case 4355:
    case 4357:
    case 4358:
    case 4353:
    case 1024:
      do
      {
        do
        {
          return;
          FUT090ColorFragment.access$0(this.this$0, false);
          if (FUT090ColorFragment.access$1(this.this$0) <= 2)
            FUT090ColorFragment.access$2(this.this$0)[FUT090ColorFragment.access$1(this.this$0)] = (byte)FUT090ColorFragment.access$3(this.this$0);
          if (FUT090ColorFragment.access$1(this.this$0) < 3)
          {
            FUT090ColorFragment localFUT090ColorFragment2 = this.this$0;
            FUT090ColorFragment.access$4(localFUT090ColorFragment2, (byte)(1 + FUT090ColorFragment.access$1(localFUT090ColorFragment2)));
          }
          Log.d("debug", "CirlgetData = " + FUT090ColorFragment.access$1(this.this$0));
          return;
          FUT090ColorFragment.access$5(this.this$0, false);
          while (true)
          {
            if (FUT090ColorFragment.access$1(this.this$0) >= 3)
            {
              FUT090ColorFragment.access$2(this.this$0)[2] = (byte)FUT090ColorFragment.access$3(this.this$0);
              FUT090ColorFragment.access$4(this.this$0, (byte)0);
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 2;
              arrayOfByte[5] = (byte)(FUT090ColorFragment.access$6(this.this$0) - (0xFF & FUT090ColorFragment.access$2(this.this$0)[0]));
              arrayOfByte[6] = (byte)(FUT090ColorFragment.access$6(this.this$0) - (0xFF & FUT090ColorFragment.access$2(this.this$0)[1]));
              arrayOfByte[7] = (byte)(FUT090ColorFragment.access$6(this.this$0) - (0xFF & FUT090ColorFragment.access$2(this.this$0)[2]));
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              Log.d("debug", "send cirl data");
              return;
            }
            FUT090ColorFragment.access$2(this.this$0)[FUT090ColorFragment.access$1(this.this$0)] = (byte)FUT090ColorFragment.access$3(this.this$0);
            FUT090ColorFragment localFUT090ColorFragment1 = this.this$0;
            FUT090ColorFragment.access$4(localFUT090ColorFragment1, (byte)(1 + FUT090ColorFragment.access$1(localFUT090ColorFragment1)));
          }
          FUT090ColorFragment.access$7(this.this$0, false);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 20;
          arrayOfByte[5] = (byte)MyApp.rain_09brightness;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return;
          FUT090ColorFragment.access$8(this.this$0, false);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 4;
          arrayOfByte[5] = (byte)MyApp.rain_09saturation;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return;
          FUT090ColorFragment.access$9(this.this$0, false);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 3;
          arrayOfByte[5] = (byte)MyApp.rain_09kelvin;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return;
          if ((0x10 & FUT090ColorFragment.access$10(this.this$0)) == 16)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -127;
            arrayOfByte[5] = 0;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
          if ((0x20 & FUT090ColorFragment.access$10(this.this$0)) == 32)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -127;
            arrayOfByte[5] = 1;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
          if ((0x1 & FUT090ColorFragment.access$10(this.this$0)) == 1)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -123;
            arrayOfByte[5] = 3;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
          if ((0x2 & FUT090ColorFragment.access$10(this.this$0)) == 2)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -123;
            arrayOfByte[5] = 4;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
          if ((0x4 & FUT090ColorFragment.access$10(this.this$0)) == 4)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -123;
            arrayOfByte[5] = 1;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
        }
        while ((0x8 & FUT090ColorFragment.access$10(this.this$0)) != 8);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -123;
        arrayOfByte[5] = 2;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
        return;
        FUT090ColorFragment.access$11(this.this$0, false);
      }
      while (FUT090ColorFragment.access$12(this.this$0) == FUT090ColorFragment.access$3(this.this$0));
      FUT090ColorFragment.access$13(this.this$0, FUT090ColorFragment.access$3(this.this$0));
      MyApp.PlalyKeySound();
      return;
    case 4359:
    }
    FUT090ColorFragment.access$14(this.this$0).setText("Saturation:" + MyApp.rain_09saturation + "%");
    FUT090ColorFragment.access$15(this.this$0).setText("Brightness:" + MyApp.rain_09brightness);
    int i = (int)(2700.0D + 100.0D * MyApp.rain_09kelvin);
    FUT090ColorFragment.access$16(this.this$0).setText("Kelvin:" + i + "K");
    FUT090ColorFragment.access$17(this.this$0).setProgress(MyApp.rain_09brightness);
    FUT090ColorFragment.access$18(this.this$0).setProgress(MyApp.rain_09saturation);
    FUT090ColorFragment.access$19(this.this$0).setProgress(MyApp.rain_09kelvin);
    FUT090ColorFragment.access$20(this.this$0, true);
    Log.d("debug", "irain sbBrightness = " + MyApp.rain_09brightness);
    Log.d("debug", "irain sbSaturation = " + MyApp.rain_09saturation);
    Log.d("debug", "irain tvKelvin = " + MyApp.rain_09kelvin);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ColorFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */