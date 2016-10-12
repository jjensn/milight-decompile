package cn.jpush.android.helpers;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import cn.jpush.android.a;
import cn.jpush.android.e;
import cn.jpush.android.service.ServiceInterface;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.b;

public final class j
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[6];
    int i = 0;
    String str1 = "";
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
        i3 = 69;
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
        str1 = "U_";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\001\023\005J ";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "%\023\017\0043\024\t\031M*\0375\013I Q\022\031\004+\036\017JR$\035\022\016\be!\027\017E6\024[\tL \022\020J]*\004\tJe+\025\t\005M!<\032\004M#\024\b\036\n=\034\027";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "$\025\001J*\006\025";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\"\036\030R,\022\036\"A)\001\036\030";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 113;
        continue;
        i3 = 123;
        continue;
        i3 = 106;
        continue;
        i3 = 36;
      }
    }
  }

  public static String a(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService(z[2]);
    String str1 = b.h(paramContext);
    if (b.c(paramContext, z[0]))
      try
      {
        String str3 = localTelephonyManager.getSubscriberId();
        str2 = str3;
        if (str1 == null)
          str1 = " ";
        if (str2 == null)
          str2 = " ";
        return str1 + z[1] + str2 + z[1] + paramContext.getPackageName() + z[1] + e.f;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    while (true)
      String str2 = null;
  }

  public static boolean a(int paramInt)
  {
    return (paramInt == 14) || (paramInt == 13) || (paramInt == 15);
  }

  public static String b(Context paramContext)
  {
    try
    {
      Object localObject = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      if (((String)localObject).length() > 30)
      {
        ac.e(z[5], z[3]);
        String str = ((String)localObject).substring(0, 30);
        localObject = str;
      }
      return localObject;
    }
    catch (Exception localException)
    {
    }
    return z[4];
  }

  public static void c(Context paramContext)
  {
    if (a.d(paramContext))
    {
      ac.b();
      ServiceInterface.a(paramContext, 1);
      a.a(paramContext, false);
      return;
    }
    ac.b();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */