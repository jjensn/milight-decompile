package com.irainxun.wifilight.apsetting.model;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.irainxun.wifilight.apsetting.net.TCPClient.TCPClientListener;

class TransparentTransmission$2
  implements TCPClient.TCPClientListener
{
  TransparentTransmission$2(TransparentTransmission paramTransparentTransmission)
  {
  }

  public void onConnect(boolean paramBoolean)
  {
    Message localMessage = TransparentTransmission.access$2(this.this$0).obtainMessage(2);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("KEY_TCPCLIENT_OPEN", paramBoolean);
    localMessage.setData(localBundle);
    TransparentTransmission.access$2(this.this$0).sendMessage(localMessage);
  }

  public void onReceive(byte[] paramArrayOfByte, int paramInt)
  {
    TransparentTransmission.access$1(this.this$0, paramArrayOfByte, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.TransparentTransmission.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */