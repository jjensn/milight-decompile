package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public class DrawableCompat
{
  static final DrawableImpl IMPL = new BaseDrawableImpl();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      IMPL = new HoneycombDrawableImpl();
      return;
    }
  }

  public DrawableCompat()
  {
  }

  public static void jumpToCurrentState(Drawable paramDrawable)
  {
    IMPL.jumpToCurrentState(paramDrawable);
  }

  static class BaseDrawableImpl
    implements DrawableCompat.DrawableImpl
  {
    BaseDrawableImpl()
    {
    }

    public void jumpToCurrentState(Drawable paramDrawable)
    {
    }
  }

  static abstract interface DrawableImpl
  {
    public abstract void jumpToCurrentState(Drawable paramDrawable);
  }

  static class HoneycombDrawableImpl
    implements DrawableCompat.DrawableImpl
  {
    HoneycombDrawableImpl()
    {
    }

    public void jumpToCurrentState(Drawable paramDrawable)
    {
      DrawableCompatHoneycomb.jumpToCurrentState(paramDrawable);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.graphics.drawable.DrawableCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */