package com.irainxun.wifilight.apsetting.model;

import android.os.Handler;

class ATCommand$10 extends ATCommand.CMDModeTryer
{
  ATCommand$10(ATCommand paramATCommand)
  {
    super(paramATCommand, null);
  }

  void onResult(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.this$0.reload();
      return;
    }
    ATCommand.access$10(this.this$0).sendEmptyMessage(6);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */