package com.irainxun.wifilight.controller;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import com.irainxun.wifilight.fragment.FUT022KelvinFragment;
import com.irainxun.wifilight.xlink.MyApp;

public class FUT022Activity extends BaseControllerActivity
{
  public FUT022Activity()
  {
  }

  protected Fragment getColorFragment()
  {
    return null;
  }

  protected Fragment getKelvinFragment()
  {
    return new FUT022KelvinFragment();
  }

  protected Fragment getModeFragment()
  {
    return null;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    tvTitle.setText(R.string.fut022);
    this.rbTabKelvin.performClick();
    MyApp.SettingPasswordContext(this);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.FUT022Activity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */