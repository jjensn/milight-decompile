package com.irainxun.wifilight.fragment;

import android.app.Activity;
import android.app.Dialog;
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
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.diydevice;
import com.irainxun.wifilight.view.FUT090SelectModeDialog;
import com.irainxun.wifilight.xlink.Circular;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

public class FUT090ColorFragment extends Fragment
{
  private static final int buttonKeyEvent = 4353;
  private static final int cirleEvent = 4354;
  private static final int cirleSend = 4356;
  private static final int cirleSendData = 160;
  private static final int cirleTime = 40;
  private static final int dataupdata = 4359;
  private static final int delayLongTime = 400;
  private static final int delayTime = 200;
  private static final int processEvent = 4355;
  private static final int sbKelvinEvent = 4358;
  private static final int sbSaturationEvent = 4357;
  private byte[] CirlByte = new byte[3];
  private byte CirlgetData = 0;
  private int ColorData = 185;
  private int SendColorData = 0;
  private final String TAG = getClass().getSimpleName();
  private boolean beepFlag;
  private int beepdata;
  private Button btnAll;
  private Button btnEdit;
  private Button btnOff;
  private Button btnOn;
  private Button btnSave;
  private Button btnSelect;
  private Button btnShift;
  private boolean cirleSendDataFlag = false;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      MyApp.PlalyKeySound();
      byte[] arrayOfByte = new byte[12];
      if (paramAnonymousView == FUT090ColorFragment.this.btnSave)
      {
        FUT090SelectModeDialog localFUT090SelectModeDialog1 = new FUT090SelectModeDialog(FUT090ColorFragment.this.getActivity());
        localFUT090SelectModeDialog1.FUT090SelectMode(1, 0);
        localFUT090SelectModeDialog1.show();
      }
      do
      {
        return;
        if (paramAnonymousView == FUT090ColorFragment.this.ivSwitcher)
        {
          if (FUT090ColorFragment.this.ivSwitcher.getTag() == null)
          {
            FUT090ColorFragment.this.ivSwitcher.setTag("flag");
            FUT090ColorFragment.this.ivSwitcher.setImageResource(R.drawable.tiao_se);
            FUT090ColorFragment.this.modeView.setVisibility(0);
            FUT090ColorFragment.this.colorView.setVisibility(8);
            return;
          }
          FUT090ColorFragment.this.ivSwitcher.setTag(null);
          FUT090ColorFragment.this.ivSwitcher.setImageResource(R.drawable.fangxiang);
          FUT090ColorFragment.this.modeView.setVisibility(8);
          FUT090ColorFragment.this.colorView.setVisibility(0);
          return;
        }
        if (paramAnonymousView == FUT090ColorFragment.this.btnShift)
        {
          diydevice localdiydevice3 = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
          MyApp.rain_setch = Integer.parseInt(localdiydevice3.zonech);
          MyApp.rain_setremo = Integer.parseInt(localdiydevice3.deviceid);
          if (!MyApp.ch_zone)
          {
            MyApp.ch_zone = true;
            localdiydevice3.deviceselect = "1";
            FUT090ColorFragment.this.tvLabel.setText("ID:");
            FUT090ColorFragment.this.tvValue.setText(localdiydevice3.deviceid);
          }
          while (true)
          {
            MyApp.deviceService.diydevice_edit(localdiydevice3);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 0;
            arrayOfByte[5] = 0;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            return;
            MyApp.ch_zone = false;
            localdiydevice3.deviceselect = "0";
            FUT090ColorFragment.this.tvLabel.setText("Zone:CH");
            FUT090ColorFragment.this.tvValue.setText(localdiydevice3.zonech);
          }
        }
        if (paramAnonymousView == FUT090ColorFragment.this.btnAll)
        {
          MyApp.ch_zone = false;
          diydevice localdiydevice2 = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
          localdiydevice2.deviceselect = "0";
          MyApp.rain_setch = Integer.parseInt(localdiydevice2.zonech);
          MyApp.rain_setremo = Integer.parseInt(localdiydevice2.deviceid);
          FUT090ColorFragment.this.tvLabel.setText("Zone:CH");
          MyApp.rain_setch = 0;
          localdiydevice2.zonech = "00";
          String str2 = new DecimalFormat("00").format(MyApp.rain_setch);
          FUT090ColorFragment.this.tvValue.setText(str2);
          FUT090ColorFragment.this.tvValue.setVisibility(0);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 0;
          arrayOfByte[5] = 0;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          MyApp.deviceService.diydevice_edit(localdiydevice2);
          return;
        }
        if (paramAnonymousView == FUT090ColorFragment.this.btnSelect)
        {
          FUT090SelectModeDialog localFUT090SelectModeDialog2 = new FUT090SelectModeDialog(FUT090ColorFragment.this.getActivity());
          localFUT090SelectModeDialog2.FUT090SelectMode(2, 0);
          localFUT090SelectModeDialog2.show();
          Log.d("debug", "FUT090SelectModeDialog");
          return;
        }
        if (paramAnonymousView == FUT090ColorFragment.this.btnEdit)
        {
          diydevice localdiydevice1 = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
          MyApp.rain_setch = Integer.parseInt(localdiydevice1.zonech);
          MyApp.rain_setremo = Integer.parseInt(localdiydevice1.deviceid);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 0;
          arrayOfByte[5] = 1;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT090ColorFragment.EditGroupDialog localEditGroupDialog = new FUT090ColorFragment.EditGroupDialog(FUT090ColorFragment.this, FUT090ColorFragment.this.getActivity());
          String str1 = new DecimalFormat("00").format(MyApp.rain_setch);
          localEditGroupDialog.EditGroupDialogInit(new DecimalFormat("0000").format(MyApp.rain_setremo), str1);
          localEditGroupDialog.show();
          return;
        }
      }
      while (paramAnonymousView != FUT090ColorFragment.this.tvValue);
      FUT090ColorFragment.this.Settingch_zone(MyApp.ch_zone);
    }
  };
  private int colorBoder;
  private View colorHandler;
  private int colorPickerW;
  private View colorView;
  private int[] colors = { -16777216, -1 };
  private Handler handler = new Handler();
  private Runnable initColor = new Runnable()
  {
    public void run()
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)FUT090ColorFragment.this.colorHandler.getLayoutParams();
      int i = localLayoutParams.leftMargin + FUT090ColorFragment.this.colorHandler.getWidth() / 2;
      int j = localLayoutParams.topMargin + FUT090ColorFragment.this.colorHandler.getHeight() / 2;
      MyApp.rain_curColor = FUT090ColorFragment.this.mGradualChangeBitmap.getPixel(i, j);
      FUT090ColorFragment.this.tvColor.setTextColor(MyApp.rain_curColor);
    }
  };
  private ImageView ivDown;
  private ImageView ivLeft;
  private ImageView ivRight;
  private ImageView ivSwitcher;
  private ImageView ivTop;
  private int longKeyMode = 128;
  private Bitmap mGradualChangeBitmap;
  private View modeView;
  private int motoKey = 0;
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
      case 4357:
      case 4358:
      case 4353:
      case 1024:
        do
        {
          do
          {
            return;
            FUT090ColorFragment.this.sendColorFlag = false;
            if (FUT090ColorFragment.this.CirlgetData <= 2)
              FUT090ColorFragment.this.CirlByte[FUT090ColorFragment.this.CirlgetData] = (byte)FUT090ColorFragment.this.SendColorData;
            if (FUT090ColorFragment.this.CirlgetData < 3)
            {
              FUT090ColorFragment localFUT090ColorFragment2 = FUT090ColorFragment.this;
              localFUT090ColorFragment2.CirlgetData = (byte)(1 + localFUT090ColorFragment2.CirlgetData);
            }
            Log.d("debug", "CirlgetData = " + FUT090ColorFragment.this.CirlgetData);
            return;
            FUT090ColorFragment.this.cirleSendDataFlag = false;
            while (true)
            {
              if (FUT090ColorFragment.this.CirlgetData >= 3)
              {
                FUT090ColorFragment.this.CirlByte[2] = (byte)FUT090ColorFragment.this.SendColorData;
                FUT090ColorFragment.this.CirlgetData = 0;
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 2;
                arrayOfByte[5] = (byte)(FUT090ColorFragment.this.ColorData - (0xFF & FUT090ColorFragment.this.CirlByte[0]));
                arrayOfByte[6] = (byte)(FUT090ColorFragment.this.ColorData - (0xFF & FUT090ColorFragment.this.CirlByte[1]));
                arrayOfByte[7] = (byte)(FUT090ColorFragment.this.ColorData - (0xFF & FUT090ColorFragment.this.CirlByte[2]));
                arrayOfByte[8] = (byte)MyApp.rain_setch;
                if (!MyApp.ch_zone)
                  arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
                arrayOfByte[9] = (byte)MyApp.rain_setremo;
                arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                Log.d("debug", "send cirl data");
                return;
              }
              FUT090ColorFragment.this.CirlByte[FUT090ColorFragment.this.CirlgetData] = (byte)FUT090ColorFragment.this.SendColorData;
              FUT090ColorFragment localFUT090ColorFragment1 = FUT090ColorFragment.this;
              localFUT090ColorFragment1.CirlgetData = (byte)(1 + localFUT090ColorFragment1.CirlgetData);
            }
            FUT090ColorFragment.this.sb_lightFlag = false;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 20;
            arrayOfByte[5] = (byte)MyApp.rain_09brightness;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            return;
            FUT090ColorFragment.this.sbSaturation_Flag = false;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 4;
            arrayOfByte[5] = (byte)MyApp.rain_09saturation;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            return;
            FUT090ColorFragment.this.sbKelvin_Flag = false;
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 3;
            arrayOfByte[5] = (byte)MyApp.rain_09kelvin;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            return;
            if ((0x10 & FUT090ColorFragment.this.longKeyMode) == 16)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -127;
              arrayOfByte[5] = 0;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
            if ((0x20 & FUT090ColorFragment.this.longKeyMode) == 32)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -127;
              arrayOfByte[5] = 1;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
            if ((0x1 & FUT090ColorFragment.this.longKeyMode) == 1)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -123;
              arrayOfByte[5] = 3;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
            if ((0x2 & FUT090ColorFragment.this.longKeyMode) == 2)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -123;
              arrayOfByte[5] = 4;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
            if ((0x4 & FUT090ColorFragment.this.longKeyMode) == 4)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -123;
              arrayOfByte[5] = 1;
              arrayOfByte[6] = 0;
              arrayOfByte[7] = 0;
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
          }
          while ((0x8 & FUT090ColorFragment.this.longKeyMode) != 8);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -123;
          arrayOfByte[5] = 2;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          return;
          FUT090ColorFragment.this.beepFlag = false;
        }
        while (FUT090ColorFragment.this.beepdata == FUT090ColorFragment.this.SendColorData);
        FUT090ColorFragment.this.beepdata = FUT090ColorFragment.this.SendColorData;
        MyApp.PlalyKeySound();
        return;
      case 4359:
      }
      FUT090ColorFragment.this.tvSaturation.setText("Saturation:" + MyApp.rain_09saturation + "%");
      FUT090ColorFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_09brightness);
      int i = (int)(2700.0D + 100.0D * MyApp.rain_09kelvin);
      FUT090ColorFragment.this.tvKelvin.setText("Kelvin:" + i + "K");
      FUT090ColorFragment.this.sbBrightness.setProgress(MyApp.rain_09brightness);
      FUT090ColorFragment.this.sbSaturation.setProgress(MyApp.rain_09saturation);
      FUT090ColorFragment.this.sbKelvin.setProgress(MyApp.rain_09kelvin);
      FUT090ColorFragment.this.seekFlag = true;
      Log.d("debug", "irain sbBrightness = " + MyApp.rain_09brightness);
      Log.d("debug", "irain sbSaturation = " + MyApp.rain_09saturation);
      Log.d("debug", "irain tvKelvin = " + MyApp.rain_09kelvin);
    }
  };
  private View s0View;
  private SeekBar sbBrightness;
  private SeekBar sbKelvin;
  private boolean sbKelvin_Flag;
  private SeekBar sbSaturation;
  private boolean sbSaturation_Flag;
  private boolean sb_lightFlag;
  private boolean seekFlag = false;
  private boolean sendColorFlag = false;
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
              return true;
              MyApp.PlalyKeySound();
              if (paramAnonymousView == FUT090ColorFragment.this.colorView)
              {
                FUT090ColorFragment.this.sendColorFlag = false;
                FUT090ColorFragment.this.cirleSendDataFlag = false;
                FUT090ColorFragment.this.CirlgetData = 0;
                FUT090ColorFragment.this.updateViewLocation(j, k);
                FUT090ColorFragment.this.CirlByte[0] = (byte)FUT090ColorFragment.this.SendColorData;
                FUT090ColorFragment.this.CirlByte[1] = (byte)FUT090ColorFragment.this.SendColorData;
                FUT090ColorFragment.this.CirlByte[2] = (byte)FUT090ColorFragment.this.SendColorData;
                return true;
              }
              if (paramAnonymousView == FUT090ColorFragment.this.ivLeft)
              {
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 5;
                arrayOfByte[5] = 3;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = (byte)MyApp.rain_setch;
                if (!MyApp.ch_zone)
                  arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
                arrayOfByte[9] = (byte)MyApp.rain_setremo;
                arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT090ColorFragment localFUT090ColorFragment13 = FUT090ColorFragment.this;
                localFUT090ColorFragment13.longKeyMode = (0x1 | localFUT090ColorFragment13.longKeyMode);
                FUT090ColorFragment.this.ivLeft.setImageResource(R.drawable.c090_l_pressed);
                FUT090ColorFragment.this.myHandler.removeMessages(4353);
                FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramAnonymousView == FUT090ColorFragment.this.ivRight)
              {
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 5;
                arrayOfByte[5] = 4;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = (byte)MyApp.rain_setch;
                if (!MyApp.ch_zone)
                  arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
                arrayOfByte[9] = (byte)MyApp.rain_setremo;
                arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT090ColorFragment localFUT090ColorFragment12 = FUT090ColorFragment.this;
                localFUT090ColorFragment12.longKeyMode = (0x2 | localFUT090ColorFragment12.longKeyMode);
                FUT090ColorFragment.this.ivRight.setImageResource(R.drawable.c090_r_pressed);
                FUT090ColorFragment.this.myHandler.removeMessages(4353);
                FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramAnonymousView == FUT090ColorFragment.this.ivTop)
              {
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 5;
                arrayOfByte[5] = 1;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = (byte)MyApp.rain_setch;
                if (!MyApp.ch_zone)
                  arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
                arrayOfByte[9] = (byte)MyApp.rain_setremo;
                arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT090ColorFragment localFUT090ColorFragment11 = FUT090ColorFragment.this;
                localFUT090ColorFragment11.longKeyMode = (0x4 | localFUT090ColorFragment11.longKeyMode);
                FUT090ColorFragment.this.ivTop.setImageResource(R.drawable.c090_up_pressed);
                FUT090ColorFragment.this.myHandler.removeMessages(4353);
                FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramAnonymousView == FUT090ColorFragment.this.ivDown)
              {
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 5;
                arrayOfByte[5] = 2;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = (byte)MyApp.rain_setch;
                if (!MyApp.ch_zone)
                  arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
                arrayOfByte[9] = (byte)MyApp.rain_setremo;
                arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT090ColorFragment localFUT090ColorFragment10 = FUT090ColorFragment.this;
                localFUT090ColorFragment10.longKeyMode = (0x8 | localFUT090ColorFragment10.longKeyMode);
                FUT090ColorFragment.this.ivDown.setImageResource(R.drawable.c090_down_pressed);
                FUT090ColorFragment.this.myHandler.removeMessages(4353);
                FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramAnonymousView == FUT090ColorFragment.this.btnOn)
              {
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 1;
                arrayOfByte[5] = 0;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = (byte)MyApp.rain_setch;
                if (!MyApp.ch_zone)
                  arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
                arrayOfByte[9] = (byte)MyApp.rain_setremo;
                arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT090ColorFragment localFUT090ColorFragment9 = FUT090ColorFragment.this;
                localFUT090ColorFragment9.longKeyMode = (0x10 | localFUT090ColorFragment9.longKeyMode);
                FUT090ColorFragment.this.btnOn.setBackgroundResource(R.drawable.k_btn_on_press);
                FUT090ColorFragment.this.myHandler.removeMessages(4353);
                FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
              if (paramAnonymousView == FUT090ColorFragment.this.btnOff)
              {
                arrayOfByte[0] = 49;
                arrayOfByte[1] = MyApp.PasswordByte[0];
                arrayOfByte[2] = MyApp.PasswordByte[1];
                arrayOfByte[3] = MyApp.rain_remoteID;
                arrayOfByte[4] = 1;
                arrayOfByte[5] = 1;
                arrayOfByte[6] = 0;
                arrayOfByte[7] = 0;
                arrayOfByte[8] = (byte)MyApp.rain_setch;
                if (!MyApp.ch_zone)
                  arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
                arrayOfByte[9] = (byte)MyApp.rain_setremo;
                arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
                arrayOfByte[11] = 0;
                MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
                FUT090ColorFragment localFUT090ColorFragment8 = FUT090ColorFragment.this;
                localFUT090ColorFragment8.longKeyMode = (0x20 | localFUT090ColorFragment8.longKeyMode);
                FUT090ColorFragment.this.btnOff.setBackgroundResource(R.drawable.k_btn_off_press);
                FUT090ColorFragment.this.myHandler.removeMessages(4353);
                FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
                return true;
              }
            }
            while (paramAnonymousView != FUT090ColorFragment.this.tvReset);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 5;
            arrayOfByte[5] = 0;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = (byte)MyApp.rain_setch;
            if (!MyApp.ch_zone)
              arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
            arrayOfByte[9] = (byte)MyApp.rain_setremo;
            arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            return true;
          }
          while (paramAnonymousView != FUT090ColorFragment.this.colorView);
          FUT090ColorFragment.this.updateViewLocation(j, k);
        }
        while (FUT090ColorFragment.this.cirleSendDataFlag);
        FUT090ColorFragment.this.cirleSendDataFlag = true;
        FUT090ColorFragment.this.myHandler.removeMessages(4356);
        FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4356, 160L);
        return true;
        if (paramAnonymousView == FUT090ColorFragment.this.colorView)
        {
          FUT090ColorFragment.this.beepFlag = false;
          FUT090ColorFragment.this.myHandler.removeMessages(4356);
          while (true)
          {
            if (FUT090ColorFragment.this.CirlgetData >= 3)
            {
              FUT090ColorFragment.this.CirlByte[2] = (byte)FUT090ColorFragment.this.SendColorData;
              FUT090ColorFragment.this.CirlgetData = 0;
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = 2;
              arrayOfByte[5] = (byte)(FUT090ColorFragment.this.ColorData - (0xFF & FUT090ColorFragment.this.CirlByte[0]));
              arrayOfByte[6] = (byte)(FUT090ColorFragment.this.ColorData - (0xFF & FUT090ColorFragment.this.CirlByte[1]));
              arrayOfByte[7] = (byte)(FUT090ColorFragment.this.ColorData - (0xFF & FUT090ColorFragment.this.CirlByte[2]));
              arrayOfByte[8] = (byte)MyApp.rain_setch;
              if (!MyApp.ch_zone)
                arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
              arrayOfByte[9] = (byte)MyApp.rain_setremo;
              arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
              arrayOfByte[11] = 0;
              MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
              return true;
            }
            FUT090ColorFragment.this.CirlByte[FUT090ColorFragment.this.CirlgetData] = (byte)FUT090ColorFragment.this.SendColorData;
            FUT090ColorFragment localFUT090ColorFragment7 = FUT090ColorFragment.this;
            localFUT090ColorFragment7.CirlgetData = (byte)(1 + localFUT090ColorFragment7.CirlgetData);
          }
        }
        if (paramAnonymousView == FUT090ColorFragment.this.ivLeft)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 5;
          arrayOfByte[5] = 7;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT090ColorFragment localFUT090ColorFragment6 = FUT090ColorFragment.this;
          localFUT090ColorFragment6.longKeyMode = (0xFFFFFFFE & localFUT090ColorFragment6.longKeyMode);
          FUT090ColorFragment.this.ivLeft.setImageResource(R.drawable.c090_l_normal);
          return true;
        }
        if (paramAnonymousView == FUT090ColorFragment.this.ivRight)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 5;
          arrayOfByte[5] = 8;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT090ColorFragment localFUT090ColorFragment5 = FUT090ColorFragment.this;
          localFUT090ColorFragment5.longKeyMode = (0xFFFFFFFD & localFUT090ColorFragment5.longKeyMode);
          FUT090ColorFragment.this.ivRight.setImageResource(R.drawable.c090_r_normal);
          return true;
        }
        if (paramAnonymousView == FUT090ColorFragment.this.ivTop)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 5;
          arrayOfByte[5] = 5;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT090ColorFragment localFUT090ColorFragment4 = FUT090ColorFragment.this;
          localFUT090ColorFragment4.longKeyMode = (0xFFFFFFFB & localFUT090ColorFragment4.longKeyMode);
          FUT090ColorFragment.this.ivTop.setImageResource(R.drawable.c090_up__normal);
          return true;
        }
        if (paramAnonymousView == FUT090ColorFragment.this.ivDown)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 5;
          arrayOfByte[5] = 6;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT090ColorFragment localFUT090ColorFragment3 = FUT090ColorFragment.this;
          localFUT090ColorFragment3.longKeyMode = (0xFFFFFFF7 & localFUT090ColorFragment3.longKeyMode);
          FUT090ColorFragment.this.ivDown.setImageResource(R.drawable.c090_down_normal);
          return true;
        }
        if (paramAnonymousView == FUT090ColorFragment.this.btnOn)
        {
          FUT090ColorFragment localFUT090ColorFragment2 = FUT090ColorFragment.this;
          localFUT090ColorFragment2.longKeyMode = (0xFFFFFFEF & localFUT090ColorFragment2.longKeyMode);
          FUT090ColorFragment.this.btnOn.setBackgroundResource(R.drawable.k_btn_on_nor);
          return true;
        }
      }
      while (paramAnonymousView != FUT090ColorFragment.this.btnOff);
      FUT090ColorFragment localFUT090ColorFragment1 = FUT090ColorFragment.this;
      localFUT090ColorFragment1.longKeyMode = (0xFFFFFFDF & localFUT090ColorFragment1.longKeyMode);
      FUT090ColorFragment.this.btnOff.setBackgroundResource(R.drawable.k_btn_off_nor);
      return true;
    }
  };
  private TextView tvBrightness;
  private TextView tvColor;
  private TextView tvKelvin;
  private TextView tvLabel;
  private TextView tvRGB;
  private TextView tvReset;
  private TextView tvSaturation;
  private EditText tvValue;

  public FUT090ColorFragment()
  {
  }

  private void Settingch_zone(final boolean paramBoolean)
  {
    final Dialog localDialog = new Dialog(getActivity(), R.style.EditLightDialog);
    localDialog.setContentView(R.layout.activity_password_device);
    localDialog.setCanceledOnTouchOutside(false);
    localDialog.setCancelable(false);
    localDialog.show();
    final EditText localEditText = (EditText)localDialog.findViewById(R.id.et_name);
    localEditText.setText(this.tvValue.getText().toString());
    TextView localTextView = (TextView)localDialog.findViewById(R.id.title);
    if (paramBoolean)
    {
      localTextView.setText("ID");
      InputFilter[] arrayOfInputFilter2 = new InputFilter[1];
      arrayOfInputFilter2[0] = new InputFilter.LengthFilter(4);
      localEditText.setFilters(arrayOfInputFilter2);
    }
    while (true)
    {
      localEditText.setSelection(localEditText.length());
      localDialog.findViewById(R.id.iv_clear).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          localEditText.setText(null);
        }
      });
      localDialog.findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          localDialog.dismiss();
        }
      });
      localDialog.findViewById(R.id.tv_ok).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          String str = localEditText.getText().toString();
          diydevice localdiydevice;
          if (!TextUtils.isEmpty(str))
          {
            localdiydevice = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
            MyApp.rain_setch = Integer.parseInt(localdiydevice.zonech);
            MyApp.rain_setremo = Integer.parseInt(localdiydevice.deviceid);
            if (paramBoolean)
              break label134;
            MyApp.rain_setch = Integer.parseInt(str);
            localdiydevice.zonech = new DecimalFormat("00").format(MyApp.rain_setch);
            FUT090ColorFragment.this.tvValue.setText(localdiydevice.zonech);
          }
          while (true)
          {
            MyApp.deviceService.diydevice_edit(localdiydevice);
            localDialog.dismiss();
            return;
            label134: MyApp.rain_setremo = Integer.parseInt(str);
            localdiydevice.deviceid = new DecimalFormat("0000").format(MyApp.rain_setremo);
            FUT090ColorFragment.this.tvValue.setText(localdiydevice.deviceid);
          }
        }
      });
      return;
      localTextView.setText("Zone:CH");
      InputFilter[] arrayOfInputFilter1 = new InputFilter[1];
      arrayOfInputFilter1[0] = new InputFilter.LengthFilter(2);
      localEditText.setFilters(arrayOfInputFilter1);
    }
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
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = MyApp.rain_curColor;
      arrayOfInt[1] = -1;
      localGradientDrawable.setColors(arrayOfInt);
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
    int i4 = 1 + (this.colorBoder + this.colorHandler.getWidth() / 2);
    Circular localCircular = MyApp.CircularData(paramInt1, paramInt2, i3, i4, i2);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.colorHandler.getLayoutParams();
    localLayoutParams.leftMargin = (localCircular.x - this.colorHandler.getWidth() / 2);
    localLayoutParams.topMargin = (localCircular.y - this.colorHandler.getWidth() / 2);
    this.colorHandler.setLayoutParams(localLayoutParams);
    if (!this.beepFlag)
    {
      this.beepFlag = true;
      this.myHandler.removeMessages(1024);
      this.myHandler.sendEmptyMessageDelayed(1024, 80L);
    }
    MyApp.rain_curColor = getColor(localCircular.angle);
    this.SendColorData = (int)(0.7083333333333334D * localCircular.angle);
    Log.d("debug", "angle = " + this.SendColorData);
    this.tvRGB.setText("RGB:" + (0xFF & this.ColorData - this.SendColorData));
    if (!this.sendColorFlag)
    {
      this.sendColorFlag = true;
      this.myHandler.removeMessages(4354);
      this.myHandler.sendEmptyMessageDelayed(4354, 40L);
    }
    this.tvColor.setTextColor(MyApp.rain_curColor);
    rainsetSeekBarProgressDrawable(MyApp.rain_curColor, this.sbSaturation);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut090_color, null);
    this.seekFlag = false;
    this.btnEdit = ((Button)localView.findViewById(R.id.btn_top_edit));
    this.btnAll = ((Button)localView.findViewById(R.id.btn_top_all));
    this.btnShift = ((Button)localView.findViewById(R.id.btn_top_shift));
    this.tvLabel = ((TextView)localView.findViewById(R.id.tv_top_name));
    this.tvValue = ((EditText)localView.findViewById(R.id.tv_top_channel));
    this.tvRGB = ((TextView)localView.findViewById(R.id.txt_rgb));
    this.tvKelvin = ((TextView)localView.findViewById(R.id.txt_kelvin));
    this.tvSaturation = ((TextView)localView.findViewById(R.id.txt_saturation));
    this.tvBrightness = ((TextView)localView.findViewById(R.id.txt_brightness));
    this.colorView = localView.findViewById(R.id.bg_color);
    this.modeView = localView.findViewById(R.id.bg_color1);
    this.colorHandler = localView.findViewById(R.id.iv_color_handler);
    this.tvColor = ((TextView)localView.findViewById(R.id.tv_color));
    Typeface localTypeface = Typeface.createFromAsset(getActivity().getAssets(), "font/APARAJB.TTF");
    this.tvColor.setTypeface(localTypeface);
    this.s0View = localView.findViewById(R.id.tv_test);
    this.ivSwitcher = ((ImageView)localView.findViewById(R.id.iv_color_change));
    this.ivLeft = ((ImageView)localView.findViewById(R.id.iv_l));
    this.ivRight = ((ImageView)localView.findViewById(R.id.iv_r));
    this.ivTop = ((ImageView)localView.findViewById(R.id.iv_t));
    this.ivDown = ((ImageView)localView.findViewById(R.id.iv_b));
    this.tvReset = ((TextView)localView.findViewById(R.id.tv_test));
    this.btnSave = ((Button)localView.findViewById(R.id.btn_all));
    this.btnSelect = ((Button)localView.findViewById(R.id.btn_night_light));
    this.btnOn = ((Button)localView.findViewById(R.id.btn_on));
    this.btnOff = ((Button)localView.findViewById(R.id.btn_off));
    this.sbBrightness = ((SeekBar)localView.findViewById(R.id.sb_light));
    this.sbKelvin = ((SeekBar)localView.findViewById(R.id.sb_kelvin));
    this.sbSaturation = ((SeekBar)localView.findViewById(R.id.sb_saturation));
    this.sbBrightness.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        Log.d("debug", "progress =" + paramAnonymousInt);
        if (FUT090ColorFragment.this.seekFlag)
        {
          MyApp.rain_09brightness = paramAnonymousInt;
          if (MyApp.rain_09brightness == 0)
            MyApp.rain_09brightness = 1;
          FUT090ColorFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_09brightness);
          if (!FUT090ColorFragment.this.sb_lightFlag)
          {
            FUT090ColorFragment.this.sb_lightFlag = true;
            FUT090ColorFragment.this.myHandler.removeMessages(4355);
            FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if (FUT090ColorFragment.this.seekFlag)
        {
          MyApp.rain_09brightness = FUT090ColorFragment.this.sbBrightness.getProgress();
          if (MyApp.rain_09brightness == 0)
            MyApp.rain_09brightness = 1;
          FUT090ColorFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_09brightness);
          FUT090ColorFragment.this.myHandler.removeMessages(4355);
          FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
        }
      }
    });
    this.sbKelvin.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        Log.d("debug", "progress =" + paramAnonymousInt);
        if (FUT090ColorFragment.this.seekFlag)
        {
          MyApp.rain_09kelvin = paramAnonymousInt;
          int i = (int)(2700.0D + 100.0D * MyApp.rain_09kelvin);
          FUT090ColorFragment.this.tvKelvin.setText("Kelvin:" + i + "K");
          if (!FUT090ColorFragment.this.sbKelvin_Flag)
          {
            FUT090ColorFragment.this.sbKelvin_Flag = true;
            FUT090ColorFragment.this.myHandler.removeMessages(4358);
            FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4358, 200L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if (FUT090ColorFragment.this.seekFlag)
        {
          MyApp.rain_09kelvin = FUT090ColorFragment.this.sbKelvin.getProgress();
          int i = (int)(2700.0D + 100.0D * MyApp.rain_09kelvin);
          FUT090ColorFragment.this.tvKelvin.setText("Kelvin:" + i + "K");
          FUT090ColorFragment.this.myHandler.removeMessages(4358);
          FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4358, 200L);
        }
      }
    });
    this.sbSaturation.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        Log.d("debug", "progress =" + paramAnonymousInt);
        if (FUT090ColorFragment.this.seekFlag)
        {
          MyApp.rain_09saturation = paramAnonymousInt;
          FUT090ColorFragment.this.tvSaturation.setText("Saturation:" + MyApp.rain_09saturation + "%");
          if (!FUT090ColorFragment.this.sbSaturation_Flag)
          {
            FUT090ColorFragment.this.sbSaturation_Flag = true;
            FUT090ColorFragment.this.myHandler.removeMessages(4357);
            FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if (FUT090ColorFragment.this.seekFlag)
        {
          MyApp.rain_09saturation = FUT090ColorFragment.this.sbSaturation.getProgress();
          FUT090ColorFragment.this.tvSaturation.setText("Saturation:" + MyApp.rain_09saturation + "%");
          FUT090ColorFragment.this.myHandler.removeMessages(4357);
          FUT090ColorFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
        }
      }
    });
    this.colorPickerW = getResources().getDimensionPixelSize(R.dimen.fut090_colorpicker_w);
    this.colorBoder = getResources().getDimensionPixelSize(R.dimen.dp6);
    this.mGradualChangeBitmap = Bitmap.createBitmap(this.colorPickerW, this.colorPickerW, Bitmap.Config.RGB_565);
    this.mGradualChangeBitmap.eraseColor(-1);
    Bitmap localBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bg_c1_color);
    new Canvas(this.mGradualChangeBitmap).drawBitmap(localBitmap, null, new Rect(0, 0, this.colorPickerW, this.colorPickerW), new Paint());
    this.handler.postDelayed(this.initColor, 100L);
    this.colorView.setOnTouchListener(this.touchListener);
    this.tvRGB.setText(getString(R.string.txt_rgb, new Object[] { "" }));
    this.tvKelvin.setText(getString(R.string.txt_keivin, new Object[] { "" }));
    this.tvSaturation.setText(getString(R.string.txt_saturation, new Object[] { "" }));
    this.tvBrightness.setText(getString(R.string.txt_brightness, new Object[] { "" }));
    setSeekBarProgressDrawable(-256, this.sbKelvin);
    setSeekBarProgressDrawable(MyApp.rain_curColor, this.sbSaturation);
    setSeekBarProgressDrawable(-16777216, this.sbBrightness);
    this.btnSave.setText(getString(R.string.save));
    this.btnSelect.setText(getString(R.string.select));
    this.btnSave.setOnClickListener(this.clickListener);
    this.btnSelect.setOnClickListener(this.clickListener);
    this.tvValue.setOnClickListener(this.clickListener);
    this.btnEdit.setOnClickListener(this.clickListener);
    this.btnAll.setOnClickListener(this.clickListener);
    this.btnShift.setOnClickListener(this.clickListener);
    this.ivSwitcher.setOnClickListener(this.clickListener);
    this.s0View.setOnClickListener(this.clickListener);
    this.ivLeft.setOnTouchListener(this.touchListener);
    this.ivRight.setOnTouchListener(this.touchListener);
    this.ivTop.setOnTouchListener(this.touchListener);
    this.ivDown.setOnTouchListener(this.touchListener);
    this.tvReset.setOnTouchListener(this.touchListener);
    this.btnOn.setOnTouchListener(this.touchListener);
    this.btnOff.setOnTouchListener(this.touchListener);
    diydevice localdiydevice2;
    if (MyApp.deviceService.diydevice_isDeviceExists(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00"))
    {
      localdiydevice2 = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
      MyApp.rain_setch = Integer.parseInt(localdiydevice2.zonech);
      MyApp.rain_setremo = Integer.parseInt(localdiydevice2.deviceid);
      if ("0".equals(localdiydevice2.deviceselect))
      {
        MyApp.ch_zone = false;
        this.tvLabel.setText("Zone:CH");
        this.tvValue.setText(localdiydevice2.zonech);
      }
    }
    while (true)
    {
      this.myHandler.sendEmptyMessageDelayed(4359, 100L);
      this.tvLabel.setText("Zone:CH");
      this.tvValue.setText("56");
      return localView;
      MyApp.ch_zone = true;
      this.tvLabel.setText("ID:");
      this.tvValue.setText(localdiydevice2.deviceid);
      continue;
      diydevice localdiydevice1 = new diydevice();
      localdiydevice1.mac = (String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
      localdiydevice1.deviceselect = "0";
      localdiydevice1.deviceid = "0000";
      localdiydevice1.zonech = "00";
      MyApp.deviceService.diydevice_addDevice(localdiydevice1);
      MyApp.ch_zone = false;
      this.tvValue.setText(localdiydevice1.zonech);
      this.tvLabel.setText("Zone:CH");
      MyApp.rain_setch = 0;
      MyApp.rain_setremo = 0;
    }
  }

  public void onResume()
  {
    super.onResume();
    diydevice localdiydevice;
    if (MyApp.deviceService.diydevice_isDeviceExists(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00"))
    {
      localdiydevice = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
      MyApp.rain_setch = Integer.parseInt(localdiydevice.zonech);
      MyApp.rain_setremo = Integer.parseInt(localdiydevice.deviceid);
      if ("0".equals(localdiydevice.deviceselect))
      {
        MyApp.ch_zone = false;
        this.tvLabel.setText("Zone:CH");
        this.tvValue.setText(localdiydevice.zonech);
      }
    }
    else
    {
      return;
    }
    MyApp.ch_zone = true;
    this.tvLabel.setText("ID:");
    this.tvValue.setText(localdiydevice.deviceid);
  }

  public class EditGroupDialog extends Dialog
  {
    private TextView btnCancel;
    private TextView btnOk;
    private View.OnClickListener clickListener = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        byte[] arrayOfByte = new byte[12];
        if (paramAnonymousView == FUT090ColorFragment.EditGroupDialog.this.btnCancel)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 0;
          arrayOfByte[5] = 2;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          MyApp.rain_setch = Integer.parseInt(FUT090ColorFragment.EditGroupDialog.this.etChannel.getText().toString());
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
        }
        do
        {
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          do
          {
            FUT090ColorFragment.EditGroupDialog.this.dismiss();
            return;
          }
          while (paramAnonymousView != FUT090ColorFragment.EditGroupDialog.this.btnOk);
        }
        while (FUT090ColorFragment.EditGroupDialog.this.etChannel.length() != 2);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = 2;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        MyApp.rain_setch = Integer.parseInt(FUT090ColorFragment.EditGroupDialog.this.etChannel.getText().toString());
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        diydevice localdiydevice = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
        localdiydevice.zonech = new DecimalFormat("00").format(MyApp.rain_setch);
        localdiydevice.deviceid = new DecimalFormat("0000").format(MyApp.rain_setremo);
        if (!MyApp.ch_zone)
          FUT090ColorFragment.this.tvValue.setText(localdiydevice.zonech);
        while (true)
        {
          MyApp.deviceService.diydevice_edit(localdiydevice);
          break;
          FUT090ColorFragment.this.tvValue.setText(localdiydevice.deviceid);
        }
      }
    };
    private EditText etChannel;
    private String setCh;
    private String setRemo;
    private TextView testID;

    public EditGroupDialog(Context arg2)
    {
      super(R.style.EditLightDialog);
    }

    private EditGroupDialog(Context paramInt, int arg3)
    {
      super(i);
    }

    public void EditGroupDialogInit(String paramString1, String paramString2)
    {
      this.setRemo = paramString1;
      this.setCh = paramString2;
      Log.d("debug", "setRemo = " + this.setRemo);
      Log.d("debug", "setCh = " + this.setCh);
    }

    protected void onCreate(Bundle paramBundle)
    {
      super.onCreate(paramBundle);
      setContentView(R.layout.dialog_fut090_edit_group);
      this.etChannel = ((EditText)findViewById(R.id.et_channel));
      this.btnOk = ((TextView)findViewById(R.id.tv_ok));
      this.btnCancel = ((TextView)findViewById(R.id.tv_cancel));
      this.btnOk.setOnClickListener(this.clickListener);
      this.btnCancel.setOnClickListener(this.clickListener);
      this.etChannel.setText(this.setCh);
      this.etChannel.setSelection(this.etChannel.length());
      this.testID = ((TextView)findViewById(R.id.testID));
      this.testID.setText("ID: " + this.setRemo);
      setCancelable(false);
      setCanceledOnTouchOutside(false);
      Window localWindow = getWindow();
      WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
      localLayoutParams.width = -1;
      localWindow.setAttributes(localLayoutParams);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ColorFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */