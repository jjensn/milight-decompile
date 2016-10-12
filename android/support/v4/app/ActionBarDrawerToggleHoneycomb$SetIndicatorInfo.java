package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
{
  public Method setHomeActionContentDescription;
  public Method setHomeAsUpIndicator;
  public ImageView upIndicatorView;

  ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity paramActivity)
  {
    while (true)
    {
      try
      {
        this.setHomeAsUpIndicator = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[] { Drawable.class });
        Class[] arrayOfClass = new Class[1];
        arrayOfClass[0] = Integer.TYPE;
        this.setHomeActionContentDescription = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", arrayOfClass);
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        View localView1 = paramActivity.findViewById(16908332);
        if (localView1 == null)
          continue;
        ViewGroup localViewGroup = (ViewGroup)localView1.getParent();
        if (localViewGroup.getChildCount() != 2)
          continue;
        localView2 = localViewGroup.getChildAt(0);
        localView3 = localViewGroup.getChildAt(1);
        if (localView2.getId() != 16908332);
      }
      View localView2;
      View localView3;
      for (View localView4 = localView3; (localView4 instanceof ImageView); localView4 = localView2)
      {
        this.upIndicatorView = ((ImageView)localView4);
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */