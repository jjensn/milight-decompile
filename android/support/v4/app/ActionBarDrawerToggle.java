package android.support.v4.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.view.MenuItem;
import android.view.View;

public class ActionBarDrawerToggle
  implements DrawerLayout.DrawerListener
{
  private static final int ID_HOME = 16908332;
  private static final ActionBarDrawerToggleImpl IMPL = new ActionBarDrawerToggleImplBase(null);
  private final Activity mActivity;
  private final Delegate mActivityImpl;
  private final int mCloseDrawerContentDescRes;
  private Drawable mDrawerImage;
  private final int mDrawerImageResource;
  private boolean mDrawerIndicatorEnabled = true;
  private final DrawerLayout mDrawerLayout;
  private final int mOpenDrawerContentDescRes;
  private Object mSetIndicatorInfo;
  private SlideDrawable mSlider;
  private Drawable mThemeImage;

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      IMPL = new ActionBarDrawerToggleImplHC(null);
      return;
    }
  }

  public ActionBarDrawerToggle(Activity paramActivity, DrawerLayout paramDrawerLayout, int paramInt1, int paramInt2, int paramInt3)
  {
    this.mActivity = paramActivity;
    this.mDrawerLayout = paramDrawerLayout;
    this.mDrawerImageResource = paramInt1;
    this.mOpenDrawerContentDescRes = paramInt2;
    this.mCloseDrawerContentDescRes = paramInt3;
    this.mThemeImage = getThemeUpIndicator();
    this.mDrawerImage = paramActivity.getResources().getDrawable(paramInt1);
    this.mSlider = new SlideDrawable(this.mDrawerImage);
    this.mSlider.setOffsetBy(0.3333333F);
    if ((paramActivity instanceof DelegateProvider))
    {
      this.mActivityImpl = ((DelegateProvider)paramActivity).getDrawerToggleDelegate();
      return;
    }
    this.mActivityImpl = null;
  }

  Drawable getThemeUpIndicator()
  {
    if (this.mActivityImpl != null)
      return this.mActivityImpl.getThemeUpIndicator();
    return IMPL.getThemeUpIndicator(this.mActivity);
  }

  public boolean isDrawerIndicatorEnabled()
  {
    return this.mDrawerIndicatorEnabled;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.mThemeImage = getThemeUpIndicator();
    this.mDrawerImage = this.mActivity.getResources().getDrawable(this.mDrawerImageResource);
    syncState();
  }

  public void onDrawerClosed(View paramView)
  {
    this.mSlider.setOffset(0.0F);
    if (this.mDrawerIndicatorEnabled)
      setActionBarDescription(this.mCloseDrawerContentDescRes);
  }

  public void onDrawerOpened(View paramView)
  {
    this.mSlider.setOffset(1.0F);
    if (this.mDrawerIndicatorEnabled)
      setActionBarDescription(this.mOpenDrawerContentDescRes);
  }

  public void onDrawerSlide(View paramView, float paramFloat)
  {
    float f1 = this.mSlider.getOffset();
    if (paramFloat > 0.5F);
    for (float f2 = Math.max(f1, 2.0F * Math.max(0.0F, paramFloat - 0.5F)); ; f2 = Math.min(f1, paramFloat * 2.0F))
    {
      this.mSlider.setOffset(f2);
      return;
    }
  }

  public void onDrawerStateChanged(int paramInt)
  {
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if ((paramMenuItem != null) && (paramMenuItem.getItemId() == 16908332) && (this.mDrawerIndicatorEnabled))
    {
      if (this.mDrawerLayout.isDrawerVisible(8388611))
        this.mDrawerLayout.closeDrawer(8388611);
      while (true)
      {
        return true;
        this.mDrawerLayout.openDrawer(8388611);
      }
    }
    return false;
  }

  void setActionBarDescription(int paramInt)
  {
    if (this.mActivityImpl != null)
    {
      this.mActivityImpl.setActionBarDescription(paramInt);
      return;
    }
    this.mSetIndicatorInfo = IMPL.setActionBarDescription(this.mSetIndicatorInfo, this.mActivity, paramInt);
  }

  void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    if (this.mActivityImpl != null)
    {
      this.mActivityImpl.setActionBarUpIndicator(paramDrawable, paramInt);
      return;
    }
    this.mSetIndicatorInfo = IMPL.setActionBarUpIndicator(this.mSetIndicatorInfo, this.mActivity, paramDrawable, paramInt);
  }

  public void setDrawerIndicatorEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean != this.mDrawerIndicatorEnabled)
    {
      if (!paramBoolean)
        break label54;
      SlideDrawable localSlideDrawable = this.mSlider;
      if (!this.mDrawerLayout.isDrawerOpen(8388611))
        break label46;
      i = this.mOpenDrawerContentDescRes;
      setActionBarUpIndicator(localSlideDrawable, i);
    }
    while (true)
    {
      this.mDrawerIndicatorEnabled = paramBoolean;
      return;
      label46: i = this.mCloseDrawerContentDescRes;
      break;
      label54: setActionBarUpIndicator(this.mThemeImage, 0);
    }
  }

  public void syncState()
  {
    SlideDrawable localSlideDrawable;
    if (this.mDrawerLayout.isDrawerOpen(8388611))
    {
      this.mSlider.setOffset(1.0F);
      if (this.mDrawerIndicatorEnabled)
      {
        localSlideDrawable = this.mSlider;
        if (!this.mDrawerLayout.isDrawerOpen(8388611))
          break label67;
      }
    }
    label67: for (int i = this.mOpenDrawerContentDescRes; ; i = this.mCloseDrawerContentDescRes)
    {
      setActionBarUpIndicator(localSlideDrawable, i);
      return;
      this.mSlider.setOffset(0.0F);
      break;
    }
  }

  private static abstract interface ActionBarDrawerToggleImpl
  {
    public abstract Drawable getThemeUpIndicator(Activity paramActivity);

    public abstract Object setActionBarDescription(Object paramObject, Activity paramActivity, int paramInt);

    public abstract Object setActionBarUpIndicator(Object paramObject, Activity paramActivity, Drawable paramDrawable, int paramInt);
  }

  private static class ActionBarDrawerToggleImplBase
    implements ActionBarDrawerToggle.ActionBarDrawerToggleImpl
  {
    private ActionBarDrawerToggleImplBase()
    {
    }

    public Drawable getThemeUpIndicator(Activity paramActivity)
    {
      return null;
    }

    public Object setActionBarDescription(Object paramObject, Activity paramActivity, int paramInt)
    {
      return paramObject;
    }

    public Object setActionBarUpIndicator(Object paramObject, Activity paramActivity, Drawable paramDrawable, int paramInt)
    {
      return paramObject;
    }
  }

  private static class ActionBarDrawerToggleImplHC
    implements ActionBarDrawerToggle.ActionBarDrawerToggleImpl
  {
    private ActionBarDrawerToggleImplHC()
    {
    }

    public Drawable getThemeUpIndicator(Activity paramActivity)
    {
      return ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(paramActivity);
    }

    public Object setActionBarDescription(Object paramObject, Activity paramActivity, int paramInt)
    {
      return ActionBarDrawerToggleHoneycomb.setActionBarDescription(paramObject, paramActivity, paramInt);
    }

    public Object setActionBarUpIndicator(Object paramObject, Activity paramActivity, Drawable paramDrawable, int paramInt)
    {
      return ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(paramObject, paramActivity, paramDrawable, paramInt);
    }
  }

  public static abstract interface Delegate
  {
    public abstract Drawable getThemeUpIndicator();

    public abstract void setActionBarDescription(int paramInt);

    public abstract void setActionBarUpIndicator(Drawable paramDrawable, int paramInt);
  }

  public static abstract interface DelegateProvider
  {
    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();
  }

  private static class SlideDrawable extends Drawable
    implements Drawable.Callback
  {
    private float mOffset;
    private float mOffsetBy;
    private final Rect mTmpRect = new Rect();
    private Drawable mWrapped;

    public SlideDrawable(Drawable paramDrawable)
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
}

/* Location:
 * Qualified Name:     android.support.v4.app.ActionBarDrawerToggle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */