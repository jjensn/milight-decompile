package com.irainxun.wifilight.apsetting.model;

import android.os.Handler;

class ATCommand$7 extends ATCommand.CMDModeTryer
{
  ATCommand$7(ATCommand paramATCommand)
  {
    super(paramATCommand, null);
  }

  void onResult(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ATCommand.access$10(this.this$0).sendEmptyMessage(1);
      return;
    }
    ATCommand.access$10(this.this$0).sendEmptyMessage(2);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */