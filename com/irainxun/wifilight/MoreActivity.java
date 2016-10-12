package com.irainxun.wifilight;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MoreActivity extends Activity
{
  private final String TAG = getClass().getSimpleName();
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == MoreActivity.this.ivBack)
        MoreActivity.this.finish();
      do
      {
        return;
        if (paramAnonymousView == MoreActivity.this.vAbout)
        {
          Intent localIntent1 = new Intent(MoreActivity.this, AboutActivity.class);
          MoreActivity.this.startActivity(localIntent1);
          return;
        }
        if (paramAnonymousView == MoreActivity.this.vSmartLink)
        {
          Intent localIntent2 = new Intent(MoreActivity.this, InstructionActivity.class);
          localIntent2.putExtra("type", 0);
          MoreActivity.this.startActivity(localIntent2);
          return;
        }
        if (paramAnonymousView == MoreActivity.this.vApLink)
        {
          Intent localIntent3 = new Intent(MoreActivity.this, InstructionActivity.class);
          localIntent3.putExtra("type", 1);
          MoreActivity.this.startActivity(localIntent3);
          return;
        }
      }
      while (paramAnonymousView != MoreActivity.this.vFastLearn);
      Intent localIntent4 = new Intent(MoreActivity.this, LearnActivity.class);
      MoreActivity.this.startActivity(localIntent4);
    }
  };
  private ImageView ivBack;
  private TextView tvTitle;
  private TextView tvVersion;
  private View vAbout;
  private View vApLink;
  private View vFastLearn;
  private View vSmartLink;

  public MoreActivity()
  {
  }

  private String getAppVersionName()
  {
    try
    {
      String str1 = getPackageName();
      String str2 = getPackageManager().getPackageInfo(str1, 0).versionName;
      return str2;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_more);
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.tvVersion = ((TextView)findViewById(R.id.tv_version));
    this.vAbout = findViewById(R.id.about);
    this.vSmartLink = findViewById(R.id.smart_link);
    this.vApLink = findViewById(R.id.ap_link);
    this.vFastLearn = findViewById(R.id.fast_learn);
    this.ivBack.setImageResource(R.drawable.back);
    this.tvTitle.setText(R.string.more);
    TextView localTextView = this.tvVersion;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = getAppVersionName();
    localTextView.setText(getString(R.string.app_version, arrayOfObject));
    this.ivBack.setOnClickListener(this.clickListener);
    this.vAbout.setOnClickListener(this.clickListener);
    this.vSmartLink.setOnClickListener(this.clickListener);
    this.vApLink.setOnClickListener(this.clickListener);
    this.vFastLearn.setOnClickListener(this.clickListener);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.MoreActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */