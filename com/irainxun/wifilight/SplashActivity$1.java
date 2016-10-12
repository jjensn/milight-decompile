package com.irainxun.wifilight;

import android.content.Intent;
import com.irainxun.wifilight.xlink.MyApp;

class SplashActivity$1
  implements Runnable
{
  SplashActivity$1(SplashActivity paramSplashActivity)
  {
  }

  public void run()
  {
    if (MyApp.getMusic("ONEUP") == null)
    {
      Intent localIntent1 = new Intent(this.this$0, LearnActivity.class);
      this.this$0.startActivity(localIntent1);
      this.this$0.finish();
      return;
    }
    Intent localIntent2 = new Intent(this.this$0, DeviceListActivity.class);
    this.this$0.startActivity(localIntent2);
    this.this$0.finish();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.SplashActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */