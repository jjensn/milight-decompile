package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.xlink.MyApp;

class FUT093ColorFragment$1 extends Handler
{
  FUT093ColorFragment$1(FUT093ColorFragment paramFUT093ColorFragment)
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
    case 2:
    case 4353:
    case 1024:
    }
    do
    {
      do
      {
        return;
        FUT093ColorFragment.access$0(this.this$0, false);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = FUT093ColorFragment.access$1(this.this$0);
        arrayOfByte[5] = (byte)FUT093ColorFragment.access$2(this.this$0);
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        Log.d("debug", "send cirl data");
        return;
        FUT093ColorFragment.access$3(this.this$0, false);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 3;
        arrayOfByte[5] = (byte)FUT093ColorFragment.access$4(this.this$0);
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        return;
        Log.d("debug", "  LightColor = " + FUT093ColorFragment.access$2(this.this$0));
        FUT093ColorFragment.access$0(this.this$0, false);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = 1;
        arrayOfByte[5] = (byte)FUT093ColorFragment.access$2(this.this$0);
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 1;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = (byte)((char)(0xFF & arrayOfByte[0]) + (char)(0xFF & arrayOfByte[1]) + (char)(0xFF & arrayOfByte[2]) + (char)(0xFF & arrayOfByte[3]) + (char)(0xFF & arrayOfByte[4]) + (char)(0xFF & arrayOfByte[5]) + (char)(0xFF & arrayOfByte[6]) + (char)(0xFF & arrayOfByte[7]) + (char)(0xFF & arrayOfByte[8]));
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        return;
        if ((0x1 & FUT093ColorFragment.access$5(this.this$0)) == 1)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -124;
          arrayOfByte[5] = 7;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
          return;
        }
        if ((0x2 & FUT093ColorFragment.access$5(this.this$0)) == 2)
        {
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
          return;
        }
        if ((0x4 & FUT093ColorFragment.access$5(this.this$0)) == 4)
        {
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
          return;
        }
        if ((0x8 & FUT093ColorFragment.access$5(this.this$0)) == 8)
        {
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
          return;
        }
        if ((0x10 & FUT093ColorFragment.access$5(this.this$0)) == 16)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -124;
          arrayOfByte[5] = 3;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
          return;
        }
        if ((0x20 & FUT093ColorFragment.access$5(this.this$0)) == 32)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -124;
          arrayOfByte[5] = 4;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
          return;
        }
        if ((0x40 & FUT093ColorFragment.access$5(this.this$0)) == 64)
        {
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
          return;
        }
      }
      while ((0x80 & FUT093ColorFragment.access$5(this.this$0)) != 128);
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = -124;
      arrayOfByte[5] = 6;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      return;
      FUT093ColorFragment.access$6(this.this$0, false);
    }
    while (FUT093ColorFragment.access$7(this.this$0) == FUT093ColorFragment.access$2(this.this$0));
    FUT093ColorFragment.access$8(this.this$0, FUT093ColorFragment.access$2(this.this$0));
    MyApp.PlalyKeySound();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT093ColorFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */