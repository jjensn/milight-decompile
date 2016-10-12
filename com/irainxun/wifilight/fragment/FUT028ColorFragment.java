package com.irainxun.wifilight.fragment;

import android.app.Activity;
import android.app.Fragment;
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
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.view.PopM;
import com.irainxun.wifilight.xlink.Circular;
import com.irainxun.wifilight.xlink.MyApp;

public class FUT028ColorFragment extends Fragment
{
  private static final int buttonKeyEvent = 4353;
  private static final int buttonWeyEvent = 4357;
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
  private View bottomLayout;
  private Button btnMode;
  private Button btnOff;
  private Button btnOn;
  private Button btnSpeedDecr;
  private Button btnSpeedIncr;
  private boolean cirleSendDataFlag = false;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == FUT028ColorFragment.this.btnMode)
        new PopM(FUT028ColorFragment.this.getActivity()).show(FUT028ColorFragment.this.btnMode, new PopupWindow.OnDismissListener()
        {
          public void onDismiss()
          {
            if (!FUT028ColorFragment.this.btnMode.getText().equals(FUT028ColorFragment.this.getString(R.string.modes)))
            {
              int i = FUT028ColorFragment.this.getResources().getDimensionPixelSize(R.dimen.dp5);
              int j = FUT028ColorFragment.this.getResources().getDimensionPixelSize(R.dimen.dp20);
              FUT028ColorFragment.this.btnMode.setPadding(0, i, j, 0);
            }
          }
        });
    }
  };
  private int colorBoder;
  private View colorHandler;
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
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)FUT028ColorFragment.this.colorHandler.getLayoutParams();
      int i = localLayoutParams.leftMargin + FUT028ColorFragment.this.colorHandler.getWidth() / 2;
      int j = localLayoutParams.topMargin + FUT028ColorFragment.this.colorHandler.getHeight() / 2;
      FUT028ColorFragment.this.curColor = FUT028ColorFragment.this.mGradualChangeBitmap.getPixel(i, j);
      FUT028ColorFragment.this.tvColor.setTextColor(FUT028ColorFragment.this.curColor);
    }
  };
  private ImageView ivBDown;
  private ImageView ivBUp;
  private ImageView ivGDown;
  private ImageView ivGUp;
  private ImageView ivRDown;
  private ImageView ivRUp;
  private ImageView ivWDown;
  private ImageView ivWUp;
  private View.OnLayoutChangeListener layoutChangeListener = new View.OnLayoutChangeListener()
  {
    public void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
    {
      if (paramAnonymousInt4 != paramAnonymousInt8)
      {
        int i = (paramAnonymousInt4 - FUT028ColorFragment.this.btnOn.getBottom() - FUT028ColorFragment.this.bottomLayout.getHeight()) / 2;
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)FUT028ColorFragment.this.bottomLayout.getLayoutParams();
        if (localLayoutParams.bottomMargin != i)
        {
          localLayoutParams.bottomMargin = i;
          FUT028ColorFragment.this.bottomLayout.setLayoutParams(localLayoutParams);
        }
      }
    }
  };
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
      case 4357:
      case 1024:
      }
      while (true)
      {
        super.handleMessage(paramAnonymousMessage);
        return;
        FUT028ColorFragment.this.sendColorFlag = false;
        FUT028ColorFragment.this.CirlByte[FUT028ColorFragment.this.CirlgetData] = (byte)FUT028ColorFragment.this.SendColorData;
        if (FUT028ColorFragment.this.CirlgetData < 4)
        {
          FUT028ColorFragment localFUT028ColorFragment2 = FUT028ColorFragment.this;
          localFUT028ColorFragment2.CirlgetData = (byte)(1 + localFUT028ColorFragment2.CirlgetData);
        }
        Log.d("debug", "CirlgetData = " + FUT028ColorFragment.this.CirlgetData);
        continue;
        FUT028ColorFragment.this.cirleSendDataFlag = false;
        while (true)
        {
          if (FUT028ColorFragment.this.CirlgetData >= 4)
          {
            FUT028ColorFragment.this.CirlByte[3] = (byte)FUT028ColorFragment.this.SendColorData;
            FUT028ColorFragment.this.CirlgetData = 0;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = (byte)(FUT028ColorFragment.this.ColorData - (0xFF & FUT028ColorFragment.this.CirlByte[0]));
            arrayOfByte[6] = (byte)(FUT028ColorFragment.this.ColorData - (0xFF & FUT028ColorFragment.this.CirlByte[1]));
            arrayOfByte[7] = (byte)(FUT028ColorFragment.this.ColorData - (0xFF & FUT028ColorFragment.this.CirlByte[2]));
            arrayOfByte[8] = (byte)(FUT028ColorFragment.this.ColorData - (0xFF & FUT028ColorFragment.this.CirlByte[3]));
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            Log.d("debug", "send cirl data");
            break;
          }
          FUT028ColorFragment.this.CirlByte[FUT028ColorFragment.this.CirlgetData] = (byte)FUT028ColorFragment.this.SendColorData;
          FUT028ColorFragment localFUT028ColorFragment1 = FUT028ColorFragment.this;
          localFUT028ColorFragment1.CirlgetData = (byte)(1 + localFUT028ColorFragment1.CirlgetData);
        }
        FUT028ColorFragment.this.sb_lightFlag = false;
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 2;
        arrayOfByte[5] = (byte)FUT028ColorFragment.this.sb_lightData;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        continue;
        if ((0x4 & FUT028ColorFragment.this.longKeyMode) == 4)
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
          FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x8 & FUT028ColorFragment.this.longKeyMode) == 8)
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
          FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x1 & FUT028ColorFragment.this.longKeyMode) == 1)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 11;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x10 & FUT028ColorFragment.this.longKeyMode) == 16)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -125;
          arrayOfByte[5] = 12;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          continue;
          if ((0x1 & FUT028ColorFragment.this.wKeyMode) == 1)
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
            FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
          }
          else if ((0x2 & FUT028ColorFragment.this.wKeyMode) == 2)
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
            FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
          }
          else if ((0x4 & FUT028ColorFragment.this.wKeyMode) == 4)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -125;
            arrayOfByte[5] = 5;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
          }
          else if ((0x8 & FUT028ColorFragment.this.wKeyMode) == 8)
          {
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
            FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
          }
          else if ((0x10 & FUT028ColorFragment.this.wKeyMode) == 16)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -125;
            arrayOfByte[5] = 7;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
          }
          else if ((0x20 & FUT028ColorFragment.this.wKeyMode) == 32)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -125;
            arrayOfByte[5] = 8;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
          }
          else if ((0x40 & FUT028ColorFragment.this.wKeyMode) == 64)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -125;
            arrayOfByte[5] = 9;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
          }
          else if ((0x80 & FUT028ColorFragment.this.wKeyMode) == 128)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = -125;
            arrayOfByte[5] = 10;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
            continue;
            FUT028ColorFragment.this.beepFlag = false;
            if (FUT028ColorFragment.this.beepdata != FUT028ColorFragment.this.CircularColor)
            {
              FUT028ColorFragment.this.beepdata = FUT028ColorFragment.this.CircularColor;
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
                if (paramAnonymousView == FUT028ColorFragment.this.btnOn)
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
                  FUT028ColorFragment localFUT028ColorFragment25 = FUT028ColorFragment.this;
                  localFUT028ColorFragment25.longKeyMode = (0x4 | localFUT028ColorFragment25.longKeyMode);
                  FUT028ColorFragment.this.myHandler.removeMessages(4353);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.btnOff)
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
                  FUT028ColorFragment localFUT028ColorFragment24 = FUT028ColorFragment.this;
                  localFUT028ColorFragment24.longKeyMode = (0x8 | localFUT028ColorFragment24.longKeyMode);
                  FUT028ColorFragment.this.myHandler.removeMessages(4353);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.colorView)
                {
                  FUT028ColorFragment.this.sendColorFlag = false;
                  FUT028ColorFragment.this.cirleSendDataFlag = false;
                  FUT028ColorFragment.this.CirlgetData = 0;
                  FUT028ColorFragment.this.updateViewLocation(i, j);
                  FUT028ColorFragment.this.CirlByte[0] = (byte)FUT028ColorFragment.this.SendColorData;
                  FUT028ColorFragment.this.CirlByte[1] = (byte)FUT028ColorFragment.this.SendColorData;
                  FUT028ColorFragment.this.CirlByte[2] = (byte)FUT028ColorFragment.this.SendColorData;
                  FUT028ColorFragment.this.CirlByte[3] = (byte)FUT028ColorFragment.this.SendColorData;
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.btnSpeedIncr)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_si_press);
                  FUT028ColorFragment localFUT028ColorFragment23 = FUT028ColorFragment.this;
                  localFUT028ColorFragment23.longKeyMode = (0x1 | localFUT028ColorFragment23.longKeyMode);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 11;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT028ColorFragment.this.myHandler.removeMessages(4353);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.btnSpeedDecr)
                {
                  paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_sd_press);
                  FUT028ColorFragment localFUT028ColorFragment22 = FUT028ColorFragment.this;
                  localFUT028ColorFragment22.longKeyMode = (0x10 | localFUT028ColorFragment22.longKeyMode);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 12;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT028ColorFragment.this.myHandler.removeMessages(4353);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.ivWUp)
                {
                  FUT028ColorFragment.this.ivWUp.setImageResource(R.drawable.fut028_btn_au_press);
                  FUT028ColorFragment localFUT028ColorFragment21 = FUT028ColorFragment.this;
                  localFUT028ColorFragment21.wKeyMode = (0x1 | localFUT028ColorFragment21.wKeyMode);
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
                  FUT028ColorFragment.this.myHandler.removeMessages(4357);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.ivWDown)
                {
                  FUT028ColorFragment.this.ivWDown.setImageResource(R.drawable.fut028_btn_ad_press);
                  FUT028ColorFragment localFUT028ColorFragment20 = FUT028ColorFragment.this;
                  localFUT028ColorFragment20.wKeyMode = (0x2 | localFUT028ColorFragment20.wKeyMode);
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
                  FUT028ColorFragment.this.myHandler.removeMessages(4357);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.ivRUp)
                {
                  FUT028ColorFragment.this.ivRUp.setImageResource(R.drawable.fut028_btn_au_press);
                  FUT028ColorFragment localFUT028ColorFragment19 = FUT028ColorFragment.this;
                  localFUT028ColorFragment19.wKeyMode = (0x4 | localFUT028ColorFragment19.wKeyMode);
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
                  FUT028ColorFragment.this.myHandler.removeMessages(4357);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.ivRDown)
                {
                  FUT028ColorFragment.this.ivRDown.setImageResource(R.drawable.fut028_btn_ad_press);
                  FUT028ColorFragment localFUT028ColorFragment18 = FUT028ColorFragment.this;
                  localFUT028ColorFragment18.wKeyMode = (0x8 | localFUT028ColorFragment18.wKeyMode);
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
                  FUT028ColorFragment.this.myHandler.removeMessages(4357);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.ivGUp)
                {
                  FUT028ColorFragment.this.ivGUp.setImageResource(R.drawable.fut028_btn_au_press);
                  FUT028ColorFragment localFUT028ColorFragment17 = FUT028ColorFragment.this;
                  localFUT028ColorFragment17.wKeyMode = (0x10 | localFUT028ColorFragment17.wKeyMode);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 7;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT028ColorFragment.this.myHandler.removeMessages(4357);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.ivGDown)
                {
                  FUT028ColorFragment.this.ivGDown.setImageResource(R.drawable.fut028_btn_ad_press);
                  FUT028ColorFragment localFUT028ColorFragment16 = FUT028ColorFragment.this;
                  localFUT028ColorFragment16.wKeyMode = (0x20 | localFUT028ColorFragment16.wKeyMode);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 8;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT028ColorFragment.this.myHandler.removeMessages(4357);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 400L);
                  return true;
                }
                if (paramAnonymousView == FUT028ColorFragment.this.ivBUp)
                {
                  FUT028ColorFragment.this.ivBUp.setImageResource(R.drawable.fut028_btn_au_press);
                  FUT028ColorFragment localFUT028ColorFragment15 = FUT028ColorFragment.this;
                  localFUT028ColorFragment15.wKeyMode = (0x40 | localFUT028ColorFragment15.wKeyMode);
                  arrayOfByte[0] = 49;
                  arrayOfByte[1] = MyApp.PasswordByte[0];
                  arrayOfByte[2] = MyApp.PasswordByte[1];
                  arrayOfByte[3] = MyApp.rain_remoteID;
                  arrayOfByte[4] = 3;
                  arrayOfByte[5] = 9;
                  arrayOfByte[6] = 0;
                  arrayOfByte[7] = 0;
                  arrayOfByte[8] = 0;
                  arrayOfByte[9] = MyApp.rain_remo;
                  arrayOfByte[10] = 0;
                  arrayOfByte[11] = 0;
                  MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                  FUT028ColorFragment.this.myHandler.removeMessages(4357);
                  FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 400L);
                  return true;
                }
              }
              while (paramAnonymousView != FUT028ColorFragment.this.ivBDown);
              FUT028ColorFragment.this.ivBDown.setImageResource(R.drawable.fut028_btn_ad_press);
              FUT028ColorFragment localFUT028ColorFragment14 = FUT028ColorFragment.this;
              localFUT028ColorFragment14.wKeyMode = (0x80 | localFUT028ColorFragment14.wKeyMode);
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 3;
              arrayOfByte[5] = 10;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT028ColorFragment.this.myHandler.removeMessages(4357);
              FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 400L);
              return true;
            }
            while (paramAnonymousView != FUT028ColorFragment.this.colorView);
            FUT028ColorFragment.this.updateViewLocation(i, j);
          }
          while (FUT028ColorFragment.this.cirleSendDataFlag);
          FUT028ColorFragment.this.cirleSendDataFlag = true;
          FUT028ColorFragment.this.myHandler.removeMessages(4356);
          FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
          return true;
          if (paramAnonymousView == FUT028ColorFragment.this.colorView)
            break;
          if (paramAnonymousView == FUT028ColorFragment.this.btnOn)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.k_btn_on_nor);
            FUT028ColorFragment localFUT028ColorFragment13 = FUT028ColorFragment.this;
            localFUT028ColorFragment13.longKeyMode = (0xFFFFFFFB & localFUT028ColorFragment13.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT028ColorFragment.this.btnOff)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.k_btn_off_nor);
            FUT028ColorFragment localFUT028ColorFragment12 = FUT028ColorFragment.this;
            localFUT028ColorFragment12.longKeyMode = (0xFFFFFFF7 & localFUT028ColorFragment12.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT028ColorFragment.this.btnSpeedIncr)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_si_nor);
            FUT028ColorFragment localFUT028ColorFragment11 = FUT028ColorFragment.this;
            localFUT028ColorFragment11.longKeyMode = (0xFFFFFFFE & localFUT028ColorFragment11.longKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT028ColorFragment.this.btnSpeedDecr)
          {
            FUT028ColorFragment localFUT028ColorFragment10 = FUT028ColorFragment.this;
            localFUT028ColorFragment10.longKeyMode = (0xFFFFFFEF & localFUT028ColorFragment10.longKeyMode);
            paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_sd_nor);
            return true;
          }
          if (paramAnonymousView == FUT028ColorFragment.this.ivWUp)
          {
            FUT028ColorFragment.this.ivWUp.setImageResource(R.drawable.fut028_btn_au_nor);
            FUT028ColorFragment localFUT028ColorFragment9 = FUT028ColorFragment.this;
            localFUT028ColorFragment9.wKeyMode = (0xFFFFFFFE & localFUT028ColorFragment9.wKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT028ColorFragment.this.ivWDown)
          {
            FUT028ColorFragment.this.ivWDown.setImageResource(R.drawable.fut028_btn_ad_nor);
            FUT028ColorFragment localFUT028ColorFragment8 = FUT028ColorFragment.this;
            localFUT028ColorFragment8.wKeyMode = (0xFFFFFFFD & localFUT028ColorFragment8.wKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT028ColorFragment.this.ivRUp)
          {
            FUT028ColorFragment.this.ivRUp.setImageResource(R.drawable.fut028_btn_au_nor);
            FUT028ColorFragment localFUT028ColorFragment7 = FUT028ColorFragment.this;
            localFUT028ColorFragment7.wKeyMode = (0xFFFFFFFB & localFUT028ColorFragment7.wKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT028ColorFragment.this.ivRDown)
          {
            FUT028ColorFragment.this.ivRDown.setImageResource(R.drawable.fut028_btn_ad_nor);
            FUT028ColorFragment localFUT028ColorFragment6 = FUT028ColorFragment.this;
            localFUT028ColorFragment6.wKeyMode = (0xFFFFFFF7 & localFUT028ColorFragment6.wKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT028ColorFragment.this.ivGUp)
          {
            FUT028ColorFragment.this.ivGUp.setImageResource(R.drawable.fut028_btn_au_nor);
            FUT028ColorFragment localFUT028ColorFragment5 = FUT028ColorFragment.this;
            localFUT028ColorFragment5.wKeyMode = (0xFFFFFFEF & localFUT028ColorFragment5.wKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT028ColorFragment.this.ivGDown)
          {
            FUT028ColorFragment.this.ivGDown.setImageResource(R.drawable.fut028_btn_ad_nor);
            FUT028ColorFragment localFUT028ColorFragment4 = FUT028ColorFragment.this;
            localFUT028ColorFragment4.wKeyMode = (0xFFFFFFDF & localFUT028ColorFragment4.wKeyMode);
            return true;
          }
          if (paramAnonymousView == FUT028ColorFragment.this.ivBUp)
          {
            FUT028ColorFragment.this.ivBUp.setImageResource(R.drawable.fut028_btn_au_nor);
            FUT028ColorFragment localFUT028ColorFragment3 = FUT028ColorFragment.this;
            localFUT028ColorFragment3.wKeyMode = (0xFFFFFFBF & localFUT028ColorFragment3.wKeyMode);
            return true;
          }
        }
        while (paramAnonymousView != FUT028ColorFragment.this.ivBDown);
        FUT028ColorFragment.this.ivBDown.setImageResource(R.drawable.fut028_btn_ad_nor);
        FUT028ColorFragment localFUT028ColorFragment2 = FUT028ColorFragment.this;
        localFUT028ColorFragment2.wKeyMode = (0xFFFFFF7F & localFUT028ColorFragment2.wKeyMode);
        return true;
      }
      while (paramAnonymousView != FUT028ColorFragment.this.colorView);
      FUT028ColorFragment.this.beepFlag = false;
      FUT028ColorFragment.this.myHandler.removeMessages(4356);
      while (true)
      {
        if (FUT028ColorFragment.this.CirlgetData >= 4)
        {
          FUT028ColorFragment.this.CirlByte[3] = (byte)FUT028ColorFragment.this.SendColorData;
          FUT028ColorFragment.this.CirlgetData = 0;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 1;
          arrayOfByte[5] = (byte)(FUT028ColorFragment.this.ColorData - (0xFF & FUT028ColorFragment.this.CirlByte[0]));
          arrayOfByte[6] = (byte)(FUT028ColorFragment.this.ColorData - (0xFF & FUT028ColorFragment.this.CirlByte[1]));
          arrayOfByte[7] = (byte)(FUT028ColorFragment.this.ColorData - (0xFF & FUT028ColorFragment.this.CirlByte[2]));
          arrayOfByte[8] = (byte)(FUT028ColorFragment.this.ColorData - (0xFF & FUT028ColorFragment.this.CirlByte[3]));
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return true;
        }
        FUT028ColorFragment.this.CirlByte[FUT028ColorFragment.this.CirlgetData] = (byte)FUT028ColorFragment.this.SendColorData;
        FUT028ColorFragment localFUT028ColorFragment1 = FUT028ColorFragment.this;
        localFUT028ColorFragment1.CirlgetData = (byte)(1 + localFUT028ColorFragment1.CirlgetData);
      }
    }
  };
  private SeekBar sb_light;
  private int sb_lightData;
  private boolean sb_lightFlag;
  private boolean sendColorFlag = false;
  private TextView tvBrightness;
  private TextView tvColor;
  private TextView tvRGB;
  private int wKeyMode;

  public FUT028ColorFragment()
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
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut028_color, null);
    this.tvRGB = ((TextView)localView.findViewById(R.id.tv_rgb));
    this.tvBrightness = ((TextView)localView.findViewById(R.id.tv_brightness));
    this.btnOn = ((Button)localView.findViewById(R.id.btn_on));
    this.btnOff = ((Button)localView.findViewById(R.id.btn_off));
    this.btnSpeedDecr = ((Button)localView.findViewById(R.id.btn_sd));
    this.btnMode = ((Button)localView.findViewById(R.id.btn_m));
    this.btnSpeedIncr = ((Button)localView.findViewById(R.id.btn_si));
    this.ivWUp = ((ImageView)localView.findViewById(R.id.iv_wu));
    this.ivRUp = ((ImageView)localView.findViewById(R.id.iv_ru));
    this.ivGUp = ((ImageView)localView.findViewById(R.id.iv_gu));
    this.ivBUp = ((ImageView)localView.findViewById(R.id.iv_bu));
    this.ivWDown = ((ImageView)localView.findViewById(R.id.iv_wd));
    this.ivRDown = ((ImageView)localView.findViewById(R.id.iv_rd));
    this.ivGDown = ((ImageView)localView.findViewById(R.id.iv_gd));
    this.ivBDown = ((ImageView)localView.findViewById(R.id.iv_bd));
    this.btnMode.setOnClickListener(this.clickListener);
    this.colorView = localView.findViewById(R.id.bg_color);
    this.colorHandler = localView.findViewById(R.id.iv_color_handler);
    this.colorPickerW = getResources().getDimensionPixelSize(R.dimen.colorpicker_w);
    this.colorBoder = getResources().getDimensionPixelSize(R.dimen.color_boder);
    this.colorView.setOnTouchListener(this.ontouchlistener);
    this.disp_color = ((TextView)localView.findViewById(R.id.disp_color));
    this.disp_brightness = ((TextView)localView.findViewById(R.id.disp_brightness));
    this.tvColor = ((TextView)localView.findViewById(R.id.tv_color));
    Typeface localTypeface = Typeface.createFromAsset(getActivity().getAssets(), "font/APARAJB.TTF");
    this.tvColor.setTypeface(localTypeface);
    this.tvColor.setOnClickListener(this.clickListener);
    this.mGradualChangeBitmap = Bitmap.createBitmap(this.colorPickerW, this.colorPickerW, Bitmap.Config.RGB_565);
    this.mGradualChangeBitmap.eraseColor(-1);
    Bitmap localBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bg_c1_color);
    new Canvas(this.mGradualChangeBitmap).drawBitmap(localBitmap, null, new Rect(0, 0, this.colorPickerW, this.colorPickerW), new Paint());
    this.handler.postDelayed(this.initColor, 100L);
    this.ivWUp.setOnTouchListener(this.ontouchlistener);
    this.ivRUp.setOnTouchListener(this.ontouchlistener);
    this.ivGUp.setOnTouchListener(this.ontouchlistener);
    this.ivBUp.setOnTouchListener(this.ontouchlistener);
    this.ivWDown.setOnTouchListener(this.ontouchlistener);
    this.ivRDown.setOnTouchListener(this.ontouchlistener);
    this.ivGDown.setOnTouchListener(this.ontouchlistener);
    this.ivBDown.setOnTouchListener(this.ontouchlistener);
    this.btnOn.setOnTouchListener(this.ontouchlistener);
    this.btnOff.setOnTouchListener(this.ontouchlistener);
    this.btnSpeedDecr.setOnTouchListener(this.ontouchlistener);
    this.btnSpeedIncr.setOnTouchListener(this.ontouchlistener);
    this.sb_light = ((SeekBar)localView.findViewById(R.id.sb_light));
    this.sb_lightData = 100;
    this.sb_light.setProgress(100);
    setSeekBarProgressDrawable(-16777216, this.sb_light);
    this.sb_light.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        FUT028ColorFragment.this.sb_lightData = paramAnonymousInt;
        if (FUT028ColorFragment.this.sb_lightData == 0)
          FUT028ColorFragment.this.sb_lightData = 1;
        FUT028ColorFragment.this.disp_brightness.setText("Brightness:" + FUT028ColorFragment.this.sb_lightData);
        if (!FUT028ColorFragment.this.sb_lightFlag)
        {
          FUT028ColorFragment.this.sb_lightFlag = true;
          FUT028ColorFragment.this.myHandler.removeMessages(4355);
          FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        FUT028ColorFragment.this.sb_lightData = FUT028ColorFragment.this.sb_light.getProgress();
        if (FUT028ColorFragment.this.sb_lightData == 0)
          FUT028ColorFragment.this.sb_lightData = 1;
        FUT028ColorFragment.this.disp_brightness.setText("Brightness:" + FUT028ColorFragment.this.sb_lightData);
        FUT028ColorFragment.this.myHandler.removeMessages(4355);
        FUT028ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
      }
    });
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT028ColorFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */