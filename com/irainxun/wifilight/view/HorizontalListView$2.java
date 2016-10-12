package com.irainxun.wifilight.view;

import android.graphics.Rect;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;

class HorizontalListView$2 extends GestureDetector.SimpleOnGestureListener
{
  HorizontalListView$2(HorizontalListView paramHorizontalListView)
  {
  }

  private boolean isEventWithinView(MotionEvent paramMotionEvent, View paramView)
  {
    Rect localRect = new Rect();
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[0];
    int j = i + paramView.getWidth();
    int k = arrayOfInt[1];
    localRect.set(i, k, j, k + paramView.getHeight());
    return localRect.contains((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY());
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return this.this$0.onDown(paramMotionEvent);
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return this.this$0.onFling(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
    int i = this.this$0.getChildCount();
    for (int j = 0; ; j++)
    {
      if (j >= i);
      View localView;
      do
      {
        return;
        localView = this.this$0.getChildAt(j);
        if (!isEventWithinView(paramMotionEvent, localView))
          break;
      }
      while (HorizontalListView.access$7(this.this$0) == null);
      HorizontalListView.access$7(this.this$0).onItemLongClick(this.this$0, localView, j + (1 + HorizontalListView.access$5(this.this$0)), this.this$0.mAdapter.getItemId(j + (1 + HorizontalListView.access$5(this.this$0))));
      return;
    }
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    synchronized (this.this$0)
    {
      HorizontalListView localHorizontalListView2 = this.this$0;
      localHorizontalListView2.mNextX += (int)paramFloat1;
      this.this$0.requestLayout();
      return true;
    }
  }

  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    for (int i = 0; ; i++)
    {
      if (i >= this.this$0.getChildCount());
      while (true)
      {
        return true;
        View localView = this.this$0.getChildAt(i);
        if (!isEventWithinView(paramMotionEvent, localView))
          break;
        if (HorizontalListView.access$4(this.this$0) != null)
          HorizontalListView.access$4(this.this$0).onItemClick(this.this$0, localView, i + (1 + HorizontalListView.access$5(this.this$0)), this.this$0.mAdapter.getItemId(i + (1 + HorizontalListView.access$5(this.this$0))));
        if (HorizontalListView.access$6(this.this$0) != null)
          HorizontalListView.access$6(this.this$0).onItemSelected(this.this$0, localView, i + (1 + HorizontalListView.access$5(this.this$0)), this.this$0.mAdapter.getItemId(i + (1 + HorizontalListView.access$5(this.this$0))));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.HorizontalListView.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */