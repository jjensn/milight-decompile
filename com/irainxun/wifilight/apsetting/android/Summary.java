package com.irainxun.wifilight.apsetting.android;

import android.content.Context;
import android.content.res.Resources;
import android.net.NetworkInfo.DetailedState;

class Summary
{
  Summary()
  {
  }

  static String get(Context paramContext, NetworkInfo.DetailedState paramDetailedState)
  {
    return get(paramContext, null, paramDetailedState);
  }

  static String get(Context paramContext, String paramString, NetworkInfo.DetailedState paramDetailedState)
  {
    Resources localResources = paramContext.getResources();
    if (paramString == null);
    String[] arrayOfString;
    int j;
    for (int i = R.array.wifi_status; ; i = R.array.wifi_status_with_ssid)
    {
      arrayOfString = localResources.getStringArray(i);
      j = paramDetailedState.ordinal();
      if ((j < arrayOfString.length) && (arrayOfString[j].length() != 0))
        break;
      return null;
    }
    return String.format(arrayOfString[j], new Object[] { paramString });
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.Summary
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */