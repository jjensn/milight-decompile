package com.irainxun.wifilight.fragment;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

class FUT956ColorFragment$2
  implements Runnable
{
  FUT956ColorFragment$2(FUT956ColorFragment paramFUT956ColorFragment)
  {
  }

  public void run()
  {
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)FUT956ColorFragment.access$14(this.this$0).getLayoutParams();
    int i = localLayoutParams.leftMargin + FUT956ColorFragment.access$14(this.this$0).getWidth() / 2;
    int j = localLayoutParams.topMargin + FUT956ColorFragment.access$14(this.this$0).getHeight() / 2;
    FUT956ColorFragment.access$16(this.this$0, FUT956ColorFragment.access$15(this.this$0).getPixel(i, j));
    FUT956ColorFragment.access$17(this.this$0).setTextColor(FUT956ColorFragment.access$18(this.this$0));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT956ColorFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */