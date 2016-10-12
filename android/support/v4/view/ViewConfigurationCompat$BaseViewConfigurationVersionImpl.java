package android.support.v4.view;

import android.view.ViewConfiguration;

class ViewConfigurationCompat$BaseViewConfigurationVersionImpl
  implements ViewConfigurationCompat.ViewConfigurationVersionImpl
{
  ViewConfigurationCompat$BaseViewConfigurationVersionImpl()
  {
  }

  public int getScaledPagingTouchSlop(ViewConfiguration paramViewConfiguration)
  {
    return paramViewConfiguration.getScaledTouchSlop();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.ViewConfigurationCompat.BaseViewConfigurationVersionImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */