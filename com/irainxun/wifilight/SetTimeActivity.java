package com.irainxun.wifilight;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifiLightTime;
import com.irainxun.wifilight.database.wifidiyTime;
import com.irainxun.wifilight.database.zoneName;
import com.irainxun.wifilight.database.zoneTime;
import com.irainxun.wifilight.view.wheelview.ArrayWheelAdapter;
import com.irainxun.wifilight.view.wheelview.OnWheelChangedListener;
import com.irainxun.wifilight.view.wheelview.WheelAdapter;
import com.irainxun.wifilight.view.wheelview.WheelView;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class SetTimeActivity extends Activity
{
  private CheckBox CB1;
  private CheckBox CB2;
  private int curTime = 0;
  private LinearLayout groupLayout;
  private GroupUtil groupUtil;
  private WheelAdapter hourAdapter;
  private String[] hourItems = new String[24];
  private ImageView ivBack;
  private int local_remo;
  private WheelAdapter minuteAdapter;
  private String[] minuteItems = new String[60];
  private View.OnClickListener onClickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      MyApp.PlalyKeySound();
      if (paramAnonymousView == SetTimeActivity.this.ivBack)
        SetTimeActivity.this.finish();
      do
      {
        do
          return;
        while (paramAnonymousView == SetTimeActivity.this.tvSave);
        if (paramAnonymousView == SetTimeActivity.this.vOn)
        {
          SetTimeActivity.this.vOn.setBackgroundColor(Color.parseColor("#B4B4B4"));
          SetTimeActivity.this.vOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vwifiOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vwifiOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.curTime = 1;
          return;
        }
        if (paramAnonymousView == SetTimeActivity.this.wifi_time_on)
        {
          SetTimeActivity.this.vOn.setBackgroundColor(Color.parseColor("#B4B4B4"));
          SetTimeActivity.this.vOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vwifiOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vwifiOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.curTime = 1;
          if (!SetTimeActivity.this.timeMode)
          {
            SetTimeActivity.this.zoneTimeSelect(true);
            return;
          }
          SetTimeActivity.this.diyTimeSelect(true);
          return;
        }
        if (paramAnonymousView == SetTimeActivity.this.vOff)
        {
          SetTimeActivity.this.vOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vOff.setBackgroundColor(Color.parseColor("#B4B4B4"));
          SetTimeActivity.this.vwifiOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vwifiOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.curTime = 2;
          return;
        }
        if (paramAnonymousView == SetTimeActivity.this.wifi_time_off)
        {
          SetTimeActivity.this.vOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vOff.setBackgroundColor(Color.parseColor("#B4B4B4"));
          SetTimeActivity.this.vwifiOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vwifiOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.curTime = 2;
          if (!SetTimeActivity.this.timeMode)
          {
            SetTimeActivity.this.zoneTimeSelect(false);
            return;
          }
          SetTimeActivity.this.diyTimeSelect(false);
          return;
        }
        if (paramAnonymousView == SetTimeActivity.this.vwifiOn)
        {
          SetTimeActivity.this.vwifiOn.setBackgroundColor(Color.parseColor("#B4B4B4"));
          SetTimeActivity.this.vwifiOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.curTime = 3;
          return;
        }
        if (paramAnonymousView == SetTimeActivity.this.wifilight_time_on)
        {
          SetTimeActivity.this.vwifiOn.setBackgroundColor(Color.parseColor("#B4B4B4"));
          SetTimeActivity.this.vwifiOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.curTime = 3;
          wifiLightTime localwifiLightTime2 = MyApp.deviceService.wifiLightTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
          int k = Integer.parseInt(localwifiLightTime2.selectValue);
          int m;
          if (!SetTimeActivity.this.wifilight_on_flag)
          {
            SetTimeActivity.this.wifilight_on_flag = true;
            m = k | 0x1;
            SetTimeActivity.this.wifilight_time_on.setBackgroundResource(R.drawable.choice_on);
          }
          while (true)
          {
            localwifiLightTime2.selectValue = Integer.toString(m);
            MyApp.deviceService.wifiLightTime_edit(localwifiLightTime2);
            return;
            SetTimeActivity.this.wifilight_on_flag = false;
            m = k & 0xFFFFFFFE;
            SetTimeActivity.this.wifilight_time_on.setBackgroundResource(R.drawable.choice_off);
          }
        }
        if (paramAnonymousView == SetTimeActivity.this.vwifiOff)
        {
          SetTimeActivity.this.vwifiOff.setBackgroundColor(Color.parseColor("#B4B4B4"));
          SetTimeActivity.this.vwifiOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.curTime = 4;
          return;
        }
        if (paramAnonymousView == SetTimeActivity.this.wifilight_time_off)
        {
          SetTimeActivity.this.vwifiOff.setBackgroundColor(Color.parseColor("#B4B4B4"));
          SetTimeActivity.this.vwifiOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vOn.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.vOff.setBackgroundResource(R.drawable.white);
          SetTimeActivity.this.curTime = 4;
          wifiLightTime localwifiLightTime1 = MyApp.deviceService.wifiLightTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
          int i = Integer.parseInt(localwifiLightTime1.selectValue);
          int j;
          if (!SetTimeActivity.this.wifilight_off_flag)
          {
            SetTimeActivity.this.wifilight_off_flag = true;
            j = i | 0x2;
            SetTimeActivity.this.wifilight_time_off.setBackgroundResource(R.drawable.choice_on);
          }
          while (true)
          {
            localwifiLightTime1.selectValue = Integer.toString(j);
            MyApp.deviceService.wifiLightTime_edit(localwifiLightTime1);
            return;
            SetTimeActivity.this.wifilight_off_flag = false;
            j = i & 0xFFFFFFFD;
            SetTimeActivity.this.wifilight_time_off.setBackgroundResource(R.drawable.choice_off);
          }
        }
        if (paramAnonymousView == SetTimeActivity.this.CB1)
        {
          SetTimeActivity.this.Settingch_zone(false);
          return;
        }
      }
      while (paramAnonymousView != SetTimeActivity.this.CB2);
      SetTimeActivity.this.Settingch_zone(true);
    }
  };
  private boolean timeMode;
  private TextView tvSave;
  private TextView tvTimeOff;
  private TextView tvTimeOn;
  private TextView tvTitle;
  private TextView tvWifiTimeOff;
  private TextView tvWifiTimeOn;
  private View vCH;
  private View vOff;
  private View vOn;
  private View vwifiOff;
  private View vwifiOn;
  private OnWheelChangedListener wheelChangedListener = new OnWheelChangedListener()
  {
    public void onChanged(WheelView paramAnonymousWheelView, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      MyApp.PlalyKeySound();
      String str1 = SetTimeActivity.this.hourAdapter.getItem(SetTimeActivity.this.wvHour.getCurrentItem());
      String str2 = SetTimeActivity.this.minuteAdapter.getItem(SetTimeActivity.this.wvMinute.getCurrentItem());
      if (SetTimeActivity.this.curTime == 1)
      {
        SetTimeActivity.this.tvTimeOn.setText(String.valueOf(str1) + ":" + str2);
        if (!SetTimeActivity.this.timeMode)
          SetTimeActivity.this.SetZoneOnTime(str1, str2);
      }
      do
      {
        return;
        SetTimeActivity.this.SetDIYOnTime(str1, str2);
        return;
        if (SetTimeActivity.this.curTime == 2)
        {
          SetTimeActivity.this.tvTimeOff.setText(String.valueOf(str1) + ":" + str2);
          if (!SetTimeActivity.this.timeMode)
          {
            SetTimeActivity.this.SetZoneOffTime(str1, str2);
            return;
          }
          SetTimeActivity.this.SetDIYOffTime(str1, str2);
          return;
        }
        if (SetTimeActivity.this.curTime == 3)
        {
          SetTimeActivity.this.tvWifiTimeOn.setText(String.valueOf(str1) + ":" + str2);
          wifiLightTime localwifiLightTime2 = MyApp.deviceService.wifiLightTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
          localwifiLightTime2.on_hour = str1;
          localwifiLightTime2.on_minute = str2;
          MyApp.deviceService.wifiLightTime_edit(localwifiLightTime2);
          return;
        }
      }
      while (SetTimeActivity.this.curTime != 4);
      SetTimeActivity.this.tvWifiTimeOff.setText(String.valueOf(str1) + ":" + str2);
      wifiLightTime localwifiLightTime1 = MyApp.deviceService.wifiLightTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
      localwifiLightTime1.off_hour = str1;
      localwifiLightTime1.off_minute = str2;
      MyApp.deviceService.wifiLightTime_edit(localwifiLightTime1);
    }
  };
  private ImageView wifi_time_off;
  private ImageView wifi_time_on;
  private boolean wifilight_off_flag;
  private boolean wifilight_on_flag;
  private ImageView wifilight_time_off;
  private ImageView wifilight_time_on;
  private WheelView wvHour;
  private WheelView wvMinute;
  private int zoneMode;

  public SetTimeActivity()
  {
  }

  private void SetDIYOffTime(String paramString1, String paramString2)
  {
    wifidiyTime localwifidiyTime = MyApp.deviceService.wifidiyTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
    localwifidiyTime.off_hour = paramString1;
    localwifidiyTime.off_minute = paramString2;
    MyApp.deviceService.wifidiyTime_edit(localwifidiyTime);
  }

  private void SetDIYOnTime(String paramString1, String paramString2)
  {
    wifidiyTime localwifidiyTime = MyApp.deviceService.wifidiyTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
    localwifidiyTime.on_hour = paramString1;
    localwifidiyTime.on_minute = paramString2;
    MyApp.deviceService.wifidiyTime_edit(localwifidiyTime);
  }

  private void SetZoneOffTime(String paramString1, String paramString2)
  {
    int i = MyApp.deviceService.getDeviceLogin(MyApp.DeviceControl.getMacAddress());
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(i);
    zoneTime localzoneTime = MyApp.deviceService.zoneTime_getMyDevice(str);
    if (this.local_remo == 1)
    {
      localzoneTime.oneoff_hour = paramString1;
      localzoneTime.oneoff_minute = paramString2;
    }
    while (true)
    {
      MyApp.deviceService.zoneTime_edit(localzoneTime);
      return;
      if (this.local_remo == 2)
      {
        localzoneTime.twooff_hour = paramString1;
        localzoneTime.twooff_minute = paramString2;
      }
      else if (this.local_remo == 3)
      {
        localzoneTime.threeoff_hour = paramString1;
        localzoneTime.threeoff_minute = paramString2;
      }
      else if (this.local_remo == 4)
      {
        localzoneTime.fouroff_hour = paramString1;
        localzoneTime.fouroff_minute = paramString2;
      }
    }
  }

  private void SetZoneOnTime(String paramString1, String paramString2)
  {
    int i = MyApp.deviceService.getDeviceLogin(MyApp.DeviceControl.getMacAddress());
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(i);
    zoneTime localzoneTime = MyApp.deviceService.zoneTime_getMyDevice(str);
    if (this.local_remo == 1)
    {
      localzoneTime.oneon_hour = paramString1;
      localzoneTime.oneon_minute = paramString2;
    }
    while (true)
    {
      MyApp.deviceService.zoneTime_edit(localzoneTime);
      return;
      if (this.local_remo == 2)
      {
        localzoneTime.twoon_hour = paramString1;
        localzoneTime.twoon_minute = paramString2;
      }
      else if (this.local_remo == 3)
      {
        localzoneTime.threeon_hour = paramString1;
        localzoneTime.threeon_minute = paramString2;
      }
      else if (this.local_remo == 4)
      {
        localzoneTime.fouron_hour = paramString1;
        localzoneTime.fouron_minute = paramString2;
      }
    }
  }

  private void Settingch_zone(final boolean paramBoolean)
  {
    final Dialog localDialog = new Dialog(this, R.style.EditLightDialog);
    localDialog.setContentView(R.layout.activity_password_device);
    localDialog.setCanceledOnTouchOutside(false);
    localDialog.setCancelable(false);
    localDialog.show();
    final EditText localEditText = (EditText)localDialog.findViewById(R.id.et_name);
    TextView localTextView;
    if (!paramBoolean)
    {
      localEditText.setText(this.CB1.getText().subSequence(2, 4));
      this.CB2.setChecked(false);
      this.CB1.setChecked(true);
      localTextView = (TextView)localDialog.findViewById(R.id.title);
      if (!paramBoolean)
        break label233;
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
          wifidiyTime localwifidiyTime;
          int i;
          int j;
          if (!TextUtils.isEmpty(str))
          {
            localwifidiyTime = MyApp.deviceService.wifidiyTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
            i = Integer.parseInt(str);
            j = Integer.parseInt(localwifidiyTime.selectValue);
            if (paramBoolean)
              break label134;
            localwifidiyTime.zonech = new DecimalFormat("00").format(i);
            SetTimeActivity.this.CB1.setText("CH" + localwifidiyTime.zonech);
          }
          for (int k = j & 0xFFFFFFFB; ; k = j | 0x4)
          {
            localwifidiyTime.selectValue = Integer.toString(k);
            MyApp.deviceService.wifidiyTime_edit(localwifidiyTime);
            localDialog.dismiss();
            return;
            label134: localwifidiyTime.deviceid = new DecimalFormat("0000").format(i);
            SetTimeActivity.this.CB2.setText("ID:" + localwifidiyTime.deviceid);
          }
        }
      });
      return;
      localEditText.setText(this.CB2.getText().subSequence(3, 7));
      this.CB1.setChecked(false);
      this.CB2.setChecked(true);
      break;
      label233: localTextView.setText("Zone:CH");
      InputFilter[] arrayOfInputFilter1 = new InputFilter[1];
      arrayOfInputFilter1[0] = new InputFilter.LengthFilter(2);
      localEditText.setFilters(arrayOfInputFilter1);
    }
  }

  private void diyTimeSelect(boolean paramBoolean)
  {
    wifidiyTime localwifidiyTime = MyApp.deviceService.wifidiyTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
    int i = Integer.parseInt(localwifidiyTime.selectValue);
    int j;
    if (paramBoolean)
      if ((i & 0x1) == 1)
      {
        j = i & 0xFFFFFFFE;
        this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
      }
    while (true)
    {
      localwifidiyTime.selectValue = Integer.toString(j);
      MyApp.deviceService.wifidiyTime_edit(localwifidiyTime);
      return;
      j = i | 0x1;
      this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
      continue;
      if ((i & 0x2) == 2)
      {
        j = i & 0xFFFFFFFD;
        this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
      }
      else
      {
        j = i | 0x2;
        this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
      }
    }
  }

  private void getZoneTime()
  {
    int i = MyApp.deviceService.getDeviceLogin(MyApp.DeviceControl.getMacAddress());
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(i);
    zoneTime localzoneTime = MyApp.deviceService.zoneTime_getMyDevice(str);
    int j = Integer.parseInt(localzoneTime.selectValue);
    if (this.local_remo == 1)
    {
      this.tvTimeOn.setText(localzoneTime.oneon_hour + ":" + localzoneTime.oneon_minute);
      this.tvTimeOff.setText(localzoneTime.oneoff_hour + ":" + localzoneTime.oneoff_minute);
      if ((j & 0x1) == 1)
      {
        this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
        if ((j & 0x2) != 2)
          break label207;
        this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
      }
    }
    label207: 
    do
    {
      return;
      this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
      break;
      this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
      return;
      if (this.local_remo == 2)
      {
        this.tvTimeOn.setText(localzoneTime.twoon_hour + ":" + localzoneTime.twoon_minute);
        this.tvTimeOff.setText(localzoneTime.twooff_hour + ":" + localzoneTime.twooff_minute);
        if ((j & 0x4) == 4)
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
        while ((j & 0x8) == 8)
        {
          this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
          return;
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
        }
        this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
        return;
      }
      if (this.local_remo == 3)
      {
        this.tvTimeOn.setText(localzoneTime.threeon_hour + ":" + localzoneTime.threeon_minute);
        this.tvTimeOff.setText(localzoneTime.threeoff_hour + ":" + localzoneTime.threeoff_minute);
        if ((j & 0x10) == 16)
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
        while ((j & 0x20) == 32)
        {
          this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
          return;
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
        }
        this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
        return;
      }
    }
    while (this.local_remo != 4);
    this.tvTimeOn.setText(localzoneTime.fouron_hour + ":" + localzoneTime.fouron_minute);
    this.tvTimeOff.setText(localzoneTime.fouroff_hour + ":" + localzoneTime.fouroff_minute);
    if ((j & 0x40) == 64)
      this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
    while ((j & 0x80) == 128)
    {
      this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
      return;
      this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
    }
    this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
  }

  private void zoneTimeSelect(boolean paramBoolean)
  {
    int i = MyApp.deviceService.getDeviceLogin(MyApp.DeviceControl.getMacAddress());
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(i);
    zoneTime localzoneTime = MyApp.deviceService.zoneTime_getMyDevice(str);
    int j = Integer.parseInt(localzoneTime.selectValue);
    if (paramBoolean)
      if (this.local_remo == 1)
        if ((j & 0x1) == 1)
        {
          j &= -2;
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
        }
    while (true)
    {
      localzoneTime.selectValue = Integer.toString(j);
      MyApp.deviceService.zoneTime_edit(localzoneTime);
      return;
      j |= 1;
      this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
      continue;
      if (this.local_remo == 2)
      {
        if ((j & 0x4) == 4)
        {
          j &= -5;
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
        }
        else
        {
          j |= 4;
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
        }
      }
      else if (this.local_remo == 3)
      {
        if ((j & 0x10) == 16)
        {
          j &= -17;
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
        }
        else
        {
          j |= 16;
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
        }
      }
      else if (this.local_remo == 4)
        if ((j & 0x40) == 64)
        {
          j &= -65;
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
        }
        else
        {
          j |= 64;
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
          continue;
          if (this.local_remo == 1)
          {
            if ((j & 0x2) == 2)
            {
              j &= -3;
              this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
            }
            else
            {
              j |= 2;
              this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
            }
          }
          else if (this.local_remo == 2)
          {
            if ((j & 0x8) == 8)
            {
              j &= -9;
              this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
            }
            else
            {
              j |= 8;
              this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
            }
          }
          else if (this.local_remo == 3)
          {
            if ((j & 0x20) == 32)
            {
              j &= -33;
              this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
            }
            else
            {
              j |= 32;
              this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
            }
          }
          else if (this.local_remo == 4)
            if ((j & 0x80) == 128)
            {
              j &= -129;
              this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
            }
            else
            {
              j |= 128;
              this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
            }
        }
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_set_time);
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.groupLayout = ((LinearLayout)findViewById(R.id.list));
    this.vCH = findViewById(R.id.ch);
    this.wvHour = ((WheelView)findViewById(R.id.hour));
    this.wvMinute = ((WheelView)findViewById(R.id.minute));
    this.vOn = findViewById(R.id.item_timeon);
    this.vOff = findViewById(R.id.item_timeoff);
    this.vwifiOn = findViewById(R.id.wifi_item_timeon);
    this.vwifiOff = findViewById(R.id.wifi_item_timeoff);
    this.tvTimeOn = ((TextView)findViewById(R.id.time_on));
    this.tvTimeOff = ((TextView)findViewById(R.id.time_off));
    this.tvWifiTimeOn = ((TextView)findViewById(R.id.wifi_time_on));
    this.tvWifiTimeOff = ((TextView)findViewById(R.id.time_wifi_off));
    this.CB1 = ((CheckBox)findViewById(R.id.cb1));
    this.CB2 = ((CheckBox)findViewById(R.id.cb2));
    this.CB1.setOnClickListener(this.onClickListener);
    this.CB2.setOnClickListener(this.onClickListener);
    this.ivBack.setImageResource(R.drawable.back);
    this.tvTitle.setText(R.string.timer);
    this.ivBack.setOnClickListener(this.onClickListener);
    this.vOn.setOnClickListener(this.onClickListener);
    this.vOff.setOnClickListener(this.onClickListener);
    this.vwifiOn.setOnClickListener(this.onClickListener);
    this.vwifiOff.setOnClickListener(this.onClickListener);
    this.wifilight_time_on = ((ImageView)findViewById(R.id.cb_wifi_time_on));
    this.wifilight_time_on.setOnClickListener(this.onClickListener);
    this.wifilight_time_off = ((ImageView)findViewById(R.id.cb_wifi_time_off));
    this.wifilight_time_off.setOnClickListener(this.onClickListener);
    this.wifi_time_on = ((ImageView)findViewById(R.id.cb_time_on));
    this.wifi_time_on.setOnClickListener(this.onClickListener);
    this.wifi_time_off = ((ImageView)findViewById(R.id.cb_time_off));
    this.wifi_time_off.setOnClickListener(this.onClickListener);
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str1 = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(MyApp.rain_remoteID);
    Log.d("debug", "decimalFormat = " + localDecimalFormat.format(MyApp.rain_remoteID));
    Log.d("debug", "macid = " + str1);
    ArrayList localArrayList = new ArrayList();
    int i;
    if (MyApp.deviceService.zoneName_isDeviceExists(str1))
    {
      zoneName localzoneName2 = MyApp.deviceService.zoneName_getMyDevice(str1);
      localArrayList.add(localzoneName2.zoneNameone);
      localArrayList.add(localzoneName2.zoneNametwo);
      localArrayList.add(localzoneName2.zoneNamethree);
      localArrayList.add(localzoneName2.zoneNamefour);
      this.local_remo = MyApp.rain_remo;
      this.groupUtil = new GroupUtil(this, this.groupLayout, localArrayList);
      this.groupUtil.initGroup(0);
      i = 0;
      label633: if (i < this.minuteItems.length)
        break label1288;
      this.hourAdapter = new ArrayWheelAdapter(this.hourItems);
      this.minuteAdapter = new ArrayWheelAdapter(this.minuteItems);
      this.wvHour.setAdapter(this.hourAdapter);
      this.wvMinute.setAdapter(this.minuteAdapter);
      this.wvHour.setCyclic(true);
      this.wvMinute.setCyclic(true);
      this.wvHour.addChangingListener(this.wheelChangedListener);
      this.wvMinute.addChangingListener(this.wheelChangedListener);
      if (!MyApp.deviceService.wifiLightTime_isDeviceExists(MyApp.DeviceControl.getMacAddress()))
        break label1398;
      wifiLightTime localwifiLightTime2 = MyApp.deviceService.wifiLightTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
      int m = Integer.parseInt(localwifiLightTime2.selectValue);
      if ((m & 0x1) != 1)
        break label1372;
      this.wifilight_time_on.setBackgroundResource(R.drawable.choice_on);
      label790: if ((m & 0x2) != 2)
        break label1385;
      this.wifilight_time_off.setBackgroundResource(R.drawable.choice_on);
      label808: this.tvWifiTimeOn.setText(localwifiLightTime2.on_hour + ":" + localwifiLightTime2.on_minute);
      this.tvWifiTimeOff.setText(localwifiLightTime2.off_hour + ":" + localwifiLightTime2.off_minute);
      label886: if (MyApp.rain_remoteID != 9)
        break label1683;
      this.groupLayout.setVisibility(8);
      this.vCH.setVisibility(0);
      this.timeMode = true;
      if (!MyApp.deviceService.wifidiyTime_isDeviceExists(MyApp.DeviceControl.getMacAddress()))
        break label1561;
      wifidiyTime localwifidiyTime2 = MyApp.deviceService.wifidiyTime_getMyDevice(MyApp.DeviceControl.getMacAddress());
      this.tvTimeOn.setText(localwifidiyTime2.on_hour + ":" + localwifidiyTime2.on_minute);
      this.tvTimeOff.setText(localwifidiyTime2.off_hour + ":" + localwifidiyTime2.off_minute);
      this.zoneMode = Integer.parseInt(localwifidiyTime2.selectValue);
      if ((0x1 & this.zoneMode) != 1)
        break label1516;
      this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
      label1055: if ((0x2 & this.zoneMode) != 2)
        break label1529;
      this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
      label1075: this.CB1.setText("CH" + localwifidiyTime2.zonech);
      this.CB2.setText("ID:" + localwifidiyTime2.deviceid);
      if ((0x4 & this.zoneMode) != 4)
        break label1542;
      this.CB2.setChecked(true);
      this.CB1.setChecked(false);
    }
    while (true)
    {
      MyApp.SettingPasswordContext(this);
      return;
      zoneName localzoneName1 = new zoneName();
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
      break;
      label1288: if (i < this.hourItems.length)
      {
        String[] arrayOfString2 = this.hourItems;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i);
        arrayOfString2[i] = String.format("%02d", arrayOfObject2);
      }
      String[] arrayOfString1 = this.minuteItems;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      arrayOfString1[i] = String.format("%02d", arrayOfObject1);
      i++;
      break label633;
      label1372: this.wifilight_time_on.setBackgroundResource(R.drawable.choice_off);
      break label790;
      label1385: this.wifilight_time_off.setBackgroundResource(R.drawable.choice_off);
      break label808;
      label1398: this.wifilight_on_flag = false;
      this.wifilight_off_flag = false;
      this.tvWifiTimeOn.setText("00:00");
      this.tvWifiTimeOff.setText("00:00");
      this.wifilight_time_off.setBackgroundResource(R.drawable.choice_off);
      this.wifilight_time_on.setBackgroundResource(R.drawable.choice_off);
      wifiLightTime localwifiLightTime1 = new wifiLightTime();
      localwifiLightTime1.mac = MyApp.DeviceControl.getMacAddress();
      localwifiLightTime1.selectValue = Integer.toString(0);
      localwifiLightTime1.on_hour = "00";
      localwifiLightTime1.on_minute = "00";
      localwifiLightTime1.off_hour = "00";
      localwifiLightTime1.off_minute = "00";
      MyApp.deviceService.wifiLightTime_addDevice(localwifiLightTime1);
      break label886;
      label1516: this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
      break label1055;
      label1529: this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
      break label1075;
      label1542: this.CB1.setChecked(true);
      this.CB2.setChecked(false);
      continue;
      label1561: wifidiyTime localwifidiyTime1 = new wifidiyTime();
      localwifidiyTime1.mac = MyApp.DeviceControl.getMacAddress();
      localwifidiyTime1.selectValue = "0";
      localwifidiyTime1.off_hour = "00";
      localwifidiyTime1.off_minute = "00";
      localwifidiyTime1.on_hour = "00";
      localwifidiyTime1.on_minute = "00";
      localwifidiyTime1.deviceid = "0000";
      localwifidiyTime1.zonech = "00";
      MyApp.deviceService.wifidiyTime_addDevice(localwifidiyTime1);
      this.tvTimeOn.setText("00:00");
      this.tvTimeOff.setText("00:00");
      this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
      this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
      continue;
      label1683: if ((MyApp.rain_remoteID == 2) || (MyApp.rain_remoteID == 4) || (MyApp.rain_remoteID == 5) || (MyApp.rain_remoteID == 6))
      {
        this.groupLayout.setVisibility(8);
        this.vCH.setVisibility(8);
        this.timeMode = false;
        int j = MyApp.deviceService.getDeviceLogin(MyApp.DeviceControl.getMacAddress());
        String str2 = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(j);
        if (MyApp.deviceService.zoneTime_isDeviceExists(str2))
        {
          zoneTime localzoneTime2 = MyApp.deviceService.zoneTime_getMyDevice(str2);
          this.zoneMode = Integer.parseInt(localzoneTime2.selectValue);
          this.tvTimeOn.setText(localzoneTime2.oneon_hour + ":" + localzoneTime2.oneon_minute);
          this.tvTimeOff.setText(localzoneTime2.oneoff_hour + ":" + localzoneTime2.oneoff_minute);
          if ((0x1 & this.zoneMode) == 1)
            this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
          while (true)
          {
            if ((0x2 & this.zoneMode) != 2)
              break label1947;
            this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
            break;
            this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
          }
          label1947: this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
        }
        else
        {
          zoneTime localzoneTime1 = new zoneTime();
          localzoneTime1.mac = str2;
          localzoneTime1.selectValue = Integer.toString(0);
          localzoneTime1.oneon_hour = "00";
          localzoneTime1.oneon_minute = "00";
          localzoneTime1.oneoff_hour = "00";
          localzoneTime1.oneoff_minute = "00";
          localzoneTime1.twoon_hour = "00";
          localzoneTime1.twoon_minute = "00";
          localzoneTime1.twooff_hour = "00";
          localzoneTime1.twooff_minute = "00";
          localzoneTime1.threeon_hour = "00";
          localzoneTime1.threeon_minute = "00";
          localzoneTime1.threeoff_hour = "00";
          localzoneTime1.threeoff_minute = "00";
          localzoneTime1.fouron_hour = "00";
          localzoneTime1.fouron_minute = "00";
          localzoneTime1.fouroff_hour = "00";
          localzoneTime1.fouroff_minute = "00";
          this.tvTimeOn.setText("00:00");
          this.tvTimeOff.setText("00:00");
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
          this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
          MyApp.deviceService.zoneTime_addDevice(localzoneTime1);
        }
      }
      else
      {
        this.groupLayout.setVisibility(0);
        this.vCH.setVisibility(8);
        this.timeMode = false;
        int k = MyApp.deviceService.getDeviceLogin(MyApp.DeviceControl.getMacAddress());
        String str3 = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(k);
        if (MyApp.deviceService.zoneTime_isDeviceExists(str3))
        {
          zoneTime localzoneTime4 = MyApp.deviceService.zoneTime_getMyDevice(str3);
          this.zoneMode = Integer.parseInt(localzoneTime4.selectValue);
          this.tvTimeOn.setText(localzoneTime4.oneon_hour + ":" + localzoneTime4.oneon_minute);
          this.tvTimeOff.setText(localzoneTime4.oneoff_hour + ":" + localzoneTime4.oneoff_minute);
          if ((0x1 & this.zoneMode) == 1)
            this.wifi_time_on.setBackgroundResource(R.drawable.choice_on);
          while (true)
          {
            if ((0x2 & this.zoneMode) != 2)
              break label2382;
            this.wifi_time_off.setBackgroundResource(R.drawable.choice_on);
            break;
            this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
          }
          label2382: this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
        }
        else
        {
          zoneTime localzoneTime3 = new zoneTime();
          localzoneTime3.mac = str3;
          localzoneTime3.selectValue = Integer.toString(0);
          localzoneTime3.oneon_hour = "00";
          localzoneTime3.oneon_minute = "00";
          localzoneTime3.oneoff_hour = "00";
          localzoneTime3.oneoff_minute = "00";
          localzoneTime3.twoon_hour = "00";
          localzoneTime3.twoon_minute = "00";
          localzoneTime3.twooff_hour = "00";
          localzoneTime3.twooff_minute = "00";
          localzoneTime3.threeon_hour = "00";
          localzoneTime3.threeon_minute = "00";
          localzoneTime3.threeoff_hour = "00";
          localzoneTime3.threeoff_minute = "00";
          localzoneTime3.fouron_hour = "00";
          localzoneTime3.fouron_minute = "00";
          localzoneTime3.fouroff_hour = "00";
          localzoneTime3.fouroff_minute = "00";
          this.tvTimeOn.setText("00:00");
          this.tvTimeOff.setText("00:00");
          this.wifi_time_on.setBackgroundResource(R.drawable.choice_off);
          this.wifi_time_off.setBackgroundResource(R.drawable.choice_off);
          MyApp.deviceService.zoneTime_addDevice(localzoneTime3);
        }
      }
    }
  }

  private class GroupUtil
  {
    private LinearLayout container;
    private Context context;
    private ArrayList<String> groups;
    private LayoutInflater inflater;
    private int selectPos;

    public GroupUtil(LinearLayout paramArrayList, ArrayList<String> arg3)
    {
      this.context = paramArrayList;
      Object localObject1;
      this.container = localObject1;
      Object localObject2;
      this.groups = localObject2;
      this.inflater = LayoutInflater.from(paramArrayList);
    }

    private void setItemStyle(TextView paramTextView, boolean paramBoolean)
    {
      if (paramBoolean)
      {
        paramTextView.setBackgroundResource(R.drawable.group_item_selected);
        paramTextView.setTextColor(-1);
        paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_group_selected, 0, 0);
        return;
      }
      paramTextView.setBackgroundResource(R.drawable.page_bg);
      paramTextView.setTextColor(this.context.getResources().getColor(R.color.light_name));
      paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_group_nor, 0, 0);
    }

    public int getSelectPos()
    {
      return this.selectPos;
    }

    public void initGroup(int paramInt)
    {
      this.selectPos = paramInt;
      SetTimeActivity.this.local_remo = (byte)(paramInt + 1);
      if (this.groups == null);
      int j;
      for (int i = 0; ; i = this.groups.size())
      {
        j = 0;
        if (j < i)
          break;
        return;
      }
      TextView localTextView = (TextView)this.inflater.inflate(R.layout.list_group_item, null);
      localTextView.setText((CharSequence)this.groups.get(j));
      if (j == paramInt);
      for (boolean bool = true; ; bool = false)
      {
        setItemStyle(localTextView, bool);
        localTextView.setOnClickListener(new GroupItemClickListener(j));
        localTextView.setOnLongClickListener(new GroupItemLongClickListener(j));
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0F);
        this.container.addView(localTextView, localLayoutParams);
        if (j < i - 1)
          this.inflater.inflate(R.layout.vertical_line, this.container);
        j++;
        break;
      }
    }

    public void selectAll(boolean paramBoolean)
    {
      int i = this.container.getChildCount();
      for (int j = 0; ; j++)
      {
        if (j >= i)
          return;
        View localView = this.container.getChildAt(j);
        if ((localView instanceof TextView))
          setItemStyle((TextView)localView, paramBoolean);
      }
    }

    public void selectNum(byte paramByte)
    {
      int i = this.container.getChildCount();
      byte b = 0;
      if (b >= i)
        return;
      View localView = this.container.getChildAt(b);
      TextView localTextView;
      if ((localView instanceof TextView))
      {
        localTextView = (TextView)localView;
        if (b != paramByte)
          break label59;
        setItemStyle(localTextView, true);
      }
      while (true)
      {
        b++;
        break;
        label59: setItemStyle(localTextView, false);
      }
    }

    class GroupItemClickListener
      implements View.OnClickListener
    {
      int pos;

      GroupItemClickListener(int arg2)
      {
        int i;
        this.pos = i;
      }

      public void onClick(View paramView)
      {
        SetTimeActivity.GroupUtil.this.selectPos = this.pos;
        MyApp.PlalyKeySound();
        Log.d("debug", "selectPos = " + SetTimeActivity.GroupUtil.this.selectPos);
        SetTimeActivity.this.local_remo = (byte)(1 + SetTimeActivity.GroupUtil.this.selectPos);
        Log.d("debug", "local_remo = " + SetTimeActivity.this.local_remo);
        int i = SetTimeActivity.GroupUtil.this.container.getChildCount();
        int j = 0;
        if (j >= i)
        {
          SetTimeActivity.this.getZoneTime();
          return;
        }
        View localView = SetTimeActivity.GroupUtil.this.container.getChildAt(j);
        TextView localTextView;
        SetTimeActivity.GroupUtil localGroupUtil;
        if ((localView instanceof TextView))
        {
          localTextView = (TextView)localView;
          localGroupUtil = SetTimeActivity.GroupUtil.this;
          if (localTextView != paramView)
            break label185;
        }
        label185: for (boolean bool = true; ; bool = false)
        {
          localGroupUtil.setItemStyle(localTextView, bool);
          j++;
          break;
        }
      }
    }

    class GroupItemLongClickListener
      implements View.OnLongClickListener
    {
      int pos;

      GroupItemLongClickListener(int arg2)
      {
        int i;
        this.pos = i;
      }

      public boolean onLongClick(View paramView)
      {
        final TextView localTextView = (TextView)paramView;
        final Dialog localDialog = new Dialog(SetTimeActivity.GroupUtil.this.context, R.style.EditLightDialog);
        localDialog.setContentView(R.layout.dialog_edit_group);
        localDialog.setCanceledOnTouchOutside(false);
        localDialog.setCancelable(false);
        localDialog.show();
        final EditText localEditText = (EditText)localDialog.findViewById(R.id.et_name);
        localEditText.setText(localTextView.getText());
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
            String str1 = localEditText.getText().toString();
            if (!TextUtils.isEmpty(str1))
            {
              localDialog.dismiss();
              localTextView.setText(str1);
              DecimalFormat localDecimalFormat = new DecimalFormat("00");
              String str2 = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(MyApp.rain_remoteID);
              zoneName localzoneName = MyApp.deviceService.zoneName_getMyDevice(str2);
              switch (SetTimeActivity.GroupUtil.GroupItemLongClickListener.this.pos)
              {
              default:
              case 0:
              case 1:
              case 2:
              case 3:
              }
              while (true)
              {
                MyApp.deviceService.zoneName_edit(localzoneName);
                return;
                localzoneName.zoneNameone = str1;
                continue;
                localzoneName.zoneNametwo = str1;
                continue;
                localzoneName.zoneNamethree = str1;
                continue;
                localzoneName.zoneNamefour = str1;
              }
            }
            Toast.makeText(SetTimeActivity.GroupUtil.this.context, R.string.tips_light_group_name_empty, 1).show();
          }
        });
        return true;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.SetTimeActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */