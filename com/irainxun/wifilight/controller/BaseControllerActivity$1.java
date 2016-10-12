package com.irainxun.wifilight.controller;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

class BaseControllerActivity$1
  implements RadioGroup.OnCheckedChangeListener
{
  BaseControllerActivity$1(BaseControllerActivity paramBaseControllerActivity)
  {
  }

  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    FragmentTransaction localFragmentTransaction = BaseControllerActivity.access$0(this.this$0).beginTransaction();
    if (paramInt == R.id.rb1)
    {
      BaseControllerActivity.access$1(this.this$0).setVisibility(4);
      BaseControllerActivity.tvTitle.setText(R.string.wifi_light);
      localFragmentTransaction.replace(R.id.content, BaseControllerActivity.access$2(this.this$0));
    }
    while (true)
    {
      localFragmentTransaction.commit();
      return;
      if (paramInt == R.id.rb2)
      {
        BaseControllerActivity.access$1(this.this$0).setVisibility(0);
        BaseControllerActivity.tvTitle.setText(R.string.colors);
        localFragmentTransaction.replace(R.id.content, BaseControllerActivity.access$3(this.this$0));
      }
      else if (paramInt == R.id.rb3)
      {
        BaseControllerActivity.access$1(this.this$0).setVisibility(0);
        BaseControllerActivity.tvTitle.setText(R.string.kelvin);
        localFragmentTransaction.replace(R.id.content, BaseControllerActivity.access$4(this.this$0));
      }
      else if (paramInt == R.id.rb4)
      {
        BaseControllerActivity.access$1(this.this$0).setVisibility(0);
        BaseControllerActivity.tvTitle.setText(R.string.modes);
        localFragmentTransaction.replace(R.id.content, BaseControllerActivity.access$5(this.this$0));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.BaseControllerActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */