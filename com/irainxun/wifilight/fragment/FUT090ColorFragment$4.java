package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT090ColorFragment$4
  implements View.OnTouchListener
{
  FUT090ColorFragment$4(FUT090ColorFragment paramFUT090ColorFragment)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    byte[] arrayOfByte = new byte[12];
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    switch (i)
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
            return true;
            MyApp.PlalyKeySound();
            if (paramView == FUT090ColorFragment.access$24(this.this$0))
            {
              FUT090ColorFragment.access$0(this.this$0, false);
              FUT090ColorFragment.access$5(this.this$0, false);
              FUT090ColorFragment.access$4(this.this$0, (byte)0);
              FUT090ColorFragment.access$35(this.this$0, j, k);
              FUT090ColorFragment.access$2(this.this$0)[0] = (byte)FUT090ColorFragment.access$3(this.this$0);
              FUT090ColorFragment.access$2(this.this$0)[1] = (byte)FUT090ColorFragment.access$3(this.this$0);
              FUT090ColorFragment.access$2(this.this$0)[2] = (byte)FUT090ColorFragment.access$3(this.this$0);
              return true;
            }
            if (paramView == FUT090ColorFragment.access$36(this.this$0))
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 5;
              arrayOfByte[5] = 3;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment localFUT090ColorFragment13 = this.this$0;
              FUT090ColorFragment.access$37(localFUT090ColorFragment13, 0x1 | FUT090ColorFragment.access$10(localFUT090ColorFragment13));
              FUT090ColorFragment.access$36(this.this$0).setImageResource(R.drawable.c090_l_pressed);
              this.this$0.myHandler.removeMessages(4353);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
              return true;
            }
            if (paramView == FUT090ColorFragment.access$38(this.this$0))
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 5;
              arrayOfByte[5] = 4;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment localFUT090ColorFragment12 = this.this$0;
              FUT090ColorFragment.access$37(localFUT090ColorFragment12, 0x2 | FUT090ColorFragment.access$10(localFUT090ColorFragment12));
              FUT090ColorFragment.access$38(this.this$0).setImageResource(R.drawable.c090_r_pressed);
              this.this$0.myHandler.removeMessages(4353);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
              return true;
            }
            if (paramView == FUT090ColorFragment.access$39(this.this$0))
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 5;
              arrayOfByte[5] = 1;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment localFUT090ColorFragment11 = this.this$0;
              FUT090ColorFragment.access$37(localFUT090ColorFragment11, 0x4 | FUT090ColorFragment.access$10(localFUT090ColorFragment11));
              FUT090ColorFragment.access$39(this.this$0).setImageResource(R.drawable.c090_up_pressed);
              this.this$0.myHandler.removeMessages(4353);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
              return true;
            }
            if (paramView == FUT090ColorFragment.access$40(this.this$0))
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 5;
              arrayOfByte[5] = 2;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment localFUT090ColorFragment10 = this.this$0;
              FUT090ColorFragment.access$37(localFUT090ColorFragment10, 0x8 | FUT090ColorFragment.access$10(localFUT090ColorFragment10));
              FUT090ColorFragment.access$40(this.this$0).setImageResource(R.drawable.c090_down_pressed);
              this.this$0.myHandler.removeMessages(4353);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
              return true;
            }
            if (paramView == FUT090ColorFragment.access$41(this.this$0))
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 1;
              arrayOfByte[5] = 0;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment localFUT090ColorFragment9 = this.this$0;
              FUT090ColorFragment.access$37(localFUT090ColorFragment9, 0x10 | FUT090ColorFragment.access$10(localFUT090ColorFragment9));
              FUT090ColorFragment.access$41(this.this$0).setBackgroundResource(R.drawable.k_btn_on_press);
              this.this$0.myHandler.removeMessages(4353);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
              return true;
            }
            if (paramView == FUT090ColorFragment.access$42(this.this$0))
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 1;
              arrayOfByte[5] = 1;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment localFUT090ColorFragment8 = this.this$0;
              FUT090ColorFragment.access$37(localFUT090ColorFragment8, 0x20 | FUT090ColorFragment.access$10(localFUT090ColorFragment8));
              FUT090ColorFragment.access$42(this.this$0).setBackgroundResource(R.drawable.k_btn_off_press);
              this.this$0.myHandler.removeMessages(4353);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
              return true;
            }
          }
          while (paramView != FUT090ColorFragment.access$43(this.this$0));
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 5;
          arrayOfByte[5] = 0;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return true;
        }
        while (paramView != FUT090ColorFragment.access$24(this.this$0));
        FUT090ColorFragment.access$35(this.this$0, j, k);
      }
      while (FUT090ColorFragment.access$44(this.this$0));
      FUT090ColorFragment.access$5(this.this$0, true);
      this.this$0.myHandler.removeMessages(4356);
      this.this$0.myHandler.sendEmptyMessageDelayed(4356, 160L);
      return true;
      if (paramView == FUT090ColorFragment.access$24(this.this$0))
      {
        FUT090ColorFragment.access$11(this.this$0, false);
        this.this$0.myHandler.removeMessages(4356);
        while (true)
        {
          if (FUT090ColorFragment.access$1(this.this$0) >= 3)
          {
            FUT090ColorFragment.access$2(this.this$0)[2] = (byte)FUT090ColorFragment.access$3(this.this$0);
            FUT090ColorFragment.access$4(this.this$0, (byte)0);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 2;
            arrayOfByte[5] = (byte)(FUT090ColorFragment.access$6(this.this$0) - (0xFF & FUT090ColorFragment.access$2(this.this$0)[0]));
            arrayOfByte[6] = (byte)(FUT090ColorFragment.access$6(this.this$0) - (0xFF & FUT090ColorFragment.access$2(this.this$0)[1]));
            arrayOfByte[7] = (byte)(FUT090ColorFragment.access$6(this.this$0) - (0xFF & FUT090ColorFragment.access$2(this.this$0)[2]));
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            return true;
          }
          FUT090ColorFragment.access$2(this.this$0)[FUT090ColorFragment.access$1(this.this$0)] = (byte)FUT090ColorFragment.access$3(this.this$0);
          FUT090ColorFragment localFUT090ColorFragment7 = this.this$0;
          FUT090ColorFragment.access$4(localFUT090ColorFragment7, (byte)(1 + FUT090ColorFragment.access$1(localFUT090ColorFragment7)));
        }
      }
      if (paramView == FUT090ColorFragment.access$36(this.this$0))
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 5;
        arrayOfByte[5] = 7;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT090ColorFragment localFUT090ColorFragment6 = this.this$0;
        FUT090ColorFragment.access$37(localFUT090ColorFragment6, 0xFFFFFFFE & FUT090ColorFragment.access$10(localFUT090ColorFragment6));
        FUT090ColorFragment.access$36(this.this$0).setImageResource(R.drawable.c090_l_normal);
        return true;
      }
      if (paramView == FUT090ColorFragment.access$38(this.this$0))
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 5;
        arrayOfByte[5] = 8;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT090ColorFragment localFUT090ColorFragment5 = this.this$0;
        FUT090ColorFragment.access$37(localFUT090ColorFragment5, 0xFFFFFFFD & FUT090ColorFragment.access$10(localFUT090ColorFragment5));
        FUT090ColorFragment.access$38(this.this$0).setImageResource(R.drawable.c090_r_normal);
        return true;
      }
      if (paramView == FUT090ColorFragment.access$39(this.this$0))
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 5;
        arrayOfByte[5] = 5;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT090ColorFragment localFUT090ColorFragment4 = this.this$0;
        FUT090ColorFragment.access$37(localFUT090ColorFragment4, 0xFFFFFFFB & FUT090ColorFragment.access$10(localFUT090ColorFragment4));
        FUT090ColorFragment.access$39(this.this$0).setImageResource(R.drawable.c090_up__normal);
        return true;
      }
      if (paramView == FUT090ColorFragment.access$40(this.this$0))
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 5;
        arrayOfByte[5] = 6;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT090ColorFragment localFUT090ColorFragment3 = this.this$0;
        FUT090ColorFragment.access$37(localFUT090ColorFragment3, 0xFFFFFFF7 & FUT090ColorFragment.access$10(localFUT090ColorFragment3));
        FUT090ColorFragment.access$40(this.this$0).setImageResource(R.drawable.c090_down_normal);
        return true;
      }
      if (paramView == FUT090ColorFragment.access$41(this.this$0))
      {
        FUT090ColorFragment localFUT090ColorFragment2 = this.this$0;
        FUT090ColorFragment.access$37(localFUT090ColorFragment2, 0xFFFFFFEF & FUT090ColorFragment.access$10(localFUT090ColorFragment2));
        FUT090ColorFragment.access$41(this.this$0).setBackgroundResource(R.drawable.k_btn_on_nor);
        return true;
      }
    }
    while (paramView != FUT090ColorFragment.access$42(this.this$0));
    FUT090ColorFragment localFUT090ColorFragment1 = this.this$0;
    FUT090ColorFragment.access$37(localFUT090ColorFragment1, 0xFFFFFFDF & FUT090ColorFragment.access$10(localFUT090ColorFragment1));
    FUT090ColorFragment.access$42(this.this$0).setBackgroundResource(R.drawable.k_btn_off_nor);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ColorFragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */