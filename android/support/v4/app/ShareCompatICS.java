package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.widget.ShareActionProvider;

class ShareCompatICS
{
  private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";

  ShareCompatICS()
  {
  }

  public static void configureMenuItem(MenuItem paramMenuItem, Activity paramActivity, Intent paramIntent)
  {
    ActionProvider localActionProvider = paramMenuItem.getActionProvider();
    if (!(localActionProvider instanceof ShareActionProvider));
    for (ShareActionProvider localShareActionProvider = new ShareActionProvider(paramActivity); ; localShareActionProvider = (ShareActionProvider)localActionProvider)
    {
      localShareActionProvider.setShareHistoryFileName(".sharecompat_" + paramActivity.getClass().getName());
      localShareActionProvider.setShareIntent(paramIntent);
      paramMenuItem.setActionProvider(localShareActionProvider);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.ShareCompatICS
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */