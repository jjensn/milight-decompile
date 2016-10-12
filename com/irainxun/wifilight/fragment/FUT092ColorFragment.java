package com.irainxun.wifilight.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
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
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifi_light;
import com.irainxun.wifilight.database.zoneName;
import com.irainxun.wifilight.util.ActivityUtil;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.xlink.Circular;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class FUT092ColorFragment extends Fragment
{
  private static final int buttonKeyEvent = 4353;
  private static final int cirleEvent = 4354;
  private static final int cirleSend = 4356;
  private static final int cirleSendData = 160;
  private static final int cirleTime = 40;
  private static final int dataupdata = 4358;
  private static final int delayLongTime = 400;
  private static final int delayTime = 200;
  private static final int processEvent = 4355;
  private static final int saturationEvent = 4357;
  private int CircularColor;
  private byte[] CirlByte = new byte[4];
  private byte CirlgetData = 0;
  private int ColorData = 185;
  private int SendColorData = 0;
  private final String TAG = getClass().getSimpleName();
  private boolean beepFlag;
  private int beepdata;
  private Button btnAll;
  private Button btnNightLight;
  private Button btnOff;
  private Button btnOn;
  private boolean cirleSendDataFlag = false;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      MyApp.PlalyKeySound();
      if (paramAnonymousView == FUT092ColorFragment.this.btnAll)
      {
        FUT092ColorFragment.this.groupUtil.selectAll(true);
        MyApp.rain_remo = 0;
      }
      do
      {
        return;
        if (paramAnonymousView == FUT092ColorFragment.this.ivAddColor)
        {
          FUT092ColorFragment.this.colorPickerUtil.addColorPoint(MyApp.rain_08curColor);
          return;
        }
      }
      while (paramAnonymousView != FUT092ColorFragment.this.tvColor);
      byte[] arrayOfByte = new byte[12];
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 5;
      arrayOfByte[5] = (byte)MyApp.rain_08kelvin;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      FUT092ColorFragment.this.tvColor.setTextColor(FUT092ColorFragment.this.TempgetColor(MyApp.rain_08kelvin));
      MyApp.lightmode = true;
    }
  };
  private int colorBoder;
  private View colorHandler;
  private ColorPicker colorPickerUtil;
  private View colorView;
  private int[] colors = { -16777216, -1 };
  private TextView disp_brightness;
  private TextView disp_color;
  private TextView disp_staturation;
  private LinearLayout groupLayout;
  private GroupUtil groupUtil;
  private ImageView ivAddColor;
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
      case 4357:
      case 4355:
      case 4353:
      case 1024:
      case 4358:
      }
      while (true)
      {
        super.handleMessage(paramAnonymousMessage);
        return;
        FUT092ColorFragment.this.sendColorFlag = false;
        FUT092ColorFragment.this.CirlByte[FUT092ColorFragment.this.CirlgetData] = (byte)FUT092ColorFragment.this.SendColorData;
        if (FUT092ColorFragment.this.CirlgetData < 4)
        {
          FUT092ColorFragment localFUT092ColorFragment2 = FUT092ColorFragment.this;
          localFUT092ColorFragment2.CirlgetData = (byte)(1 + localFUT092ColorFragment2.CirlgetData);
        }
        Log.d("debug", "CirlgetData = " + FUT092ColorFragment.this.CirlgetData);
        continue;
        FUT092ColorFragment.this.cirleSendDataFlag = false;
        while (true)
        {
          if (FUT092ColorFragment.this.CirlgetData >= 4)
          {
            FUT092ColorFragment.this.CirlByte[3] = (byte)FUT092ColorFragment.this.SendColorData;
            FUT092ColorFragment.this.CirlgetData = 0;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = (byte)(FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.CirlByte[0]);
            arrayOfByte[6] = (byte)(FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.CirlByte[1]);
            arrayOfByte[7] = (byte)(FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.CirlByte[2]);
            arrayOfByte[8] = (byte)(FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.CirlByte[3]);
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            Log.d("debug", "send cirl data");
            break;
          }
          FUT092ColorFragment.this.CirlByte[FUT092ColorFragment.this.CirlgetData] = (byte)FUT092ColorFragment.this.SendColorData;
          FUT092ColorFragment localFUT092ColorFragment1 = FUT092ColorFragment.this;
          localFUT092ColorFragment1.CirlgetData = (byte)(1 + localFUT092ColorFragment1.CirlgetData);
        }
        FUT092ColorFragment.this.sb_saturationFlag = false;
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 2;
        arrayOfByte[5] = (byte)MyApp.rain_08saturation;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        continue;
        FUT092ColorFragment.this.sb_lightFlag = false;
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 3;
        arrayOfByte[5] = (byte)MyApp.rain_08brightness;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        continue;
        if ((0x2 & FUT092ColorFragment.this.longKeyMode) == 2)
        {
          Log.d("debug", "long key Night light");
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
          FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x4 & FUT092ColorFragment.this.longKeyMode) == 4)
        {
          Log.d("debug", "long key tvOn");
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
          FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x8 & FUT092ColorFragment.this.longKeyMode) == 8)
        {
          Log.d("debug", "long key tvOff");
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
          FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          continue;
          FUT092ColorFragment.this.beepFlag = false;
          if (FUT092ColorFragment.this.beepdata != FUT092ColorFragment.this.CircularColor)
          {
            FUT092ColorFragment.this.beepdata = FUT092ColorFragment.this.CircularColor;
            MyApp.PlalyKeySound();
            continue;
            FUT092ColorFragment.this.sb_saturation.setProgress(MyApp.rain_08saturation);
            FUT092ColorFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
            FUT092ColorFragment.this.seekFlag = true;
            Log.d("debug", "dataupdate COLOR rain_08saturation = " + MyApp.rain_08saturation);
            Log.d("debug", "dataupdate COLOR rain_08brightness = " + MyApp.rain_08brightness);
          }
        }
      }
    }
  };
  private int[] saveColor = new int[5];
  private byte[] saveLightMode = new byte[5];
  private byte[] saveSatData = new byte[5];
  private int[] saveseekBar = new int[5];
  private SeekBar sb_light;
  private boolean sb_lightFlag;
  private SeekBar sb_saturation;
  private boolean sb_saturationFlag;
  private boolean seekFlag = false;
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
                if (paramAnonymousView != FUT092ColorFragment.this.colorView)
                  MyApp.PlalyKeySound();
                if (paramAnonymousView == FUT092ColorFragment.this.btnOn)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.k_btn_on_press);
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
                  FUT092ColorFragment localFUT092ColorFragment7 = FUT092ColorFragment.this;
                  localFUT092ColorFragment7.longKeyMode = (0x4 | localFUT092ColorFragment7.longKeyMode);
                  FUT092ColorFragment.this.myHandler.removeMessages(4353);
                  FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT092ColorFragment.this.btnOff)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.k_btn_off_press);
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
                  FUT092ColorFragment localFUT092ColorFragment6 = FUT092ColorFragment.this;
                  localFUT092ColorFragment6.longKeyMode = (0x8 | localFUT092ColorFragment6.longKeyMode);
                  FUT092ColorFragment.this.myHandler.removeMessages(4353);
                  FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT092ColorFragment.this.btnNightLight)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.k_btn_press);
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
                  FUT092ColorFragment localFUT092ColorFragment5 = FUT092ColorFragment.this;
                  localFUT092ColorFragment5.longKeyMode = (0x2 | localFUT092ColorFragment5.longKeyMode);
                  FUT092ColorFragment.this.myHandler.removeMessages(4353);
                  FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
              }
              while (paramAnonymousView != FUT092ColorFragment.this.colorView);
              MyApp.lightmode = false;
              FUT092ColorFragment.this.sendColorFlag = false;
              FUT092ColorFragment.this.cirleSendDataFlag = false;
              FUT092ColorFragment.this.CirlgetData = 0;
              FUT092ColorFragment.this.updateViewLocation(i, j);
              FUT092ColorFragment.this.CirlByte[0] = (byte)FUT092ColorFragment.this.SendColorData;
              FUT092ColorFragment.this.CirlByte[1] = (byte)FUT092ColorFragment.this.SendColorData;
              FUT092ColorFragment.this.CirlByte[2] = (byte)FUT092ColorFragment.this.SendColorData;
              FUT092ColorFragment.this.CirlByte[3] = (byte)FUT092ColorFragment.this.SendColorData;
              MyApp.rain_08color = FUT092ColorFragment.this.SendColorData;
              return true;
            }
            while (paramAnonymousView != FUT092ColorFragment.this.colorView);
            MyApp.lightmode = false;
            FUT092ColorFragment.this.updateViewLocation(i, j);
          }
          while (FUT092ColorFragment.this.cirleSendDataFlag);
          FUT092ColorFragment.this.cirleSendDataFlag = true;
          FUT092ColorFragment.this.myHandler.removeMessages(4356);
          FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
          return true;
          if (paramAnonymousView == FUT092ColorFragment.this.colorView)
            break;
          if (paramAnonymousView == FUT092ColorFragment.this.btnOn)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.k_btn_on_nor);
            FUT092ColorFragment localFUT092ColorFragment4 = FUT092ColorFragment.this;
            localFUT092ColorFragment4.longKeyMode = (0xFFFFFFFB & localFUT092ColorFragment4.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT092ColorFragment.this.btnOff)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.k_btn_off_nor);
            FUT092ColorFragment localFUT092ColorFragment3 = FUT092ColorFragment.this;
            localFUT092ColorFragment3.longKeyMode = (0xFFFFFFF7 & localFUT092ColorFragment3.longKeyMode);
            return true;
          }
        }
        while (paramAnonymousView != FUT092ColorFragment.this.btnNightLight);
        paramAnonymousView.setBackgroundResource(R.drawable.k_btn_nor);
        FUT092ColorFragment localFUT092ColorFragment2 = FUT092ColorFragment.this;
        localFUT092ColorFragment2.longKeyMode = (0xFFFFFFFD & localFUT092ColorFragment2.longKeyMode);
        return true;
      }
      while (paramAnonymousView != FUT092ColorFragment.this.colorView);
      FUT092ColorFragment.this.beepFlag = false;
      FUT092ColorFragment.this.myHandler.removeMessages(4356);
      while (true)
      {
        if (FUT092ColorFragment.this.CirlgetData >= 4)
        {
          FUT092ColorFragment.this.CirlByte[3] = (byte)FUT092ColorFragment.this.SendColorData;
          MyApp.rain_08color = FUT092ColorFragment.this.SendColorData;
          FUT092ColorFragment.this.CirlgetData = 0;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)(FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.CirlByte[0]);
          arrayOfByte[6] = (byte)(FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.CirlByte[1]);
          arrayOfByte[7] = (byte)(FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.CirlByte[2]);
          arrayOfByte[8] = (byte)(FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.CirlByte[3]);
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return true;
        }
        FUT092ColorFragment.this.CirlByte[FUT092ColorFragment.this.CirlgetData] = (byte)FUT092ColorFragment.this.SendColorData;
        FUT092ColorFragment localFUT092ColorFragment1 = FUT092ColorFragment.this;
        localFUT092ColorFragment1.CirlgetData = (byte)(1 + localFUT092ColorFragment1.CirlgetData);
      }
    }
  };
  private TextView tvColor;

  public FUT092ColorFragment()
  {
  }

  private int TempgetColor(int paramInt)
  {
    return 0xFFFFFF00 | 0xFF & (int)(2.55D * paramInt);
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

  private void rainsetSeekBarProgressDrawable(int paramInt, SeekBar paramSeekBar)
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
    MyApp.rain_08curColor = getColor(localCircular.angle);
    this.SendColorData = (int)(0.7083333333333334D * localCircular.angle);
    MyApp.rain_08color = this.SendColorData;
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
    MyApp.rain_08curColor = getColor(localCircular.angle);
    this.tvColor.setTextColor(MyApp.rain_08curColor);
    rainsetSeekBarProgressDrawable(MyApp.rain_08curColor, this.sb_saturation);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut092_color, null);
    this.seekFlag = false;
    this.groupLayout = ((LinearLayout)localView.findViewById(R.id.group));
    this.colorView = localView.findViewById(R.id.bg_color);
    this.colorHandler = localView.findViewById(R.id.iv_color_handler);
    this.colorView.setOnTouchListener(this.touchListener);
    this.disp_color = ((TextView)localView.findViewById(R.id.disp_color));
    this.disp_staturation = ((TextView)localView.findViewById(R.id.disp_staturation));
    this.disp_brightness = ((TextView)localView.findViewById(R.id.disp_brightness));
    this.ivAddColor = ((ImageView)localView.findViewById(R.id.iv_add));
    this.btnAll = ((Button)localView.findViewById(R.id.btn_all));
    this.btnNightLight = ((Button)localView.findViewById(R.id.btn_night_light));
    this.btnOn = ((Button)localView.findViewById(R.id.btn_on));
    this.btnOff = ((Button)localView.findViewById(R.id.btn_off));
    this.ivAddColor.setOnClickListener(this.clickListener);
    this.btnAll.setOnClickListener(this.clickListener);
    this.btnNightLight.setOnTouchListener(this.touchListener);
    this.btnOn.setOnTouchListener(this.touchListener);
    this.btnOff.setOnTouchListener(this.touchListener);
    this.colorBoder = getResources().getDimensionPixelSize(R.dimen.color_boder);
    this.tvColor = ((TextView)localView.findViewById(R.id.tv_color));
    Typeface localTypeface = Typeface.createFromAsset(getActivity().getAssets(), "font/APARAJB.TTF");
    this.tvColor.setTypeface(localTypeface);
    this.tvColor.setOnClickListener(this.clickListener);
    this.sb_saturation = ((SeekBar)localView.findViewById(R.id.sb_saturation));
    this.sb_light = ((SeekBar)localView.findViewById(R.id.sb_light));
    this.ivAddColor = ((ImageView)localView.findViewById(R.id.iv_add));
    this.ivAddColor.setOnClickListener(this.clickListener);
    this.colorPickerUtil = new ColorPicker(getActivity(), localView);
    this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
    this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
    this.sb_saturation.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if ((FUT092ColorFragment.this.seekFlag) && (MyApp.rain_08saturation != paramAnonymousInt))
        {
          MyApp.rain_08saturation = paramAnonymousInt;
          if (MyApp.rain_08saturation == 0)
            MyApp.rain_08saturation = 1;
          FUT092ColorFragment.this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
          if (!FUT092ColorFragment.this.sb_saturationFlag)
          {
            FUT092ColorFragment.this.sb_saturationFlag = true;
            FUT092ColorFragment.this.myHandler.removeMessages(4357);
            FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 160L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if ((FUT092ColorFragment.this.seekFlag) && (MyApp.rain_08saturation != FUT092ColorFragment.this.sb_saturation.getProgress()))
        {
          MyApp.rain_08saturation = FUT092ColorFragment.this.sb_saturation.getProgress();
          if (MyApp.rain_08saturation == 0)
            MyApp.rain_08saturation = 1;
          FUT092ColorFragment.this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
          FUT092ColorFragment.this.myHandler.removeMessages(4357);
          FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 10L);
        }
      }
    });
    rainsetSeekBarProgressDrawable(MyApp.rain_08curColor, this.sb_saturation);
    setSeekBarProgressDrawable(-16777216, this.sb_light);
    this.sb_light.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if ((FUT092ColorFragment.this.seekFlag) && (MyApp.rain_08brightness != paramAnonymousInt))
        {
          MyApp.rain_08brightness = paramAnonymousInt;
          if (MyApp.rain_08brightness == 0)
            MyApp.rain_08brightness = 1;
          FUT092ColorFragment.this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
          if (!FUT092ColorFragment.this.sb_lightFlag)
          {
            FUT092ColorFragment.this.sb_lightFlag = true;
            FUT092ColorFragment.this.myHandler.removeMessages(4355);
            FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 160L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if ((FUT092ColorFragment.this.seekFlag) && (MyApp.rain_08brightness != FUT092ColorFragment.this.sb_light.getProgress()))
        {
          MyApp.rain_08brightness = FUT092ColorFragment.this.sb_light.getProgress();
          if (MyApp.rain_08brightness == 0)
            MyApp.rain_08brightness = 1;
          FUT092ColorFragment.this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
          FUT092ColorFragment.this.myHandler.removeMessages(4355);
          FUT092ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 10L);
        }
      }
    });
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(MyApp.rain_remoteID);
    Log.d("debug", "decimalFormat = " + localDecimalFormat.format(MyApp.rain_remoteID));
    Log.d("debug", "macid = " + str);
    ArrayList localArrayList = new ArrayList();
    if (MyApp.deviceService.zoneName_isDeviceExists(str))
    {
      zoneName localzoneName2 = MyApp.deviceService.zoneName_getMyDevice(str);
      localArrayList.add(localzoneName2.zoneNameone);
      localArrayList.add(localzoneName2.zoneNametwo);
      localArrayList.add(localzoneName2.zoneNamethree);
      localArrayList.add(localzoneName2.zoneNamefour);
    }
    int i;
    while (true)
    {
      this.groupUtil = new GroupUtil(getActivity(), this.groupLayout, localArrayList);
      this.groupUtil.initGroup(0);
      if (MyApp.deviceService.wifiLight_isDeviceExists(str))
      {
        Log.d("debug", "tab1 database ture");
        new wifi_light();
        wifi_light localwifi_light = MyApp.deviceService.tab1_getMyDevice(str);
        Log.d("debug", "tab1_device" + localwifi_light.toString());
        this.saveLightMode[0] = (byte)Integer.parseInt(localwifi_light.device1);
        this.saveLightMode[1] = (byte)Integer.parseInt(localwifi_light.device2);
        this.saveLightMode[2] = (byte)Integer.parseInt(localwifi_light.device3);
        this.saveLightMode[3] = (byte)Integer.parseInt(localwifi_light.device4);
        this.saveLightMode[4] = (byte)Integer.parseInt(localwifi_light.device5);
        this.saveSatData[0] = (byte)Integer.parseInt(localwifi_light.wifilight_s1);
        this.saveSatData[1] = (byte)Integer.parseInt(localwifi_light.wifilight_s2);
        this.saveSatData[2] = (byte)Integer.parseInt(localwifi_light.wifilight_s3);
        this.saveSatData[3] = (byte)Integer.parseInt(localwifi_light.wifilight_s4);
        this.saveSatData[4] = (byte)Integer.parseInt(localwifi_light.wifilight_s5);
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
        i = 0;
        if (i < 5)
          break;
      }
      this.SendColorData = 100;
      this.myHandler.sendEmptyMessageDelayed(4358, 100L);
      return localView;
      zoneName localzoneName1 = new zoneName();
      localzoneName1.mac = str;
      localzoneName1.zoneNameone = "Zone1";
      localzoneName1.zoneNametwo = "Zone2";
      localzoneName1.zoneNamethree = "Zone3";
      localzoneName1.zoneNamefour = "Zone4";
      localArrayList.add(localzoneName1.zoneNameone);
      localArrayList.add(localzoneName1.zoneNametwo);
      localArrayList.add(localzoneName1.zoneNamethree);
      localArrayList.add(localzoneName1.zoneNamefour);
      MyApp.deviceService.zoneName_addDevice(localzoneName1.mac, localzoneName1.zoneNameone, localzoneName1.zoneNametwo, localzoneName1.zoneNamethree, localzoneName1.zoneNamefour);
    }
    Log.d("debug", "saveseekBar[" + i + "]" + " = " + this.saveseekBar[i]);
    int j;
    if (this.saveseekBar[i] > 0)
    {
      j = (int)(360.0D * (1.0D * this.saveColor[i] / 255.0D));
      if (this.saveLightMode[i] != 1)
        break label1324;
    }
    label1324: for (int k = TempgetColor(0xFF & this.saveSatData[i]); ; k = getColor(j))
    {
      this.colorPickerUtil.SetColorCir(k, i);
      i++;
      break;
    }
  }

  private class ColorPicker
  {
    private View.OnClickListener clickListener = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        byte[] arrayOfByte = new byte[12];
        if ((paramAnonymousView == FUT092ColorFragment.ColorPicker.this.ivPoint1) && (FUT092ColorFragment.ColorPicker.this.ivPoint1.getDrawable() != null) && ((FUT092ColorFragment.ColorPicker.this.ivPoint1.getDrawable() instanceof GradientDrawable)))
        {
          MyApp.PlalyKeySound();
          arrayOfByte[0] = 63;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = FUT092ColorFragment.this.saveLightMode[0];
          arrayOfByte[5] = FUT092ColorFragment.this.saveSatData[0];
          arrayOfByte[6] = (byte)(0xFF & FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.saveColor[0]);
          arrayOfByte[7] = (byte)FUT092ColorFragment.this.saveseekBar[0];
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          if (FUT092ColorFragment.this.saveLightMode[0] == 1)
          {
            MyApp.lightmode = true;
            MyApp.rain_08kelvin = FUT092ColorFragment.this.saveSatData[0];
            FUT092ColorFragment.this.tvColor.setTextColor(FUT092ColorFragment.this.TempgetColor(MyApp.rain_08kelvin));
            MyApp.rain_08brightness = 0xFF & FUT092ColorFragment.this.saveseekBar[0];
            FUT092ColorFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT092ColorFragment.this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
          }
        }
        do
        {
          return;
          MyApp.lightmode = false;
          FUT092ColorFragment.this.disp_color.setText("RGB:" + (0xFF & FUT092ColorFragment.this.ColorData - (0xFF & FUT092ColorFragment.this.saveColor[0])));
          MyApp.rain_08curColor = FUT092ColorFragment.this.getColor((int)(1.411764705882353D * 0xFF & FUT092ColorFragment.this.saveColor[0]));
          FUT092ColorFragment.this.tvColor.setTextColor(MyApp.rain_08curColor);
          MyApp.rain_08saturation = 0xFF & FUT092ColorFragment.this.saveSatData[0];
          FUT092ColorFragment.this.sb_saturation.setProgress(MyApp.rain_08saturation);
          FUT092ColorFragment.this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
          break;
          if ((paramAnonymousView == FUT092ColorFragment.ColorPicker.this.ivPoint2) && (FUT092ColorFragment.ColorPicker.this.ivPoint2.getDrawable() != null) && ((FUT092ColorFragment.ColorPicker.this.ivPoint2.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = FUT092ColorFragment.this.saveLightMode[1];
            arrayOfByte[5] = FUT092ColorFragment.this.saveSatData[1];
            arrayOfByte[6] = (byte)(0xFF & FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.saveColor[1]);
            arrayOfByte[7] = (byte)FUT092ColorFragment.this.saveseekBar[1];
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            if (FUT092ColorFragment.this.saveLightMode[1] == 1)
            {
              MyApp.lightmode = true;
              MyApp.rain_08kelvin = FUT092ColorFragment.this.saveSatData[1];
              FUT092ColorFragment.this.tvColor.setTextColor(FUT092ColorFragment.this.TempgetColor(MyApp.rain_08kelvin));
            }
            while (true)
            {
              MyApp.rain_08brightness = 0xFF & FUT092ColorFragment.this.saveseekBar[1];
              FUT092ColorFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT092ColorFragment.this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
              return;
              MyApp.lightmode = false;
              FUT092ColorFragment.this.disp_color.setText("RGB:" + (0xFF & FUT092ColorFragment.this.ColorData - (0xFF & FUT092ColorFragment.this.saveColor[1])));
              MyApp.rain_08curColor = FUT092ColorFragment.this.getColor((int)(1.411764705882353D * 0xFF & FUT092ColorFragment.this.saveColor[1]));
              FUT092ColorFragment.this.tvColor.setTextColor(MyApp.rain_08curColor);
              MyApp.rain_08saturation = 0xFF & FUT092ColorFragment.this.saveSatData[1];
              FUT092ColorFragment.this.sb_saturation.setProgress(MyApp.rain_08saturation);
              FUT092ColorFragment.this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
            }
          }
          if ((paramAnonymousView == FUT092ColorFragment.ColorPicker.this.ivPoint3) && (FUT092ColorFragment.ColorPicker.this.ivPoint3.getDrawable() != null) && ((FUT092ColorFragment.ColorPicker.this.ivPoint3.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = FUT092ColorFragment.this.saveLightMode[2];
            arrayOfByte[5] = FUT092ColorFragment.this.saveSatData[2];
            arrayOfByte[6] = (byte)(0xFF & FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.saveColor[2]);
            arrayOfByte[7] = (byte)FUT092ColorFragment.this.saveseekBar[2];
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            if (FUT092ColorFragment.this.saveLightMode[2] == 1)
            {
              MyApp.lightmode = true;
              MyApp.rain_08kelvin = FUT092ColorFragment.this.saveSatData[2];
              FUT092ColorFragment.this.tvColor.setTextColor(FUT092ColorFragment.this.TempgetColor(MyApp.rain_08kelvin));
            }
            while (true)
            {
              MyApp.rain_08brightness = 0xFF & FUT092ColorFragment.this.saveseekBar[2];
              FUT092ColorFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT092ColorFragment.this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
              return;
              MyApp.lightmode = false;
              FUT092ColorFragment.this.disp_color.setText("RGB:" + (0xFF & FUT092ColorFragment.this.ColorData - (0xFF & FUT092ColorFragment.this.saveColor[2])));
              MyApp.rain_08curColor = FUT092ColorFragment.this.getColor((int)(1.411764705882353D * 0xFF & FUT092ColorFragment.this.saveColor[2]));
              FUT092ColorFragment.this.tvColor.setTextColor(MyApp.rain_08curColor);
              MyApp.rain_08saturation = 0xFF & FUT092ColorFragment.this.saveSatData[2];
              FUT092ColorFragment.this.sb_saturation.setProgress(MyApp.rain_08saturation);
              FUT092ColorFragment.this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
            }
          }
          if ((paramAnonymousView == FUT092ColorFragment.ColorPicker.this.ivPoint4) && (FUT092ColorFragment.ColorPicker.this.ivPoint4.getDrawable() != null) && ((FUT092ColorFragment.ColorPicker.this.ivPoint4.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = FUT092ColorFragment.this.saveLightMode[3];
            arrayOfByte[5] = FUT092ColorFragment.this.saveSatData[3];
            arrayOfByte[6] = (byte)(0xFF & FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.saveColor[3]);
            arrayOfByte[7] = (byte)FUT092ColorFragment.this.saveseekBar[3];
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            if (FUT092ColorFragment.this.saveLightMode[3] == 1)
            {
              MyApp.lightmode = true;
              MyApp.rain_08kelvin = FUT092ColorFragment.this.saveSatData[3];
              FUT092ColorFragment.this.tvColor.setTextColor(FUT092ColorFragment.this.TempgetColor(MyApp.rain_08kelvin));
            }
            while (true)
            {
              MyApp.rain_08brightness = 0xFF & FUT092ColorFragment.this.saveseekBar[3];
              FUT092ColorFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT092ColorFragment.this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
              return;
              MyApp.lightmode = false;
              FUT092ColorFragment.this.disp_color.setText("RGB:" + (0xFF & FUT092ColorFragment.this.ColorData - (0xFF & FUT092ColorFragment.this.saveColor[3])));
              MyApp.rain_08curColor = FUT092ColorFragment.this.getColor((int)(1.411764705882353D * 0xFF & FUT092ColorFragment.this.saveColor[3]));
              FUT092ColorFragment.this.tvColor.setTextColor(MyApp.rain_08curColor);
              MyApp.rain_08saturation = 0xFF & FUT092ColorFragment.this.saveSatData[3];
              FUT092ColorFragment.this.sb_saturation.setProgress(MyApp.rain_08saturation);
              FUT092ColorFragment.this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
            }
          }
        }
        while ((paramAnonymousView != FUT092ColorFragment.ColorPicker.this.ivPoint5) || (FUT092ColorFragment.ColorPicker.this.ivPoint5.getDrawable() == null) || (!(FUT092ColorFragment.ColorPicker.this.ivPoint5.getDrawable() instanceof GradientDrawable)));
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = FUT092ColorFragment.this.saveLightMode[4];
        arrayOfByte[5] = FUT092ColorFragment.this.saveSatData[4];
        arrayOfByte[6] = (byte)(0xFF & FUT092ColorFragment.this.ColorData - FUT092ColorFragment.this.saveColor[4]);
        arrayOfByte[7] = (byte)FUT092ColorFragment.this.saveseekBar[4];
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        if (FUT092ColorFragment.this.saveLightMode[4] == 1)
        {
          MyApp.lightmode = true;
          MyApp.rain_08kelvin = FUT092ColorFragment.this.saveSatData[4];
          FUT092ColorFragment.this.tvColor.setTextColor(FUT092ColorFragment.this.TempgetColor(MyApp.rain_08kelvin));
        }
        while (true)
        {
          MyApp.rain_08brightness = 0xFF & FUT092ColorFragment.this.saveseekBar[4];
          FUT092ColorFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ColorFragment.this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
          return;
          MyApp.lightmode = false;
          FUT092ColorFragment.this.disp_color.setText("RGB:" + (0xFF & FUT092ColorFragment.this.ColorData - (0xFF & FUT092ColorFragment.this.saveColor[4])));
          MyApp.rain_08curColor = FUT092ColorFragment.this.getColor((int)(1.411764705882353D * 0xFF & FUT092ColorFragment.this.saveColor[4]));
          FUT092ColorFragment.this.tvColor.setTextColor(MyApp.rain_08curColor);
          MyApp.rain_08saturation = 0xFF & FUT092ColorFragment.this.saveSatData[4];
          FUT092ColorFragment.this.sb_saturation.setProgress(MyApp.rain_08saturation);
          FUT092ColorFragment.this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
        }
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
        if (paramAnonymousView == FUT092ColorFragment.ColorPicker.this.ivPoint1)
          FUT092ColorFragment.ColorPicker.this.showDelPop(FUT092ColorFragment.ColorPicker.this.ivPoint1);
        while (true)
        {
          return true;
          if (paramAnonymousView == FUT092ColorFragment.ColorPicker.this.ivPoint2)
            FUT092ColorFragment.ColorPicker.this.showDelPop(FUT092ColorFragment.ColorPicker.this.ivPoint2);
          else if (paramAnonymousView == FUT092ColorFragment.ColorPicker.this.ivPoint3)
            FUT092ColorFragment.ColorPicker.this.showDelPop(FUT092ColorFragment.ColorPicker.this.ivPoint3);
          else if (paramAnonymousView == FUT092ColorFragment.ColorPicker.this.ivPoint4)
            FUT092ColorFragment.ColorPicker.this.showDelPop(FUT092ColorFragment.ColorPicker.this.ivPoint4);
          else if (paramAnonymousView == FUT092ColorFragment.ColorPicker.this.ivPoint5)
            FUT092ColorFragment.ColorPicker.this.showDelPop(FUT092ColorFragment.ColorPicker.this.ivPoint5);
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
      label145: GradientDrawable localGradientDrawable;
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
          break label552;
        if (localImageView != null)
        {
          localGradientDrawable = new GradientDrawable();
          if (!MyApp.lightmode)
            break label595;
          localGradientDrawable.setColor(FUT092ColorFragment.this.TempgetColor(MyApp.rain_08kelvin));
          label180: localGradientDrawable.setCornerRadius(this.context.getResources().getDimension(R.dimen.color_point_radius));
          localImageView.setImageDrawable(localGradientDrawable);
          if (!MyApp.lightmode)
            break label604;
          FUT092ColorFragment.this.saveLightMode[k] = 1;
          FUT092ColorFragment.this.saveColor[k] = 0;
          FUT092ColorFragment.this.saveseekBar[k] = (byte)MyApp.rain_08brightness;
          FUT092ColorFragment.this.saveSatData[k] = (byte)MyApp.rain_08kelvin;
          label260: if (k != 0)
            break label663;
          localwifi_light.device1 = FUT092ColorFragment.this.saveLightMode[k];
          localwifi_light.wifilight_s1 = FUT092ColorFragment.this.saveSatData[k];
          localwifi_light.wifilight_ang1 = FUT092ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b1 = FUT092ColorFragment.this.saveseekBar[k];
        }
      }
      while (true)
      {
        MyApp.deviceService.wifiLight_edit(localwifi_light);
        return;
        localwifi_light.mac = str;
        localwifi_light.device1 = "0";
        localwifi_light.device2 = "0";
        localwifi_light.device3 = "0";
        localwifi_light.device4 = "0";
        localwifi_light.device5 = "0";
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
        localwifi_light.wifilight_s1 = "0";
        localwifi_light.wifilight_s2 = "0";
        localwifi_light.wifilight_s3 = "0";
        localwifi_light.wifilight_s4 = "0";
        localwifi_light.wifilight_s5 = "0";
        MyApp.deviceService.wifiLight_addDevice(localwifi_light);
        Log.d("debug", "tab1 database false");
        Log.d("debug", "tab1_device" + localwifi_light.toString());
        break;
        label552: Drawable localDrawable = arrayOfImageView[i].getDrawable();
        if ((localDrawable == null) || (!(localDrawable instanceof GradientDrawable)))
        {
          localImageView = arrayOfImageView[i];
          k = i;
          break label145;
        }
        i++;
        break label127;
        label595: localGradientDrawable.setColor(paramInt);
        break label180;
        label604: FUT092ColorFragment.this.saveLightMode[k] = 0;
        FUT092ColorFragment.this.saveColor[k] = FUT092ColorFragment.this.CircularColor;
        FUT092ColorFragment.this.saveseekBar[k] = (byte)MyApp.rain_08brightness;
        FUT092ColorFragment.this.saveSatData[k] = (byte)MyApp.rain_08saturation;
        break label260;
        label663: if (k == 1)
        {
          localwifi_light.device2 = FUT092ColorFragment.this.saveLightMode[k];
          localwifi_light.wifilight_s2 = FUT092ColorFragment.this.saveSatData[k];
          localwifi_light.wifilight_ang2 = FUT092ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b2 = FUT092ColorFragment.this.saveseekBar[k];
        }
        else if (k == 2)
        {
          localwifi_light.device3 = FUT092ColorFragment.this.saveLightMode[k];
          localwifi_light.wifilight_s3 = FUT092ColorFragment.this.saveSatData[k];
          localwifi_light.wifilight_ang3 = FUT092ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b3 = FUT092ColorFragment.this.saveseekBar[k];
        }
        else if (k == 3)
        {
          localwifi_light.device4 = FUT092ColorFragment.this.saveLightMode[k];
          localwifi_light.wifilight_s4 = FUT092ColorFragment.this.saveSatData[k];
          localwifi_light.wifilight_ang4 = FUT092ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b4 = FUT092ColorFragment.this.saveseekBar[k];
        }
        else if (k == 4)
        {
          localwifi_light.device5 = FUT092ColorFragment.this.saveLightMode[k];
          localwifi_light.wifilight_s5 = FUT092ColorFragment.this.saveSatData[k];
          localwifi_light.wifilight_ang5 = FUT092ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b5 = FUT092ColorFragment.this.saveseekBar[k];
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
            if (paramImageView != FUT092ColorFragment.ColorPicker.this.ivPoint1)
              break label135;
            localwifi_light.device1 = "0";
            localwifi_light.wifilight_s1 = "0";
            localwifi_light.wifilight_ang1 = "0";
            localwifi_light.wifilight_b1 = "0";
          }
          while (true)
          {
            MyApp.deviceService.wifiLight_edit(localwifi_light);
            paramImageView.setImageResource(R.drawable.transparent);
            localPopupWindow.dismiss();
            return;
            label135: if (paramImageView == FUT092ColorFragment.ColorPicker.this.ivPoint2)
            {
              localwifi_light.device2 = "0";
              localwifi_light.wifilight_s2 = "0";
              localwifi_light.wifilight_ang2 = "0";
              localwifi_light.wifilight_b2 = "0";
            }
            else if (paramImageView == FUT092ColorFragment.ColorPicker.this.ivPoint3)
            {
              localwifi_light.device3 = "0";
              localwifi_light.wifilight_s3 = "0";
              localwifi_light.wifilight_ang3 = "0";
              localwifi_light.wifilight_b3 = "0";
            }
            else if (paramImageView == FUT092ColorFragment.ColorPicker.this.ivPoint4)
            {
              localwifi_light.device4 = "0";
              localwifi_light.wifilight_s4 = "0";
              localwifi_light.wifilight_ang4 = "0";
              localwifi_light.wifilight_b4 = "0";
            }
            else if (paramImageView == FUT092ColorFragment.ColorPicker.this.ivPoint5)
            {
              localwifi_light.device5 = "0";
              localwifi_light.wifilight_s5 = "0";
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
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ColorFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */