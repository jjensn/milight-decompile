package cn.jpush.android.api;

import android.app.Activity;

public class InstrumentedActivity extends Activity
{
  public InstrumentedActivity()
  {
  }

  protected void onPause()
  {
    super.onPause();
    JPushInterface.onPause(this);
  }

  protected void onResume()
  {
    super.onResume();
    JPushInterface.onResume(this);
  }

  public void onStart()
  {
    super.onStart();
  }

  public void onStop()
  {
    super.onStop();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.InstrumentedActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */