package com.hiflying.smartlink.v3;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class SnifferSmartLinkerActivity$2
  implements DialogInterface.OnDismissListener
{
  SnifferSmartLinkerActivity$2(SnifferSmartLinkerActivity paramSnifferSmartLinkerActivity)
  {
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.this$0.mSnifferSmartLinker.setOnSmartLinkListener(null);
    this.this$0.mSnifferSmartLinker.stop();
    SnifferSmartLinkerActivity.access$0(this.this$0, false);
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinkerActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */