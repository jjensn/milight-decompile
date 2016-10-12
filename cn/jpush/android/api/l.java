package cn.jpush.android.api;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.TabActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import cn.jpush.android.util.b;
import java.util.HashMap;

final class l
  implements Application.ActivityLifecycleCallbacks
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 113;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = ")+\023>2\034!\031>2\004.\0319\020\006)\006";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "\004,\021)\036\f&[2\037\021'\033/_\004!\0012\036\013l8\0328+";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "\004,\021)\036\f&[2\037\021'\033/_\006#\001>\026\n0\fu=$\027;\0309 \020";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 101;
        break label96;
        i3 = 66;
        break label96;
        i3 = 117;
        break label96;
        i3 = 91;
        break label96;
        m = 0;
      }
    }
  }

  l()
  {
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
  }

  public final void onActivityPaused(Activity paramActivity)
  {
    k.c(paramActivity.getClass().getName());
    if (an.a(k.f()))
      k.a(paramActivity.getClass().getName());
    if ((Build.VERSION.SDK_INT >= 14) && (k.a))
    {
      if ((!e.a) && (e.b().a()))
      {
        k.c().put(k.f(), Integer.valueOf(0));
        if ((!an.a(k.d())) && (k.d().equals(k.f())))
          b.b(paramActivity, k.e(), k.f(), 0);
      }
      if ((paramActivity instanceof TabActivity))
        ac.d();
    }
    else
    {
      return;
    }
    e.a = false;
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    k.a(paramActivity.getClass().getName());
    ResolveInfo localResolveInfo;
    if ((Build.VERSION.SDK_INT >= 14) && (k.a))
    {
      if (!k.a())
        break label111;
      Intent localIntent = new Intent(z[2]);
      localIntent.setPackage(paramActivity.getPackageName());
      localIntent.addCategory(z[3]);
      localResolveInfo = paramActivity.getPackageManager().resolveActivity(localIntent, 0);
      if (localResolveInfo == null)
        ac.d(z[1], z[0]);
    }
    else
    {
      return;
    }
    k.b(localResolveInfo.activityInfo.name);
    k.a(false);
    return;
    label111: if ((!e.b) && (e.b().a()) && (k.b() != null))
    {
      if (!k.c().containsKey(k.b()))
        break label201;
      k.c().put(k.b(), Integer.valueOf(2));
      if ((!an.a(k.d())) && (k.d().equals(k.b())))
        b.b(paramActivity, k.e(), k.b(), 2);
    }
    while ((paramActivity instanceof TabActivity))
    {
      ac.d();
      return;
      label201: k.c().put(k.b(), Integer.valueOf(1));
      if ((!an.a(k.d())) && (k.d().equals(k.b())))
        b.b(paramActivity, k.e(), k.b(), 1);
    }
    e.b = false;
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityStarted(Activity paramActivity)
  {
  }

  public final void onActivityStopped(Activity paramActivity)
  {
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */