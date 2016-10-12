package android.support.v4.app;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class ActionBarDrawerToggle$SlideDrawable extends Drawable
  implements Drawable.Callback
{
  private float mOffset;
  private float mOffsetBy;
  private final Rect mTmpRect = new Rect();
  private Drawable mWrapped;

  public ActionBarDrawerToggle$SlideDrawable(Drawable paramDrawable)
  {
    this.mWrapped = paramDrawable;
  }

  public void clearColorFilter()
  {
    this.mWrapped.clearColorFilter();
  }

  public void draw(Canvas paramCanvas)
  {
    this.mWrapped.copyBounds(this.mTmpRect);
    paramCanvas.save();
    paramCanvas.translate(this.mOffsetBy * this.mTmpRect.width() * -this.mOffset, 0.0F);
    this.mWrapped.draw(paramCanvas);
    paramCanvas.restore();
  }

  public int getChangingConfigurations()
  {
    return this.mWrapped.getChangingConfigurations();
  }

  public Drawable.ConstantState getConstantState()
  {
    return super.getConstantState();
  }

  public Drawable getCurrent()
  {
    return this.mWrapped.getCurrent();
  }

  public int getIntrinsicHeight()
  {
    return this.mWrapped.getIntrinsicHeight();
  }

  public int getIntrinsicWidth()
  {
    return this.mWrapped.getIntrinsicWidth();
  }

  public int getMinimumHeight()
  {
    return this.mWrapped.getMinimumHeight();
  }

  public int getMinimumWidth()
  {
    return this.mWrapped.getMinimumWidth();
  }

  public float getOffset()
  {
    return this.mOffset;
  }

  public int getOpacity()
  {
    return this.mWrapped.getOpacity();
  }

  public boolean getPadding(Rect paramRect)
  {
    return this.mWrapped.getPadding(paramRect);
  }

  public int[] getState()
  {
    return this.mWrapped.getState();
  }

  public Region getTransparentRegion()
  {
    return this.mWrapped.getTransparentRegion();
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == this.mWrapped)
      invalidateSelf();
  }

  public boolean isStateful()
  {
    return this.mWrapped.isStateful();
  }

  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.mWrapped.setBounds(paramRect);
  }

  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    this.mWrapped.setState(paramArrayOfInt);
    return super.onStateChange(paramArrayOfInt);
  }

  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    if (paramDrawable == this.mWrapped)
      scheduleSelf(paramRunnable, paramLong);
  }

  public void setAlpha(int paramInt)
  {
    this.mWrapped.setAlpha(paramInt);
  }

  public void setChangingConfigurations(int paramInt)
  {
    this.mWrapped.setChangingConfigurations(paramInt);
  }

  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    this.mWrapped.setColorFilter(paramInt, paramMode);
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mWrapped.setColorFilter(paramColorFilter);
  }

  public void setDither(boolean paramBoolean)
  {
    this.mWrapped.setDither(paramBoolean);
  }

  public void setFilterBitmap(boolean paramBoolean)
  {
    this.mWrapped.setFilterBitmap(paramBoolean);
  }

  public void setOffset(float paramFloat)
  {
    this.mOffset = paramFloat;
    invalidateSelf();
  }

  public void setOffsetBy(float paramFloat)
  {
    this.mOffsetBy = paramFloat;
    invalidateSelf();
  }

  public boolean setState(int[] paramArrayOfInt)
  {
    return this.mWrapped.setState(paramArrayOfInt);
  }

  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    return super.setVisible(paramBoolean1, paramBoolean2);
  }

  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    if (paramDrawable == this.mWrapped)
      unscheduleSelf(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.ActionBarDrawerToggle.SlideDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */