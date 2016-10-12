package com.hiflying.smartlink.v3;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Button;
import android.widget.EditText;
import com.hiflying.smartlink.R1;

class SnifferSmartLinkerActivity$4 extends BroadcastReceiver
{
  SnifferSmartLinkerActivity$4(SnifferSmartLinkerActivity paramSnifferSmartLinkerActivity)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.this$0.getSystemService("connectivity")).getNetworkInfo(1);
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()))
    {
      this.this$0.mSsidEditText.setText(SnifferSmartLinkerActivity.access$2(this.this$0));
      this.this$0.mPasswordEditText.requestFocus();
      this.this$0.mStartButton.setEnabled(true);
    }
    do
    {
      return;
      this.this$0.mSsidEditText.setText(this.this$0.getString(R1.string("hiflying_smartlinker_no_wifi_connectivity")));
      this.this$0.mSsidEditText.requestFocus();
      this.this$0.mStartButton.setEnabled(false);
    }
    while (!this.this$0.mWaitingDialog.isShowing());
    this.this$0.mWaitingDialog.dismiss();
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinkerActivity.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */