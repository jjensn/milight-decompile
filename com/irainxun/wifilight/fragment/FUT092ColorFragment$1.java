package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.SeekBar;
import com.irainxun.wifilight.xlink.MyApp;

class FUT092ColorFragment$1 extends Handler
{
  FUT092ColorFragment$1(FUT092ColorFragment paramFUT092ColorFragment)
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
    case 4357:
    case 4355:
    case 4353:
    case 1024:
    case 4358:
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      return;
      FUT092ColorFragment.access$0(this.this$0, false);
      FUT092ColorFragment.access$1(this.this$0)[FUT092ColorFragment.access$2(this.this$0)] = (byte)FUT092ColorFragment.access$3(this.this$0);
      if (FUT092ColorFragment.access$2(this.this$0) < 4)
      {
        FUT092ColorFragment localFUT092ColorFragment2 = this.this$0;
        FUT092ColorFragment.access$4(localFUT092ColorFragment2, (byte)(1 + FUT092ColorFragment.access$2(localFUT092ColorFragment2)));
      }
      Log.d("debug", "CirlgetData = " + FUT092ColorFragment.access$2(this.this$0));
      continue;
      FUT092ColorFragment.access$5(this.this$0, false);
      while (true)
      {
        if (FUT092ColorFragment.access$2(this.this$0) >= 4)
        {
          FUT092ColorFragment.access$1(this.this$0)[3] = (byte)FUT092ColorFragment.access$3(this.this$0);
          FUT092ColorFragment.access$4(this.this$0, (byte)0);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)(FUT092ColorFragment.access$6(this.this$0) - FUT092ColorFragment.access$1(this.this$0)[0]);
          arrayOfByte[6] = (byte)(FUT092ColorFragment.access$6(this.this$0) - FUT092ColorFragment.access$1(this.this$0)[1]);
          arrayOfByte[7] = (byte)(FUT092ColorFragment.access$6(this.this$0) - FUT092ColorFragment.access$1(this.this$0)[2]);
          arrayOfByte[8] = (byte)(FUT092ColorFragment.access$6(this.this$0) - FUT092ColorFragment.access$1(this.this$0)[3]);
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          Log.d("debug", "send cirl data");
          break;
        }
        FUT092ColorFragment.access$1(this.this$0)[FUT092ColorFragment.access$2(this.this$0)] = (byte)FUT092ColorFragment.access$3(this.this$0);
        FUT092ColorFragment localFUT092ColorFragment1 = this.this$0;
        FUT092ColorFragment.access$4(localFUT092ColorFragment1, (byte)(1 + FUT092ColorFragment.access$2(localFUT092ColorFragment1)));
      }
      FUT092ColorFragment.access$7(this.this$0, false);
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 2;
      arrayOfByte[5] = (byte)MyApp.rain_08saturation;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      continue;
      FUT092ColorFragment.access$8(this.this$0, false);
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 3;
      arrayOfByte[5] = (byte)MyApp.rain_08brightness;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      continue;
      if ((0x2 & FUT092ColorFragment.access$9(this.this$0)) == 2)
      {
        Log.d("debug", "long key Night light");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -124;
        arrayOfByte[5] = 5;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x4 & FUT092ColorFragment.access$9(this.this$0)) == 4)
      {
        Log.d("debug", "long key tvOn");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -124;
        arrayOfByte[5] = 1;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x8 & FUT092ColorFragment.access$9(this.this$0)) == 8)
      {
        Log.d("debug", "long key tvOff");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -124;
        arrayOfByte[5] = 2;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
        continue;
        FUT092ColorFragment.access$10(this.this$0, false);
        if (FUT092ColorFragment.access$11(this.this$0) != FUT092ColorFragment.access$12(this.this$0))
        {
          FUT092ColorFragment.access$13(this.this$0, FUT092ColorFragment.access$12(this.this$0));
          MyApp.PlalyKeySound();
          continue;
          FUT092ColorFragment.access$14(this.this$0).setProgress(MyApp.rain_08saturation);
          FUT092ColorFragment.access$15(this.this$0).setProgress(MyApp.rain_08brightness);
          FUT092ColorFragment.access$16(this.this$0, true);
          Log.d("debug", "dataupdate COLOR rain_08saturation = " + MyApp.rain_08saturation);
          Log.d("debug", "dataupdate COLOR rain_08brightness = " + MyApp.rain_08brightness);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ColorFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */