package com.irainxun.wifilight.apsetting.model;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

class TransparentTransmission$1 extends Handler
{
  TransparentTransmission$1(TransparentTransmission paramTransparentTransmission)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    }
    do
    {
      do
        return;
      while (TransparentTransmission.access$0(this.this$0) == null);
      TransparentTransmission.access$0(this.this$0).onReceive(paramMessage.getData().getByteArray("KEY_BUFFER"), paramMessage.getData().getInt("KEY_LENGTH"));
      return;
    }
    while (TransparentTransmission.access$0(this.this$0) == null);
    TransparentTransmission.access$0(this.this$0).onOpen(paramMessage.getData().getBoolean("KEY_TCPCLIENT_OPEN"));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.TransparentTransmission.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */