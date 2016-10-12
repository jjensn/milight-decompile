package cn.jpush.android.ui;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

final class a
  implements View.OnClickListener
{
  a(FullScreenView paramFullScreenView)
  {
  }

  public final void onClick(View paramView)
  {
    if (FullScreenView.access$000(this.a) != null)
      ((Activity)FullScreenView.access$000(this.a)).onBackPressed();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.ui.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */