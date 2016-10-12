package com.irainxun.wifilight.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.xlink.MyApp;

class FUT567KelvinFragment$3
  implements View.OnClickListener
{
  FUT567KelvinFragment$3(FUT567KelvinFragment paramFUT567KelvinFragment)
  {
  }

  public void onClick(View paramView)
  {
    if (paramView == FUT567KelvinFragment.access$10(this.this$0))
    {
      MyApp.PlalyKeySound();
      FUT567KelvinFragment.access$11(this.this$0).selectAll(true);
      MyApp.rain_remo = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT567KelvinFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */