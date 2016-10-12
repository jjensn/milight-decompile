package com.irainxun.wifilight.controller;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import com.irainxun.wifilight.fragment.FUT098ColorFragment;
import com.irainxun.wifilight.xlink.MyApp;

public class FUT098Activity extends BaseControllerActivity
{
  public FUT098Activity()
  {
  }

  protected Fragment getColorFragment()
  {
    return new FUT098ColorFragment();
  }

  protected Fragment getKelvinFragment()
  {
    return null;
  }

  protected Fragment getModeFragment()
  {
    return null;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    tvTitle.setText(R.string.fut098);
    this.rbTabColor.performClick();
    MyApp.SettingPasswordContext(this);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.FUT098Activity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */