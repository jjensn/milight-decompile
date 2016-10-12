package cn.jpush.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import cn.jpush.android.util.ac;

public class DaemonService extends Service
{
  public DaemonService()
  {
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    ac.b();
    ServiceInterface.c(getApplicationContext(), 30000);
    super.onCreate();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.DaemonService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */