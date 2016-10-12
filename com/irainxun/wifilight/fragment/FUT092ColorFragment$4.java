package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT092ColorFragment$4
  implements SeekBar.OnSeekBarChangeListener
{
  FUT092ColorFragment$4(FUT092ColorFragment paramFUT092ColorFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if ((FUT092ColorFragment.access$38(this.this$0)) && (MyApp.rain_08saturation != paramInt))
    {
      MyApp.rain_08saturation = paramInt;
      if (MyApp.rain_08saturation == 0)
        MyApp.rain_08saturation = 1;
      FUT092ColorFragment.access$36(this.this$0).setText("Saturation:" + MyApp.rain_08saturation);
      if (!FUT092ColorFragment.access$39(this.this$0))
      {
        FUT092ColorFragment.access$7(this.this$0, true);
        this.this$0.myHandler.removeMessages(4357);
        this.this$0.myHandler.sendEmptyMessageDelayed(4357, 160L);
      }
    }
  }

  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
  }

  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    if ((FUT092ColorFragment.access$38(this.this$0)) && (MyApp.rain_08saturation != FUT092ColorFragment.access$14(this.this$0).getProgress()))
    {
      MyApp.rain_08saturation = FUT092ColorFragment.access$14(this.this$0).getProgress();
      if (MyApp.rain_08saturation == 0)
        MyApp.rain_08saturation = 1;
      FUT092ColorFragment.access$36(this.this$0).setText("Saturation:" + MyApp.rain_08saturation);
      this.this$0.myHandler.removeMessages(4357);
      this.this$0.myHandler.sendEmptyMessageDelayed(4357, 10L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ColorFragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */