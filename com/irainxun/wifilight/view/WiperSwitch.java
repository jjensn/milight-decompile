package com.irainxun.wifilight.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;

public class WiperSwitch extends View
  implements View.OnTouchListener
{
  private Bitmap bg_off;
  private Bitmap bg_on;
  private float downX;
  private OnChangedListener listener;
  private boolean nowStatus = false;
  private float nowX;
  private boolean onSlip = false;
  private Bitmap slipper_btn;

  public WiperSwitch(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public WiperSwitch(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public void init()
  {
    setOnTouchListener(this);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Matrix localMatrix = new Matrix();
    Paint localPaint = new Paint();
    float f;
    if (this.nowX < this.bg_on.getWidth() / 2)
    {
      paramCanvas.drawBitmap(this.bg_off, localMatrix, localPaint);
      if (!this.onSlip)
        break label148;
      if (this.nowX < this.bg_on.getWidth())
        break label128;
      f = this.bg_on.getWidth() - this.slipper_btn.getWidth() / 2;
      label92: if (f >= 0.0F)
        break label182;
      f = 0.0F;
    }
    while (true)
    {
      paramCanvas.drawBitmap(this.slipper_btn, f, 0.0F, localPaint);
      return;
      paramCanvas.drawBitmap(this.bg_on, localMatrix, localPaint);
      break;
      label128: f = this.nowX - this.slipper_btn.getWidth() / 2;
      break label92;
      label148: if (this.nowStatus)
      {
        f = this.bg_on.getWidth() - this.slipper_btn.getWidth();
        break label92;
      }
      f = 0.0F;
      break label92;
      label182: if (f > this.bg_on.getWidth() - this.slipper_btn.getWidth())
        f = this.bg_on.getWidth() - this.slipper_btn.getWidth();
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getSize(paramInt2);
    int n;
    if (i == 1073741824)
    {
      n = j;
      if (k != 1073741824)
        break label65;
    }
    label65: for (int i1 = m; ; i1 = this.bg_on.getHeight())
    {
      setMeasuredDimension(n, i1);
      return;
      n = this.bg_on.getWidth();
      break;
    }
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    label202: 
    while (true)
    {
      invalidate();
      boolean bool1 = true;
      boolean bool3;
      do
      {
        boolean bool2;
        do
        {
          return bool1;
          bool2 = paramMotionEvent.getX() < this.bg_off.getWidth();
          bool1 = false;
        }
        while (bool2);
        bool3 = paramMotionEvent.getY() < this.bg_off.getHeight();
        bool1 = false;
      }
      while (bool3);
      this.onSlip = true;
      this.downX = paramMotionEvent.getX();
      this.nowX = this.downX;
      continue;
      this.nowX = paramMotionEvent.getX();
      continue;
      this.onSlip = false;
      if (paramMotionEvent.getX() >= this.bg_on.getWidth() / 2)
        this.nowStatus = true;
      for (this.nowX = this.bg_on.getWidth() - this.slipper_btn.getWidth(); ; this.nowX = 0.0F)
      {
        if (this.listener == null)
          break label202;
        this.listener.OnChanged(this, this.nowStatus);
        break;
        this.nowStatus = false;
      }
    }
  }

  public void setChecked(boolean paramBoolean)
  {
    if (paramBoolean);
    for (this.nowX = this.bg_off.getWidth(); ; this.nowX = 0.0F)
    {
      this.nowStatus = paramBoolean;
      return;
    }
  }

  public void setOnChangedListener(OnChangedListener paramOnChangedListener)
  {
    this.listener = paramOnChangedListener;
  }

  public static abstract interface OnChangedListener
  {
    public abstract void OnChanged(WiperSwitch paramWiperSwitch, boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.WiperSwitch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */