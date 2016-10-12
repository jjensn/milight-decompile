package com.irainxun.wifilight;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TimePicker;
import android.widget.Toast;
import cn.jpush.android.api.InstrumentedActivity;
import cn.jpush.android.api.JPushInterface;
import java.util.HashSet;
import java.util.Set;

public class JG_SettingActivity extends InstrumentedActivity
  implements View.OnClickListener
{
  TimePicker endTime;
  SharedPreferences.Editor mEditor;
  CheckBox mFriday;
  CheckBox mMonday;
  CheckBox mSaturday;
  Button mSetTime;
  SharedPreferences mSettings;
  CheckBox mSunday;
  CheckBox mThursday;
  CheckBox mTuesday;
  CheckBox mWednesday;
  TimePicker startTime;

  public JG_SettingActivity()
  {
  }

  private void init()
  {
    this.startTime = ((TimePicker)findViewById(R.id.start_time));
    this.endTime = ((TimePicker)findViewById(R.id.end_time));
    this.startTime.setIs24HourView(Boolean.valueOf(DateFormat.is24HourFormat(this)));
    this.endTime.setIs24HourView(Boolean.valueOf(DateFormat.is24HourFormat(this)));
    this.mSetTime = ((Button)findViewById(R.id.bu_setTime));
    this.mMonday = ((CheckBox)findViewById(R.id.cb_monday));
    this.mTuesday = ((CheckBox)findViewById(R.id.cb_tuesday));
    this.mWednesday = ((CheckBox)findViewById(R.id.cb_wednesday));
    this.mThursday = ((CheckBox)findViewById(R.id.cb_thursday));
    this.mFriday = ((CheckBox)findViewById(R.id.cb_friday));
    this.mSaturday = ((CheckBox)findViewById(R.id.cb_saturday));
    this.mSunday = ((CheckBox)findViewById(R.id.cb_sunday));
  }

  private void initAllWeek(boolean paramBoolean)
  {
    this.mSunday.setChecked(paramBoolean);
    this.mMonday.setChecked(paramBoolean);
    this.mTuesday.setChecked(paramBoolean);
    this.mWednesday.setChecked(paramBoolean);
    this.mThursday.setChecked(paramBoolean);
    this.mFriday.setChecked(paramBoolean);
    this.mSaturday.setChecked(paramBoolean);
  }

  private void initData()
  {
    this.mSettings = getSharedPreferences("JPUSH_EXAMPLE", 0);
    String str = this.mSettings.getString("JPUSH_EXAMPLE_DAYS", "");
    String[] arrayOfString;
    int m;
    if (!TextUtils.isEmpty(str))
    {
      initAllWeek(false);
      arrayOfString = str.split(",");
      int k = arrayOfString.length;
      m = 0;
      if (m < k);
    }
    while (true)
    {
      int i = this.mSettings.getInt("PREFS_START_TIME", 0);
      this.startTime.setCurrentHour(Integer.valueOf(i));
      int j = this.mSettings.getInt("PREFS_END_TIME", 23);
      this.endTime.setCurrentHour(Integer.valueOf(j));
      return;
      setWeek(arrayOfString[m]);
      m++;
      break;
      initAllWeek(true);
    }
  }

  private void initListener()
  {
    this.mSetTime.setOnClickListener(this);
  }

  private void setPushTime()
  {
    int i = this.startTime.getCurrentHour().intValue();
    int j = this.endTime.getCurrentHour().intValue();
    if (i > j)
    {
      Toast.makeText(this, "开始时间不能大于结束时间", 0).show();
      return;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    HashSet localHashSet = new HashSet();
    if (this.mSunday.isChecked())
    {
      localHashSet.add(Integer.valueOf(0));
      localStringBuffer.append("0,");
    }
    if (this.mMonday.isChecked())
    {
      localHashSet.add(Integer.valueOf(1));
      localStringBuffer.append("1,");
    }
    if (this.mTuesday.isChecked())
    {
      localHashSet.add(Integer.valueOf(2));
      localStringBuffer.append("2,");
    }
    if (this.mWednesday.isChecked())
    {
      localHashSet.add(Integer.valueOf(3));
      localStringBuffer.append("3,");
    }
    if (this.mThursday.isChecked())
    {
      localHashSet.add(Integer.valueOf(4));
      localStringBuffer.append("4,");
    }
    if (this.mFriday.isChecked())
    {
      localHashSet.add(Integer.valueOf(5));
      localStringBuffer.append("5,");
    }
    if (this.mSaturday.isChecked())
    {
      localHashSet.add(Integer.valueOf(6));
      localStringBuffer.append("6,");
    }
    JPushInterface.setPushTime(getApplicationContext(), localHashSet, i, j);
    this.mEditor = this.mSettings.edit();
    this.mEditor.putString("JPUSH_EXAMPLE_DAYS", localStringBuffer.toString());
    this.mEditor.putInt("PREFS_START_TIME", i);
    this.mEditor.putInt("PREFS_END_TIME", j);
    this.mEditor.commit();
    Toast.makeText(this, R.string.setting_su, 0).show();
  }

  private void setWeek(String paramString)
  {
    switch (Integer.valueOf(paramString).intValue())
    {
    default:
      return;
    case 0:
      this.mSunday.setChecked(true);
      return;
    case 1:
      this.mMonday.setChecked(true);
      return;
    case 2:
      this.mTuesday.setChecked(true);
      return;
    case 3:
      this.mWednesday.setChecked(true);
      return;
    case 4:
      this.mThursday.setChecked(true);
      return;
    case 5:
      this.mFriday.setChecked(true);
      return;
    case 6:
    }
    this.mSaturday.setChecked(true);
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case R.id.bu_setTime:
    }
    paramView.requestFocus();
    paramView.requestFocusFromTouch();
    setPushTime();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.jg_set_push_time);
    init();
    initListener();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
      finish();
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onStart()
  {
    super.onStart();
    initData();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.JG_SettingActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */