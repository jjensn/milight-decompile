package com.irainxun.wifilight.view.wheelview;

import android.os.Handler;
import android.os.Message;
import android.widget.Scroller;

class WheelView$2 extends Handler
{
  WheelView$2(WheelView paramWheelView)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    WheelView.access$1(this.this$0).computeScrollOffset();
    int i = WheelView.access$1(this.this$0).getCurrY();
    int j = WheelView.access$10(this.this$0) - i;
    WheelView.access$8(this.this$0, i);
    if (j != 0)
      WheelView.access$4(this.this$0, j);
    if (Math.abs(i - WheelView.access$1(this.this$0).getFinalY()) < 1)
    {
      WheelView.access$1(this.this$0).getFinalY();
      WheelView.access$1(this.this$0).forceFinished(true);
    }
    if (!WheelView.access$1(this.this$0).isFinished())
    {
      WheelView.access$12(this.this$0).sendEmptyMessage(paramMessage.what);
      return;
    }
    if (paramMessage.what == 0)
    {
      WheelView.access$13(this.this$0);
      return;
    }
    this.this$0.finishScrolling();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.wheelview.WheelView.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */