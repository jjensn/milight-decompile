package com.irainxun.wifilight.controller;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import com.irainxun.wifilight.fragment.FUT956ColorFragment;
import com.irainxun.wifilight.xlink.MyApp;

public class FUT956Activity extends BaseControllerActivity
{
  public FUT956Activity()
  {
  }

  protected Fragment getColorFragment()
  {
    return new FUT956ColorFragment();
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
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = R.string.fut095;
    arrayOfInt[1] = R.string.fut096;
    tvTitle.setText(arrayOfInt[new java.util.Random().nextInt(2)]);
    this.rbTabColor.performClick();
    MyApp.SettingPasswordContext(this);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.FUT956Activity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */