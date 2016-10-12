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
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifi_light;
import com.irainxun.wifilight.database.zoneName;
import com.irainxun.wifilight.util.ActivityUtil;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.view.PopM;
import com.irainxun.wifilight.xlink.Circular;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class FUT956ColorFragment extends Fragment
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
  private Button btnAll;
  private Button btnMode;
  private Button btnNightLight;
  private Button btnOff;
  private Button btnOn;
  private boolean cirleSendDataFlag = false;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      MyApp.PlalyKeySound();
      if (paramAnonymousView == FUT956ColorFragment.this.btnMode)
        new PopM(FUT956ColorFragment.this.getActivity()).show(FUT956ColorFragment.this.btnMode, new PopupWindow.OnDismissListener()
        {
          public void onDismiss()
          {
            if (!FUT956ColorFragment.this.btnMode.getText().equals(FUT956ColorFragment.this.getString(R.string.modes)))
            {
              int i = FUT956ColorFragment.this.getResources().getDimensionPixelSize(R.dimen.dp5);
              int j = FUT956ColorFragment.this.getResources().getDimensionPixelSize(R.dimen.dp20);
              FUT956ColorFragment.this.btnMode.setPadding(0, i, j, 0);
            }
          }
        });
      do
      {
        return;
        if (paramAnonymousView == FUT956ColorFragment.this.ivAddColor)
        {
          FUT956ColorFragment.this.colorPickerUtil.addColorPoint(FUT956ColorFragment.this.curColor);
          return;
        }
        if (paramAnonymousView == FUT956ColorFragment.this.btnAll)
        {
          FUT956ColorFragment.this.groupUtil.selectAll(true);
          MyApp.rain_remo = 0;
          return;
        }
      }
      while (paramAnonymousView != FUT956ColorFragment.this.tvColor);
      byte[] arrayOfByte = new byte[12];
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 3;
      arrayOfByte[5] = 5;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      FUT956ColorFragment.this.tvColor.setTextColor(-1);
      FUT956ColorFragment.this.lightmode = true;
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
  private LinearLayout groupLayout;
  private GroupUtil groupUtil;
  private Handler handler = new Handler();
  private Runnable initColor = new Runnable()
  {
    public void run()
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)FUT956ColorFragment.this.colorHandler.getLayoutParams();
      int i = localLayoutParams.leftMargin + FUT956ColorFragment.this.colorHandler.getWidth() / 2;
      int j = localLayoutParams.topMargin + FUT956ColorFragment.this.colorHandler.getHeight() / 2;
      FUT956ColorFragment.this.curColor = FUT956ColorFragment.this.mGradualChangeBitmap.getPixel(i, j);
      FUT956ColorFragment.this.tvColor.setTextColor(FUT956ColorFragment.this.curColor);
    }
  };
  private ImageView ivAddColor;
  private boolean lightmode = false;
  private int longKeyMode;
  private Bitmap mGradualChangeBitmap;
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
      case 4355:
      case 4353:
      case 1024:
      }
      while (true)
      {
        super.handleMessage(paramAnonymousMessage);
        return;
        FUT956ColorFragment.this.sendColorFlag = false;
        FUT956ColorFragment.this.CirlByte[FUT956ColorFragment.this.CirlgetData] = (byte)FUT956ColorFragment.this.SendColorData;
        if (FUT956ColorFragment.this.CirlgetData < 4)
        {
          FUT956ColorFragment localFUT956ColorFragment2 = FUT956ColorFragment.this;
          localFUT956ColorFragment2.CirlgetData = (byte)(1 + localFUT956ColorFragment2.CirlgetData);
        }
        Log.d("debug", "CirlgetData = " + FUT956ColorFragment.this.CirlgetData);
        continue;
        FUT956ColorFragment.this.cirleSendDataFlag = false;
        while (true)
        {
          if (FUT956ColorFragment.this.CirlgetData >= 4)
          {
            FUT956ColorFragment.this.CirlByte[3] = (byte)FUT956ColorFragment.this.SendColorData;
            FUT956ColorFragment.this.CirlgetData = 0;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = (byte)(FUT956ColorFragment.this.ColorData - (0xFF & FUT956ColorFragment.this.CirlByte[0]));
            arrayOfByte[6] = (byte)(FUT956ColorFragment.this.ColorData - (0xFF & FUT956ColorFragment.this.CirlByte[1]));
            arrayOfByte[7] = (byte)(FUT956ColorFragment.this.ColorData - (0xFF & FUT956ColorFragment.this.CirlByte[2]));
            arrayOfByte[8] = (byte)(FUT956ColorFragment.this.ColorData - (0xFF & FUT956ColorFragment.this.CirlByte[3]));
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            Log.d("debug", "send cirl data");
            break;
          }
          FUT956ColorFragment.this.CirlByte[FUT956ColorFragment.this.CirlgetData] = (byte)FUT956ColorFragment.this.SendColorData;
          FUT956ColorFragment localFUT956ColorFragment1 = FUT956ColorFragment.this;
          localFUT956ColorFragment1.CirlgetData = (byte)(1 + localFUT956ColorFragment1.CirlgetData);
        }
        FUT956ColorFragment.this.sb_lightFlag = false;
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 2;
        arrayOfByte[5] = (byte)FUT956ColorFragment.this.sb_lightData;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        continue;
        if ((0x2 & FUT956ColorFragment.this.longKeyMode) == 2)
        {
          Log.d("debug", "long key Night light");
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 6;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x4 & FUT956ColorFragment.this.longKeyMode) == 4)
        {
          Log.d("debug", "long key tvOn");
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 1;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x8 & FUT956ColorFragment.this.longKeyMode) == 8)
        {
          Log.d("debug", "long key tvOff");
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 2;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x1 & FUT956ColorFragment.this.longKeyMode) == 1)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 3;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x10 & FUT956ColorFragment.this.longKeyMode) == 16)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 4;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          continue;
          FUT956ColorFragment.this.beepFlag = false;
          if (FUT956ColorFragment.this.beepdata != FUT956ColorFragment.this.CircularColor)
          {
            FUT956ColorFragment.this.beepdata = FUT956ColorFragment.this.CircularColor;
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
                if (paramAnonymousView == FUT956ColorFragment.this.btnOn)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.k_btn_on_press);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 1;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT956ColorFragment localFUT956ColorFragment11 = FUT956ColorFragment.this;
                  localFUT956ColorFragment11.longKeyMode = (0x4 | localFUT956ColorFragment11.longKeyMode);
                  FUT956ColorFragment.this.myHandler.removeMessages(4353);
                  FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT956ColorFragment.this.btnOff)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.k_btn_off_press);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 2;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT956ColorFragment localFUT956ColorFragment10 = FUT956ColorFragment.this;
                  localFUT956ColorFragment10.longKeyMode = (0x8 | localFUT956ColorFragment10.longKeyMode);
                  FUT956ColorFragment.this.myHandler.removeMessages(4353);
                  FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT956ColorFragment.this.btnNightLight)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.k_btn_press);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 6;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT956ColorFragment localFUT956ColorFragment9 = FUT956ColorFragment.this;
                  localFUT956ColorFragment9.longKeyMode = (0x2 | localFUT956ColorFragment9.longKeyMode);
                  FUT956ColorFragment.this.myHandler.removeMessages(4353);
                  FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT956ColorFragment.this.colorView)
                {
                  FUT956ColorFragment.this.sendColorFlag = false;
                  FUT956ColorFragment.this.cirleSendDataFlag = false;
                  FUT956ColorFragment.this.CirlgetData = 0;
                  FUT956ColorFragment.this.updateViewLocation(i, j);
                  FUT956ColorFragment.this.CirlByte[0] = (byte)FUT956ColorFragment.this.SendColorData;
                  FUT956ColorFragment.this.CirlByte[1] = (byte)FUT956ColorFragment.this.SendColorData;
                  FUT956ColorFragment.this.CirlByte[2] = (byte)FUT956ColorFragment.this.SendColorData;
                  FUT956ColorFragment.this.CirlByte[3] = (byte)FUT956ColorFragment.this.SendColorData;
                  FUT956ColorFragment.this.lightmode = false;
                  return true;
                }
                if (paramAnonymousView == FUT956ColorFragment.this.speedADD)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_si_press);
                  FUT956ColorFragment localFUT956ColorFragment8 = FUT956ColorFragment.this;
                  localFUT956ColorFragment8.longKeyMode = (0x1 | localFUT956ColorFragment8.longKeyMode);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 3;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT956ColorFragment.this.myHandler.removeMessages(4353);
                  FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
              }
              while (paramAnonymousView != FUT956ColorFragment.this.speedDEC);
              paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_sd_press);
              FUT956ColorFragment localFUT956ColorFragment7 = FUT956ColorFragment.this;
              localFUT956ColorFragment7.longKeyMode = (0x10 | localFUT956ColorFragment7.longKeyMode);
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 3;
              arrayOfByte[5] = 4;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT956ColorFragment.this.myHandler.removeMessages(4353);
              FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
              return true;
            }
            while (paramAnonymousView != FUT956ColorFragment.this.colorView);
            FUT956ColorFragment.this.lightmode = false;
            FUT956ColorFragment.this.updateViewLocation(i, j);
          }
          while (FUT956ColorFragment.this.cirleSendDataFlag);
          FUT956ColorFragment.this.cirleSendDataFlag = true;
          FUT956ColorFragment.this.myHandler.removeMessages(4356);
          FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
          return true;
          if (paramAnonymousView == FUT956ColorFragment.this.colorView)
            break;
          if (paramAnonymousView == FUT956ColorFragment.this.btnOn)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.k_btn_on_nor);
            FUT956ColorFragment localFUT956ColorFragment6 = FUT956ColorFragment.this;
            localFUT956ColorFragment6.longKeyMode = (0xFFFFFFFB & localFUT956ColorFragment6.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT956ColorFragment.this.btnOff)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.k_btn_off_nor);
            FUT956ColorFragment localFUT956ColorFragment5 = FUT956ColorFragment.this;
            localFUT956ColorFragment5.longKeyMode = (0xFFFFFFF7 & localFUT956ColorFragment5.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT956ColorFragment.this.btnNightLight)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.k_btn_nor);
            FUT956ColorFragment localFUT956ColorFragment4 = FUT956ColorFragment.this;
            localFUT956ColorFragment4.longKeyMode = (0xFFFFFFFD & localFUT956ColorFragment4.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT956ColorFragment.this.speedADD)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_si_nor);
            FUT956ColorFragment localFUT956ColorFragment3 = FUT956ColorFragment.this;
            localFUT956ColorFragment3.longKeyMode = (0xFFFFFFFE & localFUT956ColorFragment3.longKeyMode);
            return true;
          }
        }
        while (paramAnonymousView != FUT956ColorFragment.this.speedDEC);
        FUT956ColorFragment localFUT956ColorFragment2 = FUT956ColorFragment.this;
        localFUT956ColorFragment2.longKeyMode = (0xFFFFFFEF & localFUT956ColorFragment2.longKeyMode);
        paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_sd_nor);
        return true;
      }
      while (paramAnonymousView != FUT956ColorFragment.this.colorView);
      FUT956ColorFragment.this.beepFlag = false;
      FUT956ColorFragment.this.myHandler.removeMessages(4356);
      while (true)
      {
        if (FUT956ColorFragment.this.CirlgetData >= 4)
        {
          FUT956ColorFragment.this.CirlByte[3] = (byte)FUT956ColorFragment.this.SendColorData;
          FUT956ColorFragment.this.CirlgetData = 0;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)(FUT956ColorFragment.this.ColorData - (0xFF & FUT956ColorFragment.this.CirlByte[0]));
          arrayOfByte[6] = (byte)(FUT956ColorFragment.this.ColorData - (0xFF & FUT956ColorFragment.this.CirlByte[1]));
          arrayOfByte[7] = (byte)(FUT956ColorFragment.this.ColorData - (0xFF & FUT956ColorFragment.this.CirlByte[2]));
          arrayOfByte[8] = (byte)(FUT956ColorFragment.this.ColorData - (0xFF & FUT956ColorFragment.this.CirlByte[3]));
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return true;
        }
        FUT956ColorFragment.this.CirlByte[FUT956ColorFragment.this.CirlgetData] = (byte)FUT956ColorFragment.this.SendColorData;
        FUT956ColorFragment localFUT956ColorFragment1 = FUT956ColorFragment.this;
        localFUT956ColorFragment1.CirlgetData = (byte)(1 + localFUT956ColorFragment1.CirlgetData);
      }
    }
  };
  private int[] saveColor = new int[5];
  private byte[] saveLightMode = new byte[5];
  private int[] saveseekBar = new int[5];
  private SeekBar sb_light;
  private int sb_lightData;
  private boolean sb_lightFlag;
  private boolean sendColorFlag = false;
  private Button speedADD;
  private Button speedDEC;
  private TextView tvColor;

  public FUT956ColorFragment()
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
    Drawable localDrawable = this.sb_light.getProgressDrawable();
    if (!(localDrawable instanceof GradientDrawable));
    for (GradientDrawable localGradientDrawable = new GradientDrawable(); ; localGradientDrawable = (GradientDrawable)localDrawable)
    {
      int i = getResources().getDimensionPixelSize(R.dimen.dp20);
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = -16777216;
      arrayOfInt[1] = this.curColor;
      localGradientDrawable.setColors(arrayOfInt);
      localGradientDrawable.setGradientType(0);
      localGradientDrawable.setShape(0);
      localGradientDrawable.setCornerRadius(i);
      localGradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
      this.sb_light.setProgressDrawable(localGradientDrawable);
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
    this.tvColor.setTextColor(this.curColor);
    this.btnMode.setText(R.string.modes);
    int i5 = getResources().getDimensionPixelSize(R.dimen.dp5);
    int i6 = getResources().getDimensionPixelSize(R.dimen.dp8);
    this.btnMode.setPadding(0, i5, i6, 0);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut956_color, null);
    this.groupLayout = ((LinearLayout)localView.findViewById(R.id.group));
    this.btnMode = ((Button)localView.findViewById(R.id.btn_m));
    this.ivAddColor = ((ImageView)localView.findViewById(R.id.iv_add));
    this.btnAll = ((Button)localView.findViewById(R.id.btn_all));
    this.btnNightLight = ((Button)localView.findViewById(R.id.btn_night_light));
    this.btnOn = ((Button)localView.findViewById(R.id.btn_on));
    this.btnOff = ((Button)localView.findViewById(R.id.btn_off));
    this.colorView = localView.findViewById(R.id.bg_color);
    this.colorHandler = localView.findViewById(R.id.iv_color_handler);
    this.colorPickerW = getResources().getDimensionPixelSize(R.dimen.colorpicker_w);
    this.colorBoder = getResources().getDimensionPixelSize(R.dimen.color_boder);
    this.colorView.setOnTouchListener(this.ontouchlistener);
    this.disp_color = ((TextView)localView.findViewById(R.id.disp_color));
    this.disp_brightness = ((TextView)localView.findViewById(R.id.disp_brightness));
    this.speedADD = ((Button)localView.findViewById(R.id.btn_si));
    this.speedDEC = ((Button)localView.findViewById(R.id.btn_sd));
    this.ivAddColor.setOnClickListener(this.clickListener);
    this.btnAll.setOnClickListener(this.clickListener);
    this.btnNightLight.setOnTouchListener(this.ontouchlistener);
    this.btnOn.setOnTouchListener(this.ontouchlistener);
    this.btnOff.setOnTouchListener(this.ontouchlistener);
    this.speedADD.setOnTouchListener(this.ontouchlistener);
    this.speedDEC.setOnTouchListener(this.ontouchlistener);
    this.btnMode.setOnClickListener(this.clickListener);
    this.tvColor = ((TextView)localView.findViewById(R.id.tv_color));
    Typeface localTypeface = Typeface.createFromAsset(getActivity().getAssets(), "font/APARAJB.TTF");
    this.tvColor.setTypeface(localTypeface);
    this.tvColor.setOnClickListener(this.clickListener);
    this.mGradualChangeBitmap = Bitmap.createBitmap(this.colorPickerW, this.colorPickerW, Bitmap.Config.RGB_565);
    this.mGradualChangeBitmap.eraseColor(-1);
    Bitmap localBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bg_c1_color);
    new Canvas(this.mGradualChangeBitmap).drawBitmap(localBitmap, null, new Rect(0, 0, this.colorPickerW, this.colorPickerW), new Paint());
    this.handler.postDelayed(this.initColor, 100L);
    this.speedADD.setOnTouchListener(this.ontouchlistener);
    this.speedDEC.setOnTouchListener(this.ontouchlistener);
    this.sb_light = ((SeekBar)localView.findViewById(R.id.sb_light));
    this.sb_lightData = 100;
    this.sb_light.setProgress(100);
    setSeekBarProgressDrawable(-16777216, this.sb_light);
    this.sb_light.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (FUT956ColorFragment.this.sb_lightData != paramAnonymousInt)
        {
          FUT956ColorFragment.this.sb_lightData = paramAnonymousInt;
          if (FUT956ColorFragment.this.sb_lightData == 0)
            FUT956ColorFragment.this.sb_lightData = 1;
          FUT956ColorFragment.this.disp_brightness.setText("Brightness:" + FUT956ColorFragment.this.sb_lightData);
          if (!FUT956ColorFragment.this.sb_lightFlag)
          {
            FUT956ColorFragment.this.sb_lightFlag = true;
            FUT956ColorFragment.this.myHandler.removeMessages(4355);
            FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if (FUT956ColorFragment.this.sb_lightData != FUT956ColorFragment.this.sb_light.getProgress())
        {
          FUT956ColorFragment.this.sb_lightData = FUT956ColorFragment.this.sb_light.getProgress();
          if (FUT956ColorFragment.this.sb_lightData == 0)
            FUT956ColorFragment.this.sb_lightData = 1;
          FUT956ColorFragment.this.disp_brightness.setText("Brightness:" + FUT956ColorFragment.this.sb_lightData);
          FUT956ColorFragment.this.myHandler.removeMessages(4355);
          FUT956ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
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
      this.colorPickerUtil = new ColorPicker(getActivity(), localView);
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
        if (i < 5)
          break;
      }
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
        break label1299;
    }
    label1299: for (int k = -1; ; k = getColor(j))
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
        if ((paramAnonymousView == FUT956ColorFragment.ColorPicker.this.ivPoint1) && (FUT956ColorFragment.ColorPicker.this.ivPoint1.getDrawable() != null) && ((FUT956ColorFragment.ColorPicker.this.ivPoint1.getDrawable() instanceof GradientDrawable)))
        {
          MyApp.PlalyKeySound();
          arrayOfByte[0] = 63;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = FUT956ColorFragment.this.saveLightMode[0];
          arrayOfByte[5] = (byte)(FUT956ColorFragment.this.ColorData - FUT956ColorFragment.this.saveColor[0]);
          arrayOfByte[6] = (byte)FUT956ColorFragment.this.saveseekBar[0];
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          FUT956ColorFragment.this.sb_lightData = FUT956ColorFragment.this.saveseekBar[0];
          FUT956ColorFragment.this.sb_light.setProgress(FUT956ColorFragment.this.sb_lightData);
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          if (FUT956ColorFragment.this.saveLightMode[0] == 0)
            FUT956ColorFragment.this.disp_color.setText("RGB:" + (0xFF & FUT956ColorFragment.this.ColorData - FUT956ColorFragment.this.saveColor[0]));
          FUT956ColorFragment.this.disp_brightness.setText("Brightness:" + FUT956ColorFragment.this.sb_lightData);
        }
        do
        {
          return;
          if ((paramAnonymousView == FUT956ColorFragment.ColorPicker.this.ivPoint2) && (FUT956ColorFragment.ColorPicker.this.ivPoint2.getDrawable() != null) && ((FUT956ColorFragment.ColorPicker.this.ivPoint2.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = FUT956ColorFragment.this.saveLightMode[1];
            arrayOfByte[5] = (byte)(FUT956ColorFragment.this.ColorData - FUT956ColorFragment.this.saveColor[1]);
            arrayOfByte[6] = (byte)FUT956ColorFragment.this.saveseekBar[1];
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            FUT956ColorFragment.this.sb_lightData = FUT956ColorFragment.this.saveseekBar[1];
            FUT956ColorFragment.this.sb_light.setProgress(FUT956ColorFragment.this.sb_lightData);
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            if (FUT956ColorFragment.this.saveLightMode[1] == 0)
              FUT956ColorFragment.this.disp_color.setText("RGB:" + (0xFF & FUT956ColorFragment.this.ColorData - FUT956ColorFragment.this.saveColor[1]));
            FUT956ColorFragment.this.disp_brightness.setText("Brightness:" + FUT956ColorFragment.this.sb_lightData);
            return;
          }
          if ((paramAnonymousView == FUT956ColorFragment.ColorPicker.this.ivPoint3) && (FUT956ColorFragment.ColorPicker.this.ivPoint3.getDrawable() != null) && ((FUT956ColorFragment.ColorPicker.this.ivPoint3.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = FUT956ColorFragment.this.saveLightMode[2];
            arrayOfByte[5] = (byte)(FUT956ColorFragment.this.ColorData - FUT956ColorFragment.this.saveColor[2]);
            arrayOfByte[6] = (byte)FUT956ColorFragment.this.saveseekBar[2];
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            FUT956ColorFragment.this.sb_lightData = FUT956ColorFragment.this.saveseekBar[2];
            FUT956ColorFragment.this.sb_light.setProgress(FUT956ColorFragment.this.sb_lightData);
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            if (FUT956ColorFragment.this.saveLightMode[2] == 0)
              FUT956ColorFragment.this.disp_color.setText("RGB:" + (0xFF & FUT956ColorFragment.this.ColorData - FUT956ColorFragment.this.saveColor[2]));
            FUT956ColorFragment.this.disp_brightness.setText("Brightness:" + FUT956ColorFragment.this.sb_lightData);
            return;
          }
          if ((paramAnonymousView == FUT956ColorFragment.ColorPicker.this.ivPoint4) && (FUT956ColorFragment.ColorPicker.this.ivPoint4.getDrawable() != null) && ((FUT956ColorFragment.ColorPicker.this.ivPoint4.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = FUT956ColorFragment.this.saveLightMode[3];
            arrayOfByte[5] = (byte)(FUT956ColorFragment.this.ColorData - FUT956ColorFragment.this.saveColor[3]);
            arrayOfByte[6] = (byte)FUT956ColorFragment.this.saveseekBar[3];
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            FUT956ColorFragment.this.sb_lightData = FUT956ColorFragment.this.saveseekBar[3];
            FUT956ColorFragment.this.sb_light.setProgress(FUT956ColorFragment.this.sb_lightData);
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            if (FUT956ColorFragment.this.saveLightMode[3] == 0)
              FUT956ColorFragment.this.disp_color.setText("RGB:" + (0xFF & FUT956ColorFragment.this.ColorData - FUT956ColorFragment.this.saveColor[3]));
            FUT956ColorFragment.this.disp_brightness.setText("Brightness:" + FUT956ColorFragment.this.sb_lightData);
            return;
          }
        }
        while ((paramAnonymousView != FUT956ColorFragment.ColorPicker.this.ivPoint5) || (FUT956ColorFragment.ColorPicker.this.ivPoint5.getDrawable() == null) || (!(FUT956ColorFragment.ColorPicker.this.ivPoint5.getDrawable() instanceof GradientDrawable)));
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = FUT956ColorFragment.this.saveLightMode[4];
        arrayOfByte[5] = (byte)(FUT956ColorFragment.this.ColorData - FUT956ColorFragment.this.saveColor[4]);
        arrayOfByte[6] = (byte)FUT956ColorFragment.this.saveseekBar[4];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        FUT956ColorFragment.this.sb_lightData = FUT956ColorFragment.this.saveseekBar[4];
        FUT956ColorFragment.this.sb_light.setProgress(FUT956ColorFragment.this.sb_lightData);
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        if (FUT956ColorFragment.this.saveLightMode[4] == 0)
          FUT956ColorFragment.this.disp_color.setText("RGB:" + (0xFF & FUT956ColorFragment.this.ColorData - FUT956ColorFragment.this.saveColor[4]));
        FUT956ColorFragment.this.disp_brightness.setText("Brightness:" + FUT956ColorFragment.this.sb_lightData);
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
        if (paramAnonymousView == FUT956ColorFragment.ColorPicker.this.ivPoint1)
          FUT956ColorFragment.ColorPicker.this.showDelPop(FUT956ColorFragment.ColorPicker.this.ivPoint1);
        while (true)
        {
          return true;
          if (paramAnonymousView == FUT956ColorFragment.ColorPicker.this.ivPoint2)
            FUT956ColorFragment.ColorPicker.this.showDelPop(FUT956ColorFragment.ColorPicker.this.ivPoint2);
          else if (paramAnonymousView == FUT956ColorFragment.ColorPicker.this.ivPoint3)
            FUT956ColorFragment.ColorPicker.this.showDelPop(FUT956ColorFragment.ColorPicker.this.ivPoint3);
          else if (paramAnonymousView == FUT956ColorFragment.ColorPicker.this.ivPoint4)
            FUT956ColorFragment.ColorPicker.this.showDelPop(FUT956ColorFragment.ColorPicker.this.ivPoint4);
          else if (paramAnonymousView == FUT956ColorFragment.ColorPicker.this.ivPoint5)
            FUT956ColorFragment.ColorPicker.this.showDelPop(FUT956ColorFragment.ColorPicker.this.ivPoint5);
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
          break label489;
        if (localImageView != null)
        {
          localGradientDrawable = new GradientDrawable();
          if (!FUT956ColorFragment.this.lightmode)
            break label532;
          localGradientDrawable.setColor(-1);
          label175: localGradientDrawable.setCornerRadius(this.context.getResources().getDimension(R.dimen.color_point_radius));
          localImageView.setImageDrawable(localGradientDrawable);
          if (!FUT956ColorFragment.this.lightmode)
            break label541;
          FUT956ColorFragment.this.saveLightMode[k] = 1;
          label220: FUT956ColorFragment.this.saveColor[k] = FUT956ColorFragment.this.CircularColor;
          FUT956ColorFragment.this.saveseekBar[k] = FUT956ColorFragment.this.sb_lightData;
          if (k != 0)
            break label555;
          localwifi_light.device1 = FUT956ColorFragment.this.saveLightMode[k];
          localwifi_light.wifilight_ang1 = FUT956ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b1 = FUT956ColorFragment.this.saveseekBar[k];
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
        label489: Drawable localDrawable = arrayOfImageView[i].getDrawable();
        if ((localDrawable == null) || (!(localDrawable instanceof GradientDrawable)))
        {
          localImageView = arrayOfImageView[i];
          k = i;
          break label145;
        }
        i++;
        break label127;
        label532: localGradientDrawable.setColor(paramInt);
        break label175;
        label541: FUT956ColorFragment.this.saveLightMode[k] = 0;
        break label220;
        label555: if (k == 1)
        {
          localwifi_light.device2 = FUT956ColorFragment.this.saveLightMode[k];
          localwifi_light.wifilight_ang2 = FUT956ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b2 = FUT956ColorFragment.this.saveseekBar[k];
        }
        else if (k == 2)
        {
          localwifi_light.device3 = FUT956ColorFragment.this.saveLightMode[k];
          localwifi_light.wifilight_ang3 = FUT956ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b3 = FUT956ColorFragment.this.saveseekBar[k];
        }
        else if (k == 3)
        {
          localwifi_light.device4 = FUT956ColorFragment.this.saveLightMode[k];
          localwifi_light.wifilight_ang4 = FUT956ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b4 = FUT956ColorFragment.this.saveseekBar[k];
        }
        else if (k == 4)
        {
          localwifi_light.device5 = FUT956ColorFragment.this.saveLightMode[k];
          localwifi_light.wifilight_ang5 = FUT956ColorFragment.this.saveColor[k];
          localwifi_light.wifilight_b5 = FUT956ColorFragment.this.saveseekBar[k];
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
            if (paramImageView != FUT956ColorFragment.ColorPicker.this.ivPoint1)
              break label128;
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
            label128: if (paramImageView == FUT956ColorFragment.ColorPicker.this.ivPoint2)
            {
              localwifi_light.device2 = "0";
              localwifi_light.wifilight_ang2 = "0";
              localwifi_light.wifilight_b2 = "0";
            }
            else if (paramImageView == FUT956ColorFragment.ColorPicker.this.ivPoint3)
            {
              localwifi_light.device3 = "0";
              FUT956ColorFragment.ColorPicker.this.showDelPop(FUT956ColorFragment.ColorPicker.this.ivPoint3);
              localwifi_light.wifilight_ang3 = "0";
              localwifi_light.wifilight_b3 = "0";
            }
            else if (paramImageView == FUT956ColorFragment.ColorPicker.this.ivPoint4)
            {
              localwifi_light.device4 = "0";
              localwifi_light.wifilight_ang4 = "0";
              localwifi_light.wifilight_b4 = "0";
            }
            else if (paramImageView == FUT956ColorFragment.ColorPicker.this.ivPoint5)
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
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT956ColorFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */