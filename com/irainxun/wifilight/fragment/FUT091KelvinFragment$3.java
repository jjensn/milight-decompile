package com.irainxun.wifilight.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.xlink.MyApp;

class FUT091KelvinFragment$3
  implements View.OnClickListener
{
  FUT091KelvinFragment$3(FUT091KelvinFragment paramFUT091KelvinFragment)
  {
  }

  public void onClick(View paramView)
  {
    MyApp.PlalyKeySound();
    if (paramView == FUT091KelvinFragment.access$38(this.this$0))
      if ((MyApp.rain_remoteID == 8) && (!MyApp.lightmode))
        FUT091KelvinFragment.access$39(this.this$0).addColorPoint((int)(360.0D * (1.0D * MyApp.rain_08color / 255.0D)));
    while (paramView != FUT091KelvinFragment.access$40(this.this$0))
    {
      return;
      FUT091KelvinFragment.access$39(this.this$0).addColorPoint(FUT091KelvinFragment.access$4(this.this$0));
      return;
    }
    FUT091KelvinFragment.access$41(this.this$0).selectAll(true);
    MyApp.rain_remo = 0;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT091KelvinFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */