package com.irainxun.wifilight.fragment;

import android.app.Fragment;
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
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.zoneName;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class FUT092ModeFragment extends Fragment
{
  private static final int buttonKeyEvent = 4353;
  private static final int dataupdata = 4358;
  private static final int delayLongTime = 400;
  private static final int delayTime = 200;
  private static final int processEvent = 4355;
  private static final int saturationEvent = 4357;
  private int KeyMode = 0;
  private final String TAG = getClass().getSimpleName();
  private Button btnAll;
  private Button btnNightLight;
  private Button btnOff;
  private Button btnOn;
  private Button btnSeedAdd;
  private Button btnseedSub;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      MyApp.PlalyKeySound();
      if (paramAnonymousView == FUT092ModeFragment.this.btnAll)
      {
        FUT092ModeFragment.this.groupUtil.selectAll(true);
        MyApp.rain_remo = 0;
      }
    }
  };
  private TextView disp_brightness;
  private TextView disp_staturation;
  private LinearLayout groupLayout;
  private GroupUtil groupUtil;
  private ImageView ivM1;
  private ImageView ivM2;
  private ImageView ivM3;
  private ImageView ivM4;
  private ImageView ivM5;
  private ImageView ivM6;
  private ImageView ivM7;
  private ImageView ivM8;
  private ImageView ivM9;
  private ImageView ivPointer;
  private int longKeyMode = 0;
  Handler myHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      byte[] arrayOfByte = new byte[12];
      switch (paramAnonymousMessage.what)
      {
      case 1024:
      default:
      case 4357:
      case 4355:
      case 4353:
      case 4358:
      }
      while (true)
      {
        super.handleMessage(paramAnonymousMessage);
        return;
        FUT092ModeFragment.this.sb_saturationFlag = false;
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
        FUT092ModeFragment.this.sb_lightFlag = false;
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
        if ((0x2 & FUT092ModeFragment.this.longKeyMode) == 2)
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
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        while (true)
        {
          if ((0x1 & FUT092ModeFragment.this.KeyMode) != 1)
            break label921;
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -122;
          arrayOfByte[5] = 1;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          break;
          if ((0x4 & FUT092ModeFragment.this.longKeyMode) == 4)
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
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          }
          else if ((0x8 & FUT092ModeFragment.this.longKeyMode) == 8)
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
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          }
          else if ((0x1 & FUT092ModeFragment.this.longKeyMode) == 1)
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
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          }
          else if ((0x10 & FUT092ModeFragment.this.longKeyMode) == 16)
          {
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = 0;
            arrayOfByte[4] = -124;
            arrayOfByte[5] = 4;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          }
        }
        label921: if ((0x2 & FUT092ModeFragment.this.KeyMode) == 2)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -122;
          arrayOfByte[5] = 2;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x4 & FUT092ModeFragment.this.KeyMode) == 4)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -122;
          arrayOfByte[5] = 3;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x8 & FUT092ModeFragment.this.KeyMode) == 8)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -122;
          arrayOfByte[5] = 4;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x10 & FUT092ModeFragment.this.KeyMode) == 16)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -122;
          arrayOfByte[5] = 5;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x20 & FUT092ModeFragment.this.KeyMode) == 32)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -122;
          arrayOfByte[5] = 6;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x40 & FUT092ModeFragment.this.KeyMode) == 64)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -122;
          arrayOfByte[5] = 7;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x80 & FUT092ModeFragment.this.KeyMode) == 128)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -122;
          arrayOfByte[5] = 8;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x100 & FUT092ModeFragment.this.KeyMode) == 256)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -122;
          arrayOfByte[5] = 9;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          continue;
          FUT092ModeFragment.this.sb_saturation.setProgress(MyApp.rain_08saturation);
          FUT092ModeFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
          FUT092ModeFragment.this.seekFlag = true;
          Log.d("debug", "dataupdate mode 2 rain_08saturation = " + MyApp.rain_08saturation);
          Log.d("debug", "dataupdate mode 2 rain_08brightness = " + MyApp.rain_08brightness);
        }
      }
    }
  };
  private SeekBar sb_light;
  private boolean sb_lightFlag;
  private SeekBar sb_saturation;
  private boolean sb_saturationFlag;
  private boolean seekFlag = false;
  private Button speedADD;
  private Button speedDEC;
  private View.OnTouchListener touchListener = new View.OnTouchListener()
  {
    public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      byte[] arrayOfByte = new byte[12];
      switch (paramAnonymousMotionEvent.getAction())
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
          if (paramAnonymousView == FUT092ModeFragment.this.btnOn)
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
            FUT092ModeFragment localFUT092ModeFragment28 = FUT092ModeFragment.this;
            localFUT092ModeFragment28.longKeyMode = (0x4 | localFUT092ModeFragment28.longKeyMode);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.btnOff)
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
            FUT092ModeFragment localFUT092ModeFragment27 = FUT092ModeFragment.this;
            localFUT092ModeFragment27.longKeyMode = (0x8 | localFUT092ModeFragment27.longKeyMode);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.btnNightLight)
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
            FUT092ModeFragment localFUT092ModeFragment26 = FUT092ModeFragment.this;
            localFUT092ModeFragment26.longKeyMode = (0x2 | localFUT092ModeFragment26.longKeyMode);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.speedADD)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_si_press);
            FUT092ModeFragment localFUT092ModeFragment25 = FUT092ModeFragment.this;
            localFUT092ModeFragment25.longKeyMode = (0x1 | localFUT092ModeFragment25.longKeyMode);
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
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.speedDEC)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_sd_press);
            FUT092ModeFragment localFUT092ModeFragment24 = FUT092ModeFragment.this;
            localFUT092ModeFragment24.longKeyMode = (0x10 | localFUT092ModeFragment24.longKeyMode);
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
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.ivM1)
          {
            if (Integer.valueOf(FUT092ModeFragment.this.ivPointer.getTag().toString()).intValue() != 280)
            {
              FUT092ModeFragment.this.tvModel.setText("M1");
              FUT092ModeFragment.this.ivPointer.setTag(Integer.valueOf(280));
              FUT092ModeFragment.this.turnDegree(280);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
            arrayOfByte[5] = 1;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT092ModeFragment localFUT092ModeFragment23 = FUT092ModeFragment.this;
            localFUT092ModeFragment23.KeyMode = (0x1 | localFUT092ModeFragment23.KeyMode);
            FUT092ModeFragment.this.ivM1.setImageResource(R.drawable.fut092_m_m1_press);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.ivM2)
          {
            if (Integer.valueOf(FUT092ModeFragment.this.ivPointer.getTag().toString()).intValue() != 320)
            {
              FUT092ModeFragment.this.tvModel.setText("M2");
              FUT092ModeFragment.this.ivPointer.setTag(Integer.valueOf(320));
              FUT092ModeFragment.this.turnDegree(320);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
            arrayOfByte[5] = 2;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT092ModeFragment localFUT092ModeFragment22 = FUT092ModeFragment.this;
            localFUT092ModeFragment22.KeyMode = (0x2 | localFUT092ModeFragment22.KeyMode);
            FUT092ModeFragment.this.ivM2.setImageResource(R.drawable.fut092_m_m2_press);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.ivM3)
          {
            if (Integer.valueOf(FUT092ModeFragment.this.ivPointer.getTag().toString()).intValue() != 0)
            {
              FUT092ModeFragment.this.tvModel.setText("M3");
              FUT092ModeFragment.this.ivPointer.setTag(Integer.valueOf(0));
              FUT092ModeFragment.this.turnDegree(0);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
            arrayOfByte[5] = 3;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT092ModeFragment localFUT092ModeFragment21 = FUT092ModeFragment.this;
            localFUT092ModeFragment21.KeyMode = (0x4 | localFUT092ModeFragment21.KeyMode);
            FUT092ModeFragment.this.ivM3.setImageResource(R.drawable.fut092_m_m3_press);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.ivM4)
          {
            if (Integer.valueOf(FUT092ModeFragment.this.ivPointer.getTag().toString()).intValue() != 40)
            {
              FUT092ModeFragment.this.tvModel.setText("M4");
              FUT092ModeFragment.this.ivPointer.setTag(Integer.valueOf(40));
              FUT092ModeFragment.this.turnDegree(40);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
            arrayOfByte[5] = 4;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT092ModeFragment localFUT092ModeFragment20 = FUT092ModeFragment.this;
            localFUT092ModeFragment20.KeyMode = (0x8 | localFUT092ModeFragment20.KeyMode);
            FUT092ModeFragment.this.ivM4.setImageResource(R.drawable.fut092_m_m4_press);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.ivM5)
          {
            if (Integer.valueOf(FUT092ModeFragment.this.ivPointer.getTag().toString()).intValue() != 80)
            {
              FUT092ModeFragment.this.tvModel.setText("M5");
              FUT092ModeFragment.this.ivPointer.setTag(Integer.valueOf(80));
              FUT092ModeFragment.this.turnDegree(80);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
            arrayOfByte[5] = 5;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT092ModeFragment localFUT092ModeFragment19 = FUT092ModeFragment.this;
            localFUT092ModeFragment19.KeyMode = (0x10 | localFUT092ModeFragment19.KeyMode);
            FUT092ModeFragment.this.ivM5.setImageResource(R.drawable.fut092_m_m5_press);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.ivM6)
          {
            if (Integer.valueOf(FUT092ModeFragment.this.ivPointer.getTag().toString()).intValue() != 120)
            {
              FUT092ModeFragment.this.tvModel.setText("M6");
              FUT092ModeFragment.this.ivPointer.setTag(Integer.valueOf(120));
              FUT092ModeFragment.this.turnDegree(120);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
            arrayOfByte[5] = 6;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT092ModeFragment localFUT092ModeFragment18 = FUT092ModeFragment.this;
            localFUT092ModeFragment18.KeyMode = (0x20 | localFUT092ModeFragment18.KeyMode);
            FUT092ModeFragment.this.ivM6.setImageResource(R.drawable.fut092_m_m6_press);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.ivM7)
          {
            if (Integer.valueOf(FUT092ModeFragment.this.ivPointer.getTag().toString()).intValue() != 160)
            {
              FUT092ModeFragment.this.tvModel.setText("M7");
              FUT092ModeFragment.this.ivPointer.setTag(Integer.valueOf(160));
              FUT092ModeFragment.this.turnDegree(160);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
            arrayOfByte[5] = 7;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT092ModeFragment localFUT092ModeFragment17 = FUT092ModeFragment.this;
            localFUT092ModeFragment17.KeyMode = (0x40 | localFUT092ModeFragment17.KeyMode);
            FUT092ModeFragment.this.ivM7.setImageResource(R.drawable.fut092_m_m7_press);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT092ModeFragment.this.ivM8)
          {
            if (Integer.valueOf(FUT092ModeFragment.this.ivPointer.getTag().toString()).intValue() != 200)
            {
              FUT092ModeFragment.this.tvModel.setText("M8");
              FUT092ModeFragment.this.ivPointer.setTag(Integer.valueOf(200));
              FUT092ModeFragment.this.turnDegree(200);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
            arrayOfByte[5] = 8;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT092ModeFragment localFUT092ModeFragment16 = FUT092ModeFragment.this;
            localFUT092ModeFragment16.KeyMode = (0x80 | localFUT092ModeFragment16.KeyMode);
            FUT092ModeFragment.this.ivM8.setImageResource(R.drawable.fut092_m_m8_press);
            FUT092ModeFragment.this.myHandler.removeMessages(4353);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
        }
        while (paramAnonymousView != FUT092ModeFragment.this.ivM9);
        if (Integer.valueOf(FUT092ModeFragment.this.ivPointer.getTag().toString()).intValue() != 240)
        {
          FUT092ModeFragment.this.tvModel.setText("M9");
          FUT092ModeFragment.this.ivPointer.setTag(Integer.valueOf(240));
          FUT092ModeFragment.this.turnDegree(240);
        }
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 6;
        arrayOfByte[5] = 9;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT092ModeFragment localFUT092ModeFragment15 = FUT092ModeFragment.this;
        localFUT092ModeFragment15.KeyMode = (0x100 | localFUT092ModeFragment15.KeyMode);
        FUT092ModeFragment.this.ivM9.setImageResource(R.drawable.fut092_m_m9_press);
        FUT092ModeFragment.this.myHandler.removeMessages(4353);
        FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        return true;
        if (paramAnonymousView == FUT092ModeFragment.this.btnOn)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.k_btn_on_nor);
          FUT092ModeFragment localFUT092ModeFragment14 = FUT092ModeFragment.this;
          localFUT092ModeFragment14.longKeyMode = (0xFFFFFFFB & localFUT092ModeFragment14.longKeyMode);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.btnOff)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.k_btn_off_nor);
          FUT092ModeFragment localFUT092ModeFragment13 = FUT092ModeFragment.this;
          localFUT092ModeFragment13.longKeyMode = (0xFFFFFFF7 & localFUT092ModeFragment13.longKeyMode);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.btnNightLight)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.k_btn_nor);
          FUT092ModeFragment localFUT092ModeFragment12 = FUT092ModeFragment.this;
          localFUT092ModeFragment12.longKeyMode = (0xFFFFFFFD & localFUT092ModeFragment12.longKeyMode);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.speedADD)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_si_nor);
          FUT092ModeFragment localFUT092ModeFragment11 = FUT092ModeFragment.this;
          localFUT092ModeFragment11.longKeyMode = (0xFFFFFFFE & localFUT092ModeFragment11.longKeyMode);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.speedDEC)
        {
          FUT092ModeFragment localFUT092ModeFragment10 = FUT092ModeFragment.this;
          localFUT092ModeFragment10.longKeyMode = (0xFFFFFFEF & localFUT092ModeFragment10.longKeyMode);
          paramAnonymousView.setBackgroundResource(R.drawable.fut028_btn_sd_nor);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.ivM1)
        {
          FUT092ModeFragment localFUT092ModeFragment9 = FUT092ModeFragment.this;
          localFUT092ModeFragment9.KeyMode = (0xFFFFFFFE & localFUT092ModeFragment9.KeyMode);
          FUT092ModeFragment.this.ivM1.setImageResource(R.drawable.fut092_m_m1_nor);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.ivM2)
        {
          FUT092ModeFragment localFUT092ModeFragment8 = FUT092ModeFragment.this;
          localFUT092ModeFragment8.KeyMode = (0xFFFFFFFD & localFUT092ModeFragment8.KeyMode);
          FUT092ModeFragment.this.ivM2.setImageResource(R.drawable.fut092_m_m2_nor);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.ivM3)
        {
          FUT092ModeFragment localFUT092ModeFragment7 = FUT092ModeFragment.this;
          localFUT092ModeFragment7.KeyMode = (0xFFFFFFFB & localFUT092ModeFragment7.KeyMode);
          FUT092ModeFragment.this.ivM3.setImageResource(R.drawable.fut092_m_m3_nor);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.ivM4)
        {
          FUT092ModeFragment localFUT092ModeFragment6 = FUT092ModeFragment.this;
          localFUT092ModeFragment6.KeyMode = (0xFFFFFFF7 & localFUT092ModeFragment6.KeyMode);
          FUT092ModeFragment.this.ivM4.setImageResource(R.drawable.fut092_m_m4_nor);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.ivM5)
        {
          FUT092ModeFragment localFUT092ModeFragment5 = FUT092ModeFragment.this;
          localFUT092ModeFragment5.KeyMode = (0xFFFFFFEF & localFUT092ModeFragment5.KeyMode);
          FUT092ModeFragment.this.ivM5.setImageResource(R.drawable.fut092_m_m5_nor);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.ivM6)
        {
          FUT092ModeFragment localFUT092ModeFragment4 = FUT092ModeFragment.this;
          localFUT092ModeFragment4.KeyMode = (0xFFFFFFDF & localFUT092ModeFragment4.KeyMode);
          FUT092ModeFragment.this.ivM6.setImageResource(R.drawable.fut092_m_m6_nor);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.ivM7)
        {
          FUT092ModeFragment localFUT092ModeFragment3 = FUT092ModeFragment.this;
          localFUT092ModeFragment3.KeyMode = (0xFFFFFFBF & localFUT092ModeFragment3.KeyMode);
          FUT092ModeFragment.this.ivM7.setImageResource(R.drawable.fut092_m_m7_nor);
          return true;
        }
        if (paramAnonymousView == FUT092ModeFragment.this.ivM8)
        {
          FUT092ModeFragment localFUT092ModeFragment2 = FUT092ModeFragment.this;
          localFUT092ModeFragment2.KeyMode = (0xFFFFFF7F & localFUT092ModeFragment2.KeyMode);
          FUT092ModeFragment.this.ivM8.setImageResource(R.drawable.fut092_m_m8_nor);
          return true;
        }
      }
      while (paramAnonymousView != FUT092ModeFragment.this.ivM9);
      FUT092ModeFragment localFUT092ModeFragment1 = FUT092ModeFragment.this;
      localFUT092ModeFragment1.KeyMode = (0xFFFFFEFF & localFUT092ModeFragment1.KeyMode);
      FUT092ModeFragment.this.ivM9.setImageResource(R.drawable.fut092_m_m9_nor);
      return true;
    }
  };
  private TextView tvModel;

  public FUT092ModeFragment()
  {
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
    Bitmap localBitmap = rotateBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.fut092_m_pointer), paramInt);
    this.ivPointer.setImageBitmap(localBitmap);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut092_mode, null);
    this.seekFlag = false;
    this.groupLayout = ((LinearLayout)localView.findViewById(R.id.group));
    this.ivPointer = ((ImageView)localView.findViewById(R.id.pointer));
    this.ivM1 = ((ImageView)localView.findViewById(R.id.m1));
    this.ivM2 = ((ImageView)localView.findViewById(R.id.m2));
    this.ivM3 = ((ImageView)localView.findViewById(R.id.m3));
    this.ivM4 = ((ImageView)localView.findViewById(R.id.m4));
    this.ivM5 = ((ImageView)localView.findViewById(R.id.m5));
    this.ivM6 = ((ImageView)localView.findViewById(R.id.m6));
    this.ivM7 = ((ImageView)localView.findViewById(R.id.m7));
    this.ivM8 = ((ImageView)localView.findViewById(R.id.m8));
    this.ivM9 = ((ImageView)localView.findViewById(R.id.m9));
    this.tvModel = ((TextView)localView.findViewById(R.id.tv_m));
    this.btnAll = ((Button)localView.findViewById(R.id.btn_all));
    this.btnNightLight = ((Button)localView.findViewById(R.id.btn_night_light));
    this.btnOn = ((Button)localView.findViewById(R.id.btn_on));
    this.btnOff = ((Button)localView.findViewById(R.id.btn_off));
    this.speedADD = ((Button)localView.findViewById(R.id.btn_si));
    this.speedDEC = ((Button)localView.findViewById(R.id.btn_sd));
    this.sb_saturation = ((SeekBar)localView.findViewById(R.id.sb_saturation));
    this.sb_light = ((SeekBar)localView.findViewById(R.id.sb_light));
    this.disp_staturation = ((TextView)localView.findViewById(R.id.disp_staturation));
    this.disp_brightness = ((TextView)localView.findViewById(R.id.disp_brightness));
    this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
    this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
    this.btnNightLight.setOnTouchListener(this.touchListener);
    this.btnOn.setOnTouchListener(this.touchListener);
    this.btnOff.setOnTouchListener(this.touchListener);
    this.speedADD.setOnTouchListener(this.touchListener);
    this.speedDEC.setOnTouchListener(this.touchListener);
    this.ivM1.setOnTouchListener(this.touchListener);
    this.ivM2.setOnTouchListener(this.touchListener);
    this.ivM3.setOnTouchListener(this.touchListener);
    this.ivM4.setOnTouchListener(this.touchListener);
    this.ivM5.setOnTouchListener(this.touchListener);
    this.ivM6.setOnTouchListener(this.touchListener);
    this.ivM7.setOnTouchListener(this.touchListener);
    this.ivM8.setOnTouchListener(this.touchListener);
    this.ivM9.setOnTouchListener(this.touchListener);
    this.btnAll.setOnClickListener(this.clickListener);
    setSeekBarProgressDrawable(MyApp.rain_08curColor, this.sb_saturation);
    this.sb_saturation.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (FUT092ModeFragment.this.seekFlag)
        {
          MyApp.rain_08saturation = paramAnonymousInt;
          if (MyApp.rain_08saturation == 0)
            MyApp.rain_08saturation = 1;
          FUT092ModeFragment.this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
          if (!FUT092ModeFragment.this.sb_saturationFlag)
          {
            FUT092ModeFragment.this.sb_saturationFlag = true;
            FUT092ModeFragment.this.myHandler.removeMessages(4357);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if (FUT092ModeFragment.this.seekFlag)
        {
          MyApp.rain_08saturation = FUT092ModeFragment.this.sb_saturation.getProgress();
          if (MyApp.rain_08saturation == 0)
            MyApp.rain_08saturation = 1;
          FUT092ModeFragment.this.disp_staturation.setText("Saturation:" + MyApp.rain_08saturation);
          FUT092ModeFragment.this.myHandler.removeMessages(4357);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
        }
      }
    });
    setSeekBarProgressDrawable(-16777216, this.sb_light);
    this.sb_light.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        if (FUT092ModeFragment.this.seekFlag)
        {
          MyApp.rain_08brightness = paramAnonymousInt;
          if (MyApp.rain_08brightness == 0)
            MyApp.rain_08brightness = 1;
          FUT092ModeFragment.this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
          if (!FUT092ModeFragment.this.sb_lightFlag)
          {
            FUT092ModeFragment.this.sb_lightFlag = true;
            FUT092ModeFragment.this.myHandler.removeMessages(4355);
            FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if (FUT092ModeFragment.this.seekFlag)
        {
          MyApp.rain_08brightness = FUT092ModeFragment.this.sb_light.getProgress();
          if (MyApp.rain_08brightness == 0)
            MyApp.rain_08brightness = 1;
          FUT092ModeFragment.this.disp_brightness.setText("Brightness:" + MyApp.rain_08brightness);
          FUT092ModeFragment.this.myHandler.removeMessages(4355);
          FUT092ModeFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
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
    while (true)
    {
      this.groupUtil = new GroupUtil(getActivity(), this.groupLayout, localArrayList);
      this.groupUtil.initGroup(0);
      Log.d("debug", "dataupdate mode1 rain_08saturation = " + MyApp.rain_08saturation);
      Log.d("debug", "dataupdate mode1 rain_08brightness = " + MyApp.rain_08brightness);
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
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ModeFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */