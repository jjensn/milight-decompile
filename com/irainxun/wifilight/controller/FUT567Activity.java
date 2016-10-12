package com.irainxun.wifilight.controller;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import com.irainxun.wifilight.fragment.FUT567KelvinFragment;
import com.irainxun.wifilight.xlink.MyApp;

public class FUT567Activity extends BaseControllerActivity
{
  public FUT567Activity()
  {
  }

  protected Fragment getColorFragment()
  {
    return null;
  }

  protected Fragment getKelvinFragment()
  {
    return new FUT567KelvinFragment();
  }

  protected Fragment getModeFragment()
  {
    return null;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int[] arrayOfInt = { R.string.fut005, R.string.fut006, R.string.fut007 };
    tvTitle.setText(arrayOfInt[new java.util.Random().nextInt(3)]);
    this.rbTabKelvin.performClick();
    MyApp.SettingPasswordContext(this);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.FUT567Activity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */