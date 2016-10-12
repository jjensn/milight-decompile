package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT098ColorFragment$2
  implements View.OnTouchListener
{
  FUT098ColorFragment$2(FUT098ColorFragment paramFUT098ColorFragment)
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
              if (paramView == FUT098ColorFragment.access$13(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.ic_btn_on_press);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 2;
                arrayOfByte[5] = 9;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT098ColorFragment localFUT098ColorFragment17 = this.this$0;
                FUT098ColorFragment.access$14(localFUT098ColorFragment17, 0x4 | FUT098ColorFragment.access$7(localFUT098ColorFragment17));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT098ColorFragment.access$15(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.ic_btn_off_press);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 2;
                arrayOfByte[5] = 10;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT098ColorFragment localFUT098ColorFragment16 = this.this$0;
                FUT098ColorFragment.access$14(localFUT098ColorFragment16, 0x8 | FUT098ColorFragment.access$7(localFUT098ColorFragment16));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT098ColorFragment.access$16(this.this$0))
              {
                FUT098ColorFragment.access$0(this.this$0, false);
                FUT098ColorFragment.access$5(this.this$0, false);
                FUT098ColorFragment.access$4(this.this$0, (byte)0);
                FUT098ColorFragment.access$17(this.this$0, i, j);
                FUT098ColorFragment.access$1(this.this$0)[0] = (byte)FUT098ColorFragment.access$3(this.this$0);
                FUT098ColorFragment.access$1(this.this$0)[1] = (byte)FUT098ColorFragment.access$3(this.this$0);
                FUT098ColorFragment.access$1(this.this$0)[2] = (byte)FUT098ColorFragment.access$3(this.this$0);
                FUT098ColorFragment.access$1(this.this$0)[3] = (byte)FUT098ColorFragment.access$3(this.this$0);
                return true;
              }
              if (paramView == FUT098ColorFragment.access$18(this.this$0))
              {
                FUT098ColorFragment.access$18(this.this$0).setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_bn_press, 0, 0);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 2;
                arrayOfByte[5] = 1;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT098ColorFragment localFUT098ColorFragment15 = this.this$0;
                FUT098ColorFragment.access$19(localFUT098ColorFragment15, 0x1 | FUT098ColorFragment.access$8(localFUT098ColorFragment15));
                this.this$0.myHandler.removeMessages(4355);
                this.this$0.myHandler.sendEmptyMessageDelayed(4355, 400L);
                return true;
              }
              if (paramView == FUT098ColorFragment.access$20(this.this$0))
              {
                FUT098ColorFragment.access$20(this.this$0).setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_si_press, 0, 0);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 2;
                arrayOfByte[5] = 3;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT098ColorFragment localFUT098ColorFragment14 = this.this$0;
                FUT098ColorFragment.access$19(localFUT098ColorFragment14, 0x2 | FUT098ColorFragment.access$8(localFUT098ColorFragment14));
                this.this$0.myHandler.removeMessages(4355);
                this.this$0.myHandler.sendEmptyMessageDelayed(4355, 400L);
                return true;
              }
              if (paramView == FUT098ColorFragment.access$21(this.this$0))
              {
                FUT098ColorFragment.access$21(this.this$0).setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_mu_press, 0, 0);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 2;
                arrayOfByte[5] = 5;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT098ColorFragment localFUT098ColorFragment13 = this.this$0;
                FUT098ColorFragment.access$19(localFUT098ColorFragment13, 0x4 | FUT098ColorFragment.access$8(localFUT098ColorFragment13));
                this.this$0.myHandler.removeMessages(4355);
                this.this$0.myHandler.sendEmptyMessageDelayed(4355, 400L);
                return true;
              }
              if (paramView == FUT098ColorFragment.access$22(this.this$0))
              {
                FUT098ColorFragment.access$22(this.this$0).setImageResource(R.drawable.btn_light1_press);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 2;
                arrayOfByte[5] = 2;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT098ColorFragment localFUT098ColorFragment12 = this.this$0;
                FUT098ColorFragment.access$19(localFUT098ColorFragment12, 0x8 | FUT098ColorFragment.access$8(localFUT098ColorFragment12));
                this.this$0.myHandler.removeMessages(4355);
                this.this$0.myHandler.sendEmptyMessageDelayed(4355, 400L);
                return true;
              }
              if (paramView == FUT098ColorFragment.access$23(this.this$0))
              {
                FUT098ColorFragment.access$23(this.this$0).setImageResource(R.drawable.fut098_sd_press);
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 2;
                arrayOfByte[5] = 4;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT098ColorFragment localFUT098ColorFragment11 = this.this$0;
                FUT098ColorFragment.access$19(localFUT098ColorFragment11, 0x10 | FUT098ColorFragment.access$8(localFUT098ColorFragment11));
                this.this$0.myHandler.removeMessages(4355);
                this.this$0.myHandler.sendEmptyMessageDelayed(4355, 400L);
                return true;
              }
            }
            while (paramView != FUT098ColorFragment.access$24(this.this$0));
            FUT098ColorFragment.access$24(this.this$0).setImageResource(R.drawable.fut098_md_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 2;
            arrayOfByte[5] = 6;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT098ColorFragment localFUT098ColorFragment10 = this.this$0;
            FUT098ColorFragment.access$19(localFUT098ColorFragment10, 0x20 | FUT098ColorFragment.access$8(localFUT098ColorFragment10));
            this.this$0.myHandler.removeMessages(4355);
            this.this$0.myHandler.sendEmptyMessageDelayed(4355, 400L);
            return true;
          }
          while (paramView != FUT098ColorFragment.access$16(this.this$0));
          FUT098ColorFragment.access$17(this.this$0, i, j);
        }
        while (FUT098ColorFragment.access$25(this.this$0));
        FUT098ColorFragment.access$5(this.this$0, true);
        this.this$0.myHandler.removeMessages(4356);
        this.this$0.myHandler.sendEmptyMessageDelayed(4356, 160L);
        return true;
        if (paramView == FUT098ColorFragment.access$16(this.this$0))
          break;
        if (paramView == FUT098ColorFragment.access$13(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.ic_btn_on_nor);
          FUT098ColorFragment localFUT098ColorFragment9 = this.this$0;
          FUT098ColorFragment.access$14(localFUT098ColorFragment9, 0xFFFFFFFB & FUT098ColorFragment.access$7(localFUT098ColorFragment9));
          return true;
        }
        if (paramView == FUT098ColorFragment.access$15(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.ic_btn_off_nor);
          FUT098ColorFragment localFUT098ColorFragment8 = this.this$0;
          FUT098ColorFragment.access$14(localFUT098ColorFragment8, 0xFFFFFFF7 & FUT098ColorFragment.access$7(localFUT098ColorFragment8));
          return true;
        }
        if (paramView == FUT098ColorFragment.access$18(this.this$0))
        {
          FUT098ColorFragment.access$18(this.this$0).setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_bn_nor, 0, 0);
          FUT098ColorFragment localFUT098ColorFragment7 = this.this$0;
          FUT098ColorFragment.access$19(localFUT098ColorFragment7, 0xFFFFFFFE & FUT098ColorFragment.access$8(localFUT098ColorFragment7));
          return true;
        }
        if (paramView == FUT098ColorFragment.access$20(this.this$0))
        {
          FUT098ColorFragment.access$20(this.this$0).setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_si_nor, 0, 0);
          FUT098ColorFragment localFUT098ColorFragment6 = this.this$0;
          FUT098ColorFragment.access$19(localFUT098ColorFragment6, 0xFFFFFFFD & FUT098ColorFragment.access$8(localFUT098ColorFragment6));
          return true;
        }
        if (paramView == FUT098ColorFragment.access$21(this.this$0))
        {
          FUT098ColorFragment.access$21(this.this$0).setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_mu_nor, 0, 0);
          FUT098ColorFragment localFUT098ColorFragment5 = this.this$0;
          FUT098ColorFragment.access$19(localFUT098ColorFragment5, 0xFFFFFFFB & FUT098ColorFragment.access$8(localFUT098ColorFragment5));
          return true;
        }
        if (paramView == FUT098ColorFragment.access$22(this.this$0))
        {
          FUT098ColorFragment.access$22(this.this$0).setImageResource(R.drawable.btn_light1_nor);
          FUT098ColorFragment localFUT098ColorFragment4 = this.this$0;
          FUT098ColorFragment.access$19(localFUT098ColorFragment4, 0xFFFFFFF7 & FUT098ColorFragment.access$8(localFUT098ColorFragment4));
          return true;
        }
        if (paramView == FUT098ColorFragment.access$23(this.this$0))
        {
          FUT098ColorFragment.access$23(this.this$0).setImageResource(R.drawable.fut098_sd_nor);
          FUT098ColorFragment localFUT098ColorFragment3 = this.this$0;
          FUT098ColorFragment.access$19(localFUT098ColorFragment3, 0xFFFFFFEF & FUT098ColorFragment.access$8(localFUT098ColorFragment3));
          return true;
        }
      }
      while (paramView != FUT098ColorFragment.access$24(this.this$0));
      FUT098ColorFragment.access$24(this.this$0).setImageResource(R.drawable.fut098_md_nor);
      FUT098ColorFragment localFUT098ColorFragment2 = this.this$0;
      FUT098ColorFragment.access$19(localFUT098ColorFragment2, 0xFFFFFFDF & FUT098ColorFragment.access$8(localFUT098ColorFragment2));
      return true;
    }
    while (paramView != FUT098ColorFragment.access$16(this.this$0));
    FUT098ColorFragment.access$9(this.this$0, false);
    this.this$0.myHandler.removeMessages(4356);
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
        return true;
      }
      FUT098ColorFragment.access$1(this.this$0)[FUT098ColorFragment.access$2(this.this$0)] = (byte)FUT098ColorFragment.access$3(this.this$0);
      FUT098ColorFragment localFUT098ColorFragment1 = this.this$0;
      FUT098ColorFragment.access$4(localFUT098ColorFragment1, (byte)(1 + FUT098ColorFragment.access$2(localFUT098ColorFragment1)));
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT098ColorFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */