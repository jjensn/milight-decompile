package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT092ColorFragment$5
  implements SeekBar.OnSeekBarChangeListener
{
  FUT092ColorFragment$5(FUT092ColorFragment paramFUT092ColorFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if ((FUT092ColorFragment.access$38(this.this$0)) && (MyApp.rain_08brightness != paramInt))
    {
      MyApp.rain_08brightness = paramInt;
      if (MyApp.rain_08brightness == 0)
        MyApp.rain_08brightness = 1;
      FUT092ColorFragment.access$37(this.this$0).setText("Brightness:" + MyApp.rain_08brightness);
      if (!FUT092ColorFragment.access$40(this.this$0))
      {
        FUT092ColorFragment.access$8(this.this$0, true);
        this.this$0.myHandler.removeMessages(4355);
        this.this$0.myHandler.sendEmptyMessageDelayed(4355, 160L);
      }
    }
  }

  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
  }

  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    if ((FUT092ColorFragment.access$38(this.this$0)) && (MyApp.rain_08brightness != FUT092ColorFragment.access$15(this.this$0).getProgress()))
    {
      MyApp.rain_08brightness = FUT092ColorFragment.access$15(this.this$0).getProgress();
      if (MyApp.rain_08brightness == 0)
        MyApp.rain_08brightness = 1;
      FUT092ColorFragment.access$37(this.this$0).setText("Brightness:" + MyApp.rain_08brightness);
      this.this$0.myHandler.removeMessages(4355);
      this.this$0.myHandler.sendEmptyMessageDelayed(4355, 10L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ColorFragment.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */