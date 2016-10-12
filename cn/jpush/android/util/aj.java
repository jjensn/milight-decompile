package cn.jpush.android.util;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ApplicationInfo.DisplayNameComparator;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class aj
{
  private static final String a;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[8];
    int i = 0;
    String str1 = "\022\017S\013j";
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
        i3 = 82;
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
        str1 = "M'\030Z_M'\037+.N";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "70ry<&6p";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "&+ey<&6p";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "4>gP;$>JJ;4/";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "+2cC\r4>vI<#(";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "$7tU!\0305tK7";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "&8aO$./l";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        z = localObject2;
        a = aj.class.getSimpleName();
        return;
        i3 = 71;
        continue;
        i3 = 91;
        continue;
        i3 = 21;
        continue;
        i3 = 38;
      }
    }
  }

  public aj()
  {
  }

  private static String a(String paramString, int paramInt)
  {
    Object localObject;
    if (paramString != null)
    {
      localObject = Pattern.compile(z[1]).matcher(paramString).replaceAll("");
      try
      {
        byte[] arrayOfByte = ((String)localObject).getBytes();
        if (arrayOfByte.length > 30)
        {
          String str = ((String)localObject).substring(0, new String(arrayOfByte, 0, 30, z[0]).length());
          localObject = str;
        }
        return localObject;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.getMessage();
        ac.e();
        return localObject;
      }
    }
    return paramString;
  }

  private static Set<String> a(ActivityManager paramActivityManager)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = paramActivityManager.getRunningAppProcesses().iterator();
    while (localIterator.hasNext())
    {
      String[] arrayOfString = ((ActivityManager.RunningAppProcessInfo)localIterator.next()).pkgList;
      for (int i = 0; i < arrayOfString.length; i++)
        localHashSet.add(arrayOfString[i]);
    }
    return localHashSet;
  }

  private static JSONArray a(ActivityManager paramActivityManager, PackageManager paramPackageManager)
  {
    JSONArray localJSONArray1 = new JSONArray();
    Set localSet = a(paramActivityManager);
    List localList1 = paramPackageManager.getInstalledApplications(8192);
    List localList2 = paramActivityManager.getRunningServices(200);
    Collections.sort(localList1, new ApplicationInfo.DisplayNameComparator(paramPackageManager));
    long l1 = SystemClock.elapsedRealtime();
    Iterator localIterator1 = localList1.iterator();
    while (localIterator1.hasNext())
    {
      ApplicationInfo localApplicationInfo = (ApplicationInfo)localIterator1.next();
      String str = a(localApplicationInfo.loadLabel(paramPackageManager).toString(), 30);
      if (localSet.contains(localApplicationInfo.packageName))
      {
        JSONObject localJSONObject1 = new JSONObject();
        JSONArray localJSONArray2 = new JSONArray();
        Iterator localIterator2 = localList2.iterator();
        while (localIterator2.hasNext())
        {
          ActivityManager.RunningServiceInfo localRunningServiceInfo = (ActivityManager.RunningServiceInfo)localIterator2.next();
          if (localRunningServiceInfo.service.getPackageName().equals(localApplicationInfo.packageName))
          {
            JSONObject localJSONObject2 = new JSONObject();
            long l2 = Math.round((float)((l1 - localRunningServiceInfo.activeSince) / 1000L));
            try
            {
              localJSONObject2.put(z[6], localRunningServiceInfo.service.getShortClassName());
              localJSONObject2.put(z[5], l2);
              localJSONArray2.put(localJSONObject2);
            }
            catch (JSONException localJSONException2)
            {
              localJSONException2.printStackTrace();
            }
          }
        }
        try
        {
          localJSONObject1.put(z[3], str);
          localJSONObject1.put(z[2], localApplicationInfo.packageName);
          localJSONObject1.put(z[4], localJSONArray2);
          localJSONArray1.put(localJSONObject1);
        }
        catch (JSONException localJSONException1)
        {
          localJSONException1.printStackTrace();
        }
      }
    }
    return localJSONArray1;
  }

  public static void a(Context paramContext)
  {
    ac.b();
    JSONArray localJSONArray = a((ActivityManager)paramContext.getSystemService(z[7]), paramContext.getPackageManager());
    if ((localJSONArray == null) || (localJSONArray.length() == 0))
      return;
    ah.a(paramContext, localJSONArray);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */