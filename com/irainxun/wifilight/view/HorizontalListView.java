package com.irainxun.wifilight.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.Scroller;
import java.util.LinkedList;
import java.util.Queue;

public class HorizontalListView extends AdapterView<ListAdapter>
{
  protected ListAdapter mAdapter;
  public boolean mAlwaysOverrideTouch = true;
  protected int mCurrentX;
  private boolean mDataChanged = false;
  private DataSetObserver mDataObserver = new DataSetObserver()
  {
    public void onChanged()
    {
      synchronized (HorizontalListView.this)
      {
        HorizontalListView.this.mDataChanged = true;
        HorizontalListView.this.invalidate();
        HorizontalListView.this.requestLayout();
        return;
      }
    }

    public void onInvalidated()
    {
      HorizontalListView.this.reset();
      HorizontalListView.this.invalidate();
      HorizontalListView.this.requestLayout();
    }
  };
  private int mDisplayOffset = 0;
  private GestureDetector mGesture;
  private int mLeftViewIndex = -1;
  private int mMaxX = 2147483647;
  protected int mNextX;
  private GestureDetector.OnGestureListener mOnGesture = new GestureDetector.SimpleOnGestureListener()
  {
    private boolean isEventWithinView(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
    {
      Rect localRect = new Rect();
      int[] arrayOfInt = new int[2];
      paramAnonymousView.getLocationOnScreen(arrayOfInt);
      int i = arrayOfInt[0];
      int j = i + paramAnonymousView.getWidth();
      int k = arrayOfInt[1];
      localRect.set(i, k, j, k + paramAnonymousView.getHeight());
      return localRect.contains((int)paramAnonymousMotionEvent.getRawX(), (int)paramAnonymousMotionEvent.getRawY());
    }

    public boolean onDown(MotionEvent paramAnonymousMotionEvent)
    {
      return HorizontalListView.this.onDown(paramAnonymousMotionEvent);
    }

    public boolean onFling(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      return HorizontalListView.this.onFling(paramAnonymousMotionEvent1, paramAnonymousMotionEvent2, paramAnonymousFloat1, paramAnonymousFloat2);
    }

    public void onLongPress(MotionEvent paramAnonymousMotionEvent)
    {
      int i = HorizontalListView.this.getChildCount();
      for (int j = 0; ; j++)
      {
        if (j >= i);
        View localView;
        do
        {
          return;
          localView = HorizontalListView.this.getChildAt(j);
          if (!isEventWithinView(paramAnonymousMotionEvent, localView))
            break;
        }
        while (HorizontalListView.this.mOnItemLongClicked == null);
        HorizontalListView.this.mOnItemLongClicked.onItemLongClick(HorizontalListView.this, localView, j + (1 + HorizontalListView.this.mLeftViewIndex), HorizontalListView.this.mAdapter.getItemId(j + (1 + HorizontalListView.this.mLeftViewIndex)));
        return;
      }
    }

    public boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      synchronized (HorizontalListView.this)
      {
        HorizontalListView localHorizontalListView2 = HorizontalListView.this;
        localHorizontalListView2.mNextX += (int)paramAnonymousFloat1;
        HorizontalListView.this.requestLayout();
        return true;
      }
    }

    public boolean onSingleTapConfirmed(MotionEvent paramAnonymousMotionEvent)
    {
      for (int i = 0; ; i++)
      {
        if (i >= HorizontalListView.this.getChildCount());
        while (true)
        {
          return true;
          View localView = HorizontalListView.this.getChildAt(i);
          if (!isEventWithinView(paramAnonymousMotionEvent, localView))
            break;
          if (HorizontalListView.this.mOnItemClicked != null)
            HorizontalListView.this.mOnItemClicked.onItemClick(HorizontalListView.this, localView, i + (1 + HorizontalListView.this.mLeftViewIndex), HorizontalListView.this.mAdapter.getItemId(i + (1 + HorizontalListView.this.mLeftViewIndex)));
          if (HorizontalListView.this.mOnItemSelected != null)
            HorizontalListView.this.mOnItemSelected.onItemSelected(HorizontalListView.this, localView, i + (1 + HorizontalListView.this.mLeftViewIndex), HorizontalListView.this.mAdapter.getItemId(i + (1 + HorizontalListView.this.mLeftViewIndex)));
        }
      }
    }
  };
  private AdapterView.OnItemClickListener mOnItemClicked;
  private AdapterView.OnItemLongClickListener mOnItemLongClicked;
  private AdapterView.OnItemSelectedListener mOnItemSelected;
  private Queue<View> mRemovedViewQueue = new LinkedList();
  private int mRightViewIndex = 0;
  protected Scroller mScroller;

  public HorizontalListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initView();
  }

  private void addAndMeasureChild(View paramView, int paramInt)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    addViewInLayout(paramView, paramInt, localLayoutParams, true);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), -2147483648), View.MeasureSpec.makeMeasureSpec(getHeight(), -2147483648));
  }

  private void fillList(int paramInt)
  {
    View localView1 = getChildAt(-1 + getChildCount());
    int i = 0;
    if (localView1 != null)
      i = localView1.getRight();
    fillListRight(i, paramInt);
    View localView2 = getChildAt(0);
    int j = 0;
    if (localView2 != null)
      j = localView2.getLeft();
    fillListLeft(j, paramInt);
  }

  private void fillListLeft(int paramInt1, int paramInt2)
  {
    while (true)
    {
      if ((paramInt1 + paramInt2 <= 0) || (this.mLeftViewIndex < 0))
        return;
      View localView = this.mAdapter.getView(this.mLeftViewIndex, (View)this.mRemovedViewQueue.poll(), this);
      addAndMeasureChild(localView, 0);
      paramInt1 -= localView.getMeasuredWidth();
      this.mLeftViewIndex = (-1 + this.mLeftViewIndex);
      this.mDisplayOffset -= localView.getMeasuredWidth();
    }
  }

  private void fillListRight(int paramInt1, int paramInt2)
  {
    while (true)
    {
      if ((paramInt1 + paramInt2 >= getWidth()) || (this.mRightViewIndex >= this.mAdapter.getCount()))
        return;
      View localView = this.mAdapter.getView(this.mRightViewIndex, (View)this.mRemovedViewQueue.poll(), this);
      addAndMeasureChild(localView, -1);
      paramInt1 += localView.getMeasuredWidth();
      if (this.mRightViewIndex == -1 + this.mAdapter.getCount())
        this.mMaxX = (paramInt1 + this.mCurrentX - getWidth());
      if (this.mMaxX < 0)
        this.mMaxX = 0;
      this.mRightViewIndex = (1 + this.mRightViewIndex);
    }
  }

  private void initView()
  {
    try
    {
      this.mLeftViewIndex = -1;
      this.mRightViewIndex = 0;
      this.mDisplayOffset = 0;
      this.mCurrentX = 0;
      this.mNextX = 0;
      this.mMaxX = 2147483647;
      this.mScroller = new Scroller(getContext());
      this.mGesture = new GestureDetector(getContext(), this.mOnGesture);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void positionItems(int paramInt)
  {
    int i;
    if (getChildCount() > 0)
    {
      this.mDisplayOffset = (paramInt + this.mDisplayOffset);
      i = this.mDisplayOffset;
    }
    for (int j = 0; ; j++)
    {
      if (j >= getChildCount())
        return;
      View localView = getChildAt(j);
      int k = localView.getMeasuredWidth();
      localView.layout(i, 0, i + k, localView.getMeasuredHeight());
      i += k + localView.getPaddingRight();
    }
  }

  private void removeNonVisibleItems(int paramInt)
  {
    View localView1 = getChildAt(0);
    if ((localView1 == null) || (paramInt + localView1.getRight() > 0));
    for (View localView2 = getChildAt(-1 + getChildCount()); ; localView2 = getChildAt(-1 + getChildCount()))
    {
      if ((localView2 == null) || (paramInt + localView2.getLeft() < getWidth()))
      {
        return;
        this.mDisplayOffset += localView1.getMeasuredWidth();
        this.mRemovedViewQueue.offer(localView1);
        removeViewInLayout(localView1);
        this.mLeftViewIndex = (1 + this.mLeftViewIndex);
        localView1 = getChildAt(0);
        break;
      }
      this.mRemovedViewQueue.offer(localView2);
      removeViewInLayout(localView2);
      this.mRightViewIndex = (-1 + this.mRightViewIndex);
    }
  }

  private void reset()
  {
    try
    {
      initView();
      removeAllViewsInLayout();
      requestLayout();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchTouchEvent(paramMotionEvent) | this.mGesture.onTouchEvent(paramMotionEvent);
  }

  public ListAdapter getAdapter()
  {
    return this.mAdapter;
  }

  public View getSelectedView()
  {
    return null;
  }

  protected boolean onDown(MotionEvent paramMotionEvent)
  {
    this.mScroller.forceFinished(true);
    return true;
  }

  protected boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    try
    {
      this.mScroller.fling(this.mNextX, 0, (int)(-paramFloat1), 0, 0, this.mMaxX, 0, 0);
      requestLayout();
      return true;
    }
    finally
    {
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      ListAdapter localListAdapter = this.mAdapter;
      if (localListAdapter == null);
      while (true)
      {
        return;
        if (this.mDataChanged)
        {
          int j = this.mCurrentX;
          initView();
          removeAllViewsInLayout();
          this.mNextX = j;
          this.mDataChanged = false;
        }
        if (this.mScroller.computeScrollOffset())
          this.mNextX = this.mScroller.getCurrX();
        if (this.mNextX <= 0)
        {
          this.mNextX = 0;
          this.mScroller.forceFinished(true);
        }
        if (this.mNextX >= this.mMaxX)
        {
          this.mNextX = this.mMaxX;
          this.mScroller.forceFinished(true);
        }
        int i = this.mCurrentX - this.mNextX;
        removeNonVisibleItems(i);
        fillList(i);
        positionItems(i);
        this.mCurrentX = this.mNextX;
        if (!this.mScroller.isFinished())
          post(new Runnable()
          {
            public void run()
            {
              HorizontalListView.this.requestLayout();
            }
          });
      }
    }
    finally
    {
    }
  }

  public void scrollTo(int paramInt)
  {
    try
    {
      this.mScroller.startScroll(this.mNextX, 0, paramInt - this.mNextX, 0);
      requestLayout();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.mAdapter != null)
      this.mAdapter.unregisterDataSetObserver(this.mDataObserver);
    this.mAdapter = paramListAdapter;
    this.mAdapter.registerDataSetObserver(this.mDataObserver);
    reset();
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.mOnItemClicked = paramOnItemClickListener;
  }

  public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    this.mOnItemLongClicked = paramOnItemLongClickListener;
  }

  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.mOnItemSelected = paramOnItemSelectedListener;
  }

  public void setSelection(int paramInt)
  {
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.HorizontalListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */