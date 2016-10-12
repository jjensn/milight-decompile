package cn.jpush.android.api;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Builder;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.widget.RemoteViews;
import cn.jpush.android.e;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import java.util.Map;

public class DefaultPushNotificationBuilder
  implements PushNotificationBuilder
{
  private static final String[] z;
  protected String b;

  static
  {
    Object localObject1 = new String[6];
    int i = 0;
    String str1 = "C\022{-kv\fa*jO\013m?w@\r`\001jJ\r`";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label36: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label52: int i2;
    int i3;
    if (k <= 1)
    {
      localObject4 = localObject3;
      n = m;
      i1 = k;
      localObject5 = localObject3;
      i2 = localObject5[m];
      switch (n % 5)
      {
      default:
        i3 = 3;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[m] = (char)(i3 ^ i2);
      m = n + 1;
      if (i1 == 0)
      {
        localObject5 = localObject4;
        n = m;
        m = i1;
        break label52;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "g\r.0l]\013h7`H\026g1m\t\001a0wL\fz~wFB}6l^L.\031j_\007.+s\007";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "m\007h?vE\026^+pA,a*jO\013m?w@\r`\034v@\016j;q";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "O\003g2fMBz1#N\007z~bY\022b7`H\026g1m\t\013`8l\t\003`:#@\001a0-";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "J\f 4s\\\021fpbG\006|1jML@\021W`$G\035B}+A\020\\j-@\nFg6Q\nJ}.K";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "M\020o)bK\016k";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 41;
        continue;
        i3 = 98;
        continue;
        i3 = 14;
        continue;
        i3 = 94;
      }
    }
  }

  public DefaultPushNotificationBuilder()
  {
  }

  @TargetApi(16)
  Notification a(Notification.Builder paramBuilder)
  {
    return paramBuilder.build();
  }

  public final Notification a(String paramString, Map<String, String> paramMap)
  {
    if (an.a(paramString))
    {
      ac.d(z[2], z[1]);
      return null;
    }
    int i;
    if (e.e != null)
    {
      i = e.e.getResources().getIdentifier(z[0], z[5], e.e.getPackageName());
      if (i != 0)
        break label317;
      if (e.b == 0);
    }
    label317: for (int j = e.b; ; j = i)
    {
      if (paramMap.containsKey(z[4]))
        this.b = ((String)paramMap.get(z[4]));
      if (this.b == null)
        this.b = e.d;
      if (Build.VERSION.SDK_INT >= 16)
      {
        Notification.Builder localBuilder = new Notification.Builder(e.e).setContentTitle(this.b).setContentText(paramString).setTicker(paramString).setSmallIcon(j);
        RemoteViews localRemoteViews2 = b(paramString);
        if (localRemoteViews2 != null)
          localBuilder.setContent(localRemoteViews2);
        while (true)
        {
          while (true)
          {
            return a(localBuilder);
            try
            {
              int k = e.e.getPackageManager().getApplicationInfo(e.e.getPackageName(), 0).icon;
              ac.c();
              j = k;
            }
            catch (Exception localException)
            {
              ac.b(z[2], z[3], localException);
              return null;
            }
          }
          ac.d();
          return null;
          ac.c();
        }
      }
      Notification localNotification = new Notification(j, paramString, System.currentTimeMillis());
      a(localNotification);
      if (this.b == null)
        this.b = e.d;
      RemoteViews localRemoteViews1 = b(paramString);
      if (localRemoteViews1 != null)
      {
        localNotification.contentView = localRemoteViews1;
        return localNotification;
      }
      m.a(localNotification, e.e, this.b, paramString, null);
      return localNotification;
    }
  }

  public String a()
  {
    return null;
  }

  void a(Notification paramNotification)
  {
  }

  RemoteViews b(String paramString)
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.DefaultPushNotificationBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */