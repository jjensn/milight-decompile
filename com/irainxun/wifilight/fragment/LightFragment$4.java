package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.irainxun.wifilight.xlink.MyApp;

class LightFragment$4
  implements View.OnTouchListener
{
  LightFragment$4(LightFragment paramLightFragment)
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
            do
            {
              return true;
              if (paramView != LightFragment.access$23(this.this$0))
              {
                MyApp.PlalyKeySound();
                paramView.setBackgroundResource(R.drawable.light_btn_press);
              }
              if (paramView == LightFragment.access$24(this.this$0))
              {
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = 0;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 1;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = 1;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                LightFragment localLightFragment9 = this.this$0;
                LightFragment.access$25(localLightFragment9, 0x1 | LightFragment.access$7(localLightFragment9));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == LightFragment.access$26(this.this$0))
              {
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = 0;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 2;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = 1;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                LightFragment localLightFragment8 = this.this$0;
                LightFragment.access$25(localLightFragment8, 0x2 | LightFragment.access$7(localLightFragment8));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == LightFragment.access$27(this.this$0))
              {
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = 0;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 3;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = 1;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                LightFragment localLightFragment7 = this.this$0;
                LightFragment.access$25(localLightFragment7, 0x4 | LightFragment.access$7(localLightFragment7));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramView == LightFragment.access$28(this.this$0))
              {
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = 0;
                arrayOfByte[4] = 3;
                arrayOfByte[5] = 4;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = 1;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                LightFragment localLightFragment6 = this.this$0;
                LightFragment.access$25(localLightFragment6, 0x8 | LightFragment.access$7(localLightFragment6));
                this.this$0.myHandler.removeMessages(4353);
                this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
            }
            while (paramView != LightFragment.access$23(this.this$0));
            LightFragment.access$2(this.this$0, false);
            LightFragment.access$8(this.this$0, false);
            LightFragment.access$6(this.this$0, (byte)0);
            LightFragment.access$29(this.this$0, j, k);
            LightFragment.access$4(this.this$0)[0] = (byte)LightFragment.access$5(this.this$0);
            LightFragment.access$4(this.this$0)[1] = (byte)LightFragment.access$5(this.this$0);
            LightFragment.access$4(this.this$0)[2] = (byte)LightFragment.access$5(this.this$0);
            LightFragment.access$4(this.this$0)[3] = (byte)LightFragment.access$5(this.this$0);
            LightFragment.access$19(this.this$0, false);
            return true;
          }
          while (paramView != LightFragment.access$23(this.this$0));
          LightFragment.access$19(this.this$0, false);
          LightFragment.access$29(this.this$0, j, k);
        }
        while (LightFragment.access$30(this.this$0));
        LightFragment.access$8(this.this$0, true);
        this.this$0.myHandler.removeMessages(4356);
        this.this$0.myHandler.sendEmptyMessageDelayed(4356, 160L);
        return true;
        if (paramView == LightFragment.access$23(this.this$0))
          break;
        paramView.setBackgroundResource(R.drawable.light_btn_nor);
        if (paramView == LightFragment.access$24(this.this$0))
        {
          LightFragment localLightFragment5 = this.this$0;
          LightFragment.access$25(localLightFragment5, 0xFFFFFFFE & LightFragment.access$7(localLightFragment5));
          return true;
        }
        if (paramView == LightFragment.access$26(this.this$0))
        {
          LightFragment localLightFragment4 = this.this$0;
          LightFragment.access$25(localLightFragment4, 0xFFFFFFFD & LightFragment.access$7(localLightFragment4));
          return true;
        }
        if (paramView == LightFragment.access$27(this.this$0))
        {
          LightFragment localLightFragment3 = this.this$0;
          LightFragment.access$25(localLightFragment3, 0xFFFFFFFB & LightFragment.access$7(localLightFragment3));
          return true;
        }
      }
      while (paramView != LightFragment.access$28(this.this$0));
      LightFragment localLightFragment2 = this.this$0;
      LightFragment.access$25(localLightFragment2, 0xFFFFFFF7 & LightFragment.access$7(localLightFragment2));
      return true;
    }
    while (paramView != LightFragment.access$23(this.this$0));
    LightFragment.access$10(this.this$0, false);
    this.this$0.myHandler.removeMessages(4356);
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
        return true;
      }
      LightFragment.access$4(this.this$0)[LightFragment.access$3(this.this$0)] = (byte)LightFragment.access$5(this.this$0);
      LightFragment localLightFragment1 = this.this$0;
      LightFragment.access$6(localLightFragment1, (byte)(1 + LightFragment.access$3(localLightFragment1)));
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.LightFragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */