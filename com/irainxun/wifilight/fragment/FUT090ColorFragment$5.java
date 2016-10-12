package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT090ColorFragment$5
  implements SeekBar.OnSeekBarChangeListener
{
  FUT090ColorFragment$5(FUT090ColorFragment paramFUT090ColorFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    Log.d("debug", "progress =" + paramInt);
    if (FUT090ColorFragment.access$45(this.this$0))
    {
      MyApp.rain_09brightness = paramInt;
      if (MyApp.rain_09brightness == 0)
        MyApp.rain_09brightness = 1;
      FUT090ColorFragment.access$15(this.this$0).setText("Brightness:" + MyApp.rain_09brightness);
      if (!FUT090ColorFragment.access$46(this.this$0))
      {
        FUT090ColorFragment.access$7(this.this$0, true);
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
    if (FUT090ColorFragment.access$45(this.this$0))
    {
      MyApp.rain_09brightness = FUT090ColorFragment.access$17(this.this$0).getProgress();
      if (MyApp.rain_09brightness == 0)
        MyApp.rain_09brightness = 1;
      FUT090ColorFragment.access$15(this.this$0).setText("Brightness:" + MyApp.rain_09brightness);
      this.this$0.myHandler.removeMessages(4355);
      this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ColorFragment.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */