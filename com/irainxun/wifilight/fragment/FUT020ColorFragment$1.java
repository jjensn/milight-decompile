package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.xlink.MyApp;

class FUT020ColorFragment$1 extends Handler
{
  FUT020ColorFragment$1(FUT020ColorFragment paramFUT020ColorFragment)
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
      FUT020ColorFragment.access$0(this.this$0, false);
      FUT020ColorFragment.access$1(this.this$0)[FUT020ColorFragment.access$2(this.this$0)] = (byte)FUT020ColorFragment.access$3(this.this$0);
      if (FUT020ColorFragment.access$2(this.this$0) < 4)
      {
        FUT020ColorFragment localFUT020ColorFragment3 = this.this$0;
        FUT020ColorFragment.access$4(localFUT020ColorFragment3, (byte)(1 + FUT020ColorFragment.access$2(localFUT020ColorFragment3)));
      }
      Log.d("debug", "CirlgetData = " + FUT020ColorFragment.access$2(this.this$0));
      continue;
      FUT020ColorFragment.access$5(this.this$0, false);
      while (true)
      {
        if (FUT020ColorFragment.access$2(this.this$0) >= 4)
        {
          FUT020ColorFragment.access$1(this.this$0)[3] = (byte)FUT020ColorFragment.access$3(this.this$0);
          FUT020ColorFragment.access$4(this.this$0, (byte)0);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)(FUT020ColorFragment.access$6(this.this$0) - (0xFF & FUT020ColorFragment.access$1(this.this$0)[0]));
          arrayOfByte[6] = (byte)(FUT020ColorFragment.access$6(this.this$0) - (0xFF & FUT020ColorFragment.access$1(this.this$0)[1]));
          arrayOfByte[7] = (byte)(FUT020ColorFragment.access$6(this.this$0) - (0xFF & FUT020ColorFragment.access$1(this.this$0)[2]));
          arrayOfByte[8] = (byte)(FUT020ColorFragment.access$6(this.this$0) - (0xFF & FUT020ColorFragment.access$1(this.this$0)[3]));
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          Log.d("debug", "send cirl data");
          break;
        }
        FUT020ColorFragment.access$1(this.this$0)[FUT020ColorFragment.access$2(this.this$0)] = (byte)FUT020ColorFragment.access$3(this.this$0);
        FUT020ColorFragment localFUT020ColorFragment2 = this.this$0;
        FUT020ColorFragment.access$4(localFUT020ColorFragment2, (byte)(1 + FUT020ColorFragment.access$2(localFUT020ColorFragment2)));
      }
      if ((0x2 & FUT020ColorFragment.access$7(this.this$0)) == 2)
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
      else if ((0x4 & FUT020ColorFragment.access$7(this.this$0)) == 4)
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
      else if ((0x8 & FUT020ColorFragment.access$7(this.this$0)) == 8)
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
        FUT020ColorFragment localFUT020ColorFragment1 = this.this$0;
        FUT020ColorFragment.access$8(localFUT020ColorFragment1, 0x8 | FUT020ColorFragment.access$7(localFUT020ColorFragment1));
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x1 & FUT020ColorFragment.access$7(this.this$0)) == 1)
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
      else if ((0x10 & FUT020ColorFragment.access$7(this.this$0)) == 16)
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
        FUT020ColorFragment.access$9(this.this$0, false);
        if (FUT020ColorFragment.access$10(this.this$0) != FUT020ColorFragment.access$11(this.this$0))
        {
          FUT020ColorFragment.access$12(this.this$0, FUT020ColorFragment.access$11(this.this$0));
          MyApp.PlalyKeySound();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT020ColorFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */