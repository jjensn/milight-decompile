package com.irainxun.wifilight.apsetting.model;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

class ATCommand$1 extends Handler
{
  ATCommand$1(ATCommand paramATCommand)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return;
    case 1:
      ATCommand.access$2(this.this$0, true);
      return;
    case 2:
      ATCommand.access$2(this.this$0, false);
      return;
    case 3:
      ATCommand.access$4(this.this$0, true, ATCommand.access$3(this.this$0));
      return;
    case 4:
      ATCommand.access$4(this.this$0, false, null);
      return;
    case 5:
      ATCommand.access$5(this.this$0, true);
      return;
    case 6:
      ATCommand.access$5(this.this$0, false);
      return;
    case 7:
      ATCommand.access$6(this.this$0, true);
      return;
    case 8:
      ATCommand.access$6(this.this$0, false);
      return;
    case 9:
      ATCommand.access$7(this.this$0, paramMessage.getData().getString("RESPONSE"));
      return;
    case 10:
      ATCommand.access$8(this.this$0, true);
      return;
    case 11:
      ATCommand.access$8(this.this$0, false);
      return;
    case 12:
    }
    ATCommand.access$9(this.this$0, paramMessage.getData().getString("RESPONSE"));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */