package com.irainxun.wifilight.view;

import android.os.Handler;
import android.os.Message;

class RingView$1 extends Handler
{
  RingView$1(RingView paramRingView)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 100:
    }
    do
      return;
    while (RingView.access$0(this.this$0) >= 360.0F);
    RingView localRingView = this.this$0;
    RingView.access$2(localRingView, RingView.access$0(localRingView) + RingView.access$1(this.this$0));
    this.this$0.invalidate();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.RingView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */