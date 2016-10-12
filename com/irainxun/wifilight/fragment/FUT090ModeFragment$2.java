package com.irainxun.wifilight.fragment;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.LinearLayout.LayoutParams;

class FUT090ModeFragment$2
  implements View.OnLayoutChangeListener
{
  FUT090ModeFragment$2(FUT090ModeFragment paramFUT090ModeFragment)
  {
  }

  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (paramInt4 != paramInt8)
    {
      int i = FUT090ModeFragment.access$11(this.this$0).getBottom();
      int j = FUT090ModeFragment.access$12(this.this$0).getHeight();
      int k = (paramInt4 - i - j) / 2 - this.this$0.getResources().getDimensionPixelSize(R.dimen.dp10);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)FUT090ModeFragment.access$12(this.this$0).getLayoutParams();
      if (localLayoutParams.topMargin != k)
      {
        localLayoutParams.topMargin = k;
        FUT090ModeFragment.access$12(this.this$0).setLayoutParams(localLayoutParams);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ModeFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */