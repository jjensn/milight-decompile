package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT092ModeFragment$4
  implements SeekBar.OnSeekBarChangeListener
{
  FUT092ModeFragment$4(FUT092ModeFragment paramFUT092ModeFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (FUT092ModeFragment.access$28(this.this$0))
    {
      MyApp.rain_08saturation = paramInt;
      if (MyApp.rain_08saturation == 0)
        MyApp.rain_08saturation = 1;
      FUT092ModeFragment.access$29(this.this$0).setText("Saturation:" + MyApp.rain_08saturation);
      if (!FUT092ModeFragment.access$30(this.this$0))
      {
        FUT092ModeFragment.access$0(this.this$0, true);
        this.this$0.myHandler.removeMessages(4357);
        this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
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
      MyApp.rain_08saturation = FUT092ModeFragment.access$4(this.this$0).getProgress();
      if (MyApp.rain_08saturation == 0)
        MyApp.rain_08saturation = 1;
      FUT092ModeFragment.access$29(this.this$0).setText("Saturation:" + MyApp.rain_08saturation);
      this.this$0.myHandler.removeMessages(4357);
      this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT092ModeFragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */