package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

class ViewCompat$HCViewCompatImpl extends ViewCompat.GBViewCompatImpl
{
  ViewCompat$HCViewCompatImpl()
  {
  }

  public float getAlpha(View paramView)
  {
    return ViewCompatHC.getAlpha(paramView);
  }

  long getFrameTime()
  {
    return ViewCompatHC.getFrameTime();
  }

  public int getLayerType(View paramView)
  {
    return ViewCompatHC.getLayerType(paramView);
  }

  public void setLayerPaint(View paramView, Paint paramPaint)
  {
    setLayerType(paramView, getLayerType(paramView), paramPaint);
    paramView.invalidate();
  }

  public void setLayerType(View paramView, int paramInt, Paint paramPaint)
  {
    ViewCompatHC.setLayerType(paramView, paramInt, paramPaint);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.ViewCompat.HCViewCompatImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */