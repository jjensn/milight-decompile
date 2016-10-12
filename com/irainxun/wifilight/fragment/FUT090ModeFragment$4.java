package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT090ModeFragment$4
  implements View.OnTouchListener
{
  FUT090ModeFragment$4(FUT090ModeFragment paramFUT090ModeFragment)
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
        if (paramView == FUT090ModeFragment.access$21(this.this$0))
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
          FUT090ModeFragment localFUT090ModeFragment22 = this.this$0;
          FUT090ModeFragment.access$22(localFUT090ModeFragment22, 0x10 | FUT090ModeFragment.access$2(localFUT090ModeFragment22));
          FUT090ModeFragment.access$21(this.this$0).setBackgroundResource(R.drawable.k_btn_on_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT090ModeFragment.access$23(this.this$0))
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
          FUT090ModeFragment localFUT090ModeFragment21 = this.this$0;
          FUT090ModeFragment.access$22(localFUT090ModeFragment21, 0x20 | FUT090ModeFragment.access$2(localFUT090ModeFragment21));
          FUT090ModeFragment.access$23(this.this$0).setBackgroundResource(R.drawable.k_btn_off_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT090ModeFragment.access$24(this.this$0))
        {
          if (Integer.valueOf(FUT090ModeFragment.access$25(this.this$0).getTag().toString()).intValue() != 280)
          {
            FUT090ModeFragment.access$26(this.this$0).setText("M1");
            FUT090ModeFragment.access$25(this.this$0).setTag(Integer.valueOf(280));
            FUT090ModeFragment.access$27(this.this$0, 280);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
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
          FUT090ModeFragment localFUT090ModeFragment20 = this.this$0;
          FUT090ModeFragment.access$28(localFUT090ModeFragment20, 0x1 | FUT090ModeFragment.access$3(localFUT090ModeFragment20));
          FUT090ModeFragment.access$24(this.this$0).setImageResource(R.drawable.fut092_m_m1_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT090ModeFragment.access$29(this.this$0))
        {
          if (Integer.valueOf(FUT090ModeFragment.access$25(this.this$0).getTag().toString()).intValue() != 320)
          {
            FUT090ModeFragment.access$26(this.this$0).setText("M2");
            FUT090ModeFragment.access$25(this.this$0).setTag(Integer.valueOf(320));
            FUT090ModeFragment.access$27(this.this$0, 320);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
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
          FUT090ModeFragment localFUT090ModeFragment19 = this.this$0;
          FUT090ModeFragment.access$28(localFUT090ModeFragment19, 0x2 | FUT090ModeFragment.access$3(localFUT090ModeFragment19));
          FUT090ModeFragment.access$29(this.this$0).setImageResource(R.drawable.fut092_m_m2_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT090ModeFragment.access$30(this.this$0))
        {
          if (Integer.valueOf(FUT090ModeFragment.access$25(this.this$0).getTag().toString()).intValue() != 0)
          {
            FUT090ModeFragment.access$26(this.this$0).setText("M3");
            FUT090ModeFragment.access$25(this.this$0).setTag(Integer.valueOf(0));
            FUT090ModeFragment.access$27(this.this$0, 0);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
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
          FUT090ModeFragment localFUT090ModeFragment18 = this.this$0;
          FUT090ModeFragment.access$28(localFUT090ModeFragment18, 0x4 | FUT090ModeFragment.access$3(localFUT090ModeFragment18));
          FUT090ModeFragment.access$30(this.this$0).setImageResource(R.drawable.fut092_m_m3_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT090ModeFragment.access$31(this.this$0))
        {
          if (Integer.valueOf(FUT090ModeFragment.access$25(this.this$0).getTag().toString()).intValue() != 40)
          {
            FUT090ModeFragment.access$26(this.this$0).setText("M4");
            FUT090ModeFragment.access$25(this.this$0).setTag(Integer.valueOf(40));
            FUT090ModeFragment.access$27(this.this$0, 40);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
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
          FUT090ModeFragment localFUT090ModeFragment17 = this.this$0;
          FUT090ModeFragment.access$28(localFUT090ModeFragment17, 0x8 | FUT090ModeFragment.access$3(localFUT090ModeFragment17));
          FUT090ModeFragment.access$31(this.this$0).setImageResource(R.drawable.fut092_m_m4_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT090ModeFragment.access$32(this.this$0))
        {
          if (Integer.valueOf(FUT090ModeFragment.access$25(this.this$0).getTag().toString()).intValue() != 80)
          {
            FUT090ModeFragment.access$26(this.this$0).setText("M5");
            FUT090ModeFragment.access$25(this.this$0).setTag(Integer.valueOf(80));
            FUT090ModeFragment.access$27(this.this$0, 80);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
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
          FUT090ModeFragment localFUT090ModeFragment16 = this.this$0;
          FUT090ModeFragment.access$28(localFUT090ModeFragment16, 0x10 | FUT090ModeFragment.access$3(localFUT090ModeFragment16));
          FUT090ModeFragment.access$32(this.this$0).setImageResource(R.drawable.fut092_m_m5_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT090ModeFragment.access$33(this.this$0))
        {
          if (Integer.valueOf(FUT090ModeFragment.access$25(this.this$0).getTag().toString()).intValue() != 120)
          {
            FUT090ModeFragment.access$26(this.this$0).setText("M6");
            FUT090ModeFragment.access$25(this.this$0).setTag(Integer.valueOf(120));
            FUT090ModeFragment.access$27(this.this$0, 120);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
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
          FUT090ModeFragment localFUT090ModeFragment15 = this.this$0;
          FUT090ModeFragment.access$28(localFUT090ModeFragment15, 0x20 | FUT090ModeFragment.access$3(localFUT090ModeFragment15));
          FUT090ModeFragment.access$33(this.this$0).setImageResource(R.drawable.fut092_m_m6_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT090ModeFragment.access$34(this.this$0))
        {
          if (Integer.valueOf(FUT090ModeFragment.access$25(this.this$0).getTag().toString()).intValue() != 160)
          {
            FUT090ModeFragment.access$26(this.this$0).setText("M7");
            FUT090ModeFragment.access$25(this.this$0).setTag(Integer.valueOf(160));
            FUT090ModeFragment.access$27(this.this$0, 160);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
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
          FUT090ModeFragment localFUT090ModeFragment14 = this.this$0;
          FUT090ModeFragment.access$28(localFUT090ModeFragment14, 0x40 | FUT090ModeFragment.access$3(localFUT090ModeFragment14));
          FUT090ModeFragment.access$34(this.this$0).setImageResource(R.drawable.fut092_m_m7_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
        if (paramView == FUT090ModeFragment.access$35(this.this$0))
        {
          if (Integer.valueOf(FUT090ModeFragment.access$25(this.this$0).getTag().toString()).intValue() != 200)
          {
            FUT090ModeFragment.access$26(this.this$0).setText("M8");
            FUT090ModeFragment.access$25(this.this$0).setTag(Integer.valueOf(200));
            FUT090ModeFragment.access$27(this.this$0, 200);
          }
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 6;
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
          FUT090ModeFragment localFUT090ModeFragment13 = this.this$0;
          FUT090ModeFragment.access$28(localFUT090ModeFragment13, 0x80 | FUT090ModeFragment.access$3(localFUT090ModeFragment13));
          FUT090ModeFragment.access$35(this.this$0).setImageResource(R.drawable.fut092_m_m8_press);
          this.this$0.myHandler.removeMessages(4353);
          this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
          return true;
        }
      }
      while (paramView != FUT090ModeFragment.access$36(this.this$0));
      if (Integer.valueOf(FUT090ModeFragment.access$25(this.this$0).getTag().toString()).intValue() != 240)
      {
        FUT090ModeFragment.access$26(this.this$0).setText("M9");
        FUT090ModeFragment.access$25(this.this$0).setTag(Integer.valueOf(240));
        FUT090ModeFragment.access$27(this.this$0, 240);
      }
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 6;
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
      FUT090ModeFragment localFUT090ModeFragment12 = this.this$0;
      FUT090ModeFragment.access$28(localFUT090ModeFragment12, 0x100 | FUT090ModeFragment.access$3(localFUT090ModeFragment12));
      FUT090ModeFragment.access$36(this.this$0).setImageResource(R.drawable.fut092_m_m9_press);
      this.this$0.myHandler.removeMessages(4353);
      this.this$0.myHandler.sendEmptyMessageDelayed(4353, 400L);
      return true;
      if (paramView == FUT090ModeFragment.access$21(this.this$0))
      {
        FUT090ModeFragment localFUT090ModeFragment11 = this.this$0;
        FUT090ModeFragment.access$22(localFUT090ModeFragment11, 0xFFFFFFEF & FUT090ModeFragment.access$2(localFUT090ModeFragment11));
        FUT090ModeFragment.access$21(this.this$0).setBackgroundResource(R.drawable.k_btn_on_nor);
        return true;
      }
      if (paramView == FUT090ModeFragment.access$23(this.this$0))
      {
        FUT090ModeFragment localFUT090ModeFragment10 = this.this$0;
        FUT090ModeFragment.access$22(localFUT090ModeFragment10, 0xFFFFFFDF & FUT090ModeFragment.access$2(localFUT090ModeFragment10));
        FUT090ModeFragment.access$23(this.this$0).setBackgroundResource(R.drawable.k_btn_off_nor);
        return true;
      }
      if (paramView == FUT090ModeFragment.access$24(this.this$0))
      {
        FUT090ModeFragment localFUT090ModeFragment9 = this.this$0;
        FUT090ModeFragment.access$28(localFUT090ModeFragment9, 0xFFFFFFFE & FUT090ModeFragment.access$3(localFUT090ModeFragment9));
        FUT090ModeFragment.access$24(this.this$0).setImageResource(R.drawable.fut092_m_m1_nor);
        return true;
      }
      if (paramView == FUT090ModeFragment.access$29(this.this$0))
      {
        FUT090ModeFragment localFUT090ModeFragment8 = this.this$0;
        FUT090ModeFragment.access$28(localFUT090ModeFragment8, 0xFFFFFFFD & FUT090ModeFragment.access$3(localFUT090ModeFragment8));
        FUT090ModeFragment.access$29(this.this$0).setImageResource(R.drawable.fut092_m_m2_nor);
        return true;
      }
      if (paramView == FUT090ModeFragment.access$30(this.this$0))
      {
        FUT090ModeFragment localFUT090ModeFragment7 = this.this$0;
        FUT090ModeFragment.access$28(localFUT090ModeFragment7, 0xFFFFFFFB & FUT090ModeFragment.access$3(localFUT090ModeFragment7));
        FUT090ModeFragment.access$30(this.this$0).setImageResource(R.drawable.fut092_m_m3_nor);
        return true;
      }
      if (paramView == FUT090ModeFragment.access$31(this.this$0))
      {
        FUT090ModeFragment localFUT090ModeFragment6 = this.this$0;
        FUT090ModeFragment.access$28(localFUT090ModeFragment6, 0xFFFFFFF7 & FUT090ModeFragment.access$3(localFUT090ModeFragment6));
        FUT090ModeFragment.access$31(this.this$0).setImageResource(R.drawable.fut092_m_m4_nor);
        return true;
      }
      if (paramView == FUT090ModeFragment.access$32(this.this$0))
      {
        FUT090ModeFragment localFUT090ModeFragment5 = this.this$0;
        FUT090ModeFragment.access$28(localFUT090ModeFragment5, 0xFFFFFFEF & FUT090ModeFragment.access$3(localFUT090ModeFragment5));
        FUT090ModeFragment.access$32(this.this$0).setImageResource(R.drawable.fut092_m_m5_nor);
        return true;
      }
      if (paramView == FUT090ModeFragment.access$33(this.this$0))
      {
        FUT090ModeFragment localFUT090ModeFragment4 = this.this$0;
        FUT090ModeFragment.access$28(localFUT090ModeFragment4, 0xFFFFFFDF & FUT090ModeFragment.access$3(localFUT090ModeFragment4));
        FUT090ModeFragment.access$33(this.this$0).setImageResource(R.drawable.fut092_m_m6_nor);
        return true;
      }
      if (paramView == FUT090ModeFragment.access$34(this.this$0))
      {
        FUT090ModeFragment localFUT090ModeFragment3 = this.this$0;
        FUT090ModeFragment.access$28(localFUT090ModeFragment3, 0xFFFFFFBF & FUT090ModeFragment.access$3(localFUT090ModeFragment3));
        FUT090ModeFragment.access$34(this.this$0).setImageResource(R.drawable.fut092_m_m7_nor);
        return true;
      }
      if (paramView == FUT090ModeFragment.access$35(this.this$0))
      {
        FUT090ModeFragment localFUT090ModeFragment2 = this.this$0;
        FUT090ModeFragment.access$28(localFUT090ModeFragment2, 0xFFFFFF7F & FUT090ModeFragment.access$3(localFUT090ModeFragment2));
        FUT090ModeFragment.access$35(this.this$0).setImageResource(R.drawable.fut092_m_m8_nor);
        return true;
      }
    }
    while (paramView != FUT090ModeFragment.access$36(this.this$0));
    FUT090ModeFragment localFUT090ModeFragment1 = this.this$0;
    FUT090ModeFragment.access$28(localFUT090ModeFragment1, 0xFFFFFEFF & FUT090ModeFragment.access$3(localFUT090ModeFragment1));
    FUT090ModeFragment.access$36(this.this$0).setImageResource(R.drawable.fut092_m_m9_nor);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ModeFragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */