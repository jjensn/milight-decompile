package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT092ModeFragment$2
  implements View.OnTouchListener
{
  FUT092ModeFragment$2(FUT092ModeFragment paramFUT092ModeFragment)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    byte[] arrayOfByte = new byte[12];
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
        if (paramView == FUT092ModeFragment.access$7(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_on_press);
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
          FUT092ModeFragment localFUT092ModeFragment28 = this.this$0;
          FUT092ModeFragment.access$8(localFUT092ModeFragment28, 0x4 | FUT092ModeFragment.access$2(localFUT092ModeFragment28));
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$9(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_off_press);
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
          FUT092ModeFragment localFUT092ModeFragment27 = this.this$0;
          FUT092ModeFragment.access$8(localFUT092ModeFragment27, 0x8 | FUT092ModeFragment.access$2(localFUT092ModeFragment27));
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$10(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.k_btn_press);
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
          FUT092ModeFragment localFUT092ModeFragment26 = this.this$0;
          FUT092ModeFragment.access$8(localFUT092ModeFragment26, 0x2 | FUT092ModeFragment.access$2(localFUT092ModeFragment26));
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$11(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.fut028_btn_si_press);
          FUT092ModeFragment localFUT092ModeFragment25 = this.this$0;
          FUT092ModeFragment.access$8(localFUT092ModeFragment25, 0x1 | FUT092ModeFragment.access$2(localFUT092ModeFragment25));
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
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$12(this.this$0))
        {
          paramView.setBackgroundResource(R.drawable.fut028_btn_sd_press);
          FUT092ModeFragment localFUT092ModeFragment24 = this.this$0;
          FUT092ModeFragment.access$8(localFUT092ModeFragment24, 0x10 | FUT092ModeFragment.access$2(localFUT092ModeFragment24));
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
          return true;
        }
        if (paramView == FUT092ModeFragment.access$13(this.this$0))
        {
          if (Integer.valueOf(FUT092ModeFragment.access$14(this.this$0).getTag().toString()).intValue() != 280)
          {
            FUT092ModeFragment.access$15(this.this$0).setText("M1");
            FUT092ModeFragment.access$14(this.this$0).setTag(Integer.valueOf(280));
            FUT092ModeFragment.access$16(this.this$0, 280);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
          arrayOfByte[5] = 1;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment localFUT092ModeFragment23 = this.this$0;
          FUT092ModeFragment.access$17(localFUT092ModeFragment23, 0x1 | FUT092ModeFragment.access$3(localFUT092ModeFragment23));
          FUT092ModeFragment.access$13(this.this$0).setImageResource(R.drawable.fut092_m_m1_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$18(this.this$0))
        {
          if (Integer.valueOf(FUT092ModeFragment.access$14(this.this$0).getTag().toString()).intValue() != 320)
          {
            FUT092ModeFragment.access$15(this.this$0).setText("M2");
            FUT092ModeFragment.access$14(this.this$0).setTag(Integer.valueOf(320));
            FUT092ModeFragment.access$16(this.this$0, 320);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
          arrayOfByte[5] = 2;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment localFUT092ModeFragment22 = this.this$0;
          FUT092ModeFragment.access$17(localFUT092ModeFragment22, 0x2 | FUT092ModeFragment.access$3(localFUT092ModeFragment22));
          FUT092ModeFragment.access$18(this.this$0).setImageResource(R.drawable.fut092_m_m2_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$19(this.this$0))
        {
          if (Integer.valueOf(FUT092ModeFragment.access$14(this.this$0).getTag().toString()).intValue() != 0)
          {
            FUT092ModeFragment.access$15(this.this$0).setText("M3");
            FUT092ModeFragment.access$14(this.this$0).setTag(Integer.valueOf(0));
            FUT092ModeFragment.access$16(this.this$0, 0);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
          arrayOfByte[5] = 3;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment localFUT092ModeFragment21 = this.this$0;
          FUT092ModeFragment.access$17(localFUT092ModeFragment21, 0x4 | FUT092ModeFragment.access$3(localFUT092ModeFragment21));
          FUT092ModeFragment.access$19(this.this$0).setImageResource(R.drawable.fut092_m_m3_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$20(this.this$0))
        {
          if (Integer.valueOf(FUT092ModeFragment.access$14(this.this$0).getTag().toString()).intValue() != 40)
          {
            FUT092ModeFragment.access$15(this.this$0).setText("M4");
            FUT092ModeFragment.access$14(this.this$0).setTag(Integer.valueOf(40));
            FUT092ModeFragment.access$16(this.this$0, 40);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
          arrayOfByte[5] = 4;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment localFUT092ModeFragment20 = this.this$0;
          FUT092ModeFragment.access$17(localFUT092ModeFragment20, 0x8 | FUT092ModeFragment.access$3(localFUT092ModeFragment20));
          FUT092ModeFragment.access$20(this.this$0).setImageResource(R.drawable.fut092_m_m4_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$21(this.this$0))
        {
          if (Integer.valueOf(FUT092ModeFragment.access$14(this.this$0).getTag().toString()).intValue() != 80)
          {
            FUT092ModeFragment.access$15(this.this$0).setText("M5");
            FUT092ModeFragment.access$14(this.this$0).setTag(Integer.valueOf(80));
            FUT092ModeFragment.access$16(this.this$0, 80);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
          arrayOfByte[5] = 5;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment localFUT092ModeFragment19 = this.this$0;
          FUT092ModeFragment.access$17(localFUT092ModeFragment19, 0x10 | FUT092ModeFragment.access$3(localFUT092ModeFragment19));
          FUT092ModeFragment.access$21(this.this$0).setImageResource(R.drawable.fut092_m_m5_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$22(this.this$0))
        {
          if (Integer.valueOf(FUT092ModeFragment.access$14(this.this$0).getTag().toString()).intValue() != 120)
          {
            FUT092ModeFragment.access$15(this.this$0).setText("M6");
            FUT092ModeFragment.access$14(this.this$0).setTag(Integer.valueOf(120));
            FUT092ModeFragment.access$16(this.this$0, 120);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
          arrayOfByte[5] = 6;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment localFUT092ModeFragment18 = this.this$0;
          FUT092ModeFragment.access$17(localFUT092ModeFragment18, 0x20 | FUT092ModeFragment.access$3(localFUT092ModeFragment18));
          FUT092ModeFragment.access$22(this.this$0).setImageResource(R.drawable.fut092_m_m6_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$23(this.this$0))
        {
          if (Integer.valueOf(FUT092ModeFragment.access$14(this.this$0).getTag().toString()).intValue() != 160)
          {
            FUT092ModeFragment.access$15(this.this$0).setText("M7");
            FUT092ModeFragment.access$14(this.this$0).setTag(Integer.valueOf(160));
            FUT092ModeFragment.access$16(this.this$0, 160);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
          arrayOfByte[5] = 7;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment localFUT092ModeFragment17 = this.this$0;
          FUT092ModeFragment.access$17(localFUT092ModeFragment17, 0x40 | FUT092ModeFragment.access$3(localFUT092ModeFragment17));
          FUT092ModeFragment.access$23(this.this$0).setImageResource(R.drawable.fut092_m_m7_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT092ModeFragment.access$24(this.this$0))
        {
          if (Integer.valueOf(FUT092ModeFragment.access$14(this.this$0).getTag().toString()).intValue() != 200)
          {
            FUT092ModeFragment.access$15(this.this$0).setText("M8");
            FUT092ModeFragment.access$14(this.this$0).setTag(Integer.valueOf(200));
            FUT092ModeFragment.access$16(this.this$0, 200);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
          arrayOfByte[5] = 8;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment localFUT092ModeFragment16 = this.this$0;
          FUT092ModeFragment.access$17(localFUT092ModeFragment16, 0x80 | FUT092ModeFragment.access$3(localFUT092ModeFragment16));
          FUT092ModeFragment.access$24(this.this$0).setImageResource(R.drawable.fut092_m_m8_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
      }
      while (paramView != FUT092ModeFragment.access$25(this.this$0));
      if (Integer.valueOf(FUT092ModeFragment.access$14(this.this$0).getTag().toString()).intValue() != 240)
      {
        FUT092ModeFragment.access$15(this.this$0).setText("M9");
        FUT092ModeFragment.access$14(this.this$0).setTag(Integer.valueOf(240));
        FUT092ModeFragment.access$16(this.this$0, 240);
      }
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 6;
      arrayOfByte[5] = 9;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      FUT092ModeFragment localFUT092ModeFragment15 = this.this$0;
      FUT092ModeFragment.access$17(localFUT092ModeFragment15, 0x100 | FUT092ModeFragment.access$3(localFUT092ModeFragment15));
      FUT092ModeFragment.access$25(this.this$0).setImageResource(R.drawable.fut092_m_m9_press);
      this.this$0.myHandler.removeMessages(4353);
      this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
      return true;
      if (paramView == FUT092ModeFragment.access$7(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.k_btn_on_nor);
        FUT092ModeFragment localFUT092ModeFragment14 = this.this$0;
        FUT092ModeFragment.access$8(localFUT092ModeFragment14, 0xFFFFFFFB & FUT092ModeFragment.access$2(localFUT092ModeFragment14));
        return true;
      }
      if (paramView == FUT092ModeFragment.access$9(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.k_btn_off_nor);
        FUT092ModeFragment localFUT092ModeFragment13 = this.this$0;
        FUT092ModeFragment.access$8(localFUT092ModeFragment13, 0xFFFFFFF7 & FUT092ModeFragment.access$2(localFUT092ModeFragment13));
        return true;
      }
      if (paramView == FUT092ModeFragment.access$10(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.k_btn_nor);
        FUT092ModeFragment localFUT092ModeFragment12 = this.this$0;
        FUT092ModeFragment.access$8(localFUT092ModeFragment12, 0xFFFFFFFD & FUT092ModeFragment.access$2(localFUT092ModeFragment12));
        return true;
      }
      if (paramView == FUT092ModeFragment.access$11(this.this$0))
      {
        paramView.setBackgroundResource(R.drawable.fut028_btn_si_nor);
        FUT092ModeFragment localFUT092ModeFragment11 = this.this$0;
        FUT092ModeFragment.access$8(localFUT092ModeFragment11, 0xFFFFFFFE & FUT092ModeFragment.access$2(localFUT092ModeFragment11));
        return true;
      }
      if (paramView == FUT092ModeFragment.access$12(this.this$0))
      {
        FUT092ModeFragment localFUT092ModeFragment10 = this.this$0;
        FUT092ModeFragment.access$8(localFUT092ModeFragment10, 0xFFFFFFEF & FUT092ModeFragment.access$2(localFUT092ModeFragment10));
        paramView.setBackgroundResource(R.drawable.fut028_btn_sd_nor);
        return true;
      }
      if (paramView == FUT092ModeFragment.access$13(this.this$0))
      {
        FUT092ModeFragment localFUT092ModeFragment9 = this.this$0;
        FUT092ModeFragment.access$17(localFUT092ModeFragment9, 0xFFFFFFFE & FUT092ModeFragment.access$3(localFUT092ModeFragment9));
        FUT092ModeFragment.access$13(this.this$0).setImageResource(R.drawable.fut092_m_m1_nor);
        return true;
      }
      if (paramView == FUT092ModeFragment.access$18(this.this$0))
      {
        FUT092ModeFragment localFUT092ModeFragment8 = this.this$0;
        FUT092ModeFragment.access$17(localFUT092ModeFragment8, 0xFFFFFFFD & FUT092ModeFragment.access$3(localFUT092ModeFragment8));
        FUT092ModeFragment.access$18(this.this$0).setImageResource(R.drawable.fut092_m_m2_nor);
        return true;
      }
      if (paramView == FUT092ModeFragment.access$19(this.this$0))
      {
        FUT092ModeFragment localFUT092ModeFragment7 = this.this$0;
        FUT092ModeFragment.access$17(localFUT092ModeFragment7, 0xFFFFFFFB & FUT092ModeFragment.access$3(localFUT092ModeFragment7));
        FUT092ModeFragment.access$19(this.this$0).setImageResource(R.drawable.fut092_m_m3_nor);
        return true;
      }
      if (paramView == FUT092ModeFragment.access$20(this.this$0))
      {
        FUT092ModeFragment localFUT092ModeFragment6 = this.this$0;
        FUT092ModeFragment.access$17(localFUT092ModeFragment6, 0xFFFFFFF7 & FUT092ModeFragment.access$3(localFUT092ModeFragment6));
        FUT092ModeFragment.access$20(this.this$0).setImageResource(R.drawable.fut092_m_m4_nor);
        return true;
      }
      if (paramView == FUT092ModeFragment.access$21(this.this$0))
      {
        FUT092ModeFragment localFUT092ModeFragment5 = this.this$0;
        FUT092ModeFragment.access$17(localFUT092ModeFragment5, 0xFFFFFFEF & FUT092ModeFragment.access$3(localFUT092ModeFragment5));
        FUT092ModeFragment.access$21(this.this$0).setImageResource(R.drawable.fut092_m_m5_nor);
        return true;
      }
      if (paramView == FUT092ModeFragment.access$22(this.this$0))
      {
        FUT092ModeFragment localFUT092ModeFragment4 = this.this$0;
        FUT092ModeFragment.access$17(localFUT092ModeFragment4, 0xFFFFFFDF & FUT092ModeFragment.access$3(localFUT092ModeFragment4));
        FUT092ModeFragment.access$22(this.this$0).setImageResource(R.drawable.fut092_m_m6_nor);
        return true;
      }
      if (paramView == FUT092ModeFragment.access$23(this.this$0))
      {
        FUT092ModeFragment localFUT092ModeFragment3 = this.this$0;
        FUT092ModeFragment.access$17(localFUT092ModeFragment3, 0xFFFFFFBF & FUT092ModeFragment.access$3(localFUT092ModeFragment3));
        FUT092ModeFragment.access$23(this.this$0).setImageResource(R.drawable.fut092_m_m7_nor);
        return true;
      }
      if (paramView == FUT092ModeFragment.access$24(this.this$0))
      {
        FUT092ModeFragment localFUT092ModeFragment2 = this.this$0;
        FUT092ModeFragment.access$17(localFUT092ModeFragment2, 0xFFFFFF7F & FUT092ModeFragment.access$3(localFUT092ModeFragment2));
        FUT092ModeFragment.access$24(this.this$0).setImageResource(R.drawable.fut092_m_m8_nor);
        return true;
      }
    }
    while (paramView != FUT092ModeFragment.access$25(this.this$0));
    FUT092ModeFragment localFUT092ModeFragment1 = this.this$0;
    FUT092ModeFragment.access$17(localFUT092ModeFragment1, 0xFFFFFEFF & FUT092ModeFragment.access$3(localFUT092ModeFragment1));
    FUT092ModeFragment.access$25(this.this$0).setImageResource(R.drawable.fut092_m_m9_nor);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ModeFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */