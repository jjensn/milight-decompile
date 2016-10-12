package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT022KelvinFragment$2
  implements View.OnTouchListener
{
  FUT022KelvinFragment$2(FUT022KelvinFragment paramFUT022KelvinFragment)
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
              if (paramView != FUT022KelvinFragment.access$11(this.this$0))
                MyApp.PlalyKeySound();
              if (paramView == FUT022KelvinFragment.access$12(this.this$0))
              {
                FUT022KelvinFragment.access$12(this.this$0).setImageResource(R.drawable.btn_light1_press);
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
                FUT022KelvinFragment localFUT022KelvinFragment11 = this.this$0;
                FUT022KelvinFragment.access$13(localFUT022KelvinFragment11, 0x1 | FUT022KelvinFragment.access$6(localFUT022KelvinFragment11));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT022KelvinFragment.access$14(this.this$0))
              {
                FUT022KelvinFragment.access$14(this.this$0).setBackgroundResource(R.drawable.btn_on_press);
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
                FUT022KelvinFragment localFUT022KelvinFragment10 = this.this$0;
                FUT022KelvinFragment.access$13(localFUT022KelvinFragment10, 0x2 | FUT022KelvinFragment.access$6(localFUT022KelvinFragment10));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT022KelvinFragment.access$15(this.this$0))
              {
                FUT022KelvinFragment.access$15(this.this$0).setImageResource(R.drawable.btn_color_press);
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
                FUT022KelvinFragment localFUT022KelvinFragment9 = this.this$0;
                FUT022KelvinFragment.access$13(localFUT022KelvinFragment9, 0x4 | FUT022KelvinFragment.access$6(localFUT022KelvinFragment9));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT022KelvinFragment.access$16(this.this$0))
              {
                FUT022KelvinFragment.access$16(this.this$0).setImageResource(R.drawable.btn_light2_press);
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
                FUT022KelvinFragment localFUT022KelvinFragment8 = this.this$0;
                FUT022KelvinFragment.access$13(localFUT022KelvinFragment8, 0x8 | FUT022KelvinFragment.access$6(localFUT022KelvinFragment8));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT022KelvinFragment.access$17(this.this$0))
              {
                FUT022KelvinFragment.access$17(this.this$0).setBackgroundResource(R.drawable.btn_off_press);
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
                FUT022KelvinFragment localFUT022KelvinFragment7 = this.this$0;
                FUT022KelvinFragment.access$13(localFUT022KelvinFragment7, 0x10 | FUT022KelvinFragment.access$6(localFUT022KelvinFragment7));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
            }
            while (paramView != FUT022KelvinFragment.access$11(this.this$0));
            FUT022KelvinFragment.access$18(this.this$0).setVisibility(0);
            FUT022KelvinFragment.access$0(this.this$0, false);
            FUT022KelvinFragment.access$5(this.this$0, false);
            FUT022KelvinFragment.access$4(this.this$0, (byte)0);
            FUT022KelvinFragment.access$19(this.this$0, i, j);
            FUT022KelvinFragment.access$1(this.this$0)[0] = (byte)FUT022KelvinFragment.access$3(this.this$0);
            FUT022KelvinFragment.access$1(this.this$0)[1] = (byte)FUT022KelvinFragment.access$3(this.this$0);
            FUT022KelvinFragment.access$1(this.this$0)[2] = (byte)FUT022KelvinFragment.access$3(this.this$0);
            FUT022KelvinFragment.access$1(this.this$0)[3] = (byte)FUT022KelvinFragment.access$3(this.this$0);
            return true;
          }
          while (paramView != FUT022KelvinFragment.access$11(this.this$0));
          FUT022KelvinFragment.access$19(this.this$0, i, j);
        }
        while (FUT022KelvinFragment.access$20(this.this$0));
        FUT022KelvinFragment.access$5(this.this$0, true);
        this.this$0.myHandler.removeMessages(4356);
        this.this$0.myHandler.sendEmptyMessageDelayed(4356, 160L);
        return true;
        if (paramView == FUT022KelvinFragment.access$11(this.this$0))
          break;
        if (paramView == FUT022KelvinFragment.access$12(this.this$0))
        {
          FUT022KelvinFragment.access$12(this.this$0).setImageResource(R.drawable.btn_light1_nor);
          FUT022KelvinFragment localFUT022KelvinFragment6 = this.this$0;
          FUT022KelvinFragment.access$13(localFUT022KelvinFragment6, 0xFFFFFFFE & FUT022KelvinFragment.access$6(localFUT022KelvinFragment6));
          return true;
        }
        if (paramView == FUT022KelvinFragment.access$14(this.this$0))
        {
          FUT022KelvinFragment.access$14(this.this$0).setBackgroundResource(R.drawable.btn_on_nor);
          FUT022KelvinFragment localFUT022KelvinFragment5 = this.this$0;
          FUT022KelvinFragment.access$13(localFUT022KelvinFragment5, 0xFFFFFFFD & FUT022KelvinFragment.access$6(localFUT022KelvinFragment5));
          return true;
        }
        if (paramView == FUT022KelvinFragment.access$15(this.this$0))
        {
          FUT022KelvinFragment.access$15(this.this$0).setImageResource(R.drawable.btn_color_nor);
          FUT022KelvinFragment localFUT022KelvinFragment4 = this.this$0;
          FUT022KelvinFragment.access$13(localFUT022KelvinFragment4, 0xFFFFFFFB & FUT022KelvinFragment.access$6(localFUT022KelvinFragment4));
          return true;
        }
        if (paramView == FUT022KelvinFragment.access$16(this.this$0))
        {
          FUT022KelvinFragment.access$16(this.this$0).setImageResource(R.drawable.btn_light2_nor);
          FUT022KelvinFragment localFUT022KelvinFragment3 = this.this$0;
          FUT022KelvinFragment.access$13(localFUT022KelvinFragment3, 0xFFFFFFF7 & FUT022KelvinFragment.access$6(localFUT022KelvinFragment3));
          return true;
        }
      }
      while (paramView != FUT022KelvinFragment.access$17(this.this$0));
      FUT022KelvinFragment.access$17(this.this$0).setBackgroundResource(R.drawable.btn_off_nor);
      FUT022KelvinFragment localFUT022KelvinFragment2 = this.this$0;
      FUT022KelvinFragment.access$13(localFUT022KelvinFragment2, 0xFFFFFFEF & FUT022KelvinFragment.access$6(localFUT022KelvinFragment2));
      return true;
    }
    while (paramView != FUT022KelvinFragment.access$11(this.this$0));
    FUT022KelvinFragment.access$18(this.this$0).setVisibility(4);
    FUT022KelvinFragment.access$7(this.this$0, false);
    this.this$0.myHandler.removeMessages(4356);
    while (true)
    {
      if (FUT022KelvinFragment.access$2(this.this$0) >= 4)
      {
        FUT022KelvinFragment.access$1(this.this$0)[3] = (byte)FUT022KelvinFragment.access$3(this.this$0);
        FUT022KelvinFragment.access$4(this.this$0, (byte)0);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 1;
        arrayOfByte[5] = FUT022KelvinFragment.access$1(this.this$0)[0];
        arrayOfByte[6] = FUT022KelvinFragment.access$1(this.this$0)[1];
        arrayOfByte[7] = FUT022KelvinFragment.access$1(this.this$0)[2];
        arrayOfByte[8] = FUT022KelvinFragment.access$1(this.this$0)[3];
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        return true;
      }
      FUT022KelvinFragment.access$1(this.this$0)[FUT022KelvinFragment.access$2(this.this$0)] = (byte)FUT022KelvinFragment.access$3(this.this$0);
      FUT022KelvinFragment localFUT022KelvinFragment1 = this.this$0;
      FUT022KelvinFragment.access$4(localFUT022KelvinFragment1, (byte)(1 + FUT022KelvinFragment.access$2(localFUT022KelvinFragment1)));
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT022KelvinFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */