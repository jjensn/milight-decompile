package com.irainxun.wifilight.view;

import android.database.DataSetObserver;

class HorizontalListView$1 extends DataSetObserver
{
  HorizontalListView$1(HorizontalListView paramHorizontalListView)
  {
  }

  public void onChanged()
  {
    synchronized (this.this$0)
    {
      HorizontalListView.access$2(this.this$0, true);
      this.this$0.invalidate();
      this.this$0.requestLayout();
      return;
    }
  }

  public void onInvalidated()
  {
    HorizontalListView.access$3(this.this$0);
    this.this$0.invalidate();
    this.this$0.requestLayout();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.HorizontalListView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */