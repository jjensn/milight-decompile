package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.irainxun.wifilight.xlink.MyApp;

class FUT956ColorFragment$3
  implements View.OnTouchListener
{
  FUT956ColorFragment$3(FUT956ColorFragment paramFUT956ColorFragment)
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
              MyApp.PlalyKeySound();
              if (paramView == FUT956ColorFragment.access$19(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.k_btn_on_press);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 1;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT956ColorFragment localFUT956ColorFragment11 = this.this$0;
                FUT956ColorFragment.access$20(localFUT956ColorFragment11, 0x4 | FUT956ColorFragment.access$9(localFUT956ColorFragment11));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT956ColorFragment.access$21(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.k_btn_off_press);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 2;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT956ColorFragment localFUT956ColorFragment10 = this.this$0;
                FUT956ColorFragment.access$20(localFUT956ColorFragment10, 0x8 | FUT956ColorFragment.access$9(localFUT956ColorFragment10));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT956ColorFragment.access$22(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.k_btn_press);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 6;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT956ColorFragment localFUT956ColorFragment9 = this.this$0;
                FUT956ColorFragment.access$20(localFUT956ColorFragment9, 0x2 | FUT956ColorFragment.access$9(localFUT956ColorFragment9));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT956ColorFragment.access$23(this.this$0))
              {
                FUT956ColorFragment.access$0(this.this$0, false);
                FUT956ColorFragment.access$5(this.this$0, false);
                FUT956ColorFragment.access$4(this.this$0, (byte)0);
                FUT956ColorFragment.access$24(this.this$0, i, j);
                FUT956ColorFragment.access$1(this.this$0)[0] = (byte)FUT956ColorFragment.access$3(this.this$0);
                FUT956ColorFragment.access$1(this.this$0)[1] = (byte)FUT956ColorFragment.access$3(this.this$0);
                FUT956ColorFragment.access$1(this.this$0)[2] = (byte)FUT956ColorFragment.access$3(this.this$0);
                FUT956ColorFragment.access$1(this.this$0)[3] = (byte)FUT956ColorFragment.access$3(this.this$0);
                FUT956ColorFragment.access$25(this.this$0, false);
                return true;
              }
              if (paramView == FUT956ColorFragment.access$26(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.fut028_btn_si_press);
                FUT956ColorFragment localFUT956ColorFragment8 = this.this$0;
                FUT956ColorFragment.access$20(localFUT956ColorFragment8, 0x1 | FUT956ColorFragment.access$9(localFUT956ColorFragment8));
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 3;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
            }
            while (paramView != FUT956ColorFragment.access$27(this.this$0));
            paramView.setBackgroundResource(R.drawable.fut028_btn_sd_press);
            FUT956ColorFragment localFUT956ColorFragment7 = this.this$0;
            FUT956ColorFragment.access$20(localFUT956ColorFragment7, 0x10 | FUT956ColorFragment.access$9(localFUT956ColorFragment7));
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 3;
            arrayOfByte[5] = 4;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            this.this$0.myHandler.removeMessages(4353);
            this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          while (paramView != FUT956ColorFragment.access$23(this.this$0));
          FUT956ColorFragment.access$25(this.this$0, false);
          FUT956ColorFragment.access$24(this.this$0, i, j);
        }
        while (FUT956ColorFragment.access$28(this.this$0));
        FUT956ColorFragment.access$5(this.this$0, true);
        this.this$0.myHandler.removeMessages(4356);
        this.this$0.myHandler.sendEmptyMessageDelayed(4356, 160L);
        return true;
        if (paramView == FUT956ColorFragment.access$23(this.this$0))
          break;
        if (paramView == FUT956ColorFragment.access$19(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_on_nor);
          FUT956ColorFragment localFUT956ColorFragment6 = this.this$0;
          FUT956ColorFragment.access$20(localFUT956ColorFragment6, 0xFFFFFFFB & FUT956ColorFragment.access$9(localFUT956ColorFragment6));
          return true;
        }
        if (paramView == FUT956ColorFragment.access$21(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_off_nor);
          FUT956ColorFragment localFUT956ColorFragment5 = this.this$0;
          FUT956ColorFragment.access$20(localFUT956ColorFragment5, 0xFFFFFFF7 & FUT956ColorFragment.access$9(localFUT956ColorFragment5));
          return true;
        }
        if (paramView == FUT956ColorFragment.access$22(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_nor);
          FUT956ColorFragment localFUT956ColorFragment4 = this.this$0;
          FUT956ColorFragment.access$20(localFUT956ColorFragment4, 0xFFFFFFFD & FUT956ColorFragment.access$9(localFUT956ColorFragment4));
          return true;
        }
        if (paramView == FUT956ColorFragment.access$26(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.fut028_btn_si_nor);
          FUT956ColorFragment localFUT956ColorFragment3 = this.this$0;
          FUT956ColorFragment.access$20(localFUT956ColorFragment3, 0xFFFFFFFE & FUT956ColorFragment.access$9(localFUT956ColorFragment3));
          return true;
        }
      }
      while (paramView != FUT956ColorFragment.access$27(this.this$0));
      FUT956ColorFragment localFUT956ColorFragment2 = this.this$0;
      FUT956ColorFragment.access$20(localFUT956ColorFragment2, 0xFFFFFFEF & FUT956ColorFragment.access$9(localFUT956ColorFragment2));
      paramView.setBackgroundResource(R.drawable.fut028_btn_sd_nor);
      return true;
    }
    while (paramView != FUT956ColorFragment.access$23(this.this$0));
    FUT956ColorFragment.access$10(this.this$0, false);
    this.this$0.myHandler.removeMessages(4356);
    while (true)
    {
      if (FUT956ColorFragment.access$2(this.this$0) >= 4)
      {
        FUT956ColorFragment.access$1(this.this$0)[3] = (byte)FUT956ColorFragment.access$3(this.this$0);
        FUT956ColorFragment.access$4(this.this$0, (byte)0);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 1;
        arrayOfByte[5] = (byte)(FUT956ColorFragment.access$6(this.this$0) - (0xFF & FUT956ColorFragment.access$1(this.this$0)[0]));
        arrayOfByte[6] = (byte)(FUT956ColorFragment.access$6(this.this$0) - (0xFF & FUT956ColorFragment.access$1(this.this$0)[1]));
        arrayOfByte[7] = (byte)(FUT956ColorFragment.access$6(this.this$0) - (0xFF & FUT956ColorFragment.access$1(this.this$0)[2]));
        arrayOfByte[8] = (byte)(FUT956ColorFragment.access$6(this.this$0) - (0xFF & FUT956ColorFragment.access$1(this.this$0)[3]));
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        return true;
      }
      FUT956ColorFragment.access$1(this.this$0)[FUT956ColorFragment.access$2(this.this$0)] = (byte)FUT956ColorFragment.access$3(this.this$0);
      FUT956ColorFragment localFUT956ColorFragment1 = this.this$0;
      FUT956ColorFragment.access$4(localFUT956ColorFragment1, (byte)(1 + FUT956ColorFragment.access$2(localFUT956ColorFragment1)));
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT956ColorFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */