package cn.jpush.android.api;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Builder;
import android.content.Context;
import cn.jpush.android.e;

public class BasicPushNotificationBuilder extends DefaultPushNotificationBuilder
{
  private static final String[] z;
  protected Context a;
  public String developerArg0 = z[2];
  public int notificationDefaults = -1;
  public int notificationFlags = 16;
  public int statusBarDrawable = e.b;

  static
  {
    Object localObject1 = new String[6];
    int i = 0;
    String str1 = "6\016k1{";
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
        i3 = 36;
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
        str1 = "\0130G\007G6\016k1{";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\r4B\013H\006!Q\034e\0336\004";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "'\004x\"\004\n>Z\032A\021%";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\n$G\032K\004";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\0130G\007G";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 105;
        continue;
        i3 = 81;
        continue;
        i3 = 52;
        continue;
        i3 = 110;
      }
    }
  }

  public BasicPushNotificationBuilder(Context paramContext)
  {
    if (paramContext == null)
      throw new IllegalArgumentException(z[3]);
    this.a = paramContext;
  }

  static PushNotificationBuilder a(String paramString)
  {
    String[] arrayOfString = paramString.split(z[0]);
    String str = arrayOfString[0];
    Object localObject;
    if (z[5].equals(str))
      localObject = new BasicPushNotificationBuilder(e.e);
    while (true)
    {
      ((BasicPushNotificationBuilder)localObject).a(arrayOfString);
      return localObject;
      if (z[4].equals(str))
        localObject = new CustomPushNotificationBuilder(e.e);
      else
        localObject = new BasicPushNotificationBuilder(e.e);
    }
  }

  @TargetApi(16)
  final Notification a(Notification.Builder paramBuilder)
  {
    paramBuilder.setDefaults(this.notificationDefaults);
    paramBuilder.setSmallIcon(this.statusBarDrawable);
    Notification localNotification = paramBuilder.build();
    localNotification.flags = this.notificationFlags;
    return localNotification;
  }

  public final String a()
  {
    return this.developerArg0;
  }

  final void a(Notification paramNotification)
  {
    paramNotification.defaults = this.notificationDefaults;
    paramNotification.flags = this.notificationFlags;
    paramNotification.icon = this.statusBarDrawable;
  }

  void a(String[] paramArrayOfString)
  {
    this.notificationDefaults = Integer.parseInt(paramArrayOfString[1]);
    this.notificationFlags = Integer.parseInt(paramArrayOfString[2]);
    this.statusBarDrawable = Integer.parseInt(paramArrayOfString[3]);
    if (5 == paramArrayOfString.length)
      this.developerArg0 = paramArrayOfString[4];
  }

  String b()
  {
    return this.notificationDefaults + z[0] + this.notificationFlags + z[0] + this.statusBarDrawable + z[0] + this.developerArg0;
  }

  public String toString()
  {
    return z[1] + b();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.BasicPushNotificationBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */