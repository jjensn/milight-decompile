package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.SeekBar;
import com.irainxun.wifilight.xlink.MyApp;

class FUT090ModeFragment$1 extends Handler
{
  FUT090ModeFragment$1(FUT090ModeFragment paramFUT090ModeFragment)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    byte[] arrayOfByte = new byte[12];
    switch (paramMessage.what)
    {
    default:
    case 4355:
    case 4357:
    case 4353:
    case 1024:
      do
      {
        do
        {
          return;
          FUT090ModeFragment.access$0(this.this$0, false);
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
          FUT090ModeFragment.access$1(this.this$0, false);
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
          if ((0x10 & FUT090ModeFragment.access$2(this.this$0)) == 16)
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
          }
          while ((0x1 & FUT090ModeFragment.access$3(this.this$0)) == 1)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -122;
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
            if ((0x20 & FUT090ModeFragment.access$2(this.this$0)) == 32)
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
            }
          }
          if ((0x2 & FUT090ModeFragment.access$3(this.this$0)) == 2)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -122;
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
          if ((0x4 & FUT090ModeFragment.access$3(this.this$0)) == 4)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -122;
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
          }
          if ((0x8 & FUT090ModeFragment.access$3(this.this$0)) == 8)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -122;
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
          if ((0x10 & FUT090ModeFragment.access$3(this.this$0)) == 16)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -122;
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
          if ((0x20 & FUT090ModeFragment.access$3(this.this$0)) == 32)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -122;
            arrayOfByte[5] = 5;
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
          if ((0x40 & FUT090ModeFragment.access$3(this.this$0)) == 64)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -122;
            arrayOfByte[5] = 6;
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
          if ((0x80 & FUT090ModeFragment.access$3(this.this$0)) == 128)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -122;
            arrayOfByte[5] = 7;
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
        while ((0x100 & FUT090ModeFragment.access$3(this.this$0)) != 256);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -122;
        arrayOfByte[5] = 8;
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
        FUT090ModeFragment.access$4(this.this$0, false);
      }
      while (FUT090ModeFragment.access$5(this.this$0) == FUT090ModeFragment.access$6(this.this$0));
      FUT090ModeFragment.access$7(this.this$0, FUT090ModeFragment.access$6(this.this$0));
      MyApp.PlalyKeySound();
      return;
    case 4359:
    }
    FUT090ModeFragment.access$8(this.this$0).setProgress(MyApp.rain_09brightness);
    FUT090ModeFragment.access$9(this.this$0).setProgress(MyApp.rain_09saturation);
    Log.d("debug", "irain mode sbLight = " + MyApp.rain_09brightness);
    Log.d("debug", "irain mode sbSaturation = " + MyApp.rain_09saturation);
    Log.d("debug", "irain mode tvKelvin = " + MyApp.rain_09kelvin);
    FUT090ModeFragment.access$10(this.this$0, true);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ModeFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */