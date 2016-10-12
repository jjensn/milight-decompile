package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.xlink.MyApp;

class LightFragment$1 extends Handler
{
  LightFragment$1(LightFragment paramLightFragment)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    byte[] arrayOfByte = new byte[12];
    switch (paramMessage.what)
    {
    default:
    case 4355:
    case 4354:
    case 4353:
    case 4356:
    case 1024:
    }
    while (true)
    {
      super.handleMessage(paramMessage);
      return;
      LightFragment.access$0(this.this$0, false);
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = 0;
      arrayOfByte[4] = 2;
      arrayOfByte[5] = (byte)LightFragment.access$1(this.this$0);
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = 1;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      continue;
      LightFragment.access$2(this.this$0, false);
      if (LightFragment.access$3(this.this$0) <= 3)
        LightFragment.access$4(this.this$0)[LightFragment.access$3(this.this$0)] = (byte)LightFragment.access$5(this.this$0);
      if (LightFragment.access$3(this.this$0) < 4)
      {
        LightFragment localLightFragment2 = this.this$0;
        LightFragment.access$6(localLightFragment2, (byte)(1 + LightFragment.access$3(localLightFragment2)));
      }
      Log.d("debug", "CirlgetData = " + LightFragment.access$3(this.this$0));
      continue;
      if ((0x1 & LightFragment.access$7(this.this$0)) == 1)
      {
        Log.d("debug", "long key s-");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = -125;
        arrayOfByte[5] = 1;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x2 & LightFragment.access$7(this.this$0)) == 2)
      {
        Log.d("debug", "long key s+");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = -125;
        arrayOfByte[5] = 2;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x4 & LightFragment.access$7(this.this$0)) == 4)
      {
        Log.d("debug", "long key tvOn");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = -125;
        arrayOfByte[5] = 3;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
      }
      else if ((0x8 & LightFragment.access$7(this.this$0)) == 8)
      {
        Log.d("debug", "long key tvOff");
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = -125;
        arrayOfByte[5] = 4;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 200L);
        continue;
        LightFragment.access$8(this.this$0, false);
        while (true)
        {
          if (LightFragment.access$3(this.this$0) >= 4)
          {
            LightFragment.access$4(this.this$0)[3] = (byte)LightFragment.access$5(this.this$0);
            LightFragment.access$6(this.this$0, (byte)0);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = 0;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = (byte)(LightFragment.access$9(this.this$0) - (0xFF & LightFragment.access$4(this.this$0)[0]));
            arrayOfByte[6] = (byte)(LightFragment.access$9(this.this$0) - (0xFF & LightFragment.access$4(this.this$0)[1]));
            arrayOfByte[7] = (byte)(LightFragment.access$9(this.this$0) - (0xFF & LightFragment.access$4(this.this$0)[2]));
            arrayOfByte[8] = (byte)(LightFragment.access$9(this.this$0) - (0xFF & LightFragment.access$4(this.this$0)[3]));
            arrayOfByte[9] = 1;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            Log.d("debug", "send cirl data");
            break;
          }
          LightFragment.access$4(this.this$0)[LightFragment.access$3(this.this$0)] = (byte)LightFragment.access$5(this.this$0);
          LightFragment localLightFragment1 = this.this$0;
          LightFragment.access$6(localLightFragment1, (byte)(1 + LightFragment.access$3(localLightFragment1)));
        }
        LightFragment.access$10(this.this$0, false);
        if (LightFragment.access$11(this.this$0) != LightFragment.access$12(this.this$0))
        {
          LightFragment.access$13(this.this$0, LightFragment.access$12(this.this$0));
          MyApp.PlalyKeySound();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.LightFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */