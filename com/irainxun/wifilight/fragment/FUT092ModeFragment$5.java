package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT092ModeFragment$5
  implements SeekBar.OnSeekBarChangeListener
{
  FUT092ModeFragment$5(FUT092ModeFragment paramFUT092ModeFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (FUT092ModeFragment.access$28(this.this$0))
    {
      MyApp.rain_08brightness = paramInt;
      if (MyApp.rain_08brightness == 0)
        MyApp.rain_08brightness = 1;
      FUT092ModeFragment.access$31(this.this$0).setText("Brightness:" + MyApp.rain_08brightness);
      if (!FUT092ModeFragment.access$32(this.this$0))
      {
        FUT092ModeFragment.access$1(this.this$0, true);
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
    if (FUT092ModeFragment.access$28(this.this$0))
    {
      MyApp.rain_08brightness = FUT092ModeFragment.access$5(this.this$0).getProgress();
      if (MyApp.rain_08brightness == 0)
        MyApp.rain_08brightness = 1;
      FUT092ModeFragment.access$31(this.this$0).setText("Brightness:" + MyApp.rain_08brightness);
      this.this$0.myHandler.removeMessages(4355);
      this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ModeFragment.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */