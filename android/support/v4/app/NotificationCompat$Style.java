package android.support.v4.app;

import android.app.Notification;

public abstract class NotificationCompat$Style
{
  CharSequence mBigContentTitle;
  NotificationCompat.Builder mBuilder;
  CharSequence mSummaryText;
  boolean mSummaryTextSet = false;

  public NotificationCompat$Style()
  {
  }

  public Notification build()
  {
    NotificationCompat.Builder localBuilder = this.mBuilder;
    Notification localNotification = null;
    if (localBuilder != null)
      localNotification = this.mBuilder.build();
    return localNotification;
  }

  public void setBuilder(NotificationCompat.Builder paramBuilder)
  {
    if (this.mBuilder != paramBuilder)
    {
      this.mBuilder = paramBuilder;
      if (this.mBuilder != null)
        this.mBuilder.setStyle(this);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.NotificationCompat.Style
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */