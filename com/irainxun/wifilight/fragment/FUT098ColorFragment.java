package com.irainxun.wifilight.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.Circular;
import com.irainxun.wifilight.xlink.MyApp;

public class FUT098ColorFragment extends Fragment
{
  private static final int buttonKeyEvent = 4353;
  private static final int cirleEvent = 4354;
  private static final int cirleSend = 4356;
  private static final int cirleSendData = 160;
  private static final int cirleTime = 40;
  private static final int delayLongTime = 400;
  private static final int delayTime = 200;
  private static final int processEvent = 4355;
  private int CircularColor = 0;
  private byte[] CirlByte = new byte[4];
  private byte CirlgetData = 0;
  private int ColorData = 185;
  private int SendColorData = 0;
  private final String TAG = getClass().getSimpleName();
  private boolean beepFlag = false;
  private int beepdata = 0;
  private Button btnOff;
  private Button btnOn;
  private boolean cirleSendDataFlag = false;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      MyApp.PlalyKeySound();
      if (paramAnonymousView == FUT098ColorFragment.this.tvColor)
      {
        byte[] arrayOfByte = new byte[12];
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 2;
        arrayOfByte[5] = 7;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT098ColorFragment.this.tvColor.setTextColor(-1);
      }
    }
  };
  private int colorBoder;
  private View colorHandler;
  private View colorView;
  private int curColor;
  private TextView disp_color;
  private ImageView ivD1;
  private ImageView ivD2;
  private ImageView ivD3;
  private TextView ivU1;
  private TextView ivU2;
  private TextView ivU3;
  private int longKeyMode;
  Handler myHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      byte[] arrayOfByte = new byte[12];
      switch (paramAnonymousMessage.what)
      {
      default:
      case 4354:
      case 4356:
      case 4353:
      case 4355:
      case 1024:
      }
      while (true)
      {
        super.handleMessage(paramAnonymousMessage);
        return;
        FUT098ColorFragment.this.sendColorFlag = false;
        FUT098ColorFragment.this.CirlByte[FUT098ColorFragment.this.CirlgetData] = (byte)FUT098ColorFragment.this.SendColorData;
        if (FUT098ColorFragment.this.CirlgetData < 4)
        {
          FUT098ColorFragment localFUT098ColorFragment2 = FUT098ColorFragment.this;
          localFUT098ColorFragment2.CirlgetData = (byte)(1 + localFUT098ColorFragment2.CirlgetData);
        }
        Log.d("debug", "CirlgetData = " + FUT098ColorFragment.this.CirlgetData);
        continue;
        FUT098ColorFragment.this.cirleSendDataFlag = false;
        while (true)
        {
          if (FUT098ColorFragment.this.CirlgetData >= 4)
          {
            FUT098ColorFragment.this.CirlByte[3] = (byte)FUT098ColorFragment.this.SendColorData;
            FUT098ColorFragment.this.CirlgetData = 0;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = (byte)(FUT098ColorFragment.this.ColorData - (0xFF & FUT098ColorFragment.this.CirlByte[0]));
            arrayOfByte[6] = (byte)(FUT098ColorFragment.this.ColorData - (0xFF & FUT098ColorFragment.this.CirlByte[1]));
            arrayOfByte[7] = (byte)(FUT098ColorFragment.this.ColorData - (0xFF & FUT098ColorFragment.this.CirlByte[2]));
            arrayOfByte[8] = (byte)(FUT098ColorFragment.this.ColorData - (0xFF & FUT098ColorFragment.this.CirlByte[3]));
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            Log.d("debug", "send cirl data");
            break;
          }
          FUT098ColorFragment.this.CirlByte[FUT098ColorFragment.this.CirlgetData] = (byte)FUT098ColorFragment.this.SendColorData;
          FUT098ColorFragment localFUT098ColorFragment1 = FUT098ColorFragment.this;
          localFUT098ColorFragment1.CirlgetData = (byte)(1 + localFUT098ColorFragment1.CirlgetData);
        }
        if ((0x2 & FUT098ColorFragment.this.longKeyMode) == 2)
        {
          Log.d("debug", "long key Night light");
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
          FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x4 & FUT098ColorFragment.this.longKeyMode) == 4)
        {
          Log.d("debug", "long key tvOn");
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -126;
          arrayOfByte[5] = 9;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x8 & FUT098ColorFragment.this.longKeyMode) == 8)
        {
          Log.d("debug", "long key tvOff");
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = -126;
          arrayOfByte[5] = 10;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          continue;
          if ((0x1 & FUT098ColorFragment.this.wKeyMode) == 1)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -126;
            arrayOfByte[5] = 1;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
          }
          else if ((0x2 & FUT098ColorFragment.this.wKeyMode) == 2)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -126;
            arrayOfByte[5] = 3;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
          }
          else if ((0x4 & FUT098ColorFragment.this.wKeyMode) == 4)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -126;
            arrayOfByte[5] = 5;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
          }
          else if ((0x8 & FUT098ColorFragment.this.wKeyMode) == 8)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -126;
            arrayOfByte[5] = 2;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
          }
          else if ((0x10 & FUT098ColorFragment.this.wKeyMode) == 16)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -126;
            arrayOfByte[5] = 4;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
          }
          else if ((0x20 & FUT098ColorFragment.this.wKeyMode) == 32)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -126;
            arrayOfByte[5] = 6;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
            continue;
            FUT098ColorFragment.this.beepFlag = false;
            if (FUT098ColorFragment.this.beepdata != FUT098ColorFragment.this.CircularColor)
            {
              FUT098ColorFragment.this.beepdata = FUT098ColorFragment.this.CircularColor;
              MyApp.PlalyKeySound();
            }
          }
        }
      }
    }
  };
  private View.OnTouchListener ontouchlistener = new View.OnTouchListener()
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
                if (paramAnonymousView == FUT098ColorFragment.this.btnOn)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.ic_btn_on_press);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 2;
                  arrayOfByte[5] = 9;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT098ColorFragment localFUT098ColorFragment17 = FUT098ColorFragment.this;
                  localFUT098ColorFragment17.longKeyMode = (0x4 | localFUT098ColorFragment17.longKeyMode);
                  FUT098ColorFragment.this.myHandler.removeMessages(4353);
                  FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT098ColorFragment.this.btnOff)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.ic_btn_off_press);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 2;
                  arrayOfByte[5] = 10;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT098ColorFragment localFUT098ColorFragment16 = FUT098ColorFragment.this;
                  localFUT098ColorFragment16.longKeyMode = (0x8 | localFUT098ColorFragment16.longKeyMode);
                  FUT098ColorFragment.this.myHandler.removeMessages(4353);
                  FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT098ColorFragment.this.colorView)
                {
                  FUT098ColorFragment.this.sendColorFlag = false;
                  FUT098ColorFragment.this.cirleSendDataFlag = false;
                  FUT098ColorFragment.this.CirlgetData = 0;
                  FUT098ColorFragment.this.updateViewLocation(i, j);
                  FUT098ColorFragment.this.CirlByte[0] = (byte)FUT098ColorFragment.this.SendColorData;
                  FUT098ColorFragment.this.CirlByte[1] = (byte)FUT098ColorFragment.this.SendColorData;
                  FUT098ColorFragment.this.CirlByte[2] = (byte)FUT098ColorFragment.this.SendColorData;
                  FUT098ColorFragment.this.CirlByte[3] = (byte)FUT098ColorFragment.this.SendColorData;
                  return true;
                }
                if (paramAnonymousView == FUT098ColorFragment.this.ivU1)
                {
                  FUT098ColorFragment.this.ivU1.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_bn_press, 0, 0);
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
                  FUT098ColorFragment localFUT098ColorFragment15 = FUT098ColorFragment.this;
                  localFUT098ColorFragment15.wKeyMode = (0x1 | localFUT098ColorFragment15.wKeyMode);
                  FUT098ColorFragment.this.myHandler.removeMessages(4355);
                  FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT098ColorFragment.this.ivU2)
                {
                  FUT098ColorFragment.this.ivU2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_si_press, 0, 0);
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
                  FUT098ColorFragment localFUT098ColorFragment14 = FUT098ColorFragment.this;
                  localFUT098ColorFragment14.wKeyMode = (0x2 | localFUT098ColorFragment14.wKeyMode);
                  FUT098ColorFragment.this.myHandler.removeMessages(4355);
                  FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT098ColorFragment.this.ivU3)
                {
                  FUT098ColorFragment.this.ivU3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_mu_press, 0, 0);
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
                  FUT098ColorFragment localFUT098ColorFragment13 = FUT098ColorFragment.this;
                  localFUT098ColorFragment13.wKeyMode = (0x4 | localFUT098ColorFragment13.wKeyMode);
                  FUT098ColorFragment.this.myHandler.removeMessages(4355);
                  FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT098ColorFragment.this.ivD1)
                {
                  FUT098ColorFragment.this.ivD1.setImageResource(R.drawable.btn_light1_press);
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
                  FUT098ColorFragment localFUT098ColorFragment12 = FUT098ColorFragment.this;
                  localFUT098ColorFragment12.wKeyMode = (0x8 | localFUT098ColorFragment12.wKeyMode);
                  FUT098ColorFragment.this.myHandler.removeMessages(4355);
                  FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT098ColorFragment.this.ivD2)
                {
                  FUT098ColorFragment.this.ivD2.setImageResource(R.drawable.fut098_sd_press);
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
                  FUT098ColorFragment localFUT098ColorFragment11 = FUT098ColorFragment.this;
                  localFUT098ColorFragment11.wKeyMode = (0x10 | localFUT098ColorFragment11.wKeyMode);
                  FUT098ColorFragment.this.myHandler.removeMessages(4355);
                  FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 400L);
                  return true;
                }
              }
              while (paramAnonymousView != FUT098ColorFragment.this.ivD3);
              FUT098ColorFragment.this.ivD3.setImageResource(R.drawable.fut098_md_press);
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 2;
              arrayOfByte[5] = 6;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT098ColorFragment localFUT098ColorFragment10 = FUT098ColorFragment.this;
              localFUT098ColorFragment10.wKeyMode = (0x20 | localFUT098ColorFragment10.wKeyMode);
              FUT098ColorFragment.this.myHandler.removeMessages(4355);
              FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 400L);
              return true;
            }
            while (paramAnonymousView != FUT098ColorFragment.this.colorView);
            FUT098ColorFragment.this.updateViewLocation(i, j);
          }
          while (FUT098ColorFragment.this.cirleSendDataFlag);
          FUT098ColorFragment.this.cirleSendDataFlag = true;
          FUT098ColorFragment.this.myHandler.removeMessages(4356);
          FUT098ColorFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
          return true;
          if (paramAnonymousView == FUT098ColorFragment.this.colorView)
            break;
          if (paramAnonymousView == FUT098ColorFragment.this.btnOn)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.ic_btn_on_nor);
            FUT098ColorFragment localFUT098ColorFragment9 = FUT098ColorFragment.this;
            localFUT098ColorFragment9.longKeyMode = (0xFFFFFFFB & localFUT098ColorFragment9.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT098ColorFragment.this.btnOff)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.ic_btn_off_nor);
            FUT098ColorFragment localFUT098ColorFragment8 = FUT098ColorFragment.this;
            localFUT098ColorFragment8.longKeyMode = (0xFFFFFFF7 & localFUT098ColorFragment8.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT098ColorFragment.this.ivU1)
          {
            FUT098ColorFragment.this.ivU1.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_bn_nor, 0, 0);
            FUT098ColorFragment localFUT098ColorFragment7 = FUT098ColorFragment.this;
            localFUT098ColorFragment7.wKeyMode = (0xFFFFFFFE & localFUT098ColorFragment7.wKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT098ColorFragment.this.ivU2)
          {
            FUT098ColorFragment.this.ivU2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_si_nor, 0, 0);
            FUT098ColorFragment localFUT098ColorFragment6 = FUT098ColorFragment.this;
            localFUT098ColorFragment6.wKeyMode = (0xFFFFFFFD & localFUT098ColorFragment6.wKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT098ColorFragment.this.ivU3)
          {
            FUT098ColorFragment.this.ivU3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.fut098_mu_nor, 0, 0);
            FUT098ColorFragment localFUT098ColorFragment5 = FUT098ColorFragment.this;
            localFUT098ColorFragment5.wKeyMode = (0xFFFFFFFB & localFUT098ColorFragment5.wKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT098ColorFragment.this.ivD1)
          {
            FUT098ColorFragment.this.ivD1.setImageResource(R.drawable.btn_light1_nor);
            FUT098ColorFragment localFUT098ColorFragment4 = FUT098ColorFragment.this;
            localFUT098ColorFragment4.wKeyMode = (0xFFFFFFF7 & localFUT098ColorFragment4.wKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT098ColorFragment.this.ivD2)
          {
            FUT098ColorFragment.this.ivD2.setImageResource(R.drawable.fut098_sd_nor);
            FUT098ColorFragment localFUT098ColorFragment3 = FUT098ColorFragment.this;
            localFUT098ColorFragment3.wKeyMode = (0xFFFFFFEF & localFUT098ColorFragment3.wKeyMode);
            return true;
          }
        }
        while (paramAnonymousView != FUT098ColorFragment.this.ivD3);
        FUT098ColorFragment.this.ivD3.setImageResource(R.drawable.fut098_md_nor);
        FUT098ColorFragment localFUT098ColorFragment2 = FUT098ColorFragment.this;
        localFUT098ColorFragment2.wKeyMode = (0xFFFFFFDF & localFUT098ColorFragment2.wKeyMode);
        return true;
      }
      while (paramAnonymousView != FUT098ColorFragment.this.colorView);
      FUT098ColorFragment.this.beepFlag = false;
      FUT098ColorFragment.this.myHandler.removeMessages(4356);
      while (true)
      {
        if (FUT098ColorFragment.this.CirlgetData >= 4)
        {
          FUT098ColorFragment.this.CirlByte[3] = (byte)FUT098ColorFragment.this.SendColorData;
          FUT098ColorFragment.this.CirlgetData = 0;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)(FUT098ColorFragment.this.ColorData - (0xFF & FUT098ColorFragment.this.CirlByte[0]));
          arrayOfByte[6] = (byte)(FUT098ColorFragment.this.ColorData - (0xFF & FUT098ColorFragment.this.CirlByte[1]));
          arrayOfByte[7] = (byte)(FUT098ColorFragment.this.ColorData - (0xFF & FUT098ColorFragment.this.CirlByte[2]));
          arrayOfByte[8] = (byte)(FUT098ColorFragment.this.ColorData - (0xFF & FUT098ColorFragment.this.CirlByte[3]));
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return true;
        }
        FUT098ColorFragment.this.CirlByte[FUT098ColorFragment.this.CirlgetData] = (byte)FUT098ColorFragment.this.SendColorData;
        FUT098ColorFragment localFUT098ColorFragment1 = FUT098ColorFragment.this;
        localFUT098ColorFragment1.CirlgetData = (byte)(1 + localFUT098ColorFragment1.CirlgetData);
      }
    }
  };
  private boolean sendColorFlag = false;
  private TextView tvColor;
  private int wKeyMode;

  public FUT098ColorFragment()
  {
  }

  private int getColor(int paramInt)
  {
    byte[] arrayOfByte = new byte[3];
    int i = (int)(0.7083333333333334D * paramInt);
    if ((i >= 0) && (i < 42))
    {
      arrayOfByte[0] = 0;
      arrayOfByte[1] = (byte)(int)(6.071428571428571D * i);
      arrayOfByte[2] = -1;
    }
    if ((i >= 42) && (i < 84))
    {
      arrayOfByte[0] = 0;
      arrayOfByte[1] = -1;
      arrayOfByte[2] = (byte)(int)(255.0D - 6.071428571428571D * i - 42);
    }
    if ((i >= 84) && (i < 126))
    {
      arrayOfByte[0] = (byte)(int)(6.071428571428571D * i - 84);
      arrayOfByte[1] = -1;
      arrayOfByte[2] = 0;
    }
    if ((i >= 126) && (i < 168))
    {
      arrayOfByte[0] = -1;
      arrayOfByte[1] = (byte)(int)(255.0D - 6.071428571428571D * i - 126);
      arrayOfByte[2] = 0;
    }
    if ((i >= 168) && (i < 210))
    {
      arrayOfByte[0] = -1;
      arrayOfByte[1] = 0;
      arrayOfByte[2] = (byte)(int)(6.071428571428571D * i - 168);
    }
    if ((i >= 210) && (i <= 255))
    {
      arrayOfByte[2] = -1;
      arrayOfByte[1] = 0;
      if (6.071428571428571D * i - 210 <= 255.0D)
        break label265;
      arrayOfByte[0] = 0;
    }
    while (true)
    {
      return 0xFF000000 | (0xFF & arrayOfByte[0]) << 16 | (0xFF & arrayOfByte[1]) << 8 | 0xFF & arrayOfByte[2];
      label265: arrayOfByte[0] = (byte)(int)(255.0D - 6.071428571428571D * i - 210);
    }
  }

  private void updateViewLocation(int paramInt1, int paramInt2)
  {
    int i = this.colorView.getWidth();
    int j = this.colorView.getHeight();
    int k = this.colorHandler.getWidth() / 2;
    if (paramInt1 < k)
      paramInt1 = k;
    int m = i - this.colorHandler.getWidth() / 2;
    if (paramInt1 > m)
      paramInt1 = m;
    int n = this.colorHandler.getWidth() / 2;
    if (paramInt2 < n)
      paramInt2 = n;
    int i1 = j - this.colorHandler.getHeight() / 2;
    if (paramInt2 > i1)
      paramInt2 = i1;
    int i2 = getResources().getDimensionPixelSize(R.dimen.color_inner_r);
    int i3 = i / 2;
    int i4 = this.colorBoder + this.colorHandler.getWidth() / 2;
    Circular localCircular = MyApp.CircularData(paramInt1, paramInt2, i3, i4, i2);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.colorHandler.getLayoutParams();
    localLayoutParams.leftMargin = (localCircular.x - this.colorHandler.getWidth() / 2);
    localLayoutParams.topMargin = (localCircular.y - this.colorHandler.getWidth() / 2);
    this.colorHandler.setLayoutParams(localLayoutParams);
    this.CircularColor = (int)(0.7083333333333334D * localCircular.angle);
    this.disp_color.setText("RGB:" + (0xFF & this.ColorData - this.CircularColor));
    if (!this.beepFlag)
    {
      this.beepFlag = true;
      this.myHandler.removeMessages(1024);
      this.myHandler.sendEmptyMessageDelayed(1024, 80L);
    }
    this.curColor = getColor(localCircular.angle);
    this.SendColorData = (int)(0.7083333333333334D * localCircular.angle);
    Log.d("debug", "angle = " + this.SendColorData);
    if (!this.sendColorFlag)
    {
      this.sendColorFlag = true;
      this.myHandler.removeMessages(4354);
      this.myHandler.sendEmptyMessageDelayed(4354, 40L);
    }
    this.tvColor.setTextColor(this.curColor);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut098_color, null);
    this.ivU1 = ((TextView)localView.findViewById(R.id.iv_u1));
    this.ivU2 = ((TextView)localView.findViewById(R.id.iv_u2));
    this.ivU3 = ((TextView)localView.findViewById(R.id.iv_u3));
    this.ivD1 = ((ImageView)localView.findViewById(R.id.iv_d1));
    this.ivD2 = ((ImageView)localView.findViewById(R.id.iv_d2));
    this.ivD3 = ((ImageView)localView.findViewById(R.id.iv_d3));
    this.btnOn = ((Button)localView.findViewById(R.id.btn_on));
    this.btnOff = ((Button)localView.findViewById(R.id.btn_off));
    this.ivU1.setOnTouchListener(this.ontouchlistener);
    this.ivU2.setOnTouchListener(this.ontouchlistener);
    this.ivU3.setOnTouchListener(this.ontouchlistener);
    this.ivD1.setOnTouchListener(this.ontouchlistener);
    this.ivD2.setOnTouchListener(this.ontouchlistener);
    this.ivD3.setOnTouchListener(this.ontouchlistener);
    this.btnOn.setOnTouchListener(this.ontouchlistener);
    this.btnOff.setOnTouchListener(this.ontouchlistener);
    this.colorView = localView.findViewById(R.id.bg_color);
    this.colorHandler = localView.findViewById(R.id.iv_color_handler);
    this.colorBoder = getResources().getDimensionPixelSize(R.dimen.color_boder);
    this.colorView.setOnTouchListener(this.ontouchlistener);
    this.tvColor = ((TextView)localView.findViewById(R.id.tv_color));
    Typeface localTypeface = Typeface.createFromAsset(getActivity().getAssets(), "font/APARAJB.TTF");
    this.tvColor.setTypeface(localTypeface);
    this.tvColor.setOnClickListener(this.clickListener);
    this.curColor = -65536;
    this.tvColor.setTextColor(this.curColor);
    this.disp_color = ((TextView)localView.findViewById(R.id.disp_color));
    MyApp.rain_remo = 1;
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT098ColorFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */