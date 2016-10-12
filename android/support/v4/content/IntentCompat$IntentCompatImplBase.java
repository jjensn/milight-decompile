package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

class IntentCompat$IntentCompatImplBase
  implements IntentCompat.IntentCompatImpl
{
  IntentCompat$IntentCompatImplBase()
  {
  }

  public Intent makeMainActivity(ComponentName paramComponentName)
  {
    Intent localIntent = new Intent("android.intent.action.MAIN");
    localIntent.setComponent(paramComponentName);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    return localIntent;
  }

  public Intent makeMainSelectorActivity(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(paramString1);
    localIntent.addCategory(paramString2);
    return localIntent;
  }

  public Intent makeRestartActivityTask(ComponentName paramComponentName)
  {
    Intent localIntent = makeMainActivity(paramComponentName);
    localIntent.addFlags(268468224);
    return localIntent;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.IntentCompat.IntentCompatImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */