package com.irainxun.wifilight.xlink;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public abstract class BaseActivity extends Activity
  implements View.OnClickListener
{
  private static final int ACTIVITY_CREATE = 1;
  private static final int ACTIVITY_DESTROY = 6;
  private static final int ACTIVITY_PAUSE = 4;
  private static final int ACTIVITY_RESUME = 3;
  private static final int ACTIVITY_START = 2;
  private static final int ACTIVITY_STOP = 5;
  public int activityState;

  public BaseActivity()
  {
  }

  public Dialog createProgressDialog(String paramString1, String paramString2)
  {
    return CustomDialog.createProgressDialog(this, paramString1, paramString2);
  }

  public CustomDialog createTipsDialog(String paramString1, String paramString2)
  {
    CustomDialog localCustomDialog = CustomDialog.createErrorDialog(this, paramString1, paramString2, null);
    localCustomDialog.show();
    return localCustomDialog;
  }

  public abstract void initWidget();

  public void onClick(View paramView)
  {
    onClickListener(paramView);
  }

  public abstract void onClickListener(View paramView);

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.activityState = 1;
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.activityState = 6;
  }

  protected void onPause()
  {
    super.onPause();
    this.activityState = 4;
  }

  protected void onRestart()
  {
    super.onRestart();
  }

  protected void onResume()
  {
    super.onResume();
    this.activityState = 3;
    MyApp.getApp().setCurrentActivity(this);
  }

  protected void onStart()
  {
    super.onStart();
    this.activityState = 2;
  }

  protected void onStop()
  {
    super.onResume();
    this.activityState = 5;
  }

  protected void openActivity(Class<?> paramClass)
  {
    Log.e(getClass().getSimpleName(), "openActivity：：" + paramClass.getSimpleName());
    openActivity(paramClass, null);
  }

  protected void openActivity(Class<?> paramClass, Bundle paramBundle)
  {
    Intent localIntent = new Intent(this, paramClass);
    if (paramBundle != null)
      localIntent.putExtras(paramBundle);
    startActivity(localIntent);
  }

  protected void openActivity(String paramString)
  {
    openActivity(paramString, null);
  }

  protected void openActivity(String paramString, Bundle paramBundle)
  {
    Intent localIntent = new Intent(paramString);
    if (paramBundle != null)
      localIntent.putExtras(paramBundle);
    startActivity(localIntent);
  }

  protected void startService(Class<?> paramClass)
  {
    startService(new Intent(this, paramClass));
  }

  protected void stopService(Class<?> paramClass)
  {
    stopService(new Intent(this, paramClass));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.BaseActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */