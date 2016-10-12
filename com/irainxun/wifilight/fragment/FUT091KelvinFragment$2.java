package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT091KelvinFragment$2
  implements View.OnTouchListener
{
  FUT091KelvinFragment$2(FUT091KelvinFragment paramFUT091KelvinFragment)
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
      do
        while (true)
        {
          return true;
          if (paramView != FUT091KelvinFragment.access$13(this.this$0))
            MyApp.PlalyKeySound();
          if (paramView == FUT091KelvinFragment.access$14(this.this$0))
          {
            paramView.setBackgroundResource(R.drawable.k_btn_on_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 4;
            if (MyApp.rain_remoteID == 8)
              arrayOfByte[5] = 1;
            while (true)
            {
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT091KelvinFragment localFUT091KelvinFragment11 = this.this$0;
              FUT091KelvinFragment.access$15(localFUT091KelvinFragment11, 0x4 | FUT091KelvinFragment.access$5(localFUT091KelvinFragment11));
              this.this$0.myHandler.removeMessages(4353);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
              break;
              arrayOfByte[5] = 3;
            }
          }
          if (paramView == FUT091KelvinFragment.access$16(this.this$0))
          {
            paramView.setBackgroundResource(R.drawable.k_btn_off_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 4;
            if (MyApp.rain_remoteID == 8)
              arrayOfByte[5] = 2;
            while (true)
            {
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT091KelvinFragment localFUT091KelvinFragment10 = this.this$0;
              FUT091KelvinFragment.access$15(localFUT091KelvinFragment10, 0x8 | FUT091KelvinFragment.access$5(localFUT091KelvinFragment10));
              this.this$0.myHandler.removeMessages(4353);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
              break;
              arrayOfByte[5] = 4;
            }
          }
          if (paramView == FUT091KelvinFragment.access$17(this.this$0))
          {
            paramView.setBackgroundResource(R.drawable.k_btn_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 4;
            if (MyApp.rain_remoteID == 8)
              arrayOfByte[5] = 5;
            while (true)
            {
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT091KelvinFragment localFUT091KelvinFragment9 = this.this$0;
              FUT091KelvinFragment.access$15(localFUT091KelvinFragment9, 0x2 | FUT091KelvinFragment.access$5(localFUT091KelvinFragment9));
              this.this$0.myHandler.removeMessages(4353);
              this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
              break;
              arrayOfByte[5] = 2;
            }
          }
          if (paramView == FUT091KelvinFragment.access$13(this.this$0))
          {
            if (i < 6)
              i = 6;
            int i3 = -6 + FUT091KelvinFragment.access$18(this.this$0).getWidth();
            if (i > i3)
              i = i3;
            if (j < 6)
              j = 6;
            int i4 = -6 + FUT091KelvinFragment.access$18(this.this$0).getHeight();
            if (j > i4)
              j = i4;
            int i5 = FUT091KelvinFragment.access$18(this.this$0).getWidth();
            FUT091KelvinFragment.access$20(this.this$0, FUT091KelvinFragment.access$19(this.this$0, i, j, i5 / 2, 6));
            FUT091KelvinFragment.access$21(this.this$0, false);
            FUT091KelvinFragment.access$0(this.this$0, false);
            FUT091KelvinFragment.access$22(this.this$0, (byte)0);
            FUT091KelvinFragment.access$23(this.this$0)[0] = (byte)FUT091KelvinFragment.access$2(this.this$0);
            FUT091KelvinFragment.access$23(this.this$0)[1] = (byte)FUT091KelvinFragment.access$2(this.this$0);
            FUT091KelvinFragment.access$23(this.this$0)[2] = (byte)FUT091KelvinFragment.access$2(this.this$0);
            FUT091KelvinFragment.access$23(this.this$0)[3] = (byte)FUT091KelvinFragment.access$2(this.this$0);
          }
        }
      while (paramView != FUT091KelvinFragment.access$13(this.this$0));
      if (i < 6)
        i = 6;
      int k = -6 + FUT091KelvinFragment.access$18(this.this$0).getWidth();
      if (i > k)
        i = k;
      if (j < 6)
        j = 6;
      int m = -6 + FUT091KelvinFragment.access$18(this.this$0).getHeight();
      if (j > m)
        j = m;
      int n = FUT091KelvinFragment.access$18(this.this$0).getWidth();
      FUT091KelvinFragment.Circular localCircular = FUT091KelvinFragment.access$19(this.this$0, i, j, n / 2, 6);
      FUT091KelvinFragment.access$25(this.this$0, localCircular.angle - FUT091KelvinFragment.access$24(this.this$0).angle);
      Log.d("debug", "rain dataAngle.angle = " + localCircular.angle);
      Log.d("debug", "rain pressData.angle = " + FUT091KelvinFragment.access$24(this.this$0).angle);
      Log.d("debug", "rain relativeAngle = " + FUT091KelvinFragment.access$26(this.this$0));
      if (FUT091KelvinFragment.access$26(this.this$0) < 0)
      {
        FUT091KelvinFragment localFUT091KelvinFragment8 = this.this$0;
        FUT091KelvinFragment.access$25(localFUT091KelvinFragment8, 360 + FUT091KelvinFragment.access$26(localFUT091KelvinFragment8));
      }
      Log.d("debug", "rain sh relativeAngle = " + FUT091KelvinFragment.access$26(this.this$0));
      int i1 = FUT091KelvinFragment.access$27(this.this$0) + FUT091KelvinFragment.access$26(this.this$0);
      if (i1 > 360)
        i1 %= 360;
      int i2;
      if (FUT091KelvinFragment.access$28(this.this$0) != i1)
      {
        i2 = i1 - FUT091KelvinFragment.access$28(this.this$0);
        if (Math.abs(i2) < 80)
        {
          if (i2 <= 0)
            break label1387;
          FUT091KelvinFragment.access$29(this.this$0, (byte)1);
        }
      }
      while (true)
      {
        FUT091KelvinFragment localFUT091KelvinFragment7 = this.this$0;
        FUT091KelvinFragment.access$31(localFUT091KelvinFragment7, i2 + FUT091KelvinFragment.access$30(localFUT091KelvinFragment7));
        if (FUT091KelvinFragment.access$30(this.this$0) >= 360)
          FUT091KelvinFragment.access$31(this.this$0, 360);
        if (FUT091KelvinFragment.access$30(this.this$0) <= 0)
          FUT091KelvinFragment.access$31(this.this$0, 0);
        Log.d("debug", "irain clir - clirOld = " + i2);
        FUT091KelvinFragment.access$32(this.this$0, i1);
        FUT091KelvinFragment.access$9(this.this$0, (int)(0.2777777777777778D * FUT091KelvinFragment.access$30(this.this$0)));
        FUT091KelvinFragment.access$33(this.this$0).setText("Brightness:" + MyApp.rain_08brightness);
        if (MyApp.rain_remoteID == 8)
          MyApp.rain_08brightness = FUT091KelvinFragment.access$2(this.this$0);
        if (!FUT091KelvinFragment.access$34(this.this$0))
        {
          FUT091KelvinFragment.access$0(this.this$0, true);
          this.this$0.myHandler.removeMessages(4356);
          this.this$0.myHandler.sendEmptyMessageDelayed(4356, 160L);
        }
        if (!FUT091KelvinFragment.access$35(this.this$0))
        {
          FUT091KelvinFragment.access$6(this.this$0, true);
          this.this$0.myHandler.removeMessages(1024);
          this.this$0.myHandler.sendEmptyMessageDelayed(1024, 80L);
        }
        FUT091KelvinFragment.access$36(this.this$0, i1);
        break;
        label1387: FUT091KelvinFragment.access$29(this.this$0, (byte)2);
      }
    case 1:
    case 3:
    }
    if (paramView != FUT091KelvinFragment.access$13(this.this$0))
    {
      if (paramView == FUT091KelvinFragment.access$14(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.k_btn_on_nor);
        FUT091KelvinFragment localFUT091KelvinFragment6 = this.this$0;
        FUT091KelvinFragment.access$15(localFUT091KelvinFragment6, 0xFFFFFFFB & FUT091KelvinFragment.access$5(localFUT091KelvinFragment6));
      }
    }
    else
    {
      label1445: if (paramView != FUT091KelvinFragment.access$13(this.this$0))
        break label1751;
      if (FUT091KelvinFragment.access$26(this.this$0) < 0)
      {
        FUT091KelvinFragment localFUT091KelvinFragment3 = this.this$0;
        FUT091KelvinFragment.access$25(localFUT091KelvinFragment3, 360 + FUT091KelvinFragment.access$26(localFUT091KelvinFragment3));
      }
      FUT091KelvinFragment localFUT091KelvinFragment1 = this.this$0;
      FUT091KelvinFragment.access$37(localFUT091KelvinFragment1, FUT091KelvinFragment.access$27(localFUT091KelvinFragment1) + FUT091KelvinFragment.access$26(this.this$0));
      if (FUT091KelvinFragment.access$27(this.this$0) > 360)
      {
        FUT091KelvinFragment localFUT091KelvinFragment2 = this.this$0;
        FUT091KelvinFragment.access$37(localFUT091KelvinFragment2, FUT091KelvinFragment.access$27(localFUT091KelvinFragment2) % 360);
      }
      FUT091KelvinFragment.access$6(this.this$0, false);
      this.this$0.myHandler.removeMessages(4356);
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      if (MyApp.rain_remoteID != 8)
        break label1753;
      arrayOfByte[4] = 3;
    }
    while (true)
    {
      arrayOfByte[5] = (byte)FUT091KelvinFragment.access$2(this.this$0);
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      if (MyApp.rain_remoteID != 8)
        break;
      MyApp.rain_08brightness = FUT091KelvinFragment.access$2(this.this$0);
      break;
      if (paramView == FUT091KelvinFragment.access$16(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.k_btn_off_nor);
        FUT091KelvinFragment localFUT091KelvinFragment5 = this.this$0;
        FUT091KelvinFragment.access$15(localFUT091KelvinFragment5, 0xFFFFFFF7 & FUT091KelvinFragment.access$5(localFUT091KelvinFragment5));
        break label1445;
      }
      if (paramView != FUT091KelvinFragment.access$17(this.this$0))
        break label1445;
      paramView.setBackgroundResource(R.drawable.k_btn_nor);
      FUT091KelvinFragment localFUT091KelvinFragment4 = this.this$0;
      FUT091KelvinFragment.access$15(localFUT091KelvinFragment4, 0xFFFFFFFD & FUT091KelvinFragment.access$5(localFUT091KelvinFragment4));
      break label1445;
      label1751: break;
      label1753: arrayOfByte[4] = FUT091KelvinFragment.access$1(this.this$0);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT091KelvinFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */