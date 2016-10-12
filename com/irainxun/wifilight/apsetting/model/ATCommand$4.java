package com.irainxun.wifilight.apsetting.model;

import android.os.Handler;
import java.io.File;

class ATCommand$4 extends ATCommand.CMDModeTryer
{
  ATCommand$4(ATCommand paramATCommand, File paramFile)
  {
    super(paramATCommand, null);
  }

  void onResult(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.this$0.sendFile(this.val$file);
      return;
    }
    ATCommand.access$10(this.this$0).sendEmptyMessage(11);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */