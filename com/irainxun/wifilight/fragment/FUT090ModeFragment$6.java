package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT090ModeFragment$6
  implements SeekBar.OnSeekBarChangeListener
{
  FUT090ModeFragment$6(FUT090ModeFragment paramFUT090ModeFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    Log.d("debug", "progress =" + paramInt);
    if (FUT090ModeFragment.access$37(this.this$0))
    {
      MyApp.rain_09saturation = paramInt;
      FUT090ModeFragment.access$40(this.this$0).setText("Saturation:" + MyApp.rain_09saturation + "%");
      if (!FUT090ModeFragment.access$41(this.this$0))
      {
        FUT090ModeFragment.access$1(this.this$0, true);
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
    if (FUT090ModeFragment.access$37(this.this$0))
    {
      MyApp.rain_09saturation = FUT090ModeFragment.access$9(this.this$0).getProgress();
      FUT090ModeFragment.access$40(this.this$0).setText("Saturation:" + MyApp.rain_09saturation + "%");
      this.this$0.myHandler.removeMessages(4357);
      this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ModeFragment.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */