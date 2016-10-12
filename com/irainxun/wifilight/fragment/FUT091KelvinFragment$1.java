package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.SeekBar;
import com.irainxun.wifilight.xlink.MyApp;

class FUT091KelvinFragment$1 extends Handler
{
  FUT091KelvinFragment$1(FUT091KelvinFragment paramFUT091KelvinFragment)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    byte[] arrayOfByte = new byte[12];
    switch (paramMessage.what)
    {
    default:
    case 4356:
    case 4355:
    case 4353:
    case 1024:
      do
      {
        do
        {
          return;
          FUT091KelvinFragment.access$0(this.this$0, false);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          if (MyApp.rain_remoteID == 8)
            arrayOfByte[4] = 3;
          while (true)
          {
            arrayOfByte[5] = (byte)FUT091KelvinFragment.access$2(this.this$0);
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            Log.d("debug", "send cirl data");
            return;
            arrayOfByte[4] = FUT091KelvinFragment.access$1(this.this$0);
          }
          FUT091KelvinFragment.access$3(this.this$0, false);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          if (MyApp.rain_remoteID == 8)
            arrayOfByte[4] = 5;
          while (true)
          {
            arrayOfByte[5] = (byte)FUT091KelvinFragment.access$4(this.this$0);
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            return;
            arrayOfByte[4] = 3;
          }
          if ((0x2 & FUT091KelvinFragment.access$5(this.this$0)) == 2)
          {
            Log.d("debug", "long key Night light");
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -124;
            if (MyApp.rain_remoteID == 8)
              arrayOfByte[5] = 5;
            while (true)
            {
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
              arrayOfByte[5] = 2;
            }
          }
          if ((0x4 & FUT091KelvinFragment.access$5(this.this$0)) == 4)
          {
            Log.d("debug", "long key tvOn");
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -124;
            if (MyApp.rain_remoteID == 8)
              arrayOfByte[5] = 1;
            while (true)
            {
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
              arrayOfByte[5] = 3;
            }
          }
        }
        while ((0x8 & FUT091KelvinFragment.access$5(this.this$0)) != 8);
        Log.d("debug", "long key tvOff");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -124;
        if (MyApp.rain_remoteID == 8)
          arrayOfByte[5] = 2;
        while (true)
        {
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
          return;
          arrayOfByte[5] = 4;
        }
        FUT091KelvinFragment.access$6(this.this$0, false);
      }
      while (FUT091KelvinFragment.access$7(this.this$0) == FUT091KelvinFragment.access$2(this.this$0));
      FUT091KelvinFragment.access$8(this.this$0, FUT091KelvinFragment.access$2(this.this$0));
      MyApp.PlalyKeySound();
      return;
    case 4358:
    }
    if (MyApp.rain_remoteID == 8)
    {
      FUT091KelvinFragment.access$9(this.this$0, MyApp.rain_08brightness);
      FUT091KelvinFragment.access$10(this.this$0, MyApp.rain_08kelvin);
      FUT091KelvinFragment.access$11(this.this$0).setProgress(FUT091KelvinFragment.access$4(this.this$0));
    }
    FUT091KelvinFragment.access$12(this.this$0, true);
    Log.d("debug", "dataupdate COLOR rain_08saturation = " + MyApp.rain_08saturation);
    Log.d("debug", "dataupdate COLOR rain_08brightness = " + MyApp.rain_08brightness);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT091KelvinFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */