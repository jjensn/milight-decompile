package com.irainxun.wifilight.view;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;

public class MyLayout extends LinearLayout
  implements View.OnTouchListener
{
  public static final int DO_NOTHING = 0;
  public static final int LEFT = 1;
  public static final int RIGHT = 2;
  public static final int SNAP_VELOCITY = 200;
  private static final String TAG = MyLayout.class.getSimpleName();
  private LinearLayout.LayoutParams contentParams;
  private View contentView;
  private View holderView;
  private boolean isHorizontalSliding;
  private boolean isSliding;
  private boolean isValid;
  private View itemView;
  private ListView mBindView;
  private VelocityTracker mVelocityTracker;
  private View preContentView;
  private int slidePosition;
  private int slideState;
  private int touchSlop;
  private int xDown;
  private float xMove;
  private float xUp;
  private int yDown;
  private float yMove;

  public MyLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.touchSlop = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }

  private void checkLeftBorder(int paramInt)
  {
    if (this.contentParams.leftMargin != -this.holderView.getWidth())
      this.contentParams.leftMargin = paramInt;
    for (this.isValid = true; ; this.isValid = false)
    {
      if (this.contentParams.leftMargin < -this.holderView.getWidth())
        this.contentParams.leftMargin = (-this.holderView.getWidth());
      return;
    }
  }

  private void checkRightBorder(int paramInt)
  {
    if (this.contentParams.leftMargin != 0)
      this.contentParams.leftMargin = (paramInt + -this.holderView.getWidth());
    for (this.isValid = true; ; this.isValid = false)
    {
      if (this.contentParams.leftMargin > 0)
        this.contentParams.leftMargin = 0;
      return;
    }
  }

  private void checkSlideState(int paramInt1, int paramInt2)
  {
    if ((this.isHorizontalSliding) && (!this.isSliding))
    {
      if ((Math.abs(paramInt1) < this.touchSlop) || (paramInt1 >= 0))
        break label40;
      this.isSliding = true;
      this.slideState = 1;
    }
    label40: 
    while ((Math.abs(paramInt1) < this.touchSlop) || (paramInt1 <= 0))
      return;
    this.isSliding = true;
    this.slideState = 2;
  }

  private void closePreItem()
  {
    if ((this.preContentView != null) && (this.contentView != this.preContentView))
    {
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.preContentView.getLayoutParams();
      if (localLayoutParams.leftMargin < 0)
      {
        localLayoutParams.leftMargin = 0;
        this.preContentView.setLayoutParams(localLayoutParams);
      }
    }
  }

  private void createVelocityTracker(MotionEvent paramMotionEvent)
  {
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
  }

  private int getScrollVelocity()
  {
    this.mVelocityTracker.computeCurrentVelocity(1000);
    return Math.abs((int)this.mVelocityTracker.getXVelocity());
  }

  private void recycleVelocityTracker()
  {
    this.mVelocityTracker.recycle();
    this.mVelocityTracker = null;
  }

  private boolean shouldScroll(int paramInt)
  {
    return (paramInt > this.holderView.getWidth() / 2) || (getScrollVelocity() > 200);
  }

  private void unFocusBindView()
  {
    if (this.mBindView != null)
    {
      this.mBindView.setPressed(false);
      this.mBindView.setFocusable(false);
      this.mBindView.setFocusableInTouchMode(false);
    }
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    createVelocityTracker(paramMotionEvent);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (paramView.isEnabled())
      if (this.isSliding)
      {
        unFocusBindView();
        if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
          this.isSliding = false;
        return true;
        this.xDown = (int)paramMotionEvent.getX();
        this.yDown = (int)paramMotionEvent.getY();
        this.isSliding = false;
        this.isHorizontalSliding = false;
        this.slideState = 0;
        this.slidePosition = this.mBindView.pointToPosition(this.xDown, this.yDown);
        if (this.slidePosition != -1)
        {
          this.itemView = this.mBindView.getChildAt(this.slidePosition - this.mBindView.getFirstVisiblePosition());
          this.contentView = this.itemView.findViewById(R.id.contentview);
          this.holderView = this.itemView.findViewById(R.id.holderview);
          this.contentParams = ((LinearLayout.LayoutParams)this.contentView.getLayoutParams());
          closePreItem();
          continue;
          this.xMove = paramMotionEvent.getX();
          this.yMove = paramMotionEvent.getY();
          int j = (int)(this.xMove - this.xDown);
          int k = (int)(this.yMove - this.yDown);
          if (Math.abs(j) > Math.abs(k));
          for (this.isHorizontalSliding = true; (this.slidePosition != -1) && (this.itemView != null); this.isHorizontalSliding = false)
          {
            checkSlideState(j, k);
            switch (this.slideState)
            {
            default:
              break;
            case 1:
              checkLeftBorder(j);
              this.contentView.setLayoutParams(this.contentParams);
              break;
            case 2:
            }
          }
          checkRightBorder(j);
          this.contentView.setLayoutParams(this.contentParams);
          continue;
          this.xUp = paramMotionEvent.getX();
          int i = Math.abs((int)(this.xUp - this.xDown));
          if (this.isSliding)
            switch (this.slideState)
            {
            default:
            case 1:
            case 2:
            }
          while (true)
          {
            this.preContentView = this.contentView;
            recycleVelocityTracker();
            break;
            if (shouldScroll(i))
            {
              scroll2Left();
            }
            else
            {
              scroll2Right();
              continue;
              if (shouldScroll(i))
                scroll2Right();
              else
                scroll2Left();
            }
          }
        }
      }
      else
      {
        return false;
      }
    return true;
  }

  public void scroll2Left()
  {
    ScrollTask localScrollTask = new ScrollTask();
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(-15);
    localScrollTask.execute(arrayOfInteger);
  }

  public void scroll2Right()
  {
    ScrollTask localScrollTask = new ScrollTask();
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(15);
    localScrollTask.execute(arrayOfInteger);
  }

  public void setScrollEvent(ListView paramListView)
  {
    this.mBindView = paramListView;
    this.mBindView.setOnTouchListener(this);
  }

  class ScrollTask extends AsyncTask<Integer, Integer, Integer>
  {
    ScrollTask()
    {
    }

    protected Integer doInBackground(Integer[] paramArrayOfInteger)
    {
      int i = MyLayout.this.contentParams.leftMargin;
      while (true)
      {
        i += paramArrayOfInteger[0].intValue();
        if (i < -MyLayout.this.holderView.getWidth());
        for (int j = -MyLayout.this.holderView.getWidth(); ; j = 0)
        {
          MyLayout.this.isSliding = false;
          return Integer.valueOf(j);
          if (i <= 0)
            break;
        }
        Integer[] arrayOfInteger = new Integer[1];
        arrayOfInteger[0] = Integer.valueOf(i);
        publishProgress(arrayOfInteger);
        SystemClock.sleep(20L);
      }
    }

    protected void onPostExecute(Integer paramInteger)
    {
      MyLayout.this.contentParams.leftMargin = paramInteger.intValue();
      MyLayout.this.contentView.setLayoutParams(MyLayout.this.contentParams);
    }

    protected void onProgressUpdate(Integer[] paramArrayOfInteger)
    {
      MyLayout.this.contentParams.leftMargin = paramArrayOfInteger[0].intValue();
      MyLayout.this.contentView.setLayoutParams(MyLayout.this.contentParams);
      MyLayout.this.unFocusBindView();
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.MyLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */