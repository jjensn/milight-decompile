package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT090ColorFragment$6
  implements SeekBar.OnSeekBarChangeListener
{
  FUT090ColorFragment$6(FUT090ColorFragment paramFUT090ColorFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    Log.d("debug", "progress =" + paramInt);
    if (FUT090ColorFragment.access$45(this.this$0))
    {
      MyApp.rain_09kelvin = paramInt;
      int i = (int)(2700.0D + 100.0D * MyApp.rain_09kelvin);
      FUT090ColorFragment.access$16(this.this$0).setText("Kelvin:" + i + "K");
      if (!FUT090ColorFragment.access$47(this.this$0))
      {
        FUT090ColorFragment.access$9(this.this$0, true);
        this.this$0.myHandler.removeMessages(4358);
        this.this$0.myHandler.sendEmptyMessageDelayed(4358, 200L);
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
      MyApp.rain_09kelvin = FUT090ColorFragment.access$19(this.this$0).getProgress();
      int i = (int)(2700.0D + 100.0D * MyApp.rain_09kelvin);
      FUT090ColorFragment.access$16(this.this$0).setText("Kelvin:" + i + "K");
      this.this$0.myHandler.removeMessages(4358);
      this.this$0.myHandler.sendEmptyMessageDelayed(4358, 200L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ColorFragment.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */