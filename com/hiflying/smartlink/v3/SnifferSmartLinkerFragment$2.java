package com.hiflying.smartlink.v3;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class SnifferSmartLinkerFragment$2
  implements DialogInterface.OnDismissListener
{
  SnifferSmartLinkerFragment$2(SnifferSmartLinkerFragment paramSnifferSmartLinkerFragment)
  {
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.this$0.mSnifferSmartLinker.setOnSmartLinkListener(null);
    this.this$0.mSnifferSmartLinker.stop();
    SnifferSmartLinkerFragment.access$0(this.this$0, false);
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinkerFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */