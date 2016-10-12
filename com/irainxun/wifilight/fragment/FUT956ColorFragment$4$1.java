package com.irainxun.wifilight.fragment;

import android.content.res.Resources;
import android.widget.Button;
import android.widget.PopupWindow.OnDismissListener;

class FUT956ColorFragment$4$1
  implements PopupWindow.OnDismissListener
{
  FUT956ColorFragment$4$1(FUT956ColorFragment.4 param4)
  {
  }

  public void onDismiss()
  {
    if (!FUT956ColorFragment.access$29(FUT956ColorFragment.4.access$0(this.this$1)).getText().equals(FUT956ColorFragment.4.access$0(this.this$1).getString(R.string.modes)))
    {
      int i = FUT956ColorFragment.4.access$0(this.this$1).getResources().getDimensionPixelSize(R.dimen.dp5);
      int j = FUT956ColorFragment.4.access$0(this.this$1).getResources().getDimensionPixelSize(R.dimen.dp20);
      FUT956ColorFragment.access$29(FUT956ColorFragment.4.access$0(this.this$1)).setPadding(0, i, j, 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT956ColorFragment.4.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */