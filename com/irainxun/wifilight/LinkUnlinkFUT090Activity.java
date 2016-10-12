package com.irainxun.wifilight;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LinkUnlinkFUT090Activity extends Activity
{
  private Button btnLink;
  private Button btnUnlink;
  private EditText etID;
  private ImageView ivBack;
  private View.OnClickListener onClickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == LinkUnlinkFUT090Activity.this.ivBack)
        LinkUnlinkFUT090Activity.this.finish();
      while (paramAnonymousView == LinkUnlinkFUT090Activity.this.btnLink)
        return;
    }
  };
  private TextView tvTitle;

  public LinkUnlinkFUT090Activity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_link_unlink_fut090);
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.etID = ((EditText)findViewById(R.id.et_id));
    this.btnLink = ((Button)findViewById(R.id.btn_link));
    this.btnUnlink = ((Button)findViewById(R.id.btn_unlink));
    this.ivBack.setImageResource(R.drawable.back);
    this.tvTitle.setText(R.string.link_unlink);
    this.ivBack.setOnClickListener(this.onClickListener);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.LinkUnlinkFUT090Activity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */