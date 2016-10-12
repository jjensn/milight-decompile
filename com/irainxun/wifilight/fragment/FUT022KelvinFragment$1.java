package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.xlink.MyApp;

class FUT022KelvinFragment$1 extends Handler
{
  FUT022KelvinFragment$1(FUT022KelvinFragment paramFUT022KelvinFragment)
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
    case 4353:
    case 1024:
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      return;
      FUT022KelvinFragment.access$0(this.this$0, false);
      FUT022KelvinFragment.access$1(this.this$0)[FUT022KelvinFragment.access$2(this.this$0)] = (byte)FUT022KelvinFragment.access$3(this.this$0);
      if (FUT022KelvinFragment.access$2(this.this$0) < 4)
      {
        FUT022KelvinFragment localFUT022KelvinFragment2 = this.this$0;
        FUT022KelvinFragment.access$4(localFUT022KelvinFragment2, (byte)(1 + FUT022KelvinFragment.access$2(localFUT022KelvinFragment2)));
      }
      Log.d("debug", "CirlgetData = " + FUT022KelvinFragment.access$2(this.this$0));
      continue;
      FUT022KelvinFragment.access$5(this.this$0, false);
      while (true)
      {
        if (FUT022KelvinFragment.access$2(this.this$0) >= 4)
        {
          FUT022KelvinFragment.access$1(this.this$0)[3] = (byte)FUT022KelvinFragment.access$3(this.this$0);
          FUT022KelvinFragment.access$4(this.this$0, (byte)0);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = FUT022KelvinFragment.access$1(this.this$0)[0];
          arrayOfByte[6] = FUT022KelvinFragment.access$1(this.this$0)[1];
          arrayOfByte[7] = FUT022KelvinFragment.access$1(this.this$0)[2];
          arrayOfByte[8] = FUT022KelvinFragment.access$1(this.this$0)[3];
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          Log.d("debug", "send cirl data");
          break;
        }
        FUT022KelvinFragment.access$1(this.this$0)[FUT022KelvinFragment.access$2(this.this$0)] = (byte)FUT022KelvinFragment.access$3(this.this$0);
        FUT022KelvinFragment localFUT022KelvinFragment1 = this.this$0;
        FUT022KelvinFragment.access$4(localFUT022KelvinFragment1, (byte)(1 + FUT022KelvinFragment.access$2(localFUT022KelvinFragment1)));
      }
      if ((0x1 & FUT022KelvinFragment.access$6(this.this$0)) == 1)
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -126;
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
      else if ((0x2 & FUT022KelvinFragment.access$6(this.this$0)) == 2)
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -126;
        arrayOfByte[5] = 4;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x4 & FUT022KelvinFragment.access$6(this.this$0)) == 4)
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -126;
        arrayOfByte[5] = 2;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x8 & FUT022KelvinFragment.access$6(this.this$0)) == 8)
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -126;
        arrayOfByte[5] = 3;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x10 & FUT022KelvinFragment.access$6(this.this$0)) == 16)
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -126;
        arrayOfByte[5] = 5;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
        continue;
        FUT022KelvinFragment.access$7(this.this$0, false);
        if (FUT022KelvinFragment.access$8(this.this$0) != FUT022KelvinFragment.access$9(this.this$0))
        {
          FUT022KelvinFragment.access$10(this.this$0, FUT022KelvinFragment.access$9(this.this$0));
          MyApp.PlalyKeySound();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT022KelvinFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */