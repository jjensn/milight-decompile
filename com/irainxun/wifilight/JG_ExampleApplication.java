package com.irainxun.wifilight;

import android.app.Application;
import android.util.Log;
import cn.jpush.android.api.JPushInterface;

public class JG_ExampleApplication extends Application
{
  private static final String TAG = "JPush";

  public JG_ExampleApplication()
  {
  }

  public void onCreate()
  {
    Log.d("JPush", "[ExampleApplication] onCreate");
    super.onCreate();
    JPushInterface.setDebugMode(true);
    JPushInterface.init(this);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.JG_ExampleApplication
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */