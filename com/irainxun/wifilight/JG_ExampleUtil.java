package com.irainxun.wifilight;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;
import cn.jpush.android.api.JPushInterface;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JG_ExampleUtil
{
  public static final String KEY_APP_KEY = "JPUSH_APPKEY";
  public static final String PREFS_DAYS = "JPUSH_EXAMPLE_DAYS";
  public static final String PREFS_END_TIME = "PREFS_END_TIME";
  public static final String PREFS_NAME = "JPUSH_EXAMPLE";
  public static final String PREFS_START_TIME = "PREFS_START_TIME";

  public JG_ExampleUtil()
  {
  }

  public static String GetVersion(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return "Unknown";
  }

  public static String getAppKey(Context paramContext)
  {
    String str = null;
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      Bundle localBundle = null;
      str = null;
      if (localApplicationInfo != null)
        localBundle = localApplicationInfo.metaData;
      str = null;
      if (localBundle != null)
      {
        str = localBundle.getString("JPUSH_APPKEY");
        if (str != null)
        {
          int i = str.length();
          if (i == 24);
        }
        else
        {
          str = null;
        }
      }
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return str;
  }

  public static String getDeviceId(Context paramContext)
  {
    return JPushInterface.getUdid(paramContext);
  }

  public static String getImei(Context paramContext, String paramString)
  {
    try
    {
      String str = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
      return str;
    }
    catch (Exception localException)
    {
      Log.e(JG_ExampleUtil.class.getSimpleName(), localException.getMessage());
    }
    return paramString;
  }

  public static boolean isConnected(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
  }

  public static boolean isEmpty(String paramString)
  {
    if (paramString == null);
    while ((paramString.length() == 0) || (paramString.trim().length() == 0))
      return true;
    return false;
  }

  public static boolean isValidTagAndAlias(String paramString)
  {
    return Pattern.compile("^[\\u4E00-\\u9FA50-9a-zA-Z_@!#$&*+=.|￥¥]+$").matcher(paramString).matches();
  }

  public static void showToast(final String paramString, Context paramContext)
  {
    new Thread(new Runnable()
    {
      public void run()
      {
        Looper.prepare();
        Toast.makeText(JG_ExampleUtil.this, paramString, 0).show();
        Looper.loop();
      }
    }).start();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.JG_ExampleUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */