package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

class NavUtils$NavUtilsImplJB extends NavUtils.NavUtilsImplBase
{
  NavUtils$NavUtilsImplJB()
  {
  }

  public Intent getParentActivityIntent(Activity paramActivity)
  {
    Intent localIntent = NavUtilsJB.getParentActivityIntent(paramActivity);
    if (localIntent == null)
      localIntent = superGetParentActivityIntent(paramActivity);
    return localIntent;
  }

  public String getParentActivityName(Context paramContext, ActivityInfo paramActivityInfo)
  {
    String str = NavUtilsJB.getParentActivityName(paramActivityInfo);
    if (str == null)
      str = super.getParentActivityName(paramContext, paramActivityInfo);
    return str;
  }

  public void navigateUpTo(Activity paramActivity, Intent paramIntent)
  {
    NavUtilsJB.navigateUpTo(paramActivity, paramIntent);
  }

  public boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
  {
    return NavUtilsJB.shouldUpRecreateTask(paramActivity, paramIntent);
  }

  Intent superGetParentActivityIntent(Activity paramActivity)
  {
    return super.getParentActivityIntent(paramActivity);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.NavUtils.NavUtilsImplJB
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */