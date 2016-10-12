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

public class FUT022KelvinFragment extends Fragment
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
      if ((paramAnonymousView != FUT022KelvinFragment.this.btn1) && (paramAnonymousView != FUT022KelvinFragment.this.btn2) && (paramAnonymousView != FUT022KelvinFragment.this.btn3) && (paramAnonymousView != FUT022KelvinFragment.this.btn4));
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
        FUT022KelvinFragment.this.sendColorFlag = false;
        FUT022KelvinFragment.this.CirlByte[FUT022KelvinFragment.this.CirlgetData] = (byte)FUT022KelvinFragment.this.SendColorData;
        if (FUT022KelvinFragment.this.CirlgetData < 4)
        {
          FUT022KelvinFragment localFUT022KelvinFragment2 = FUT022KelvinFragment.this;
          localFUT022KelvinFragment2.CirlgetData = (byte)(1 + localFUT022KelvinFragment2.CirlgetData);
        }
        Log.d("debug", "CirlgetData = " + FUT022KelvinFragment.this.CirlgetData);
        continue;
        FUT022KelvinFragment.this.cirleSendDataFlag = false;
        while (true)
        {
          if (FUT022KelvinFragment.this.CirlgetData >= 4)
          {
            FUT022KelvinFragment.this.CirlByte[3] = (byte)FUT022KelvinFragment.this.SendColorData;
            FUT022KelvinFragment.this.CirlgetData = 0;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = FUT022KelvinFragment.this.CirlByte[0];
            arrayOfByte[6] = FUT022KelvinFragment.this.CirlByte[1];
            arrayOfByte[7] = FUT022KelvinFragment.this.CirlByte[2];
            arrayOfByte[8] = FUT022KelvinFragment.this.CirlByte[3];
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            Log.d("debug", "send cirl data");
            break;
          }
          FUT022KelvinFragment.this.CirlByte[FUT022KelvinFragment.this.CirlgetData] = (byte)FUT022KelvinFragment.this.SendColorData;
          FUT022KelvinFragment localFUT022KelvinFragment1 = FUT022KelvinFragment.this;
          localFUT022KelvinFragment1.CirlgetData = (byte)(1 + localFUT022KelvinFragment1.CirlgetData);
        }
        if ((0x1 & FUT022KelvinFragment.this.longKeyMode) == 1)
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
          FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x2 & FUT022KelvinFragment.this.longKeyMode) == 2)
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
          FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x4 & FUT022KelvinFragment.this.longKeyMode) == 4)
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
          FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x8 & FUT022KelvinFragment.this.longKeyMode) == 8)
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
          FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x10 & FUT022KelvinFragment.this.longKeyMode) == 16)
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
          FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          continue;
          FUT022KelvinFragment.this.beepFlag = false;
          if (FUT022KelvinFragment.this.beepdata != FUT022KelvinFragment.this.CircularColor)
          {
            FUT022KelvinFragment.this.beepdata = FUT022KelvinFragment.this.CircularColor;
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
                if (paramAnonymousView != FUT022KelvinFragment.this.colorView)
                  MyApp.PlalyKeySound();
                if (paramAnonymousView == FUT022KelvinFragment.this.btn1)
                {
                  FUT022KelvinFragment.this.btn1.setImageResource(R.drawable.btn_light1_press);
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
                  FUT022KelvinFragment localFUT022KelvinFragment11 = FUT022KelvinFragment.this;
                  localFUT022KelvinFragment11.longKeyMode = (0x1 | localFUT022KelvinFragment11.longKeyMode);
                  FUT022KelvinFragment.this.myHandler.removeMessages(4353);
                  FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT022KelvinFragment.this.btn2)
                {
                  FUT022KelvinFragment.this.btn2.setBackgroundResource(R.drawable.btn_on_press);
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
                  FUT022KelvinFragment localFUT022KelvinFragment10 = FUT022KelvinFragment.this;
                  localFUT022KelvinFragment10.longKeyMode = (0x2 | localFUT022KelvinFragment10.longKeyMode);
                  FUT022KelvinFragment.this.myHandler.removeMessages(4353);
                  FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT022KelvinFragment.this.btn3)
                {
                  FUT022KelvinFragment.this.btn3.setImageResource(R.drawable.btn_color_press);
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
                  FUT022KelvinFragment localFUT022KelvinFragment9 = FUT022KelvinFragment.this;
                  localFUT022KelvinFragment9.longKeyMode = (0x4 | localFUT022KelvinFragment9.longKeyMode);
                  FUT022KelvinFragment.this.myHandler.removeMessages(4353);
                  FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT022KelvinFragment.this.btn4)
                {
                  FUT022KelvinFragment.this.btn4.setImageResource(R.drawable.btn_light2_press);
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
                  FUT022KelvinFragment localFUT022KelvinFragment8 = FUT022KelvinFragment.this;
                  localFUT022KelvinFragment8.longKeyMode = (0x8 | localFUT022KelvinFragment8.longKeyMode);
                  FUT022KelvinFragment.this.myHandler.removeMessages(4353);
                  FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT022KelvinFragment.this.btn5)
                {
                  FUT022KelvinFragment.this.btn5.setBackgroundResource(R.drawable.btn_off_press);
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
                  FUT022KelvinFragment localFUT022KelvinFragment7 = FUT022KelvinFragment.this;
                  localFUT022KelvinFragment7.longKeyMode = (0x10 | localFUT022KelvinFragment7.longKeyMode);
                  FUT022KelvinFragment.this.myHandler.removeMessages(4353);
                  FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
              }
              while (paramAnonymousView != FUT022KelvinFragment.this.colorView);
              FUT022KelvinFragment.this.colorHandler.setVisibility(0);
              FUT022KelvinFragment.this.sendColorFlag = false;
              FUT022KelvinFragment.this.cirleSendDataFlag = false;
              FUT022KelvinFragment.this.CirlgetData = 0;
              FUT022KelvinFragment.this.updateViewLocation(i, j);
              FUT022KelvinFragment.this.CirlByte[0] = (byte)FUT022KelvinFragment.this.SendColorData;
              FUT022KelvinFragment.this.CirlByte[1] = (byte)FUT022KelvinFragment.this.SendColorData;
              FUT022KelvinFragment.this.CirlByte[2] = (byte)FUT022KelvinFragment.this.SendColorData;
              FUT022KelvinFragment.this.CirlByte[3] = (byte)FUT022KelvinFragment.this.SendColorData;
              return true;
            }
            while (paramAnonymousView != FUT022KelvinFragment.this.colorView);
            FUT022KelvinFragment.this.updateViewLocation(i, j);
          }
          while (FUT022KelvinFragment.this.cirleSendDataFlag);
          FUT022KelvinFragment.this.cirleSendDataFlag = true;
          FUT022KelvinFragment.this.myHandler.removeMessages(4356);
          FUT022KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
          return true;
          if (paramAnonymousView == FUT022KelvinFragment.this.colorView)
            break;
          if (paramAnonymousView == FUT022KelvinFragment.this.btn1)
          {
            FUT022KelvinFragment.this.btn1.setImageResource(R.drawable.btn_light1_nor);
            FUT022KelvinFragment localFUT022KelvinFragment6 = FUT022KelvinFragment.this;
            localFUT022KelvinFragment6.longKeyMode = (0xFFFFFFFE & localFUT022KelvinFragment6.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT022KelvinFragment.this.btn2)
          {
            FUT022KelvinFragment.this.btn2.setBackgroundResource(R.drawable.btn_on_nor);
            FUT022KelvinFragment localFUT022KelvinFragment5 = FUT022KelvinFragment.this;
            localFUT022KelvinFragment5.longKeyMode = (0xFFFFFFFD & localFUT022KelvinFragment5.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT022KelvinFragment.this.btn3)
          {
            FUT022KelvinFragment.this.btn3.setImageResource(R.drawable.btn_color_nor);
            FUT022KelvinFragment localFUT022KelvinFragment4 = FUT022KelvinFragment.this;
            localFUT022KelvinFragment4.longKeyMode = (0xFFFFFFFB & localFUT022KelvinFragment4.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT022KelvinFragment.this.btn4)
          {
            FUT022KelvinFragment.this.btn4.setImageResource(R.drawable.btn_light2_nor);
            FUT022KelvinFragment localFUT022KelvinFragment3 = FUT022KelvinFragment.this;
            localFUT022KelvinFragment3.longKeyMode = (0xFFFFFFF7 & localFUT022KelvinFragment3.longKeyMode);
            return true;
          }
        }
        while (paramAnonymousView != FUT022KelvinFragment.this.btn5);
        FUT022KelvinFragment.this.btn5.setBackgroundResource(R.drawable.btn_off_nor);
        FUT022KelvinFragment localFUT022KelvinFragment2 = FUT022KelvinFragment.this;
        localFUT022KelvinFragment2.longKeyMode = (0xFFFFFFEF & localFUT022KelvinFragment2.longKeyMode);
        return true;
      }
      while (paramAnonymousView != FUT022KelvinFragment.this.colorView);
      FUT022KelvinFragment.this.colorHandler.setVisibility(4);
      FUT022KelvinFragment.this.beepFlag = false;
      FUT022KelvinFragment.this.myHandler.removeMessages(4356);
      while (true)
      {
        if (FUT022KelvinFragment.this.CirlgetData >= 4)
        {
          FUT022KelvinFragment.this.CirlByte[3] = (byte)FUT022KelvinFragment.this.SendColorData;
          FUT022KelvinFragment.this.CirlgetData = 0;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = FUT022KelvinFragment.this.CirlByte[0];
          arrayOfByte[6] = FUT022KelvinFragment.this.CirlByte[1];
          arrayOfByte[7] = FUT022KelvinFragment.this.CirlByte[2];
          arrayOfByte[8] = FUT022KelvinFragment.this.CirlByte[3];
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return true;
        }
        FUT022KelvinFragment.this.CirlByte[FUT022KelvinFragment.this.CirlgetData] = (byte)FUT022KelvinFragment.this.SendColorData;
        FUT022KelvinFragment localFUT022KelvinFragment1 = FUT022KelvinFragment.this;
        localFUT022KelvinFragment1.CirlgetData = (byte)(1 + localFUT022KelvinFragment1.CirlgetData);
      }
    }
  };

  public FUT022KelvinFragment()
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
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut022_kelvin, null);
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
    MyApp.rain_remo = 1;
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT022KelvinFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */