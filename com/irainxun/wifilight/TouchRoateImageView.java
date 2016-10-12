package com.irainxun.wifilight;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.widget.ImageView;

public class TouchRoateImageView extends ImageView
{
  private static final float MAX_DEGREE = 360.0F;
  private static final float MIN_DEGREE;
  private Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.fut091_k_bg);
  private float centerX;
  private float centerY;
  private float changeDegree;
  private float curDegree;
  private float curTouchX;
  private float curTouchY;
  private Matrix m = new Matrix();
  private float saveX;
  private float saveY;

  public TouchRoateImageView(Context paramContext)
  {
    super(paramContext);
  }

  private double getActionDegrees(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    double d1 = Math.sqrt((paramFloat3 - paramFloat5) * (paramFloat3 - paramFloat5) + (paramFloat4 - paramFloat6) * (paramFloat4 - paramFloat6));
    double d2 = Math.sqrt((paramFloat1 - paramFloat5) * (paramFloat1 - paramFloat5) + (paramFloat2 - paramFloat6) * (paramFloat2 - paramFloat6));
    double d3 = Math.sqrt((paramFloat3 - paramFloat1) * (paramFloat3 - paramFloat1) + (paramFloat4 - paramFloat2) * (paramFloat4 - paramFloat2));
    double d4 = 180.0D * Math.acos((d2 * d2 + d3 * d3 - d1 * d1) / (d3 * (2.0D * d2))) / 3.141592653589793D;
    if ((paramFloat4 < paramFloat2) && (paramFloat6 < paramFloat2))
      if ((paramFloat3 >= paramFloat1) || (paramFloat5 <= paramFloat1));
    float f1;
    float f2;
    do
    {
      do
      {
        do
        {
          do
          {
            return d4;
            if ((paramFloat3 >= paramFloat1) && (paramFloat5 <= paramFloat1))
              return -d4;
            if ((paramFloat4 <= paramFloat2) || (paramFloat6 <= paramFloat2))
              break;
            if ((paramFloat3 < paramFloat1) && (paramFloat5 > paramFloat1))
              return -d4;
          }
          while ((paramFloat3 > paramFloat1) && (paramFloat5 < paramFloat1));
          if ((paramFloat3 >= paramFloat1) || (paramFloat5 >= paramFloat1))
            break;
          if ((paramFloat4 < paramFloat2) && (paramFloat6 > paramFloat2))
            return -d4;
        }
        while ((paramFloat4 > paramFloat2) && (paramFloat6 < paramFloat2));
        if ((paramFloat3 <= paramFloat1) || (paramFloat5 <= paramFloat1))
          break;
        if ((paramFloat4 > paramFloat2) && (paramFloat6 < paramFloat2))
          return -d4;
      }
      while ((paramFloat4 < paramFloat2) && (paramFloat6 > paramFloat2));
      f1 = (paramFloat4 - paramFloat2) / (paramFloat3 - paramFloat1);
      f2 = (paramFloat6 - paramFloat2) / (paramFloat5 - paramFloat1);
    }
    while (((paramFloat3 <= paramFloat1) || (paramFloat4 <= paramFloat2) || (paramFloat5 <= paramFloat1) || (paramFloat6 <= paramFloat2) || (f1 <= f2)) && ((paramFloat3 <= paramFloat1) || (paramFloat4 >= paramFloat2) || (paramFloat5 <= paramFloat1) || (paramFloat6 >= paramFloat2) || (f1 <= f2)) && ((paramFloat3 >= paramFloat1) || (paramFloat4 >= paramFloat2) || (paramFloat5 >= paramFloat1) || (paramFloat6 >= paramFloat2) || (f1 <= f2)) && ((paramFloat3 >= paramFloat1) || (paramFloat4 <= paramFloat2) || (paramFloat5 >= paramFloat1) || (paramFloat6 <= paramFloat2) || (f1 <= f2)));
    return -d4;
  }

  private void handleTouch(MotionEvent paramMotionEvent)
  {
    this.curTouchX = paramMotionEvent.getX();
    this.curTouchY = paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    case 1:
    default:
      return;
    case 0:
      saveTouchPoint();
      return;
    case 2:
    }
    handleTouchMove();
  }

  private void handleTouchMove()
  {
    this.changeDegree = (float)getActionDegrees(this.centerX, this.centerY, this.saveX, this.saveY, this.curTouchX, this.curTouchY);
    float f = this.curDegree + this.changeDegree;
    if ((f >= 0.0F) && (f <= 360.0F))
    {
      optimize(f);
      this.m.setRotate(this.curDegree, this.centerX, this.centerY);
      setImageMatrix(this.m);
    }
    saveTouchPoint();
  }

  private void optimize(float paramFloat)
  {
    if (paramFloat > 359.0F)
    {
      this.curDegree = 360.0F;
      return;
    }
    if (paramFloat < 1.0F)
    {
      this.curDegree = 0.0F;
      return;
    }
    this.curDegree = paramFloat;
  }

  private void saveTouchPoint()
  {
    this.saveX = this.curTouchX;
    this.saveY = this.curTouchY;
  }

  public float getCurDegree()
  {
    return this.curDegree;
  }

  public Bitmap getImageBitmap()
  {
    return this.bitmap;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawBitmap(this.bitmap, 0.0F, 0.0F, null);
    paramCanvas.drawBitmap(this.bitmap, this.m, null);
    this.centerX = getWidth() / 2;
    this.centerY = getHeight() / 2;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    handleTouch(paramMotionEvent);
    return true;
  }

  public void setCurDegree(float paramFloat)
  {
    if ((paramFloat >= 0.0F) && (paramFloat <= 360.0F))
    {
      this.curDegree = paramFloat;
      this.m.setRotate(paramFloat, this.centerX, this.centerY);
      setImageMatrix(this.m);
    }
  }

  public void setImageMatrix(Matrix paramMatrix)
  {
    this.m.set(paramMatrix);
    super.setImageMatrix(paramMatrix);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.TouchRoateImageView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */