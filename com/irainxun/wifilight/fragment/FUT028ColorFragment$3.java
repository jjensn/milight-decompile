package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT028ColorFragment$3
  implements View.OnTouchListener
{
  FUT028ColorFragment$3(FUT028ColorFragment paramFUT028ColorFragment)
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
              if (paramView == FUT028ColorFragment.access$20(this.this$0))
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
                FUT028ColorFragment localFUT028ColorFragment25 = this.this$0;
                FUT028ColorFragment.access$21(localFUT028ColorFragment25, 0x4 | FUT028ColorFragment.access$9(localFUT028ColorFragment25));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT028ColorFragment.access$22(this.this$0))
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
                FUT028ColorFragment localFUT028ColorFragment24 = this.this$0;
                FUT028ColorFragment.access$21(localFUT028ColorFragment24, 0x8 | FUT028ColorFragment.access$9(localFUT028ColorFragment24));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT028ColorFragment.access$23(this.this$0))
              {
                FUT028ColorFragment.access$0(this.this$0, false);
                FUT028ColorFragment.access$5(this.this$0, false);
                FUT028ColorFragment.access$4(this.this$0, (byte)0);
                FUT028ColorFragment.access$24(this.this$0, i, j);
                FUT028ColorFragment.access$1(this.this$0)[0] = (byte)FUT028ColorFragment.access$3(this.this$0);
                FUT028ColorFragment.access$1(this.this$0)[1] = (byte)FUT028ColorFragment.access$3(this.this$0);
                FUT028ColorFragment.access$1(this.this$0)[2] = (byte)FUT028ColorFragment.access$3(this.this$0);
                FUT028ColorFragment.access$1(this.this$0)[3] = (byte)FUT028ColorFragment.access$3(this.this$0);
                return true;
              }
              if (paramView == FUT028ColorFragment.access$25(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.fut028_btn_si_press);
                FUT028ColorFragment localFUT028ColorFragment23 = this.this$0;
                FUT028ColorFragment.access$21(localFUT028ColorFragment23, 0x1 | FUT028ColorFragment.access$9(localFUT028ColorFragment23));
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 11;
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
              if (paramView == FUT028ColorFragment.access$26(this.this$0))
              {
                paramView.setBackgroundResource(R.drawable.fut028_btn_sd_press);
                FUT028ColorFragment localFUT028ColorFragment22 = this.this$0;
                FUT028ColorFragment.access$21(localFUT028ColorFragment22, 0x10 | FUT028ColorFragment.access$9(localFUT028ColorFragment22));
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 12;
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
              if (paramView == FUT028ColorFragment.access$27(this.this$0))
              {
                FUT028ColorFragment.access$27(this.this$0).setImageResource(R.drawable.fut028_btn_au_press);
                FUT028ColorFragment localFUT028ColorFragment21 = this.this$0;
                FUT028ColorFragment.access$28(localFUT028ColorFragment21, 0x1 | FUT028ColorFragment.access$10(localFUT028ColorFragment21));
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
                this.this$0.myHandler.removeMessages(4357);
                this.this$0.myHandler.sendEmptyMessageDelayed(4357, 400L);
                return true;
              }
              if (paramView == FUT028ColorFragment.access$29(this.this$0))
              {
                FUT028ColorFragment.access$29(this.this$0).setImageResource(R.drawable.fut028_btn_ad_press);
                FUT028ColorFragment localFUT028ColorFragment20 = this.this$0;
                FUT028ColorFragment.access$28(localFUT028ColorFragment20, 0x2 | FUT028ColorFragment.access$10(localFUT028ColorFragment20));
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
                this.this$0.myHandler.removeMessages(4357);
                this.this$0.myHandler.sendEmptyMessageDelayed(4357, 400L);
                return true;
              }
              if (paramView == FUT028ColorFragment.access$30(this.this$0))
              {
                FUT028ColorFragment.access$30(this.this$0).setImageResource(R.drawable.fut028_btn_au_press);
                FUT028ColorFragment localFUT028ColorFragment19 = this.this$0;
                FUT028ColorFragment.access$28(localFUT028ColorFragment19, 0x4 | FUT028ColorFragment.access$10(localFUT028ColorFragment19));
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 5;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                this.this$0.myHandler.removeMessages(4357);
                this.this$0.myHandler.sendEmptyMessageDelayed(4357, 400L);
                return true;
              }
              if (paramView == FUT028ColorFragment.access$31(this.this$0))
              {
                FUT028ColorFragment.access$31(this.this$0).setImageResource(R.drawable.fut028_btn_ad_press);
                FUT028ColorFragment localFUT028ColorFragment18 = this.this$0;
                FUT028ColorFragment.access$28(localFUT028ColorFragment18, 0x8 | FUT028ColorFragment.access$10(localFUT028ColorFragment18));
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
                this.this$0.myHandler.removeMessages(4357);
                this.this$0.myHandler.sendEmptyMessageDelayed(4357, 400L);
                return true;
              }
              if (paramView == FUT028ColorFragment.access$32(this.this$0))
              {
                FUT028ColorFragment.access$32(this.this$0).setImageResource(R.drawable.fut028_btn_au_press);
                FUT028ColorFragment localFUT028ColorFragment17 = this.this$0;
                FUT028ColorFragment.access$28(localFUT028ColorFragment17, 0x10 | FUT028ColorFragment.access$10(localFUT028ColorFragment17));
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 7;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                this.this$0.myHandler.removeMessages(4357);
                this.this$0.myHandler.sendEmptyMessageDelayed(4357, 400L);
                return true;
              }
              if (paramView == FUT028ColorFragment.access$33(this.this$0))
              {
                FUT028ColorFragment.access$33(this.this$0).setImageResource(R.drawable.fut028_btn_ad_press);
                FUT028ColorFragment localFUT028ColorFragment16 = this.this$0;
                FUT028ColorFragment.access$28(localFUT028ColorFragment16, 0x20 | FUT028ColorFragment.access$10(localFUT028ColorFragment16));
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 8;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                this.this$0.myHandler.removeMessages(4357);
                this.this$0.myHandler.sendEmptyMessageDelayed(4357, 400L);
                return true;
              }
              if (paramView == FUT028ColorFragment.access$34(this.this$0))
              {
                FUT028ColorFragment.access$34(this.this$0).setImageResource(R.drawable.fut028_btn_au_press);
                FUT028ColorFragment localFUT028ColorFragment15 = this.this$0;
                FUT028ColorFragment.access$28(localFUT028ColorFragment15, 0x40 | FUT028ColorFragment.access$10(localFUT028ColorFragment15));
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 9;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                this.this$0.myHandler.removeMessages(4357);
                this.this$0.myHandler.sendEmptyMessageDelayed(4357, 400L);
                return true;
              }
            }
            while (paramView != FUT028ColorFragment.access$35(this.this$0));
            FUT028ColorFragment.access$35(this.this$0).setImageResource(R.drawable.fut028_btn_ad_press);
            FUT028ColorFragment localFUT028ColorFragment14 = this.this$0;
            FUT028ColorFragment.access$28(localFUT028ColorFragment14, 0x80 | FUT028ColorFragment.access$10(localFUT028ColorFragment14));
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 3;
            arrayOfByte[5] = 10;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            this.this$0.myHandler.removeMessages(4357);
            this.this$0.myHandler.sendEmptyMessageDelayed(4357, 400L);
            return true;
          }
          while (paramView != FUT028ColorFragment.access$23(this.this$0));
          FUT028ColorFragment.access$24(this.this$0, i, j);
        }
        while (FUT028ColorFragment.access$36(this.this$0));
        FUT028ColorFragment.access$5(this.this$0, true);
        this.this$0.myHandler.removeMessages(4356);
        this.this$0.myHandler.sendEmptyMessageDelayed(4356, 160L);
        return true;
        if (paramView == FUT028ColorFragment.access$23(this.this$0))
          break;
        if (paramView == FUT028ColorFragment.access$20(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_on_nor);
          FUT028ColorFragment localFUT028ColorFragment13 = this.this$0;
          FUT028ColorFragment.access$21(localFUT028ColorFragment13, 0xFFFFFFFB & FUT028ColorFragment.access$9(localFUT028ColorFragment13));
          return true;
        }
        if (paramView == FUT028ColorFragment.access$22(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_off_nor);
          FUT028ColorFragment localFUT028ColorFragment12 = this.this$0;
          FUT028ColorFragment.access$21(localFUT028ColorFragment12, 0xFFFFFFF7 & FUT028ColorFragment.access$9(localFUT028ColorFragment12));
          return true;
        }
        if (paramView == FUT028ColorFragment.access$25(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.fut028_btn_si_nor);
          FUT028ColorFragment localFUT028ColorFragment11 = this.this$0;
          FUT028ColorFragment.access$21(localFUT028ColorFragment11, 0xFFFFFFFE & FUT028ColorFragment.access$9(localFUT028ColorFragment11));
          return true;
        }
        if (paramView == FUT028ColorFragment.access$26(this.this$0))
        {
          FUT028ColorFragment localFUT028ColorFragment10 = this.this$0;
          FUT028ColorFragment.access$21(localFUT028ColorFragment10, 0xFFFFFFEF & FUT028ColorFragment.access$9(localFUT028ColorFragment10));
          paramView.setBackgroundResource(R.drawable.fut028_btn_sd_nor);
          return true;
        }
        if (paramView == FUT028ColorFragment.access$27(this.this$0))
        {
          FUT028ColorFragment.access$27(this.this$0).setImageResource(R.drawable.fut028_btn_au_nor);
          FUT028ColorFragment localFUT028ColorFragment9 = this.this$0;
          FUT028ColorFragment.access$28(localFUT028ColorFragment9, 0xFFFFFFFE & FUT028ColorFragment.access$10(localFUT028ColorFragment9));
          return true;
        }
        if (paramView == FUT028ColorFragment.access$29(this.this$0))
        {
          FUT028ColorFragment.access$29(this.this$0).setImageResource(R.drawable.fut028_btn_ad_nor);
          FUT028ColorFragment localFUT028ColorFragment8 = this.this$0;
          FUT028ColorFragment.access$28(localFUT028ColorFragment8, 0xFFFFFFFD & FUT028ColorFragment.access$10(localFUT028ColorFragment8));
          return true;
        }
        if (paramView == FUT028ColorFragment.access$30(this.this$0))
        {
          FUT028ColorFragment.access$30(this.this$0).setImageResource(R.drawable.fut028_btn_au_nor);
          FUT028ColorFragment localFUT028ColorFragment7 = this.this$0;
          FUT028ColorFragment.access$28(localFUT028ColorFragment7, 0xFFFFFFFB & FUT028ColorFragment.access$10(localFUT028ColorFragment7));
          return true;
        }
        if (paramView == FUT028ColorFragment.access$31(this.this$0))
        {
          FUT028ColorFragment.access$31(this.this$0).setImageResource(R.drawable.fut028_btn_ad_nor);
          FUT028ColorFragment localFUT028ColorFragment6 = this.this$0;
          FUT028ColorFragment.access$28(localFUT028ColorFragment6, 0xFFFFFFF7 & FUT028ColorFragment.access$10(localFUT028ColorFragment6));
          return true;
        }
        if (paramView == FUT028ColorFragment.access$32(this.this$0))
        {
          FUT028ColorFragment.access$32(this.this$0).setImageResource(R.drawable.fut028_btn_au_nor);
          FUT028ColorFragment localFUT028ColorFragment5 = this.this$0;
          FUT028ColorFragment.access$28(localFUT028ColorFragment5, 0xFFFFFFEF & FUT028ColorFragment.access$10(localFUT028ColorFragment5));
          return true;
        }
        if (paramView == FUT028ColorFragment.access$33(this.this$0))
        {
          FUT028ColorFragment.access$33(this.this$0).setImageResource(R.drawable.fut028_btn_ad_nor);
          FUT028ColorFragment localFUT028ColorFragment4 = this.this$0;
          FUT028ColorFragment.access$28(localFUT028ColorFragment4, 0xFFFFFFDF & FUT028ColorFragment.access$10(localFUT028ColorFragment4));
          return true;
        }
        if (paramView == FUT028ColorFragment.access$34(this.this$0))
        {
          FUT028ColorFragment.access$34(this.this$0).setImageResource(R.drawable.fut028_btn_au_nor);
          FUT028ColorFragment localFUT028ColorFragment3 = this.this$0;
          FUT028ColorFragment.access$28(localFUT028ColorFragment3, 0xFFFFFFBF & FUT028ColorFragment.access$10(localFUT028ColorFragment3));
          return true;
        }
      }
      while (paramView != FUT028ColorFragment.access$35(this.this$0));
      FUT028ColorFragment.access$35(this.this$0).setImageResource(R.drawable.fut028_btn_ad_nor);
      FUT028ColorFragment localFUT028ColorFragment2 = this.this$0;
      FUT028ColorFragment.access$28(localFUT028ColorFragment2, 0xFFFFFF7F & FUT028ColorFragment.access$10(localFUT028ColorFragment2));
      return true;
    }
    while (paramView != FUT028ColorFragment.access$23(this.this$0));
    FUT028ColorFragment.access$11(this.this$0, false);
    this.this$0.myHandler.removeMessages(4356);
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
        return true;
      }
      FUT028ColorFragment.access$1(this.this$0)[FUT028ColorFragment.access$2(this.this$0)] = (byte)FUT028ColorFragment.access$3(this.this$0);
      FUT028ColorFragment localFUT028ColorFragment1 = this.this$0;
      FUT028ColorFragment.access$4(localFUT028ColorFragment1, (byte)(1 + FUT028ColorFragment.access$2(localFUT028ColorFragment1)));
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT028ColorFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */