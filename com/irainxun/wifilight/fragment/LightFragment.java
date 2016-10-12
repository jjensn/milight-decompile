package com.irainxun.wifilight.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.LayerDrawable;
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
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifi_light;
import com.irainxun.wifilight.util.ActivityUtil;
import com.irainxun.wifilight.view.wifilightPopM;
import com.irainxun.wifilight.xlink.Circular;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

public class LightFragment extends Fragment
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
  private SeekBar LightSetting;
  private int SendColorData = 0;
  private final String TAG = getClass().getSimpleName();
  private boolean beepFlag = false;
  private int beepdata = 0;
  private boolean cirleSendDataFlag = false;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      MyApp.PlalyKeySound();
      if (paramAnonymousView == LightFragment.this.tvM)
        new wifilightPopM(LightFragment.this.getActivity()).show(LightFragment.this.tvM, null);
      do
      {
        return;
        if (paramAnonymousView == LightFragment.this.ivAddColor)
        {
          LightFragment.this.colorPickerUtil.addColorPoint(LightFragment.this.curColor);
          return;
        }
      }
      while (paramAnonymousView != LightFragment.this.tvColor);
      byte[] arrayOfByte = new byte[12];
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = 0;
      arrayOfByte[4] = 3;
      arrayOfByte[5] = 5;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = 1;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      LightFragment.this.tvColor.setTextColor(-1);
      LightFragment.this.lightmode = true;
    }
  };
  private int colorBoder;
  private View colorHandler;
  private ColorPicker colorPickerUtil;
  private int colorPickerW;
  private View colorView;
  private int[] colors = { -16777216, -1 };
  private int curColor;
  private TextView disp_brightness;
  private TextView disp_color;
  private Handler handler = new Handler();
  private Runnable initColor = new Runnable()
  {
    public void run()
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)LightFragment.this.colorHandler.getLayoutParams();
      int i = localLayoutParams.leftMargin + LightFragment.this.colorHandler.getWidth() / 2;
      int j = localLayoutParams.topMargin + LightFragment.this.colorHandler.getHeight() / 2;
      LightFragment.this.curColor = LightFragment.this.mGradualChangeBitmap.getPixel(i, j);
      LightFragment.this.tvColor.setTextColor(LightFragment.this.curColor);
    }
  };
  private ImageView ivAddColor;
  private boolean lightmode = false;
  private int longKeyMode = 128;
  private Bitmap mGradualChangeBitmap;
  Handler myHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      byte[] arrayOfByte = new byte[12];
      switch (paramAnonymousMessage.what)
      {
      default:
      case 4355:
      case 4354:
      case 4353:
      case 4356:
      case 1024:
      }
      while (true)
      {
        super.handleMessage(paramAnonymousMessage);
        return;
        LightFragment.this.sendSeekFlag = false;
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = 2;
        arrayOfByte[5] = (byte)LightFragment.this.seekbarData;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        continue;
        LightFragment.this.sendColorFlag = false;
        if (LightFragment.this.CirlgetData <= 3)
          LightFragment.this.CirlByte[LightFragment.this.CirlgetData] = (byte)LightFragment.this.SendColorData;
        if (LightFragment.this.CirlgetData < 4)
        {
          LightFragment localLightFragment2 = LightFragment.this;
          localLightFragment2.CirlgetData = (byte)(1 + localLightFragment2.CirlgetData);
        }
        Log.d("debug", "CirlgetData = " + LightFragment.this.CirlgetData);
        continue;
        if ((0x1 & LightFragment.this.longKeyMode) == 1)
        {
          Log.d("debug", "long key s-");
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 1;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = 1;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          LightFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x2 & LightFragment.this.longKeyMode) == 2)
        {
          Log.d("debug", "long key s+");
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 2;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = 1;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          LightFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x4 & LightFragment.this.longKeyMode) == 4)
        {
          Log.d("debug", "long key tvOn");
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 3;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = 1;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          LightFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x8 & LightFragment.this.longKeyMode) == 8)
        {
          Log.d("debug", "long key tvOff");
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 4;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = 1;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          LightFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          continue;
          LightFragment.this.cirleSendDataFlag = false;
          while (true)
          {
            if (LightFragment.this.CirlgetData >= 4)
            {
              LightFragment.this.CirlByte[3] = (byte)LightFragment.this.SendColorData;
              LightFragment.this.CirlgetData = 0;
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = 0;
              arrayOfByte[4] = 1;
              arrayOfByte[5] = (byte)(LightFragment.this.ColorData - (0xFF & LightFragment.this.CirlByte[0]));
              arrayOfByte[6] = (byte)(LightFragment.this.ColorData - (0xFF & LightFragment.this.CirlByte[1]));
              arrayOfByte[7] = (byte)(LightFragment.this.ColorData - (0xFF & LightFragment.this.CirlByte[2]));
              arrayOfByte[8] = (byte)(LightFragment.this.ColorData - (0xFF & LightFragment.this.CirlByte[3]));
              arrayOfByte[9] = 1;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              Log.d("debug", "send cirl data");
              break;
            }
            LightFragment.this.CirlByte[LightFragment.this.CirlgetData] = (byte)LightFragment.this.SendColorData;
            LightFragment localLightFragment1 = LightFragment.this;
            localLightFragment1.CirlgetData = (byte)(1 + localLightFragment1.CirlgetData);
          }
          LightFragment.this.beepFlag = false;
          if (LightFragment.this.beepdata != LightFragment.this.CircularColor)
          {
            LightFragment.this.beepdata = LightFragment.this.CircularColor;
            MyApp.PlalyKeySound();
          }
        }
      }
    }
  };
  private int[] saveColor = new int[5];
  private byte[] saveLightMode = new byte[5];
  private int[] saveseekBar = new int[5];
  private SeekBar sbLight;
  private int seekbarData = 0;
  private boolean sendColorFlag = false;
  private boolean sendSeekFlag = false;
  private View toolBar;
  private View.OnTouchListener touchListener = new View.OnTouchListener()
  {
    public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      byte[] arrayOfByte = new byte[12];
      int i = paramAnonymousMotionEvent.getAction();
      int j = (int)paramAnonymousMotionEvent.getX();
      int k = (int)paramAnonymousMotionEvent.getY();
      switch (i)
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
                if (paramAnonymousView != LightFragment.this.colorView)
                {
                  MyApp.PlalyKeySound();
                  paramAnonymousView.setBackgroundResource(R.drawable.light_btn_press);
                }
                if (paramAnonymousView == LightFragment.this.tvSDecr)
                {
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = 0;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 1;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = 1;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  LightFragment localLightFragment9 = LightFragment.this;
                  localLightFragment9.longKeyMode = (0x1 | localLightFragment9.longKeyMode);
                  LightFragment.this.myHandler.removeMessages(4353);
                  LightFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == LightFragment.this.tvSIncr)
                {
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = 0;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 2;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = 1;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  LightFragment localLightFragment8 = LightFragment.this;
                  localLightFragment8.longKeyMode = (0x2 | localLightFragment8.longKeyMode);
                  LightFragment.this.myHandler.removeMessages(4353);
                  LightFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == LightFragment.this.tvOn)
                {
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = 0;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 3;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = 1;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  LightFragment localLightFragment7 = LightFragment.this;
                  localLightFragment7.longKeyMode = (0x4 | localLightFragment7.longKeyMode);
                  LightFragment.this.myHandler.removeMessages(4353);
                  LightFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == LightFragment.this.tvOff)
                {
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = 0;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 4;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = 1;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  LightFragment localLightFragment6 = LightFragment.this;
                  localLightFragment6.longKeyMode = (0x8 | localLightFragment6.longKeyMode);
                  LightFragment.this.myHandler.removeMessages(4353);
                  LightFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
              }
              while (paramAnonymousView != LightFragment.this.colorView);
              LightFragment.this.sendColorFlag = false;
              LightFragment.this.cirleSendDataFlag = false;
              LightFragment.this.CirlgetData = 0;
              LightFragment.this.updateViewLocation(j, k);
              LightFragment.this.CirlByte[0] = (byte)LightFragment.this.SendColorData;
              LightFragment.this.CirlByte[1] = (byte)LightFragment.this.SendColorData;
              LightFragment.this.CirlByte[2] = (byte)LightFragment.this.SendColorData;
              LightFragment.this.CirlByte[3] = (byte)LightFragment.this.SendColorData;
              LightFragment.this.lightmode = false;
              return true;
            }
            while (paramAnonymousView != LightFragment.this.colorView);
            LightFragment.this.lightmode = false;
            LightFragment.this.updateViewLocation(j, k);
          }
          while (LightFragment.this.cirleSendDataFlag);
          LightFragment.this.cirleSendDataFlag = true;
          LightFragment.this.myHandler.removeMessages(4356);
          LightFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
          return true;
          if (paramAnonymousView == LightFragment.this.colorView)
            break;
          paramAnonymousView.setBackgroundResource(R.drawable.light_btn_nor);
          if (paramAnonymousView == LightFragment.this.tvSDecr)
          {
            LightFragment localLightFragment5 = LightFragment.this;
            localLightFragment5.longKeyMode = (0xFFFFFFFE & localLightFragment5.longKeyMode);
            return true;
          }
          if (paramAnonymousView == LightFragment.this.tvSIncr)
          {
            LightFragment localLightFragment4 = LightFragment.this;
            localLightFragment4.longKeyMode = (0xFFFFFFFD & localLightFragment4.longKeyMode);
            return true;
          }
          if (paramAnonymousView == LightFragment.this.tvOn)
          {
            LightFragment localLightFragment3 = LightFragment.this;
            localLightFragment3.longKeyMode = (0xFFFFFFFB & localLightFragment3.longKeyMode);
            return true;
          }
        }
        while (paramAnonymousView != LightFragment.this.tvOff);
        LightFragment localLightFragment2 = LightFragment.this;
        localLightFragment2.longKeyMode = (0xFFFFFFF7 & localLightFragment2.longKeyMode);
        return true;
      }
      while (paramAnonymousView != LightFragment.this.colorView);
      LightFragment.this.beepFlag = false;
      LightFragment.this.myHandler.removeMessages(4356);
      while (true)
      {
        if (LightFragment.this.CirlgetData >= 4)
        {
          LightFragment.this.CirlByte[3] = (byte)LightFragment.this.SendColorData;
          LightFragment.this.CirlgetData = 0;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)(LightFragment.this.ColorData - (0xFF & LightFragment.this.CirlByte[0]));
          arrayOfByte[6] = (byte)(LightFragment.this.ColorData - (0xFF & LightFragment.this.CirlByte[1]));
          arrayOfByte[7] = (byte)(LightFragment.this.ColorData - (0xFF & LightFragment.this.CirlByte[2]));
          arrayOfByte[8] = (byte)(LightFragment.this.ColorData - (0xFF & LightFragment.this.CirlByte[3]));
          arrayOfByte[9] = 1;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return true;
        }
        LightFragment.this.CirlByte[LightFragment.this.CirlgetData] = (byte)LightFragment.this.SendColorData;
        LightFragment localLightFragment1 = LightFragment.this;
        localLightFragment1.CirlgetData = (byte)(1 + localLightFragment1.CirlgetData);
      }
    }
  };
  private TextView tvColor;
  private TextView tvM;
  private TextView tvOff;
  private TextView tvOn;
  private TextView tvSDecr;
  private TextView tvSIncr;

  public LightFragment()
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

  private void setSeekBarProgressDrawable(int paramInt)
  {
    LayerDrawable localLayerDrawable = (LayerDrawable)this.sbLight.getProgressDrawable();
    GradientDrawable localGradientDrawable = (GradientDrawable)localLayerDrawable.getDrawable(0);
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = -16777216;
    arrayOfInt[1] = this.curColor;
    localGradientDrawable.setColors(arrayOfInt);
    localGradientDrawable.setGradientType(0);
    localGradientDrawable.setShape(0);
    localGradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
    this.sbLight.setProgressDrawable(localGradientDrawable);
    this.sbLight.setThumb(getResources().getDrawable(R.drawable.sb_handler));
    this.sbLight.setProgressDrawable(localLayerDrawable);
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
    int i2 = getResources().getDimensionPixelSize(R.dimen.color_inner_r_092);
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
    this.colors[1] = (0xFF000000 | this.curColor);
    if (this.tvM.getText().toString() != "M")
      this.tvM.setText("M");
    this.tvColor.setTextColor(this.curColor);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_light, null);
    this.colorView = localView.findViewById(R.id.bg_color);
    this.colorHandler = localView.findViewById(R.id.iv_color_handler);
    this.tvColor = ((TextView)localView.findViewById(R.id.tv_color));
    Typeface localTypeface = Typeface.createFromAsset(getActivity().getAssets(), "font/APARAJB.TTF");
    this.tvColor.setTypeface(localTypeface);
    this.LightSetting = ((SeekBar)localView.findViewById(R.id.sb_light));
    this.tvSDecr = ((TextView)localView.findViewById(R.id.tv_s_decr));
    this.tvSIncr = ((TextView)localView.findViewById(R.id.tv_s_incr));
    this.tvM = ((TextView)localView.findViewById(R.id.tv_m));
    this.tvOn = ((TextView)localView.findViewById(R.id.tv_on));
    this.tvOff = ((TextView)localView.findViewById(R.id.tv_off));
    this.disp_brightness = ((TextView)localView.findViewById(R.id.disp_brightness));
    this.disp_color = ((TextView)localView.findViewById(R.id.disp_color));
    this.sbLight = ((SeekBar)localView.findViewById(R.id.sb_light));
    this.seekbarData = 100;
    this.sbLight.setProgress(100);
    this.ivAddColor = ((ImageView)localView.findViewById(R.id.iv_add));
    this.colorPickerW = getResources().getDimensionPixelSize(R.dimen.colorpicker_w);
    this.colorBoder = getResources().getDimensionPixelSize(R.dimen.color_boder);
    this.mGradualChangeBitmap = Bitmap.createBitmap(this.colorPickerW, this.colorPickerW, Bitmap.Config.RGB_565);
    this.mGradualChangeBitmap.eraseColor(-1);
    Bitmap localBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bg_c1_color);
    new Canvas(this.mGradualChangeBitmap).drawBitmap(localBitmap, null, new Rect(0, 0, this.colorPickerW, this.colorPickerW), new Paint());
    this.handler.postDelayed(this.initColor, 100L);
    this.tvColor.setOnClickListener(this.clickListener);
    this.tvM.setOnClickListener(this.clickListener);
    this.ivAddColor.setOnClickListener(this.clickListener);
    this.tvSDecr.setOnTouchListener(this.touchListener);
    this.tvSIncr.setOnTouchListener(this.touchListener);
    this.tvOn.setOnTouchListener(this.touchListener);
    this.tvOff.setOnTouchListener(this.touchListener);
    this.colorView.setOnTouchListener(this.touchListener);
    this.colorPickerUtil = new ColorPicker(getActivity(), localView);
    setSeekBarProgressDrawable(-16777216, this.LightSetting);
    this.LightSetting.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousInt != LightFragment.this.seekbarData)
        {
          LightFragment.this.seekbarData = paramAnonymousInt;
          if (LightFragment.this.seekbarData == 0)
            LightFragment.this.seekbarData = 1;
          LightFragment.this.disp_brightness.setText("Brightness:" + LightFragment.this.seekbarData);
          if (!LightFragment.this.sendSeekFlag)
          {
            LightFragment.this.sendSeekFlag = true;
            LightFragment.this.myHandler.removeMessages(4355);
            LightFragment.this.myHandler.sendEmptyMessageDelayed(4355, 160L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if (LightFragment.this.LightSetting.getProgress() != LightFragment.this.seekbarData)
        {
          LightFragment.this.seekbarData = LightFragment.this.LightSetting.getProgress();
          if (LightFragment.this.seekbarData == 0)
            LightFragment.this.seekbarData = 1;
          LightFragment.this.disp_brightness.setText("Brightness:" + LightFragment.this.seekbarData);
          LightFragment.this.myHandler.removeMessages(4355);
          LightFragment.this.myHandler.sendEmptyMessageDelayed(4355, 10L);
        }
      }
    });
    this.seekbarData = 100;
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(0L);
    int i;
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
      if (i < 5);
    }
    else
    {
      return localView;
    }
    Log.d("debug", "saveseekBar[" + i + "]" + " = " + this.saveseekBar[i]);
    int j;
    if (this.saveseekBar[i] > 0)
    {
      j = (int)(360.0D * (1.0D * this.saveColor[i] / 255.0D));
      if (this.saveLightMode[i] != 1)
        break label942;
    }
    label942: for (int k = -1; ; k = getColor(j))
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
        if ((paramAnonymousView == LightFragment.ColorPicker.this.ivPoint1) && (LightFragment.ColorPicker.this.ivPoint1.getDrawable() != null) && ((LightFragment.ColorPicker.this.ivPoint1.getDrawable() instanceof GradientDrawable)))
        {
          MyApp.PlalyKeySound();
          arrayOfByte[0] = 63;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = LightFragment.this.saveLightMode[0];
          arrayOfByte[5] = (byte)(LightFragment.this.ColorData - LightFragment.this.saveColor[0]);
          arrayOfByte[6] = (byte)LightFragment.this.saveseekBar[0];
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = 1;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          LightFragment.this.seekbarData = (0xFF & LightFragment.this.saveseekBar[0]);
          LightFragment.this.LightSetting.setProgress(LightFragment.this.seekbarData);
          LightFragment.this.disp_color.setText("RGB:" + (0xFF & LightFragment.this.ColorData - LightFragment.this.saveColor[0]));
        }
        do
        {
          return;
          if ((paramAnonymousView == LightFragment.ColorPicker.this.ivPoint2) && (LightFragment.ColorPicker.this.ivPoint2.getDrawable() != null) && ((LightFragment.ColorPicker.this.ivPoint2.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = 0;
            arrayOfByte[4] = LightFragment.this.saveLightMode[1];
            arrayOfByte[5] = (byte)(LightFragment.this.ColorData - LightFragment.this.saveColor[1]);
            arrayOfByte[6] = (byte)LightFragment.this.saveseekBar[1];
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = 1;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            LightFragment.this.seekbarData = (0xFF & LightFragment.this.saveseekBar[1]);
            LightFragment.this.LightSetting.setProgress(LightFragment.this.seekbarData);
            LightFragment.this.disp_color.setText("RGB:" + (0xFF & LightFragment.this.ColorData - LightFragment.this.saveColor[1]));
            return;
          }
          if ((paramAnonymousView == LightFragment.ColorPicker.this.ivPoint3) && (LightFragment.ColorPicker.this.ivPoint3.getDrawable() != null) && ((LightFragment.ColorPicker.this.ivPoint3.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = 0;
            arrayOfByte[4] = LightFragment.this.saveLightMode[2];
            arrayOfByte[5] = (byte)(LightFragment.this.ColorData - LightFragment.this.saveColor[2]);
            arrayOfByte[6] = (byte)LightFragment.this.saveseekBar[2];
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = 1;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            LightFragment.this.seekbarData = (0xFF & LightFragment.this.saveseekBar[2]);
            LightFragment.this.LightSetting.setProgress(LightFragment.this.seekbarData);
            LightFragment.this.disp_color.setText("RGB:" + (0xFF & LightFragment.this.ColorData - LightFragment.this.saveColor[2]));
            return;
          }
          if ((paramAnonymousView == LightFragment.ColorPicker.this.ivPoint4) && (LightFragment.ColorPicker.this.ivPoint4.getDrawable() != null) && ((LightFragment.ColorPicker.this.ivPoint4.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = 0;
            arrayOfByte[4] = LightFragment.this.saveLightMode[3];
            arrayOfByte[5] = (byte)(LightFragment.this.ColorData - LightFragment.this.saveColor[3]);
            arrayOfByte[6] = (byte)LightFragment.this.saveseekBar[3];
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = 1;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            LightFragment.this.seekbarData = (0xFF & LightFragment.this.saveseekBar[3]);
            LightFragment.this.LightSetting.setProgress(LightFragment.this.seekbarData);
            LightFragment.this.disp_color.setText("RGB:" + (0xFF & LightFragment.this.ColorData - LightFragment.this.saveColor[3]));
            return;
          }
        }
        while ((paramAnonymousView != LightFragment.ColorPicker.this.ivPoint5) || (LightFragment.ColorPicker.this.ivPoint5.getDrawable() == null) || (!(LightFragment.ColorPicker.this.ivPoint5.getDrawable() instanceof GradientDrawable)));
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = LightFragment.this.saveLightMode[4];
        arrayOfByte[5] = (byte)(LightFragment.this.ColorData - LightFragment.this.saveColor[4]);
        arrayOfByte[6] = (byte)LightFragment.this.saveseekBar[4];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        LightFragment.this.seekbarData = (0xFF & LightFragment.this.saveseekBar[4]);
        LightFragment.this.LightSetting.setProgress(LightFragment.this.seekbarData);
        LightFragment.this.disp_color.setText("RGB:" + (0xFF & LightFragment.this.ColorData - LightFragment.this.saveColor[4]));
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
        if (paramAnonymousView == LightFragment.ColorPicker.this.ivPoint1)
          LightFragment.ColorPicker.this.showDelPop(LightFragment.ColorPicker.this.ivPoint1);
        while (true)
        {
          return true;
          if (paramAnonymousView == LightFragment.ColorPicker.this.ivPoint2)
            LightFragment.ColorPicker.this.showDelPop(LightFragment.ColorPicker.this.ivPoint2);
          else if (paramAnonymousView == LightFragment.ColorPicker.this.ivPoint3)
            LightFragment.ColorPicker.this.showDelPop(LightFragment.ColorPicker.this.ivPoint3);
          else if (paramAnonymousView == LightFragment.ColorPicker.this.ivPoint4)
            LightFragment.ColorPicker.this.showDelPop(LightFragment.ColorPicker.this.ivPoint4);
          else if (paramAnonymousView == LightFragment.ColorPicker.this.ivPoint5)
            LightFragment.ColorPicker.this.showDelPop(LightFragment.ColorPicker.this.ivPoint5);
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
      String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(0L);
      ImageView[] arrayOfImageView;
      int i;
      label124: int k;
      ImageView localImageView;
      label142: GradientDrawable localGradientDrawable;
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
          break label486;
        if (localImageView != null)
        {
          localGradientDrawable = new GradientDrawable();
          if (!LightFragment.this.lightmode)
            break label529;
          localGradientDrawable.setColor(-1);
          label172: localGradientDrawable.setCornerRadius(this.context.getResources().getDimension(R.dimen.color_point_radius));
          localImageView.setImageDrawable(localGradientDrawable);
          if (!LightFragment.this.lightmode)
            break label538;
          LightFragment.this.saveLightMode[k] = 1;
          label217: LightFragment.this.saveColor[k] = LightFragment.this.CircularColor;
          LightFragment.this.saveseekBar[k] = LightFragment.this.seekbarData;
          if (k != 0)
            break label552;
          localwifi_light.device1 = LightFragment.this.saveLightMode[k];
          localwifi_light.wifilight_ang1 = LightFragment.this.saveColor[k];
          localwifi_light.wifilight_b1 = LightFragment.this.saveseekBar[k];
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
        MyApp.deviceService.wifiLight_addDevice(localwifi_light);
        Log.d("debug", "tab1 database false");
        Log.d("debug", "tab1_device" + localwifi_light.toString());
        break;
        label486: Drawable localDrawable = arrayOfImageView[i].getDrawable();
        if ((localDrawable == null) || (!(localDrawable instanceof GradientDrawable)))
        {
          localImageView = arrayOfImageView[i];
          k = i;
          break label142;
        }
        i++;
        break label124;
        label529: localGradientDrawable.setColor(paramInt);
        break label172;
        label538: LightFragment.this.saveLightMode[k] = 0;
        break label217;
        label552: if (k == 1)
        {
          localwifi_light.device2 = LightFragment.this.saveLightMode[k];
          localwifi_light.wifilight_ang2 = LightFragment.this.saveColor[k];
          localwifi_light.wifilight_b2 = LightFragment.this.saveseekBar[k];
        }
        else if (k == 2)
        {
          localwifi_light.device3 = LightFragment.this.saveLightMode[k];
          localwifi_light.wifilight_ang3 = LightFragment.this.saveColor[k];
          localwifi_light.wifilight_b3 = LightFragment.this.saveseekBar[k];
        }
        else if (k == 3)
        {
          localwifi_light.device4 = LightFragment.this.saveLightMode[k];
          localwifi_light.wifilight_ang4 = LightFragment.this.saveColor[k];
          localwifi_light.wifilight_b4 = LightFragment.this.saveseekBar[k];
        }
        else if (k == 4)
        {
          localwifi_light.device5 = LightFragment.this.saveLightMode[k];
          localwifi_light.wifilight_ang5 = LightFragment.this.saveColor[k];
          localwifi_light.wifilight_b5 = LightFragment.this.saveseekBar[k];
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
          String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(0L);
          wifi_light localwifi_light;
          if (MyApp.deviceService.wifiLight_isDeviceExists(str))
          {
            new wifi_light();
            localwifi_light = MyApp.deviceService.tab1_getMyDevice(str);
            if (paramImageView != LightFragment.ColorPicker.this.ivPoint1)
              break label125;
            localwifi_light.device1 = "0";
            localwifi_light.wifilight_ang1 = "0";
            localwifi_light.wifilight_b1 = "0";
          }
          while (true)
          {
            MyApp.deviceService.wifiLight_edit(localwifi_light);
            paramImageView.setImageResource(R.drawable.transparent);
            localPopupWindow.dismiss();
            return;
            label125: if (paramImageView == LightFragment.ColorPicker.this.ivPoint2)
            {
              localwifi_light.device2 = "0";
              localwifi_light.wifilight_ang2 = "0";
              localwifi_light.wifilight_b2 = "0";
            }
            else if (paramImageView == LightFragment.ColorPicker.this.ivPoint3)
            {
              localwifi_light.device3 = "0";
              localwifi_light.wifilight_ang3 = "0";
              localwifi_light.wifilight_b3 = "0";
            }
            else if (paramImageView == LightFragment.ColorPicker.this.ivPoint4)
            {
              localwifi_light.device4 = "0";
              localwifi_light.wifilight_ang4 = "0";
              localwifi_light.wifilight_b4 = "0";
            }
            else if (paramImageView == LightFragment.ColorPicker.this.ivPoint5)
            {
              localwifi_light.device5 = "0";
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
 * Qualified Name:     com.irainxun.wifilight.fragment.LightFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */