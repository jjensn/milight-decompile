package com.irainxun.wifilight.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.xlink.MyApp;

class FUT092ModeFragment$3
  implements View.OnClickListener
{
  FUT092ModeFragment$3(FUT092ModeFragment paramFUT092ModeFragment)
  {
  }

  public void onClick(View paramView)
  {
    MyApp.PlalyKeySound();
    if (paramView == FUT092ModeFragment.access$26(this.this$0))
    {
      FUT092ModeFragment.access$27(this.this$0).selectAll(true);
      MyApp.rain_remo = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ModeFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */