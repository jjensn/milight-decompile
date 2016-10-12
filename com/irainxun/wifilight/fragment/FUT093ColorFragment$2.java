package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT093ColorFragment$2
  implements View.OnTouchListener
{
  FUT093ColorFragment$2(FUT093ColorFragment paramFUT093ColorFragment)
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
    label2069: label2338: label2635: 
    while (true)
    {
      return true;
      if (paramView != FUT093ColorFragment.access$9(this.this$0))
        MyApp.PlalyKeySound();
      if (paramView == FUT093ColorFragment.access$10(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.ic_btn_on_press);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 4;
        arrayOfByte[5] = 7;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT093ColorFragment localFUT093ColorFragment21 = this.this$0;
        FUT093ColorFragment.access$11(localFUT093ColorFragment21, 0x1 | FUT093ColorFragment.access$5(localFUT093ColorFragment21));
        this.this$0.myHandler.removeMessages(4353);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
      }
      else if (paramView == FUT093ColorFragment.access$12(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.ic_btn_off_press);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 4;
        arrayOfByte[5] = 8;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT093ColorFragment localFUT093ColorFragment20 = this.this$0;
        FUT093ColorFragment.access$11(localFUT093ColorFragment20, 0x2 | FUT093ColorFragment.access$5(localFUT093ColorFragment20));
        this.this$0.myHandler.removeMessages(4353);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
      }
      else if (paramView == FUT093ColorFragment.access$9(this.this$0))
      {
        if (i < 6)
          i = 6;
        int i3 = -6 + FUT093ColorFragment.access$13(this.this$0).getWidth();
        if (i > i3)
          i = i3;
        if (j < 6)
          j = 6;
        int i4 = -6 + FUT093ColorFragment.access$13(this.this$0).getHeight();
        if (j > i4)
          j = i4;
        int i5 = FUT093ColorFragment.access$13(this.this$0).getWidth();
        FUT093ColorFragment.access$15(this.this$0, FUT093ColorFragment.access$14(this.this$0, i, j, i5 / 2, 6));
        FUT093ColorFragment.access$16(this.this$0, false);
        FUT093ColorFragment.access$0(this.this$0, false);
        FUT093ColorFragment.access$17(this.this$0, (byte)0);
        FUT093ColorFragment.access$18(this.this$0)[0] = (byte)FUT093ColorFragment.access$2(this.this$0);
        FUT093ColorFragment.access$18(this.this$0)[1] = (byte)FUT093ColorFragment.access$2(this.this$0);
        FUT093ColorFragment.access$18(this.this$0)[2] = (byte)FUT093ColorFragment.access$2(this.this$0);
        FUT093ColorFragment.access$18(this.this$0)[3] = (byte)FUT093ColorFragment.access$2(this.this$0);
      }
      else if (paramView == FUT093ColorFragment.access$19(this.this$0))
      {
        FUT093ColorFragment.access$19(this.this$0).setImageResource(R.drawable.fut_iv_book_press);
        FUT093ColorFragment localFUT093ColorFragment19 = this.this$0;
        FUT093ColorFragment.access$11(localFUT093ColorFragment19, 0x4 | FUT093ColorFragment.access$5(localFUT093ColorFragment19));
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
        this.this$0.myHandler.removeMessages(4353);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
      }
      else if (paramView == FUT093ColorFragment.access$20(this.this$0))
      {
        FUT093ColorFragment.access$20(this.this$0).setImageResource(R.drawable.fut_iv_coffee_press);
        FUT093ColorFragment localFUT093ColorFragment18 = this.this$0;
        FUT093ColorFragment.access$11(localFUT093ColorFragment18, 0x8 | FUT093ColorFragment.access$5(localFUT093ColorFragment18));
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
        this.this$0.myHandler.removeMessages(4353);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
      }
      else if (paramView == FUT093ColorFragment.access$21(this.this$0))
      {
        FUT093ColorFragment.access$21(this.this$0).setImageResource(R.drawable.fut_iv_sunset_press);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 4;
        arrayOfByte[5] = 3;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT093ColorFragment localFUT093ColorFragment17 = this.this$0;
        FUT093ColorFragment.access$11(localFUT093ColorFragment17, 0x10 | FUT093ColorFragment.access$5(localFUT093ColorFragment17));
        this.this$0.myHandler.removeMessages(4353);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
      }
      else if (paramView == FUT093ColorFragment.access$22(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.fut_iv_m_press);
        FUT093ColorFragment localFUT093ColorFragment16 = this.this$0;
        FUT093ColorFragment.access$11(localFUT093ColorFragment16, 0x20 | FUT093ColorFragment.access$5(localFUT093ColorFragment16));
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 4;
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
      }
      else if (paramView == FUT093ColorFragment.access$23(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.fut_iv_m_press);
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
        FUT093ColorFragment localFUT093ColorFragment15 = this.this$0;
        FUT093ColorFragment.access$11(localFUT093ColorFragment15, 0x40 | FUT093ColorFragment.access$5(localFUT093ColorFragment15));
        this.this$0.myHandler.removeMessages(4353);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
      }
      else if (paramView == FUT093ColorFragment.access$24(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.fut_iv_m_press);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 4;
        arrayOfByte[5] = 6;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT093ColorFragment localFUT093ColorFragment14 = this.this$0;
        FUT093ColorFragment.access$11(localFUT093ColorFragment14, 0x80 | FUT093ColorFragment.access$5(localFUT093ColorFragment14));
        this.this$0.myHandler.removeMessages(4353);
        this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
        continue;
        if (paramView == FUT093ColorFragment.access$9(this.this$0))
        {
          if (i < 6)
            i = 6;
          int k = -6 + FUT093ColorFragment.access$13(this.this$0).getWidth();
          if (i > k)
            i = k;
          if (j < 6)
            j = 6;
          int m = -6 + FUT093ColorFragment.access$13(this.this$0).getHeight();
          if (j > m)
            j = m;
          int n = FUT093ColorFragment.access$13(this.this$0).getWidth();
          FUT093ColorFragment.Circular localCircular = FUT093ColorFragment.access$14(this.this$0, i, j, n / 2, 6);
          FUT093ColorFragment.access$26(this.this$0, localCircular.angle - FUT093ColorFragment.access$25(this.this$0).angle);
          Log.d("debug", "rain dataAngle.angle = " + localCircular.angle);
          Log.d("debug", "rain pressData.angle = " + FUT093ColorFragment.access$25(this.this$0).angle);
          Log.d("debug", "rain relativeAngle = " + FUT093ColorFragment.access$27(this.this$0));
          if (FUT093ColorFragment.access$27(this.this$0) < 0)
          {
            FUT093ColorFragment localFUT093ColorFragment13 = this.this$0;
            FUT093ColorFragment.access$26(localFUT093ColorFragment13, 360 + FUT093ColorFragment.access$27(localFUT093ColorFragment13));
          }
          Log.d("debug", "rain sh relativeAngle = " + FUT093ColorFragment.access$27(this.this$0));
          int i1 = FUT093ColorFragment.access$28(this.this$0) + FUT093ColorFragment.access$27(this.this$0);
          if (i1 > 360)
            i1 %= 360;
          int i2;
          if (FUT093ColorFragment.access$29(this.this$0) != i1)
          {
            i2 = i1 - FUT093ColorFragment.access$29(this.this$0);
            if (Math.abs(i2) < 80)
            {
              if (i2 <= 0)
                break label2069;
              FUT093ColorFragment.access$30(this.this$0, (byte)1);
            }
          }
          while (true)
          {
            FUT093ColorFragment localFUT093ColorFragment12 = this.this$0;
            FUT093ColorFragment.access$32(localFUT093ColorFragment12, i2 + FUT093ColorFragment.access$31(localFUT093ColorFragment12));
            if (FUT093ColorFragment.access$31(this.this$0) >= 360)
              FUT093ColorFragment.access$32(this.this$0, 360);
            if (FUT093ColorFragment.access$31(this.this$0) <= 0)
              FUT093ColorFragment.access$32(this.this$0, 0);
            Log.d("debug", "irain clir - clirOld = " + i2);
            FUT093ColorFragment.access$33(this.this$0, i1);
            FUT093ColorFragment.access$34(this.this$0, (int)(0.2777777777777778D * FUT093ColorFragment.access$31(this.this$0)));
            FUT093ColorFragment.access$35(this.this$0).setText("Brightness:" + FUT093ColorFragment.access$2(this.this$0));
            if (!FUT093ColorFragment.access$36(this.this$0))
            {
              FUT093ColorFragment.access$0(this.this$0, true);
              this.this$0.myHandler.removeMessages(4356);
              this.this$0.myHandler.sendEmptyMessageDelayed(4356, 160L);
            }
            if (!FUT093ColorFragment.access$37(this.this$0))
            {
              FUT093ColorFragment.access$6(this.this$0, true);
              this.this$0.myHandler.removeMessages(1024);
              this.this$0.myHandler.sendEmptyMessageDelayed(1024, 80L);
            }
            FUT093ColorFragment.access$38(this.this$0, i1);
            break;
            FUT093ColorFragment.access$30(this.this$0, (byte)2);
          }
          if (paramView != FUT093ColorFragment.access$9(this.this$0))
          {
            if (paramView != FUT093ColorFragment.access$10(this.this$0))
              break label2338;
            paramView.setBackgroundResource(R.drawable.ic_btn_on_nor);
            FUT093ColorFragment localFUT093ColorFragment11 = this.this$0;
            FUT093ColorFragment.access$11(localFUT093ColorFragment11, 0xFFFFFFFE & FUT093ColorFragment.access$5(localFUT093ColorFragment11));
          }
          while (true)
          {
            if (paramView != FUT093ColorFragment.access$9(this.this$0))
              break label2635;
            if (FUT093ColorFragment.access$27(this.this$0) < 0)
            {
              FUT093ColorFragment localFUT093ColorFragment3 = this.this$0;
              FUT093ColorFragment.access$26(localFUT093ColorFragment3, 360 + FUT093ColorFragment.access$27(localFUT093ColorFragment3));
            }
            FUT093ColorFragment localFUT093ColorFragment1 = this.this$0;
            FUT093ColorFragment.access$39(localFUT093ColorFragment1, FUT093ColorFragment.access$28(localFUT093ColorFragment1) + FUT093ColorFragment.access$27(this.this$0));
            if (FUT093ColorFragment.access$28(this.this$0) > 360)
            {
              FUT093ColorFragment localFUT093ColorFragment2 = this.this$0;
              FUT093ColorFragment.access$39(localFUT093ColorFragment2, FUT093ColorFragment.access$28(localFUT093ColorFragment2) % 360);
            }
            FUT093ColorFragment.access$6(this.this$0, false);
            this.this$0.myHandler.removeMessages(4356);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = FUT093ColorFragment.access$1(this.this$0);
            arrayOfByte[5] = (byte)FUT093ColorFragment.access$2(this.this$0);
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            break;
            if (paramView == FUT093ColorFragment.access$12(this.this$0))
            {
              paramView.setBackgroundResource(R.drawable.ic_btn_off_nor);
              FUT093ColorFragment localFUT093ColorFragment10 = this.this$0;
              FUT093ColorFragment.access$11(localFUT093ColorFragment10, 0xFFFFFFFD & FUT093ColorFragment.access$5(localFUT093ColorFragment10));
            }
            else if (paramView == FUT093ColorFragment.access$19(this.this$0))
            {
              FUT093ColorFragment.access$19(this.this$0).setImageResource(R.drawable.fut_iv_book_nor);
              FUT093ColorFragment localFUT093ColorFragment9 = this.this$0;
              FUT093ColorFragment.access$11(localFUT093ColorFragment9, 0xFFFFFFFB & FUT093ColorFragment.access$5(localFUT093ColorFragment9));
            }
            else if (paramView == FUT093ColorFragment.access$20(this.this$0))
            {
              FUT093ColorFragment.access$20(this.this$0).setImageResource(R.drawable.fut_iv_coffee_nor);
              FUT093ColorFragment localFUT093ColorFragment8 = this.this$0;
              FUT093ColorFragment.access$11(localFUT093ColorFragment8, 0xFFFFFFF7 & FUT093ColorFragment.access$5(localFUT093ColorFragment8));
            }
            else if (paramView == FUT093ColorFragment.access$21(this.this$0))
            {
              FUT093ColorFragment.access$21(this.this$0).setImageResource(R.drawable.fut_iv_sunset_nor);
              FUT093ColorFragment localFUT093ColorFragment7 = this.this$0;
              FUT093ColorFragment.access$11(localFUT093ColorFragment7, 0xFFFFFFEF & FUT093ColorFragment.access$5(localFUT093ColorFragment7));
            }
            else if (paramView == FUT093ColorFragment.access$22(this.this$0))
            {
              paramView.setBackgroundResource(R.drawable.fut_iv_m_nor);
              FUT093ColorFragment localFUT093ColorFragment6 = this.this$0;
              FUT093ColorFragment.access$11(localFUT093ColorFragment6, 0xFFFFFFDF & FUT093ColorFragment.access$5(localFUT093ColorFragment6));
            }
            else if (paramView == FUT093ColorFragment.access$23(this.this$0))
            {
              paramView.setBackgroundResource(R.drawable.fut_iv_m_nor);
              FUT093ColorFragment localFUT093ColorFragment5 = this.this$0;
              FUT093ColorFragment.access$11(localFUT093ColorFragment5, 0xFFFFFFBF & FUT093ColorFragment.access$5(localFUT093ColorFragment5));
            }
            else if (paramView == FUT093ColorFragment.access$24(this.this$0))
            {
              paramView.setBackgroundResource(R.drawable.fut_iv_m_nor);
              FUT093ColorFragment localFUT093ColorFragment4 = this.this$0;
              FUT093ColorFragment.access$11(localFUT093ColorFragment4, 0xFFFFFF7F & FUT093ColorFragment.access$5(localFUT093ColorFragment4));
            }
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT093ColorFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */