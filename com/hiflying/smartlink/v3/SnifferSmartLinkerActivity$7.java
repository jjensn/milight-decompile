package com.hiflying.smartlink.v3;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.hiflying.smartlink.R1;

class SnifferSmartLinkerActivity$7
  implements Runnable
{
  SnifferSmartLinkerActivity$7(SnifferSmartLinkerActivity paramSnifferSmartLinkerActivity)
  {
  }

  public void run()
  {
    Toast.makeText(this.this$0.getApplicationContext(), this.this$0.getString(R1.string("hiflying_smartlinker_timeout")), 0).show();
    this.this$0.mWaitingDialog.dismiss();
    SnifferSmartLinkerActivity.access$0(this.this$0, false);
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinkerActivity.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */