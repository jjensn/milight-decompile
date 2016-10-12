package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT091KelvinFragment$4
  implements SeekBar.OnSeekBarChangeListener
{
  FUT091KelvinFragment$4(FUT091KelvinFragment paramFUT091KelvinFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    Log.d("debug", "progress =" + paramInt);
    if ((FUT091KelvinFragment.access$50(this.this$0)) && (FUT091KelvinFragment.access$4(this.this$0) != paramInt))
    {
      FUT091KelvinFragment.access$10(this.this$0, paramInt);
      if (MyApp.rain_remoteID == 8)
      {
        MyApp.rain_08kelvin = FUT091KelvinFragment.access$4(this.this$0);
        MyApp.lightmode = true;
      }
      int i = (int)(2700.0D + 38.0D * FUT091KelvinFragment.access$4(this.this$0));
      FUT091KelvinFragment.access$47(this.this$0).setText("Kelvin:" + i + "K");
      if (!FUT091KelvinFragment.access$51(this.this$0))
      {
        FUT091KelvinFragment.access$3(this.this$0, true);
        this.this$0.myHandler.removeMessages(4355);
        this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
      }
    }
  }

  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
  }

  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    if ((FUT091KelvinFragment.access$50(this.this$0)) && (FUT091KelvinFragment.access$4(this.this$0) != FUT091KelvinFragment.access$11(this.this$0).getProgress()))
    {
      FUT091KelvinFragment.access$10(this.this$0, FUT091KelvinFragment.access$11(this.this$0).getProgress());
      if (MyApp.rain_remoteID == 8)
      {
        MyApp.rain_08kelvin = FUT091KelvinFragment.access$4(this.this$0);
        MyApp.lightmode = true;
      }
      int i = (int)(2700.0D + 38.0D * FUT091KelvinFragment.access$4(this.this$0));
      FUT091KelvinFragment.access$47(this.this$0).setText("Kelvin:" + i + "K");
      this.this$0.myHandler.removeMessages(4355);
      this.this$0.myHandler.sendEmptyMessageDelayed(4355, 10L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT091KelvinFragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */