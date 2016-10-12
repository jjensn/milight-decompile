package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ViewGroupCompat
{
  static final ViewGroupCompatImpl IMPL = new ViewGroupCompatStubImpl();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      IMPL = new ViewGroupCompatIcsImpl();
      return;
    }
    if (i >= 11)
    {
      IMPL = new ViewGroupCompatHCImpl();
      return;
    }
  }

  private ViewGroupCompat()
  {
  }

  public static boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return IMPL.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public static void setMotionEventSplittingEnabled(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    IMPL.setMotionEventSplittingEnabled(paramViewGroup, paramBoolean);
  }

  static class ViewGroupCompatHCImpl extends ViewGroupCompat.ViewGroupCompatStubImpl
  {
    ViewGroupCompatHCImpl()
    {
    }

    public void setMotionEventSplittingEnabled(ViewGroup paramViewGroup, boolean paramBoolean)
    {
      ViewGroupCompatHC.setMotionEventSplittingEnabled(paramViewGroup, paramBoolean);
    }
  }

  static class ViewGroupCompatIcsImpl extends ViewGroupCompat.ViewGroupCompatHCImpl
  {
    ViewGroupCompatIcsImpl()
    {
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return ViewGroupCompatIcs.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
    }
  }

  static abstract interface ViewGroupCompatImpl
  {
    public abstract boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent);

    public abstract void setMotionEventSplittingEnabled(ViewGroup paramViewGroup, boolean paramBoolean);
  }

  static class ViewGroupCompatStubImpl
    implements ViewGroupCompat.ViewGroupCompatImpl
  {
    ViewGroupCompatStubImpl()
    {
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return true;
    }

    public void setMotionEventSplittingEnabled(ViewGroup paramViewGroup, boolean paramBoolean)
    {
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.ViewGroupCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */