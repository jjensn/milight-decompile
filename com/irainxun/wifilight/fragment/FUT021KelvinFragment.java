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

public class FUT021KelvinFragment extends Fragment
{
  private static final int buttonKeyEvent = 4353;
  private static final int cirleEvent = 4354;
  private static final int cirleSend = 4356;
  private static final int cirleSendData = 160;
  private static final int cirleTime = 40;
  private static final int delayLongTime = 400;
  private static final int delayTime = 200;
  private int CircularColor;
  private byte[] CirlByte = new byte[4];
  private byte CirlgetData = 0;
  private int SendColorData = 0;
  private final String TAG = getClass().getSimpleName();
  private boolean beepFlag;
  private int beepdata;
  private ImageView btn1;
  private TextView btn2;
  private ImageView btn3;
  private ImageView btn4;
  private TextView btn5;
  private boolean cirleSendDataFlag = false;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if ((paramAnonymousView != FUT021KelvinFragment.this.btn1) && (paramAnonymousView != FUT021KelvinFragment.this.btn2) && (paramAnonymousView != FUT021KelvinFragment.this.btn3) && (paramAnonymousView != FUT021KelvinFragment.this.btn4));
    }
  };
  private View colorHandler;
  private View colorView;
  private int longKeyMode = 0;
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
        FUT021KelvinFragment.this.sendColorFlag = false;
        FUT021KelvinFragment.this.CirlByte[FUT021KelvinFragment.this.CirlgetData] = (byte)FUT021KelvinFragment.this.SendColorData;
        if (FUT021KelvinFragment.this.CirlgetData < 4)
        {
          FUT021KelvinFragment localFUT021KelvinFragment2 = FUT021KelvinFragment.this;
          localFUT021KelvinFragment2.CirlgetData = (byte)(1 + localFUT021KelvinFragment2.CirlgetData);
        }
        Log.d("debug", "CirlgetData = " + FUT021KelvinFragment.this.CirlgetData);
        continue;
        FUT021KelvinFragment.this.cirleSendDataFlag = false;
        while (true)
        {
          if (FUT021KelvinFragment.this.CirlgetData >= 4)
          {
            FUT021KelvinFragment.this.CirlByte[3] = (byte)FUT021KelvinFragment.this.SendColorData;
            FUT021KelvinFragment.this.CirlgetData = 0;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = FUT021KelvinFragment.this.CirlByte[0];
            arrayOfByte[6] = FUT021KelvinFragment.this.CirlByte[1];
            arrayOfByte[7] = FUT021KelvinFragment.this.CirlByte[2];
            arrayOfByte[8] = FUT021KelvinFragment.this.CirlByte[3];
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            Log.d("debug", "send cirl data");
            break;
          }
          FUT021KelvinFragment.this.CirlByte[FUT021KelvinFragment.this.CirlgetData] = (byte)FUT021KelvinFragment.this.SendColorData;
          FUT021KelvinFragment localFUT021KelvinFragment1 = FUT021KelvinFragment.this;
          localFUT021KelvinFragment1.CirlgetData = (byte)(1 + localFUT021KelvinFragment1.CirlgetData);
        }
        if ((0x1 & FUT021KelvinFragment.this.longKeyMode) == 1)
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
          FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x2 & FUT021KelvinFragment.this.longKeyMode) == 2)
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
          FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x4 & FUT021KelvinFragment.this.longKeyMode) == 4)
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
          FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x8 & FUT021KelvinFragment.this.longKeyMode) == 8)
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
          FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x10 & FUT021KelvinFragment.this.longKeyMode) == 16)
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
          FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          continue;
          FUT021KelvinFragment.this.beepFlag = false;
          if (FUT021KelvinFragment.this.beepdata != FUT021KelvinFragment.this.CircularColor)
          {
            FUT021KelvinFragment.this.beepdata = FUT021KelvinFragment.this.CircularColor;
            MyApp.PlalyKeySound();
          }
        }
      }
    }
  };
  private boolean sendColorFlag = false;
  private View.OnTouchListener touchListener = new View.OnTouchListener()
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
                if (paramAnonymousView != FUT021KelvinFragment.this.colorView)
                  MyApp.PlalyKeySound();
                if (paramAnonymousView == FUT021KelvinFragment.this.btn1)
                {
                  FUT021KelvinFragment.this.btn1.setImageResource(R.drawable.btn_light1_press);
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
                  FUT021KelvinFragment localFUT021KelvinFragment11 = FUT021KelvinFragment.this;
                  localFUT021KelvinFragment11.longKeyMode = (0x1 | localFUT021KelvinFragment11.longKeyMode);
                  FUT021KelvinFragment.this.myHandler.removeMessages(4353);
                  FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT021KelvinFragment.this.btn2)
                {
                  FUT021KelvinFragment.this.btn2.setBackgroundResource(R.drawable.btn_on_press);
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
                  FUT021KelvinFragment localFUT021KelvinFragment10 = FUT021KelvinFragment.this;
                  localFUT021KelvinFragment10.longKeyMode = (0x2 | localFUT021KelvinFragment10.longKeyMode);
                  FUT021KelvinFragment.this.myHandler.removeMessages(4353);
                  FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT021KelvinFragment.this.btn3)
                {
                  FUT021KelvinFragment.this.btn3.setImageResource(R.drawable.btn_color_press);
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
                  FUT021KelvinFragment localFUT021KelvinFragment9 = FUT021KelvinFragment.this;
                  localFUT021KelvinFragment9.longKeyMode = (0x4 | localFUT021KelvinFragment9.longKeyMode);
                  FUT021KelvinFragment.this.myHandler.removeMessages(4353);
                  FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT021KelvinFragment.this.btn4)
                {
                  FUT021KelvinFragment.this.btn4.setImageResource(R.drawable.btn_light2_press);
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
                  FUT021KelvinFragment localFUT021KelvinFragment8 = FUT021KelvinFragment.this;
                  localFUT021KelvinFragment8.longKeyMode = (0x8 | localFUT021KelvinFragment8.longKeyMode);
                  FUT021KelvinFragment.this.myHandler.removeMessages(4353);
                  FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT021KelvinFragment.this.btn5)
                {
                  FUT021KelvinFragment.this.btn5.setBackgroundResource(R.drawable.btn_off_press);
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
                  FUT021KelvinFragment localFUT021KelvinFragment7 = FUT021KelvinFragment.this;
                  localFUT021KelvinFragment7.longKeyMode = (0x10 | localFUT021KelvinFragment7.longKeyMode);
                  FUT021KelvinFragment.this.myHandler.removeMessages(4353);
                  FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
              }
              while (paramAnonymousView != FUT021KelvinFragment.this.colorView);
              FUT021KelvinFragment.this.colorHandler.setVisibility(0);
              FUT021KelvinFragment.this.sendColorFlag = false;
              FUT021KelvinFragment.this.cirleSendDataFlag = false;
              FUT021KelvinFragment.this.CirlgetData = 0;
              FUT021KelvinFragment.this.updateViewLocation(i, j);
              FUT021KelvinFragment.this.CirlByte[0] = (byte)FUT021KelvinFragment.this.SendColorData;
              FUT021KelvinFragment.this.CirlByte[1] = (byte)FUT021KelvinFragment.this.SendColorData;
              FUT021KelvinFragment.this.CirlByte[2] = (byte)FUT021KelvinFragment.this.SendColorData;
              FUT021KelvinFragment.this.CirlByte[3] = (byte)FUT021KelvinFragment.this.SendColorData;
              return true;
            }
            while (paramAnonymousView != FUT021KelvinFragment.this.colorView);
            FUT021KelvinFragment.this.updateViewLocation(i, j);
          }
          while (FUT021KelvinFragment.this.cirleSendDataFlag);
          FUT021KelvinFragment.this.cirleSendDataFlag = true;
          FUT021KelvinFragment.this.myHandler.removeMessages(4356);
          FUT021KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
          return true;
          if (paramAnonymousView == FUT021KelvinFragment.this.colorView)
            break;
          if (paramAnonymousView == FUT021KelvinFragment.this.btn1)
          {
            FUT021KelvinFragment.this.btn1.setImageResource(R.drawable.btn_light1_nor);
            FUT021KelvinFragment localFUT021KelvinFragment6 = FUT021KelvinFragment.this;
            localFUT021KelvinFragment6.longKeyMode = (0xFFFFFFFE & localFUT021KelvinFragment6.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT021KelvinFragment.this.btn2)
          {
            FUT021KelvinFragment.this.btn2.setBackgroundResource(R.drawable.btn_on_nor);
            FUT021KelvinFragment localFUT021KelvinFragment5 = FUT021KelvinFragment.this;
            localFUT021KelvinFragment5.longKeyMode = (0xFFFFFFFD & localFUT021KelvinFragment5.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT021KelvinFragment.this.btn3)
          {
            FUT021KelvinFragment.this.btn3.setImageResource(R.drawable.btn_color_nor);
            FUT021KelvinFragment localFUT021KelvinFragment4 = FUT021KelvinFragment.this;
            localFUT021KelvinFragment4.longKeyMode = (0xFFFFFFFB & localFUT021KelvinFragment4.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT021KelvinFragment.this.btn4)
          {
            FUT021KelvinFragment.this.btn4.setImageResource(R.drawable.btn_light2_nor);
            FUT021KelvinFragment localFUT021KelvinFragment3 = FUT021KelvinFragment.this;
            localFUT021KelvinFragment3.longKeyMode = (0xFFFFFFF7 & localFUT021KelvinFragment3.longKeyMode);
            return true;
          }
        }
        while (paramAnonymousView != FUT021KelvinFragment.this.btn5);
        FUT021KelvinFragment.this.btn5.setBackgroundResource(R.drawable.btn_off_nor);
        FUT021KelvinFragment localFUT021KelvinFragment2 = FUT021KelvinFragment.this;
        localFUT021KelvinFragment2.longKeyMode = (0xFFFFFFEF & localFUT021KelvinFragment2.longKeyMode);
        return true;
      }
      while (paramAnonymousView != FUT021KelvinFragment.this.colorView);
      FUT021KelvinFragment.this.colorHandler.setVisibility(4);
      FUT021KelvinFragment.this.beepFlag = false;
      FUT021KelvinFragment.this.myHandler.removeMessages(4356);
      while (true)
      {
        if (FUT021KelvinFragment.this.CirlgetData >= 4)
        {
          FUT021KelvinFragment.this.CirlByte[3] = (byte)FUT021KelvinFragment.this.SendColorData;
          FUT021KelvinFragment.this.CirlgetData = 0;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = FUT021KelvinFragment.this.CirlByte[0];
          arrayOfByte[6] = FUT021KelvinFragment.this.CirlByte[1];
          arrayOfByte[7] = FUT021KelvinFragment.this.CirlByte[2];
          arrayOfByte[8] = FUT021KelvinFragment.this.CirlByte[3];
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return true;
        }
        FUT021KelvinFragment.this.CirlByte[FUT021KelvinFragment.this.CirlgetData] = (byte)FUT021KelvinFragment.this.SendColorData;
        FUT021KelvinFragment localFUT021KelvinFragment1 = FUT021KelvinFragment.this;
        localFUT021KelvinFragment1.CirlgetData = (byte)(1 + localFUT021KelvinFragment1.CirlgetData);
      }
    }
  };

  public FUT021KelvinFragment()
  {
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
    int i2 = getResources().getDimensionPixelSize(R.dimen.color_inner_r_021);
    int i3 = i / 2;
    int i4 = 24 + this.colorHandler.getWidth() / 2;
    Circular localCircular = MyApp.CircularData(paramInt1, paramInt2, i3, i4, i2);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.colorHandler.getLayoutParams();
    localLayoutParams.leftMargin = (localCircular.x - this.colorHandler.getWidth() / 2);
    localLayoutParams.topMargin = (localCircular.y - this.colorHandler.getWidth() / 2);
    this.colorHandler.setLayoutParams(localLayoutParams);
    this.CircularColor = (int)(0.7083333333333334D * localCircular.angle);
    this.SendColorData = (int)(0.7083333333333334D * localCircular.angle);
    if (!this.sendColorFlag)
    {
      this.sendColorFlag = true;
      this.myHandler.removeMessages(4354);
      this.myHandler.sendEmptyMessageDelayed(4354, 40L);
    }
    if (!this.beepFlag)
    {
      this.beepFlag = true;
      this.myHandler.removeMessages(1024);
      this.myHandler.sendEmptyMessageDelayed(1024, 80L);
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut021_kelvin, null);
    this.colorView = localView.findViewById(R.id.bg_light);
    this.colorHandler = localView.findViewById(R.id.iv_color_handler);
    this.colorHandler.setVisibility(4);
    this.colorView.setOnTouchListener(this.touchListener);
    this.btn1 = ((ImageView)localView.findViewById(R.id.iv_light1));
    this.btn2 = ((TextView)localView.findViewById(R.id.iv_light2));
    this.btn3 = ((ImageView)localView.findViewById(R.id.iv_onoff));
    this.btn4 = ((ImageView)localView.findViewById(R.id.iv_light3));
    this.btn5 = ((TextView)localView.findViewById(R.id.iv_light4));
    this.btn1.setOnTouchListener(this.touchListener);
    this.btn2.setOnTouchListener(this.touchListener);
    this.btn3.setOnTouchListener(this.touchListener);
    this.btn4.setOnTouchListener(this.touchListener);
    this.btn5.setOnTouchListener(this.touchListener);
    MyApp.rain_remo = 2;
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT021KelvinFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */