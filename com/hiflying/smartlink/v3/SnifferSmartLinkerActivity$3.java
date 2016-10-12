package com.hiflying.smartlink.v3;

import android.app.ProgressDialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class SnifferSmartLinkerActivity$3
  implements View.OnClickListener
{
  SnifferSmartLinkerActivity$3(SnifferSmartLinkerActivity paramSnifferSmartLinkerActivity)
  {
  }

  public void onClick(View paramView)
  {
    if (!SnifferSmartLinkerActivity.access$1(this.this$0));
    try
    {
      this.this$0.mSnifferSmartLinker.setOnSmartLinkListener(this.this$0);
      SnifferSmartLinker localSnifferSmartLinker = this.this$0.mSnifferSmartLinker;
      Context localContext = this.this$0.getApplicationContext();
      String str = this.this$0.mPasswordEditText.getText().toString().trim();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.this$0.mSsidEditText.getText().toString().trim();
      localSnifferSmartLinker.start(localContext, str, arrayOfString);
      SnifferSmartLinkerActivity.access$0(this.this$0, true);
      this.this$0.mWaitingDialog.show();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinkerActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */