package cn.jpush.android.api;

import android.app.ListActivity;

public class InstrumentedListActivity extends ListActivity
{
  public InstrumentedListActivity()
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
 * Qualified Name:     cn.jpush.android.api.InstrumentedListActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */