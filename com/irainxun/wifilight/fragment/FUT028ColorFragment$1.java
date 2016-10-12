package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.xlink.MyApp;

class FUT028ColorFragment$1 extends Handler
{
  FUT028ColorFragment$1(FUT028ColorFragment paramFUT028ColorFragment)
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
    case 4353:
    case 4357:
    case 1024:
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      return;
      FUT028ColorFragment.access$0(this.this$0, false);
      FUT028ColorFragment.access$1(this.this$0)[FUT028ColorFragment.access$2(this.this$0)] = (byte)FUT028ColorFragment.access$3(this.this$0);
      if (FUT028ColorFragment.access$2(this.this$0) < 4)
      {
        FUT028ColorFragment localFUT028ColorFragment2 = this.this$0;
        FUT028ColorFragment.access$4(localFUT028ColorFragment2, (byte)(1 + FUT028ColorFragment.access$2(localFUT028ColorFragment2)));
      }
      Log.d("debug", "CirlgetData = " + FUT028ColorFragment.access$2(this.this$0));
      continue;
      FUT028ColorFragment.access$5(this.this$0, false);
      while (true)
      {
        if (FUT028ColorFragment.access$2(this.this$0) >= 4)
        {
          FUT028ColorFragment.access$1(this.this$0)[3] = (byte)FUT028ColorFragment.access$3(this.this$0);
          FUT028ColorFragment.access$4(this.this$0, (byte)0);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)(FUT028ColorFragment.access$6(this.this$0) - (0xFF & FUT028ColorFragment.access$1(this.this$0)[0]));
          arrayOfByte[6] = (byte)(FUT028ColorFragment.access$6(this.this$0) - (0xFF & FUT028ColorFragment.access$1(this.this$0)[1]));
          arrayOfByte[7] = (byte)(FUT028ColorFragment.access$6(this.this$0) - (0xFF & FUT028ColorFragment.access$1(this.this$0)[2]));
          arrayOfByte[8] = (byte)(FUT028ColorFragment.access$6(this.this$0) - (0xFF & FUT028ColorFragment.access$1(this.this$0)[3]));
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          Log.d("debug", "send cirl data");
          break;
        }
        FUT028ColorFragment.access$1(this.this$0)[FUT028ColorFragment.access$2(this.this$0)] = (byte)FUT028ColorFragment.access$3(this.this$0);
        FUT028ColorFragment localFUT028ColorFragment1 = this.this$0;
        FUT028ColorFragment.access$4(localFUT028ColorFragment1, (byte)(1 + FUT028ColorFragment.access$2(localFUT028ColorFragment1)));
      }
      FUT028ColorFragment.access$7(this.this$0, false);
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 2;
      arrayOfByte[5] = (byte)FUT028ColorFragment.access$8(this.this$0);
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      continue;
      if ((0x4 & FUT028ColorFragment.access$9(this.this$0)) == 4)
      {
        Log.d("debug", "long key tvOn");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -125;
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
      else if ((0x8 & FUT028ColorFragment.access$9(this.this$0)) == 8)
      {
        Log.d("debug", "long key tvOff");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -125;
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
      else if ((0x1 & FUT028ColorFragment.access$9(this.this$0)) == 1)
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -125;
        arrayOfByte[5] = 11;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x10 & FUT028ColorFragment.access$9(this.this$0)) == 16)
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -125;
        arrayOfByte[5] = 12;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
        continue;
        if ((0x1 & FUT028ColorFragment.access$10(this.this$0)) == 1)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 3;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
        }
        else if ((0x2 & FUT028ColorFragment.access$10(this.this$0)) == 2)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 4;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
        }
        else if ((0x4 & FUT028ColorFragment.access$10(this.this$0)) == 4)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 5;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
        }
        else if ((0x8 & FUT028ColorFragment.access$10(this.this$0)) == 8)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 6;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
        }
        else if ((0x10 & FUT028ColorFragment.access$10(this.this$0)) == 16)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 7;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
        }
        else if ((0x20 & FUT028ColorFragment.access$10(this.this$0)) == 32)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 8;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
        }
        else if ((0x40 & FUT028ColorFragment.access$10(this.this$0)) == 64)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 9;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
        }
        else if ((0x80 & FUT028ColorFragment.access$10(this.this$0)) == 128)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 10;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
          continue;
          FUT028ColorFragment.access$11(this.this$0, false);
          if (FUT028ColorFragment.access$12(this.this$0) != FUT028ColorFragment.access$13(this.this$0))
          {
            FUT028ColorFragment.access$14(this.this$0, FUT028ColorFragment.access$13(this.this$0));
            MyApp.PlalyKeySound();
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT028ColorFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */