package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT020ColorFragment$2
  implements View.OnTouchListener
{
  FUT020ColorFragment$2(FUT020ColorFragment paramFUT020ColorFragment)
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
              if (paramView == FUT020ColorFragment.access$13(this.this$0))
              {
                FUT020ColorFragment.access$13(this.this$0).setImageResource(R.drawable.btn_light1_press);
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
                FUT020ColorFragment localFUT020ColorFragment11 = this.this$0;
                FUT020ColorFragment.access$8(localFUT020ColorFragment11, 0x4 | FUT020ColorFragment.access$7(localFUT020ColorFragment11));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT020ColorFragment.access$14(this.this$0))
              {
                FUT020ColorFragment.access$14(this.this$0).setImageResource(R.drawable.btn_light2_press);
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
                FUT020ColorFragment localFUT020ColorFragment10 = this.this$0;
                FUT020ColorFragment.access$8(localFUT020ColorFragment10, 0x8 | FUT020ColorFragment.access$7(localFUT020ColorFragment10));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT020ColorFragment.access$15(this.this$0))
              {
                FUT020ColorFragment.access$15(this.this$0).setImageResource(R.drawable.btn_onoff_press);
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
                FUT020ColorFragment localFUT020ColorFragment9 = this.this$0;
                FUT020ColorFragment.access$8(localFUT020ColorFragment9, 0x2 | FUT020ColorFragment.access$7(localFUT020ColorFragment9));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == FUT020ColorFragment.access$16(this.this$0))
              {
                FUT020ColorFragment.access$0(this.this$0, false);
                FUT020ColorFragment.access$5(this.this$0, false);
                FUT020ColorFragment.access$4(this.this$0, (byte)0);
                FUT020ColorFragment.access$17(this.this$0, i, j);
                FUT020ColorFragment.access$1(this.this$0)[0] = (byte)FUT020ColorFragment.access$3(this.this$0);
                FUT020ColorFragment.access$1(this.this$0)[1] = (byte)FUT020ColorFragment.access$3(this.this$0);
                FUT020ColorFragment.access$1(this.this$0)[2] = (byte)FUT020ColorFragment.access$3(this.this$0);
                FUT020ColorFragment.access$1(this.this$0)[3] = (byte)FUT020ColorFragment.access$3(this.this$0);
                return true;
              }
              if (paramView == FUT020ColorFragment.access$18(this.this$0))
              {
                FUT020ColorFragment.access$18(this.this$0).setImageResource(R.drawable.btn_light3_press);
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
                FUT020ColorFragment localFUT020ColorFragment8 = this.this$0;
                FUT020ColorFragment.access$8(localFUT020ColorFragment8, 0x1 | FUT020ColorFragment.access$7(localFUT020ColorFragment8));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
            }
            while (paramView != FUT020ColorFragment.access$19(this.this$0));
            FUT020ColorFragment.access$19(this.this$0).setImageResource(R.drawable.btn_light4_press);
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
            FUT020ColorFragment localFUT020ColorFragment7 = this.this$0;
            FUT020ColorFragment.access$8(localFUT020ColorFragment7, 0x10 | FUT020ColorFragment.access$7(localFUT020ColorFragment7));
            this.this$0.myHandler.removeMessages(4353);
            this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          while (paramView != FUT020ColorFragment.access$16(this.this$0));
          FUT020ColorFragment.access$17(this.this$0, i, j);
        }
        while (FUT020ColorFragment.access$20(this.this$0));
        FUT020ColorFragment.access$5(this.this$0, true);
        this.this$0.myHandler.removeMessages(4356);
        this.this$0.myHandler.sendEmptyMessageDelayed(4356, 160L);
        return true;
        if (paramView == FUT020ColorFragment.access$16(this.this$0))
          break;
        if (paramView == FUT020ColorFragment.access$13(this.this$0))
        {
          FUT020ColorFragment.access$13(this.this$0).setImageResource(R.drawable.btn_light1_nor);
          FUT020ColorFragment localFUT020ColorFragment6 = this.this$0;
          FUT020ColorFragment.access$8(localFUT020ColorFragment6, 0xFFFFFFFB & FUT020ColorFragment.access$7(localFUT020ColorFragment6));
          return true;
        }
        if (paramView == FUT020ColorFragment.access$14(this.this$0))
        {
          FUT020ColorFragment.access$14(this.this$0).setImageResource(R.drawable.btn_light2_nor);
          FUT020ColorFragment localFUT020ColorFragment5 = this.this$0;
          FUT020ColorFragment.access$8(localFUT020ColorFragment5, 0xFFFFFFF7 & FUT020ColorFragment.access$7(localFUT020ColorFragment5));
          return true;
        }
        if (paramView == FUT020ColorFragment.access$15(this.this$0))
        {
          FUT020ColorFragment.access$15(this.this$0).setImageResource(R.drawable.btn_onoff_nor);
          FUT020ColorFragment localFUT020ColorFragment4 = this.this$0;
          FUT020ColorFragment.access$8(localFUT020ColorFragment4, 0xFFFFFFFD & FUT020ColorFragment.access$7(localFUT020ColorFragment4));
          return true;
        }
        if (paramView == FUT020ColorFragment.access$18(this.this$0))
        {
          FUT020ColorFragment.access$18(this.this$0).setImageResource(R.drawable.btn_light3_nor);
          FUT020ColorFragment localFUT020ColorFragment3 = this.this$0;
          FUT020ColorFragment.access$8(localFUT020ColorFragment3, 0xFFFFFFFE & FUT020ColorFragment.access$7(localFUT020ColorFragment3));
          return true;
        }
      }
      while (paramView != FUT020ColorFragment.access$19(this.this$0));
      FUT020ColorFragment.access$19(this.this$0).setImageResource(R.drawable.btn_light4_nor);
      FUT020ColorFragment localFUT020ColorFragment2 = this.this$0;
      FUT020ColorFragment.access$8(localFUT020ColorFragment2, 0xFFFFFFEF & FUT020ColorFragment.access$7(localFUT020ColorFragment2));
      return true;
    }
    while (paramView != FUT020ColorFragment.access$16(this.this$0));
    FUT020ColorFragment.access$9(this.this$0, false);
    this.this$0.myHandler.removeMessages(4356);
    while (true)
    {
      if (FUT020ColorFragment.access$2(this.this$0) >= 4)
      {
        FUT020ColorFragment.access$1(this.this$0)[3] = (byte)FUT020ColorFragment.access$3(this.this$0);
        FUT020ColorFragment.access$4(this.this$0, (byte)0);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 1;
        arrayOfByte[5] = (byte)(FUT020ColorFragment.access$6(this.this$0) - (0xFF & FUT020ColorFragment.access$1(this.this$0)[0]));
        arrayOfByte[6] = (byte)(FUT020ColorFragment.access$6(this.this$0) - (0xFF & FUT020ColorFragment.access$1(this.this$0)[1]));
        arrayOfByte[7] = (byte)(FUT020ColorFragment.access$6(this.this$0) - (0xFF & FUT020ColorFragment.access$1(this.this$0)[2]));
        arrayOfByte[8] = (byte)(FUT020ColorFragment.access$6(this.this$0) - (0xFF & FUT020ColorFragment.access$1(this.this$0)[3]));
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        return true;
      }
      FUT020ColorFragment.access$1(this.this$0)[FUT020ColorFragment.access$2(this.this$0)] = (byte)FUT020ColorFragment.access$3(this.this$0);
      FUT020ColorFragment localFUT020ColorFragment1 = this.this$0;
      FUT020ColorFragment.access$4(localFUT020ColorFragment1, (byte)(1 + FUT020ColorFragment.access$2(localFUT020ColorFragment1)));
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT020ColorFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */