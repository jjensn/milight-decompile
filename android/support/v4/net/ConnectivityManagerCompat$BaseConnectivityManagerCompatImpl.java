package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl
  implements ConnectivityManagerCompat.ConnectivityManagerCompatImpl
{
  ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl()
  {
  }

  public boolean isActiveNetworkMetered(ConnectivityManager paramConnectivityManager)
  {
    NetworkInfo localNetworkInfo = paramConnectivityManager.getActiveNetworkInfo();
    if (localNetworkInfo == null)
      return true;
    switch (localNetworkInfo.getType())
    {
    case 0:
    default:
      return true;
    case 1:
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.net.ConnectivityManagerCompat.BaseConnectivityManagerCompatImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */