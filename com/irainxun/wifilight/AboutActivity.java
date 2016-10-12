package com.irainxun.wifilight;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends Activity
{
  private final String TAG = getClass().getSimpleName();
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == AboutActivity.this.ivBack)
        AboutActivity.this.finish();
    }
  };
  private ImageView ivBack;
  private TextView tvTitle;

  public AboutActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_about);
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.ivBack.setImageResource(R.drawable.back);
    this.tvTitle.setText(R.string.about);
    this.ivBack.setOnClickListener(this.clickListener);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.AboutActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */