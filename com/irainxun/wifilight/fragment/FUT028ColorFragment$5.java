package com.irainxun.wifilight.fragment;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;

class FUT028ColorFragment$5
  implements View.OnLayoutChangeListener
{
  FUT028ColorFragment$5(FUT028ColorFragment paramFUT028ColorFragment)
  {
  }

  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (paramInt4 != paramInt8)
    {
      int i = (paramInt4 - FUT028ColorFragment.access$20(this.this$0).getBottom() - FUT028ColorFragment.access$38(this.this$0).getHeight()) / 2;
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)FUT028ColorFragment.access$38(this.this$0).getLayoutParams();
      if (localLayoutParams.bottomMargin != i)
      {
        localLayoutParams.bottomMargin = i;
        FUT028ColorFragment.access$38(this.this$0).setLayoutParams(localLayoutParams);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT028ColorFragment.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */