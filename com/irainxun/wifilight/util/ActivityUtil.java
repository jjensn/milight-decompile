package com.irainxun.wifilight.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Method;

public class ActivityUtil
{
  private static final String TAG = ActivityUtil.class.getSimpleName();

  public ActivityUtil()
  {
  }

  public static int dip2px(Context paramContext, float paramFloat)
  {
    return (int)(0.5F + paramFloat * paramContext.getResources().getDisplayMetrics().density);
  }

  public static int getListViewHeightBasedOnChildren(ListView paramListView)
  {
    ListAdapter localListAdapter = paramListView.getAdapter();
    int i = 0;
    int j;
    if (localListAdapter != null)
      j = localListAdapter.getCount();
    for (int k = 0; ; k++)
    {
      if (k >= j)
      {
        i += paramListView.getDividerHeight() * (j - 1);
        return i;
      }
      View localView = localListAdapter.getView(k, null, paramListView);
      localView.measure(0, 0);
      i += localView.getMeasuredHeight();
    }
  }

  public static int getNavigationBarHeight(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int i = localResources.getIdentifier("navigation_bar_height", "dimen", "android");
    int j = 0;
    if (i > 0)
    {
      boolean bool = hasNavigationBar(paramContext);
      j = 0;
      if (bool)
        j = localResources.getDimensionPixelSize(i);
    }
    return j;
  }

  public static int getScreenHeight(Context paramContext)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.heightPixels;
  }

  public static int getScreenWidth(Context paramContext)
  {
    return paramContext.getResources().getDisplayMetrics().widthPixels;
  }

  public static boolean hasNavigationBar(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int i = localResources.getIdentifier("config_showNavigationBar", "bool", "android");
    boolean bool1 = false;
    if (i > 0)
      bool1 = localResources.getBoolean(i);
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      String str = (String)localClass.getMethod("get", new Class[] { String.class }).invoke(localClass, new Object[] { "qemu.hw.mainkeys" });
      if ("1".equals(str))
        return false;
      boolean bool2 = "0".equals(str);
      if (bool2)
        return true;
    }
    catch (Exception localException)
    {
    }
    return bool1;
  }

  public static void measureView(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
    int i = ViewGroup.getChildMeasureSpec(0, 0, localLayoutParams.width);
    int j = localLayoutParams.height;
    if (j > 0);
    for (int k = View.MeasureSpec.makeMeasureSpec(j, 1073741824); ; k = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(i, k);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.util.ActivityUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */