package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.irainxun.wifilight.xlink.MyApp;

class FUT092ColorFragment$2
  implements View.OnTouchListener
{
  FUT092ColorFragment$2(FUT092ColorFragment paramFUT092ColorFragment)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    byte[] arrayOfByte = new byte[12];
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return true;
              if (paramView != FUT092ColorFragment.access$17(this.this$0))
                MyApp.PlalyKeySound();
              if (paramView == FUT092ColorFragment.access$18(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.k_btn_on_press);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 4;
                arrayOfByte[5] = 1;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT092ColorFragment localFUT092ColorFragment7 = this.this$0;
                FUT092ColorFragment.access$19(localFUT092ColorFragment7, 0x4 | FUT092ColorFragment.access$9(localFUT092ColorFragment7));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT092ColorFragment.access$20(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.k_btn_off_press);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 4;
                arrayOfByte[5] = 2;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT092ColorFragment localFUT092ColorFragment6 = this.this$0;
                FUT092ColorFragment.access$19(localFUT092ColorFragment6, 0x8 | FUT092ColorFragment.access$9(localFUT092ColorFragment6));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT092ColorFragment.access$21(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.k_btn_press);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 4;
                arrayOfByte[5] = 5;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT092ColorFragment localFUT092ColorFragment5 = this.this$0;
                FUT092ColorFragment.access$19(localFUT092ColorFragment5, 0x2 | FUT092ColorFragment.access$9(localFUT092ColorFragment5));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
            }
            while (paramView != FUT092ColorFragment.access$17(this.this$0));
            MyApp.lightmode = false;
            FUT092ColorFragment.access$0(this.this$0, false);
            FUT092ColorFragment.access$5(this.this$0, false);
            FUT092ColorFragment.access$4(this.this$0, (byte)0);
            FUT092ColorFragment.access$22(this.this$0, i, j);
            FUT092ColorFragment.access$1(this.this$0)[0] = (byte)FUT092ColorFragment.access$3(this.this$0);
            FUT092ColorFragment.access$1(this.this$0)[1] = (byte)FUT092ColorFragment.access$3(this.this$0);
            FUT092ColorFragment.access$1(this.this$0)[2] = (byte)FUT092ColorFragment.access$3(this.this$0);
            FUT092ColorFragment.access$1(this.this$0)[3] = (byte)FUT092ColorFragment.access$3(this.this$0);
            MyApp.rain_08color = FUT092ColorFragment.access$3(this.this$0);
            return true;
          }
          while (paramView != FUT092ColorFragment.access$17(this.this$0));
          MyApp.lightmode = false;
          FUT092ColorFragment.access$22(this.this$0, i, j);
        }
        while (FUT092ColorFragment.access$23(this.this$0));
        FUT092ColorFragment.access$5(this.this$0, true);
        this.this$0.myHandler.removeMessages(4356);
        this.this$0.myHandler.sendEmptyMessageDelayed(4356, 160L);
        return true;
        if (paramView == FUT092ColorFragment.access$17(this.this$0))
          break;
        if (paramView == FUT092ColorFragment.access$18(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_on_nor);
          FUT092ColorFragment localFUT092ColorFragment4 = this.this$0;
          FUT092ColorFragment.access$19(localFUT092ColorFragment4, 0xFFFFFFFB & FUT092ColorFragment.access$9(localFUT092ColorFragment4));
          return true;
        }
        if (paramView == FUT092ColorFragment.access$20(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_off_nor);
          FUT092ColorFragment localFUT092ColorFragment3 = this.this$0;
          FUT092ColorFragment.access$19(localFUT092ColorFragment3, 0xFFFFFFF7 & FUT092ColorFragment.access$9(localFUT092ColorFragment3));
          return true;
        }
      }
      while (paramView != FUT092ColorFragment.access$21(this.this$0));
      paramView.setBackgroundResource(R.drawable.k_btn_nor);
      FUT092ColorFragment localFUT092ColorFragment2 = this.this$0;
      FUT092ColorFragment.access$19(localFUT092ColorFragment2, 0xFFFFFFFD & FUT092ColorFragment.access$9(localFUT092ColorFragment2));
      return true;
    }
    while (paramView != FUT092ColorFragment.access$17(this.this$0));
    FUT092ColorFragment.access$10(this.this$0, false);
    this.this$0.myHandler.removeMessages(4356);
    while (true)
    {
      if (FUT092ColorFragment.access$2(this.this$0) >= 4)
      {
        FUT092ColorFragment.access$1(this.this$0)[3] = (byte)FUT092ColorFragment.access$3(this.this$0);
        MyApp.rain_08color = FUT092ColorFragment.access$3(this.this$0);
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
        return true;
      }
      FUT092ColorFragment.access$1(this.this$0)[FUT092ColorFragment.access$2(this.this$0)] = (byte)FUT092ColorFragment.access$3(this.this$0);
      FUT092ColorFragment localFUT092ColorFragment1 = this.this$0;
      FUT092ColorFragment.access$4(localFUT092ColorFragment1, (byte)(1 + FUT092ColorFragment.access$2(localFUT092ColorFragment1)));
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ColorFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */