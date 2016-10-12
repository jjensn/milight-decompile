package cn.jpush.android.api;

import android.app.Notification;
import java.util.Map;

public abstract interface PushNotificationBuilder
{
  public abstract Notification a(String paramString, Map<String, String> paramMap);

  public abstract String a();
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.PushNotificationBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */