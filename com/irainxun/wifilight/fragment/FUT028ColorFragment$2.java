package com.irainxun.wifilight.fragment;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

class FUT028ColorFragment$2
  implements Runnable
{
  FUT028ColorFragment$2(FUT028ColorFragment paramFUT028ColorFragment)
  {
  }

  public void run()
  {
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)FUT028ColorFragment.access$15(this.this$0).getLayoutParams();
    int i = localLayoutParams.leftMargin + FUT028ColorFragment.access$15(this.this$0).getWidth() / 2;
    int j = localLayoutParams.topMargin + FUT028ColorFragment.access$15(this.this$0).getHeight() / 2;
    FUT028ColorFragment.access$17(this.this$0, FUT028ColorFragment.access$16(this.this$0).getPixel(i, j));
    FUT028ColorFragment.access$18(this.this$0).setTextColor(FUT028ColorFragment.access$19(this.this$0));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT028ColorFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */