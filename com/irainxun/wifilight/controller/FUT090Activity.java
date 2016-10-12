package com.irainxun.wifilight.controller;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import com.irainxun.wifilight.fragment.FUT090ColorFragment;
import com.irainxun.wifilight.fragment.FUT090ModeFragment;
import com.irainxun.wifilight.xlink.MyApp;

public class FUT090Activity extends BaseControllerActivity
{
  public FUT090Activity()
  {
  }

  protected Fragment getColorFragment()
  {
    return new FUT090ColorFragment();
  }

  protected Fragment getKelvinFragment()
  {
    return null;
  }

  protected Fragment getModeFragment()
  {
    return new FUT090ModeFragment();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    tvTitle.setText(R.string.fut090);
    this.rbTabColor.performClick();
    MyApp.SettingPasswordContext(this);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.FUT090Activity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */