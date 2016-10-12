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
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifi_light;
import com.irainxun.wifilight.database.zoneName;
import com.irainxun.wifilight.util.ActivityUtil;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class FUT091KelvinFragment extends Fragment
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
  private byte[] CirlByte = new byte[4];
  private int CirlColor;
  private byte CirlgetData = 0;
  private int ColorData = 185;
  private int LightColor;
  private final String TAG = getClass().getSimpleName();
  private boolean beepFlag;
  private int beepdata;
  private View bg_scal;
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
      if (paramAnonymousView == FUT091KelvinFragment.this.ivAddColor)
        if ((MyApp.rain_remoteID == 8) && (!MyApp.lightmode))
          FUT091KelvinFragment.this.colorPickerUtil.addColorPoint((int)(360.0D * (1.0D * MyApp.rain_08color / 255.0D)));
      while (paramAnonymousView != FUT091KelvinFragment.this.btnAll)
      {
        return;
        FUT091KelvinFragment.this.colorPickerUtil.addColorPoint(FUT091KelvinFragment.this.sb_lightData);
        return;
      }
      FUT091KelvinFragment.this.groupUtil.selectAll(true);
      MyApp.rain_remo = 0;
    }
  };
  private int clirOld = 0;
  private ColorPicker colorPickerUtil;
  private byte dirclir = 0;
  private LinearLayout groupLayout;
  private GroupUtil groupUtil;
  private ImageView ivAddColor;
  private int longKeyMode = 128;
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
      case 4353:
      case 1024:
        do
        {
          do
          {
            return;
            FUT091KelvinFragment.this.cirleSendDataFlag = false;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            if (MyApp.rain_remoteID == 8)
              arrayOfByte[4] = 3;
            while (true)
            {
              arrayOfByte[5] = (byte)FUT091KelvinFragment.this.LightColor;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              Log.d("debug", "send cirl data");
              return;
              arrayOfByte[4] = FUT091KelvinFragment.this.dirclir;
            }
            FUT091KelvinFragment.this.sb_lightFlag = false;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            if (MyApp.rain_remoteID == 8)
              arrayOfByte[4] = 5;
            while (true)
            {
              arrayOfByte[5] = (byte)FUT091KelvinFragment.this.sb_lightData;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = 0;
              arrayOfByte[9] = MyApp.rain_remo;
              arrayOfByte[10] = 0;
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              return;
              arrayOfByte[4] = 3;
            }
            if ((0x2 & FUT091KelvinFragment.this.longKeyMode) == 2)
            {
              Log.d("debug", "long key Night light");
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -124;
              if (MyApp.rain_remoteID == 8)
                arrayOfByte[5] = 5;
              while (true)
              {
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT091KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
                return;
                arrayOfByte[5] = 2;
              }
            }
            if ((0x4 & FUT091KelvinFragment.this.longKeyMode) == 4)
            {
              Log.d("debug", "long key tvOn");
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -124;
              if (MyApp.rain_remoteID == 8)
                arrayOfByte[5] = 1;
              while (true)
              {
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT091KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
                return;
                arrayOfByte[5] = 3;
              }
            }
          }
          while ((0x8 & FUT091KelvinFragment.this.longKeyMode) != 8);
          Log.d("debug", "long key tvOff");
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -124;
          if (MyApp.rain_remoteID == 8)
            arrayOfByte[5] = 2;
          while (true)
          {
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT091KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
            return;
            arrayOfByte[5] = 4;
          }
          FUT091KelvinFragment.this.beepFlag = false;
        }
        while (FUT091KelvinFragment.this.beepdata == FUT091KelvinFragment.this.LightColor);
        FUT091KelvinFragment.this.beepdata = FUT091KelvinFragment.this.LightColor;
        MyApp.PlalyKeySound();
        return;
      case 4358:
      }
      if (MyApp.rain_remoteID == 8)
      {
        FUT091KelvinFragment.this.LightColor = MyApp.rain_08brightness;
        FUT091KelvinFragment.this.sb_lightData = MyApp.rain_08kelvin;
        FUT091KelvinFragment.this.sb_light.setProgress(FUT091KelvinFragment.this.sb_lightData);
      }
      FUT091KelvinFragment.this.seekFlag = true;
      Log.d("debug", "dataupdate COLOR rain_08saturation = " + MyApp.rain_08saturation);
      Log.d("debug", "dataupdate COLOR rain_08brightness = " + MyApp.rain_08brightness);
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
        do
          while (true)
          {
            return true;
            if (paramAnonymousView != FUT091KelvinFragment.this.bg_scal)
              MyApp.PlalyKeySound();
            if (paramAnonymousView == FUT091KelvinFragment.this.btnOn)
            {
              paramAnonymousView.setBackgroundResource(R.drawable.k_btn_on_press);
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 4;
              if (MyApp.rain_remoteID == 8)
                arrayOfByte[5] = 1;
              while (true)
              {
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT091KelvinFragment localFUT091KelvinFragment11 = FUT091KelvinFragment.this;
                localFUT091KelvinFragment11.longKeyMode = (0x4 | localFUT091KelvinFragment11.longKeyMode);
                FUT091KelvinFragment.this.myHandler.removeMessages(4353);
                FUT091KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                break;
                arrayOfByte[5] = 3;
              }
            }
            if (paramAnonymousView == FUT091KelvinFragment.this.btnOff)
            {
              paramAnonymousView.setBackgroundResource(R.drawable.k_btn_off_press);
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 4;
              if (MyApp.rain_remoteID == 8)
                arrayOfByte[5] = 2;
              while (true)
              {
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT091KelvinFragment localFUT091KelvinFragment10 = FUT091KelvinFragment.this;
                localFUT091KelvinFragment10.longKeyMode = (0x8 | localFUT091KelvinFragment10.longKeyMode);
                FUT091KelvinFragment.this.myHandler.removeMessages(4353);
                FUT091KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                break;
                arrayOfByte[5] = 4;
              }
            }
            if (paramAnonymousView == FUT091KelvinFragment.this.btnNightLight)
            {
              paramAnonymousView.setBackgroundResource(R.drawable.k_btn_press);
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 4;
              if (MyApp.rain_remoteID == 8)
                arrayOfByte[5] = 5;
              while (true)
              {
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = 0;
                arrayOfByte[9] = MyApp.rain_remo;
                arrayOfByte[10] = 0;
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT091KelvinFragment localFUT091KelvinFragment9 = FUT091KelvinFragment.this;
                localFUT091KelvinFragment9.longKeyMode = (0x2 | localFUT091KelvinFragment9.longKeyMode);
                FUT091KelvinFragment.this.myHandler.removeMessages(4353);
                FUT091KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                break;
                arrayOfByte[5] = 2;
              }
            }
            if (paramAnonymousView == FUT091KelvinFragment.this.bg_scal)
            {
              if (i < 6)
                i = 6;
              int i3 = -6 + FUT091KelvinFragment.this.scal_imageview.getWidth();
              if (i > i3)
                i = i3;
              if (j < 6)
                j = 6;
              int i4 = -6 + FUT091KelvinFragment.this.scal_imageview.getHeight();
              if (j > i4)
                j = i4;
              int i5 = FUT091KelvinFragment.this.scal_imageview.getWidth();
              FUT091KelvinFragment.this.pressData = FUT091KelvinFragment.this.CircularData(i, j, i5 / 2, 6);
              FUT091KelvinFragment.this.sendColorFlag = false;
              FUT091KelvinFragment.this.cirleSendDataFlag = false;
              FUT091KelvinFragment.this.CirlgetData = 0;
              FUT091KelvinFragment.this.CirlByte[0] = (byte)FUT091KelvinFragment.this.LightColor;
              FUT091KelvinFragment.this.CirlByte[1] = (byte)FUT091KelvinFragment.this.LightColor;
              FUT091KelvinFragment.this.CirlByte[2] = (byte)FUT091KelvinFragment.this.LightColor;
              FUT091KelvinFragment.this.CirlByte[3] = (byte)FUT091KelvinFragment.this.LightColor;
            }
          }
        while (paramAnonymousView != FUT091KelvinFragment.this.bg_scal);
        if (i < 6)
          i = 6;
        int k = -6 + FUT091KelvinFragment.this.scal_imageview.getWidth();
        if (i > k)
          i = k;
        if (j < 6)
          j = 6;
        int m = -6 + FUT091KelvinFragment.this.scal_imageview.getHeight();
        if (j > m)
          j = m;
        int n = FUT091KelvinFragment.this.scal_imageview.getWidth();
        FUT091KelvinFragment.Circular localCircular = FUT091KelvinFragment.this.CircularData(i, j, n / 2, 6);
        FUT091KelvinFragment.this.relativeAngle = (localCircular.angle - FUT091KelvinFragment.this.pressData.angle);
        Log.d("debug", "rain dataAngle.angle = " + localCircular.angle);
        Log.d("debug", "rain pressData.angle = " + FUT091KelvinFragment.this.pressData.angle);
        Log.d("debug", "rain relativeAngle = " + FUT091KelvinFragment.this.relativeAngle);
        if (FUT091KelvinFragment.this.relativeAngle < 0)
        {
          FUT091KelvinFragment localFUT091KelvinFragment8 = FUT091KelvinFragment.this;
          localFUT091KelvinFragment8.relativeAngle = (360 + localFUT091KelvinFragment8.relativeAngle);
        }
        Log.d("debug", "rain sh relativeAngle = " + FUT091KelvinFragment.this.relativeAngle);
        int i1 = FUT091KelvinFragment.this.runAngle + FUT091KelvinFragment.this.relativeAngle;
        if (i1 > 360)
          i1 %= 360;
        int i2;
        if (FUT091KelvinFragment.this.clirOld != i1)
        {
          i2 = i1 - FUT091KelvinFragment.this.clirOld;
          if (Math.abs(i2) < 80)
            if (i2 <= 0)
              break label1387;
        }
        label1387: for (FUT091KelvinFragment.this.dirclir = 1; ; FUT091KelvinFragment.this.dirclir = 2)
        {
          FUT091KelvinFragment localFUT091KelvinFragment7 = FUT091KelvinFragment.this;
          localFUT091KelvinFragment7.CirlColor = (i2 + localFUT091KelvinFragment7.CirlColor);
          if (FUT091KelvinFragment.this.CirlColor >= 360)
            FUT091KelvinFragment.this.CirlColor = 360;
          if (FUT091KelvinFragment.this.CirlColor <= 0)
            FUT091KelvinFragment.this.CirlColor = 0;
          Log.d("debug", "irain clir - clirOld = " + i2);
          FUT091KelvinFragment.this.clirOld = i1;
          FUT091KelvinFragment.this.LightColor = (int)(0.2777777777777778D * FUT091KelvinFragment.this.CirlColor);
          FUT091KelvinFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_08brightness);
          if (MyApp.rain_remoteID == 8)
            MyApp.rain_08brightness = FUT091KelvinFragment.this.LightColor;
          if (!FUT091KelvinFragment.this.cirleSendDataFlag)
          {
            FUT091KelvinFragment.this.cirleSendDataFlag = true;
            FUT091KelvinFragment.this.myHandler.removeMessages(4356);
            FUT091KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
          }
          if (!FUT091KelvinFragment.this.beepFlag)
          {
            FUT091KelvinFragment.this.beepFlag = true;
            FUT091KelvinFragment.this.myHandler.removeMessages(1024);
            FUT091KelvinFragment.this.myHandler.sendEmptyMessageDelayed(1024, 80L);
          }
          FUT091KelvinFragment.this.turnDegree(i1);
          break;
        }
      case 1:
      case 3:
      }
      if (paramAnonymousView != FUT091KelvinFragment.this.bg_scal)
      {
        if (paramAnonymousView == FUT091KelvinFragment.this.btnOn)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.k_btn_on_nor);
          FUT091KelvinFragment localFUT091KelvinFragment6 = FUT091KelvinFragment.this;
          localFUT091KelvinFragment6.longKeyMode = (0xFFFFFFFB & localFUT091KelvinFragment6.longKeyMode);
        }
      }
      else
      {
        label1445: if (paramAnonymousView != FUT091KelvinFragment.this.bg_scal)
          break label1751;
        if (FUT091KelvinFragment.this.relativeAngle < 0)
        {
          FUT091KelvinFragment localFUT091KelvinFragment3 = FUT091KelvinFragment.this;
          localFUT091KelvinFragment3.relativeAngle = (360 + localFUT091KelvinFragment3.relativeAngle);
        }
        FUT091KelvinFragment localFUT091KelvinFragment1 = FUT091KelvinFragment.this;
        localFUT091KelvinFragment1.runAngle += FUT091KelvinFragment.this.relativeAngle;
        if (FUT091KelvinFragment.this.runAngle > 360)
        {
          FUT091KelvinFragment localFUT091KelvinFragment2 = FUT091KelvinFragment.this;
          localFUT091KelvinFragment2.runAngle %= 360;
        }
        FUT091KelvinFragment.this.beepFlag = false;
        FUT091KelvinFragment.this.myHandler.removeMessages(4356);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        if (MyApp.rain_remoteID != 8)
          break label1753;
        arrayOfByte[4] = 3;
      }
      while (true)
      {
        arrayOfByte[5] = (byte)FUT091KelvinFragment.this.LightColor;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        if (MyApp.rain_remoteID != 8)
          break;
        MyApp.rain_08brightness = FUT091KelvinFragment.this.LightColor;
        break;
        if (paramAnonymousView == FUT091KelvinFragment.this.btnOff)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.k_btn_off_nor);
          FUT091KelvinFragment localFUT091KelvinFragment5 = FUT091KelvinFragment.this;
          localFUT091KelvinFragment5.longKeyMode = (0xFFFFFFF7 & localFUT091KelvinFragment5.longKeyMode);
          break label1445;
        }
        if (paramAnonymousView != FUT091KelvinFragment.this.btnNightLight)
          break label1445;
        paramAnonymousView.setBackgroundResource(R.drawable.k_btn_nor);
        FUT091KelvinFragment localFUT091KelvinFragment4 = FUT091KelvinFragment.this;
        localFUT091KelvinFragment4.longKeyMode = (0xFFFFFFFD & localFUT091KelvinFragment4.longKeyMode);
        break label1445;
        label1751: break;
        label1753: arrayOfByte[4] = FUT091KelvinFragment.this.dirclir;
      }
    }
  };
  private Circular pressData;
  private int relativeAngle;
  private int runAngle;
  private int[] saveColor = new int[5];
  private byte[] saveLightMode = new byte[5];
  private byte[] saveSatData = new byte[5];
  private int[] saveseekBar = new int[5];
  private SeekBar sb_light;
  private int sb_lightData;
  private boolean sb_lightFlag;
  private ImageView scal_imageview;
  private boolean seekFlag = false;
  private boolean sendColorFlag = false;
  private TextView tvBrightness;
  private TextView tvKelvin;

  public FUT091KelvinFragment()
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
        break label266;
      arrayOfByte[0] = 0;
    }
    while (true)
    {
      return 0xFF000000 | (0xFF & arrayOfByte[0]) << 16 | (0xFF & arrayOfByte[1]) << 8 | 0xFF & arrayOfByte[2];
      label266: arrayOfByte[0] = (byte)(int)(255.0D - 6.071428571428571D * i - 210);
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

  private void turnDegree(int paramInt)
  {
    Bitmap localBitmap = rotateBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.fut091_k_bg), paramInt);
    this.scal_imageview.setImageBitmap(localBitmap);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.seekFlag = false;
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut091_kelvin, null);
    this.groupLayout = ((LinearLayout)localView.findViewById(R.id.group));
    this.ivAddColor = ((ImageView)localView.findViewById(R.id.iv_add));
    this.btnAll = ((Button)localView.findViewById(R.id.btn_all));
    this.btnNightLight = ((Button)localView.findViewById(R.id.btn_night_light));
    this.btnOn = ((Button)localView.findViewById(R.id.btn_on));
    this.btnOff = ((Button)localView.findViewById(R.id.btn_off));
    this.ivAddColor.setOnClickListener(this.clickListener);
    this.btnAll.setOnClickListener(this.clickListener);
    this.btnNightLight.setOnTouchListener(this.ontouchListener);
    this.btnOn.setOnTouchListener(this.ontouchListener);
    this.btnOff.setOnTouchListener(this.ontouchListener);
    this.bg_scal = localView.findViewById(R.id.bg_scal);
    this.bg_scal.setOnTouchListener(this.ontouchListener);
    this.scal_imageview = ((ImageView)localView.findViewById(R.id.scal_imageview));
    this.tvKelvin = ((TextView)localView.findViewById(R.id.txt_kelvin));
    this.tvBrightness = ((TextView)localView.findViewById(R.id.txt_brightness));
    this.sb_light = ((SeekBar)localView.findViewById(R.id.sb_light));
    DecimalFormat localDecimalFormat;
    String str1;
    ArrayList localArrayList;
    if (MyApp.rain_remoteID == 8)
    {
      int m = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
      this.tvKelvin.setText("Kelvin:" + m + "K");
      this.tvBrightness.setText("Brightness:" + MyApp.rain_08brightness);
      this.sb_light.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
      {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
        {
          Log.d("debug", "progress =" + paramAnonymousInt);
          if ((FUT091KelvinFragment.this.seekFlag) && (FUT091KelvinFragment.this.sb_lightData != paramAnonymousInt))
          {
            FUT091KelvinFragment.this.sb_lightData = paramAnonymousInt;
            if (MyApp.rain_remoteID == 8)
            {
              MyApp.rain_08kelvin = FUT091KelvinFragment.this.sb_lightData;
              MyApp.lightmode = true;
            }
            int i = (int)(2700.0D + 38.0D * FUT091KelvinFragment.this.sb_lightData);
            FUT091KelvinFragment.this.tvKelvin.setText("Kelvin:" + i + "K");
            if (!FUT091KelvinFragment.this.sb_lightFlag)
            {
              FUT091KelvinFragment.this.sb_lightFlag = true;
              FUT091KelvinFragment.this.myHandler.removeMessages(4355);
              FUT091KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
            }
          }
        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
        {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
        {
          if ((FUT091KelvinFragment.this.seekFlag) && (FUT091KelvinFragment.this.sb_lightData != FUT091KelvinFragment.this.sb_light.getProgress()))
          {
            FUT091KelvinFragment.this.sb_lightData = FUT091KelvinFragment.this.sb_light.getProgress();
            if (MyApp.rain_remoteID == 8)
            {
              MyApp.rain_08kelvin = FUT091KelvinFragment.this.sb_lightData;
              MyApp.lightmode = true;
            }
            int i = (int)(2700.0D + 38.0D * FUT091KelvinFragment.this.sb_lightData);
            FUT091KelvinFragment.this.tvKelvin.setText("Kelvin:" + i + "K");
            FUT091KelvinFragment.this.myHandler.removeMessages(4355);
            FUT091KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4355, 10L);
          }
        }
      });
      setSeekBarProgressDrawable(-256, this.sb_light);
      localDecimalFormat = new DecimalFormat("00");
      str1 = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(MyApp.rain_remoteID);
      Log.d("debug", "decimalFormat = " + localDecimalFormat.format(MyApp.rain_remoteID));
      Log.d("debug", "macid = " + str1);
      localArrayList = new ArrayList();
      if (!MyApp.deviceService.zoneName_isDeviceExists(str1))
        break label1053;
      zoneName localzoneName2 = MyApp.deviceService.zoneName_getMyDevice(str1);
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
      String str2 = String.valueOf(MyApp.DeviceControl.getMacAddress()) + "aa" + localDecimalFormat.format(MyApp.rain_remoteID);
      if (MyApp.deviceService.wifiLight_isDeviceExists(str2))
      {
        Log.d("debug", "tab1 database ture");
        new wifi_light();
        wifi_light localwifi_light = MyApp.deviceService.tab1_getMyDevice(str2);
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
          break label1179;
      }
      Log.d("debug", "dataupdate rain_08brightness = " + MyApp.rain_08brightness);
      Log.d("debug", "dataupdate rain_08kelvin = " + MyApp.rain_08kelvin);
      this.myHandler.sendEmptyMessageDelayed(4358, 100L);
      return localView;
      MyApp.lightmode = true;
      break;
      label1053: zoneName localzoneName1 = new zoneName();
      localzoneName1.mac = str1;
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
    label1179: Log.d("debug", "saveseekBar[" + i + "]" + " = " + this.saveseekBar[i]);
    int j;
    if (this.saveseekBar[i] > 0)
    {
      j = (int)(360.0D * (1.0D * this.saveColor[i] / 255.0D));
      if (this.saveLightMode[i] != 1)
        break label1302;
    }
    label1302: for (int k = TempgetColor(0xFF & this.saveSatData[i]); ; k = getColor(j))
    {
      this.colorPickerUtil.SetColorCir(k, i);
      i++;
      break;
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
        if ((paramAnonymousView == FUT091KelvinFragment.ColorPicker.this.ivPoint1) && (FUT091KelvinFragment.ColorPicker.this.ivPoint1.getDrawable() != null) && ((FUT091KelvinFragment.ColorPicker.this.ivPoint1.getDrawable() instanceof GradientDrawable)))
        {
          MyApp.PlalyKeySound();
          arrayOfByte[0] = 63;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          if (FUT091KelvinFragment.this.saveLightMode[0] == 1)
          {
            MyApp.lightmode = true;
            MyApp.rain_08kelvin = FUT091KelvinFragment.this.saveseekBar[0];
            arrayOfByte[4] = FUT091KelvinFragment.this.saveLightMode[0];
            arrayOfByte[6] = (byte)FUT091KelvinFragment.this.saveColor[0];
            arrayOfByte[7] = (byte)FUT091KelvinFragment.this.saveseekBar[0];
            arrayOfByte[5] = 0;
            MyApp.rain_08brightness = 0xFF & FUT091KelvinFragment.this.saveColor[0];
            FUT091KelvinFragment.this.sb_lightData = MyApp.rain_08brightness;
            FUT091KelvinFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            int n = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
            FUT091KelvinFragment.this.tvKelvin.setText("Kelvin:" + n + "K");
            FUT091KelvinFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_08brightness);
          }
        }
        do
        {
          return;
          arrayOfByte[4] = FUT091KelvinFragment.this.saveLightMode[0];
          arrayOfByte[5] = FUT091KelvinFragment.this.saveSatData[0];
          arrayOfByte[6] = (byte)(0xFF & FUT091KelvinFragment.this.ColorData - (0xFF & FUT091KelvinFragment.this.saveColor[0]));
          arrayOfByte[7] = (byte)FUT091KelvinFragment.this.saveseekBar[0];
          MyApp.lightmode = false;
          MyApp.rain_08brightness = FUT091KelvinFragment.this.saveseekBar[0];
          MyApp.rain_08saturation = FUT091KelvinFragment.this.saveSatData[0];
          break;
          if ((paramAnonymousView == FUT091KelvinFragment.ColorPicker.this.ivPoint2) && (FUT091KelvinFragment.ColorPicker.this.ivPoint2.getDrawable() != null) && ((FUT091KelvinFragment.ColorPicker.this.ivPoint2.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            if (FUT091KelvinFragment.this.saveLightMode[1] == 1)
            {
              MyApp.lightmode = true;
              MyApp.rain_08kelvin = FUT091KelvinFragment.this.saveseekBar[1];
              arrayOfByte[4] = FUT091KelvinFragment.this.saveLightMode[1];
              arrayOfByte[6] = (byte)FUT091KelvinFragment.this.saveColor[1];
              arrayOfByte[7] = (byte)FUT091KelvinFragment.this.saveseekBar[1];
              arrayOfByte[5] = 0;
              MyApp.rain_08brightness = 0xFF & FUT091KelvinFragment.this.saveColor[1];
            }
            while (true)
            {
              FUT091KelvinFragment.this.sb_lightData = MyApp.rain_08brightness;
              FUT091KelvinFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              int m = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
              FUT091KelvinFragment.this.tvKelvin.setText("Kelvin:" + m + "K");
              FUT091KelvinFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_08brightness);
              return;
              arrayOfByte[4] = FUT091KelvinFragment.this.saveLightMode[1];
              arrayOfByte[5] = FUT091KelvinFragment.this.saveSatData[1];
              arrayOfByte[6] = (byte)(0xFF & FUT091KelvinFragment.this.ColorData - (0xFF & FUT091KelvinFragment.this.saveColor[1]));
              arrayOfByte[7] = (byte)FUT091KelvinFragment.this.saveseekBar[1];
              MyApp.lightmode = false;
              MyApp.rain_08brightness = FUT091KelvinFragment.this.saveseekBar[1];
              MyApp.rain_08saturation = FUT091KelvinFragment.this.saveSatData[1];
            }
          }
          if ((paramAnonymousView == FUT091KelvinFragment.ColorPicker.this.ivPoint3) && (FUT091KelvinFragment.ColorPicker.this.ivPoint3.getDrawable() != null) && ((FUT091KelvinFragment.ColorPicker.this.ivPoint3.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            if (FUT091KelvinFragment.this.saveLightMode[2] == 1)
            {
              MyApp.lightmode = true;
              MyApp.rain_08kelvin = FUT091KelvinFragment.this.saveseekBar[2];
              arrayOfByte[4] = FUT091KelvinFragment.this.saveLightMode[2];
              arrayOfByte[6] = (byte)FUT091KelvinFragment.this.saveColor[2];
              arrayOfByte[7] = (byte)FUT091KelvinFragment.this.saveseekBar[2];
              arrayOfByte[5] = 0;
              MyApp.rain_08brightness = 0xFF & FUT091KelvinFragment.this.saveColor[2];
            }
            while (true)
            {
              FUT091KelvinFragment.this.sb_lightData = MyApp.rain_08brightness;
              FUT091KelvinFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              int k = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
              FUT091KelvinFragment.this.tvKelvin.setText("Kelvin:" + k + "K");
              FUT091KelvinFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_08brightness);
              return;
              arrayOfByte[4] = FUT091KelvinFragment.this.saveLightMode[2];
              arrayOfByte[5] = FUT091KelvinFragment.this.saveSatData[2];
              arrayOfByte[6] = (byte)(0xFF & FUT091KelvinFragment.this.ColorData - (0xFF & FUT091KelvinFragment.this.saveColor[2]));
              arrayOfByte[7] = (byte)FUT091KelvinFragment.this.saveseekBar[2];
              MyApp.lightmode = false;
              MyApp.rain_08brightness = FUT091KelvinFragment.this.saveseekBar[2];
              MyApp.rain_08saturation = FUT091KelvinFragment.this.saveSatData[2];
            }
          }
          if ((paramAnonymousView == FUT091KelvinFragment.ColorPicker.this.ivPoint4) && (FUT091KelvinFragment.ColorPicker.this.ivPoint4.getDrawable() != null) && ((FUT091KelvinFragment.ColorPicker.this.ivPoint4.getDrawable() instanceof GradientDrawable)))
          {
            MyApp.PlalyKeySound();
            arrayOfByte[0] = 63;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            if (FUT091KelvinFragment.this.saveLightMode[3] == 1)
            {
              MyApp.lightmode = true;
              MyApp.rain_08kelvin = FUT091KelvinFragment.this.saveseekBar[3];
              arrayOfByte[4] = FUT091KelvinFragment.this.saveLightMode[3];
              arrayOfByte[6] = (byte)FUT091KelvinFragment.this.saveColor[3];
              arrayOfByte[7] = (byte)FUT091KelvinFragment.this.saveseekBar[3];
              arrayOfByte[5] = 0;
              MyApp.rain_08brightness = 0xFF & FUT091KelvinFragment.this.saveColor[3];
            }
            while (true)
            {
              FUT091KelvinFragment.this.sb_lightData = MyApp.rain_08brightness;
              FUT091KelvinFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              int j = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
              FUT091KelvinFragment.this.tvKelvin.setText("Kelvin:" + j + "K");
              FUT091KelvinFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_08brightness);
              return;
              arrayOfByte[4] = FUT091KelvinFragment.this.saveLightMode[3];
              arrayOfByte[5] = FUT091KelvinFragment.this.saveSatData[3];
              arrayOfByte[6] = (byte)(0xFF & FUT091KelvinFragment.this.ColorData - (0xFF & FUT091KelvinFragment.this.saveColor[3]));
              arrayOfByte[7] = (byte)FUT091KelvinFragment.this.saveseekBar[3];
              MyApp.lightmode = false;
              MyApp.rain_08brightness = FUT091KelvinFragment.this.saveseekBar[3];
              MyApp.rain_08saturation = FUT091KelvinFragment.this.saveSatData[3];
            }
          }
        }
        while ((paramAnonymousView != FUT091KelvinFragment.ColorPicker.this.ivPoint5) || (FUT091KelvinFragment.ColorPicker.this.ivPoint5.getDrawable() == null) || (!(FUT091KelvinFragment.ColorPicker.this.ivPoint5.getDrawable() instanceof GradientDrawable)));
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        if (FUT091KelvinFragment.this.saveLightMode[4] == 1)
        {
          MyApp.lightmode = true;
          MyApp.rain_08kelvin = FUT091KelvinFragment.this.saveseekBar[4];
          arrayOfByte[4] = FUT091KelvinFragment.this.saveLightMode[4];
          arrayOfByte[6] = (byte)FUT091KelvinFragment.this.saveColor[4];
          arrayOfByte[7] = (byte)FUT091KelvinFragment.this.saveseekBar[4];
          arrayOfByte[5] = 0;
          MyApp.rain_08brightness = 0xFF & FUT091KelvinFragment.this.saveColor[4];
        }
        while (true)
        {
          FUT091KelvinFragment.this.sb_lightData = MyApp.rain_08brightness;
          FUT091KelvinFragment.this.sb_light.setProgress(MyApp.rain_08brightness);
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          int i = (int)(2700.0D + 38.0D * MyApp.rain_08kelvin);
          FUT091KelvinFragment.this.tvKelvin.setText("Kelvin:" + i + "K");
          FUT091KelvinFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_08brightness);
          return;
          arrayOfByte[4] = FUT091KelvinFragment.this.saveLightMode[4];
          arrayOfByte[5] = FUT091KelvinFragment.this.saveSatData[4];
          arrayOfByte[6] = (byte)(0xFF & FUT091KelvinFragment.this.ColorData - (0xFF & FUT091KelvinFragment.this.saveColor[4]));
          arrayOfByte[7] = (byte)FUT091KelvinFragment.this.saveseekBar[1];
          MyApp.lightmode = false;
          MyApp.rain_08brightness = FUT091KelvinFragment.this.saveseekBar[4];
          MyApp.rain_08saturation = FUT091KelvinFragment.this.saveSatData[4];
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
        if (paramAnonymousView == FUT091KelvinFragment.ColorPicker.this.ivPoint1)
          FUT091KelvinFragment.ColorPicker.this.showDelPop(FUT091KelvinFragment.ColorPicker.this.ivPoint1);
        while (true)
        {
          return true;
          if (paramAnonymousView == FUT091KelvinFragment.ColorPicker.this.ivPoint2)
            FUT091KelvinFragment.ColorPicker.this.showDelPop(FUT091KelvinFragment.ColorPicker.this.ivPoint2);
          else if (paramAnonymousView == FUT091KelvinFragment.ColorPicker.this.ivPoint3)
            FUT091KelvinFragment.ColorPicker.this.showDelPop(FUT091KelvinFragment.ColorPicker.this.ivPoint3);
          else if (paramAnonymousView == FUT091KelvinFragment.ColorPicker.this.ivPoint4)
            FUT091KelvinFragment.ColorPicker.this.showDelPop(FUT091KelvinFragment.ColorPicker.this.ivPoint4);
          else if (paramAnonymousView == FUT091KelvinFragment.ColorPicker.this.ivPoint5)
            FUT091KelvinFragment.ColorPicker.this.showDelPop(FUT091KelvinFragment.ColorPicker.this.ivPoint5);
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
      String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + "aa" + localDecimalFormat.format(MyApp.rain_remoteID);
      ImageView[] arrayOfImageView;
      int i;
      label132: int k;
      ImageView localImageView;
      label150: GradientDrawable localGradientDrawable;
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
          break label640;
        if (localImageView != null)
        {
          localGradientDrawable = new GradientDrawable();
          if ((MyApp.rain_remoteID != 8) || (MyApp.lightmode))
            break label683;
          localGradientDrawable.setColor(FUT091KelvinFragment.this.getColor(paramInt));
          label191: localGradientDrawable.setCornerRadius(this.context.getResources().getDimension(R.dimen.color_point_radius));
          localImageView.setImageDrawable(localGradientDrawable);
          if (MyApp.rain_remoteID != 8)
            break label754;
          if (!MyApp.lightmode)
            break label699;
          FUT091KelvinFragment.this.saveLightMode[k] = 1;
          FUT091KelvinFragment.this.saveColor[k] = FUT091KelvinFragment.this.LightColor;
          FUT091KelvinFragment.this.saveseekBar[k] = (byte)FUT091KelvinFragment.this.sb_lightData;
          FUT091KelvinFragment.this.saveSatData[k] = 0;
          label286: Log.d("debug", "saveColor[addNum] = " + FUT091KelvinFragment.this.saveColor[k]);
          Log.d("debug", "saveseekBar[addNum] = " + FUT091KelvinFragment.this.saveseekBar[k]);
          if (k != 0)
            break label802;
          localwifi_light.device1 = FUT091KelvinFragment.this.saveLightMode[k];
          localwifi_light.wifilight_s1 = FUT091KelvinFragment.this.saveSatData[k];
          localwifi_light.wifilight_ang1 = FUT091KelvinFragment.this.saveColor[k];
          localwifi_light.wifilight_b1 = FUT091KelvinFragment.this.saveseekBar[k];
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
        label640: Drawable localDrawable = arrayOfImageView[i].getDrawable();
        if ((localDrawable == null) || (!(localDrawable instanceof GradientDrawable)))
        {
          localImageView = arrayOfImageView[i];
          k = i;
          break label150;
        }
        i++;
        break label132;
        label683: localGradientDrawable.setColor(FUT091KelvinFragment.this.TempgetColor(paramInt));
        break label191;
        label699: FUT091KelvinFragment.this.saveLightMode[k] = 0;
        FUT091KelvinFragment.this.saveColor[k] = MyApp.rain_08color;
        FUT091KelvinFragment.this.saveseekBar[k] = (byte)MyApp.rain_08brightness;
        FUT091KelvinFragment.this.saveSatData[k] = (byte)MyApp.rain_08saturation;
        break label286;
        label754: FUT091KelvinFragment.this.saveLightMode[k] = 1;
        FUT091KelvinFragment.this.saveColor[k] = FUT091KelvinFragment.this.LightColor;
        FUT091KelvinFragment.this.saveseekBar[k] = FUT091KelvinFragment.this.sb_lightData;
        break label286;
        label802: if (k == 1)
        {
          localwifi_light.device2 = FUT091KelvinFragment.this.saveLightMode[k];
          localwifi_light.wifilight_s2 = FUT091KelvinFragment.this.saveSatData[k];
          localwifi_light.wifilight_ang2 = FUT091KelvinFragment.this.saveColor[k];
          localwifi_light.wifilight_b2 = FUT091KelvinFragment.this.saveseekBar[k];
        }
        else if (k == 2)
        {
          localwifi_light.device3 = FUT091KelvinFragment.this.saveLightMode[k];
          localwifi_light.wifilight_s3 = FUT091KelvinFragment.this.saveSatData[k];
          localwifi_light.wifilight_ang3 = FUT091KelvinFragment.this.saveColor[k];
          localwifi_light.wifilight_b3 = FUT091KelvinFragment.this.saveseekBar[k];
        }
        else if (k == 3)
        {
          localwifi_light.device4 = FUT091KelvinFragment.this.saveLightMode[k];
          localwifi_light.wifilight_s4 = FUT091KelvinFragment.this.saveSatData[k];
          localwifi_light.wifilight_ang4 = FUT091KelvinFragment.this.saveColor[k];
          localwifi_light.wifilight_b4 = FUT091KelvinFragment.this.saveseekBar[k];
        }
        else if (k == 4)
        {
          localwifi_light.device5 = FUT091KelvinFragment.this.saveLightMode[k];
          localwifi_light.wifilight_s5 = FUT091KelvinFragment.this.saveSatData[k];
          localwifi_light.wifilight_ang5 = FUT091KelvinFragment.this.saveColor[k];
          localwifi_light.wifilight_b5 = FUT091KelvinFragment.this.saveseekBar[k];
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
          String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + "aa" + localDecimalFormat.format(MyApp.rain_remoteID);
          wifi_light localwifi_light;
          if (MyApp.deviceService.wifiLight_isDeviceExists(str))
          {
            new wifi_light();
            localwifi_light = MyApp.deviceService.tab1_getMyDevice(str);
            if (paramImageView != FUT091KelvinFragment.ColorPicker.this.ivPoint1)
              break label140;
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
            label140: if (paramImageView == FUT091KelvinFragment.ColorPicker.this.ivPoint2)
            {
              localwifi_light.device2 = "0";
              localwifi_light.wifilight_s2 = "0";
              localwifi_light.wifilight_ang2 = "0";
              localwifi_light.wifilight_b2 = "0";
            }
            else if (paramImageView == FUT091KelvinFragment.ColorPicker.this.ivPoint3)
            {
              localwifi_light.device3 = "0";
              localwifi_light.wifilight_s3 = "0";
              localwifi_light.wifilight_ang3 = "0";
              localwifi_light.wifilight_b3 = "0";
            }
            else if (paramImageView == FUT091KelvinFragment.ColorPicker.this.ivPoint4)
            {
              localwifi_light.device4 = "0";
              localwifi_light.wifilight_s4 = "0";
              localwifi_light.wifilight_ang4 = "0";
              localwifi_light.wifilight_b4 = "0";
            }
            else if (paramImageView == FUT091KelvinFragment.ColorPicker.this.ivPoint5)
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
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT091KelvinFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */