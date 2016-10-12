package com.hiflying.smartlink.v3;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.hiflying.smartlink.R1;

class SnifferSmartLinkerFragment$6
  implements Runnable
{
  SnifferSmartLinkerFragment$6(SnifferSmartLinkerFragment paramSnifferSmartLinkerFragment)
  {
  }

  public void run()
  {
    Toast.makeText(SnifferSmartLinkerFragment.access$2(this.this$0), this.this$0.getString(R1.string("hiflying_smartlinker_completed")), 0).show();
    this.this$0.mWaitingDialog.dismiss();
    SnifferSmartLinkerFragment.access$0(this.this$0, false);
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinkerFragment.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */