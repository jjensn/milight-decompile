package com.irainxun.wifilight.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyViewPager extends ViewPager
{
  private boolean canScroll = false;

  public MyViewPager(Context paramContext)
  {
    super(paramContext);
  }

  public MyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.canScroll)
      return super.onInterceptTouchEvent(paramMotionEvent);
    return false;
  }

  public void setCanScroll(boolean paramBoolean)
  {
    this.canScroll = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.MyViewPager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */