package com.irainxun.wifilight.fragment;

import android.app.Fragment;
import android.content.res.Resources;
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
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.Circular;
import com.irainxun.wifilight.xlink.MyApp;

public class FUT020ColorFragment extends Fragment
{
  private static final int buttonKeyEvent = 4353;
  private static final int cirleEvent = 4354;
  private static final int cirleSend = 4356;
  private static final int cirleSendData = 160;
  private static final int cirleTime = 40;
  private static final int delayLongTime = 400;
  private static final int delayTime = 200;
  private int CircularColor = 0;
  private byte[] CirlByte = new byte[4];
  private byte CirlgetData = 0;
  private int ColorData = 185;
  private int SendColorData = 0;
  private final String TAG = getClass().getSimpleName();
  private boolean beepFlag = false;
  private int beepdata = 0;
  private ImageView btn1;
  private ImageView btn2;
  private ImageView btn4;
  private ImageView btn5;
  private ImageView btnPower;
  private boolean cirleSendDataFlag = false;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
    }
  };
  private int colorBoder;
  private View colorHandler;
  private View colorView;
  private int curColor;
  private TextView disp_color;
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
      case 1024:
      }
      while (true)
      {
        super.handleMessage(paramAnonymousMessage);
        return;
        FUT020ColorFragment.this.sendColorFlag = false;
        FUT020ColorFragment.this.CirlByte[FUT020ColorFragment.this.CirlgetData] = (byte)FUT020ColorFragment.this.SendColorData;
        if (FUT020ColorFragment.this.CirlgetData < 4)
        {
          FUT020ColorFragment localFUT020ColorFragment3 = FUT020ColorFragment.this;
          localFUT020ColorFragment3.CirlgetData = (byte)(1 + localFUT020ColorFragment3.CirlgetData);
        }
        Log.d("debug", "CirlgetData = " + FUT020ColorFragment.this.CirlgetData);
        continue;
        FUT020ColorFragment.this.cirleSendDataFlag = false;
        while (true)
        {
          if (FUT020ColorFragment.this.CirlgetData >= 4)
          {
            FUT020ColorFragment.this.CirlByte[3] = (byte)FUT020ColorFragment.this.SendColorData;
            FUT020ColorFragment.this.CirlgetData = 0;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = (byte)(FUT020ColorFragment.this.ColorData - (0xFF & FUT020ColorFragment.this.CirlByte[0]));
            arrayOfByte[6] = (byte)(FUT020ColorFragment.this.ColorData - (0xFF & FUT020ColorFragment.this.CirlByte[1]));
            arrayOfByte[7] = (byte)(FUT020ColorFragment.this.ColorData - (0xFF & FUT020ColorFragment.this.CirlByte[2]));
            arrayOfByte[8] = (byte)(FUT020ColorFragment.this.ColorData - (0xFF & FUT020ColorFragment.this.CirlByte[3]));
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            Log.d("debug", "send cirl data");
            break;
          }
          FUT020ColorFragment.this.CirlByte[FUT020ColorFragment.this.CirlgetData] = (byte)FUT020ColorFragment.this.SendColorData;
          FUT020ColorFragment localFUT020ColorFragment2 = FUT020ColorFragment.this;
          localFUT020ColorFragment2.CirlgetData = (byte)(1 + localFUT020ColorFragment2.CirlgetData);
        }
        if ((0x2 & FUT020ColorFragment.this.longKeyMode) == 2)
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
          FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x4 & FUT020ColorFragment.this.longKeyMode) == 4)
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
          FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x8 & FUT020ColorFragment.this.longKeyMode) == 8)
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
          FUT020ColorFragment localFUT020ColorFragment1 = FUT020ColorFragment.this;
          localFUT020ColorFragment1.longKeyMode = (0x8 | localFUT020ColorFragment1.longKeyMode);
          FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x1 & FUT020ColorFragment.this.longKeyMode) == 1)
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
          FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x10 & FUT020ColorFragment.this.longKeyMode) == 16)
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
          FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          continue;
          FUT020ColorFragment.this.beepFlag = false;
          if (FUT020ColorFragment.this.beepdata != FUT020ColorFragment.this.CircularColor)
          {
            FUT020ColorFragment.this.beepdata = FUT020ColorFragment.this.CircularColor;
            MyApp.PlalyKeySound();
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
                if (paramAnonymousView == FUT020ColorFragment.this.btn1)
                {
                  FUT020ColorFragment.this.btn1.setImageResource(R.drawable.btn_light1_press);
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
                  FUT020ColorFragment localFUT020ColorFragment11 = FUT020ColorFragment.this;
                  localFUT020ColorFragment11.longKeyMode = (0x4 | localFUT020ColorFragment11.longKeyMode);
                  FUT020ColorFragment.this.myHandler.removeMessages(4353);
                  FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT020ColorFragment.this.btn2)
                {
                  FUT020ColorFragment.this.btn2.setImageResource(R.drawable.btn_light2_press);
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
                  FUT020ColorFragment localFUT020ColorFragment10 = FUT020ColorFragment.this;
                  localFUT020ColorFragment10.longKeyMode = (0x8 | localFUT020ColorFragment10.longKeyMode);
                  FUT020ColorFragment.this.myHandler.removeMessages(4353);
                  FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT020ColorFragment.this.btnPower)
                {
                  FUT020ColorFragment.this.btnPower.setImageResource(R.drawable.btn_onoff_press);
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
                  FUT020ColorFragment localFUT020ColorFragment9 = FUT020ColorFragment.this;
                  localFUT020ColorFragment9.longKeyMode = (0x2 | localFUT020ColorFragment9.longKeyMode);
                  FUT020ColorFragment.this.myHandler.removeMessages(4353);
                  FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT020ColorFragment.this.colorView)
                {
                  FUT020ColorFragment.this.sendColorFlag = false;
                  FUT020ColorFragment.this.cirleSendDataFlag = false;
                  FUT020ColorFragment.this.CirlgetData = 0;
                  FUT020ColorFragment.this.updateViewLocation(i, j);
                  FUT020ColorFragment.this.CirlByte[0] = (byte)FUT020ColorFragment.this.SendColorData;
                  FUT020ColorFragment.this.CirlByte[1] = (byte)FUT020ColorFragment.this.SendColorData;
                  FUT020ColorFragment.this.CirlByte[2] = (byte)FUT020ColorFragment.this.SendColorData;
                  FUT020ColorFragment.this.CirlByte[3] = (byte)FUT020ColorFragment.this.SendColorData;
                  return true;
                }
                if (paramAnonymousView == FUT020ColorFragment.this.btn4)
                {
                  FUT020ColorFragment.this.btn4.setImageResource(R.drawable.btn_light3_press);
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
                  FUT020ColorFragment localFUT020ColorFragment8 = FUT020ColorFragment.this;
                  localFUT020ColorFragment8.longKeyMode = (0x1 | localFUT020ColorFragment8.longKeyMode);
                  FUT020ColorFragment.this.myHandler.removeMessages(4353);
                  FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
              }
              while (paramAnonymousView != FUT020ColorFragment.this.btn5);
              FUT020ColorFragment.this.btn5.setImageResource(R.drawable.btn_light4_press);
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
              FUT020ColorFragment localFUT020ColorFragment7 = FUT020ColorFragment.this;
              localFUT020ColorFragment7.longKeyMode = (0x10 | localFUT020ColorFragment7.longKeyMode);
              FUT020ColorFragment.this.myHandler.removeMessages(4353);
              FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
              return true;
            }
            while (paramAnonymousView != FUT020ColorFragment.this.colorView);
            FUT020ColorFragment.this.updateViewLocation(i, j);
          }
          while (FUT020ColorFragment.this.cirleSendDataFlag);
          FUT020ColorFragment.this.cirleSendDataFlag = true;
          FUT020ColorFragment.this.myHandler.removeMessages(4356);
          FUT020ColorFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
          return true;
          if (paramAnonymousView == FUT020ColorFragment.this.colorView)
            break;
          if (paramAnonymousView == FUT020ColorFragment.this.btn1)
          {
            FUT020ColorFragment.this.btn1.setImageResource(R.drawable.btn_light1_nor);
            FUT020ColorFragment localFUT020ColorFragment6 = FUT020ColorFragment.this;
            localFUT020ColorFragment6.longKeyMode = (0xFFFFFFFB & localFUT020ColorFragment6.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT020ColorFragment.this.btn2)
          {
            FUT020ColorFragment.this.btn2.setImageResource(R.drawable.btn_light2_nor);
            FUT020ColorFragment localFUT020ColorFragment5 = FUT020ColorFragment.this;
            localFUT020ColorFragment5.longKeyMode = (0xFFFFFFF7 & localFUT020ColorFragment5.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT020ColorFragment.this.btnPower)
          {
            FUT020ColorFragment.this.btnPower.setImageResource(R.drawable.btn_onoff_nor);
            FUT020ColorFragment localFUT020ColorFragment4 = FUT020ColorFragment.this;
            localFUT020ColorFragment4.longKeyMode = (0xFFFFFFFD & localFUT020ColorFragment4.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT020ColorFragment.this.btn4)
          {
            FUT020ColorFragment.this.btn4.setImageResource(R.drawable.btn_light3_nor);
            FUT020ColorFragment localFUT020ColorFragment3 = FUT020ColorFragment.this;
            localFUT020ColorFragment3.longKeyMode = (0xFFFFFFFE & localFUT020ColorFragment3.longKeyMode);
            return true;
          }
        }
        while (paramAnonymousView != FUT020ColorFragment.this.btn5);
        FUT020ColorFragment.this.btn5.setImageResource(R.drawable.btn_light4_nor);
        FUT020ColorFragment localFUT020ColorFragment2 = FUT020ColorFragment.this;
        localFUT020ColorFragment2.longKeyMode = (0xFFFFFFEF & localFUT020ColorFragment2.longKeyMode);
        return true;
      }
      while (paramAnonymousView != FUT020ColorFragment.this.colorView);
      FUT020ColorFragment.this.beepFlag = false;
      FUT020ColorFragment.this.myHandler.removeMessages(4356);
      while (true)
      {
        if (FUT020ColorFragment.this.CirlgetData >= 4)
        {
          FUT020ColorFragment.this.CirlByte[3] = (byte)FUT020ColorFragment.this.SendColorData;
          FUT020ColorFragment.this.CirlgetData = 0;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)(FUT020ColorFragment.this.ColorData - (0xFF & FUT020ColorFragment.this.CirlByte[0]));
          arrayOfByte[6] = (byte)(FUT020ColorFragment.this.ColorData - (0xFF & FUT020ColorFragment.this.CirlByte[1]));
          arrayOfByte[7] = (byte)(FUT020ColorFragment.this.ColorData - (0xFF & FUT020ColorFragment.this.CirlByte[2]));
          arrayOfByte[8] = (byte)(FUT020ColorFragment.this.ColorData - (0xFF & FUT020ColorFragment.this.CirlByte[3]));
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return true;
        }
        FUT020ColorFragment.this.CirlByte[FUT020ColorFragment.this.CirlgetData] = (byte)FUT020ColorFragment.this.SendColorData;
        FUT020ColorFragment localFUT020ColorFragment1 = FUT020ColorFragment.this;
        localFUT020ColorFragment1.CirlgetData = (byte)(1 + localFUT020ColorFragment1.CirlgetData);
      }
    }
  };
  private boolean sendColorFlag = false;
  private int wKeyMode;

  public FUT020ColorFragment()
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
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut020_color, null);
    this.btn1 = ((ImageView)localView.findViewById(R.id.iv_light1));
    this.btn2 = ((ImageView)localView.findViewById(R.id.iv_light2));
    this.btnPower = ((ImageView)localView.findViewById(R.id.iv_onoff));
    this.btn4 = ((ImageView)localView.findViewById(R.id.iv_light3));
    this.btn5 = ((ImageView)localView.findViewById(R.id.iv_light4));
    this.btn1.setOnTouchListener(this.ontouchlistener);
    this.btn2.setOnTouchListener(this.ontouchlistener);
    this.btnPower.setOnTouchListener(this.ontouchlistener);
    this.btn4.setOnTouchListener(this.ontouchlistener);
    this.btn5.setOnTouchListener(this.ontouchlistener);
    this.colorView = localView.findViewById(R.id.bg_color);
    this.colorHandler = localView.findViewById(R.id.iv_color_handler);
    this.colorBoder = getResources().getDimensionPixelSize(R.dimen.color_boder);
    this.colorView.setOnTouchListener(this.ontouchlistener);
    this.curColor = -65536;
    this.disp_color = ((TextView)localView.findViewById(R.id.disp_color));
    MyApp.rain_remo = 3;
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT020ColorFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */