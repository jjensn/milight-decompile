package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.content.IntentCompat;
import android.util.Log;

class NavUtils$NavUtilsImplBase
  implements NavUtils.NavUtilsImpl
{
  NavUtils$NavUtilsImplBase()
  {
  }

  public Intent getParentActivityIntent(Activity paramActivity)
  {
    String str = NavUtils.getParentActivityName(paramActivity);
    if (str == null)
      return null;
    ComponentName localComponentName = new ComponentName(paramActivity, str);
    Object localObject;
    try
    {
      if (NavUtils.getParentActivityName(paramActivity, localComponentName) == null)
      {
        localObject = IntentCompat.makeMainActivity(localComponentName);
      }
      else
      {
        Intent localIntent = new Intent().setComponent(localComponentName);
        localObject = localIntent;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + str + "' in manifest");
      return null;
    }
    return localObject;
  }

  public String getParentActivityName(Context paramContext, ActivityInfo paramActivityInfo)
  {
    String str;
    if (paramActivityInfo.metaData == null)
      str = null;
    do
    {
      return str;
      str = paramActivityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
      if (str == null)
        return null;
    }
    while (str.charAt(0) != '.');
    return paramContext.getPackageName() + str;
  }

  public void navigateUpTo(Activity paramActivity, Intent paramIntent)
  {
    paramIntent.addFlags(67108864);
    paramActivity.startActivity(paramIntent);
    paramActivity.finish();
  }

  public boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
  {
    String str = paramActivity.getIntent().getAction();
    return (str != null) && (!str.equals("android.intent.action.MAIN"));
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.NavUtils.NavUtilsImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */