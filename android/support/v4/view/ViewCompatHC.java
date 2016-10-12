package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ViewCompatHC
{
  ViewCompatHC()
  {
  }

  public static float getAlpha(View paramView)
  {
    return paramView.getAlpha();
  }

  static long getFrameTime()
  {
    return ValueAnimator.getFrameDelay();
  }

  public static int getLayerType(View paramView)
  {
    return paramView.getLayerType();
  }

  public static void setLayerType(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.ViewCompatHC
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */