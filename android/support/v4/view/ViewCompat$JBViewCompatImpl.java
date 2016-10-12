package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewParent;

class ViewCompat$JBViewCompatImpl extends ViewCompat.ICSViewCompatImpl
{
  ViewCompat$JBViewCompatImpl()
  {
  }

  public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View paramView)
  {
    Object localObject = ViewCompatJB.getAccessibilityNodeProvider(paramView);
    if (localObject != null)
      return new AccessibilityNodeProviderCompat(localObject);
    return null;
  }

  public int getImportantForAccessibility(View paramView)
  {
    return ViewCompatJB.getImportantForAccessibility(paramView);
  }

  public ViewParent getParentForAccessibility(View paramView)
  {
    return ViewCompatJB.getParentForAccessibility(paramView);
  }

  public boolean hasTransientState(View paramView)
  {
    return ViewCompatJB.hasTransientState(paramView);
  }

  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return ViewCompatJB.performAccessibilityAction(paramView, paramInt, paramBundle);
  }

  public void postInvalidateOnAnimation(View paramView)
  {
    ViewCompatJB.postInvalidateOnAnimation(paramView);
  }

  public void postInvalidateOnAnimation(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewCompatJB.postInvalidateOnAnimation(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void postOnAnimation(View paramView, Runnable paramRunnable)
  {
    ViewCompatJB.postOnAnimation(paramView, paramRunnable);
  }

  public void postOnAnimationDelayed(View paramView, Runnable paramRunnable, long paramLong)
  {
    ViewCompatJB.postOnAnimationDelayed(paramView, paramRunnable, paramLong);
  }

  public void setHasTransientState(View paramView, boolean paramBoolean)
  {
    ViewCompatJB.setHasTransientState(paramView, paramBoolean);
  }

  public void setImportantForAccessibility(View paramView, int paramInt)
  {
    ViewCompatJB.setImportantForAccessibility(paramView, paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.ViewCompat.JBViewCompatImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */