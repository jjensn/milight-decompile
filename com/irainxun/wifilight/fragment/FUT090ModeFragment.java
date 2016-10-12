package com.irainxun.wifilight.fragment;

import android.app.Dialog;
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
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.diydevice;
import com.irainxun.wifilight.view.FUT090SelectModeDialog;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

public class FUT090ModeFragment extends Fragment
{
  private static final int buttonKeyEvent = 4353;
  private static final int dataupdata = 4359;
  private static final int delayLongTime = 400;
  private static final int delayTime = 200;
  private static final int processEvent = 4355;
  private static final int sbSaturationEvent = 4357;
  private int KeyMode = 0;
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
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      MyApp.PlalyKeySound();
      byte[] arrayOfByte = new byte[12];
      if (paramAnonymousView == FUT090ModeFragment.this.btnEdit)
      {
        diydevice localdiydevice3 = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
        MyApp.rain_setch = Integer.parseInt(localdiydevice3.zonech);
        MyApp.rain_setremo = Integer.parseInt(localdiydevice3.deviceid);
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
        FUT090ModeFragment.EditGroupDialog localEditGroupDialog = new FUT090ModeFragment.EditGroupDialog(FUT090ModeFragment.this, FUT090ModeFragment.this.getActivity());
        String str2 = new DecimalFormat("00").format(MyApp.rain_setch);
        localEditGroupDialog.EditGroupDialogInit(new DecimalFormat("0000").format(MyApp.rain_setremo), str2);
        localEditGroupDialog.show();
        if (paramAnonymousView != FUT090ModeFragment.this.btnSelect)
          break label795;
        FUT090SelectModeDialog localFUT090SelectModeDialog1 = new FUT090SelectModeDialog(FUT090ModeFragment.this.getActivity());
        localFUT090SelectModeDialog1.FUT090SelectMode(2, 0);
        localFUT090SelectModeDialog1.show();
      }
      label795: 
      do
      {
        return;
        if (paramAnonymousView == FUT090ModeFragment.this.btnAll)
        {
          MyApp.ch_zone = false;
          diydevice localdiydevice2 = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
          localdiydevice2.deviceselect = "0";
          MyApp.rain_setch = Integer.parseInt(localdiydevice2.zonech);
          MyApp.rain_setremo = Integer.parseInt(localdiydevice2.deviceid);
          FUT090ModeFragment.this.tvLabel.setText("Zone:CH");
          MyApp.rain_setch = 0;
          localdiydevice2.zonech = "00";
          String str1 = new DecimalFormat("00").format(MyApp.rain_setch);
          FUT090ModeFragment.this.tvValue.setText(str1);
          FUT090ModeFragment.this.tvValue.setVisibility(0);
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
          break;
        }
        if (paramAnonymousView != FUT090ModeFragment.this.btnShift)
          break;
        diydevice localdiydevice1 = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
        MyApp.rain_setch = Integer.parseInt(localdiydevice1.zonech);
        MyApp.rain_setremo = Integer.parseInt(localdiydevice1.deviceid);
        if (!MyApp.ch_zone)
        {
          MyApp.ch_zone = true;
          localdiydevice1.deviceselect = "1";
          FUT090ModeFragment.this.tvLabel.setText("ID:");
          FUT090ModeFragment.this.tvValue.setText(localdiydevice1.deviceid);
        }
        while (true)
        {
          MyApp.deviceService.diydevice_edit(localdiydevice1);
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
          break;
          MyApp.ch_zone = false;
          localdiydevice1.deviceselect = "0";
          FUT090ModeFragment.this.tvLabel.setText("Zone:CH");
          FUT090ModeFragment.this.tvValue.setText(localdiydevice1.zonech);
        }
        if (paramAnonymousView == FUT090ModeFragment.this.btnSave)
        {
          FUT090SelectModeDialog localFUT090SelectModeDialog2 = new FUT090SelectModeDialog(FUT090ModeFragment.this.getActivity());
          localFUT090SelectModeDialog2.FUT090SelectMode(1, 0);
          localFUT090SelectModeDialog2.show();
          return;
        }
      }
      while (paramAnonymousView != FUT090ModeFragment.this.tvValue);
      FUT090ModeFragment.this.Settingch_zone(MyApp.ch_zone);
    }
  };
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
  private View.OnLayoutChangeListener layoutChangeListener = new View.OnLayoutChangeListener()
  {
    public void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
    {
      if (paramAnonymousInt4 != paramAnonymousInt8)
      {
        int i = FUT090ModeFragment.this.modeView.getBottom();
        int j = FUT090ModeFragment.this.toolBar.getHeight();
        int k = (paramAnonymousInt4 - i - j) / 2 - FUT090ModeFragment.this.getResources().getDimensionPixelSize(R.dimen.dp10);
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)FUT090ModeFragment.this.toolBar.getLayoutParams();
        if (localLayoutParams.topMargin != k)
        {
          localLayoutParams.topMargin = k;
          FUT090ModeFragment.this.toolBar.setLayoutParams(localLayoutParams);
        }
      }
    }
  };
  private int longKeyMode = 0;
  private View modeView;
  Handler myHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      byte[] arrayOfByte = new byte[12];
      switch (paramAnonymousMessage.what)
      {
      default:
      case 4355:
      case 4357:
      case 4353:
      case 1024:
        do
        {
          do
          {
            return;
            FUT090ModeFragment.this.sb_lightFlag = false;
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
            FUT090ModeFragment.this.sbSaturation_Flag = false;
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
            if ((0x10 & FUT090ModeFragment.this.longKeyMode) == 16)
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
              FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
            }
            while ((0x1 & FUT090ModeFragment.this.KeyMode) == 1)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -122;
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
              FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
              if ((0x20 & FUT090ModeFragment.this.longKeyMode) == 32)
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
                FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              }
            }
            if ((0x2 & FUT090ModeFragment.this.KeyMode) == 2)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -122;
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
              FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
            if ((0x4 & FUT090ModeFragment.this.KeyMode) == 4)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -122;
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
              FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
            if ((0x8 & FUT090ModeFragment.this.KeyMode) == 8)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -122;
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
              FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
            if ((0x10 & FUT090ModeFragment.this.KeyMode) == 16)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -122;
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
              FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
            if ((0x20 & FUT090ModeFragment.this.KeyMode) == 32)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -122;
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
              FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
            if ((0x40 & FUT090ModeFragment.this.KeyMode) == 64)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -122;
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
              FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
            if ((0x80 & FUT090ModeFragment.this.KeyMode) == 128)
            {
              arrayOfByte[0] = 49;
              arrayOfByte[1] = MyApp.PasswordByte[0];
              arrayOfByte[2] = MyApp.PasswordByte[1];
              arrayOfByte[3] = MyApp.rain_remoteID;
              arrayOfByte[4] = -122;
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
              FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
              return;
            }
          }
          while ((0x100 & FUT090ModeFragment.this.KeyMode) != 256);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -122;
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
          FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
          return;
          FUT090ModeFragment.this.beepFlag = false;
        }
        while (FUT090ModeFragment.this.beepdata == FUT090ModeFragment.this.SendColorData);
        FUT090ModeFragment.this.beepdata = FUT090ModeFragment.this.SendColorData;
        MyApp.PlalyKeySound();
        return;
      case 4359:
      }
      FUT090ModeFragment.this.sbLight.setProgress(MyApp.rain_09brightness);
      FUT090ModeFragment.this.sbSaturation.setProgress(MyApp.rain_09saturation);
      Log.d("debug", "irain mode sbLight = " + MyApp.rain_09brightness);
      Log.d("debug", "irain mode sbSaturation = " + MyApp.rain_09saturation);
      Log.d("debug", "irain mode tvKelvin = " + MyApp.rain_09kelvin);
      FUT090ModeFragment.this.seekFlag = true;
    }
  };
  private SeekBar sbLight;
  private SeekBar sbSaturation;
  private boolean sbSaturation_Flag;
  private boolean sb_lightFlag;
  private boolean seekFlag = false;
  private View toolBar;
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
          if (paramAnonymousView == FUT090ModeFragment.this.btnOn)
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
            FUT090ModeFragment localFUT090ModeFragment22 = FUT090ModeFragment.this;
            localFUT090ModeFragment22.longKeyMode = (0x10 | localFUT090ModeFragment22.longKeyMode);
            FUT090ModeFragment.this.btnOn.setBackgroundResource(R.drawable.k_btn_on_press);
            FUT090ModeFragment.this.myHandler.removeMessages(4353);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT090ModeFragment.this.btnOff)
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
            FUT090ModeFragment localFUT090ModeFragment21 = FUT090ModeFragment.this;
            localFUT090ModeFragment21.longKeyMode = (0x20 | localFUT090ModeFragment21.longKeyMode);
            FUT090ModeFragment.this.btnOff.setBackgroundResource(R.drawable.k_btn_off_press);
            FUT090ModeFragment.this.myHandler.removeMessages(4353);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT090ModeFragment.this.ivM1)
          {
            if (Integer.valueOf(FUT090ModeFragment.this.ivPointer.getTag().toString()).intValue() != 280)
            {
              FUT090ModeFragment.this.tvModel.setText("M1");
              FUT090ModeFragment.this.ivPointer.setTag(Integer.valueOf(280));
              FUT090ModeFragment.this.turnDegree(280);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
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
            FUT090ModeFragment localFUT090ModeFragment20 = FUT090ModeFragment.this;
            localFUT090ModeFragment20.KeyMode = (0x1 | localFUT090ModeFragment20.KeyMode);
            FUT090ModeFragment.this.ivM1.setImageResource(R.drawable.fut092_m_m1_press);
            FUT090ModeFragment.this.myHandler.removeMessages(4353);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT090ModeFragment.this.ivM2)
          {
            if (Integer.valueOf(FUT090ModeFragment.this.ivPointer.getTag().toString()).intValue() != 320)
            {
              FUT090ModeFragment.this.tvModel.setText("M2");
              FUT090ModeFragment.this.ivPointer.setTag(Integer.valueOf(320));
              FUT090ModeFragment.this.turnDegree(320);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
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
            FUT090ModeFragment localFUT090ModeFragment19 = FUT090ModeFragment.this;
            localFUT090ModeFragment19.KeyMode = (0x2 | localFUT090ModeFragment19.KeyMode);
            FUT090ModeFragment.this.ivM2.setImageResource(R.drawable.fut092_m_m2_press);
            FUT090ModeFragment.this.myHandler.removeMessages(4353);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT090ModeFragment.this.ivM3)
          {
            if (Integer.valueOf(FUT090ModeFragment.this.ivPointer.getTag().toString()).intValue() != 0)
            {
              FUT090ModeFragment.this.tvModel.setText("M3");
              FUT090ModeFragment.this.ivPointer.setTag(Integer.valueOf(0));
              FUT090ModeFragment.this.turnDegree(0);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
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
            FUT090ModeFragment localFUT090ModeFragment18 = FUT090ModeFragment.this;
            localFUT090ModeFragment18.KeyMode = (0x4 | localFUT090ModeFragment18.KeyMode);
            FUT090ModeFragment.this.ivM3.setImageResource(R.drawable.fut092_m_m3_press);
            FUT090ModeFragment.this.myHandler.removeMessages(4353);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT090ModeFragment.this.ivM4)
          {
            if (Integer.valueOf(FUT090ModeFragment.this.ivPointer.getTag().toString()).intValue() != 40)
            {
              FUT090ModeFragment.this.tvModel.setText("M4");
              FUT090ModeFragment.this.ivPointer.setTag(Integer.valueOf(40));
              FUT090ModeFragment.this.turnDegree(40);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
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
            FUT090ModeFragment localFUT090ModeFragment17 = FUT090ModeFragment.this;
            localFUT090ModeFragment17.KeyMode = (0x8 | localFUT090ModeFragment17.KeyMode);
            FUT090ModeFragment.this.ivM4.setImageResource(R.drawable.fut092_m_m4_press);
            FUT090ModeFragment.this.myHandler.removeMessages(4353);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT090ModeFragment.this.ivM5)
          {
            if (Integer.valueOf(FUT090ModeFragment.this.ivPointer.getTag().toString()).intValue() != 80)
            {
              FUT090ModeFragment.this.tvModel.setText("M5");
              FUT090ModeFragment.this.ivPointer.setTag(Integer.valueOf(80));
              FUT090ModeFragment.this.turnDegree(80);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
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
            FUT090ModeFragment localFUT090ModeFragment16 = FUT090ModeFragment.this;
            localFUT090ModeFragment16.KeyMode = (0x10 | localFUT090ModeFragment16.KeyMode);
            FUT090ModeFragment.this.ivM5.setImageResource(R.drawable.fut092_m_m5_press);
            FUT090ModeFragment.this.myHandler.removeMessages(4353);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT090ModeFragment.this.ivM6)
          {
            if (Integer.valueOf(FUT090ModeFragment.this.ivPointer.getTag().toString()).intValue() != 120)
            {
              FUT090ModeFragment.this.tvModel.setText("M6");
              FUT090ModeFragment.this.ivPointer.setTag(Integer.valueOf(120));
              FUT090ModeFragment.this.turnDegree(120);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
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
            FUT090ModeFragment localFUT090ModeFragment15 = FUT090ModeFragment.this;
            localFUT090ModeFragment15.KeyMode = (0x20 | localFUT090ModeFragment15.KeyMode);
            FUT090ModeFragment.this.ivM6.setImageResource(R.drawable.fut092_m_m6_press);
            FUT090ModeFragment.this.myHandler.removeMessages(4353);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT090ModeFragment.this.ivM7)
          {
            if (Integer.valueOf(FUT090ModeFragment.this.ivPointer.getTag().toString()).intValue() != 160)
            {
              FUT090ModeFragment.this.tvModel.setText("M7");
              FUT090ModeFragment.this.ivPointer.setTag(Integer.valueOf(160));
              FUT090ModeFragment.this.turnDegree(160);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
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
            FUT090ModeFragment localFUT090ModeFragment14 = FUT090ModeFragment.this;
            localFUT090ModeFragment14.KeyMode = (0x40 | localFUT090ModeFragment14.KeyMode);
            FUT090ModeFragment.this.ivM7.setImageResource(R.drawable.fut092_m_m7_press);
            FUT090ModeFragment.this.myHandler.removeMessages(4353);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT090ModeFragment.this.ivM8)
          {
            if (Integer.valueOf(FUT090ModeFragment.this.ivPointer.getTag().toString()).intValue() != 200)
            {
              FUT090ModeFragment.this.tvModel.setText("M8");
              FUT090ModeFragment.this.ivPointer.setTag(Integer.valueOf(200));
              FUT090ModeFragment.this.turnDegree(200);
            }
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 6;
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
            FUT090ModeFragment localFUT090ModeFragment13 = FUT090ModeFragment.this;
            localFUT090ModeFragment13.KeyMode = (0x80 | localFUT090ModeFragment13.KeyMode);
            FUT090ModeFragment.this.ivM8.setImageResource(R.drawable.fut092_m_m8_press);
            FUT090ModeFragment.this.myHandler.removeMessages(4353);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
        }
        while (paramAnonymousView != FUT090ModeFragment.this.ivM9);
        if (Integer.valueOf(FUT090ModeFragment.this.ivPointer.getTag().toString()).intValue() != 240)
        {
          FUT090ModeFragment.this.tvModel.setText("M9");
          FUT090ModeFragment.this.ivPointer.setTag(Integer.valueOf(240));
          FUT090ModeFragment.this.turnDegree(240);
        }
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 6;
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
        FUT090ModeFragment localFUT090ModeFragment12 = FUT090ModeFragment.this;
        localFUT090ModeFragment12.KeyMode = (0x100 | localFUT090ModeFragment12.KeyMode);
        FUT090ModeFragment.this.ivM9.setImageResource(R.drawable.fut092_m_m9_press);
        FUT090ModeFragment.this.myHandler.removeMessages(4353);
        FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        return true;
        if (paramAnonymousView == FUT090ModeFragment.this.btnOn)
        {
          FUT090ModeFragment localFUT090ModeFragment11 = FUT090ModeFragment.this;
          localFUT090ModeFragment11.longKeyMode = (0xFFFFFFEF & localFUT090ModeFragment11.longKeyMode);
          FUT090ModeFragment.this.btnOn.setBackgroundResource(R.drawable.k_btn_on_nor);
          return true;
        }
        if (paramAnonymousView == FUT090ModeFragment.this.btnOff)
        {
          FUT090ModeFragment localFUT090ModeFragment10 = FUT090ModeFragment.this;
          localFUT090ModeFragment10.longKeyMode = (0xFFFFFFDF & localFUT090ModeFragment10.longKeyMode);
          FUT090ModeFragment.this.btnOff.setBackgroundResource(R.drawable.k_btn_off_nor);
          return true;
        }
        if (paramAnonymousView == FUT090ModeFragment.this.ivM1)
        {
          FUT090ModeFragment localFUT090ModeFragment9 = FUT090ModeFragment.this;
          localFUT090ModeFragment9.KeyMode = (0xFFFFFFFE & localFUT090ModeFragment9.KeyMode);
          FUT090ModeFragment.this.ivM1.setImageResource(R.drawable.fut092_m_m1_nor);
          return true;
        }
        if (paramAnonymousView == FUT090ModeFragment.this.ivM2)
        {
          FUT090ModeFragment localFUT090ModeFragment8 = FUT090ModeFragment.this;
          localFUT090ModeFragment8.KeyMode = (0xFFFFFFFD & localFUT090ModeFragment8.KeyMode);
          FUT090ModeFragment.this.ivM2.setImageResource(R.drawable.fut092_m_m2_nor);
          return true;
        }
        if (paramAnonymousView == FUT090ModeFragment.this.ivM3)
        {
          FUT090ModeFragment localFUT090ModeFragment7 = FUT090ModeFragment.this;
          localFUT090ModeFragment7.KeyMode = (0xFFFFFFFB & localFUT090ModeFragment7.KeyMode);
          FUT090ModeFragment.this.ivM3.setImageResource(R.drawable.fut092_m_m3_nor);
          return true;
        }
        if (paramAnonymousView == FUT090ModeFragment.this.ivM4)
        {
          FUT090ModeFragment localFUT090ModeFragment6 = FUT090ModeFragment.this;
          localFUT090ModeFragment6.KeyMode = (0xFFFFFFF7 & localFUT090ModeFragment6.KeyMode);
          FUT090ModeFragment.this.ivM4.setImageResource(R.drawable.fut092_m_m4_nor);
          return true;
        }
        if (paramAnonymousView == FUT090ModeFragment.this.ivM5)
        {
          FUT090ModeFragment localFUT090ModeFragment5 = FUT090ModeFragment.this;
          localFUT090ModeFragment5.KeyMode = (0xFFFFFFEF & localFUT090ModeFragment5.KeyMode);
          FUT090ModeFragment.this.ivM5.setImageResource(R.drawable.fut092_m_m5_nor);
          return true;
        }
        if (paramAnonymousView == FUT090ModeFragment.this.ivM6)
        {
          FUT090ModeFragment localFUT090ModeFragment4 = FUT090ModeFragment.this;
          localFUT090ModeFragment4.KeyMode = (0xFFFFFFDF & localFUT090ModeFragment4.KeyMode);
          FUT090ModeFragment.this.ivM6.setImageResource(R.drawable.fut092_m_m6_nor);
          return true;
        }
        if (paramAnonymousView == FUT090ModeFragment.this.ivM7)
        {
          FUT090ModeFragment localFUT090ModeFragment3 = FUT090ModeFragment.this;
          localFUT090ModeFragment3.KeyMode = (0xFFFFFFBF & localFUT090ModeFragment3.KeyMode);
          FUT090ModeFragment.this.ivM7.setImageResource(R.drawable.fut092_m_m7_nor);
          return true;
        }
        if (paramAnonymousView == FUT090ModeFragment.this.ivM8)
        {
          FUT090ModeFragment localFUT090ModeFragment2 = FUT090ModeFragment.this;
          localFUT090ModeFragment2.KeyMode = (0xFFFFFF7F & localFUT090ModeFragment2.KeyMode);
          FUT090ModeFragment.this.ivM8.setImageResource(R.drawable.fut092_m_m8_nor);
          return true;
        }
      }
      while (paramAnonymousView != FUT090ModeFragment.this.ivM9);
      FUT090ModeFragment localFUT090ModeFragment1 = FUT090ModeFragment.this;
      localFUT090ModeFragment1.KeyMode = (0xFFFFFEFF & localFUT090ModeFragment1.KeyMode);
      FUT090ModeFragment.this.ivM9.setImageResource(R.drawable.fut092_m_m9_nor);
      return true;
    }
  };
  private TextView tvBrightness;
  private TextView tvLabel;
  private TextView tvModel;
  private TextView tvSaturation;
  private EditText tvValue;

  public FUT090ModeFragment()
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
            FUT090ModeFragment.this.tvValue.setText(localdiydevice.zonech);
          }
          while (true)
          {
            MyApp.deviceService.diydevice_edit(localdiydevice);
            localDialog.dismiss();
            return;
            label134: MyApp.rain_setremo = Integer.parseInt(str);
            localdiydevice.deviceid = new DecimalFormat("0000").format(MyApp.rain_setremo);
            FUT090ModeFragment.this.tvValue.setText(localdiydevice.deviceid);
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

  private void turnDegree(int paramInt)
  {
    Bitmap localBitmap = rotateBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.fut092_m_pointer), paramInt);
    this.ivPointer.setImageBitmap(localBitmap);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut090_mode, null);
    this.seekFlag = false;
    this.modeView = localView.findViewById(R.id.bg_scal);
    this.toolBar = localView.findViewById(R.id.toolbar);
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
    this.tvLabel = ((TextView)localView.findViewById(R.id.tv_top_name));
    this.tvValue = ((EditText)localView.findViewById(R.id.tv_top_channel));
    this.btnEdit = ((Button)localView.findViewById(R.id.btn_top_edit));
    this.btnAll = ((Button)localView.findViewById(R.id.btn_top_all));
    this.btnSave = ((Button)localView.findViewById(R.id.btn_all));
    this.btnSelect = ((Button)localView.findViewById(R.id.btn_night_light));
    this.btnShift = ((Button)localView.findViewById(R.id.btn_top_shift));
    this.btnOn = ((Button)localView.findViewById(R.id.btn_on));
    this.btnOff = ((Button)localView.findViewById(R.id.btn_off));
    this.sbLight = ((SeekBar)localView.findViewById(R.id.sb_light));
    this.sbSaturation = ((SeekBar)localView.findViewById(R.id.sb_saturation));
    this.tvValue.setOnClickListener(this.clickListener);
    this.btnSave.setOnClickListener(this.clickListener);
    this.btnSelect.setOnClickListener(this.clickListener);
    this.btnShift.setOnClickListener(this.clickListener);
    this.btnEdit.setOnClickListener(this.clickListener);
    this.btnAll.setOnClickListener(this.clickListener);
    this.btnOn.setOnTouchListener(this.touchListener);
    this.btnOff.setOnTouchListener(this.touchListener);
    this.ivM1.setOnTouchListener(this.touchListener);
    this.ivM2.setOnTouchListener(this.touchListener);
    this.ivM3.setOnTouchListener(this.touchListener);
    this.ivM4.setOnTouchListener(this.touchListener);
    this.ivM5.setOnTouchListener(this.touchListener);
    this.ivM6.setOnTouchListener(this.touchListener);
    this.ivM7.setOnTouchListener(this.touchListener);
    this.ivM8.setOnTouchListener(this.touchListener);
    this.ivM9.setOnTouchListener(this.touchListener);
    setSeekBarProgressDrawable(-65536, this.sbLight);
    setSeekBarProgressDrawable(-16777216, this.sbSaturation);
    this.btnSave.setText(getString(R.string.save));
    this.btnSelect.setText(getString(R.string.select));
    this.tvLabel.setText("Zone:CH");
    this.tvValue.setText("56");
    this.tvSaturation = ((TextView)localView.findViewById(R.id.txt_saturation));
    this.tvBrightness = ((TextView)localView.findViewById(R.id.txt_brightness));
    this.tvBrightness.setText("Brightness:" + MyApp.rain_09brightness);
    this.sbLight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        Log.d("debug", "progress =" + paramAnonymousInt);
        if (FUT090ModeFragment.this.seekFlag)
        {
          MyApp.rain_09brightness = paramAnonymousInt;
          if (MyApp.rain_09brightness == 0)
            MyApp.rain_09brightness = 1;
          FUT090ModeFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_09brightness);
          if (!FUT090ModeFragment.this.sb_lightFlag)
          {
            FUT090ModeFragment.this.sb_lightFlag = true;
            FUT090ModeFragment.this.myHandler.removeMessages(4355);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if (FUT090ModeFragment.this.seekFlag)
        {
          MyApp.rain_09brightness = FUT090ModeFragment.this.sbLight.getProgress();
          if (MyApp.rain_09brightness == 0)
            MyApp.rain_09brightness = 1;
          FUT090ModeFragment.this.tvBrightness.setText("Brightness:" + MyApp.rain_09brightness);
          FUT090ModeFragment.this.myHandler.removeMessages(4355);
          FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4355, 200L);
        }
      }
    });
    setSeekBarProgressDrawable(-16777216, this.sbLight);
    this.tvSaturation.setText("Saturation:" + MyApp.rain_09saturation + "%");
    this.sbSaturation.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        Log.d("debug", "progress =" + paramAnonymousInt);
        if (FUT090ModeFragment.this.seekFlag)
        {
          MyApp.rain_09saturation = paramAnonymousInt;
          FUT090ModeFragment.this.tvSaturation.setText("Saturation:" + MyApp.rain_09saturation + "%");
          if (!FUT090ModeFragment.this.sbSaturation_Flag)
          {
            FUT090ModeFragment.this.sbSaturation_Flag = true;
            FUT090ModeFragment.this.myHandler.removeMessages(4357);
            FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
          }
        }
      }

      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
      }

      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        if (FUT090ModeFragment.this.seekFlag)
        {
          MyApp.rain_09saturation = FUT090ModeFragment.this.sbSaturation.getProgress();
          FUT090ModeFragment.this.tvSaturation.setText("Saturation:" + MyApp.rain_09saturation + "%");
          FUT090ModeFragment.this.myHandler.removeMessages(4357);
          FUT090ModeFragment.this.myHandler.sendEmptyMessageDelayed(4357, 200L);
        }
      }
    });
    rainsetSeekBarProgressDrawable(MyApp.rain_curColor, this.sbSaturation);
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

  public class EditGroupDialog extends Dialog
  {
    private TextView btnCancel;
    private TextView btnOk;
    private View.OnClickListener clickListener = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        byte[] arrayOfByte = new byte[12];
        if (paramAnonymousView == FUT090ModeFragment.EditGroupDialog.this.btnCancel)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 0;
          arrayOfByte[5] = 2;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          MyApp.rain_setch = Integer.parseInt(FUT090ModeFragment.EditGroupDialog.this.etChannel.getText().toString());
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
            FUT090ModeFragment.EditGroupDialog.this.dismiss();
            return;
          }
          while (paramAnonymousView != FUT090ModeFragment.EditGroupDialog.this.btnOk);
        }
        while (FUT090ModeFragment.EditGroupDialog.this.etChannel.length() != 2);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = 2;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        MyApp.rain_setch = Integer.parseInt(FUT090ModeFragment.EditGroupDialog.this.etChannel.getText().toString());
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
          FUT090ModeFragment.this.tvValue.setText(localdiydevice.zonech);
        while (true)
        {
          MyApp.deviceService.diydevice_edit(localdiydevice);
          break;
          FUT090ModeFragment.this.tvValue.setText(localdiydevice.deviceid);
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
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ModeFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */