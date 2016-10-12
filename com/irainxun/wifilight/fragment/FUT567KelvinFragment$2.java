package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT567KelvinFragment$2
  implements View.OnTouchListener
{
  FUT567KelvinFragment$2(FUT567KelvinFragment paramFUT567KelvinFragment)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    byte[] arrayOfByte = new byte[12];
    (int)paramMotionEvent.getX();
    (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    do
    {
      do
      {
        return true;
        MyApp.PlalyKeySound();
        if (paramView == FUT567KelvinFragment.access$2(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_on_press);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = 7;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment localFUT567KelvinFragment16 = this.this$0;
          FUT567KelvinFragment.access$1(localFUT567KelvinFragment16, 0x1 | FUT567KelvinFragment.access$0(localFUT567KelvinFragment16));
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT567KelvinFragment.access$3(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_off_press);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = 8;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment localFUT567KelvinFragment15 = this.this$0;
          FUT567KelvinFragment.access$1(localFUT567KelvinFragment15, 0x2 | FUT567KelvinFragment.access$0(localFUT567KelvinFragment15));
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT567KelvinFragment.access$4(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_press);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = 6;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment localFUT567KelvinFragment14 = this.this$0;
          FUT567KelvinFragment.access$1(localFUT567KelvinFragment14, 0x4 | FUT567KelvinFragment.access$0(localFUT567KelvinFragment14));
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT567KelvinFragment.access$5(this.this$0))
        {
          FUT567KelvinFragment.access$5(this.this$0).setImageResource(R.drawable.c567_k_l_press);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = 3;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment localFUT567KelvinFragment13 = this.this$0;
          FUT567KelvinFragment.access$1(localFUT567KelvinFragment13, 0x8 | FUT567KelvinFragment.access$0(localFUT567KelvinFragment13));
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT567KelvinFragment.access$6(this.this$0))
        {
          FUT567KelvinFragment.access$6(this.this$0).setImageResource(R.drawable.c567_k_r_press);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = 4;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment localFUT567KelvinFragment12 = this.this$0;
          FUT567KelvinFragment.access$1(localFUT567KelvinFragment12, 0x10 | FUT567KelvinFragment.access$0(localFUT567KelvinFragment12));
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT567KelvinFragment.access$7(this.this$0))
        {
          FUT567KelvinFragment.access$7(this.this$0).setImageResource(R.drawable.c567_k_t_press);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = 1;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment localFUT567KelvinFragment11 = this.this$0;
          FUT567KelvinFragment.access$1(localFUT567KelvinFragment11, 0x20 | FUT567KelvinFragment.access$0(localFUT567KelvinFragment11));
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT567KelvinFragment.access$8(this.this$0))
        {
          FUT567KelvinFragment.access$8(this.this$0).setImageResource(R.drawable.c567_k_b_press);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = 2;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment localFUT567KelvinFragment10 = this.this$0;
          FUT567KelvinFragment.access$1(localFUT567KelvinFragment10, 0x40 | FUT567KelvinFragment.access$0(localFUT567KelvinFragment10));
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
      }
      while (paramView != FUT567KelvinFragment.access$9(this.this$0));
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 1;
      arrayOfByte[5] = 5;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      FUT567KelvinFragment localFUT567KelvinFragment9 = this.this$0;
      FUT567KelvinFragment.access$1(localFUT567KelvinFragment9, 0x80 | FUT567KelvinFragment.access$0(localFUT567KelvinFragment9));
      this.this$0.myHandler.removeMessages(4353);
      this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
      return true;
      if (paramView == FUT567KelvinFragment.access$2(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.k_btn_on_nor);
        FUT567KelvinFragment localFUT567KelvinFragment8 = this.this$0;
        FUT567KelvinFragment.access$1(localFUT567KelvinFragment8, 0xFFFFFFFE & FUT567KelvinFragment.access$0(localFUT567KelvinFragment8));
        return true;
      }
      if (paramView == FUT567KelvinFragment.access$3(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.k_btn_off_nor);
        FUT567KelvinFragment localFUT567KelvinFragment7 = this.this$0;
        FUT567KelvinFragment.access$1(localFUT567KelvinFragment7, 0xFFFFFFFD & FUT567KelvinFragment.access$0(localFUT567KelvinFragment7));
        return true;
      }
      if (paramView == FUT567KelvinFragment.access$4(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.k_btn_nor);
        FUT567KelvinFragment localFUT567KelvinFragment6 = this.this$0;
        FUT567KelvinFragment.access$1(localFUT567KelvinFragment6, 0xFFFFFFFB & FUT567KelvinFragment.access$0(localFUT567KelvinFragment6));
        return true;
      }
      if (paramView == FUT567KelvinFragment.access$5(this.this$0))
      {
        FUT567KelvinFragment.access$5(this.this$0).setImageResource(R.drawable.c567_k_l_nor);
        FUT567KelvinFragment localFUT567KelvinFragment5 = this.this$0;
        FUT567KelvinFragment.access$1(localFUT567KelvinFragment5, 0xFFFFFFF7 & FUT567KelvinFragment.access$0(localFUT567KelvinFragment5));
        return true;
      }
      if (paramView == FUT567KelvinFragment.access$6(this.this$0))
      {
        FUT567KelvinFragment.access$6(this.this$0).setImageResource(R.drawable.c567_k_r_nor);
        FUT567KelvinFragment localFUT567KelvinFragment4 = this.this$0;
        FUT567KelvinFragment.access$1(localFUT567KelvinFragment4, 0xFFFFFFEF & FUT567KelvinFragment.access$0(localFUT567KelvinFragment4));
        return true;
      }
      if (paramView == FUT567KelvinFragment.access$7(this.this$0))
      {
        FUT567KelvinFragment.access$7(this.this$0).setImageResource(R.drawable.c567_k_t_nor);
        FUT567KelvinFragment localFUT567KelvinFragment3 = this.this$0;
        FUT567KelvinFragment.access$1(localFUT567KelvinFragment3, 0xFFFFFFDF & FUT567KelvinFragment.access$0(localFUT567KelvinFragment3));
        return true;
      }
      if (paramView == FUT567KelvinFragment.access$8(this.this$0))
      {
        FUT567KelvinFragment localFUT567KelvinFragment2 = this.this$0;
        FUT567KelvinFragment.access$1(localFUT567KelvinFragment2, 0xFFFFFFBF & FUT567KelvinFragment.access$0(localFUT567KelvinFragment2));
        FUT567KelvinFragment.access$8(this.this$0).setImageResource(R.drawable.c567_k_b_nor);
        return true;
      }
    }
    while (paramView != FUT567KelvinFragment.access$9(this.this$0));
    FUT567KelvinFragment localFUT567KelvinFragment1 = this.this$0;
    FUT567KelvinFragment.access$1(localFUT567KelvinFragment1, 0xFFFFFF7F & FUT567KelvinFragment.access$0(localFUT567KelvinFragment1));
    return true;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT567KelvinFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */