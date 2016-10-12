package com.irainxun.wifilight;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import cn.jpush.android.api.InstrumentedActivity;
import com.irainxun.wifilight.xlink.MyApp;

public class SplashActivity extends InstrumentedActivity
{
  private static final String TAG = SplashActivity.class.getSimpleName();

  public SplashActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_splash);
    new Handler().postDelayed(new Runnable()
    {
      public void run()
      {
        if (MyApp.getMusic("ONEUP") == null)
        {
          Intent localIntent1 = new Intent(SplashActivity.this, LearnActivity.class);
          SplashActivity.this.startActivity(localIntent1);
          SplashActivity.this.finish();
          return;
        }
        Intent localIntent2 = new Intent(SplashActivity.this, DeviceListActivity.class);
        SplashActivity.this.startActivity(localIntent2);
        SplashActivity.this.finish();
      }
    }
    , 2000L);
  }

  protected void onPause()
  {
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.SplashActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */