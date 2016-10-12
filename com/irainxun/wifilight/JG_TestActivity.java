package com.irainxun.wifilight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import cn.jpush.android.api.JPushInterface;

public class JG_TestActivity extends Activity
{
  public JG_TestActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    TextView localTextView = new TextView(this);
    localTextView.setText("用户自定义打开的Activity");
    if (getIntent() != null)
    {
      Bundle localBundle = getIntent().getExtras();
      String str1 = localBundle.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE);
      String str2 = localBundle.getString(JPushInterface.EXTRA_ALERT);
      localTextView.setText("Title : " + str1 + "  " + "Content : " + str2);
    }
    addContentView(localTextView, new ViewGroup.LayoutParams(-1, -1));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.JG_TestActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */