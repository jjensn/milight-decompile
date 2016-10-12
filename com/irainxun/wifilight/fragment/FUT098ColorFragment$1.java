package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.xlink.MyApp;

class FUT098ColorFragment$1 extends Handler
{
  FUT098ColorFragment$1(FUT098ColorFragment paramFUT098ColorFragment)
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
    case 4355:
    case 1024:
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      return;
      FUT098ColorFragment.access$0(this.this$0, false);
      FUT098ColorFragment.access$1(this.this$0)[FUT098ColorFragment.access$2(this.this$0)] = (byte)FUT098ColorFragment.access$3(this.this$0);
      if (FUT098ColorFragment.access$2(this.this$0) < 4)
      {
        FUT098ColorFragment localFUT098ColorFragment2 = this.this$0;
        FUT098ColorFragment.access$4(localFUT098ColorFragment2, (byte)(1 + FUT098ColorFragment.access$2(localFUT098ColorFragment2)));
      }
      Log.d("debug", "CirlgetData = " + FUT098ColorFragment.access$2(this.this$0));
      continue;
      FUT098ColorFragment.access$5(this.this$0, false);
      while (true)
      {
        if (FUT098ColorFragment.access$2(this.this$0) >= 4)
        {
          FUT098ColorFragment.access$1(this.this$0)[3] = (byte)FUT098ColorFragment.access$3(this.this$0);
          FUT098ColorFragment.access$4(this.this$0, (byte)0);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)(FUT098ColorFragment.access$6(this.this$0) - (0xFF & FUT098ColorFragment.access$1(this.this$0)[0]));
          arrayOfByte[6] = (byte)(FUT098ColorFragment.access$6(this.this$0) - (0xFF & FUT098ColorFragment.access$1(this.this$0)[1]));
          arrayOfByte[7] = (byte)(FUT098ColorFragment.access$6(this.this$0) - (0xFF & FUT098ColorFragment.access$1(this.this$0)[2]));
          arrayOfByte[8] = (byte)(FUT098ColorFragment.access$6(this.this$0) - (0xFF & FUT098ColorFragment.access$1(this.this$0)[3]));
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          Log.d("debug", "send cirl data");
          break;
        }
        FUT098ColorFragment.access$1(this.this$0)[FUT098ColorFragment.access$2(this.this$0)] = (byte)FUT098ColorFragment.access$3(this.this$0);
        FUT098ColorFragment localFUT098ColorFragment1 = this.this$0;
        FUT098ColorFragment.access$4(localFUT098ColorFragment1, (byte)(1 + FUT098ColorFragment.access$2(localFUT098ColorFragment1)));
      }
      if ((0x2 & FUT098ColorFragment.access$7(this.this$0)) == 2)
      {
        Log.d("debug", "long key Night light");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -124;
        arrayOfByte[5] = 8;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x4 & FUT098ColorFragment.access$7(this.this$0)) == 4)
      {
        Log.d("debug", "long key tvOn");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -126;
        arrayOfByte[5] = 9;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x8 & FUT098ColorFragment.access$7(this.this$0)) == 8)
      {
        Log.d("debug", "long key tvOff");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = -126;
        arrayOfByte[5] = 10;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
        continue;
        if ((0x1 & FUT098ColorFragment.access$8(this.this$0)) == 1)
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
          this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
        }
        else if ((0x2 & FUT098ColorFragment.access$8(this.this$0)) == 2)
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
          this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
        }
        else if ((0x4 & FUT098ColorFragment.access$8(this.this$0)) == 4)
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
          this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
        }
        else if ((0x8 & FUT098ColorFragment.access$8(this.this$0)) == 8)
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
          this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
        }
        else if ((0x10 & FUT098ColorFragment.access$8(this.this$0)) == 16)
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
          this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
        }
        else if ((0x20 & FUT098ColorFragment.access$8(this.this$0)) == 32)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -126;
          arrayOfByte[5] = 6;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
          continue;
          FUT098ColorFragment.access$9(this.this$0, false);
          if (FUT098ColorFragment.access$10(this.this$0) != FUT098ColorFragment.access$11(this.this$0))
          {
            FUT098ColorFragment.access$12(this.this$0, FUT098ColorFragment.access$11(this.this$0));
            MyApp.PlalyKeySound();
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT098ColorFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */