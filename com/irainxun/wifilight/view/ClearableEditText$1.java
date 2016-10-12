package com.irainxun.wifilight.view;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class ClearableEditText$1
  implements View.OnTouchListener
{
  ClearableEditText$1(ClearableEditText paramClearableEditText)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    ClearableEditText localClearableEditText = this.this$0;
    if (localClearableEditText.getCompoundDrawables() == null);
    while ((paramMotionEvent.getAction() != 1) || (paramMotionEvent.getX() <= localClearableEditText.getWidth() - localClearableEditText.getPaddingRight() - this.this$0.rightDrawable.getIntrinsicWidth()))
      return false;
    localClearableEditText.setText("");
    this.this$0.removeClearButton();
    return false;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.ClearableEditText.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */