package com.irainxun.wifilight.xlink.util;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.irainxun.wifilight.xlink.MyApp;

public class SharedPreferencesUtil
{
  public SharedPreferencesUtil()
  {
  }

  public static boolean deleteAllValue()
  {
    return MyApp.sharedPreferences.edit().clear().commit();
  }

  public static void deleteValue(String paramString)
  {
    MyApp.sharedPreferences.edit().remove(paramString).commit();
  }

  public static void keepShared(String paramString, int paramInt)
  {
    SharedPreferences.Editor localEditor = MyApp.sharedPreferences.edit();
    localEditor.putInt(paramString, paramInt);
    localEditor.commit();
  }

  public static void keepShared(String paramString, long paramLong)
  {
    SharedPreferences.Editor localEditor = MyApp.sharedPreferences.edit();
    localEditor.putLong(paramString, paramLong);
    localEditor.commit();
  }

  public static void keepShared(String paramString, Integer paramInteger)
  {
    SharedPreferences.Editor localEditor = MyApp.sharedPreferences.edit();
    localEditor.putInt(paramString, paramInteger.intValue());
    localEditor.commit();
  }

  public static void keepShared(String paramString1, String paramString2)
  {
    SharedPreferences.Editor localEditor = MyApp.sharedPreferences.edit();
    localEditor.putString(paramString1, paramString2);
    localEditor.commit();
  }

  public static void keepShared(String paramString, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = MyApp.sharedPreferences.edit();
    localEditor.putBoolean(paramString, paramBoolean);
    localEditor.commit();
  }

  public static boolean queryBooleanValue(String paramString)
  {
    return MyApp.sharedPreferences.getBoolean(paramString, false);
  }

  public static Integer queryIntValue(String paramString)
  {
    return Integer.valueOf(MyApp.sharedPreferences.getInt(paramString, 0));
  }

  public static long queryLongValue(String paramString)
  {
    return MyApp.sharedPreferences.getLong(paramString, 0L);
  }

  public static String queryValue(String paramString)
  {
    String str = MyApp.sharedPreferences.getString(paramString, "");
    if ("".equals(str))
      str = "";
    return str;
  }

  public static String queryValue(String paramString1, String paramString2)
  {
    return MyApp.sharedPreferences.getString(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.util.SharedPreferencesUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */