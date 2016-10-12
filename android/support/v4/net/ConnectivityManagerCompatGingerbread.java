package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class ConnectivityManagerCompatGingerbread
{
  ConnectivityManagerCompatGingerbread()
  {
  }

  public static boolean isActiveNetworkMetered(ConnectivityManager paramConnectivityManager)
  {
    NetworkInfo localNetworkInfo = paramConnectivityManager.getActiveNetworkInfo();
    if (localNetworkInfo == null)
      return true;
    switch (localNetworkInfo.getType())
    {
    case 0:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    default:
      return true;
    case 1:
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.net.ConnectivityManagerCompatGingerbread
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */