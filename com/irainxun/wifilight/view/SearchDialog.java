package com.irainxun.wifilight.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class SearchDialog extends Dialog
{
  private RotateAnimation animation;
  private ImageView ivAnim;

  public SearchDialog(Context paramContext)
  {
    super(paramContext, R.style.searchDialog);
  }

  private SearchDialog(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.dialog_search);
    this.ivAnim = ((ImageView)findViewById(R.id.iv_anim));
    this.animation = new RotateAnimation(0.0F, 360.0F, 1, 0.5F, 1, 0.5F);
    this.animation.setDuration(1500L);
    this.animation.setRepeatCount(-1);
    this.animation.setInterpolator(new LinearInterpolator());
    this.ivAnim.startAnimation(this.animation);
    setCanceledOnTouchOutside(true);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.SearchDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */