package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

class FUT956ColorFragment$5
  implements SeekBar.OnSeekBarChangeListener
{
  FUT956ColorFragment$5(FUT956ColorFragment paramFUT956ColorFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (FUT956ColorFragment.access$8(this.this$0) != paramInt)
    {
      FUT956ColorFragment.access$37(this.this$0, paramInt);
      if (FUT956ColorFragment.access$8(this.this$0) == 0)
        FUT956ColorFragment.access$37(this.this$0, 1);
      FUT956ColorFragment.access$40(this.this$0).setText("Brightness:" + FUT956ColorFragment.access$8(this.this$0));
      if (!FUT956ColorFragment.access$42(this.this$0))
      {
        FUT956ColorFragment.access$7(this.this$0, true);
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
    if (FUT956ColorFragment.access$8(this.this$0) != FUT956ColorFragment.access$38(this.this$0).getProgress())
    {
      FUT956ColorFragment.access$37(this.this$0, FUT956ColorFragment.access$38(this.this$0).getProgress());
      if (FUT956ColorFragment.access$8(this.this$0) == 0)
        FUT956ColorFragment.access$37(this.this$0, 1);
      FUT956ColorFragment.access$40(this.this$0).setText("Brightness:" + FUT956ColorFragment.access$8(this.this$0));
      this.this$0.myHandler.removeMessages(4355);
      this.this$0.myHandler.sendEmptyMessageDelayed(4355, 200L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT956ColorFragment.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */