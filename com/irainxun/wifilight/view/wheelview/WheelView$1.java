package com.irainxun.wifilight.view.wheelview;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.Scroller;

class WheelView$1 extends GestureDetector.SimpleOnGestureListener
{
  WheelView$1(WheelView paramWheelView)
  {
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    if (WheelView.access$0(this.this$0))
    {
      WheelView.access$1(this.this$0).forceFinished(true);
      WheelView.access$2(this.this$0);
      return true;
    }
    return false;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    WheelView.access$8(this.this$0, WheelView.access$5(this.this$0) * WheelView.access$6(this.this$0) + WheelView.access$7(this.this$0));
    int i;
    if (this.this$0.isCyclic)
    {
      i = 2147483647;
      if (!this.this$0.isCyclic)
        break label125;
    }
    label125: for (int j = -i; ; j = 0)
    {
      WheelView.access$1(this.this$0).fling(0, WheelView.access$10(this.this$0), 0, (int)(-paramFloat2) / 2, 0, 0, j, i);
      WheelView.access$11(this.this$0, 0);
      return true;
      i = WheelView.access$9(this.this$0).getItemsCount() * WheelView.access$6(this.this$0);
      break;
    }
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    WheelView.access$3(this.this$0);
    WheelView.access$4(this.this$0, (int)(-paramFloat2));
    return true;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.wheelview.WheelView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */