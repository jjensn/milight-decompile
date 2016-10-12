package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT090ColorFragment$7
  implements SeekBar.OnSeekBarChangeListener
{
  FUT090ColorFragment$7(FUT090ColorFragment paramFUT090ColorFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    Log.d("debug", "progress =" + paramInt);
    if (FUT090ColorFragment.access$45(this.this$0))
    {
      MyApp.rain_09saturation = paramInt;
      FUT090ColorFragment.access$14(this.this$0).setText("Saturation:" + MyApp.rain_09saturation + "%");
      if (!FUT090ColorFragment.access$48(this.this$0))
      {
        FUT090ColorFragment.access$8(this.this$0, true);
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
    if (FUT090ColorFragment.access$45(this.this$0))
    {
      MyApp.rain_09saturation = FUT090ColorFragment.access$18(this.this$0).getProgress();
      FUT090ColorFragment.access$14(this.this$0).setText("Saturation:" + MyApp.rain_09saturation + "%");
      this.this$0.myHandler.removeMessages(4357);
      this.this$0.myHandler.sendEmptyMessageDelayed(4357, 200L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ColorFragment.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */