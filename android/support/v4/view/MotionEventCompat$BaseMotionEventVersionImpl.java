package android.support.v4.view;

import android.view.MotionEvent;

class MotionEventCompat$BaseMotionEventVersionImpl
  implements MotionEventCompat.MotionEventVersionImpl
{
  MotionEventCompat$BaseMotionEventVersionImpl()
  {
  }

  public int findPointerIndex(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0)
      return 0;
    return -1;
  }

  public int getPointerCount(MotionEvent paramMotionEvent)
  {
    return 1;
  }

  public int getPointerId(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0)
      return 0;
    throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
  }

  public float getX(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0)
      return paramMotionEvent.getX();
    throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
  }

  public float getY(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0)
      return paramMotionEvent.getY();
    throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.MotionEventCompat.BaseMotionEventVersionImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */