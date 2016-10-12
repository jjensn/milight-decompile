package com.irainxun.wifilight.fragment;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow.OnDismissListener;
import com.irainxun.wifilight.view.PopM;

class FUT028ColorFragment$4
  implements View.OnClickListener
{
  FUT028ColorFragment$4(FUT028ColorFragment paramFUT028ColorFragment)
  {
  }

  public void onClick(View paramView)
  {
    if (paramView == FUT028ColorFragment.access$37(this.this$0))
      new PopM(this.this$0.getActivity()).show(FUT028ColorFragment.access$37(this.this$0), new PopupWindow.OnDismissListener()
      {
        public void onDismiss()
        {
          if (!FUT028ColorFragment.access$37(FUT028ColorFragment.4.this.this$0).getText().equals(FUT028ColorFragment.4.this.this$0.getString(R.string.modes)))
          {
            int i = FUT028ColorFragment.4.this.this$0.getResources().getDimensionPixelSize(R.dimen.dp5);
            int j = FUT028ColorFragment.4.this.this$0.getResources().getDimensionPixelSize(R.dimen.dp20);
            FUT028ColorFragment.access$37(FUT028ColorFragment.4.this.this$0).setPadding(0, i, j, 0);
          }
        }
      });
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT028ColorFragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */