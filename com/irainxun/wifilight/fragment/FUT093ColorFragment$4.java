package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

class FUT093ColorFragment$4
  implements SeekBar.OnSeekBarChangeListener
{
  FUT093ColorFragment$4(FUT093ColorFragment paramFUT093ColorFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    Log.d("debug", "progress =" + paramInt);
    if (FUT093ColorFragment.access$4(this.this$0) != paramInt)
    {
      FUT093ColorFragment.access$45(this.this$0, paramInt);
      int i = (int)(2700.0D + 38.0D * FUT093ColorFragment.access$4(this.this$0));
      FUT093ColorFragment.access$47(this.this$0).setText("Kelvin:" + i + "K");
      if (!FUT093ColorFragment.access$48(this.this$0))
      {
        FUT093ColorFragment.access$3(this.this$0, true);
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
    if (FUT093ColorFragment.access$4(this.this$0) != FUT093ColorFragment.access$46(this.this$0).getProgress())
    {
      FUT093ColorFragment.access$45(this.this$0, FUT093ColorFragment.access$46(this.this$0).getProgress());
      int i = (int)(2700.0D + 38.0D * FUT093ColorFragment.access$4(this.this$0));
      FUT093ColorFragment.access$47(this.this$0).setText("Kelvin:" + i + "K");
      this.this$0.myHandler.removeMessages(4355);
      this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT093ColorFragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */