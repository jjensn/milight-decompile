package cn.jpush.android.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;

public final class v
{
  public static ArrayList<ad> a(Context paramContext, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      List localList = paramContext.getPackageManager().getInstalledPackages(0);
      for (int i = 0; i < localList.size(); i++)
      {
        PackageInfo localPackageInfo = (PackageInfo)localList.get(i);
        ad localad = new ad();
        localad.a = localPackageInfo.applicationInfo.loadLabel(paramContext.getPackageManager()).toString();
        localad.b = localPackageInfo.packageName;
        localad.c = localPackageInfo.versionName;
        localad.d = localPackageInfo.versionCode;
        localArrayList.add(localad);
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      localIndexOutOfBoundsException.printStackTrace();
      ac.b();
      return localArrayList;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      ac.b();
    }
    return localArrayList;
  }

  public static String[] a(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      String[] arrayOfString = localPackageManager.getPackageInfo(paramContext.getPackageName(), 4096).requestedPermissions;
      return arrayOfString;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      ac.i();
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */