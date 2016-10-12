package com.irainxun.wifilight.controller;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.RadioButton;
import com.irainxun.wifilight.fragment.FUT091KelvinFragment;
import com.irainxun.wifilight.fragment.FUT092ColorFragment;
import com.irainxun.wifilight.fragment.FUT092ModeFragment;
import com.irainxun.wifilight.xlink.MyApp;

public class FUT092Activity extends BaseControllerActivity
{
  public FUT092Activity()
  {
  }

  protected Fragment getColorFragment()
  {
    return new FUT092ColorFragment();
  }

  protected Fragment getKelvinFragment()
  {
    return new FUT091KelvinFragment();
  }

  protected Fragment getModeFragment()
  {
    return new FUT092ModeFragment();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.rbTabColor.performClick();
    MyApp.SettingPasswordContext(this);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.FUT092Activity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */