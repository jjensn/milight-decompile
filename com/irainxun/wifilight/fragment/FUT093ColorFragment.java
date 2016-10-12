package com.irainxun.wifilight.fragment;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifi_light;
import com.irainxun.wifilight.util.ActivityUtil;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

public class FUT093ColorFragment extends Fragment
{
  private static final int buttonKeyEvent = 4353;
  private static final int cirleSend = 4356;
  private static final int cirleSendData = 160;
  private static final int cirleTime = 40;
  private static final int delayLongTime = 400;
  private static final int delayTime = 200;
  private static final int processEvent = 4355;
  private byte[] CirlByte = new byte[4];
  private int CirlColor;
  private byte CirlgetData = 0;
  private int LightColor;
  private final String TAG = getClass().getSimpleName();
  private boolean beepFlag;
  private int beepdata;
  private View bg_scal;
  private Button btnOff;
  private Button btnOn;
  private Button btn_m1;
  private Button btn_m2;
  private Button btn_m3;
  private boolean cirleSendDataFlag = false;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == FUT093ColorFragment.this.ivAddColor)
        FUT093ColorFragment.this.colorPickerUtil.addColorPoint(FUT093ColorFragment.this.getColor(FUT093ColorFragment.this.sb_lightData));
      while (paramAnonymousView == FUT093ColorFragment.this.btnOn)
        return;
    }
  };
  private int clirOld = 0;
  private ColorPicker colorPickerUtil;
  private byte dirclir = 0;
  private ImageView ivAddColor;
  private ImageView iv_book;
  private ImageView iv_coffee;
  private ImageView iv_sunset;
  private int longKeyMode = 0;
  Handler myHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      byte[] arrayOfByte = new byte[12];
      switch (paramAnonymousMessage.what)
      {
      default:
      case 4356:
      case 4355:
      case 2:
      case 4353:
      case 1024:
      }
      do
      {
        do
        {
          return;
          FUT093ColorFragment.this.cirleSendDataFlag = false;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = FUT093ColorFragment.this.dirclir;
          arrayOfByte[5] = (byte)FUT093ColorFragment.this.LightColor;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          Log.d("debug", "send cirl data");
          return;
          FUT093ColorFragment.this.sb_lightFlag = false;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 3;
          arrayOfByte[5] = (byte)FUT093ColorFragment.this.sb_lightData;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return;
          Log.d("debug", "  LightColor = " + FUT093ColorFragment.this.LightColor);
          FUT093ColorFragment.this.cirleSendDataFlag = false;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)FUT093ColorFragment.this.LightColor;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 1;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = (byte)((char)(0xFF & arrayOfByte[0]) + (char)(0xFF & arrayOfByte[1]) + (char)(0xFF & arrayOfByte[2]) + (char)(0xFF & arrayOfByte[3]) + (char)(0xFF & arrayOfByte[4]) + (char)(0xFF & arrayOfByte[5]) + (char)(0xFF & arrayOfByte[6]) + (char)(0xFF & arrayOfByte[7]) + (char)(0xFF & arrayOfByte[8]));
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return;
          if ((0x1 & FUT093ColorFragment.this.longKeyMode) == 1)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -124;
            arrayOfByte[5] = 7;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
          if ((0x2 & FUT093ColorFragment.this.longKeyMode) == 2)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -124;
            arrayOfByte[5] = 8;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
          if ((0x4 & FUT093ColorFragment.this.longKeyMode) == 4)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -124;
            arrayOfByte[5] = 1;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
          if ((0x8 & FUT093ColorFragment.this.longKeyMode) == 8)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -124;
            arrayOfByte[5] = 2;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
          if ((0x10 & FUT093ColorFragment.this.longKeyMode) == 16)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -124;
            arrayOfByte[5] = 3;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
          if ((0x20 & FUT093ColorFragment.this.longKeyMode) == 32)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -124;
            arrayOfByte[5] = 4;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
          if ((0x40 & FUT093ColorFragment.this.longKeyMode) == 64)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -124;
            arrayOfByte[5] = 5;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
          }
        }
        while ((0x80 & FUT093ColorFragment.this.longKeyMode) != 128);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = -124;
        arrayOfByte[5] = 6;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        return;
        FUT093ColorFragment.this.beepFlag = false;
      }
      while (FUT093ColorFragment.this.beepdata == FUT093ColorFragment.this.LightColor);
      FUT093ColorFragment.this.beepdata = FUT093ColorFragment.this.LightColor;
      MyApp.PlalyKeySound();
    }
  };
  private View.OnTouchListener ontouchListener = new View.OnTouchListener()
  {
    public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      byte[] arrayOfByte = new byte[12];
      int i = (int)paramAnonymousMotionEvent.getX();
      int j = (int)paramAnonymousMotionEvent.getY();
      switch (paramAnonymousMotionEvent.getAction())
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
        if (paramAnonymousView != FUT093ColorFragment.this.bg_scal)
          MyApp.PlalyKeySound();
        if (paramAnonymousView == FUT093ColorFragment.this.btnOn)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.ic_btn_on_press);
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
          FUT093ColorFragment localFUT093ColorFragment21 = FUT093ColorFragment.this;
          localFUT093ColorFragment21.longKeyMode = (0x1 | localFUT093ColorFragment21.longKeyMode);
          FUT093ColorFragment.this.myHandler.removeMessages(4353);
          FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        }
        else if (paramAnonymousView == FUT093ColorFragment.this.btnOff)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.ic_btn_off_press);
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
          FUT093ColorFragment localFUT093ColorFragment20 = FUT093ColorFragment.this;
          localFUT093ColorFragment20.longKeyMode = (0x2 | localFUT093ColorFragment20.longKeyMode);
          FUT093ColorFragment.this.myHandler.removeMessages(4353);
          FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        }
        else if (paramAnonymousView == FUT093ColorFragment.this.bg_scal)
        {
          if (i < 6)
            i = 6;
          int i3 = -6 + FUT093ColorFragment.this.scal_imageview.getWidth();
          if (i > i3)
            i = i3;
          if (j < 6)
            j = 6;
          int i4 = -6 + FUT093ColorFragment.this.scal_imageview.getHeight();
          if (j > i4)
            j = i4;
          int i5 = FUT093ColorFragment.this.scal_imageview.getWidth();
          FUT093ColorFragment.this.pressData = FUT093ColorFragment.this.CircularData(i, j, i5 / 2, 6);
          FUT093ColorFragment.this.sendColorFlag = false;
          FUT093ColorFragment.this.cirleSendDataFlag = false;
          FUT093ColorFragment.this.CirlgetData = 0;
          FUT093ColorFragment.this.CirlByte[0] = (byte)FUT093ColorFragment.this.LightColor;
          FUT093ColorFragment.this.CirlByte[1] = (byte)FUT093ColorFragment.this.LightColor;
          FUT093ColorFragment.this.CirlByte[2] = (byte)FUT093ColorFragment.this.LightColor;
          FUT093ColorFragment.this.CirlByte[3] = (byte)FUT093ColorFragment.this.LightColor;
        }
        else if (paramAnonymousView == FUT093ColorFragment.this.iv_book)
        {
          FUT093ColorFragment.this.iv_book.setImageResource(R.drawable.fut_iv_book_press);
          FUT093ColorFragment localFUT093ColorFragment19 = FUT093ColorFragment.this;
          localFUT093ColorFragment19.longKeyMode = (0x4 | localFUT093ColorFragment19.longKeyMode);
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
          FUT093ColorFragment.this.myHandler.removeMessages(4353);
          FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        }
        else if (paramAnonymousView == FUT093ColorFragment.this.iv_coffee)
        {
          FUT093ColorFragment.this.iv_coffee.setImageResource(R.drawable.fut_iv_coffee_press);
          FUT093ColorFragment localFUT093ColorFragment18 = FUT093ColorFragment.this;
          localFUT093ColorFragment18.longKeyMode = (0x8 | localFUT093ColorFragment18.longKeyMode);
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
          FUT093ColorFragment.this.myHandler.removeMessages(4353);
          FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        }
        else if (paramAnonymousView == FUT093ColorFragment.this.iv_sunset)
        {
          FUT093ColorFragment.this.iv_sunset.setImageResource(R.drawable.fut_iv_sunset_press);
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
          FUT093ColorFragment localFUT093ColorFragment17 = FUT093ColorFragment.this;
          localFUT093ColorFragment17.longKeyMode = (0x10 | localFUT093ColorFragment17.longKeyMode);
          FUT093ColorFragment.this.myHandler.removeMessages(4353);
          FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        }
        else if (paramAnonymousView == FUT093ColorFragment.this.btn_m1)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.fut_iv_m_press);
          FUT093ColorFragment localFUT093ColorFragment16 = FUT093ColorFragment.this;
          localFUT093ColorFragment16.longKeyMode = (0x20 | localFUT093ColorFragment16.longKeyMode);
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
          FUT093ColorFragment.this.myHandler.removeMessages(4353);
          FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        }
        else if (paramAnonymousView == FUT093ColorFragment.this.btn_m2)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.fut_iv_m_press);
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
          FUT093ColorFragment localFUT093ColorFragment15 = FUT093ColorFragment.this;
          localFUT093ColorFragment15.longKeyMode = (0x40 | localFUT093ColorFragment15.longKeyMode);
          FUT093ColorFragment.this.myHandler.removeMessages(4353);
          FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        }
        else if (paramAnonymousView == FUT093ColorFragment.this.btn_m3)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.fut_iv_m_press);
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
          FUT093ColorFragment localFUT093ColorFragment14 = FUT093ColorFragment.this;
          localFUT093ColorFragment14.longKeyMode = (0x80 | localFUT093ColorFragment14.longKeyMode);
          FUT093ColorFragment.this.myHandler.removeMessages(4353);
          FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
          continue;
          if (paramAnonymousView == FUT093ColorFragment.this.bg_scal)
          {
            if (i < 6)
              i = 6;
            int k = -6 + FUT093ColorFragment.this.scal_imageview.getWidth();
            if (i > k)
              i = k;
            if (j < 6)
              j = 6;
            int m = -6 + FUT093ColorFragment.this.scal_imageview.getHeight();
            if (j > m)
              j = m;
            int n = FUT093ColorFragment.this.scal_imageview.getWidth();
            FUT093ColorFragment.Circular localCircular = FUT093ColorFragment.this.CircularData(i, j, n / 2, 6);
            FUT093ColorFragment.this.relativeAngle = (localCircular.angle - FUT093ColorFragment.this.pressData.angle);
            Log.d("debug", "rain dataAngle.angle = " + localCircular.angle);
            Log.d("debug", "rain pressData.angle = " + FUT093ColorFragment.this.pressData.angle);
            Log.d("debug", "rain relativeAngle = " + FUT093ColorFragment.this.relativeAngle);
            if (FUT093ColorFragment.this.relativeAngle < 0)
            {
              FUT093ColorFragment localFUT093ColorFragment13 = FUT093ColorFragment.this;
              localFUT093ColorFragment13.relativeAngle = (360 + localFUT093ColorFragment13.relativeAngle);
            }
            Log.d("debug", "rain sh relativeAngle = " + FUT093ColorFragment.this.relativeAngle);
            int i1 = FUT093ColorFragment.this.runAngle + FUT093ColorFragment.this.relativeAngle;
            if (i1 > 360)
              i1 %= 360;
            int i2;
            if (FUT093ColorFragment.this.clirOld != i1)
            {
              i2 = i1 - FUT093ColorFragment.this.clirOld;
              if (Math.abs(i2) < 80)
                if (i2 <= 0)
                  break label2069;
            }
            for (FUT093ColorFragment.this.dirclir = 1; ; FUT093ColorFragment.this.dirclir = 2)
            {
              FUT093ColorFragment localFUT093ColorFragment12 = FUT093ColorFragment.this;
              localFUT093ColorFragment12.CirlColor = (i2 + localFUT093ColorFragment12.CirlColor);
              if (FUT093ColorFragment.this.CirlColor >= 360)
                FUT093ColorFragment.this.CirlColor = 360;
              if (FUT093ColorFragment.this.CirlColor <= 0)
                FUT093ColorFragment.this.CirlColor = 0;
              Log.d("debug", "irain clir - clirOld = " + i2);
              FUT093ColorFragment.this.clirOld = i1;
              FUT093ColorFragment.this.LightColor = (int)(0.2777777777777778D * FUT093ColorFragment.this.CirlColor);
              FUT093ColorFragment.this.tvBrightness.setText("Brightness:" + FUT093ColorFragment.this.LightColor);
              if (!FUT093ColorFragment.this.cirleSendDataFlag)
              {
                FUT093ColorFragment.this.cirleSendDataFlag = true;
                FUT093ColorFragment.this.myHandler.removeMessages(4356);
                FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
              }
              if (!FUT093ColorFragment.this.beepFlag)
              {
                FUT093ColorFragment.this.beepFlag = true;
                FUT093ColorFragment.this.myHandler.removeMessages(1024);
                FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(1024, 80L);
              }
              FUT093ColorFragment.this.turnDegree(i1);
              break;
            }
            if (paramAnonymousView != FUT093ColorFragment.this.bg_scal)
            {
              if (paramAnonymousView != FUT093ColorFragment.this.btnOn)
                break label2338;
              paramAnonymousView.setBackgroundResource(R.drawable.ic_btn_on_nor);
              FUT093ColorFragment localFUT093ColorFragment11 = FUT093ColorFragment.this;
              localFUT093ColorFragment11.longKeyMode = (0xFFFFFFFE & localFUT093ColorFragment11.longKeyMode);
            }
            while (true)
            {
              if (paramAnonymousView != FUT093ColorFragment.this.bg_scal)
                break label2635;
              if (FUT093ColorFragment.this.relativeAngle < 0)
              {
                FUT093ColorFragment localFUT093ColorFragment3 = FUT093ColorFragment.this;
                localFUT093ColorFragment3.relativeAngle = (360 + localFUT093ColorFragment3.relativeAngle);
              }
              FUT093ColorFragment localFUT093ColorFragment1 = FUT093ColorFragment.this;
              localFUT093ColorFragment1.runAngle += FUT093ColorFragment.this.relativeAngle;
              if (FUT093ColorFragment.this.runAngle > 360)
              {
                FUT093ColorFragment localFUT093ColorFragment2 = FUT093ColorFragment.this;
                localFUT093ColorFragment2.runAngle %= 360;
              }
              FUT093ColorFragment.this.beepFlag = false;
              FUT093ColorFragment.this.myHandler.removeMessages(4356);
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = FUT093ColorFragment.this.dirclir;
              arrayOfByte[5] = (byte)FUT093ColorFragment.this.LightColor;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              break;
              if (paramAnonymousView == FUT093ColorFragment.this.btnOff)
              {
                paramAnonymousView.setBackgroundResource(R.drawable.ic_btn_off_nor);
                FUT093ColorFragment localFUT093ColorFragment10 = FUT093ColorFragment.this;
                localFUT093ColorFragment10.longKeyMode = (0xFFFFFFFD & localFUT093ColorFragment10.longKeyMode);
              }
              else if (paramAnonymousView == FUT093ColorFragment.this.iv_book)
              {
                FUT093ColorFragment.this.iv_book.setImageResource(R.drawable.fut_iv_book_nor);
                FUT093ColorFragment localFUT093ColorFragment9 = FUT093ColorFragment.this;
                localFUT093ColorFragment9.longKeyMode = (0xFFFFFFFB & localFUT093ColorFragment9.longKeyMode);
              }
              else if (paramAnonymousView == FUT093ColorFragment.this.iv_coffee)
              {
                FUT093ColorFragment.this.iv_coffee.setImageResource(R.drawable.fut_iv_coffee_nor);
                FUT093ColorFragment localFUT093ColorFragment8 = FUT093ColorFragment.this;
                localFUT093ColorFragment8.longKeyMode = (0xFFFFFFF7 & localFUT093ColorFragment8.longKeyMode);
              }
              else if (paramAnonymousView == FUT093ColorFragment.this.iv_sunset)
              {
                FUT093ColorFragment.this.iv_sunset.setImageResource(R.drawable.fut_iv_sunset_nor);
                FUT093ColorFragment localFUT093ColorFragment7 = FUT093ColorFragment.this;
                localFUT093ColorFragment7.longKeyMode = (0xFFFFFFEF & localFUT093ColorFragment7.longKeyMode);
              }
              else if (paramAnonymousView == FUT093ColorFragment.this.btn_m1)
              {
                paramAnonymousView.setBackgroundResource(R.drawable.fut_iv_m_nor);
                FUT093ColorFragment localFUT093ColorFragment6 = FUT093ColorFragment.this;
                localFUT093ColorFragment6.longKeyMode = (0xFFFFFFDF & localFUT093ColorFragment6.longKeyMode);
              }
              else if (paramAnonymousView == FUT093ColorFragment.this.btn_m2)
              {
                paramAnonymousView.setBackgroundResource(R.drawable.fut_iv_m_nor);
                FUT093ColorFragment localFUT093ColorFragment5 = FUT093ColorFragment.this;
                localFUT093ColorFragment5.longKeyMode = (0xFFFFFFBF & localFUT093ColorFragment5.longKeyMode);
              }
              else if (paramAnonymousView == FUT093ColorFragment.this.btn_m3)
              {
                paramAnonymousView.setBackgroundResource(R.drawable.fut_iv_m_nor);
                FUT093ColorFragment localFUT093ColorFragment4 = FUT093ColorFragment.this;
                localFUT093ColorFragment4.longKeyMode = (0xFFFFFF7F & localFUT093ColorFragment4.longKeyMode);
              }
            }
          }
        }
      }
    }
  };
  private Circular pressData;
  private int relativeAngle;
  private int runAngle;
  private int[] saveColor = new int[5];
  private int[] saveseekBar = new int[5];
  private SeekBar sb_light;
  private int sb_lightData;
  private boolean sb_lightFlag;
  private ImageView scal_imageview;
  private boolean sendColorFlag = false;
  private TextView tvBrightness;
  private TextView tvKelvin;

  public FUT093ColorFragment()
  {
  }

  private Circular CircularData(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f = (float)Math.sqrt(Math.abs(paramInt1 - paramInt3) * Math.abs(paramInt1 - paramInt3) + Math.abs(paramInt2 - paramInt3) * Math.abs(paramInt2 - paramInt3));
    int i = paramInt1 - paramInt3;
    int j = 0;
    if (i > 0)
    {
      int k = paramInt2 - paramInt3;
      j = 0;
      if (k > 0)
      {
        j = (int)(90.0D + 90.0D * paramInt2 - paramInt3 / f);
        if (f > paramInt3 - paramInt4)
        {
          paramInt1 = paramInt3 + (int)(1.0D * paramInt3 - paramInt4 * paramInt1 - paramInt3 / f);
          paramInt2 = paramInt3 + (int)(1.0D * paramInt3 - paramInt4 * paramInt2 - paramInt3 / f);
        }
      }
    }
    if ((paramInt1 - paramInt3 < 0) && (paramInt2 - paramInt3 < 0))
    {
      j = (int)(270.0D + 90.0D * Math.abs(paramInt2 - paramInt3) / f);
      if (f > paramInt3 - paramInt4)
      {
        paramInt1 = paramInt3 - (int)(1.0D * paramInt3 - paramInt4 * Math.abs(paramInt1 - paramInt3) / f);
        paramInt2 = paramInt3 - (int)(1.0D * paramInt3 - paramInt4 * Math.abs(paramInt2 - paramInt3) / f);
      }
    }
    if ((paramInt1 - paramInt3 > 0) && (paramInt2 - paramInt3 < 0))
    {
      j = (int)(90.0D * Math.abs(paramInt1 - paramInt3) / f);
      if (f > paramInt3 - paramInt4)
      {
        paramInt1 = paramInt3 + (int)(1.0D * paramInt3 - paramInt4 * Math.abs(paramInt1 - paramInt3) / f);
        paramInt2 = paramInt3 - (int)(1.0D * paramInt3 - paramInt4 * Math.abs(paramInt2 - paramInt3) / f);
      }
    }
    if ((paramInt1 - paramInt3 < 0) && (paramInt2 - paramInt3 > 0))
    {
      j = (int)(180.0D + 90.0D * Math.abs(paramInt1 - paramInt3) / f);
      if (f > paramInt3 - paramInt4)
      {
        paramInt1 = paramInt3 - (int)(1.0D * paramInt3 - paramInt4 * Math.abs(paramInt1 - paramInt3) / f);
        paramInt2 = paramInt3 + (int)(1.0D * paramInt3 - paramInt4 * Math.abs(paramInt2 - paramInt3) / f);
      }
    }
    if ((paramInt2 - paramInt3 == 0) && (paramInt1 - paramInt3 > 0))
      j = 90;
    if ((paramInt2 - paramInt3 == 0) && (paramInt1 - paramInt3 < 0))
      j = 270;
    if ((paramInt1 - paramInt3 == 0) && (paramInt2 - paramInt3 < 0))
      j = 360;
    if ((paramInt1 - paramInt3 == 0) && (paramInt2 - paramInt3 > 0))
      j = 180;
    Circular localCircular = new Circular();
    localCircular.x = paramInt1;
    localCircular.y = paramInt2;
    localCircular.angle = j;
    localCircular.distance = (int)f;
    return localCircular;
  }

  private int getColor(int paramInt)
  {
    return 0xFFFFFF00 | 0xFF & (int)(2.55D * paramInt);
  }

  private void setSeekBarProgressDrawable(int paramInt, SeekBar paramSeekBar)
  {
    Drawable localDrawable = paramSeekBar.getProgressDrawable();
    if (!(localDrawable instanceof GradientDrawable));
    for (GradientDrawable localGradientDrawable = new GradientDrawable(); ; localGradientDrawable = (GradientDrawable)localDrawable)
    {
      int i = getResources().getDimensionPixelSize(R.dimen.dp20);
      localGradientDrawable.setColors(new int[] { paramInt, -1 });
      localGradientDrawable.setGradientType(0);
      localGradientDrawable.setShape(0);
      localGradientDrawable.setCornerRadius(i);
      localGradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
      paramSeekBar.setProgressDrawable(localGradientDrawable);
      return;
    }
  }

  private void turnDegree(int paramInt)
  {
    Bitmap localBitmap = rotateBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.fut091_k_bg), paramInt);
    this.scal_imageview.setImageBitmap(localBitmap);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut093_color, null);
    this.ivAddColor = ((ImageView)localView.findViewById(R.id.iv_add));
    this.btnOn = ((Button)localView.findViewById(R.id.btn_on));
    this.btnOff = ((Button)localView.findViewById(R.id.btn_off));
    this.ivAddColor.setOnClickListener(this.clickListener);
    this.btnOn.setOnTouchListener(this.ontouchListener);
    this.btnOff.setOnTouchListener(this.ontouchListener);
    this.iv_book = ((ImageView)localView.findViewById(R.id.iv_book));
    this.iv_coffee = ((ImageView)localView.findViewById(R.id.iv_coffee));
    this.iv_sunset = ((ImageView)localView.findViewById(R.id.iv_sunset));
    this.btn_m1 = ((Button)localView.findViewById(R.id.btn_m1));
    this.btn_m2 = ((Button)localView.findViewById(R.id.btn_m2));
    this.btn_m3 = ((Button)localView.findViewById(R.id.btn_m3));
    this.iv_book.setOnTouchListener(this.ontouchListener);
    this.iv_coffee.setOnTouchListener(this.ontouchListener);
    this.iv_sunset.setOnTouchListener(this.ontouchListener);
    this.btn_m1.setOnTouchListener(this.ontouchListener);
    this.btn_m2.setOnTouchListener(this.ontouchListener);
    this.btn_m3.setOnTouchListener(this.ontouchListener);
    this.bg_scal = localView.findViewById(R.id.bg_scal);
    this.bg_scal.setOnTouchListener(this.ontouchListener);
    this.scal_imageview = ((ImageView)localView.findViewById(R.id.scal_imageview));
    this.tvKelvin = ((TextView)localView.findViewById(R.id.txt_kelvin));
    this.tvBrightness = ((TextView)localView.findViewById(R.id.txt_brightness));
    int i = (int)(2700.0D + 38.0D * this.sb_lightData);
    this.tvKelvin.setText("Kelvin:" + i + "K");
    this.tvBrightness.setText("Brightness:");
    this.sb_light = ((SeekBar)localView.findViewById(R.id.sb_light));
    setSeekBarProgressDrawable(-256, this.sb_light);
    this.sb_light.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        Log.d("debug", "progress =" + paramAnonymousInt);
        if (FUT093ColorFragment.this.sb_lightData != paramAnonymousInt)
        {
          FUT093ColorFragment.this.sb_lightData = paramAnonymousInt;
          int i = (int)(2700.0D + 38.0D * FUT093ColorFragment.this.sb_lightData);
          FUT093ColorFragment.this.tvKelvin.setText("Kelvin:" + i + "K");
          if (!FUT093ColorFragment.this.sb_lightFlag)
          {
            FUT093ColorFragment.this.sb_lightFlag = true;
            FUT093ColorFragment.this.myHandler.removeMessages(4355);
            FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if (FUT093ColorFragment.this.sb_lightData != FUT093ColorFragment.this.sb_light.getProgress())
        {
          FUT093ColorFragment.this.sb_lightData = FUT093ColorFragment.this.sb_light.getProgress();
          int i = (int)(2700.0D + 38.0D * FUT093ColorFragment.this.sb_lightData);
          FUT093ColorFragment.this.tvKelvin.setText("Kelvin:" + i + "K");
          FUT093ColorFragment.this.myHandler.removeMessages(4355);
          FUT093ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
        }
      }
    });
    this.colorPickerUtil = new ColorPicker(getActivity(), localView);
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(MyApp.rain_remoteID);
    Log.d("debug", "decimalFormat = " + localDecimalFormat.format(MyApp.rain_remoteID));
    Log.d("debug", "macid = " + str);
    if (MyApp.deviceService.wifiLight_isDeviceExists(str))
    {
      Log.d("debug", "tab1 database ture");
      new wifi_light();
      wifi_light localwifi_light = MyApp.deviceService.tab1_getMyDevice(str);
      Log.d("debug", "tab1_device" + localwifi_light.toString());
      this.saveColor[0] = Integer.parseInt(localwifi_light.wifilight_ang1);
      this.saveColor[1] = Integer.parseInt(localwifi_light.wifilight_ang2);
      this.saveColor[2] = Integer.parseInt(localwifi_light.wifilight_ang3);
      this.saveColor[3] = Integer.parseInt(localwifi_light.wifilight_ang4);
      this.saveColor[4] = Integer.parseInt(localwifi_light.wifilight_ang5);
      this.saveseekBar[0] = Integer.parseInt(localwifi_light.wifilight_b1);
      this.saveseekBar[1] = Integer.parseInt(localwifi_light.wifilight_b2);
      this.saveseekBar[2] = Integer.parseInt(localwifi_light.wifilight_b3);
      this.saveseekBar[3] = Integer.parseInt(localwifi_light.wifilight_b4);
      this.saveseekBar[4] = Integer.parseInt(localwifi_light.wifilight_b5);
    }
    for (int j = 0; ; j++)
    {
      if (j >= 5)
      {
        MyApp.rain_remo = 1;
        return localView;
      }
      Log.d("debug", "saveseekBar[" + j + "]" + " = " + this.saveseekBar[j]);
      if (this.saveseekBar[j] > 0)
      {
        int k = getColor(this.saveseekBar[j]);
        this.colorPickerUtil.SetColorCir(k, j);
      }
    }
  }

  public Bitmap rotateBitmap(Bitmap paramBitmap, int paramInt)
  {
    if ((paramInt == 0) || (paramBitmap == null))
      return paramBitmap;
    Matrix localMatrix = new Matrix();
    localMatrix.setRotate(paramInt, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawBitmap(paramBitmap, localMatrix, null);
    localCanvas.save(31);
    localCanvas.restore();
    return localBitmap;
  }

  class Circular
  {
    int angle;
    int distance;
    int x;
    int y;

    Circular()
    {
    }
  }

  private class ColorPicker
  {
    private View.OnClickListener clickListener = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        byte[] arrayOfByte = new byte[12];
        if ((paramAnonymousView == FUT093ColorFragment.ColorPicker.this.ivPoint1) && (FUT093ColorFragment.ColorPicker.this.ivPoint1.getDrawable() != null) && ((FUT093ColorFragment.ColorPicker.this.ivPoint1.getDrawable() instanceof GradientDrawable)))
        {
          MyApp.PlalyKeySound();
          arrayOfByte[0] = 63;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 0;
          arrayOfByte[5] = (byte)FUT093ColorFragment.this.saveColor[0];
          arrayOfByte[6] = (byte)FUT093ColorFragment.this.saveseekBar[0];
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = 1;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          FUT093ColorFragment.this.sb_lightData = FUT093ColorFragment.this.saveseekBar[0];
          FUT093ColorFragment.this.sb_light.setProgress(FUT093ColorFragment.this.sb_lightData);
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT093ColorFragment.this.tvBrightness.setText("Brightness:" + FUT093ColorFragment.this.LightColor);
          int n = (int)(2700.0D + 38.0D * 0xFF & FUT093ColorFragment.this.saveColor[0]);
          FUT093ColorFragment.this.tvKelvin.setText("Kelvin:" + n + "K");
        }
        do
        {
          return;
          if ((paramAnonymousView == FUT093ColorFragment.ColorPicker.this.ivPoint2) && (FUT093ColorFragment.ColorPicker.this.ivPoint2.getDrawable() != null) && ((FUT093ColorFragment.ColorPicker.this.ivPoint2.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 0;
            arrayOfByte[5] = (byte)FUT093ColorFragment.this.saveColor[1];
            arrayOfByte[6] = (byte)FUT093ColorFragment.this.saveseekBar[1];
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = 1;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            FUT093ColorFragment.this.sb_lightData = FUT093ColorFragment.this.saveseekBar[1];
            FUT093ColorFragment.this.sb_light.setProgress(FUT093ColorFragment.this.sb_lightData);
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT093ColorFragment.this.tvBrightness.setText("Brightness:" + FUT093ColorFragment.this.LightColor);
            int m = (int)(2700.0D + 38.0D * 0xFF & FUT093ColorFragment.this.saveColor[1]);
            FUT093ColorFragment.this.tvKelvin.setText("Kelvin:" + m + "K");
            return;
          }
          if ((paramAnonymousView == FUT093ColorFragment.ColorPicker.this.ivPoint3) && (FUT093ColorFragment.ColorPicker.this.ivPoint3.getDrawable() != null) && ((FUT093ColorFragment.ColorPicker.this.ivPoint3.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 0;
            arrayOfByte[5] = (byte)FUT093ColorFragment.this.saveColor[2];
            arrayOfByte[6] = (byte)FUT093ColorFragment.this.saveseekBar[2];
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = 1;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            FUT093ColorFragment.this.sb_lightData = FUT093ColorFragment.this.saveseekBar[2];
            FUT093ColorFragment.this.sb_light.setProgress(FUT093ColorFragment.this.sb_lightData);
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT093ColorFragment.this.tvBrightness.setText("Brightness:" + FUT093ColorFragment.this.LightColor);
            int k = (int)(2700.0D + 38.0D * 0xFF & FUT093ColorFragment.this.saveColor[2]);
            FUT093ColorFragment.this.tvKelvin.setText("Kelvin:" + k + "K");
            return;
          }
          if ((paramAnonymousView == FUT093ColorFragment.ColorPicker.this.ivPoint4) && (FUT093ColorFragment.ColorPicker.this.ivPoint4.getDrawable() != null) && ((FUT093ColorFragment.ColorPicker.this.ivPoint4.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 0;
            arrayOfByte[5] = (byte)FUT093ColorFragment.this.saveColor[3];
            arrayOfByte[6] = (byte)FUT093ColorFragment.this.saveseekBar[3];
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = 1;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            FUT093ColorFragment.this.sb_lightData = FUT093ColorFragment.this.saveseekBar[3];
            FUT093ColorFragment.this.sb_light.setProgress(FUT093ColorFragment.this.sb_lightData);
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT093ColorFragment.this.tvBrightness.setText("Brightness:" + FUT093ColorFragment.this.LightColor);
            int j = (int)(2700.0D + 38.0D * 0xFF & FUT093ColorFragment.this.saveColor[3]);
            FUT093ColorFragment.this.tvKelvin.setText("Kelvin:" + j + "K");
            return;
          }
        }
        while ((paramAnonymousView != FUT093ColorFragment.ColorPicker.this.ivPoint5) || (FUT093ColorFragment.ColorPicker.this.ivPoint5.getDrawable() == null) || (!(FUT093ColorFragment.ColorPicker.this.ivPoint5.getDrawable() instanceof GradientDrawable)));
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = (byte)FUT093ColorFragment.this.saveColor[4];
        arrayOfByte[6] = (byte)FUT093ColorFragment.this.saveseekBar[4];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        FUT093ColorFragment.this.sb_lightData = FUT093ColorFragment.this.saveseekBar[4];
        FUT093ColorFragment.this.sb_light.setProgress(FUT093ColorFragment.this.sb_lightData);
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT093ColorFragment.this.tvBrightness.setText("Brightness:" + FUT093ColorFragment.this.LightColor);
        int i = (int)(2700.0D + 38.0D * 0xFF & FUT093ColorFragment.this.saveColor[4]);
        FUT093ColorFragment.this.tvKelvin.setText("Kelvin:" + i + "K");
      }
    };
    private Context context;
    private LayoutInflater inflater;
    private ImageView ivPoint1;
    private ImageView ivPoint2;
    private ImageView ivPoint3;
    private ImageView ivPoint4;
    private ImageView ivPoint5;
    private View.OnLongClickListener longClickListener = new View.OnLongClickListener()
    {
      public boolean onLongClick(View paramAnonymousView)
      {
        if (paramAnonymousView == FUT093ColorFragment.ColorPicker.this.ivPoint1)
          FUT093ColorFragment.ColorPicker.this.showDelPop(FUT093ColorFragment.ColorPicker.this.ivPoint1);
        while (true)
        {
          return true;
          if (paramAnonymousView == FUT093ColorFragment.ColorPicker.this.ivPoint2)
            FUT093ColorFragment.ColorPicker.this.showDelPop(FUT093ColorFragment.ColorPicker.this.ivPoint2);
          else if (paramAnonymousView == FUT093ColorFragment.ColorPicker.this.ivPoint3)
            FUT093ColorFragment.ColorPicker.this.showDelPop(FUT093ColorFragment.ColorPicker.this.ivPoint3);
          else if (paramAnonymousView == FUT093ColorFragment.ColorPicker.this.ivPoint4)
            FUT093ColorFragment.ColorPicker.this.showDelPop(FUT093ColorFragment.ColorPicker.this.ivPoint4);
          else if (paramAnonymousView == FUT093ColorFragment.ColorPicker.this.ivPoint5)
            FUT093ColorFragment.ColorPicker.this.showDelPop(FUT093ColorFragment.ColorPicker.this.ivPoint5);
        }
      }
    };

    public ColorPicker(Context paramView, View arg3)
    {
      this.context = paramView;
      this.inflater = LayoutInflater.from(paramView);
      Object localObject;
      this.ivPoint1 = ((ImageView)localObject.findViewById(R.id.iv_point1));
      this.ivPoint2 = ((ImageView)localObject.findViewById(R.id.iv_point2));
      this.ivPoint3 = ((ImageView)localObject.findViewById(R.id.iv_point3));
      this.ivPoint4 = ((ImageView)localObject.findViewById(R.id.iv_point4));
      this.ivPoint5 = ((ImageView)localObject.findViewById(R.id.iv_point5));
      this.ivPoint1.setOnLongClickListener(this.longClickListener);
      this.ivPoint2.setOnLongClickListener(this.longClickListener);
      this.ivPoint3.setOnLongClickListener(this.longClickListener);
      this.ivPoint4.setOnLongClickListener(this.longClickListener);
      this.ivPoint5.setOnLongClickListener(this.longClickListener);
      this.ivPoint1.setOnClickListener(this.clickListener);
      this.ivPoint2.setOnClickListener(this.clickListener);
      this.ivPoint3.setOnClickListener(this.clickListener);
      this.ivPoint4.setOnClickListener(this.clickListener);
      this.ivPoint5.setOnClickListener(this.clickListener);
    }

    public void SetColorCir(int paramInt1, int paramInt2)
    {
      ImageView[] arrayOfImageView = new ImageView[5];
      arrayOfImageView[0] = this.ivPoint1;
      arrayOfImageView[1] = this.ivPoint2;
      arrayOfImageView[2] = this.ivPoint3;
      arrayOfImageView[3] = this.ivPoint4;
      arrayOfImageView[4] = this.ivPoint5;
      ImageView localImageView = arrayOfImageView[paramInt2];
      GradientDrawable localGradientDrawable = new GradientDrawable();
      localGradientDrawable.setColor(paramInt1);
      localGradientDrawable.setCornerRadius(this.context.getResources().getDimension(R.dimen.color_point_radius));
      localImageView.setImageDrawable(localGradientDrawable);
    }

    public void addColorPoint(int paramInt)
    {
      wifi_light localwifi_light = new wifi_light();
      DecimalFormat localDecimalFormat = new DecimalFormat("00");
      String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(MyApp.rain_remoteID);
      ImageView[] arrayOfImageView;
      int i;
      label127: int k;
      ImageView localImageView;
      if (MyApp.deviceService.wifiLight_isDeviceExists(str))
      {
        Log.d("debug", "tab1 database ture");
        localwifi_light = MyApp.deviceService.tab1_getMyDevice(str);
        arrayOfImageView = new ImageView[5];
        arrayOfImageView[0] = this.ivPoint1;
        arrayOfImageView[1] = this.ivPoint2;
        arrayOfImageView[2] = this.ivPoint3;
        arrayOfImageView[3] = this.ivPoint4;
        arrayOfImageView[4] = this.ivPoint5;
        i = 0;
        int j = arrayOfImageView.length;
        k = 0;
        localImageView = null;
        if (i < j)
          break label399;
        label145: if (localImageView != null)
        {
          GradientDrawable localGradientDrawable = new GradientDrawable();
          localGradientDrawable.setColor(paramInt);
          localGradientDrawable.setCornerRadius(this.context.getResources().getDimension(R.dimen.color_point_radius));
          localImageView.setImageDrawable(localGradientDrawable);
          FUT093ColorFragment.this.saveColor[k] = FUT093ColorFragment.this.LightColor;
          FUT093ColorFragment.this.saveseekBar[k] = FUT093ColorFragment.this.sb_lightData;
          if (k != 0)
            break label442;
          localwifi_light.wifilight_ang1 = FUT093ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b1 = FUT093ColorFragment.this.saveseekBar[k];
        }
      }
      while (true)
      {
        MyApp.deviceService.wifiLight_edit(localwifi_light);
        return;
        localwifi_light.mac = str;
        localwifi_light.wifilight_ang1 = "0";
        localwifi_light.wifilight_ang2 = "0";
        localwifi_light.wifilight_ang3 = "0";
        localwifi_light.wifilight_ang4 = "0";
        localwifi_light.wifilight_ang5 = "0";
        localwifi_light.wifilight_b1 = "0";
        localwifi_light.wifilight_b2 = "0";
        localwifi_light.wifilight_b3 = "0";
        localwifi_light.wifilight_b4 = "0";
        localwifi_light.wifilight_b5 = "0";
        MyApp.deviceService.wifiLight_addDevice(localwifi_light);
        Log.d("debug", "tab1 database false");
        Log.d("debug", "tab1_device" + localwifi_light.toString());
        break;
        label399: Drawable localDrawable = arrayOfImageView[i].getDrawable();
        if ((localDrawable == null) || (!(localDrawable instanceof GradientDrawable)))
        {
          localImageView = arrayOfImageView[i];
          k = i;
          break label145;
        }
        i++;
        break label127;
        label442: if (k == 1)
        {
          localwifi_light.wifilight_ang2 = FUT093ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b2 = FUT093ColorFragment.this.saveseekBar[k];
        }
        else if (k == 2)
        {
          localwifi_light.wifilight_ang3 = FUT093ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b3 = FUT093ColorFragment.this.saveseekBar[k];
        }
        else if (k == 3)
        {
          localwifi_light.wifilight_ang4 = FUT093ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b4 = FUT093ColorFragment.this.saveseekBar[k];
        }
        else if (k == 4)
        {
          localwifi_light.wifilight_ang5 = FUT093ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b5 = FUT093ColorFragment.this.saveseekBar[k];
        }
      }
    }

    public void showDelPop(final ImageView paramImageView)
    {
      Drawable localDrawable = paramImageView.getDrawable();
      if ((localDrawable == null) || (!(localDrawable instanceof GradientDrawable)))
        return;
      View localView = this.inflater.inflate(R.layout.pop_del, null);
      final PopupWindow localPopupWindow = new PopupWindow(localView, -2, -2, true);
      localView.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          DecimalFormat localDecimalFormat = new DecimalFormat("00");
          String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(MyApp.rain_remoteID);
          wifi_light localwifi_light;
          if (MyApp.deviceService.wifiLight_isDeviceExists(str))
          {
            new wifi_light();
            localwifi_light = MyApp.deviceService.tab1_getMyDevice(str);
            if (paramImageView != FUT093ColorFragment.ColorPicker.this.ivPoint1)
              break label121;
            localwifi_light.wifilight_ang1 = "0";
            localwifi_light.wifilight_b1 = "0";
          }
          while (true)
          {
            MyApp.deviceService.wifiLight_edit(localwifi_light);
            paramImageView.setImageResource(R.drawable.transparent);
            localPopupWindow.dismiss();
            return;
            label121: if (paramImageView == FUT093ColorFragment.ColorPicker.this.ivPoint2)
            {
              localwifi_light.wifilight_ang2 = "0";
              localwifi_light.wifilight_b2 = "0";
            }
            else if (paramImageView == FUT093ColorFragment.ColorPicker.this.ivPoint3)
            {
              FUT093ColorFragment.ColorPicker.this.showDelPop(FUT093ColorFragment.ColorPicker.this.ivPoint3);
              localwifi_light.wifilight_ang3 = "0";
              localwifi_light.wifilight_b3 = "0";
            }
            else if (paramImageView == FUT093ColorFragment.ColorPicker.this.ivPoint4)
            {
              localwifi_light.wifilight_ang4 = "0";
              localwifi_light.wifilight_b4 = "0";
            }
            else if (paramImageView == FUT093ColorFragment.ColorPicker.this.ivPoint5)
            {
              localwifi_light.wifilight_ang5 = "0";
              localwifi_light.wifilight_b5 = "0";
            }
          }
        }
      });
      localPopupWindow.setBackgroundDrawable(this.context.getResources().getDrawable(R.drawable.transparent));
      int[] arrayOfInt = new int[2];
      paramImageView.getLocationOnScreen(arrayOfInt);
      ActivityUtil.measureView(localView);
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      localPopupWindow.showAtLocation(paramImageView, 0, arrayOfInt[0] - i / 2 + paramImageView.getWidth() / 2, arrayOfInt[1] - j);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT093ColorFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */