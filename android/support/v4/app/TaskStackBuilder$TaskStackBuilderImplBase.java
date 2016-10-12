package android.support.v4.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class TaskStackBuilder$TaskStackBuilderImplBase
  implements TaskStackBuilder.TaskStackBuilderImpl
{
  TaskStackBuilder$TaskStackBuilderImplBase()
  {
  }

  public PendingIntent getPendingIntent(Context paramContext, Intent[] paramArrayOfIntent, int paramInt1, int paramInt2, Bundle paramBundle)
  {
    Intent localIntent = new Intent(paramArrayOfIntent[(-1 + paramArrayOfIntent.length)]);
    localIntent.addFlags(268435456);
    return PendingIntent.getActivity(paramContext, paramInt1, localIntent, paramInt2);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.TaskStackBuilder.TaskStackBuilderImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */