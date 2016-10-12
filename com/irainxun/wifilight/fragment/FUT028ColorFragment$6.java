package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

class FUT028ColorFragment$6
  implements SeekBar.OnSeekBarChangeListener
{
  FUT028ColorFragment$6(FUT028ColorFragment paramFUT028ColorFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    FUT028ColorFragment.access$40(this.this$0, paramInt);
    if (FUT028ColorFragment.access$8(this.this$0) == 0)
      FUT028ColorFragment.access$40(this.this$0, 1);
    FUT028ColorFragment.access$41(this.this$0).setText("Brightness:" + FUT028ColorFragment.access$8(this.this$0));
    if (!FUT028ColorFragment.access$42(this.this$0))
    {
      FUT028ColorFragment.access$7(this.this$0, true);
      this.this$0.myHandler.removeMessages(4355);
      this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
    }
  }

  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
  }

  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    FUT028ColorFragment.access$40(this.this$0, FUT028ColorFragment.access$39(this.this$0).getProgress());
    if (FUT028ColorFragment.access$8(this.this$0) == 0)
      FUT028ColorFragment.access$40(this.this$0, 1);
    FUT028ColorFragment.access$41(this.this$0).setText("Brightness:" + FUT028ColorFragment.access$8(this.this$0));
    this.this$0.myHandler.removeMessages(4355);
    this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT028ColorFragment.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */