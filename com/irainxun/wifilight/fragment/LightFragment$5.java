package com.irainxun.wifilight.fragment;

import android.os.Handler;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

class LightFragment$5
  implements SeekBar.OnSeekBarChangeListener
{
  LightFragment$5(LightFragment paramLightFragment)
  {
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramInt != LightFragment.access$1(this.this$0))
    {
      LightFragment.access$34(this.this$0, paramInt);
      if (LightFragment.access$1(this.this$0) == 0)
        LightFragment.access$34(this.this$0, 1);
      LightFragment.access$38(this.this$0).setText("Brightness:" + LightFragment.access$1(this.this$0));
      if (!LightFragment.access$39(this.this$0))
      {
        LightFragment.access$0(this.this$0, true);
        this.this$0.myHandler.removeMessages(4355);
        this.this$0.myHandler.sendEmptyMessageDelayed(4355, 160L);
      }
    }
  }

  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
  }

  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    if (LightFragment.access$35(this.this$0).getProgress() != LightFragment.access$1(this.this$0))
    {
      LightFragment.access$34(this.this$0, LightFragment.access$35(this.this$0).getProgress());
      if (LightFragment.access$1(this.this$0) == 0)
        LightFragment.access$34(this.this$0, 1);
      LightFragment.access$38(this.this$0).setText("Brightness:" + LightFragment.access$1(this.this$0));
      this.this$0.myHandler.removeMessages(4355);
      this.this$0.myHandler.sendEmptyMessageDelayed(4355, 10L);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.LightFragment.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */