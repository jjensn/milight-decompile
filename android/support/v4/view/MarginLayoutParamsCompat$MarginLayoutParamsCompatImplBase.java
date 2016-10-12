package android.support.v4.view;

import android.view.ViewGroup.MarginLayoutParams;

class MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase
  implements MarginLayoutParamsCompat.MarginLayoutParamsCompatImpl
{
  MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase()
  {
  }

  public int getLayoutDirection(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return 0;
  }

  public int getMarginEnd(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return paramMarginLayoutParams.rightMargin;
  }

  public int getMarginStart(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return paramMarginLayoutParams.leftMargin;
  }

  public boolean isMarginRelative(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return false;
  }

  public void resolveLayoutDirection(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
  }

  public void setLayoutDirection(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
  }

  public void setMarginEnd(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    paramMarginLayoutParams.rightMargin = paramInt;
  }

  public void setMarginStart(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt)
  {
    paramMarginLayoutParams.leftMargin = paramInt;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.MarginLayoutParamsCompat.MarginLayoutParamsCompatImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */